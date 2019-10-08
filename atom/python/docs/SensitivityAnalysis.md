# SensitivityAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_tickers** | **list[str]** | A list of symbols for securities in the portfolio | 
**portfolio_weights** | **list[float]** |  | 
**frequency_interval** | **str** | Frequency interval for returns, change_duration, and lag | 
**sensitivity_factor** | [**SensitivityFactor**](SensitivityFactor.md) |  | 
**start_date** | **date** | Start date of data | [optional] 
**end_date** | **date** | End date of data | [optional] 
**trading_days_per_year** | **int** | Number of trading days per year, used in calculations | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


