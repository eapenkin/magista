ALTER TABLE mst.invoice_event_stat RENAME payment_status_failure_code TO payment_external_failure_code;
ALTER TABLE mst.invoice_event_stat RENAME payment_status_failure_description TO payment_external_failure_description;
ALTER TABLE mst.invoice_event_stat ADD COLUMN payment_failure_class CHARACTER VARYING;

UPDATE mst.invoice_event_stat SET payment_failure_class = 'operation_timeout' WHERE payment_external_failure_code ISNULL AND payment_status = 'failed'::mst.INVOICE_PAYMENT_STATUS;
UPDATE mst.invoice_event_stat SET payment_failure_class = 'external_failure' WHERE payment_external_failure_code NOTNULL AND payment_status = 'failed'::mst.INVOICE_PAYMENT_STATUS;