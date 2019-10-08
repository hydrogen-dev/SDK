
# SupportTicketCommentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supportTicketId** | [**UUID**](UUID.md) | The ID of the support ticket to which the comment belongs | 
**description** | **String** | Details and description of the information included in the support ticket comment |  [optional]
**hasAttachment** | **Boolean** | Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment |  [optional]
**isAdmin** | **Boolean** | Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator |  [optional]
**isRead** | **Boolean** | Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read |  [optional]
**metadata** | **Object** | Custom information associated with the support ticket comment in the format key:value |  [optional]
**supportTicketDocument** | [**List&lt;SupportTicketCommentPayloadSupportTicketDocument&gt;**](SupportTicketCommentPayloadSupportTicketDocument.md) |  |  [optional]
**secondaryId** | **String** |  |  [optional]



