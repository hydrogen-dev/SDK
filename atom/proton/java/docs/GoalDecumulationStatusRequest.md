
# GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**adjustForCompounding** | **Boolean** |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**dHorizon** | **Integer** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**depositConfig** | **List&lt;Object&gt;** |  |  [optional]
**n** | **Integer** |  |  [optional]
**recommendationConfig** | **Object** |  |  [optional]
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**aHorizon** | **Integer** |  |  [optional]
**withdrawalConfig** | [**List&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**pRet** | **List&lt;Float&gt;** |  | 
**pRisk** | **List&lt;Float&gt;** |  | 
**removeOutliers** | **Boolean** |  |  [optional]


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



