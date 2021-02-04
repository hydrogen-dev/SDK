# ProtonApi::GoalDecumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**goal_id** | **String** |  | [optional] 
**client_id** | **String** |  | [optional] 
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**a_horizon** | **Integer** |  | [optional] 
**withdrawal_config** | [**Array&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) |  | [optional] 
**p_ret** | **Array&lt;Float&gt;** |  | 
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**deposit_config** | [**Array&lt;DecumulationGoalDepositConfig&gt;**](DecumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **Float** |  | [optional] 
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**recommendation_config** | [**RecommendationConfig1**](RecommendationConfig1.md) |  | [optional] 
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**n** | **Integer** |  | [optional] [default to 1000]
**d_horizon** | **Integer** |  | [optional] 
**p_risk** | **Array&lt;Float&gt;** |  | 
**curr_inv** | **Float** |  | [optional] 
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]


