# GoalAccumulationRecommendationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**thresh_type** | **string** |  | [optional] [default to 'perc']
**goal_id** | **string** |  | [optional] 
**client_id** | **string** |  | [optional] 
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**remove_outliers** | **bool** |  | [optional] [default to true]
**p_ret** | **float[]** |  | 
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**adjust_for_compounding** | **bool** |  | [optional] [default to false]
**deposit_config** | [**\com\hydrogen\proton\Model\AccumulationGoalDepositConfig[]**](AccumulationGoalDepositConfig.md) |  | [optional] 
**thresh** | **float** |  | [optional] 
**horizon_frequency** | **string** |  | [optional] [default to 'year']
**recommendation_config** | [**\com\hydrogen\proton\Model\RecommendationConfig1**](RecommendationConfig1.md) |  | [optional] 
**create_log** | **bool** |  | [optional] [default to false]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**goal_config** | [**\com\hydrogen\proton\Model\GoalConfig**](GoalConfig.md) |  | [optional] 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**n** | **int** |  | [optional] [default to 1000]
**p_risk** | **float[]** |  | 
**horizon** | **int** |  | [optional] 
**recommend_type** | **string** |  | [optional] [default to 'horizon']
**curr_inv** | **float** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


