# ScenarioAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**use_proxy_data** | **bool** |  | [optional] [default to False]
**start_date** | **date** |  | [optional] 
**portfolio_tickers** | **list[str]** |  | [optional] 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**end_date** | **date** |  | [optional] 
**model_id** | **str** |  | [optional] 
**allocation_id** | **str** |  | [optional] 
**account_id** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**portfolio_weights** | **list[float]** |  | [optional] 
**frequency_interval** | **str** |  | 
**scenario** | [**list[SensitivityFactor]**](SensitivityFactor.md) |  | 
**aggregation_account_id** | **str** |  | [optional] 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


