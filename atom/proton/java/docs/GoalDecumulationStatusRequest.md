
# GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**aHorizon** | **Integer** |  |  [optional]
**withdrawalConfig** | [**List&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  |  [optional]
**pRet** | **List&lt;Float&gt;** |  | 
**compoundingRate** | **Float** |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**depositConfig** | [**List&lt;DecumulationGoalDepositConfig&gt;**](DecumulationGoalDepositConfig.md) |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**recommendationConfig** | [**RecommendationConfig**](RecommendationConfig.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**n** | **Integer** |  |  [optional]
**dHorizon** | **Integer** |  |  [optional]
**pRisk** | **List&lt;Float&gt;** |  | 
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]


<a name="ThreshTypeEnum"></a>
## Enum: ThreshTypeEnum
Name | Value
---- | -----
AMNT | &quot;amnt&quot;
PERC | &quot;perc&quot;


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



