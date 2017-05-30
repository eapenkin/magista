package com.rbkmoney.magista.event.impl.handler;

import com.rbkmoney.damsel.event_stock.StockEvent;
import com.rbkmoney.magista.event.EventType;
import com.rbkmoney.magista.event.Mapper;
import com.rbkmoney.magista.event.Processor;
import com.rbkmoney.magista.event.impl.context.InvoiceEventContext;
import com.rbkmoney.magista.event.impl.mapper.PaymentStatusMapper;
import com.rbkmoney.magista.event.impl.processor.CompositeProcessor;
import com.rbkmoney.magista.event.impl.processor.InvoicePaymentEventStatusChangeProcessor;
import com.rbkmoney.magista.event.impl.processor.PaymentStatusChangeProcessor;
import com.rbkmoney.magista.service.InvoiceEventService;
import com.rbkmoney.magista.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tolkonepiu on 10.08.16.
 */
@Component
public class PaymentStatusChangedHandler extends AbstractInvoiceEventHandler {

    @Autowired
    PaymentService paymentService;

    @Autowired
    InvoiceEventService invoiceEventService;

    @Override
    public Processor handle(StockEvent event) {
        InvoiceEventContext context = generateContext(event);
        return new CompositeProcessor(
                new PaymentStatusChangeProcessor(paymentService, context.getPaymentStatusChange()),
                new InvoicePaymentEventStatusChangeProcessor(invoiceEventService, context.getPaymentStatusChange())
        );
    }

    @Override
    public EventType getEventType() {
        return EventType.INVOICE_PAYMENT_STATUS_CHANGED;
    }

    @Override
    List<Mapper> getMappers() {
        return Arrays.asList(
                new PaymentStatusMapper()
        );
    }
}