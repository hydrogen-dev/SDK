# atom_api.BudgetCalculatorPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budgetId** | **String** | Identifier for a budget defined in Nucleus | 
**asOfDate** | **Date** | Reference date of the analysis. Calculations will run through the earlier of this date and budget.end_date | [optional] 
**lookbackPeriods** | **Number** | Number of lookback periods to analyze. Each period length is defined by the combination of budget.frequency and budget.frequency_unit | [optional] 
**relativeLookback** | **Boolean** | If true, determine dates using a relative calendar basis | [optional] 


