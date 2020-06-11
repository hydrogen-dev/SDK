# HydrogenProtonApi.GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | **[String]** |  | [optional] 
**clientId** | **String** |  | [optional] 
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**confTgt** | **Number** |  | [optional] [default to 0.9]
**riskScore** | **Number** |  | [optional] 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**dHorizon** | **Number** |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**threshType** | **String** |  | [optional] [default to 'perc']
**recommendType** | **String** |  | [optional] [default to 'horizon']
**goalId** | **String** |  | [optional] 
**depositConfig** | **[Object]** |  | [optional] 
**optConfig** | **Object** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**recommendationConfig** | **Object** |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**thresh** | **Number** |  | [optional] 
**aHorizon** | **Number** |  | [optional] 
**withdrawalConfig** | [**[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**currInv** | **Number** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**allocationPriority** | **String** |  | 
**allocationMethod** | **String** |  | 


<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum


* `year` (value: `"year"`)

* `sixMonths` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `twoWeeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




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




<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum


* `goal` (value: `"goal"`)

* `risk` (value: `"risk"`)




<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




