
# BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | [**UUID**](UUID.md) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**overduePeriods** | [**List&lt;Periods&gt;**](Periods.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**responseLimit** | **Integer** |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**historyFrequencyInterval** | [**HistoryFrequencyIntervalEnum**](#HistoryFrequencyIntervalEnum) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**invoiceIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**showOutstandingInvoices** | **Boolean** |  |  [optional]
**futureDuePeriods** | [**List&lt;Periods&gt;**](Periods.md) |  |  [optional]


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
YEAR | &quot;year&quot;



