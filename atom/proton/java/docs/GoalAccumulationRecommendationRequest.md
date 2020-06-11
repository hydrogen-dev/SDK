
# GoalAccumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**n** | **Integer** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**confTgt** | **Float** |  |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**currInv** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**withdrawalTax** | **Float** |  |  [optional]
**pRet** | **List&lt;Float&gt;** |  | 
**threshType** | [**ThreshTypeEnum**](#ThreshTypeEnum) |  |  [optional]
**pRisk** | **List&lt;Float&gt;** |  | 
**adjustForCompounding** | **Boolean** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**recommendType** | [**RecommendTypeEnum**](#RecommendTypeEnum) |  |  [optional]
**recommendationConfig** | **Object** |  |  [optional]
**goalId** | [**UUID**](UUID.md) |  |  [optional]
**horizonFrequency** | [**HorizonFrequencyEnum**](#HorizonFrequencyEnum) |  |  [optional]
**depositConfig** | **List&lt;Object&gt;** |  |  [optional]
**compoundingRate** | **Float** |  |  [optional]
**goalConfig** | **Object** |  |  [optional]
**horizon** | **Integer** |  |  [optional]


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



