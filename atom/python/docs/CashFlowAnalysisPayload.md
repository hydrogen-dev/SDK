# CashFlowAnalysisPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The ID of the client’s cash flows | 
**start_date** | **date** | Start date of the analysis period | [optional] 
**end_date** | **date** | End date of the analysis period | [optional] 
**benchmark_start_date** | **date** | Start date of the benchmark analysis period | [optional] 
**benchmark_end_date** | **date** | End date of the benchmark analysis period | [optional] 
**currency_code** | **str** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [optional] 
**show_history** | **bool** | If true, return a daily history of cash flow values | [optional] [default to False]
**show_spending_details** | **bool** | If true, return advanced details on spending over the analysis period | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


