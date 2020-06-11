# ProtonApi::GoalAccumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh** | **Float** |  | [optional] 
**n** | **Integer** |  | [optional] [default to 1000]
**trading_days_per_year** | **Integer** |  | [optional] [default to 252]
**conf_tgt** | **Float** |  | [optional] [default to 0.9]
**client_id** | **String** |  | [optional] 
**curr_inv** | **Float** |  | [optional] 
**withdrawal_tax** | **Float** |  | [optional] [default to 0.0]
**p_ret** | **Array&lt;Float&gt;** |  | 
**thresh_type** | **String** |  | [optional] [default to &#39;perc&#39;]
**p_risk** | **Array&lt;Float&gt;** |  | 
**adjust_for_compounding** | **BOOLEAN** |  | [optional] [default to false]
**remove_outliers** | **BOOLEAN** |  | [optional] [default to true]
**recommend_type** | **String** |  | [optional] [default to &#39;horizon&#39;]
**recommendation_config** | **Object** |  | [optional] 
**goal_id** | **String** |  | [optional] 
**horizon_frequency** | **String** |  | [optional] [default to &#39;year&#39;]
**deposit_config** | **Array&lt;Object&gt;** |  | [optional] 
**compounding_rate** | **Float** |  | [optional] [default to 0.0]
**goal_config** | **Object** |  | [optional] 
**horizon** | **Integer** |  | [optional] 


