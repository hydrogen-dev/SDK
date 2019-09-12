# WhatIfPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current_portfolio_tickers** | **list[str]** | Tickers of current portfolio holdings | 
**current_portfolio_weights** | **list[float]** | Weights of current portfolio holdings | 
**altered_portfolio_tickers** | **list[str]** | Tickers of altered portfolio holdings | [optional] 
**altered_portfolio_weights** | **list[float]** | Weights of altered portfolio holdings | 
**start_date** | **date** | Start date of portfolio returns for the comparison | [optional] 
**end_date** | **date** | End date of portfolio returns for the comparison | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


