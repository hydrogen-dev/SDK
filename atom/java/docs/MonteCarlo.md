
# MonteCarlo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cf** | [**List&lt;List&lt;BigDecimal&gt;&gt;**](List.md) | The cash flows to occur during the simulation | 
**mu** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The periodic mean portfolio return | 
**sigma** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The periodic portfolio standard deviation | 
**retMod** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | A periodic return modifier |  [optional]
**initBal** | **Integer** | The initial investment at time zero |  [optional]
**n** | **Integer** | The number of simulations to run |  [optional]
**removeOutliers** | **Boolean** | If true, remove outlying results |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) | The type of simulation results to display in the output |  [optional]
**p** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Custom result percentiles |  [optional]
**minBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | A lower bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. |  [optional]
**maxBal** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | An upper bound to enforce on the periodic balance. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. |  [optional]
**minSample** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | A lower bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. |  [optional]
**maxSample** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | An upper bound to enforce on the randomly sampled periodic return. Each item in the array corresponds to a period in the simulation. If the length of the array is less than the number of simulation periods, it is conformed to the appropriate length by persisting the final value in the array. |  [optional]


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
RAW | &quot;raw&quot;
MEAN | &quot;mean&quot;
MEDIAN | &quot;median&quot;
PERCENTILES | &quot;percentiles&quot;
CUSTOM | &quot;custom&quot;



