# AtomApi::SpecificAllocationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the allocation | [optional] 
**create_date** | **String** | Datetime the allocation was created | [optional] 
**name** | **String** | Name of the allocation | 
**category** | **String** | Description of the allocation | [optional] 
**client_id** | **String** |  | [optional] 
**benchmark_id** | **String** | The ID for the benchmark that the allocation should be compared to | [optional] 
**inception_date** | **Date** | Date that the allocation first was managed | [optional] 
**node_map** | **Array&lt;Hash&lt;String, String&gt;&gt;** | List of nodes in a decision tree that map to the allocation | [optional] 
**metadata** | **Object** | Custom information associated with the allocation in the format key:value | [optional] 
**is_active** | **BOOLEAN** | Indicator if this allocation is active. Default is true which indicates it is active | [optional] [default to true]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Latest datetime the allocation was updated | [optional] 


