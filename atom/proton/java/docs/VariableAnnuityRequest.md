
# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]
**annuitizationRate** | **Float** |  |  [optional]
**endDate** | **String** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**p** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | **String** |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**decumulationHorizon** | **Integer** |  | 
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**accumulationHorizon** | **Integer** |  | 
**tradingDaysPerYear** | **Integer** |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**guaranteedAccumulationBenefit** | **Float** |  |  [optional]
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**guaranteedRateBenefit** | [**List&lt;GuaranteedRateBenefit&gt;**](GuaranteedRateBenefit.md) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**n** | **Integer** |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  |  [optional]


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
MEAN | &quot;mean&quot;
MEDIAN | &quot;median&quot;
CUSTOM | &quot;custom&quot;


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



