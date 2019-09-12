# ClientHydroPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The ID of the client to whom the Hydro ID belongs | 
**hydro_id** | **str** | The hydro ID for the client. Also found under the client object | 
**is_hydro_id_verified** | **bool** | Indicator if the client has verified ownership of the Hydro ID provided. Defaults to false which means ownership has not been verified | [optional] [default to False]
**is_client_raindrop_linked** | **bool** | Indicator for whether or not the client has successfully linked their Hydro ID to your Client-side Raindrop application. Defaults to false which indicates it has not been linked | [optional] [default to False]
**is_client_raindrop_enabled** | **bool** | Indicator for whether or not the client has chosen to enable the Hydro Client-side Raindrop service on your application. Defaults to false which indicates the service is not enabled | [optional] [default to False]
**metadata** | **object** | Custom information associated with the client-hydro relationship in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


