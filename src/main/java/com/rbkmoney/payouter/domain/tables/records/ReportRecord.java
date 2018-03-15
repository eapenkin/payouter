/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.payouter.domain.tables.records;


import com.rbkmoney.payouter.domain.enums.ReportStatus;
import com.rbkmoney.payouter.domain.tables.Report;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class ReportRecord extends UpdatableRecordImpl<ReportRecord> implements Record10<Long, LocalDateTime, String, String, String, String, ReportStatus, LocalDateTime, String, String> {

    private static final long serialVersionUID = -465005390;

    /**
     * Setter for <code>sht.report.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>sht.report.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sht.report.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>sht.report.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>sht.report.payout_ids</code>.
     */
    public void setPayoutIds(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sht.report.payout_ids</code>.
     */
    public String getPayoutIds() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sht.report.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sht.report.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sht.report.content</code>.
     */
    public void setContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sht.report.content</code>.
     */
    public String getContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sht.report.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sht.report.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sht.report.status</code>.
     */
    public void setStatus(ReportStatus value) {
        set(6, value);
    }

    /**
     * Getter for <code>sht.report.status</code>.
     */
    public ReportStatus getStatus() {
        return (ReportStatus) get(6);
    }

    /**
     * Setter for <code>sht.report.last_send_at</code>.
     */
    public void setLastSendAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>sht.report.last_send_at</code>.
     */
    public LocalDateTime getLastSendAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>sht.report.subject</code>.
     */
    public void setSubject(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sht.report.subject</code>.
     */
    public String getSubject() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sht.report.encoding</code>.
     */
    public void setEncoding(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sht.report.encoding</code>.
     */
    public String getEncoding() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, LocalDateTime, String, String, String, String, ReportStatus, LocalDateTime, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, LocalDateTime, String, String, String, String, ReportStatus, LocalDateTime, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Report.REPORT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return Report.REPORT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Report.REPORT.PAYOUT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Report.REPORT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Report.REPORT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Report.REPORT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReportStatus> field7() {
        return Report.REPORT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return Report.REPORT.LAST_SEND_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Report.REPORT.SUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Report.REPORT.ENCODING;
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
    public LocalDateTime value2() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPayoutIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportStatus value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getLastSendAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEncoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value2(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value3(String value) {
        setPayoutIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value5(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value7(ReportStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value8(LocalDateTime value) {
        setLastSendAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value9(String value) {
        setSubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord value10(String value) {
        setEncoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReportRecord values(Long value1, LocalDateTime value2, String value3, String value4, String value5, String value6, ReportStatus value7, LocalDateTime value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReportRecord
     */
    public ReportRecord() {
        super(Report.REPORT);
    }

    /**
     * Create a detached, initialised ReportRecord
     */
    public ReportRecord(Long id, LocalDateTime createdAt, String payoutIds, String name, String content, String description, ReportStatus status, LocalDateTime lastSendAt, String subject, String encoding) {
        super(Report.REPORT);

        set(0, id);
        set(1, createdAt);
        set(2, payoutIds);
        set(3, name);
        set(4, content);
        set(5, description);
        set(6, status);
        set(7, lastSendAt);
        set(8, subject);
        set(9, encoding);
    }
}
