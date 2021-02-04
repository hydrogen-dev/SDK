# ProtonApi::VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **String** |  | [optional] 
**result_type** | **String** |  | [optional] [default to &#39;median&#39;]
**inflation_rate** | **Float** |  | [optional] [default to 0.0]
**remove_outliers** | **BOOLEAN** |  | [optional] [default to false]
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**annuitization_rate** | **Float** |  | [optional] [default to 0.0]
**end_date** | **String** |  | [optional] 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]
**tax_rate** | **Float** |  | [optional] [default to 0.0]
**p** | **Float** |  | [optional] 
**allocation_id** | **String** |  | [optional] 
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**start_date** | **String** |  | [optional] 
**aggregation_account_id** | **String** |  | [optional] 
**initial_balance** | **Float** |  | [optional] [default to 0.0]
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**decumulation_horizon** | **Integer** |  | 
**account_id** | **String** |  | [optional] 
**accumulation_horizon** | **Integer** |  | 
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**portfolio_weights** | **Array&lt;Float&gt;** |  | [optional] 
**guaranteed_accumulation_benefit** | **Float** |  | [optional] [default to 0.0]
**portfolio_tickers** | **Array&lt;String&gt;** |  | [optional] 
**guaranteed_rate_benefit** | [**Array&lt;GuaranteedRateBenefit&gt;**](GuaranteedRateBenefit.md) |  | [optional] 
**model_id** | **String** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**frequency_interval** | **String** |  | [optional] [default to &#39;year&#39;]


