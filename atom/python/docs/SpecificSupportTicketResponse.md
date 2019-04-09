# SpecificSupportTicketResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the support ticket | [optional] 
**create_date** | **str** | Datetime the support ticket was created | [optional] 
**description** | **str** | Details and description of the support ticket issue | 
**client_id** | **str** | The ID for the client associated with the support ticket | 
**account_id** | **str** | The ID for the account associated with the support ticket | 
**open_time** | **date** | Date that the support ticket was opened | 
**close_time** | **date** | Date that the support ticket was resolved and closed | [optional] 
**assigned_to** | **str** | The ID of the internal user to whom the support ticket is assigned to be resolved | [optional] 
**status** | **str** | Status of the support ticket such as closed | [optional] 
**subject** | **str** | Title of the support ticket relating to the underlying issue | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the support ticket was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


