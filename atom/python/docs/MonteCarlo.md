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

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


