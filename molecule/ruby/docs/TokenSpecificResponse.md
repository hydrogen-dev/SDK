# MoleculeApi::TokenSpecificResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the token record | [optional] 
**create_date** | **String** | Datetime the token record was created | [optional] 
**symbol** | **String** | The symbol of the security token. Could be 3 or 4 characters long. | 
**name** | **String** | Name of the security token. | 
**type** | **String** | Type of the security token. Can be ERC20 or ERC721. Defaults to ERC20 | [optional] [default to &#39;ERC20&#39;]
**is_mintable** | **BOOLEAN** | Determines if the security token is mintable or not. Defaults to false. | [optional] [default to false]
**is_burnable** | **BOOLEAN** | Determines if the security token is burnable or not. Defaults to false. | [optional] [default to false]
**nucleus_model_id** | **String** | The id of the associated Nucleus model for this security token | 
**owner_wallet_id** | **String** | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | 
**total_supply** | **Float** | The total supply of the security token | 
**circulating_supply** | **Float** | The amount of tokens in circulation. Defaults to 0 | [optional] 
**whitelist_address** | **String** | The whitelist address of the security token on the Ethereum blockchain | [optional] 
**conract_address** | **String** | The contract address of the security token on the Ethereum blockchain | [optional] 
**crowdsale_address** | **String** | The crowdsale address of the security token on the Ethereum blockchain | [optional] 
**restrictions** | [**TokenRestrictionsPayload**](TokenRestrictionsPayload.md) |  | [optional] 
**offering_settings** | [**OfferingSettingsCreatePayload**](OfferingSettingsCreatePayload.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the token record was updated | [optional] 


