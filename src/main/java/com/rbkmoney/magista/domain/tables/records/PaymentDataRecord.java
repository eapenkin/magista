/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.magista.domain.tables.records;


import com.rbkmoney.magista.domain.enums.BankCardTokenProvider;
import com.rbkmoney.magista.domain.enums.OnHoldExpiration;
import com.rbkmoney.magista.domain.enums.PaymentFlow;
import com.rbkmoney.magista.domain.enums.PaymentPayerType;
import com.rbkmoney.magista.domain.enums.PaymentTool;
import com.rbkmoney.magista.domain.tables.PaymentData;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Record2;
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
public class PaymentDataRecord extends UpdatableRecordImpl<PaymentDataRecord> {

    private static final long serialVersionUID = 1628269816;

    /**
     * Setter for <code>mst.payment_data.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>mst.payment_data.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>mst.payment_data.invoice_id</code>.
     */
    public void setInvoiceId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mst.payment_data.invoice_id</code>.
     */
    public String getInvoiceId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mst.payment_data.payment_id</code>.
     */
    public void setPaymentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_id</code>.
     */
    public String getPaymentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mst.payment_data.party_id</code>.
     */
    public void setPartyId(UUID value) {
        set(3, value);
    }

    /**
     * Getter for <code>mst.payment_data.party_id</code>.
     */
    public UUID getPartyId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>mst.payment_data.party_shop_id</code>.
     */
    public void setPartyShopId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mst.payment_data.party_shop_id</code>.
     */
    public String getPartyShopId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mst.payment_data.party_contract_id</code>.
     */
    public void setPartyContractId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mst.payment_data.party_contract_id</code>.
     */
    public String getPartyContractId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mst.payment_data.payment_currency_code</code>.
     */
    public void setPaymentCurrencyCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_currency_code</code>.
     */
    public String getPaymentCurrencyCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mst.payment_data.payment_amount</code>.
     */
    public void setPaymentAmount(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_amount</code>.
     */
    public Long getPaymentAmount() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>mst.payment_data.payment_customer_id</code>.
     */
    public void setPaymentCustomerId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_customer_id</code>.
     */
    public String getPaymentCustomerId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mst.payment_data.payment_tool</code>.
     */
    public void setPaymentTool(PaymentTool value) {
        set(9, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_tool</code>.
     */
    public PaymentTool getPaymentTool() {
        return (PaymentTool) get(9);
    }

    /**
     * Setter for <code>mst.payment_data.payment_bank_card_masked_pan</code>.
     */
    public void setPaymentBankCardMaskedPan(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_bank_card_masked_pan</code>.
     */
    public String getPaymentBankCardMaskedPan() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mst.payment_data.payment_bank_card_bin</code>.
     */
    public void setPaymentBankCardBin(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_bank_card_bin</code>.
     */
    public String getPaymentBankCardBin() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mst.payment_data.payment_bank_card_token</code>.
     */
    public void setPaymentBankCardToken(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_bank_card_token</code>.
     */
    public String getPaymentBankCardToken() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mst.payment_data.payment_bank_card_system</code>.
     */
    public void setPaymentBankCardSystem(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_bank_card_system</code>.
     */
    public String getPaymentBankCardSystem() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mst.payment_data.payment_bank_card_token_provider</code>.
     */
    public void setPaymentBankCardTokenProvider(BankCardTokenProvider value) {
        set(14, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_bank_card_token_provider</code>.
     */
    public BankCardTokenProvider getPaymentBankCardTokenProvider() {
        return (BankCardTokenProvider) get(14);
    }

    /**
     * Setter for <code>mst.payment_data.payment_terminal_provider</code>.
     */
    public void setPaymentTerminalProvider(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_terminal_provider</code>.
     */
    public String getPaymentTerminalProvider() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mst.payment_data.payment_digital_wallet_id</code>.
     */
    public void setPaymentDigitalWalletId(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_digital_wallet_id</code>.
     */
    public String getPaymentDigitalWalletId() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mst.payment_data.payment_digital_wallet_provider</code>.
     */
    public void setPaymentDigitalWalletProvider(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_digital_wallet_provider</code>.
     */
    public String getPaymentDigitalWalletProvider() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mst.payment_data.payment_flow</code>.
     */
    public void setPaymentFlow(PaymentFlow value) {
        set(18, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_flow</code>.
     */
    public PaymentFlow getPaymentFlow() {
        return (PaymentFlow) get(18);
    }

    /**
     * Setter for <code>mst.payment_data.payment_hold_on_expiration</code>.
     */
    public void setPaymentHoldOnExpiration(OnHoldExpiration value) {
        set(19, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_hold_on_expiration</code>.
     */
    public OnHoldExpiration getPaymentHoldOnExpiration() {
        return (OnHoldExpiration) get(19);
    }

    /**
     * Setter for <code>mst.payment_data.payment_hold_until</code>.
     */
    public void setPaymentHoldUntil(LocalDateTime value) {
        set(20, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_hold_until</code>.
     */
    public LocalDateTime getPaymentHoldUntil() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>mst.payment_data.payment_session_id</code>.
     */
    public void setPaymentSessionId(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_session_id</code>.
     */
    public String getPaymentSessionId() {
        return (String) get(21);
    }

    /**
     * Setter for <code>mst.payment_data.payment_fingerprint</code>.
     */
    public void setPaymentFingerprint(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_fingerprint</code>.
     */
    public String getPaymentFingerprint() {
        return (String) get(22);
    }

    /**
     * Setter for <code>mst.payment_data.payment_ip</code>.
     */
    public void setPaymentIp(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_ip</code>.
     */
    public String getPaymentIp() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mst.payment_data.payment_phone_number</code>.
     */
    public void setPaymentPhoneNumber(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_phone_number</code>.
     */
    public String getPaymentPhoneNumber() {
        return (String) get(24);
    }

    /**
     * Setter for <code>mst.payment_data.payment_email</code>.
     */
    public void setPaymentEmail(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_email</code>.
     */
    public String getPaymentEmail() {
        return (String) get(25);
    }

    /**
     * Setter for <code>mst.payment_data.payment_created_at</code>.
     */
    public void setPaymentCreatedAt(LocalDateTime value) {
        set(26, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_created_at</code>.
     */
    public LocalDateTime getPaymentCreatedAt() {
        return (LocalDateTime) get(26);
    }

    /**
     * Setter for <code>mst.payment_data.payment_party_revision</code>.
     */
    public void setPaymentPartyRevision(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_party_revision</code>.
     */
    public Long getPaymentPartyRevision() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>mst.payment_data.payment_context_type</code>.
     */
    public void setPaymentContextType(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_context_type</code>.
     */
    public String getPaymentContextType() {
        return (String) get(28);
    }

    /**
     * Setter for <code>mst.payment_data.payment_context</code>.
     */
    public void setPaymentContext(byte... value) {
        set(29, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_context</code>.
     */
    public byte[] getPaymentContext() {
        return (byte[]) get(29);
    }

    /**
     * Setter for <code>mst.payment_data.payment_make_recurrent_flag</code>.
     */
    public void setPaymentMakeRecurrentFlag(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_make_recurrent_flag</code>.
     */
    public Boolean getPaymentMakeRecurrentFlag() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>mst.payment_data.payment_recurrent_payer_parent_invoice_id</code>.
     */
    public void setPaymentRecurrentPayerParentInvoiceId(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_recurrent_payer_parent_invoice_id</code>.
     */
    public String getPaymentRecurrentPayerParentInvoiceId() {
        return (String) get(31);
    }

    /**
     * Setter for <code>mst.payment_data.payment_recurrent_payer_parent_payment_id</code>.
     */
    public void setPaymentRecurrentPayerParentPaymentId(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_recurrent_payer_parent_payment_id</code>.
     */
    public String getPaymentRecurrentPayerParentPaymentId() {
        return (String) get(32);
    }

    /**
     * Setter for <code>mst.payment_data.payment_payer_type</code>.
     */
    public void setPaymentPayerType(PaymentPayerType value) {
        set(33, value);
    }

    /**
     * Getter for <code>mst.payment_data.payment_payer_type</code>.
     */
    public PaymentPayerType getPaymentPayerType() {
        return (PaymentPayerType) get(33);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentDataRecord
     */
    public PaymentDataRecord() {
        super(PaymentData.PAYMENT_DATA);
    }

    /**
     * Create a detached, initialised PaymentDataRecord
     */
    public PaymentDataRecord(Long id, String invoiceId, String paymentId, UUID partyId, String partyShopId, String partyContractId, String paymentCurrencyCode, Long paymentAmount, String paymentCustomerId, PaymentTool paymentTool, String paymentBankCardMaskedPan, String paymentBankCardBin, String paymentBankCardToken, String paymentBankCardSystem, BankCardTokenProvider paymentBankCardTokenProvider, String paymentTerminalProvider, String paymentDigitalWalletId, String paymentDigitalWalletProvider, PaymentFlow paymentFlow, OnHoldExpiration paymentHoldOnExpiration, LocalDateTime paymentHoldUntil, String paymentSessionId, String paymentFingerprint, String paymentIp, String paymentPhoneNumber, String paymentEmail, LocalDateTime paymentCreatedAt, Long paymentPartyRevision, String paymentContextType, byte[] paymentContext, Boolean paymentMakeRecurrentFlag, String paymentRecurrentPayerParentInvoiceId, String paymentRecurrentPayerParentPaymentId, PaymentPayerType paymentPayerType) {
        super(PaymentData.PAYMENT_DATA);

        set(0, id);
        set(1, invoiceId);
        set(2, paymentId);
        set(3, partyId);
        set(4, partyShopId);
        set(5, partyContractId);
        set(6, paymentCurrencyCode);
        set(7, paymentAmount);
        set(8, paymentCustomerId);
        set(9, paymentTool);
        set(10, paymentBankCardMaskedPan);
        set(11, paymentBankCardBin);
        set(12, paymentBankCardToken);
        set(13, paymentBankCardSystem);
        set(14, paymentBankCardTokenProvider);
        set(15, paymentTerminalProvider);
        set(16, paymentDigitalWalletId);
        set(17, paymentDigitalWalletProvider);
        set(18, paymentFlow);
        set(19, paymentHoldOnExpiration);
        set(20, paymentHoldUntil);
        set(21, paymentSessionId);
        set(22, paymentFingerprint);
        set(23, paymentIp);
        set(24, paymentPhoneNumber);
        set(25, paymentEmail);
        set(26, paymentCreatedAt);
        set(27, paymentPartyRevision);
        set(28, paymentContextType);
        set(29, paymentContext);
        set(30, paymentMakeRecurrentFlag);
        set(31, paymentRecurrentPayerParentInvoiceId);
        set(32, paymentRecurrentPayerParentPaymentId);
        set(33, paymentPayerType);
    }
}
