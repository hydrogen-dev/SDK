# atom_api.GoalAllocationSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ret** | **Number** | The portfolio annualized return. | 
**risk** | **Number** | The portfolio annualized standard deviation. | 
**assets** | **[String]** | The securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**weights** | **[Number]** | The weights for each of the securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**identifier** | **String** | The allocation’s id, returned if allocation_method &#x3D; select. | [optional] 


