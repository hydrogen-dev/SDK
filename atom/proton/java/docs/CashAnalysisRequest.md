
# CashAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**showInflowDetails** | **Boolean** |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**historyFrequencyInterval** | [**HistoryFrequencyIntervalEnum**](#HistoryFrequencyIntervalEnum) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**showOutflowDetails** | **Boolean** |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
YEAR | &quot;year&quot;


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
EXTERNAL | &quot;external&quot;
INTERNAL | &quot;internal&quot;



