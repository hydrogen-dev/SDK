# HydrogenProtonApi.SensitivityAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**modelId** | **String** |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**allocationId** | **String** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**accountId** | **String** |  | [optional] 
**frequencyInterval** | **String** |  | 
**aggregationAccountId** | **String** |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**portfolioWeights** | **[Number]** |  | [optional] 
**sensitivityFactor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




