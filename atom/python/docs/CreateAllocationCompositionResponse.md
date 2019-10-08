# CreateAllocationCompositionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation_id** | **str** | The ID of the allocation for which you are adding a composition record | 
**model_id** | **str** | The ID of the model that is assigned to the allocation | 
**current_weight** | **float** | The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**strategic_weight** | **float** | The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**_date** | **date** | The date for this allocation composition record | 
**core** | **bool** | Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model | [optional] [default to False]
**metadata** | **object** | Custom information associated with the allocation composition in the format key:value | [optional] 
**id** | **str** | ID of the allocation composition | [optional] 
**create_date** | **str** | Datetime the allocation composition was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


