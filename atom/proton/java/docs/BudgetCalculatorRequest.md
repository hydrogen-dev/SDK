
# BudgetCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**budgetDetails** | [**BudgetDetails**](BudgetDetails.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**budgetId** | [**UUID**](UUID.md) |  |  [optional]
**asOfDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showAverageSpend** | **Boolean** |  |  [optional]
**showBudgetTrack** | **Boolean** |  |  [optional]
**relativeLookback** | **Boolean** |  |  [optional]
**lookbackPeriods** | **Integer** |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



