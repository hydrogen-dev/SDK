# GoalOptConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **list[str]** | List of symbols for securities included in the portfolio | 
**min_assets** | **int** | Minimum number of portfolio assets, excluding cash | 
**w_config** | [**GoalWeightConfig**](GoalWeightConfig.md) |  | [optional] 
**w_asset_config** | **dict(str, float)** | Weight constraints for asset classes | [optional] 
**sec_types** | **list[str]** | List of each security&#39;s type | 
**start_date** | **date** | Start date for historical prices | 
**end_date** | **date** | End date for historical prices | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


