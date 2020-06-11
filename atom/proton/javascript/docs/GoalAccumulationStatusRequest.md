# HydrogenProtonApi.GoalAccumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh** | **Number** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**confTgt** | **Number** |  | [optional] [default to 0.9]
**clientId** | **String** |  | [optional] 
**currInv** | **Number** |  | [optional] 
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**pRet** | **[Number]** |  | 
**threshType** | **String** |  | [optional] [default to 'perc']
**pRisk** | **[Number]** |  | 
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**recommendType** | **String** |  | [optional] [default to 'horizon']
**recommendationConfig** | **Object** |  | [optional] 
**goalId** | **String** |  | [optional] 
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**depositConfig** | **[Object]** |  | [optional] 
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**goalConfig** | **Object** |  | [optional] 
**horizon** | **Number** |  | [optional] 


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum


* `amnt` (value: `"amnt"`)

* `perc` (value: `"perc"`)




<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum


* `recurring` (value: `"recurring"`)

* `oneTime` (value: `"one-time"`)

* `combo` (value: `"combo"`)

* `horizon` (value: `"horizon"`)




<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum


* `year` (value: `"year"`)

* `sixMonths` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `twoWeeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




