# ChatPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chat_log** | **str** | Short description of the subject of the chat | 
**assigned_to** | **str** | The ID of the internal user to whom the chat is assigned | [optional] 
**comments** | **str** | Additional information on the content of the chat | [optional] 
**is_notification** | **bool** | Indicates if there is a notification associated with the chat log. Defaults to true or that there is a notification | [optional] [default to True]
**is_open** | **bool** | Indicates if the chat is still open. Defaults to true which indicates that the chat is still open | [optional] [default to True]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the chat in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


