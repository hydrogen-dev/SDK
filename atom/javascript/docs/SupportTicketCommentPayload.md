# atom_api.SupportTicketCommentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supportTicketId** | **String** | The ID of the support ticket to which the comment belongs | 
**description** | **String** | Details and description of the information included in the support ticket comment | [optional] 
**hasAttachment** | **Boolean** | Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment | [optional] [default to false]
**isAdmin** | **Boolean** | Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator | [optional] [default to false]
**isRead** | **Boolean** | Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read | [optional] [default to false]
**supportTicketDocument** | [**[SupportTicketCommentPayloadSupportTicketDocument]**](SupportTicketCommentPayloadSupportTicketDocument.md) |  | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


