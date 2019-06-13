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


<a name="TgtTypeEnum"></a>
## Enum: TgtTypeEnum


* `risk` (value: `"risk"`)

* `return` (value: `"return"`)




