# HydrogenProtonApi.VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guaranteedAccumulationBenefit** | **Number** |  | [optional] [default to 0.0]
**p** | **Number** |  | [optional] 
**aggregationAccountId** | **String** |  | [optional] 
**allocationId** | **String** |  | [optional] 
**portfolioWeights** | **[Number]** |  | [optional] 
**endDate** | **String** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**accountId** | **String** |  | [optional] 
**portfolioTickers** | **[String]** |  | [optional] 
**initialBalance** | **Number** |  | [optional] [default to 0.0]
**removeOutliers** | **Boolean** |  | [optional] [default to false]
**modelId** | **String** |  | [optional] 
**guaranteedRateBenefit** | [**[GuaranteedRateBenefit]**](GuaranteedRateBenefit.md) |  | [optional] 
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**accumulationHorizon** | **Number** |  | 
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**annuitizationRate** | **Number** |  | [optional] [default to 0.0]
**resultType** | **String** |  | [optional] [default to 'median']
**startDate** | **String** |  | [optional] 
**portfolioId** | **String** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**frequencyInterval** | **String** |  | [optional] [default to 'year']
**createLog** | **Boolean** |  | [optional] [default to false]
**decumulationHorizon** | **Number** |  | 
**taxRate** | **Number** |  | [optional] [default to 0.0]


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




