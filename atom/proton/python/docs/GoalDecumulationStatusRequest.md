# GoalDecumulationStatusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | [optional] 
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**d_horizon** | **int** |  | [optional] 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**thresh_type** | **str** |  | [optional] [default to 'perc']
**recommend_type** | **str** |  | [optional] [default to 'horizon']
**goal_id** | **str** |  | [optional] 
**deposit_config** | **list[object]** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**recommendation_config** | **object** |  | [optional] 
**thresh** | **float** |  | [optional] 
**a_horizon** | **int** |  | [optional] 
**withdrawal_config** | [**list[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**p_ret** | **list[float]** |  | 
**p_risk** | **list[float]** |  | 
**remove_outliers** | **bool** |  | [optional] [default to True]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


