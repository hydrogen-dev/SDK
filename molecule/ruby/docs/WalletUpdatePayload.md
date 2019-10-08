# MoleculeApi::WalletUpdatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the wallet | [optional] 
**type** | **String** | Type of the wallet. Can be individual, business, trust, or contract | [optional] 
**clients** | [**Array&lt;WalletCreateClient&gt;**](WalletCreateClient.md) | List of nucleus clients associated with the wallet and their association type | [optional] 
**token_whitelists** | [**Array&lt;WalletCreateWhitelist&gt;**](WalletCreateWhitelist.md) | List of tokens where the wallet is whitelisted | [optional] 
**is_active** | **BOOLEAN** | Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


