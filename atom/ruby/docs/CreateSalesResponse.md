# AtomApi::CreateSalesResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | **String** | Details on the questions received within the inquiry | 
**subject** | **String** | Short title for the subject of the inquiry | [optional] 
**assigned** | **String** | The ID of the internal user assigned to the sales inquiry | [optional] 
**open_time** | **Date** | Date that the inquiry was opened | [optional] 
**close_time** | **Date** | Date that the inquiry was closed | [optional] 
**closed_by** | **String** | The ID for the internal user that closed the inquiry | [optional] 
**comments** | **String** | Any comments associated with the sales inquiry for background | [optional] 
**contacted** | **BOOLEAN** | Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted | [optional] [default to false]
**email** | **String** | Contact email for the individual associated with the inquiry such as sample@example.com | [optional] 
**firm_name** | **String** | Name of the firm associated with the inquiry | [optional] 
**first_name** | **String** | First name of the individual associated with the inquiry | [optional] 
**last_name** | **String** | Last name of the individual associated with the inquiry | [optional] 
**ip** | **String** | IP address for the individual associated with the inquiry | [optional] 
**method** | **String** | Method with which the inquiry was received such as “email” or “phone” | [optional] 
**phone** | **String** | Phone number for the individual associated with the inquiry | [optional] 
**title** | **String** | Title of the individual associated with the inquiry | [optional] 
**solution** | **String** | Details on the resolution of the inquiry | [optional] 
**referral_source** | **String** | Details on how the individual associated with the inquiry was referred | [optional] 
**notification** | **BOOLEAN** | Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the sales inquiry in the format key:value. See Metadata | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | The ID of the sales inquiry | [optional] 
**create_date** | **String** | Datetime the sales inquiry was created | [optional] 


