# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **str** |  | [optional] 
**allocation_method** | **str** |  | 
**curr_inv** | **float** |  | [optional] 
**risk_score** | **float** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**allocation_priority** | **str** |  | 
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**allocations** | **list[str]** |  | [optional] 
**client_id** | **str** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to True]
**use_proxy_data** | **bool** |  | [optional] [default to False]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**horizon** | **int** |  | [optional] 
**thresh_type** | **str** |  | [optional] [default to 'perc']
**thresh** | **float** |  | [optional] 
**deposit_config** | [**list[AccumulationGoalDepositConfig]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**opt_config** | [**OptConfig**](OptConfig.md) |  | [optional] 
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**create_log** | **bool** |  | [optional] [default to False]
**recommend_type** | **str** |  | [optional] [default to 'horizon']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


