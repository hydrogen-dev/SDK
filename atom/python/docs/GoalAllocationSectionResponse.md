# GoalAllocationSectionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ret** | **float** | The portfolio annualized return. | 
**risk** | **float** | The portfolio annualized standard deviation. | 
**assets** | **list[str]** | The securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**weights** | **list[float]** | The weights for each of the securities in the created portfolio, returned if allocation_method &#x3D; create. | [optional] 
**identifier** | **str** | The allocation’s id, returned if allocation_method &#x3D; select. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


