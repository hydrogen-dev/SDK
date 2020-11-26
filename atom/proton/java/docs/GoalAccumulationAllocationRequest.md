
# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) |  | 
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**n** | **Integer** |  |  [optional]
**allocationPriority** | [**AllocationPriorityEnum**](#AllocationPriorityEnum) |  | 
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**goalConfig** | [**GoalConfig**](GoalConfig.md) |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**horizon** | **Integer** |  |  [optional]
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**depositConfig** | [**List&lt;AccumulationGoalDepositConfig&gt;**](AccumulationGoalDepositConfig.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  |  [optional]
**optConfig** | [**OptConfig**](OptConfig.md) |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;


<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum
Name | Value
---- | -----
GOAL | &quot;goal&quot;
RISK | &quot;risk&quot;


<a name="HorizonFrequencyEnum"></a>
## Enum: HorizonFrequencyEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum
Name | Value
---- | -----
AMNT | &quot;amnt&quot;
PERC | &quot;perc&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum
Name | Value
---- | -----
RECURRING | &quot;recurring&quot;
ONE_TIME | &quot;one-time&quot;
COMBO | &quot;combo&quot;
HORIZON | &quot;horizon&quot;



