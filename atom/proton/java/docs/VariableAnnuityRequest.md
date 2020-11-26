
# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guaranteedAccumulationBenefit** | **Float** |  |  [optional]
**p** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**endDate** | **String** |  |  [optional]
**n** | **Integer** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**guaranteedRateBenefit** | [**List&lt;GuaranteedRateBenefit&gt;**](GuaranteedRateBenefit.md) |  |  [optional]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**accumulationHorizon** | **Integer** |  | 
**inflationRate** | **Float** |  |  [optional]
**annuitizationRate** | **Float** |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**startDate** | **String** |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**decumulationHorizon** | **Integer** |  | 
**taxRate** | **Float** |  |  [optional]


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



