# atom_api.ClientResponsePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**answerId** | **String** | The ID of the answer provided to link the response to a question | 
**answerValue** | **String** | Body of the client’s response | 
**clientId** | **String** | The ID of the client to whom the response belongs | [optional] 
**accountId** | **String** | In the case that the response applies to only one of a client’s accounts and not the client as a whole, the ID of the account to which the response belongs | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the client response in the format key:value | [optional] 


