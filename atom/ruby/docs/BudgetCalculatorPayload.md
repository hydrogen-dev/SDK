# AtomApi::BudgetCalculatorPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_id** | **String** | Identifier for a budget defined in Nucleus | 
**as_of_date** | **Date** | Reference date of the analysis. Calculations will run through the earlier of this date and budget.end_date | [optional] 
**lookback_periods** | **Integer** | Number of lookback periods to analyze. Each period length is defined by the combination of budget.frequency and budget.frequency_unit | [optional] 
**relative_lookback** | **BOOLEAN** | If true, determine dates using a relative calendar basis | [optional] 


