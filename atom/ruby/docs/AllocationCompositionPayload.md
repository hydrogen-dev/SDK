# AtomApi::AllocationCompositionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation_id** | **String** | The ID of the allocation for which you are adding a composition record | 
**model_id** | **String** | The ID of the model that is assigned to the allocation | 
**current_weight** | **Float** | The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**strategic_weight** | **Float** | The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**date** | **Date** | The date for this allocation composition record | 
**core** | **BOOLEAN** | Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model | [optional] [default to false]
**metadata** | **Object** | Custom information associated with the allocation composition in the format key:value | [optional] 


