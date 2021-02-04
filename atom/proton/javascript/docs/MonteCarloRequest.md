# HydrogenProtonApi.MonteCarloRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | **String** |  | [optional] 
**maxSample** | **[Number]** |  | [optional] 
**resultType** | **String** |  | [optional] [default to 'raw']
**retMod** | **[Number]** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**maxBal** | **[Number]** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**p** | **[Number]** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**aggregationAccountId** | **String** |  | [optional] 
**initBal** | **Number** |  | [optional] 
**minSample** | **[Number]** |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**mu** | **[Number]** |  | [optional] 
**accountId** | **String** |  | [optional] 
**sigma** | **[Number]** |  | [optional] 
**modelId** | **String** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**minBal** | **[Number]** |  | [optional] 
**frequencyInterval** | **String** |  | [optional] [default to 'year']
**cf** | **[[Number]]** |  | 


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




