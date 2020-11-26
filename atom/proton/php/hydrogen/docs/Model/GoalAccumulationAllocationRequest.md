# GoalAccumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**goal_id** | **string** |  | [optional] 
**allocation_method** | **string** |  | 
**curr_inv** | **float** |  | [optional] 
**risk_score** | **float** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**allocation_priority** | **string** |  | 
**horizon_frequency** | **string** |  | [optional] [default to 'year']
**allocations** | **string[]** |  | [optional] 
**client_id** | **string** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to true]
**use_proxy_data** | **bool** |  | [optional] [default to false]
**goal_config** | [**\com\hydrogen\proton\Model\GoalConfig**](GoalConfig.md) |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**horizon** | **int** |  | [optional] 
**thresh_type** | **string** |  | [optional] [default to 'perc']
**thresh** | **float** |  | [optional] 
**deposit_config** | [**\com\hydrogen\proton\Model\AccumulationGoalDepositConfig[]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**market_data_source** | **string** |  | [optional] [default to 'nucleus']
**recommendation_config** | [**\com\hydrogen\proton\Model\RecommendationConfig**](RecommendationConfig.md) |  | [optional] 
**opt_config** | [**\com\hydrogen\proton\Model\OptConfig**](OptConfig.md) |  | [optional] 
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to false]
**create_log** | **bool** |  | [optional] [default to false]
**recommend_type** | **string** |  | [optional] [default to 'horizon']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


