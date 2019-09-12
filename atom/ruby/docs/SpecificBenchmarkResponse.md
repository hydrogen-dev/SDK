# AtomApi::SpecificBenchmarkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the benchmark | 
**composition** | [**Array&lt;BenchmarkPayloadComposition&gt;**](BenchmarkPayloadComposition.md) |  | [optional] 
**description** | **String** | Description of the benchmark such as the market segment that it represents | [optional] 
**client_id** | **String** | The ID of the client to which the benchmark belongs, if any | [optional] 
**is_active** | **BOOLEAN** | Indicates if the benchmark is active. Defaults to true which means it is active | [optional] [default to true]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the benchmark record | [optional] 
**create_date** | **String** | Datetime the benchmark was created | [optional] 
**update_date** | **String** | Latest datetime the benchmark was updated | [optional] 


