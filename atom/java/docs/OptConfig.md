
# OptConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **List&lt;String&gt;** | Tickers for optimization |  [optional]
**minAssets** | **Integer** | Minimum number of assets |  [optional]
**wAssetConfig** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | Weight constraints |  [optional]
**wConfig** | [**WConfigPortfolio**](WConfigPortfolio.md) |  |  [optional]
**secTypes** | [**List&lt;SecTypesEnum&gt;**](#List&lt;SecTypesEnum&gt;) | Security types |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="List<SecTypesEnum>"></a>
## Enum: List&lt;SecTypesEnum&gt;
Name | Value
---- | -----
MAJOR | &quot;major&quot;
MINOR | &quot;minor&quot;
CASH | &quot;cash&quot;



