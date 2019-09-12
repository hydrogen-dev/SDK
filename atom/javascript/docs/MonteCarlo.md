# atom_api.MonteCarlo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cf** | **[[Number]]** | The cash flows to occur during the simulation | 
**mu** | **[Number]** | The periodic mean portfolio return | 
**sigma** | **[Number]** | The periodic portfolio standard deviation | 
**retMod** | **[Number]** | A periodic return modifier | [optional] 
**initBal** | **Number** | The initial investment at time zero | [optional] 
**n** | **Number** | The number of simulations to run | [optional] 
**removeOutliers** | **Boolean** | If true, remove outlying results | [optional] [default to false]
**resultType** | **String** | The type of simulation results to display in the output | [optional] [default to &#39;raw&#39;]
**p** | **[Number]** | Custom result percentiles | [optional] 
**minBal** | **[Number]** | A lower bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**maxBal** | **[Number]** | An upper bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**minSample** | **[Number]** | A lower bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 
**maxSample** | **[Number]** | An upper bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. | [optional] 


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum


* `raw` (value: `"raw"`)

* `mean` (value: `"mean"`)

* `median` (value: `"median"`)

* `percentiles` (value: `"percentiles"`)

* `custom` (value: `"custom"`)




