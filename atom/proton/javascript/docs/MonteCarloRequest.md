# HydrogenProtonApi.MonteCarloRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSample** | **[Number]** |  | [optional] 
**p** | **[Number]** |  | [optional] 
**aggregationAccountId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**mu** | **[Number]** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**sigma** | **[Number]** |  | [optional] 
**accountId** | **String** |  | [optional] 
**initBal** | **Number** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**modelId** | **String** |  | [optional] 
**maxBal** | **[Number]** |  | [optional] 
**minBal** | **[Number]** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**cf** | **[[Number]]** |  | 
**resultType** | **String** |  | [optional] [default to 'raw']
**retMod** | **[Number]** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**portfolioId** | **String** |  | [optional] 
**frequencyInterval** | **String** |  | [optional] [default to 'year']
**createLog** | **Boolean** |  | [optional] [default to false]
**minSample** | **[Number]** |  | [optional] 


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




