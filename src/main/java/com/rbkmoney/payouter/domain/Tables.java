/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.payouter.domain;


import com.rbkmoney.payouter.domain.tables.Adjustment;
import com.rbkmoney.payouter.domain.tables.CashFlowPosting;
import com.rbkmoney.payouter.domain.tables.EventStockMeta;
import com.rbkmoney.payouter.domain.tables.Invoice;
import com.rbkmoney.payouter.domain.tables.Payment;
import com.rbkmoney.payouter.domain.tables.Payout;
import com.rbkmoney.payouter.domain.tables.PayoutEvent;
import com.rbkmoney.payouter.domain.tables.PayoutSummary;
import com.rbkmoney.payouter.domain.tables.Refund;
import com.rbkmoney.payouter.domain.tables.Report;
import com.rbkmoney.payouter.domain.tables.ShopMeta;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in sht
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>sht.adjustment</code>.
     */
    public static final Adjustment ADJUSTMENT = com.rbkmoney.payouter.domain.tables.Adjustment.ADJUSTMENT;

    /**
     * The table <code>sht.cash_flow_posting</code>.
     */
    public static final CashFlowPosting CASH_FLOW_POSTING = com.rbkmoney.payouter.domain.tables.CashFlowPosting.CASH_FLOW_POSTING;

    /**
     * The table <code>sht.event_stock_meta</code>.
     */
    public static final EventStockMeta EVENT_STOCK_META = com.rbkmoney.payouter.domain.tables.EventStockMeta.EVENT_STOCK_META;

    /**
     * The table <code>sht.invoice</code>.
     */
    public static final Invoice INVOICE = com.rbkmoney.payouter.domain.tables.Invoice.INVOICE;

    /**
     * The table <code>sht.payment</code>.
     */
    public static final Payment PAYMENT = com.rbkmoney.payouter.domain.tables.Payment.PAYMENT;

    /**
     * The table <code>sht.payout</code>.
     */
    public static final Payout PAYOUT = com.rbkmoney.payouter.domain.tables.Payout.PAYOUT;

    /**
     * The table <code>sht.payout_event</code>.
     */
    public static final PayoutEvent PAYOUT_EVENT = com.rbkmoney.payouter.domain.tables.PayoutEvent.PAYOUT_EVENT;

    /**
     * The table <code>sht.payout_summary</code>.
     */
    public static final PayoutSummary PAYOUT_SUMMARY = com.rbkmoney.payouter.domain.tables.PayoutSummary.PAYOUT_SUMMARY;

    /**
     * The table <code>sht.refund</code>.
     */
    public static final Refund REFUND = com.rbkmoney.payouter.domain.tables.Refund.REFUND;

    /**
     * The table <code>sht.report</code>.
     */
    public static final Report REPORT = com.rbkmoney.payouter.domain.tables.Report.REPORT;

    /**
     * The table <code>sht.shop_meta</code>.
     */
    public static final ShopMeta SHOP_META = com.rbkmoney.payouter.domain.tables.ShopMeta.SHOP_META;
}