# HydrogenProtonApi.BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerId** | **String** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**overduePeriods** | [**[Periods]**](Periods.md) |  | [optional] 
**clientId** | **String** |  | [optional] 
**responseLimit** | **Number** |  | [optional] [default to 10]
**currencyConversion** | **String** |  | [optional] 
**historyFrequencyInterval** | **String** |  | [optional] [default to 'month']
**startDate** | **Date** |  | [optional] 
**showHistory** | **Boolean** |  | [optional] [default to false]
**currencyCode** | **String** |  | [optional] 
**invoiceIds** | **[String]** |  | [optional] 
**showOutstandingInvoices** | **Boolean** |  | [optional] [default to false]
**futureDuePeriods** | [**[Periods]**](Periods.md) |  | [optional] 


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum


* `day` (value: `"day"`)

* `week` (value: `"week"`)

* `month` (value: `"month"`)

* `quarter` (value: `"quarter"`)

* `year` (value: `"year"`)




