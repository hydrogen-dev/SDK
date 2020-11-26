# GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **string** |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**d_horizon** | **int** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**horizon_frequency** | **string** |  | [optional] [default to 'year']
**client_id** | **string** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to true]
**withdrawal_config** | [**\com\hydrogen\proton\Model\GoalWithdrawalConfig[]**](GoalWithdrawalConfig.md) |  | [optional] 
**a_horizon** | **int** |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**p_ret** | **float[]** |  | 
**thresh_type** | **string** |  | [optional] [default to 'perc']
**thresh** | **float** |  | [optional] 
**deposit_config** | [**\com\hydrogen\proton\Model\DecumulationGoalDepositConfig[]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**recommendation_config** | [**\com\hydrogen\proton\Model\RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**adjust_for_compounding** | **bool** |  | [optional] [default to false]
**p_risk** | **float[]** |  | 
**create_log** | **bool** |  | [optional] [default to false]
**recommend_type** | **string** |  | [optional] [default to 'horizon']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


