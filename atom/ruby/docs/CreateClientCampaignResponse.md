# AtomApi::CreateClientCampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **String** | The ID of the campaign through which the client registered for your firm’s service | 
**client_id** | **String** | The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided | [optional] 
**ip** | **String** | The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | The ID of the campaign through which the client registered for your firm’s service | [optional] 
**create_date** | **String** | Datetime the client campaign record was created | [optional] 


