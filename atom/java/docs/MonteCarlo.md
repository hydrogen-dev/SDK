
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


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
RAW | &quot;raw&quot;
MEAN | &quot;mean&quot;
MEDIAN | &quot;median&quot;
PERCENTILES | &quot;percentiles&quot;
CUSTOM | &quot;custom&quot;



