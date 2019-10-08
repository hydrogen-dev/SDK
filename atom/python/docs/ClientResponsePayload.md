# ClientResponsePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answer_id** | **str** | The ID of the answer provided to link the response to a question | 
**answer_value** | **str** | Body of the client’s response | 
**client_id** | **str** | The ID of the client to whom the response belongs | [optional] 
**account_id** | **str** | In the case that the response applies to only one of a client’s accounts and not the client as a whole, the ID of the account to which the response belongs | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the client response in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


