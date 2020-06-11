# HydrogenProtonApi.GoalDecumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** |  | [optional] 
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**confTgt** | **Number** |  | [optional] [default to 0.9]
**dHorizon** | **Number** |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**threshType** | **String** |  | [optional] [default to 'perc']
**recommendType** | **String** |  | [optional] [default to 'horizon']
**goalId** | **String** |  | [optional] 
**depositConfig** | **[Object]** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**recommendationConfig** | **Object** |  | [optional] 
**thresh** | **Number** |  | [optional] 
**aHorizon** | **Number** |  | [optional] 
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**currInv** | **Number** |  | [optional] 
**pRet** | **[Number]** |  | 
**pRisk** | **[Number]** |  | 
**removeOutliers** | **Boolean** |  | [optional] [default to true]


<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum


* `year` (value: `"year"`)

* `sixMonths` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `twoWeeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




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




