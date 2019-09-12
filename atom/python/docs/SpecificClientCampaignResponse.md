# SpecificClientCampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the campaign through which the client registered for your firm’s service | [optional] 
**create_date** | **str** | Datetime the client campaign record was created | [optional] 
**campaign_id** | **str** | The ID of the campaign through which the client registered for your firm’s service | 
**client_id** | **str** | The ID of the client that registered for your firm via a particular campaign. Recommended to provide if no value for ip is provided | [optional] 
**ip** | **str** | The IP address of the client that registered for your firm’s service. Recommended to provide if no value for client_id is provided | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the client campaign in the format key:value | [optional] 
**update_date** | **str** | Datetime the client campaign record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


