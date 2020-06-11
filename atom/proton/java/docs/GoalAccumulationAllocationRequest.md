
# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**riskScore** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**depositConfig** | **List&lt;Object&gt;** |  |  [optional]
**optConfig** | **Object** |  |  [optional]
**goalConfig** | **Object** |  |  [optional]
**n** | **Integer** |  |  [optional]
**recommendationConfig** | **Object** |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**allocationPriority** | [**AllocationPriorityEnum**](#AllocationPriorityEnum) |  | 
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) |  | 
**horizon** | **Integer** |  |  [optional]


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


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum
Name | Value
---- | -----
AMNT | &quot;amnt&quot;
PERC | &quot;perc&quot;


<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum
Name | Value
---- | -----
RECURRING | &quot;recurring&quot;
ONE_TIME | &quot;one-time&quot;
COMBO | &quot;combo&quot;
HORIZON | &quot;horizon&quot;


<a name="AllocationPriorityEnum"></a>
## Enum: AllocationPriorityEnum
Name | Value
---- | -----
GOAL | &quot;goal&quot;
RISK | &quot;risk&quot;


<a name="AllocationMethodEnum"></a>
## Enum: AllocationMethodEnum
Name | Value
---- | -----
SELECT | &quot;select&quot;
CREATE | &quot;create&quot;



