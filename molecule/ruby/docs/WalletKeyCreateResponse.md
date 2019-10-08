# MoleculeApi::WalletKeyCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the wallet key record | [optional] 
**key_id** | **String** | The ID of the associated key within the Key Server | [optional] 
**key_server** | **String** | Name of the Key Server in use by the client | [optional] 
**address** | **String** | Public address of the key pair getting stored | [optional] 
**private_key** | **String** | Private key of the key pair getting stored | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**create_date** | **String** | Datetime the wallet key record was created | [optional] 


