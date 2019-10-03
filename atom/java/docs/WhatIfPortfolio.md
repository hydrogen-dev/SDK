
# WhatIfPortfolio

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentPortfolioTickers** | **List&lt;String&gt;** | Tickers of current portfolio holdings | 
**currentPortfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Weights of current portfolio holdings | 
**alteredPortfolioTickers** | **List&lt;String&gt;** | Tickers of altered portfolio holdings |  [optional]
**alteredPortfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Weights of altered portfolio holdings | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date of portfolio returns for the comparison |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date of portfolio returns for the comparison |  [optional]
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. |  [optional]



