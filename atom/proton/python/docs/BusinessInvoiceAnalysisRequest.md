# BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overdue_periods** | [**list[Periods]**](Periods.md) |  | [optional] 
**show_outstanding_invoices** | **bool** |  | [optional] [default to False]
**show_history** | **bool** |  | [optional] [default to False]
**client_id** | **str** |  | [optional] 
**future_due_periods** | [**list[Periods]**](Periods.md) |  | [optional] 
**currency_conversion** | **str** |  | [optional] 
**history_frequency_interval** | **str** |  | [optional] [default to 'month']
**end_date** | **date** |  | [optional] 
**currency_code** | **str** |  | [optional] 
**start_date** | **date** |  | [optional] 
**response_limit** | **int** |  | [optional] [default to 10]
**invoice_ids** | **list[str]** |  | [optional] 
**customer_id** | **str** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


