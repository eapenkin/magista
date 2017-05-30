/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.magista.domain.tables.pojos;


import com.rbkmoney.magista.domain.enums.InvoiceEventCategory;
import com.rbkmoney.magista.domain.enums.InvoiceEventType;
import com.rbkmoney.magista.domain.enums.InvoicePaymentStatus;
import com.rbkmoney.magista.domain.enums.InvoiceStatus;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.annotation.Generated;


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
public class InvoiceEventStat implements Serializable {

    private static final long serialVersionUID = -1567062498;

    private Long                 eventId;
    private InvoiceEventCategory eventCategory;
    private InvoiceEventType     eventType;
    private LocalDateTime        eventCreatedAt;
    private String               partyId;
    private String               partyEmail;
    private Integer              partyShopId;
    private String               partyShopName;
    private String               partyShopDescription;
    private String               partyShopUrl;
    private Integer              partyShopCategoryId;
    private Integer              partyShopPayoutToolId;
    private Integer              partyContractId;
    private String               partyContractRegisteredNumber;
    private String               partyContractInn;
    private String               invoiceId;
    private InvoiceStatus        invoiceStatus;
    private String               invoiceStatusDetails;
    private String               invoiceProduct;
    private String               invoiceDescription;
    private Long                 invoiceAmount;
    private String               invoiceCurrencyCode;
    private LocalDateTime        invoiceDue;
    private LocalDateTime        invoiceCreatedAt;
    private byte[]               invoiceContext;
    private String               paymentId;
    private InvoicePaymentStatus paymentStatus;
    private String               paymentStatusFailureCode;
    private String               paymentStatusFailureDescription;
    private Long                 paymentAmount;
    private String               paymentCurrencyCode;
    private Long                 paymentFee;
    private String               paymentTool;
    private String               paymentMaskedPan;
    private String               paymentBin;
    private String               paymentToken;
    private String               paymentSystem;
    private String               paymentSessionId;
    private Integer              paymentCountryId;
    private Integer              paymentCityId;
    private String               paymentIp;
    private String               paymentPhoneNumber;
    private String               paymentEmail;
    private String               paymentFingerprint;
    private LocalDateTime        paymentCreatedAt;
    private byte[]               paymentContext;

    public InvoiceEventStat() {}

    public InvoiceEventStat(InvoiceEventStat value) {
        this.eventId = value.eventId;
        this.eventCategory = value.eventCategory;
        this.eventType = value.eventType;
        this.eventCreatedAt = value.eventCreatedAt;
        this.partyId = value.partyId;
        this.partyEmail = value.partyEmail;
        this.partyShopId = value.partyShopId;
        this.partyShopName = value.partyShopName;
        this.partyShopDescription = value.partyShopDescription;
        this.partyShopUrl = value.partyShopUrl;
        this.partyShopCategoryId = value.partyShopCategoryId;
        this.partyShopPayoutToolId = value.partyShopPayoutToolId;
        this.partyContractId = value.partyContractId;
        this.partyContractRegisteredNumber = value.partyContractRegisteredNumber;
        this.partyContractInn = value.partyContractInn;
        this.invoiceId = value.invoiceId;
        this.invoiceStatus = value.invoiceStatus;
        this.invoiceStatusDetails = value.invoiceStatusDetails;
        this.invoiceProduct = value.invoiceProduct;
        this.invoiceDescription = value.invoiceDescription;
        this.invoiceAmount = value.invoiceAmount;
        this.invoiceCurrencyCode = value.invoiceCurrencyCode;
        this.invoiceDue = value.invoiceDue;
        this.invoiceCreatedAt = value.invoiceCreatedAt;
        this.invoiceContext = value.invoiceContext;
        this.paymentId = value.paymentId;
        this.paymentStatus = value.paymentStatus;
        this.paymentStatusFailureCode = value.paymentStatusFailureCode;
        this.paymentStatusFailureDescription = value.paymentStatusFailureDescription;
        this.paymentAmount = value.paymentAmount;
        this.paymentCurrencyCode = value.paymentCurrencyCode;
        this.paymentFee = value.paymentFee;
        this.paymentTool = value.paymentTool;
        this.paymentMaskedPan = value.paymentMaskedPan;
        this.paymentBin = value.paymentBin;
        this.paymentToken = value.paymentToken;
        this.paymentSystem = value.paymentSystem;
        this.paymentSessionId = value.paymentSessionId;
        this.paymentCountryId = value.paymentCountryId;
        this.paymentCityId = value.paymentCityId;
        this.paymentIp = value.paymentIp;
        this.paymentPhoneNumber = value.paymentPhoneNumber;
        this.paymentEmail = value.paymentEmail;
        this.paymentFingerprint = value.paymentFingerprint;
        this.paymentCreatedAt = value.paymentCreatedAt;
        this.paymentContext = value.paymentContext;
    }

    public InvoiceEventStat(
        Long                 eventId,
        InvoiceEventCategory eventCategory,
        InvoiceEventType     eventType,
        LocalDateTime        eventCreatedAt,
        String               partyId,
        String               partyEmail,
        Integer              partyShopId,
        String               partyShopName,
        String               partyShopDescription,
        String               partyShopUrl,
        Integer              partyShopCategoryId,
        Integer              partyShopPayoutToolId,
        Integer              partyContractId,
        String               partyContractRegisteredNumber,
        String               partyContractInn,
        String               invoiceId,
        InvoiceStatus        invoiceStatus,
        String               invoiceStatusDetails,
        String               invoiceProduct,
        String               invoiceDescription,
        Long                 invoiceAmount,
        String               invoiceCurrencyCode,
        LocalDateTime        invoiceDue,
        LocalDateTime        invoiceCreatedAt,
        byte[]               invoiceContext,
        String               paymentId,
        InvoicePaymentStatus paymentStatus,
        String               paymentStatusFailureCode,
        String               paymentStatusFailureDescription,
        Long                 paymentAmount,
        String               paymentCurrencyCode,
        Long                 paymentFee,
        String               paymentTool,
        String               paymentMaskedPan,
        String               paymentBin,
        String               paymentToken,
        String               paymentSystem,
        String               paymentSessionId,
        Integer              paymentCountryId,
        Integer              paymentCityId,
        String               paymentIp,
        String               paymentPhoneNumber,
        String               paymentEmail,
        String               paymentFingerprint,
        LocalDateTime        paymentCreatedAt,
        byte[]               paymentContext
    ) {
        this.eventId = eventId;
        this.eventCategory = eventCategory;
        this.eventType = eventType;
        this.eventCreatedAt = eventCreatedAt;
        this.partyId = partyId;
        this.partyEmail = partyEmail;
        this.partyShopId = partyShopId;
        this.partyShopName = partyShopName;
        this.partyShopDescription = partyShopDescription;
        this.partyShopUrl = partyShopUrl;
        this.partyShopCategoryId = partyShopCategoryId;
        this.partyShopPayoutToolId = partyShopPayoutToolId;
        this.partyContractId = partyContractId;
        this.partyContractRegisteredNumber = partyContractRegisteredNumber;
        this.partyContractInn = partyContractInn;
        this.invoiceId = invoiceId;
        this.invoiceStatus = invoiceStatus;
        this.invoiceStatusDetails = invoiceStatusDetails;
        this.invoiceProduct = invoiceProduct;
        this.invoiceDescription = invoiceDescription;
        this.invoiceAmount = invoiceAmount;
        this.invoiceCurrencyCode = invoiceCurrencyCode;
        this.invoiceDue = invoiceDue;
        this.invoiceCreatedAt = invoiceCreatedAt;
        this.invoiceContext = invoiceContext;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.paymentStatusFailureCode = paymentStatusFailureCode;
        this.paymentStatusFailureDescription = paymentStatusFailureDescription;
        this.paymentAmount = paymentAmount;
        this.paymentCurrencyCode = paymentCurrencyCode;
        this.paymentFee = paymentFee;
        this.paymentTool = paymentTool;
        this.paymentMaskedPan = paymentMaskedPan;
        this.paymentBin = paymentBin;
        this.paymentToken = paymentToken;
        this.paymentSystem = paymentSystem;
        this.paymentSessionId = paymentSessionId;
        this.paymentCountryId = paymentCountryId;
        this.paymentCityId = paymentCityId;
        this.paymentIp = paymentIp;
        this.paymentPhoneNumber = paymentPhoneNumber;
        this.paymentEmail = paymentEmail;
        this.paymentFingerprint = paymentFingerprint;
        this.paymentCreatedAt = paymentCreatedAt;
        this.paymentContext = paymentContext;
    }

    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public InvoiceEventCategory getEventCategory() {
        return this.eventCategory;
    }

    public void setEventCategory(InvoiceEventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    public InvoiceEventType getEventType() {
        return this.eventType;
    }

    public void setEventType(InvoiceEventType eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getEventCreatedAt() {
        return this.eventCreatedAt;
    }

    public void setEventCreatedAt(LocalDateTime eventCreatedAt) {
        this.eventCreatedAt = eventCreatedAt;
    }

    public String getPartyId() {
        return this.partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyEmail() {
        return this.partyEmail;
    }

    public void setPartyEmail(String partyEmail) {
        this.partyEmail = partyEmail;
    }

    public Integer getPartyShopId() {
        return this.partyShopId;
    }

    public void setPartyShopId(Integer partyShopId) {
        this.partyShopId = partyShopId;
    }

    public String getPartyShopName() {
        return this.partyShopName;
    }

    public void setPartyShopName(String partyShopName) {
        this.partyShopName = partyShopName;
    }

    public String getPartyShopDescription() {
        return this.partyShopDescription;
    }

    public void setPartyShopDescription(String partyShopDescription) {
        this.partyShopDescription = partyShopDescription;
    }

    public String getPartyShopUrl() {
        return this.partyShopUrl;
    }

    public void setPartyShopUrl(String partyShopUrl) {
        this.partyShopUrl = partyShopUrl;
    }

    public Integer getPartyShopCategoryId() {
        return this.partyShopCategoryId;
    }

    public void setPartyShopCategoryId(Integer partyShopCategoryId) {
        this.partyShopCategoryId = partyShopCategoryId;
    }

    public Integer getPartyShopPayoutToolId() {
        return this.partyShopPayoutToolId;
    }

    public void setPartyShopPayoutToolId(Integer partyShopPayoutToolId) {
        this.partyShopPayoutToolId = partyShopPayoutToolId;
    }

    public Integer getPartyContractId() {
        return this.partyContractId;
    }

    public void setPartyContractId(Integer partyContractId) {
        this.partyContractId = partyContractId;
    }

    public String getPartyContractRegisteredNumber() {
        return this.partyContractRegisteredNumber;
    }

    public void setPartyContractRegisteredNumber(String partyContractRegisteredNumber) {
        this.partyContractRegisteredNumber = partyContractRegisteredNumber;
    }

    public String getPartyContractInn() {
        return this.partyContractInn;
    }

    public void setPartyContractInn(String partyContractInn) {
        this.partyContractInn = partyContractInn;
    }

    public String getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public InvoiceStatus getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceStatusDetails() {
        return this.invoiceStatusDetails;
    }

    public void setInvoiceStatusDetails(String invoiceStatusDetails) {
        this.invoiceStatusDetails = invoiceStatusDetails;
    }

    public String getInvoiceProduct() {
        return this.invoiceProduct;
    }

    public void setInvoiceProduct(String invoiceProduct) {
        this.invoiceProduct = invoiceProduct;
    }

    public String getInvoiceDescription() {
        return this.invoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public Long getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceCurrencyCode() {
        return this.invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }

    public LocalDateTime getInvoiceDue() {
        return this.invoiceDue;
    }

    public void setInvoiceDue(LocalDateTime invoiceDue) {
        this.invoiceDue = invoiceDue;
    }

    public LocalDateTime getInvoiceCreatedAt() {
        return this.invoiceCreatedAt;
    }

    public void setInvoiceCreatedAt(LocalDateTime invoiceCreatedAt) {
        this.invoiceCreatedAt = invoiceCreatedAt;
    }

    public byte[] getInvoiceContext() {
        return this.invoiceContext;
    }

    public void setInvoiceContext(byte... invoiceContext) {
        this.invoiceContext = invoiceContext;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public InvoicePaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(InvoicePaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatusFailureCode() {
        return this.paymentStatusFailureCode;
    }

    public void setPaymentStatusFailureCode(String paymentStatusFailureCode) {
        this.paymentStatusFailureCode = paymentStatusFailureCode;
    }

    public String getPaymentStatusFailureDescription() {
        return this.paymentStatusFailureDescription;
    }

    public void setPaymentStatusFailureDescription(String paymentStatusFailureDescription) {
        this.paymentStatusFailureDescription = paymentStatusFailureDescription;
    }

    public Long getPaymentAmount() {
        return this.paymentAmount;
    }

    public void setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCurrencyCode() {
        return this.paymentCurrencyCode;
    }

    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    public Long getPaymentFee() {
        return this.paymentFee;
    }

    public void setPaymentFee(Long paymentFee) {
        this.paymentFee = paymentFee;
    }

    public String getPaymentTool() {
        return this.paymentTool;
    }

    public void setPaymentTool(String paymentTool) {
        this.paymentTool = paymentTool;
    }

    public String getPaymentMaskedPan() {
        return this.paymentMaskedPan;
    }

    public void setPaymentMaskedPan(String paymentMaskedPan) {
        this.paymentMaskedPan = paymentMaskedPan;
    }

    public String getPaymentBin() {
        return this.paymentBin;
    }

    public void setPaymentBin(String paymentBin) {
        this.paymentBin = paymentBin;
    }

    public String getPaymentToken() {
        return this.paymentToken;
    }

    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getPaymentSystem() {
        return this.paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public String getPaymentSessionId() {
        return this.paymentSessionId;
    }

    public void setPaymentSessionId(String paymentSessionId) {
        this.paymentSessionId = paymentSessionId;
    }

    public Integer getPaymentCountryId() {
        return this.paymentCountryId;
    }

    public void setPaymentCountryId(Integer paymentCountryId) {
        this.paymentCountryId = paymentCountryId;
    }

    public Integer getPaymentCityId() {
        return this.paymentCityId;
    }

    public void setPaymentCityId(Integer paymentCityId) {
        this.paymentCityId = paymentCityId;
    }

    public String getPaymentIp() {
        return this.paymentIp;
    }

    public void setPaymentIp(String paymentIp) {
        this.paymentIp = paymentIp;
    }

    public String getPaymentPhoneNumber() {
        return this.paymentPhoneNumber;
    }

    public void setPaymentPhoneNumber(String paymentPhoneNumber) {
        this.paymentPhoneNumber = paymentPhoneNumber;
    }

    public String getPaymentEmail() {
        return this.paymentEmail;
    }

    public void setPaymentEmail(String paymentEmail) {
        this.paymentEmail = paymentEmail;
    }

    public String getPaymentFingerprint() {
        return this.paymentFingerprint;
    }

    public void setPaymentFingerprint(String paymentFingerprint) {
        this.paymentFingerprint = paymentFingerprint;
    }

    public LocalDateTime getPaymentCreatedAt() {
        return this.paymentCreatedAt;
    }

    public void setPaymentCreatedAt(LocalDateTime paymentCreatedAt) {
        this.paymentCreatedAt = paymentCreatedAt;
    }

    public byte[] getPaymentContext() {
        return this.paymentContext;
    }

    public void setPaymentContext(byte... paymentContext) {
        this.paymentContext = paymentContext;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InvoiceEventStat other = (InvoiceEventStat) obj;
        if (eventId == null) {
            if (other.eventId != null)
                return false;
        }
        else if (!eventId.equals(other.eventId))
            return false;
        if (eventCategory == null) {
            if (other.eventCategory != null)
                return false;
        }
        else if (!eventCategory.equals(other.eventCategory))
            return false;
        if (eventType == null) {
            if (other.eventType != null)
                return false;
        }
        else if (!eventType.equals(other.eventType))
            return false;
        if (eventCreatedAt == null) {
            if (other.eventCreatedAt != null)
                return false;
        }
        else if (!eventCreatedAt.equals(other.eventCreatedAt))
            return false;
        if (partyId == null) {
            if (other.partyId != null)
                return false;
        }
        else if (!partyId.equals(other.partyId))
            return false;
        if (partyEmail == null) {
            if (other.partyEmail != null)
                return false;
        }
        else if (!partyEmail.equals(other.partyEmail))
            return false;
        if (partyShopId == null) {
            if (other.partyShopId != null)
                return false;
        }
        else if (!partyShopId.equals(other.partyShopId))
            return false;
        if (partyShopName == null) {
            if (other.partyShopName != null)
                return false;
        }
        else if (!partyShopName.equals(other.partyShopName))
            return false;
        if (partyShopDescription == null) {
            if (other.partyShopDescription != null)
                return false;
        }
        else if (!partyShopDescription.equals(other.partyShopDescription))
            return false;
        if (partyShopUrl == null) {
            if (other.partyShopUrl != null)
                return false;
        }
        else if (!partyShopUrl.equals(other.partyShopUrl))
            return false;
        if (partyShopCategoryId == null) {
            if (other.partyShopCategoryId != null)
                return false;
        }
        else if (!partyShopCategoryId.equals(other.partyShopCategoryId))
            return false;
        if (partyShopPayoutToolId == null) {
            if (other.partyShopPayoutToolId != null)
                return false;
        }
        else if (!partyShopPayoutToolId.equals(other.partyShopPayoutToolId))
            return false;
        if (partyContractId == null) {
            if (other.partyContractId != null)
                return false;
        }
        else if (!partyContractId.equals(other.partyContractId))
            return false;
        if (partyContractRegisteredNumber == null) {
            if (other.partyContractRegisteredNumber != null)
                return false;
        }
        else if (!partyContractRegisteredNumber.equals(other.partyContractRegisteredNumber))
            return false;
        if (partyContractInn == null) {
            if (other.partyContractInn != null)
                return false;
        }
        else if (!partyContractInn.equals(other.partyContractInn))
            return false;
        if (invoiceId == null) {
            if (other.invoiceId != null)
                return false;
        }
        else if (!invoiceId.equals(other.invoiceId))
            return false;
        if (invoiceStatus == null) {
            if (other.invoiceStatus != null)
                return false;
        }
        else if (!invoiceStatus.equals(other.invoiceStatus))
            return false;
        if (invoiceStatusDetails == null) {
            if (other.invoiceStatusDetails != null)
                return false;
        }
        else if (!invoiceStatusDetails.equals(other.invoiceStatusDetails))
            return false;
        if (invoiceProduct == null) {
            if (other.invoiceProduct != null)
                return false;
        }
        else if (!invoiceProduct.equals(other.invoiceProduct))
            return false;
        if (invoiceDescription == null) {
            if (other.invoiceDescription != null)
                return false;
        }
        else if (!invoiceDescription.equals(other.invoiceDescription))
            return false;
        if (invoiceAmount == null) {
            if (other.invoiceAmount != null)
                return false;
        }
        else if (!invoiceAmount.equals(other.invoiceAmount))
            return false;
        if (invoiceCurrencyCode == null) {
            if (other.invoiceCurrencyCode != null)
                return false;
        }
        else if (!invoiceCurrencyCode.equals(other.invoiceCurrencyCode))
            return false;
        if (invoiceDue == null) {
            if (other.invoiceDue != null)
                return false;
        }
        else if (!invoiceDue.equals(other.invoiceDue))
            return false;
        if (invoiceCreatedAt == null) {
            if (other.invoiceCreatedAt != null)
                return false;
        }
        else if (!invoiceCreatedAt.equals(other.invoiceCreatedAt))
            return false;
        if (invoiceContext == null) {
            if (other.invoiceContext != null)
                return false;
        }
        else if (!Arrays.equals(invoiceContext, other.invoiceContext))
            return false;
        if (paymentId == null) {
            if (other.paymentId != null)
                return false;
        }
        else if (!paymentId.equals(other.paymentId))
            return false;
        if (paymentStatus == null) {
            if (other.paymentStatus != null)
                return false;
        }
        else if (!paymentStatus.equals(other.paymentStatus))
            return false;
        if (paymentStatusFailureCode == null) {
            if (other.paymentStatusFailureCode != null)
                return false;
        }
        else if (!paymentStatusFailureCode.equals(other.paymentStatusFailureCode))
            return false;
        if (paymentStatusFailureDescription == null) {
            if (other.paymentStatusFailureDescription != null)
                return false;
        }
        else if (!paymentStatusFailureDescription.equals(other.paymentStatusFailureDescription))
            return false;
        if (paymentAmount == null) {
            if (other.paymentAmount != null)
                return false;
        }
        else if (!paymentAmount.equals(other.paymentAmount))
            return false;
        if (paymentCurrencyCode == null) {
            if (other.paymentCurrencyCode != null)
                return false;
        }
        else if (!paymentCurrencyCode.equals(other.paymentCurrencyCode))
            return false;
        if (paymentFee == null) {
            if (other.paymentFee != null)
                return false;
        }
        else if (!paymentFee.equals(other.paymentFee))
            return false;
        if (paymentTool == null) {
            if (other.paymentTool != null)
                return false;
        }
        else if (!paymentTool.equals(other.paymentTool))
            return false;
        if (paymentMaskedPan == null) {
            if (other.paymentMaskedPan != null)
                return false;
        }
        else if (!paymentMaskedPan.equals(other.paymentMaskedPan))
            return false;
        if (paymentBin == null) {
            if (other.paymentBin != null)
                return false;
        }
        else if (!paymentBin.equals(other.paymentBin))
            return false;
        if (paymentToken == null) {
            if (other.paymentToken != null)
                return false;
        }
        else if (!paymentToken.equals(other.paymentToken))
            return false;
        if (paymentSystem == null) {
            if (other.paymentSystem != null)
                return false;
        }
        else if (!paymentSystem.equals(other.paymentSystem))
            return false;
        if (paymentSessionId == null) {
            if (other.paymentSessionId != null)
                return false;
        }
        else if (!paymentSessionId.equals(other.paymentSessionId))
            return false;
        if (paymentCountryId == null) {
            if (other.paymentCountryId != null)
                return false;
        }
        else if (!paymentCountryId.equals(other.paymentCountryId))
            return false;
        if (paymentCityId == null) {
            if (other.paymentCityId != null)
                return false;
        }
        else if (!paymentCityId.equals(other.paymentCityId))
            return false;
        if (paymentIp == null) {
            if (other.paymentIp != null)
                return false;
        }
        else if (!paymentIp.equals(other.paymentIp))
            return false;
        if (paymentPhoneNumber == null) {
            if (other.paymentPhoneNumber != null)
                return false;
        }
        else if (!paymentPhoneNumber.equals(other.paymentPhoneNumber))
            return false;
        if (paymentEmail == null) {
            if (other.paymentEmail != null)
                return false;
        }
        else if (!paymentEmail.equals(other.paymentEmail))
            return false;
        if (paymentFingerprint == null) {
            if (other.paymentFingerprint != null)
                return false;
        }
        else if (!paymentFingerprint.equals(other.paymentFingerprint))
            return false;
        if (paymentCreatedAt == null) {
            if (other.paymentCreatedAt != null)
                return false;
        }
        else if (!paymentCreatedAt.equals(other.paymentCreatedAt))
            return false;
        if (paymentContext == null) {
            if (other.paymentContext != null)
                return false;
        }
        else if (!Arrays.equals(paymentContext, other.paymentContext))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
        result = prime * result + ((eventCategory == null) ? 0 : eventCategory.hashCode());
        result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
        result = prime * result + ((eventCreatedAt == null) ? 0 : eventCreatedAt.hashCode());
        result = prime * result + ((partyId == null) ? 0 : partyId.hashCode());
        result = prime * result + ((partyEmail == null) ? 0 : partyEmail.hashCode());
        result = prime * result + ((partyShopId == null) ? 0 : partyShopId.hashCode());
        result = prime * result + ((partyShopName == null) ? 0 : partyShopName.hashCode());
        result = prime * result + ((partyShopDescription == null) ? 0 : partyShopDescription.hashCode());
        result = prime * result + ((partyShopUrl == null) ? 0 : partyShopUrl.hashCode());
        result = prime * result + ((partyShopCategoryId == null) ? 0 : partyShopCategoryId.hashCode());
        result = prime * result + ((partyShopPayoutToolId == null) ? 0 : partyShopPayoutToolId.hashCode());
        result = prime * result + ((partyContractId == null) ? 0 : partyContractId.hashCode());
        result = prime * result + ((partyContractRegisteredNumber == null) ? 0 : partyContractRegisteredNumber.hashCode());
        result = prime * result + ((partyContractInn == null) ? 0 : partyContractInn.hashCode());
        result = prime * result + ((invoiceId == null) ? 0 : invoiceId.hashCode());
        result = prime * result + ((invoiceStatus == null) ? 0 : invoiceStatus.hashCode());
        result = prime * result + ((invoiceStatusDetails == null) ? 0 : invoiceStatusDetails.hashCode());
        result = prime * result + ((invoiceProduct == null) ? 0 : invoiceProduct.hashCode());
        result = prime * result + ((invoiceDescription == null) ? 0 : invoiceDescription.hashCode());
        result = prime * result + ((invoiceAmount == null) ? 0 : invoiceAmount.hashCode());
        result = prime * result + ((invoiceCurrencyCode == null) ? 0 : invoiceCurrencyCode.hashCode());
        result = prime * result + ((invoiceDue == null) ? 0 : invoiceDue.hashCode());
        result = prime * result + ((invoiceCreatedAt == null) ? 0 : invoiceCreatedAt.hashCode());
        result = prime * result + ((invoiceContext == null) ? 0 : Arrays.hashCode(invoiceContext));
        result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
        result = prime * result + ((paymentStatus == null) ? 0 : paymentStatus.hashCode());
        result = prime * result + ((paymentStatusFailureCode == null) ? 0 : paymentStatusFailureCode.hashCode());
        result = prime * result + ((paymentStatusFailureDescription == null) ? 0 : paymentStatusFailureDescription.hashCode());
        result = prime * result + ((paymentAmount == null) ? 0 : paymentAmount.hashCode());
        result = prime * result + ((paymentCurrencyCode == null) ? 0 : paymentCurrencyCode.hashCode());
        result = prime * result + ((paymentFee == null) ? 0 : paymentFee.hashCode());
        result = prime * result + ((paymentTool == null) ? 0 : paymentTool.hashCode());
        result = prime * result + ((paymentMaskedPan == null) ? 0 : paymentMaskedPan.hashCode());
        result = prime * result + ((paymentBin == null) ? 0 : paymentBin.hashCode());
        result = prime * result + ((paymentToken == null) ? 0 : paymentToken.hashCode());
        result = prime * result + ((paymentSystem == null) ? 0 : paymentSystem.hashCode());
        result = prime * result + ((paymentSessionId == null) ? 0 : paymentSessionId.hashCode());
        result = prime * result + ((paymentCountryId == null) ? 0 : paymentCountryId.hashCode());
        result = prime * result + ((paymentCityId == null) ? 0 : paymentCityId.hashCode());
        result = prime * result + ((paymentIp == null) ? 0 : paymentIp.hashCode());
        result = prime * result + ((paymentPhoneNumber == null) ? 0 : paymentPhoneNumber.hashCode());
        result = prime * result + ((paymentEmail == null) ? 0 : paymentEmail.hashCode());
        result = prime * result + ((paymentFingerprint == null) ? 0 : paymentFingerprint.hashCode());
        result = prime * result + ((paymentCreatedAt == null) ? 0 : paymentCreatedAt.hashCode());
        result = prime * result + ((paymentContext == null) ? 0 : Arrays.hashCode(paymentContext));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceEventStat (");

        sb.append(eventId);
        sb.append(", ").append(eventCategory);
        sb.append(", ").append(eventType);
        sb.append(", ").append(eventCreatedAt);
        sb.append(", ").append(partyId);
        sb.append(", ").append(partyEmail);
        sb.append(", ").append(partyShopId);
        sb.append(", ").append(partyShopName);
        sb.append(", ").append(partyShopDescription);
        sb.append(", ").append(partyShopUrl);
        sb.append(", ").append(partyShopCategoryId);
        sb.append(", ").append(partyShopPayoutToolId);
        sb.append(", ").append(partyContractId);
        sb.append(", ").append(partyContractRegisteredNumber);
        sb.append(", ").append(partyContractInn);
        sb.append(", ").append(invoiceId);
        sb.append(", ").append(invoiceStatus);
        sb.append(", ").append(invoiceStatusDetails);
        sb.append(", ").append(invoiceProduct);
        sb.append(", ").append(invoiceDescription);
        sb.append(", ").append(invoiceAmount);
        sb.append(", ").append(invoiceCurrencyCode);
        sb.append(", ").append(invoiceDue);
        sb.append(", ").append(invoiceCreatedAt);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(paymentId);
        sb.append(", ").append(paymentStatus);
        sb.append(", ").append(paymentStatusFailureCode);
        sb.append(", ").append(paymentStatusFailureDescription);
        sb.append(", ").append(paymentAmount);
        sb.append(", ").append(paymentCurrencyCode);
        sb.append(", ").append(paymentFee);
        sb.append(", ").append(paymentTool);
        sb.append(", ").append(paymentMaskedPan);
        sb.append(", ").append(paymentBin);
        sb.append(", ").append(paymentToken);
        sb.append(", ").append(paymentSystem);
        sb.append(", ").append(paymentSessionId);
        sb.append(", ").append(paymentCountryId);
        sb.append(", ").append(paymentCityId);
        sb.append(", ").append(paymentIp);
        sb.append(", ").append(paymentPhoneNumber);
        sb.append(", ").append(paymentEmail);
        sb.append(", ").append(paymentFingerprint);
        sb.append(", ").append(paymentCreatedAt);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}