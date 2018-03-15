/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.payouter.domain.enums;


import com.rbkmoney.payouter.domain.Sht;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum PayoutSummaryOperationType implements EnumType {

    payment("payment"),

    refund("refund"),

    adjustment("adjustment");

    private final String literal;

    private PayoutSummaryOperationType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
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
    public String getName() {
        return "payout_summary_operation_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}