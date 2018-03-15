/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.payouter.domain.tables.records;


import com.rbkmoney.payouter.domain.enums.AccountType;
import com.rbkmoney.payouter.domain.tables.CashFlowPosting;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CashFlowPostingRecord extends UpdatableRecordImpl<CashFlowPostingRecord> implements Record12<Long, String, String, Long, Long, AccountType, Long, AccountType, Long, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1522844131;

    /**
     * Setter for <code>sht.cash_flow_posting.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.payout_id</code>.
     */
    public void setPayoutId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.payout_id</code>.
     */
    public String getPayoutId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.plan_id</code>.
     */
    public void setPlanId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.plan_id</code>.
     */
    public String getPlanId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.batch_id</code>.
     */
    public void setBatchId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.batch_id</code>.
     */
    public Long getBatchId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.from_account_id</code>.
     */
    public void setFromAccountId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.from_account_id</code>.
     */
    public Long getFromAccountId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.from_account_type</code>.
     */
    public void setFromAccountType(AccountType value) {
        set(5, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.from_account_type</code>.
     */
    public AccountType getFromAccountType() {
        return (AccountType) get(5);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.to_account_id</code>.
     */
    public void setToAccountId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.to_account_id</code>.
     */
    public Long getToAccountId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.to_account_type</code>.
     */
    public void setToAccountType(AccountType value) {
        set(7, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.to_account_type</code>.
     */
    public AccountType getToAccountType() {
        return (AccountType) get(7);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.amount</code>.
     */
    public void setAmount(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.description</code>.
     */
    public void setDescription(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.description</code>.
     */
    public String getDescription() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sht.cash_flow_posting.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>sht.cash_flow_posting.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, Long, AccountType, Long, AccountType, Long, String, String, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, String, Long, Long, AccountType, Long, AccountType, Long, String, String, LocalDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CashFlowPosting.CASH_FLOW_POSTING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CashFlowPosting.CASH_FLOW_POSTING.PAYOUT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CashFlowPosting.CASH_FLOW_POSTING.PLAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return CashFlowPosting.CASH_FLOW_POSTING.BATCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return CashFlowPosting.CASH_FLOW_POSTING.FROM_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AccountType> field6() {
        return CashFlowPosting.CASH_FLOW_POSTING.FROM_ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return CashFlowPosting.CASH_FLOW_POSTING.TO_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AccountType> field8() {
        return CashFlowPosting.CASH_FLOW_POSTING.TO_ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return CashFlowPosting.CASH_FLOW_POSTING.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CashFlowPosting.CASH_FLOW_POSTING.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CashFlowPosting.CASH_FLOW_POSTING.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return CashFlowPosting.CASH_FLOW_POSTING.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPayoutId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getBatchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getFromAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType value6() {
        return getFromAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getToAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountType value8() {
        return getToAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value2(String value) {
        setPayoutId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value3(String value) {
        setPlanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value4(Long value) {
        setBatchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value5(Long value) {
        setFromAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value6(AccountType value) {
        setFromAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value7(Long value) {
        setToAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value8(AccountType value) {
        setToAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value9(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value10(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value11(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord value12(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CashFlowPostingRecord values(Long value1, String value2, String value3, Long value4, Long value5, AccountType value6, Long value7, AccountType value8, Long value9, String value10, String value11, LocalDateTime value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CashFlowPostingRecord
     */
    public CashFlowPostingRecord() {
        super(CashFlowPosting.CASH_FLOW_POSTING);
    }

    /**
     * Create a detached, initialised CashFlowPostingRecord
     */
    public CashFlowPostingRecord(Long id, String payoutId, String planId, Long batchId, Long fromAccountId, AccountType fromAccountType, Long toAccountId, AccountType toAccountType, Long amount, String currencyCode, String description, LocalDateTime createdAt) {
        super(CashFlowPosting.CASH_FLOW_POSTING);

        set(0, id);
        set(1, payoutId);
        set(2, planId);
        set(3, batchId);
        set(4, fromAccountId);
        set(5, fromAccountType);
        set(6, toAccountId);
        set(7, toAccountType);
        set(8, amount);
        set(9, currencyCode);
        set(10, description);
        set(11, createdAt);
    }
}