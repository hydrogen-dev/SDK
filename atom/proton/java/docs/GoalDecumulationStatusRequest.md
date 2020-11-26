
# GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**dHorizon** | **Integer** |  |  [optional]
**n** | **Integer** |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**withdrawalConfig** | [**List&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  |  [optional]
**aHorizon** | **Integer** |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**pRet** | **List&lt;Float&gt;** |  | 
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**depositConfig** | [**List&lt;DecumulationGoalDepositConfig&gt;**](DecumulationGoalDepositConfig.md) |  |  [optional]
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**pRisk** | **List&lt;Float&gt;** |  | 
**createLog** | **Boolean** |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]


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


<a name="RecommendTypeEnum"></a>
## Enum: RecommendTypeEnum
Name | Value
---- | -----
RECURRING | &quot;recurring&quot;
ONE_TIME | &quot;one-time&quot;
COMBO | &quot;combo&quot;
HORIZON | &quot;horizon&quot;



