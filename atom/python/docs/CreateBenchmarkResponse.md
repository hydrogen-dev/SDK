# CreateBenchmarkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the benchmark | 
**composition** | [**list[BenchmarkPayloadComposition]**](BenchmarkPayloadComposition.md) |  | [optional] 
**description** | **str** | Description of the benchmark such as the market segment that it represents | [optional] 
**client_id** | **str** | The ID of the client to which the benchmark belongs, if any | [optional] 
**is_active** | **bool** | Indicates if the benchmark is active. Defaults to true which means it is active | [optional] [default to True]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the benchmark record | [optional] 
**create_date** | **str** | Datetime the benchmark was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


