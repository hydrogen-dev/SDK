
# PortfolioWhatIfRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentPortfolioWeights** | **List&lt;Float&gt;** |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**endDate** | **String** |  |  [optional]
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**useProxyData** | **Boolean** |  |  [optional]
**startDate** | **String** |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**currentPortfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**alteredPortfolioWeights** | **List&lt;Float&gt;** |  | 
**alteredPortfolioTickers** | **List&lt;String&gt;** |  |  [optional]


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



