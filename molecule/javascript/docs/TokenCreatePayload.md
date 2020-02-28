# molecule_api.TokenCreatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | The symbol of the security token. Could be 3 or 4 characters long. | 
**name** | **String** | Name of the security token. | 
**type** | **String** | Type of the security token. Can be ERC20 or ERC721. Defaults to ERC20 | [optional] [default to &#39;ERC20&#39;]
**isMintable** | **Boolean** | Determines if the security token is mintable or not. Defaults to false. | [optional] [default to false]
**isBurnable** | **Boolean** | Determines if the security token is burnable or not. Defaults to false. | [optional] [default to false]
**nucleusModelId** | **String** | The id of the associated Nucleus model for this security token | 
**ownerWalletId** | **String** | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | 
**totalSupply** | **Number** | The total supply of the security token | 
**circulatingSupply** | **Number** | The amount of tokens in circulation. Defaults to 0 | [optional] 
**whitelistAddress** | **String** | The whitelist address of the security token on the Ethereum blockchain | [optional] 
**conractAddress** | **String** | The contract address of the security token on the Ethereum blockchain | [optional] 
**crowdsaleAddress** | **String** | The crowdsale address of the security token on the Ethereum blockchain | [optional] 
**restrictions** | [**TokenRestrictionsPayload**](TokenRestrictionsPayload.md) |  | [optional] 
**offeringSettings** | [**OfferingSettingsCreatePayload**](OfferingSettingsCreatePayload.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


