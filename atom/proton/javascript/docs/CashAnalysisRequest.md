# HydrogenProtonApi.CashAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endDate** | **Date** |  | [optional] 
**clientId** | **String** |  | [optional] 
**showInflowDetails** | **Boolean** |  | [optional] [default to false]
**currencyConversion** | **String** |  | [optional] 
**historyFrequencyInterval** | **String** |  | [optional] [default to 'month']
**startDate** | **Date** |  | [optional] 
**showHistory** | **Boolean** |  | [optional] [default to false]
**currencyCode** | **String** |  | [optional] 
**showOutflowDetails** | **Boolean** |  | [optional] [default to false]
**scope** | **String** |  | [optional] [default to 'all']


<a name="HistoryFrequencyIntervalEnum"></a>
## Enum: HistoryFrequencyIntervalEnum


* `day` (value: `"day"`)

* `week` (value: `"week"`)

* `month` (value: `"month"`)

* `quarter` (value: `"quarter"`)

* `year` (value: `"year"`)




<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `all` (value: `"all"`)

* `external` (value: `"external"`)

* `internal` (value: `"internal"`)




