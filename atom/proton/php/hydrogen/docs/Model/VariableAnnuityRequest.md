# VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **string** |  | [optional] 
**result_type** | **string** |  | [optional] [default to 'median']
**inflation_rate** | **float** |  | [optional] [default to 0.0]
**remove_outliers** | **bool** |  | [optional] [default to false]
**deposit_schedule** | [**\com\hydrogen\proton\Model\AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**annuitization_rate** | **float** |  | [optional] [default to 0.0]
**end_date** | **string** |  | [optional] 
**market_data_source** | **string** |  | [optional] [default to 'nucleus']
**tax_rate** | **float** |  | [optional] [default to 0.0]
**p** | **float** |  | [optional] 
**allocation_id** | **string** |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to false]
**start_date** | **string** |  | [optional] 
**aggregation_account_id** | **string** |  | [optional] 
**initial_balance** | **float** |  | [optional] [default to 0.0]
**create_log** | **bool** |  | [optional] [default to false]
**decumulation_horizon** | **int** |  | 
**account_id** | **string** |  | [optional] 
**accumulation_horizon** | **int** |  | 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**portfolio_weights** | **float[]** |  | [optional] 
**guaranteed_accumulation_benefit** | **float** |  | [optional] [default to 0.0]
**portfolio_tickers** | **string[]** |  | [optional] 
**guaranteed_rate_benefit** | [**\com\hydrogen\proton\Model\GuaranteedRateBenefit[]**](GuaranteedRateBenefit.md) |  | [optional] 
**model_id** | **string** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**frequency_interval** | **string** |  | [optional] [default to 'year']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


