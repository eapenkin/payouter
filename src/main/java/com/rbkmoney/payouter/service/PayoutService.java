package com.rbkmoney.payouter.service;

import com.rbkmoney.damsel.domain.CurrencyRef;
import com.rbkmoney.payouter.domain.enums.PayoutAccountType;
import com.rbkmoney.payouter.domain.enums.PayoutStatus;
import com.rbkmoney.payouter.domain.enums.PayoutType;
import com.rbkmoney.payouter.domain.tables.pojos.Payout;
import com.rbkmoney.payouter.exception.InsufficientFundsException;
import com.rbkmoney.payouter.exception.InvalidStateException;
import com.rbkmoney.payouter.exception.NotFoundException;
import com.rbkmoney.payouter.exception.StorageException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface PayoutService {

    String createPayoutByRange(
            String partyId,
            String shopId,
            LocalDateTime fromTime,
            LocalDateTime toTime
    ) throws InsufficientFundsException, InvalidStateException, NotFoundException, StorageException;

    String create(
            String payoutId,
            String partyId,
            String shopId,
            String payoutToolId,
            long amount,
            String currencyCode
    ) throws InsufficientFundsException, InvalidStateException, NotFoundException, StorageException;

    String create(
            String payoutId,
            String partyId,
            String shopId,
            String payoutToolId,
            long amount,
            String currencyCode,
            long partyRevision
    ) throws InsufficientFundsException, InvalidStateException, NotFoundException, StorageException;

    void pay(String payoutId) throws InvalidStateException, StorageException;

    void confirm(String payoutId) throws InvalidStateException, StorageException;

    void cancel(String payoutId, String details) throws InvalidStateException, StorageException;

    Payout get(String payoutId) throws StorageException;

    List<Payout> getUnpaidPayoutsByAccountType(PayoutAccountType accountType) throws StorageException;

    void includeUnpaid(String payoutId, String partyId, String shopId, LocalDateTime toTime) throws StorageException;

    void excludeFromPayout(String payoutId) throws StorageException;

    List<Payout> getByIds(Set<String> payoutIds) throws StorageException;

    List<Payout> search(
            PayoutStatus payoutStatus,
            LocalDateTime fromTime,
            LocalDateTime toTime,
            List<String> payoutIds,
            Long minAmount,
            Long maxAmount,
            CurrencyRef currencyRef,
            PayoutType payoutType,
            Long fromId,
            int size) throws StorageException;

}
