# atom_api.AllocationPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the allocation | 
**category** | **String** | Description of the allocation | [optional] 
**clientId** | **String** |  | [optional] 
**benchmarkId** | **String** | The ID for the benchmark that the allocation should be compared to | [optional] 
**inceptionDate** | **Date** | Date that the allocation first was managed | [optional] 
**nodeMap** | **[{String: String}]** | List of nodes in a decision tree that map to the allocation | [optional] 
**metadata** | **Object** | Custom information associated with the allocation in the format key:value | [optional] 
**isActive** | **Boolean** | Indicator if this allocation is active. Default is true which indicates it is active | [optional] [default to true]
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


