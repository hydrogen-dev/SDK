# ProtonApi::GoalAccumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **String** |  | [optional] 
**curr_inv** | **Float** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**client_id** | **String** |  | [optional] 
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**p_ret** | **Array&lt;Float&gt;** |  | 
**horizon** | **Integer** |  | [optional] 
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**thresh** | **Float** |  | [optional] 
**deposit_config** | [**Array&lt;AccumulationGoalDepositConfig&gt;**](AccumulationGoalDepositConfig.md) |  | [optional] 
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**p_risk** | **Array&lt;Float&gt;** |  | 
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]


