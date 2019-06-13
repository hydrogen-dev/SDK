# AtomApi::GoalOptConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **Array&lt;String&gt;** | List of symbols for securities included in the portfolio | 
**min_assets** | **Integer** | Minimum number of portfolio assets, excluding cash | 
**w_config** | [**GoalWeightConfig**](GoalWeightConfig.md) |  | [optional] 
**w_asset_config** | [****](.md) | Weight constraints for asset classes | [optional] 
**sec_types** | **Array&lt;String&gt;** | List of each security&#39;s type | 
**start_date** | **Date** | Start date for historical prices | 
**end_date** | **Date** | End date for historical prices | 


