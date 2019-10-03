# SpecificModelResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the model | [optional] 
**create_date** | **str** | Datetime the model was created | [optional] 
**name** | **str** | Name of the model usually used to indicate what is included in the model | 
**category** | **str** | Category that the model falls under such as “Tech” | [optional] 
**description** | **str** | Description of what types of investments are represented in the model | [optional] 
**client_id** | **str** | If the model is to be used by a specific client such as an advisor, the ID of the client | [optional] 
**node_map** | **list[str]** |  | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the model, limited to 3 characters | [optional] 
**is_active** | **bool** | Indicates for whether or not the model is active. Defaults to true which indicates that it is currently active | [optional] [default to True]
**metadata** | **object** | Custom information associated with the model in the format key:value. | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the model was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


