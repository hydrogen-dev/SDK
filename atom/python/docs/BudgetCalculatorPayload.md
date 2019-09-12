# BudgetCalculatorPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_id** | **str** | Identifier for a budget defined in Nucleus | 
**as_of_date** | **date** | Reference date of the analysis. Calculations will run through the earlier of this date and budget.end_date | [optional] 
**lookback_periods** | **int** | Number of lookback periods to analyze. Each period length is defined by the combination of budget.frequency and budget.frequency_unit | [optional] 
**relative_lookback** | **bool** | If true, determine dates using a relative calendar basis | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


