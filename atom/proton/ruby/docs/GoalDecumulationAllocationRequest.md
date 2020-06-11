# ProtonApi::GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | **Array&lt;String&gt;** |  | [optional] 
**client_id** | **String** |  | [optional] 
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**risk_score** | **Float** |  | [optional] 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]
**d_horizon** | **Integer** |  | [optional] 
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]
**goal_id** | **String** |  | [optional] 
**deposit_config** | **Array&lt;Object&gt;** |  | [optional] 
**opt_config** | **Object** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**recommendation_config** | **Object** |  | [optional] 
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**thresh** | **Float** |  | [optional] 
**a_horizon** | **Integer** |  | [optional] 
**withdrawal_config** | [**Array&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  | [optional] 
**curr_inv** | **Float** |  | [optional] 
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**allocation_priority** | **String** |  | 
**allocation_method** | **String** |  | 


