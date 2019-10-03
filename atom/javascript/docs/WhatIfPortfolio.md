# atom_api.WhatIfPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentPortfolioTickers** | **[String]** | Tickers of current portfolio holdings | 
**currentPortfolioWeights** | **[Number]** | Weights of current portfolio holdings | 
**alteredPortfolioTickers** | **[String]** | Tickers of altered portfolio holdings | [optional] 
**alteredPortfolioWeights** | **[Number]** | Weights of altered portfolio holdings | 
**startDate** | **Date** | Start date of portfolio returns for the comparison | [optional] 
**endDate** | **Date** | End date of portfolio returns for the comparison | [optional] 
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


