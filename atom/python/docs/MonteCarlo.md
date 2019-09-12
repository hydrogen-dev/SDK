# MonteCarlo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cf** | **list[list[float]]** | The cash flows to occur during the simulation | 
**mu** | **list[float]** | The periodic mean portfolio return | 
**sigma** | **list[float]** | The periodic portfolio standard deviation | 
**ret_mod** | **list[float]** | A periodic return modifier | [optional] 
**init_bal** | **int** | The initial investment at time zero | [optional] 
**n** | **int** | The number of simulations to run | [optional] 
**remove_outliers** | **bool** | If true, remove outlying results | [optional] [default to False]
**result_type** | **str** | The type of simulation results to display in the output | [optional] [default to 'raw']
**p** | **list[float]** | Custom result percentiles | [optional] 
**min_bal** | **list[float]** | A lower bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**max_bal** | **list[float]** | An upper bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**min_sample** | **list[float]** | A lower bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**max_sample** | **list[float]** | An upper bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


