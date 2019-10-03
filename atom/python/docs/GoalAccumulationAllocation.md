# GoalAccumulationAllocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation_method** | **str** | The allocation universe source, either create or select | 
**allocation_priority** | **str** | Priority when allocating, either risk or goal | 
**opt_config** | [**GoalOptConfig**](GoalOptConfig.md) |  | [optional] 
**allocations** | **list[str]** |  | [optional] 
**curr_inv** | **float** | The current amount invested | 
**horizon** | **int** | The accumulation goal horizon | 
**horizon_frequency** | **str** | Frequency in relation to the horizon | 
**goal_config** | [**GoalConfig**](GoalConfig.md) |  | 
**deposit_config** | [**list[GoalDepositConfig]**](GoalDepositConfig.md) | The deposit attributes | [optional] 
**recommendation_config** | [**GoalRecommendationConfigStatus**](GoalRecommendationConfigStatus.md) |  | [optional] 
**recommend_type** | **str** | The type of recommended action | [optional] [default to 'horizon']
**conf_tgt** | **float** | The confidence target | [optional] 
**n** | **int** | The number of Monte Carlo simulations to run | [optional] 
**remove_outliers** | **bool** | If TRUE, remove outlying results | [optional] [default to True]
**thresh_type** | **str** | The goal deviation threshold type | [optional] [default to 'perc']
**thresh** | **float** | The goal deviation threshold value | [optional] 
**withdrawal_tax** | **float** | The tax rate for withdrawals | [optional] 
**trading_days_per_year** | **int** | Days per year a portfolio trades | [optional] 
**risk_score** | **int** | The investor&#39;s risk score | [optional] 
**adjust_for_compounding** | **bool** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. | [optional] [default to False]
**compounding_rate** | **float** | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


