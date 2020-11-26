# ProtonApi::VariableAnnuityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**guaranteed_accumulation_benefit** | **Float** |  | [optional] [default to 0.0]
**p** | **Float** |  | [optional] 
**aggregation_account_id** | **String** |  | [optional] 
**allocation_id** | **String** |  | [optional] 
**portfolio_weights** | **Array&lt;Float&gt;** |  | [optional] 
**end_date** | **String** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**account_id** | **String** |  | [optional] 
**portfolio_tickers** | **Array&lt;String&gt;** |  | [optional] 
**initial_balance** | **Float** |  | [optional] [default to 0.0]
**remove_outliers** | **BOOLEAN** |  | [optional] [default to false]
**model_id** | **String** |  | [optional] 
**guaranteed_rate_benefit** | [**Array&lt;GuaranteedRateBenefit&gt;**](GuaranteedRateBenefit.md) |  | [optional] 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**accumulation_horizon** | **Integer** |  | 
**inflation_rate** | **Float** |  | [optional] [default to 0.0]
**annuitization_rate** | **Float** |  | [optional] [default to 0.0]
**result_type** | **String** |  | [optional] [default to &#39;median&#39;]
**start_date** | **String** |  | [optional] 
**portfolio_id** | **String** |  | [optional] 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**frequency_interval** | **String** |  | [optional] [default to &#39;year&#39;]
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**decumulation_horizon** | **Integer** |  | 
**tax_rate** | **Float** |  | [optional] [default to 0.0]


