# AtomApi::GoalDecumulationRecommendation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**p_ret** | **Array&lt;Float&gt;** | The annualized portfolio return | 
**p_risk** | **Array&lt;Float&gt;** | The annualized portfolio standard deviation | 
**curr_inv** | **Float** | The current amount invested | 
**a_horizon** | **Integer** | The accumulation goal horizon | 
**d_horizon** | **Integer** | The decumulation goal horizon | 
**horizon_frequency** | **String** | Frequency in relation to the horizon | 
**withdrawal_config** | [**Array&lt;GoalWithdrawalConfig&gt;**](GoalWithdrawalConfig.md) | The withdrawal attributes | 
**deposit_config** | [**Array&lt;GoalDepositConfig&gt;**](GoalDepositConfig.md) | The deposit attributes | [optional] 
**recommendation_config** | [**GoalRecommendationConfigRec**](GoalRecommendationConfigRec.md) |  | [optional] 
**recommend_type** | **String** | The type of recommended action | [optional] [default to &#39;horizon&#39;]
**conf_tgt** | **Float** | The confidence target | [optional] 
**n** | **Integer** | The number of Monte Carlo simulations to run | [optional] 
**remove_outliers** | **BOOLEAN** | If TRUE, remove outlying results | [optional] [default to true]
**thresh_type** | **String** | The goal deviation threshold type | [optional] [default to &#39;perc&#39;]
**thresh** | **Float** | The goal deviation threshold value | [optional] 
**withdrawal_tax** | **Float** | The tax rate for withdrawals | [optional] 
**trading_days_per_year** | **Integer** | Days per year a portfolio trades | [optional] 
**adjust_for_compounding** | **BOOLEAN** | If true, adjust periodic deposit amounts for compounding based on compounding_rate. This applies when a deposit’s dep_frequency is shorter than horizon_frequency. Defaults to false. | [optional] [default to false]
**compounding_rate** | **Float** | The annualized rate to use when approximating a compounding effect on deposits. This value must be defined and adjust_for_compounding must be true in order to activate compounding adjustment. Defaults to 0. | [optional] 


