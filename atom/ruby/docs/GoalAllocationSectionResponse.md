# AtomApi::GoalAllocationSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ret** | **Float** | The portfolio annualized return. | 
**risk** | **Float** | The portfolio annualized standard deviation. | 
**assets** | **Array&lt;String&gt;** | The securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**weights** | **Array&lt;Float&gt;** | The weights for each of the securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**identifier** | **String** | The allocation’s id, returned if allocation_method &#x3D; select. | [optional] 


