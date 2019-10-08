# MoleculeApi::TokenUpdatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | The symbol of the security token. Could be 3 or 4 characters long. | [optional] 
**name** | **String** | Name of the security token. | [optional] 
**nucleus_model_id** | **String** | The id of the associated Nucleus model for this security token | [optional] 
**owner_wallet_id** | **String** | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | [optional] 
**total_supply** | **Integer** | The total supply of the security token | [optional] 
**circulating_supply** | **Integer** | The amount of tokens in circulation. Defaults to 0 | [optional] 
**conract_address** | **String** | The contract address of the security token on the Ethereum blockchain | [optional] 
**crowdsale_address** | **String** | The crowdsale address of the security token on the Ethereum blockchain | [optional] 
**restrictions** | [**TokenRestrictionsPayload**](TokenRestrictionsPayload.md) |  | [optional] 
**offering_settings** | [**OfferingSettingsUpdatePayload**](OfferingSettingsUpdatePayload.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


