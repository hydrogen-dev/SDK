# ProtonApi::GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**goal_id** | **String** |  | [optional] 
**client_id** | **String** |  | [optional] 
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**risk_score** | **Float** |  | [optional] 
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**allocation_priority** | **String** |  | 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**opt_config** | [**OptConfig**](OptConfig.md) |  | [optional] 
**deposit_config** | [**Array&lt;AccumulationGoalDepositConfig&gt;**](AccumulationGoalDepositConfig.md) |  | [optional] 
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**thresh** | **Float** |  | [optional] 
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**allocations** | **Array&lt;String&gt;** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**horizon** | **Integer** |  | [optional] 
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]
**curr_inv** | **Float** |  | [optional] 
**allocation_method** | **String** |  | 


