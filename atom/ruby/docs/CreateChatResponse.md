# AtomApi::CreateChatResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chat_log** | **String** | Short description of the subject of the chat | 
**assigned_to** | **String** | The ID of the internal user to whom the chat is assigned | [optional] 
**comments** | **String** | Additional information on the content of the chat | [optional] 
**is_notification** | **BOOLEAN** | Indicates if there is a notification associated with the chat log. Defaults to true or that there is a notification | [optional] [default to true]
**is_open** | **BOOLEAN** | Indicates if the chat is still open. Defaults to true which indicates that the chat is still open | [optional] [default to true]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the chat in the format key:value | [optional] 
**id** | **String** | The ID of the chat log | [optional] 
**create_date** | **String** | Datetime the chat log was created | [optional] 


