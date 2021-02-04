
# GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**allocationPriority** | [**AllocationPriorityEnum**](#AllocationPriorityEnum) |  | 
**aHorizon** | **Integer** |  |  [optional]
**withdrawalConfig** | [**List&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**optConfig** | [**OptConfig**](OptConfig.md) |  |  [optional]
**depositConfig** | [**List&lt;DecumulationGoalDepositConfig&gt;**](DecumulationGoalDepositConfig.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**n** | **Integer** |  |  [optional]
**dHorizon** | **Integer** |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) |  | 


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum
Name | Value
---- | -----
AMNT | &quot;amnt&quot;
PERC | &quot;perc&quot;


<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum
Name | Value
---- | -----
GOAL | &quot;goal&quot;
RISK | &quot;risk&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


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


<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum
Name | Value
---- | -----
RECURRING | &quot;recurring&quot;
ONE_TIME | &quot;one-time&quot;
COMBO | &quot;combo&quot;
HORIZON | &quot;horizon&quot;


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;



