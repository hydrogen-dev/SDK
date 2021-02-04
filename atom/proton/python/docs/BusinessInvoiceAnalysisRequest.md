# BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** |  | [optional] 
**end_date** | **date** |  | [optional] 
**overdue_periods** | [**list[Periods]**](Periods.md) |  | [optional] 
**client_id** | **str** |  | [optional] 
**response_limit** | **int** |  | [optional] [default to 10]
**currency_conversion** | **str** |  | [optional] 
**history_frequency_interval** | **str** |  | [optional] [default to 'month']
**start_date** | **date** |  | [optional] 
**show_history** | **bool** |  | [optional] [default to False]
**currency_code** | **str** |  | [optional] 
**invoice_ids** | **list[str]** |  | [optional] 
**show_outstanding_invoices** | **bool** |  | [optional] [default to False]
**future_due_periods** | [**list[Periods]**](Periods.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


