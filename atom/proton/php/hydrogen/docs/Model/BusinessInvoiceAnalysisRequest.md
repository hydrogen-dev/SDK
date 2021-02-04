# BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **string** |  | [optional] 
**end_date** | [**\DateTime**](\DateTime.md) |  | [optional] 
**overdue_periods** | [**\com\hydrogen\proton\Model\Periods[]**](Periods.md) |  | [optional] 
**client_id** | **string** |  | [optional] 
**response_limit** | **int** |  | [optional] [default to 10]
**currency_conversion** | **string** |  | [optional] 
**history_frequency_interval** | **string** |  | [optional] [default to 'month']
**start_date** | [**\DateTime**](\DateTime.md) |  | [optional] 
**show_history** | **bool** |  | [optional] [default to false]
**currency_code** | **string** |  | [optional] 
**invoice_ids** | **string[]** |  | [optional] 
**show_outstanding_invoices** | **bool** |  | [optional] [default to false]
**future_due_periods** | [**\com\hydrogen\proton\Model\Periods[]**](Periods.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


