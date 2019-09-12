
# SpecificChatResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | The ID of the chat log |  [optional]
**createDate** | **String** | Datetime the chat log was created |  [optional]
**chatLog** | **String** | Short description of the subject of the chat | 
**assignedTo** | [**UUID**](UUID.md) | The ID of the internal user to whom the chat is assigned |  [optional]
**comments** | **String** | Additional information on the content of the chat |  [optional]
**isNotification** | **Boolean** | Indicates if there is a notification associated with the chat log. Defaults to true or that there is a notification |  [optional]
**isOpen** | **Boolean** | Indicates if the chat is still open. Defaults to true which indicates that the chat is still open |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the chat in the format key:value |  [optional]
**updateDate** | **String** | Datetime the chat log was last updated |  [optional]



