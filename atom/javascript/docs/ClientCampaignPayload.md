# atom_api.ClientCampaignPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | **String** | The ID of the campaign through which the client registered for your firm’s service | 
**clientId** | **String** | The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided | [optional] 
**ip** | **String** | The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


