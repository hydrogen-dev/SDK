
# PortfolioWhatIfRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useProxyData** | **Boolean** |  |  [optional]
**alteredPortfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**currentPortfolioTickers** | **List&lt;String&gt;** |  |  [optional]
**startDate** | **String** |  |  [optional]
**endDate** | **String** |  |  [optional]
**modelId** | [**UUID**](UUID.md) |  |  [optional]
**allocationId** | [**UUID**](UUID.md) |  |  [optional]
**accountId** | [**UUID**](UUID.md) |  |  [optional]
**portfolioId** | [**UUID**](UUID.md) |  |  [optional]
**aggregationAccountId** | [**UUID**](UUID.md) |  |  [optional]
**alteredPortfolioWeights** | **List&lt;Float&gt;** |  | 
**marketDataSource** | [**MarketDataSourceEnum**](#MarketDataSourceEnum) |  |  [optional]
**currentPortfolioWeights** | **List&lt;Float&gt;** |  |  [optional]


<a name="MarketDataSourceEnum"></a>
## Enum: MarketDataSourceEnum
Name | Value
---- | -----
NUCLEUS | &quot;nucleus&quot;
INTEGRATION | &quot;integration&quot;



