# GoalAccumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh** | **float** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**client_id** | **str** |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**p_ret** | **list[float]** |  | 
**thresh_type** | **str** |  | [optional] [default to 'perc']
**p_risk** | **list[float]** |  | 
**adjust_for_compounding** | **bool** |  | [optional] [default to False]
**remove_outliers** | **bool** |  | [optional] [default to True]
**recommend_type** | **str** |  | [optional] [default to 'horizon']
**recommendation_config** | **object** |  | [optional] 
**goal_id** | **str** |  | [optional] 
**horizon_frequency** | **str** |  | [optional] [default to 'year']
**deposit_config** | **list[object]** |  | [optional] 
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**goal_config** | **object** |  | [optional] 
**horizon** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


