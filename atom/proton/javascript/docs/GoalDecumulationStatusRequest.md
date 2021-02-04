# HydrogenProtonApi.GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshType** | **String** |  | [optional] [default to 'perc']
**goalId** | **String** |  | [optional] 
**clientId** | **String** |  | [optional] 
**confTgt** | **Number** |  | [optional] [default to 0.9]
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**aHorizon** | **Number** |  | [optional] 
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**pRet** | **[Number]** |  | 
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**depositConfig** | [**[DecumulationGoalDepositConfig]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **Number** |  | [optional] 
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**n** | **Number** |  | [optional] [default to 1000]
**dHorizon** | **Number** |  | [optional] 
**pRisk** | **[Number]** |  | 
**currInv** | **Number** |  | [optional] 
**recommendType** | **String** |  | [optional] [default to 'horizon']


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




