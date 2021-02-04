# HydrogenProtonApi.BudgetCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | **Date** |  | [optional] 
**showBudgetTrack** | **Boolean** |  | [optional] [default to true]
**budgetId** | **String** |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**lookbackPeriods** | **Number** |  | [optional] [default to 1]
**showAverageSpend** | **Boolean** |  | [optional] [default to false]
**budgetDetails** | [**BudgetDetails**](BudgetDetails.md) |  | [optional] 
**relativeLookback** | **Boolean** |  | [optional] [default to true]
**scope** | **String** |  | [optional] [default to 'all']


<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `all` (value: `"all"`)

* `external` (value: `"external"`)

* `internal` (value: `"internal"`)




