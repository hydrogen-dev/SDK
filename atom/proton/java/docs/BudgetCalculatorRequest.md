
# BudgetCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asOfDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showBudgetTrack** | **Boolean** |  |  [optional]
**budgetId** | [**UUID**](UUID.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**lookbackPeriods** | **Integer** |  |  [optional]
**showAverageSpend** | **Boolean** |  |  [optional]
**budgetDetails** | [**BudgetDetails**](BudgetDetails.md) |  |  [optional]
**relativeLookback** | **Boolean** |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



