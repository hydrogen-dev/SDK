# GoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dep_start_reference** | **str** | The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start. | [optional] [default to 'a_start']
**dep_start_period** | **int** | The starting period for the deposit | [optional] 
**dep_end_reference** | **str** | The reference for the ending point of the deposit | [optional] [default to 'a_end']
**dep_end_period** | **int** | The ending point for the deposit | [optional] 
**dep_amount** | **float** | The deposit amount in present dollars | [optional] 
**dep_frequency** | **str** | The frequency of the deposit | [optional] [default to 'year']
**dep_inflation** | **float** | The annualized inflation for the deposits | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


