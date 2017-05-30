/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.magista.domain.tables.records;


import com.rbkmoney.magista.domain.tables.Invoice;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvoiceRecord extends UpdatableRecordImpl<InvoiceRecord> implements Record14<String, Long, String, Long, String, Long, String, LocalDateTime, LocalDateTime, String, String, String, LocalDateTime, byte[]> {

    private static final long serialVersionUID = -2123350635;

    /**
     * Setter for <code>mst.invoice.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mst.invoice.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mst.invoice.event_id</code>.
     */
    public void setEventId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>mst.invoice.event_id</code>.
     */
    public Long getEventId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>mst.invoice.merchant_id</code>.
     */
    public void setMerchantId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mst.invoice.merchant_id</code>.
     */
    public String getMerchantId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mst.invoice.shop_id</code>.
     */
    public void setShopId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>mst.invoice.shop_id</code>.
     */
    public Long getShopId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>mst.invoice.status</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mst.invoice.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mst.invoice.amount</code>.
     */
    public void setAmount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>mst.invoice.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>mst.invoice.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mst.invoice.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mst.invoice.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>mst.invoice.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>mst.invoice.changed_at</code>.
     */
    public void setChangedAt(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>mst.invoice.changed_at</code>.
     */
    public LocalDateTime getChangedAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>mst.invoice.product</code>.
     */
    public void setProduct(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mst.invoice.product</code>.
     */
    public String getProduct() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mst.invoice.description</code>.
     */
    public void setDescription(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mst.invoice.description</code>.
     */
    public String getDescription() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mst.invoice.status_details</code>.
     */
    public void setStatusDetails(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mst.invoice.status_details</code>.
     */
    public String getStatusDetails() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mst.invoice.due</code>.
     */
    public void setDue(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>mst.invoice.due</code>.
     */
    public LocalDateTime getDue() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>mst.invoice.context</code>.
     */
    public void setContext(byte... value) {
        set(13, value);
    }

    /**
     * Getter for <code>mst.invoice.context</code>.
     */
    public byte[] getContext() {
        return (byte[]) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Long, String, Long, String, Long, String, LocalDateTime, LocalDateTime, String, String, String, LocalDateTime, byte[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, Long, String, Long, String, Long, String, LocalDateTime, LocalDateTime, String, String, String, LocalDateTime, byte[]> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Invoice.INVOICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Invoice.INVOICE.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Invoice.INVOICE.MERCHANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Invoice.INVOICE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Invoice.INVOICE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Invoice.INVOICE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Invoice.INVOICE.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return Invoice.INVOICE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return Invoice.INVOICE.CHANGED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Invoice.INVOICE.PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Invoice.INVOICE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Invoice.INVOICE.STATUS_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return Invoice.INVOICE.DUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field14() {
        return Invoice.INVOICE.CONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMerchantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getChangedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProduct();
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
    public String value12() {
        return getStatusDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getDue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value14() {
        return getContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value2(Long value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value3(String value) {
        setMerchantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value4(Long value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value6(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value7(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value9(LocalDateTime value) {
        setChangedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value10(String value) {
        setProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value11(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value12(String value) {
        setStatusDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value13(LocalDateTime value) {
        setDue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value14(byte... value) {
        setContext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord values(String value1, Long value2, String value3, Long value4, String value5, Long value6, String value7, LocalDateTime value8, LocalDateTime value9, String value10, String value11, String value12, LocalDateTime value13, byte[] value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceRecord
     */
    public InvoiceRecord() {
        super(Invoice.INVOICE);
    }

    /**
     * Create a detached, initialised InvoiceRecord
     */
    public InvoiceRecord(String id, Long eventId, String merchantId, Long shopId, String status, Long amount, String currencyCode, LocalDateTime createdAt, LocalDateTime changedAt, String product, String description, String statusDetails, LocalDateTime due, byte[] context) {
        super(Invoice.INVOICE);

        set(0, id);
        set(1, eventId);
        set(2, merchantId);
        set(3, shopId);
        set(4, status);
        set(5, amount);
        set(6, currencyCode);
        set(7, createdAt);
        set(8, changedAt);
        set(9, product);
        set(10, description);
        set(11, statusDetails);
        set(12, due);
        set(13, context);
    }
}