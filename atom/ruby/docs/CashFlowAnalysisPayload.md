# AtomApi::CashFlowAnalysisPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **String** | The ID of the client’s cash flows | 
**start_date** | **Date** | Start date of the analysis period | [optional] 
**end_date** | **Date** | End date of the analysis period | [optional] 
**benchmark_start_date** | **Date** | Start date of the benchmark analysis period | [optional] 
**benchmark_end_date** | **Date** | End date of the benchmark analysis period | [optional] 
**currency_code** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [optional] 
**show_history** | **BOOLEAN** | If true, return a daily history of cash flow values | [optional] [default to false]
**show_spending_details** | **BOOLEAN** | If true, return advanced details on spending over the analysis period | [optional] [default to false]


