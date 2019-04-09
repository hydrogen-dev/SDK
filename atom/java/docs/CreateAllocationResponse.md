
# CreateAllocationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the allocation | 
**category** | **String** | Description of the allocation |  [optional]
**clientId** | [**UUID**](UUID.md) |  |  [optional]
**benchmarkId** | [**UUID**](UUID.md) | The ID for the benchmark that the allocation should be compared to |  [optional]
**inceptionDate** | [**LocalDate**](LocalDate.md) | Date that the allocation first was managed |  [optional]
**nodeMap** | [**List&lt;UUID&gt;**](UUID.md) | List of nodes in a decision tree that map to the allocation |  [optional]
**metadata** | **Object** | Custom information associated with the allocation in the format key:value |  [optional]
**isActive** | **Boolean** | Indicator if this allocation is active. Default is true which indicates it is active |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the allocation |  [optional]
**createDate** | **String** | Datetime the allocation was created |  [optional]



