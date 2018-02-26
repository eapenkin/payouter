/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.payouter.domain.tables;


import com.rbkmoney.payouter.domain.Keys;
import com.rbkmoney.payouter.domain.Sht;
import com.rbkmoney.payouter.domain.tables.records.PayoutEventRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayoutEvent extends TableImpl<PayoutEventRecord> {

    private static final long serialVersionUID = -1880768483;

    /**
     * The reference instance of <code>sht.payout_event</code>
     */
    public static final PayoutEvent PAYOUT_EVENT = new PayoutEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayoutEventRecord> getRecordType() {
        return PayoutEventRecord.class;
    }

    /**
     * The column <code>sht.payout_event.event_id</code>.
     */
    public final TableField<PayoutEventRecord, Long> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sht.payout_event_id_sequence'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sht.payout_event.event_created_at</code>.
     */
    public final TableField<PayoutEventRecord, LocalDateTime> EVENT_CREATED_AT = createField("event_created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>sht.payout_event.event_type</code>.
     */
    public final TableField<PayoutEventRecord, String> EVENT_TYPE = createField("event_type", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>sht.payout_event.payout_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ID = createField("payout_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>sht.payout_event.payout_party_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_PARTY_ID = createField("payout_party_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_shop_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_SHOP_ID = createField("payout_shop_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_created_at</code>.
     */
    public final TableField<PayoutEventRecord, LocalDateTime> PAYOUT_CREATED_AT = createField("payout_created_at", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>sht.payout_event.payout_status</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_STATUS = createField("payout_status", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_status_cancel_details</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_STATUS_CANCEL_DETAILS = createField("payout_status_cancel_details", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_type</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_TYPE = createField("payout_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_cash_flow</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CASH_FLOW = createField("payout_cash_flow", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_paid_details_type</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_PAID_DETAILS_TYPE = createField("payout_paid_details_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_token</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_TOKEN = createField("payout_card_token", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_payment_system</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_PAYMENT_SYSTEM = createField("payout_card_payment_system", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_bin</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_BIN = createField("payout_card_bin", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_masked_pan</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_MASKED_PAN = createField("payout_card_masked_pan", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_provider_name</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_PROVIDER_NAME = createField("payout_card_provider_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_card_provider_transaction_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_CARD_PROVIDER_TRANSACTION_ID = createField("payout_card_provider_transaction_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_ID = createField("payout_account_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_name</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_NAME = createField("payout_account_bank_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_post_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_POST_ID = createField("payout_account_bank_post_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_local_code</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_LOCAL_CODE = createField("payout_account_bank_local_code", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_inn</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_INN = createField("payout_account_inn", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_purpose</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_PURPOSE = createField("payout_account_purpose", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_legal_agreement_id</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_LEGAL_AGREEMENT_ID = createField("payout_account_legal_agreement_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_legal_agreement_signed_at</code>.
     */
    public final TableField<PayoutEventRecord, LocalDateTime> PAYOUT_ACCOUNT_LEGAL_AGREEMENT_SIGNED_AT = createField("payout_account_legal_agreement_signed_at", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>sht.payout_event.user_id</code>.
     */
    public final TableField<PayoutEventRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.user_type</code>.
     */
    public final TableField<PayoutEventRecord, String> USER_TYPE = createField("user_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_type</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_TYPE = createField("payout_account_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_address</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_ADDRESS = createField("payout_account_bank_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_bic</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_BIC = createField("payout_account_bank_bic", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_bank_iban</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_BANK_IBAN = createField("payout_account_bank_iban", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_legal_name</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_LEGAL_NAME = createField("payout_account_legal_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_trading_name</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_TRADING_NAME = createField("payout_account_trading_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_registered_address</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_REGISTERED_ADDRESS = createField("payout_account_registered_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_actual_address</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_ACTUAL_ADDRESS = createField("payout_account_actual_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sht.payout_event.payout_account_registered_number</code>.
     */
    public final TableField<PayoutEventRecord, String> PAYOUT_ACCOUNT_REGISTERED_NUMBER = createField("payout_account_registered_number", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>sht.payout_event</code> table reference
     */
    public PayoutEvent() {
        this("payout_event", null);
    }

    /**
     * Create an aliased <code>sht.payout_event</code> table reference
     */
    public PayoutEvent(String alias) {
        this(alias, PAYOUT_EVENT);
    }

    private PayoutEvent(String alias, Table<PayoutEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayoutEvent(String alias, Table<PayoutEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sht.SHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayoutEventRecord, Long> getIdentity() {
        return Keys.IDENTITY_PAYOUT_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayoutEventRecord> getPrimaryKey() {
        return Keys.PAYOUT_EVENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayoutEventRecord>> getKeys() {
        return Arrays.<UniqueKey<PayoutEventRecord>>asList(Keys.PAYOUT_EVENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutEvent as(String alias) {
        return new PayoutEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayoutEvent rename(String name) {
        return new PayoutEvent(name, null);
    }
}
