# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guaranteed_accumulation_benefit** | **float** |  | [optional] [default to 0.0]
**p** | **float** |  | [optional] 
**aggregation_account_id** | **str** |  | [optional] 
**allocation_id** | **str** |  | [optional] 
**portfolio_weights** | **list[float]** |  | [optional] 
**end_date** | **str** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**account_id** | **str** |  | [optional] 
**portfolio_tickers** | **list[str]** |  | [optional] 
**initial_balance** | **float** |  | [optional] [default to 0.0]
**remove_outliers** | **bool** |  | [optional] [default to False]
**model_id** | **str** |  | [optional] 
**guaranteed_rate_benefit** | [**list[GuaranteedRateBenefit]**](GuaranteedRateBenefit.md) |  | [optional] 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to False]
**accumulation_horizon** | **int** |  | 
**inflation_rate** | **float** |  | [optional] [default to 0.0]
**annuitization_rate** | **float** |  | [optional] [default to 0.0]
**result_type** | **str** |  | [optional] [default to 'median']
**start_date** | **str** |  | [optional] 
**portfolio_id** | **str** |  | [optional] 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**frequency_interval** | **str** |  | [optional] [default to 'year']
**create_log** | **bool** |  | [optional] [default to False]
**decumulation_horizon** | **int** |  | 
**tax_rate** | **float** |  | [optional] [default to 0.0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


