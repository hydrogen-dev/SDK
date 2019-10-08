# molecule_api.WalletKeyCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the wallet key record | [optional] 
**keyId** | **String** | The ID of the associated key within the Key Server | [optional] 
**keyServer** | **String** | Name of the Key Server in use by the client | [optional] 
**address** | **String** | Public address of the key pair getting stored | [optional] 
**privateKey** | **String** | Private key of the key pair getting stored | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**createDate** | **String** | Datetime the wallet key record was created | [optional] 


