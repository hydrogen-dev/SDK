# ProtonApi::GoalAccumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**goal_id** | **String** |  | [optional] 
**client_id** | **String** |  | [optional] 
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**p_ret** | **Array&lt;Float&gt;** |  | 
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**deposit_config** | [**Array&lt;AccumulationGoalDepositConfig&gt;**](AccumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **Float** |  | [optional] 
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**n** | **Integer** |  | [optional] [default to 1000]
**p_risk** | **Array&lt;Float&gt;** |  | 
**horizon** | **Integer** |  | [optional] 
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]
**curr_inv** | **Float** |  | [optional] 


