# HydrogenProtonApi.BusinessInvoiceAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overduePeriods** | [**[Periods]**](Periods.md) |  | [optional] 
**showOutstandingInvoices** | **Boolean** |  | [optional] [default to false]
**showHistory** | **Boolean** |  | [optional] [default to false]
**clientId** | **String** |  | [optional] 
**futureDuePeriods** | [**[Periods]**](Periods.md) |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**historyFrequencyInterval** | **String** |  | [optional] [default to 'month']
**endDate** | **Date** |  | [optional] 
**currencyCode** | **String** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**responseLimit** | **Number** |  | [optional] [default to 10]
**invoiceIds** | **[String]** |  | [optional] 
**customerId** | **String** |  | [optional] 


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum


* `day` (value: `"day"`)

* `week` (value: `"week"`)

* `month` (value: `"month"`)

* `quarter` (value: `"quarter"`)

* `year` (value: `"year"`)




