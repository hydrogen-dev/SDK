# HydrogenProtonApi.GoalAccumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshType** | **String** |  | [optional] [default to 'perc']
**goalId** | **String** |  | [optional] 
**clientId** | **String** |  | [optional] 
**confTgt** | **Number** |  | [optional] [default to 0.9]
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**pRet** | **[Number]** |  | 
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**depositConfig** | [**[AccumulationGoalDepositConfig]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **Number** |  | [optional] 
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**recommendationConfig** | [**RecommendationConfig1**](RecommendationConfig1.md) |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**goalConfig** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**n** | **Number** |  | [optional] [default to 1000]
**pRisk** | **[Number]** |  | 
**horizon** | **Number** |  | [optional] 
**recommendType** | **String** |  | [optional] [default to 'horizon']
**currInv** | **Number** |  | [optional] 


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum


* `amnt` (value: `"amnt"`)

* `perc` (value: `"perc"`)




<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum


* `year` (value: `"year"`)

* `sixMonths` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `twoWeeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum


* `recurring` (value: `"recurring"`)

* `oneTime` (value: `"one-time"`)

* `combo` (value: `"combo"`)

* `horizon` (value: `"horizon"`)




