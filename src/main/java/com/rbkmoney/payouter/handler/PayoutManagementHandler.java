package com.rbkmoney.payouter.handler;

import com.rbkmoney.damsel.base.InvalidRequest;
import com.rbkmoney.damsel.domain.CurrencyRef;
import com.rbkmoney.damsel.payout_processing.*;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.payouter.domain.enums.PayoutAccountType;
import com.rbkmoney.payouter.domain.enums.PayoutType;
import com.rbkmoney.payouter.domain.tables.pojos.Payout;
import com.rbkmoney.payouter.exception.InsufficientFundsException;
import com.rbkmoney.payouter.exception.InvalidStateException;
import com.rbkmoney.payouter.exception.NotFoundException;
import com.rbkmoney.payouter.service.PayoutService;
import com.rbkmoney.payouter.service.PayoutSummaryService;
import com.rbkmoney.payouter.service.ReportService;
import com.rbkmoney.payouter.service.ShumwayService;
import com.rbkmoney.payouter.service.impl.NonresidentsReportServiceImpl;
import com.rbkmoney.payouter.service.impl.ResidentsReportServiceImpl;
import com.rbkmoney.payouter.util.DamselUtil;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class PayoutManagementHandler implements PayoutManagementSrv.Iface {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static final int MAX_SIZE = 1000;

    private final PayoutService payoutService;

    private final ShumwayService shumwayService;

    private final PayoutSummaryService payoutSummaryService;

    private final ResidentsReportServiceImpl residentsReportService;

    private final NonresidentsReportServiceImpl nonresidentsReportService;

    public PayoutManagementHandler(
            PayoutService payoutService,
            PayoutSummaryService payoutSummaryService,
            ShumwayService shumwayService,
            ResidentsReportServiceImpl residentsReportService,
            NonresidentsReportServiceImpl nonresidentsReportService
    ) {
        this.payoutService = payoutService;
        this.payoutSummaryService = payoutSummaryService;
        this.shumwayService = shumwayService;
        this.residentsReportService = residentsReportService;
        this.nonresidentsReportService = nonresidentsReportService;
    }

    @Override
    public com.rbkmoney.damsel.payout_processing.Payout createPayout(PayoutParams params) throws InvalidPayoutTool, InsufficientFunds, InvalidRequest, TException {
        try {
            String payoutId = payoutService.create(
                    params.getPayoutId(),
                    params.getShop().getPartyId(),
                    params.getShop().getShopId(),
                    params.getPayoutToolId(),
                    params.getAmount().getAmount(),
                    params.getAmount().getCurrency().getSymbolicCode()
            );

            return DamselUtil.toDamselPayout(payoutService.get(payoutId), shumwayService.getPostings(payoutId))
                    .setSummary(DamselUtil.toDamselPayoutSummary(payoutSummaryService.get(payoutId)));
        } catch (InsufficientFundsException ex) {
            throw new InsufficientFunds();
        } catch (InvalidStateException ex) {
            throw new InvalidPayoutTool();
        } catch (NotFoundException ex) {
            throw new InvalidRequest(Collections.singletonList(ex.getMessage()));
        }
    }

    @Override
    public com.rbkmoney.damsel.payout_processing.Payout get(String payoutId) throws PayoutNotFound, TException {
        Payout payout = payoutService.get(payoutId);

        if (payout == null) {
            throw new PayoutNotFound();
        }

        return DamselUtil.toDamselPayout(payout, shumwayService.getPostings(payoutId))
                .setSummary(DamselUtil.toDamselPayoutSummary(payoutSummaryService.get(payoutId)));
    }

    @Override
    public List<String> generatePayouts(GeneratePayoutParams generatePayoutParams) throws InvalidRequest, TException {
        log.info("Start generate payouts, params: {}", generatePayoutParams);
        try {
            TimeRange timeRange = generatePayoutParams.getTimeRange();
            LocalDateTime fromTime = TypeUtil.stringToLocalDateTime(timeRange.getFromTime());
            LocalDateTime toTime = TypeUtil.stringToLocalDateTime(timeRange.getToTime());

            if (fromTime.isAfter(toTime)) {
                throw new InvalidRequest(Arrays.asList("fromTime must be less that toTime"));
            }

            ShopParams shopParams = generatePayoutParams.getShopParams();
            String payoutId = payoutService.createPayoutByRange(shopParams.getPartyId(), shopParams.getShopId(), fromTime, toTime);

            return Collections.singletonList(payoutId);

        } catch (InsufficientFundsException | NotFoundException | InvalidStateException | IllegalArgumentException ex) {
            log.error("Failed to generate payouts, generatePayoutParams={}", generatePayoutParams, ex);
            throw new InvalidRequest(Arrays.asList(ex.getMessage()));
        } finally {
            log.info("End generate payouts, params: {}", generatePayoutParams);
        }
    }

    @Override
    public void confirmPayout(String payoutId) throws InvalidRequest, TException {
        log.info("Start confirm payout, payoutId: {}", payoutId);
        try {
            payoutService.confirm(payoutId);
        } finally {
            log.info("End confirm payouts, payoutIds: {}", payoutId);
        }
    }

    @Override
    public void cancelPayout(String payoutId, String details) throws InvalidRequest, TException {
        log.info("Start cancel payouts, payoutIds: {}", payoutId);
        try {
            payoutService.cancel(payoutId, details);
        } finally {
            log.info("End cancel payouts, payoutIds: {}", payoutId);
        }
    }

    @Override
    public PayoutSearchResponse getPayoutsInfo(PayoutSearchRequest payoutSearchRequest) throws InvalidRequest, TException {
        PayoutSearchCriteria payoutSearchCriteria = payoutSearchRequest.getSearchCriteria();
        log.info("GetPayoutsInfo with request parameters: {}", payoutSearchRequest);
        Long fromId = payoutSearchRequest.isSetFromId() ? payoutSearchRequest.getFromId() : null;
        int size = payoutSearchRequest.isSetSize() ? payoutSearchRequest.getSize() : MAX_SIZE;
        com.rbkmoney.payouter.domain.enums.PayoutStatus payoutStatus = Optional.ofNullable(payoutSearchCriteria.getStatus())
                .map(ps -> com.rbkmoney.payouter.domain.enums.PayoutStatus.valueOf(ps.name().toUpperCase()))
                .orElse(null);
        Optional<TimeRange> timeRangeOptional = Optional.ofNullable(payoutSearchCriteria.getTimeRange());
        LocalDateTime fromTime = timeRangeOptional.map(tr -> TypeUtil.stringToLocalDateTime(tr.getFromTime())).orElse(null);
        LocalDateTime toTime = timeRangeOptional.map(tr -> TypeUtil.stringToLocalDateTime(tr.getToTime())).orElse(null);
        Optional<AmountRange> amountRangeOptional = Optional.ofNullable(payoutSearchCriteria.getAmountRange());
        Long minAmount = amountRangeOptional.map(AmountRange::getMin).orElse(null);
        Long maxAmount = amountRangeOptional.map(AmountRange::getMax).orElse(null);
        CurrencyRef currencyCode = payoutSearchCriteria.getCurrency();
        PayoutType payoutType = getPayoutType(payoutSearchCriteria);
        List<String> payoutIds = payoutSearchCriteria.getPayoutIds();

        validateRequest(size, fromTime, toTime);

        List<Payout> payouts = payoutService.search(payoutStatus, fromTime, toTime, payoutIds, minAmount, maxAmount, currencyCode, payoutType, fromId, size);
        long lastId = payouts.isEmpty() ? 0L : payouts.get(payouts.size() - 1).getId();
        PayoutSearchResponse payoutSearchResponse = new PayoutSearchResponse(
                payouts.stream()
                        .map(payout ->
                                DamselUtil.toDamselPayout(payout, shumwayService.getPostings(payout.getPayoutId()))
                                        .setSummary(DamselUtil.toDamselPayoutSummary(payoutSummaryService.get(payout.getPayoutId())))
                        )
                        .collect(Collectors.toList()),
                lastId
        );
        log.info("GetPayoutsInfo count: {}", payouts.size());
        return payoutSearchResponse;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void generateReport(Set<String> payoutIds) throws InvalidRequest, TException {
        log.info("Start generate report for payouts: {}", payoutIds);
        if (payoutIds.isEmpty()) {
            throw new InvalidRequest(Collections.singletonList("Empty list of payout ids"));
        }

        List<Payout> payouts = payoutService.getByIds(payoutIds);
        if (payoutIds.size() != payouts.size()) {
            List<String> foundedIds = payouts.stream().map(Payout::getPayoutId).collect(Collectors.toList());
            List<String> diff = payoutIds.stream().filter(id -> !foundedIds.contains(id)).collect(Collectors.toList());
            throw new InvalidRequest(Collections.singletonList("Some of payouts not found: " + diff));
        }
        Optional<Payout> wrongPayout = payouts.stream().filter(p -> !p.getStatus().equals(com.rbkmoney.payouter.domain.enums.PayoutStatus.UNPAID)).findFirst();
        if (wrongPayout.isPresent()) {
            throw new InvalidRequest(Collections.singletonList("Payout " + wrongPayout.get().getPayoutId() + " has wrong status; it should be UNPAID"));
        }

        if (!payouts.isEmpty() && payouts.stream().allMatch(payout -> payout.getType() == PayoutType.bank_account)) {
            Payout payout = payouts.get(0);
            PayoutAccountType accountType = payout.getAccountType();
            if (payouts.size() > 1) {
                Optional<Payout> differentAccTypePayout = payouts.stream().filter(p -> !p.getAccountType().equals(accountType)).findFirst();
                if (differentAccTypePayout.isPresent()) {
                    throw new InvalidRequest(Collections.singletonList("Payout " + differentAccTypePayout.get().getPayoutId() + " has a different type then first payout " + payout.getPayoutId() + "; should be only the one type (residents or non-residents)"));
                }
            }
            ReportService reportService = accountType.equals(PayoutAccountType.russian_payout_account) ? residentsReportService : nonresidentsReportService;
            reportService.generateAndSave(payouts);
        }

        payouts.forEach(payout -> payoutService.pay(payout.getPayoutId()));
        log.info("End generate report for payouts, count: {}", payouts.size());
    }

    private void validateRequest(Integer size, LocalDateTime fromTime, LocalDateTime toTime) throws InvalidRequest {
        List<String> errorList = new ArrayList<>();
        if (size != null && (size <= 0 || size > MAX_SIZE)) {
            errorList.add(String.format("Size %d must be positive and less then %d", size, MAX_SIZE));
        }
        if (toTime != null && fromTime != null) {
            if (fromTime.isAfter(toTime)) {
                errorList.add(String.format("FromTime %s must be before toTime %s", fromTime, toTime));
            }
        }
        if (!errorList.isEmpty()) {
            throw new InvalidRequest(errorList);
        }
    }

    private PayoutType getPayoutType(PayoutSearchCriteria payoutSearchCriteria) {
        return Optional.ofNullable(payoutSearchCriteria.getType())
                .map(Enum::name)
                .map(PayoutType::valueOf)
                .orElse(null);
    }

}
