# AtomApi::WhatIfPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_portfolio_tickers** | **Array&lt;String&gt;** | Tickers of current portfolio holdings | 
**current_portfolio_weights** | **Array&lt;Float&gt;** | Weights of current portfolio holdings | 
**altered_portfolio_tickers** | **Array&lt;String&gt;** | Tickers of altered portfolio holdings | [optional] 
**altered_portfolio_weights** | **Array&lt;Float&gt;** | Weights of altered portfolio holdings | 
**start_date** | **Date** | Start date of portfolio returns for the comparison | [optional] 
**end_date** | **Date** | End date of portfolio returns for the comparison | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


