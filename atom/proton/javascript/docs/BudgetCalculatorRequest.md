# HydrogenProtonApi.BudgetCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [optional] [default to 'all']
**budgetDetails** | [**BudgetDetails**](BudgetDetails.md) |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**budgetId** | **String** |  | [optional] 
**asOfDate** | **Date** |  | [optional] 
**showAverageSpend** | **Boolean** |  | [optional] [default to false]
**showBudgetTrack** | **Boolean** |  | [optional] [default to true]
**relativeLookback** | **Boolean** |  | [optional] [default to true]
**lookbackPeriods** | **Number** |  | [optional] [default to 1]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `all` (value: `"all"`)

* `external` (value: `"external"`)

* `internal` (value: `"internal"`)




