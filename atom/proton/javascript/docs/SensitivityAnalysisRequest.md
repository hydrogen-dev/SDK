# HydrogenProtonApi.SensitivityAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**portfolioTickers** | **[String]** |  | [optional] 
**frequencyInterval** | **String** |  | 
**sensitivityFactor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 
**createLog** | **Boolean** |  | [optional] [default to false]
**aggregationAccountId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**modelId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**accountId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**portfolioId** | **String** |  | [optional] 


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




