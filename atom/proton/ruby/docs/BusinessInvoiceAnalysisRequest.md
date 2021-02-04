# ProtonApi::BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **String** |  | [optional] 
**end_date** | **Date** |  | [optional] 
**overdue_periods** | [**Array&lt;Periods&gt;**](Periods.md) |  | [optional] 
**client_id** | **String** |  | [optional] 
**response_limit** | **Integer** |  | [optional] [default to 10]
**currency_conversion** | **String** |  | [optional] 
**history_frequency_interval** | **String** |  | [optional] [default to &#39;month&#39;]
**start_date** | **Date** |  | [optional] 
**show_history** | **BOOLEAN** |  | [optional] [default to false]
**currency_code** | **String** |  | [optional] 
**invoice_ids** | **Array&lt;String&gt;** |  | [optional] 
**show_outstanding_invoices** | **BOOLEAN** |  | [optional] [default to false]
**future_due_periods** | [**Array&lt;Periods&gt;**](Periods.md) |  | [optional] 


