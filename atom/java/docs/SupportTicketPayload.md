
# SupportTicketPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Details and description of the support ticket issue | 
**clientId** | [**UUID**](UUID.md) | The ID for the client associated with the support ticket | 
**accountId** | [**UUID**](UUID.md) | The ID for the account associated with the support ticket | 
**openTime** | [**LocalDate**](LocalDate.md) | Date that the support ticket was opened | 
**closeTime** | [**LocalDate**](LocalDate.md) | Date that the support ticket was resolved and closed |  [optional]
**assignedTo** | [**UUID**](UUID.md) | The ID of the internal user to whom the support ticket is assigned to be resolved |  [optional]
**status** | **String** | Status of the support ticket such as closed |  [optional]
**subject** | **String** | Title of the support ticket relating to the underlying issue |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the support ticket in the format key:value |  [optional]



