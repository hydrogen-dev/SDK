
# MonteCarloRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxSample** | **List&lt;Float&gt;** |  |  [optional]
**p** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**mu** | **List&lt;Float&gt;** |  |  [optional]
**n** | **Integer** |  |  [optional]
**sigma** | **List&lt;Float&gt;** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**initBal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**removeOutliers** | **Boolean** |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**maxBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**minBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**cf** | [**List&lt;List&lt;BigDecimal&gt;&gt;**](List.md) |  | 
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**retMod** | **List&lt;Float&gt;** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**minSample** | **List&lt;Float&gt;** |  |  [optional]


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



