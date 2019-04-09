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


