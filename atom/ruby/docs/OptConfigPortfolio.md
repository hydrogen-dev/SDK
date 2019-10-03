# AtomApi::OptConfigPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tickers** | **Array&lt;String&gt;** | List of tickers | 
**min_assets** | **Integer** | Minimum number of assets | 
**w_config** | [**WConfigPortfolio**](WConfigPortfolio.md) |  | 
**w_asset_config** | **Hash&lt;String, Float&gt;** | Weight constraints for asset classes. | 
**sec_types** | **Array&lt;String&gt;** | Security types | 
**start_date** | **DateTime** |  | [optional] 
**end_date** | **DateTime** |  | [optional] 
**tgt_type** | **String** | The target type for a target portfolio | [optional] 
**tgt_val** | **Float** | The target value for a target portfolio | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


