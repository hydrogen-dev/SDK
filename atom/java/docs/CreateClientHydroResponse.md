
# CreateClientHydroResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | The ID of the client to whom the Hydro ID belongs | 
**hydroId** | **String** | The hydro ID for the client. Also found under the client object | 
**isHydroIdVerified** | **Boolean** | Indicator if the client has verified ownership of the Hydro ID provided. Defaults to false which means ownership has not been verified |  [optional]
**isClientRaindropLinked** | **Boolean** | Indicator for whether or not the client has successfully linked their Hydro ID to your Client-side Raindrop application. Defaults to false which indicates it has not been linked |  [optional]
**isClientRaindropEnabled** | **Boolean** | Indicator for whether or not the client has chosen to enable the Hydro Client-side Raindrop service on your application. Defaults to false which indicates the service is not enabled |  [optional]
**metadata** | **Object** | Custom information associated with the client-hydro relationship in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the client-hydro relationship |  [optional]
**createDate** | **String** | Datetime when the client-hydro relationship was created |  [optional]



