# AtomApi::MonteCarlo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cf** | **Array&lt;Array&lt;Float&gt;&gt;** | The cash flows to occur during the simulation | 
**mu** | **Array&lt;Float&gt;** | The periodic mean portfolio return | 
**sigma** | **Array&lt;Float&gt;** | The periodic portfolio standard deviation | 
**ret_mod** | **Array&lt;Float&gt;** | A periodic return modifier | [optional] 
**init_bal** | **Integer** | The initial investment at time zero | [optional] 
**n** | **Integer** | The number of simulations to run | [optional] 
**remove_outliers** | **BOOLEAN** | If true, remove outlying results | [optional] [default to false]
**result_type** | **String** | The type of simulation results to display in the output | [optional] [default to &#39;raw&#39;]
**p** | **Array&lt;Float&gt;** | Custom result percentiles | [optional] 
**min_bal** | **Array&lt;Float&gt;** | A lower bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**max_bal** | **Array&lt;Float&gt;** | An upper bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**min_sample** | **Array&lt;Float&gt;** | A lower bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**max_sample** | **Array&lt;Float&gt;** | An upper bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 


