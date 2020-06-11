# HydrogenProtonApi.SensitivityAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **Date** |  | [optional] 
**portfolioTickers** | **[String]** |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**endDate** | **Date** |  | [optional] 
**modelId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**accountId** | **String** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**sensitivityFactor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 
**portfolioWeights** | **[Number]** |  | [optional] 
**frequencyInterval** | **String** |  | 
**aggregationAccountId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']


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




