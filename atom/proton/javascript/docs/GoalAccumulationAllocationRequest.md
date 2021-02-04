# HydrogenProtonApi.GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshType** | **String** |  | [optional] [default to 'perc']
**goalId** | **String** |  | [optional] 
**clientId** | **String** |  | [optional] 
**confTgt** | **Number** |  | [optional] [default to 0.9]
**riskScore** | **Number** |  | [optional] 
**removeOutliers** | **Boolean** |  | [optional] [default to true]
**allocationPriority** | **String** |  | 
**marketDataSource** | **String** |  | [optional] [default to 'nucleus']
**compoundingRate** | **Number** |  | [optional] [default to 0.0]
**adjustForCompounding** | **Boolean** |  | [optional] [default to false]
**optConfig** | [**OptConfig**](OptConfig.md) |  | [optional] 
**depositConfig** | [**[AccumulationGoalDepositConfig]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**useProxyData** | **Boolean** |  | [optional] [default to false]
**thresh** | **Number** |  | [optional] 
**horizonFrequency** | **String** |  | [optional] [default to 'year']
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**withdrawalTax** | **Number** |  | [optional] [default to 0.0]
**goalConfig** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**tradingDaysPerYear** | **Number** |  | [optional] [default to 252]
**allocations** | **[String]** |  | [optional] 
**n** | **Number** |  | [optional] [default to 1000]
**horizon** | **Number** |  | [optional] 
**recommendType** | **String** |  | [optional] [default to 'horizon']
**currInv** | **Number** |  | [optional] 
**allocationMethod** | **String** |  | 


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum


* `amnt` (value: `"amnt"`)

* `perc` (value: `"perc"`)




<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum


* `goal` (value: `"goal"`)

* `risk` (value: `"risk"`)




<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum


* `nucleus` (value: `"nucleus"`)

* `integration` (value: `"integration"`)




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




<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum


* `select` (value: `"select"`)

* `create` (value: `"create"`)




