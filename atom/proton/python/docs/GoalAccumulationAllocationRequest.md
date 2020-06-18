# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | **list[str]** |  | [optional] 
**client_id** | **str** |  | [optional] 
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**risk_score** | **float** |  | [optional] 
**market_data_source** | **str** |  | [optional] [default to 'nucleus']
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**thresh_type** | **str** |  | [optional] [default to 'perc']
**recommend_type** | **str** |  | [optional] [default to 'horizon']
**goal_id** | **str** |  | [optional] 
**deposit_config** | **list[object]** |  | [optional] 
**opt_config** | **object** |  | [optional] 
**goal_config** | **object** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**recommendation_config** | **object** |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to False]
**thresh** | **float** |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to True]
**allocation_priority** | **str** |  | 
**allocation_method** | **str** |  | 
**horizon** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


