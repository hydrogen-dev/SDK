# atom_api.GoalAccumulationAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationMethod** | **String** | The allocation universe source, either create or select | 
**allocationPriority** | **String** | Priority when allocating, either risk or goal | 
**optConfig** | [**GoalOptConfig**](GoalOptConfig.md) |  | [optional] 
**allocations** | **[String]** |  | [optional] 
**currInv** | **Number** | The current amount invested | 
**horizon** | **Number** | The accumulation goal horizon | 
**horizonFrequency** | **String** | Frequency in relation to the horizon | 
**goalConfig** | [**GoalConfig**](GoalConfig.md) |  | 
**depositConfig** | [**[GoalDepositConfig]**](GoalDepositConfig.md) | The deposit attributes | [optional] 
**recommendationConfig** | [**GoalRecommendationConfigStatus**](GoalRecommendationConfigStatus.md) |  | [optional] 
**recommendType** | **String** | The type of recommended action | [optional] [default to &#39;horizon&#39;]
**confTgt** | **Number** | The confidence target | [optional] 
**n** | **Number** | The number of Monte Carlo simulations to run | [optional] 
**removeOutliers** | **Boolean** | If TRUE, remove outlying results | [optional] [default to true]
**threshType** | **String** | The goal deviation threshold type | [optional] [default to &#39;perc&#39;]
**thresh** | **Number** | The goal deviation threshold value | [optional] 
**withdrawalTax** | **Number** | The tax rate for withdrawals | [optional] 
**tradingDaysPerYear** | **Number** | Days per year a portfolio trades | [optional] 
**riskScore** | **Number** | The investor&#39;s risk score | [optional] 
**adjustForCompounding** | **Boolean** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. | [optional] [default to false]
**compoundingRate** | **Number** | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. | [optional] 
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum


* `goal` (value: `"goal"`)

* `risk` (value: `"risk"`)




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




