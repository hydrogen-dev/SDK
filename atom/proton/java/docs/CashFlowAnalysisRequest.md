
# CashFlowAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**benchmarkStartDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showSpendingDetails** | **Boolean** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showIncomeDetails** | **Boolean** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**benchmarkEndDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



