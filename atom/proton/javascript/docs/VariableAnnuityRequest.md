# HydrogenProtonApi.VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | **String** |  | [optional] 
**resultType** | **String** |  | [optional] [default to 'median']
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**annuitizationRate** | **Number** |  | [optional] [default to 0.0]
**endDate** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**taxRate** | **Number** |  | [optional] [default to 0.0]
**p** | **Number** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**startDate** | **String** |  | [optional] 
**aggregationAccountId** | **String** |  | [optional] 
**initialBalance** | **Number** |  | [optional] [default to 0.0]
**createLog** | **Boolean** |  | [optional] [default to false]
**decumulationHorizon** | **Number** |  | 
**accountId** | **String** |  | [optional] 
**accumulationHorizon** | **Number** |  | 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**portfolioWeights** | **[Number]** |  | [optional] 
**guaranteedAccumulationBenefit** | **Number** |  | [optional] [default to 0.0]
**portfolioTickers** | **[String]** |  | [optional] 
**guaranteedRateBenefit** | [**[GuaranteedRateBenefit]**](GuaranteedRateBenefit.md) |  | [optional] 
**modelId** | **String** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**frequencyInterval** | **String** |  | [optional] [default to 'year']


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




