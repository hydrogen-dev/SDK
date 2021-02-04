
# CashFlowAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**benchmarkEndDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**showIncomeDetails** | **Boolean** |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**benchmarkStartDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showSpendingDetails** | **Boolean** |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



