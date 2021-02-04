# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **str** |  | [optional] [default to 'perc']
**goal_id** | **str** |  | [optional] 
**client_id** | **str** |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**risk_score** | **float** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to True]
**allocation_priority** | **str** |  | 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**opt_config** | [**OptConfig**](OptConfig.md) |  | [optional] 
**deposit_config** | [**list[AccumulationGoalDepositConfig]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to False]
**thresh** | **float** |  | [optional] 
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**recommendation_config** | [**RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**create_log** | **bool** |  | [optional] [default to False]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | [optional] 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**allocations** | **list[str]** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**horizon** | **int** |  | [optional] 
**recommend_type** | **str** |  | [optional] [default to 'horizon']
**curr_inv** | **float** |  | [optional] 
**allocation_method** | **str** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


