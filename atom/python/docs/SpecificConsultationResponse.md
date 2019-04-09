# SpecificConsultationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the consultation request | [optional] 
**create_date** | **str** | Datetime the consultation request was created | [optional] 
**account_type_id** | **str** | The ID of the account type for the account of the client who submitted the request | [optional] 
**additional_questions** | **str** | Any additional questions to be answered during the consultation | [optional] 
**assets** | **str** | Asset value for a client’s account | [optional] 
**assigned** | **str** | Internal user to whom the request is assigned | [optional] 
**calendar** | **bool** | Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled | [optional] [default to False]
**category** | **str** | Category for the purpose of the request such as “New Account” | [optional] 
**comments** | **str** | Additional information on the purpose of the request such as “Would like to open a new account” | [optional] 
**client_id** | **str** | The ID for the client that submitted the request | [optional] 
**time** | **date** | Date that the consultation is scheduled | [optional] 
**close_time** | **date** | Date that the consultation request has been resolved and closed | [optional] 
**closed_by** | **str** | Internal user that has resolved and closed the consultation request | [optional] 
**completed** | **bool** | Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed | [optional] [default to False]
**name** | **str** | Name of the client that submitted the request | [optional] 
**email** | **str** | Contact email or the client in the format sample@example.com | [optional] 
**firmname** | **str** | Firm name for the client’s firm | [optional] 
**phone** | **str** | Contact phone number for the client | [optional] 
**investment_allocation** | **str** | The type of investment allocation with which the client is associated | [optional] 
**investment_location** | **str** | Description of the location of the client’s investments | [optional] 
**investment_objectives** | **str** | Brief information on the client’s investment objectives | [optional] 
**is_active** | **bool** | Indicates if the consultation request is active. Defaults to true which indicates it is active | [optional] [default to True]
**reminded** | **bool** | Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent | [optional] [default to False]
**source** | **str** | Information on how the client has requested the consultation | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the consultation request was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


