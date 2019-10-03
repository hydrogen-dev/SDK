# ClientCampaignPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **str** | The ID of the campaign through which the client registered for your firm’s service | 
**client_id** | **str** | The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided | [optional] 
**ip** | **str** | The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the client campaign in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


