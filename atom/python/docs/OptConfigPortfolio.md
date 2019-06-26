# OptConfigPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **list[str]** | List of tickers | 
**min_assets** | **int** | Minimum number of assets | 
**w_config** | [**WConfigPortfolio**](WConfigPortfolio.md) |  | 
**w_asset_config** | **dict(str, float)** | Weight constraints for asset classes. | 
**sec_types** | **list[str]** | Security types | 
**start_date** | **datetime** |  | [optional] 
**end_date** | **datetime** |  | [optional] 
**tgt_type** | **str** | The target type for a target portfolio | [optional] 
**tgt_val** | **float** | The target value for a target portfolio | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


