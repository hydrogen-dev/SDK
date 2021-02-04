
# PortfolioOptimizationScoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**optConfig** | [**OptConfig1**](OptConfig1.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**tgtType** | [**TgtTypeEnum**](#TgtTypeEnum) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum
Name | Value
---- | -----
RISK | &quot;risk&quot;
RETURN | &quot;return&quot;



