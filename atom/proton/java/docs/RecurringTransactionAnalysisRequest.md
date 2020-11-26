
# RecurringTransactionAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**amountDeviationThreshold** | **Float** |  |  [optional]
**analyzeTransactions** | **Boolean** |  |  [optional]
**intervalDeviationThreshold** | **Integer** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showRecurringDetails** | **Boolean** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



