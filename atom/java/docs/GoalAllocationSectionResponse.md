
# GoalAllocationSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ret** | [**BigDecimal**](BigDecimal.md) | The portfolio annualized return. | 
**risk** | [**BigDecimal**](BigDecimal.md) | The portfolio annualized standard deviation. | 
**assets** | **List&lt;String&gt;** | The securities in the created portfolio, returned if allocation_method &#x3D; create. |  [optional]
**weights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The weights for each of the securities in the created portfolio, returned if allocation_method &#x3D; create. |  [optional]
**identifier** | **String** | The allocation’s id, returned if allocation_method &#x3D; select. |  [optional]



