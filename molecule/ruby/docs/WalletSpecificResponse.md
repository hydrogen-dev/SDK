# MoleculeApi::WalletSpecificResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the wallet record | [optional] 
**create_date** | **String** | Datetime the wallet record was created | [optional] 
**name** | **String** | Name of the wallet | 
**type** | **String** | Type of the wallet. Can be individual, business, trust, or contract | 
**clients** | [**Array&lt;WalletCreateClient&gt;**](WalletCreateClient.md) | List of nucleus clients associated with the wallet and their association type | 
**token_whitelists** | [**Array&lt;WalletCreateWhitelist&gt;**](WalletCreateWhitelist.md) | List of tokens where the wallet is whitelisted | [optional] 
**is_active** | **BOOLEAN** | Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used | [optional] [default to true]
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the wallet record was updated | [optional] 


