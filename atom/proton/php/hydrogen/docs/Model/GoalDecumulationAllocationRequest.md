# GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **string** |  | [optional] [default to 'perc']
**goal_id** | **string** |  | [optional] 
**client_id** | **string** |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**risk_score** | **float** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to true]
**allocation_priority** | **string** |  | 
**a_horizon** | **int** |  | [optional] 
**withdrawal_config** | [**\com\hydrogen\proton\Model\GoalWithdrawalConfig[]**](GoalWithdrawalConfig.md) |  | [optional] 
**market_data_source** | **string** |  | [optional] [default to 'nucleus']
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to false]
**opt_config** | [**\com\hydrogen\proton\Model\OptConfig**](OptConfig.md) |  | [optional] 
**deposit_config** | [**\com\hydrogen\proton\Model\DecumulationGoalDepositConfig[]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to false]
**thresh** | **float** |  | [optional] 
**horizon_frequency** | **string** |  | [optional] [default to 'year']
**recommendation_config** | [**\com\hydrogen\proton\Model\RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**create_log** | **bool** |  | [optional] [default to false]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**allocations** | **string[]** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**d_horizon** | **int** |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**recommend_type** | **string** |  | [optional] [default to 'horizon']
**allocation_method** | **string** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


