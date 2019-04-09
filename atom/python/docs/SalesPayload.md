# SalesPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | **str** | Details on the questions received within the inquiry | 
**subject** | **str** | Short title for the subject of the inquiry | [optional] 
**assigned** | **str** | The ID of the internal user assigned to the sales inquiry | [optional] 
**open_time** | **date** | Date that the inquiry was opened | [optional] 
**close_time** | **date** | Date that the inquiry was closed | [optional] 
**closed_by** | **str** | The ID for the internal user that closed the inquiry | [optional] 
**comments** | **str** | Any comments associated with the sales inquiry for background | [optional] 
**contacted** | **bool** | Indicates if the individual associated with the inquiry was contacted. Defaults to false which indicates that he/she was not contacted | [optional] [default to False]
**email** | **str** | Contact email for the individual associated with the inquiry such as sample@example.com | [optional] 
**firm_name** | **str** | Name of the firm associated with the inquiry | [optional] 
**first_name** | **str** | First name of the individual associated with the inquiry | [optional] 
**last_name** | **str** | Last name of the individual associated with the inquiry | [optional] 
**ip** | **str** | IP address for the individual associated with the inquiry | [optional] 
**method** | **str** | Method with which the inquiry was received such as “email” or “phone” | [optional] 
**phone** | **str** | Phone number for the individual associated with the inquiry | [optional] 
**title** | **str** | Title of the individual associated with the inquiry | [optional] 
**solution** | **str** | Details on the resolution of the inquiry | [optional] 
**referral_source** | **str** | Details on how the individual associated with the inquiry was referred | [optional] 
**notification** | **bool** | Indicates if a notification is issued for inquiry. Defaults to true which indicates that there is a notification | [optional] [default to True]
**metadata** | **object** | Custom information associated with the sales inquiry in the format key:value. See Metadata | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


