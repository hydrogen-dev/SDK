
# OptConfigPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **List&lt;String&gt;** | List of tickers | 
**minAssets** | **Integer** | Minimum number of assets | 
**wConfig** | [**WConfigPortfolio**](WConfigPortfolio.md) |  | 
**wAssetConfig** | [**Map&lt;String, BigDecimal&gt;**](BigDecimal.md) | Weight constraints for asset classes. | 
**secTypes** | **List&lt;String&gt;** | Security types | 
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tgtType** | [**TgtTypeEnum**](#TgtTypeEnum) | The target type for a target portfolio |  [optional]
**tgtVal** | [**BigDecimal**](BigDecimal.md) | The target value for a target portfolio |  [optional]


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum
Name | Value
---- | -----
RISK | &quot;risk&quot;
RETURN | &quot;return&quot;



