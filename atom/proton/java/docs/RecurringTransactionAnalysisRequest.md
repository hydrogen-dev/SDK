
# RecurringTransactionAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**intervalDeviationThreshold** | **Integer** |  |  [optional]
**analyzeTransactions** | **Boolean** |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**showRecurringDetails** | **Boolean** |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**amountDeviationThreshold** | **Float** |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



