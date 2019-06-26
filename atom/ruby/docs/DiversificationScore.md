# AtomApi::DiversificationScore

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_tickers** | **Array&lt;String&gt;** | List of portfolio tickers | 
**portfolio_weights** | **Array&lt;Float&gt;** | List of portfolio weights | 
**start_date** | **DateTime** |  | [optional] 
**end_date** | **DateTime** |  | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


