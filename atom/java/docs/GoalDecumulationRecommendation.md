
# GoalDecumulationRecommendation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pRet** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The annualized portfolio return | 
**pRisk** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The annualized portfolio standard deviation | 
**currInv** | [**BigDecimal**](BigDecimal.md) | The current amount invested | 
**aHorizon** | **Integer** | The accumulation goal horizon | 
**dHorizon** | **Integer** | The decumulation goal horizon | 
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) | Frequency in relation to the horizon | 
**withdrawalConfig** | [**List&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) | The withdrawal attributes | 
**depositConfig** | [**List&lt;GoalDepositConfig&gt;**](GoalDepositConfig.md) | The deposit attributes |  [optional]
**recommendationConfig** | [**GoalRecommendationConfigRec**](GoalRecommendationConfigRec.md) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) | The type of recommended action |  [optional]
**confTgt** | [**BigDecimal**](BigDecimal.md) | The confidence target |  [optional]
**n** | **Integer** | The number of Monte Carlo simulations to run |  [optional]
**removeOutliers** | **Boolean** | If TRUE, remove outlying results |  [optional]
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) | The goal deviation threshold type |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) | The goal deviation threshold value |  [optional]
**withdrawalTax** | [**BigDecimal**](BigDecimal.md) | The tax rate for withdrawals |  [optional]
**tradingDaysPerYear** | **Integer** | Days per year a portfolio trades |  [optional]
**adjustForCompounding** | **Boolean** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. |  [optional]
**compoundingRate** | [**BigDecimal**](BigDecimal.md) | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. |  [optional]


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



