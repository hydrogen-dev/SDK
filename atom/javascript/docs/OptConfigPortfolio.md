# atom_api.OptConfigPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **[String]** | List of tickers | 
**minAssets** | **Number** | Minimum number of assets | 
**wConfig** | [**WConfigPortfolio**](WConfigPortfolio.md) |  | 
**wAssetConfig** | **{String: Number}** | Weight constraints for asset classes. | 
**secTypes** | **[String]** | Security types | 
**startDate** | **Date** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**tgtType** | **String** | The target type for a target portfolio | [optional] 
**tgtVal** | **Number** | The target value for a target portfolio | [optional] 
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `return` (value: `"return"`)




