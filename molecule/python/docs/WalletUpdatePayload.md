# WalletUpdatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the wallet | [optional] 
**type** | **str** | Type of the wallet. Can be individual, business, trust, or contract | [optional] 
**clients** | [**list[WalletCreateClient]**](WalletCreateClient.md) | List of nucleus clients associated with the wallet and their association type | [optional] 
**token_whitelists** | [**list[WalletCreateWhitelist]**](WalletCreateWhitelist.md) | List of tokens where the wallet is whitelisted | [optional] 
**is_active** | **bool** | Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used | [optional] [default to True]
**metadata** | **object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


