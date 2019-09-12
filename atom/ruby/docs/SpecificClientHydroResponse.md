# AtomApi::SpecificClientHydroResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the client-hydro relationship | [optional] 
**create_date** | **String** | Datetime when the client-hydro relationship was created | [optional] 
**client_id** | **String** | The ID of the client to whom the Hydro ID belongs | 
**hydro_id** | **String** | The hydro ID for the client. Also found under the client object | 
**is_hydro_id_verified** | **BOOLEAN** | Indicator if the client has verified ownership of the Hydro ID provided. Defaults to false which means ownership has not been verified | [optional] [default to false]
**is_client_raindrop_linked** | **BOOLEAN** | Indicator for whether or not the client has successfully linked their Hydro ID to your Client-side Raindrop application. Defaults to false which indicates it has not been linked | [optional] [default to false]
**is_client_raindrop_enabled** | **BOOLEAN** | Indicator for whether or not the client has chosen to enable the Hydro Client-side Raindrop service on your application. Defaults to false which indicates the service is not enabled | [optional] [default to false]
**metadata** | **Object** | Custom information associated with the client-hydro relationship in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Latest datetime the client-hydro relationship was updated | [optional] 


