# AtomApi::GoalWithdrawalConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**with_start_reference** | **String** | The reference for the starting point of the withdrawal | [optional] [default to &#39;a_end&#39;]
**with_start_period** | **Integer** | The starting period for the withdrawal | [optional] 
**with_end_reference** | **String** | The reference for the ending point of the withdrawal | [optional] [default to &#39;d_end&#39;]
**with_end_period** | **Integer** | The ending point for the withdrawal | [optional] 
**with_amount** | **Float** | The withdrawal amount in today&#39;s dollars | 
**with_frequency** | **String** | The frequency of the withdrawal | [optional] [default to &#39;year&#39;]
**with_inflation** | **Float** | The annualized inflation for the withdrawals | [optional] 


