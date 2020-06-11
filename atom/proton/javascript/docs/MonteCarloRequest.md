# HydrogenProtonApi.MonteCarloRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sigma** | **[Number]** |  | [optional] 
**maxBal** | **[Number]** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**accountId** | **String** |  | [optional] 
**resultType** | **String** |  | [optional] [default to 'raw']
**aggregationAccountId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**maxSample** | **[Number]** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**mu** | **[Number]** |  | [optional] 
**frequencyInterval** | **String** |  | [optional] [default to 'year']
**retMod** | **[Number]** |  | [optional] 
**minSample** | **[Number]** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**cf** | **[[Number]]** |  | 
**modelId** | **String** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**initBal** | **Number** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**minBal** | **[Number]** |  | [optional] 
**p** | **[Number]** |  | [optional] 


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum


* `raw` (value: `"raw"`)

* `custom` (value: `"custom"`)

* `median` (value: `"median"`)

* `mean` (value: `"mean"`)

* `tens` (value: `"tens"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum


* `year` (value: `"year"`)

* `sixMonths` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `twoWeeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




