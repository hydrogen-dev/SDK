# atom_api.GoalDecumulationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pRet** | **[Number]** | The annualized portfolio return | 
**pRisk** | **[Number]** | The annualized portfolio standard deviation | 
**currInv** | **Number** | The current amount invested | 
**aHorizon** | **Number** | The accumulation goal horizon | 
**dHorizon** | **Number** | The decumulation goal horizon | 
**horizonFrequency** | **String** | Frequency in relation to the horizon | 
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) | The withdrawal attributes | 
**depositConfig** | [**[GoalDepositConfig]**](GoalDepositConfig.md) | The deposit attributes | [optional] 
**recommendationConfig** | **Object** |  | [optional] 
**recommendType** | **String** | The type of recommended action | [optional] [default to &#39;horizon&#39;]
**confTgt** | **Number** | The confidence target | [optional] 
**n** | **Number** | The number of Monte Carlo simulations to run | [optional] 
**removeOutliers** | **Boolean** | If TRUE, remove outlying results | [optional] [default to true]
**threshType** | **String** | The goal deviation threshold type | [optional] [default to &#39;perc&#39;]
**thresh** | **Number** | The goal deviation threshold value | [optional] 
**withdrawalTax** | **Number** | The tax rate for withdrawals | [optional] 
**tradingDaysPerYear** | **Number** | Days per year a portfolio trades | [optional] 
**adjustForCompounding** | **Boolean** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. | [optional] [default to false]
**compoundingRate** | **Number** | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. | [optional] 


<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum


* `year` (value: `"year"`)

* `six_months` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `two_weeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum


* `recurring` (value: `"recurring"`)

* `one-time` (value: `"one-time"`)

* `combo` (value: `"combo"`)

* `horizon` (value: `"horizon"`)




<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum


* `amnt` (value: `"amnt"`)

* `perc` (value: `"perc"`)




