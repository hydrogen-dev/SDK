
# ClientCampaignPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignId** | [**UUID**](UUID.md) | The ID of the campaign through which the client registered for your firm’s service | 
**clientId** | [**UUID**](UUID.md) | The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided |  [optional]
**ip** | **String** | The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the client campaign in the format key:value |  [optional]



