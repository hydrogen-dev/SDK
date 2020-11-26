# HydrogenProtonApi.GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | **String** |  | [optional] 
**currInv** | **Number** |  | [optional] 
**dHorizon** | **Number** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**clientId** | **String** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**aHorizon** | **Number** |  | [optional] 
**confTgt** | **Number** |  | [optional] [default to 0.9]
**pRet** | **[Number]** |  | 
**threshType** | **String** |  | [optional] [default to 'perc']
**thresh** | **Number** |  | [optional] 
**depositConfig** | [**[DecumulationGoalDepositConfig]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**pRisk** | **[Number]** |  | 
**createLog** | **Boolean** |  | [optional] [default to false]
**recommendType** | **String** |  | [optional] [default to 'horizon']


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




