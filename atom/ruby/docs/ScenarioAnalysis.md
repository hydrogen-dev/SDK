# AtomApi::ScenarioAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_tickers** | **Array&lt;String&gt;** | A list of symbols for securities in the portfolio | 
**portfolio_weights** | **Array&lt;Float&gt;** |  | 
**frequency_interval** | **String** | Frequency interval for returns, change_duration, and lag | 
**scenario** | [**Array&lt;SensitivityFactor&gt;**](SensitivityFactor.md) |  | 
**start_date** | **Date** | Start date of data | [optional] 
**end_date** | **Date** | End date of data | [optional] 
**trading_days_per_year** | **Integer** | Number of trading days per year, used in calculations | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


