
# DiversificationScoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



