
# CreateAllocationCompositionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationId** | [**UUID**](UUID.md) | The ID of the allocation for which you are adding a composition record | 
**modelId** | [**UUID**](UUID.md) | The ID of the model that is assigned to the allocation | 
**currentWeight** | **Double** | The current weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The current weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**strategicWeight** | **Double** | The strategic weight of the model as a percentage of the allocation’s total value; ex. 20 representing 20%. The strategic weights of all the models must add up to 100. If the model is the only one, enter 100 | 
**date** | [**LocalDate**](LocalDate.md) | The date for this allocation composition record | 
**core** | **Boolean** | Indicator if the model_id is a core model for core-satellite investing. Defaults to false which means it is not a core model |  [optional]
**id** | [**UUID**](UUID.md) | ID of the allocation composition |  [optional]
**createDate** | **String** | Datetime the allocation composition was created |  [optional]



