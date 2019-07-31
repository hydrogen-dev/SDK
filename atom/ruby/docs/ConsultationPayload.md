# AtomApi::ConsultationPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_type_id** | **String** | The ID of the account type for the account of the client who submitted the request | [optional] 
**additional_questions** | **String** | Any additional questions to be answered during the consultation | [optional] 
**assets** | **String** | Asset value for a client’s account | [optional] 
**assigned** | **String** | Internal user to whom the request is assigned | [optional] 
**calendar** | **BOOLEAN** | Indicates if the request is scheduled on the calendar. Defaults to false which indicates it has not been scheduled | [optional] [default to false]
**category** | **String** | Category for the purpose of the request such as “New Account” | [optional] 
**comments** | **String** | Additional information on the purpose of the request such as “Would like to open a new account” | [optional] 
**client_id** | **String** | The ID for the client that submitted the request | [optional] 
**time** | **Date** | Date that the consultation is scheduled | [optional] 
**close_time** | **Date** | Date that the consultation request has been resolved and closed | [optional] 
**closed_by** | **String** | Internal user that has resolved and closed the consultation request | [optional] 
**completed** | **BOOLEAN** | Indicates if the consultation request has been resolved and closed. Defaults to false which indicates it has not been closed | [optional] [default to false]
**name** | **String** | Name of the client that submitted the request | [optional] 
**email** | **String** | Contact email or the client in the format sample@example.com | [optional] 
**firmname** | **String** | Firm name for the client’s firm | [optional] 
**phone** | **String** | Contact phone number for the client | [optional] 
**investment_allocation** | **String** | The type of investment allocation with which the client is associated | [optional] 
**investment_location** | **String** | Description of the location of the client’s investments | [optional] 
**investment_objectives** | **String** | Brief information on the client’s investment objectives | [optional] 
**is_active** | **BOOLEAN** | Indicates if the consultation request is active. Defaults to true which indicates it is active | [optional] [default to true]
**reminded** | **BOOLEAN** | Indicates if a reminder of the consultation was sent to the client. Defaults to false which indicates it has not been sent | [optional] [default to false]
**source** | **String** | Information on how the client has requested the consultation | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the consultation in the format key:value | [optional] 


