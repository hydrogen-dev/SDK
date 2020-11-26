# HydrogenProtonApi.GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | **String** |  | [optional] 
**allocationMethod** | **String** |  | 
**currInv** | **Number** |  | [optional] 
**riskScore** | **Number** |  | [optional] 
**dHorizon** | **Number** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**allocationPriority** | **String** |  | 
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**allocations** | **[String]** |  | [optional] 
**clientId** | **String** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**aHorizon** | **Number** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**confTgt** | **Number** |  | [optional] [default to 0.9]
**threshType** | **String** |  | [optional] [default to 'perc']
**thresh** | **Number** |  | [optional] 
**depositConfig** | [**[DecumulationGoalDepositConfig]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**optConfig** | [**OptConfig**](OptConfig.md) |  | [optional] 
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**createLog** | **Boolean** |  | [optional] [default to false]
**recommendType** | **String** |  | [optional] [default to 'horizon']


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




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum


* `recurring` (value: `"recurring"`)

* `oneTime` (value: `"one-time"`)

* `combo` (value: `"combo"`)

* `horizon` (value: `"horizon"`)




