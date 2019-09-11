
# TokenCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | The symbol of the security token. Could be 3 or 4 characters long. | 
**name** | **String** | Name of the security token. | 
**nucleusModelId** | [**UUID**](UUID.md) | The id of the associated Nucleus model for this security token | 
**ownerId** | [**UUID**](UUID.md) | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | 
**totalSupply** | **Integer** | The total supply of the security token | 
**circulatingSupply** | **Integer** | The amount of tokens in circulation. Defaults to 0 |  [optional]
**conractAddress** | **String** | The contract address of the security token on the Ethereum blockchain |  [optional]
**crowdsaleAddress** | **String** | The crowdsale address of the security token on the Ethereum blockchain |  [optional]
**restrictions** | **List&lt;String&gt;** | The array of token restrictions applied on this token. |  [optional]
**offeringSettings** | [**TokenCreatePayloadOfferingSettings**](TokenCreatePayloadOfferingSettings.md) |  |  [optional]
**metadata** | **Object** | Custom information associated with the account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the token record |  [optional]
**createDate** | **String** | Datetime the token record was created |  [optional]


