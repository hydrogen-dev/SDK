# ProtonApi::GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **String** |  | [optional] 
**allocation_method** | **String** |  | 
**curr_inv** | **Float** |  | [optional] 
**risk_score** | **Float** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**allocation_priority** | **String** |  | 
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**allocations** | **Array&lt;String&gt;** |  | [optional] 
**client_id** | **String** |  | [optional] 
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**use_proxy_data** | **BOOLEAN** |  | [optional] [default to false]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**horizon** | **Integer** |  | [optional] 
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**thresh** | **Float** |  | [optional] 
**deposit_config** | [**Array&lt;AccumulationGoalDepositConfig&gt;**](AccumulationGoalDepositConfig.md) |  | [optional] 
**market_data_source** | **String** |  | [optional] [default to &#39;nucleus&#39;]
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**opt_config** | [**OptConfig**](OptConfig.md) |  | [optional] 
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]


