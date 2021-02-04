
# MonteCarloRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**maxSample** | **List&lt;Float&gt;** |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**retMod** | **List&lt;Float&gt;** |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**maxBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**p** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**initBal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**minSample** | **List&lt;Float&gt;** |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**mu** | **List&lt;Float&gt;** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**sigma** | **List&lt;Float&gt;** |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**n** | **Integer** |  |  [optional]
**minBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  |  [optional]
**cf** | [**List&lt;List&lt;BigDecimal&gt;&gt;**](List.md) |  | 


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
RAW | &quot;raw&quot;
CUSTOM | &quot;custom&quot;
MEDIAN | &quot;median&quot;
MEAN | &quot;mean&quot;
TENS | &quot;tens&quot;


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
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



