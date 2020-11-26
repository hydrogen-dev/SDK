
# CashAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**showOutflowDetails** | **Boolean** |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**showInflowDetails** | **Boolean** |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**historyFrequencyInterval** | [**HistoryFrequencyIntervalEnum**](#HistoryFrequencyIntervalEnum) |  |  [optional]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
YEAR | &quot;year&quot;



