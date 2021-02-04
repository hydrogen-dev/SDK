# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **str** |  | [optional] 
**result_type** | **str** |  | [optional] [default to 'median']
**inflation_rate** | **float** |  | [optional] [default to 0.0]
**remove_outliers** | **bool** |  | [optional] [default to False]
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**annuitization_rate** | **float** |  | [optional] [default to 0.0]
**end_date** | **str** |  | [optional] 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']
**tax_rate** | **float** |  | [optional] [default to 0.0]
**p** | **float** |  | [optional] 
**allocation_id** | **str** |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to False]
**start_date** | **str** |  | [optional] 
**aggregation_account_id** | **str** |  | [optional] 
**initial_balance** | **float** |  | [optional] [default to 0.0]
**create_log** | **bool** |  | [optional] [default to False]
**decumulation_horizon** | **int** |  | 
**account_id** | **str** |  | [optional] 
**accumulation_horizon** | **int** |  | 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**portfolio_weights** | **list[float]** |  | [optional] 
**guaranteed_accumulation_benefit** | **float** |  | [optional] [default to 0.0]
**portfolio_tickers** | **list[str]** |  | [optional] 
**guaranteed_rate_benefit** | [**list[GuaranteedRateBenefit]**](GuaranteedRateBenefit.md) |  | [optional] 
**model_id** | **str** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**frequency_interval** | **str** |  | [optional] [default to 'year']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


