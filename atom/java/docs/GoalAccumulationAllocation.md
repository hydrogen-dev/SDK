
# GoalAccumulationAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationMethod** | [**AllocationMethodEnum**](#AllocationMethodEnum) | The allocation universe source, either create or select | 
**allocationPriority** | [**AllocationPriorityEnum**](#AllocationPriorityEnum) | Priority when allocating, either risk or goal | 
**optConfig** | [**GoalOptConfig**](GoalOptConfig.md) |  |  [optional]
**allocations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) | The current amount invested | 
**horizon** | **Integer** | The accumulation goal horizon | 
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) | Frequency in relation to the horizon | 
**goalConfig** | [**GoalConfig**](GoalConfig.md) |  | 
**depositConfig** | [**List&lt;GoalDepositConfig&gt;**](GoalDepositConfig.md) | The deposit attributes |  [optional]
**recommendationConfig** | [**GoalRecommendationConfigStatus**](GoalRecommendationConfigStatus.md) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) | The type of recommended action |  [optional]
**confTgt** | [**BigDecimal**](BigDecimal.md) | The confidence target |  [optional]
**n** | **Integer** | The number of Monte Carlo simulations to run |  [optional]
**removeOutliers** | **Boolean** | If TRUE, remove outlying results |  [optional]
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) | The goal deviation threshold type |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) | The goal deviation threshold value |  [optional]
**withdrawalTax** | [**BigDecimal**](BigDecimal.md) | The tax rate for withdrawals |  [optional]
**tradingDaysPerYear** | **Integer** | Days per year a portfolio trades |  [optional]
**riskScore** | **Integer** | The investor&#39;s risk score |  [optional]
**adjustForCompounding** | **Boolean** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. |  [optional]
**compoundingRate** | [**BigDecimal**](BigDecimal.md) | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. |  [optional]
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. |  [optional]


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


<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum
Name | Value
---- | -----
RECURRING | &quot;recurring&quot;
ONE_TIME | &quot;one-time&quot;
COMBO | &quot;combo&quot;
HORIZON | &quot;horizon&quot;


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum
Name | Value
---- | -----
AMNT | &quot;amnt&quot;
PERC | &quot;perc&quot;



