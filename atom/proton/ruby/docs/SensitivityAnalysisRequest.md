# ProtonApi::SensitivityAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**start_date** | **Date** |  | [optional] 
**portfolio_tickers** | **Array&lt;String&gt;** |  | [optional] 
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**end_date** | **Date** |  | [optional] 
**model_id** | **String** |  | [optional] 
**allocation_id** | **String** |  | [optional] 
**account_id** | **String** |  | [optional] 
**portfolio_id** | **String** |  | [optional] 
**sensitivity_factor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 
**portfolio_weights** | **Array&lt;Float&gt;** |  | [optional] 
**frequency_interval** | **String** |  | 
**aggregation_account_id** | **String** |  | [optional] 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]


