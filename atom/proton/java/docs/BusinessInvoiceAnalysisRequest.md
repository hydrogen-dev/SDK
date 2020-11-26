
# BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overduePeriods** | [**List&lt;Periods&gt;**](Periods.md) |  |  [optional]
**showOutstandingInvoices** | **Boolean** |  |  [optional]
**showHistory** | **Boolean** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**futureDuePeriods** | [**List&lt;Periods&gt;**](Periods.md) |  |  [optional]
**currencyConversion** | **String** |  |  [optional]
**historyFrequencyInterval** | [**HistoryFrequencyIntervalEnum**](#HistoryFrequencyIntervalEnum) |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**responseLimit** | **Integer** |  |  [optional]
**invoiceIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**customerId** | [**UUID**](UUID.md) |  |  [optional]


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
YEAR | &quot;year&quot;



