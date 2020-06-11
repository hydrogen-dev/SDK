
# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**accumulationHorizon** | **Integer** |  | 
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**guaranteedAccumulationBenefit** | **Float** |  |  [optional]
**decumulationHorizon** | **Integer** |  | 
**depositSchedule** | **Object** |  |  [optional]
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**tradingDaysPerYear** | **Integer** |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  |  [optional]
**guaranteedRateBenefit** | **List&lt;Object&gt;** |  |  [optional]
**n** | **Integer** |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**endDate** | **String** |  |  [optional]
**annuitizationRate** | **Float** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**p** | [**BigDecimal**](BigDecimal.md) |  |  [optional]


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



