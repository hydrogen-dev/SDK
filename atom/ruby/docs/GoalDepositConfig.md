# AtomApi::GoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dep_start_reference** | **String** | The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start. | [optional] [default to &#39;a_start&#39;]
**dep_start_period** | **Integer** | The starting period for the deposit | [optional] 
**dep_end_reference** | **String** | The reference for the ending point of the deposit | [optional] [default to &#39;a_end&#39;]
**dep_end_period** | **Integer** | The ending point for the deposit | [optional] 
**dep_amount** | **Float** | The deposit amount in present dollars | [optional] 
**dep_frequency** | **String** | The frequency of the deposit | [optional] [default to &#39;year&#39;]
**dep_inflation** | **Float** | The annualized inflation for the deposits | [optional] 


