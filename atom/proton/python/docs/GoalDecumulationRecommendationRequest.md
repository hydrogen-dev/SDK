# GoalDecumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **str** |  | [optional] [default to 'perc']
**goal_id** | **str** |  | [optional] 
**client_id** | **str** |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**remove_outliers** | **bool** |  | [optional] [default to True]
**a_horizon** | **int** |  | [optional] 
**withdrawal_config** | [**list[GoalWithdrawalConfig]**](GoalWithdrawalConfig.md) |  | [optional] 
**p_ret** | **list[float]** |  | 
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**deposit_config** | [**list[DecumulationGoalDepositConfig]**](DecumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **float** |  | [optional] 
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**recommendation_config** | [**RecommendationConfig1**](RecommendationConfig1.md) |  | [optional] 
**create_log** | **bool** |  | [optional] [default to False]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**n** | **int** |  | [optional] [default to 1000]
**d_horizon** | **int** |  | [optional] 
**p_risk** | **list[float]** |  | 
**curr_inv** | **float** |  | [optional] 
**recommend_type** | **str** |  | [optional] [default to 'horizon']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


