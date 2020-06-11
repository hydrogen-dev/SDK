# HydrogenProtonApi.VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** |  | [optional] 
**initialBalance** | **Number** |  | [optional] [default to 0.0]
**taxRate** | **Number** |  | [optional] [default to 0.0]
**allocationId** | **String** |  | [optional] 
**accountId** | **String** |  | [optional] 
**resultType** | **String** |  | [optional] [default to 'median']
**accumulationHorizon** | **Number** |  | 
**aggregationAccountId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**guaranteedAccumulationBenefit** | **Number** |  | [optional] [default to 0.0]
**decumulationHorizon** | **Number** |  | 
**depositSchedule** | **Object** |  | [optional] 
**portfolioTickers** | **[String]** |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**portfolioId** | **String** |  | [optional] 
**frequencyInterval** | **String** |  | [optional] [default to 'year']
**guaranteedRateBenefit** | **[Object]** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**modelId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**endDate** | **String** |  | [optional] 
**annuitizationRate** | **Number** |  | [optional] [default to 0.0]
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**p** | **Number** |  | [optional] 


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum


* `mean` (value: `"mean"`)

* `median` (value: `"median"`)

* `custom` (value: `"custom"`)




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




