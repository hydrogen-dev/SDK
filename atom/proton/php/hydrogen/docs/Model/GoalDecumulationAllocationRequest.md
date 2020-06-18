# GoalDecumulationAllocationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocations** | **string[]** |  | [optional] 
**client_id** | **string** |  | [optional] 
**adjust_for_compounding** | **bool** |  | [optional] [default to false]
**compounding_rate** | **float** |  | [optional] [default to 0.0]
**horizon_frequency** | **string** |  | [optional] [default to 'year']
**conf_tgt** | **float** |  | [optional] [default to 0.9]
**risk_score** | **float** |  | [optional] 
**market_data_source** | **string** |  | [optional] [default to 'nucleus']
**d_horizon** | **int** |  | [optional] 
**trading_days_per_year** | **int** |  | [optional] [default to 252]
**withdrawal_tax** | **float** |  | [optional] [default to 0.0]
**thresh_type** | **string** |  | [optional] [default to 'perc']
**recommend_type** | **string** |  | [optional] [default to 'horizon']
**goal_id** | **string** |  | [optional] 
**deposit_config** | **object[]** |  | [optional] 
**opt_config** | **object** |  | [optional] 
**n** | **int** |  | [optional] [default to 1000]
**recommendation_config** | **object** |  | [optional] 
**use_proxy_data** | **bool** |  | [optional] [default to false]
**thresh** | **float** |  | [optional] 
**a_horizon** | **int** |  | [optional] 
**withdrawal_config** | [**\com\hydrogen\proton\Model\GoalWithdrawalConfig[]**](GoalWithdrawalConfig.md) |  | [optional] 
**curr_inv** | **float** |  | [optional] 
**remove_outliers** | **bool** |  | [optional] [default to true]
**allocation_priority** | **string** |  | 
**allocation_method** | **string** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


