# SupportTicketCommentPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**support_ticket_id** | **str** | The ID of the support ticket to which the comment belongs | 
**description** | **str** | Details and description of the information included in the support ticket comment | [optional] 
**has_attachment** | **bool** | Indicates if the comment has a document attached. Defaults to false which indicates it does not have an attachment | [optional] [default to False]
**is_admin** | **bool** | Indicates if the support ticket comment has been added by an internal administrator (as opposed to a client). Defaults to false which indicates that it has not been added by an administrator | [optional] [default to False]
**is_read** | **bool** | Indicates if the support ticket comment has been read by the internal user to whom the support ticket is assigned for resolution. Defaults to false which indicates that it has not been read | [optional] [default to False]
**metadata** | **object** | Custom information associated with the support ticket comment in the format key:value | [optional] 
**support_ticket_document** | [**list[SupportTicketCommentPayloadSupportTicketDocument]**](SupportTicketCommentPayloadSupportTicketDocument.md) |  | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


