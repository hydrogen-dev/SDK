# atom_api.GoalOptConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **[String]** | List of symbols for securities included in the portfolio | 
**minAssets** | **Number** | Minimum number of portfolio assets, excluding cash | 
**wConfig** | [**GoalWeightConfig**](GoalWeightConfig.md) |  | [optional] 
**wAssetConfig** | [**ERRORUNKNOWN**](ERRORUNKNOWN.md) | Weight constraints for asset classes | [optional] 
**secTypes** | **[String]** | List of each security&#39;s type | 
**startDate** | **Date** | Start date for historical prices | 
**endDate** | **Date** | End date for historical prices | 


<a name="[SecTypesEnum]"></a>
## Enum: [SecTypesEnum]


* `major` (value: `"major"`)

* `minor` (value: `"minor"`)

* `Cash` (value: `"Cash"`)




