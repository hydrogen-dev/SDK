
# TokenUpdatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | The symbol of the security token. Could be 3 or 4 characters long. |  [optional]
**name** | **String** | Name of the security token. |  [optional]
**nucleusModelId** | [**UUID**](UUID.md) | The id of the associated Nucleus model for this security token |  [optional]
**ownerWalletId** | [**UUID**](UUID.md) | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications |  [optional]
**totalSupply** | [**BigDecimal**](BigDecimal.md) | The total supply of the security token |  [optional]
**circulatingSupply** | [**BigDecimal**](BigDecimal.md) | The amount of tokens in circulation. Defaults to 0 |  [optional]
**conractAddress** | **String** | The contract address of the security token on the Ethereum blockchain |  [optional]
**crowdsaleAddress** | **String** | The crowdsale address of the security token on the Ethereum blockchain |  [optional]
**restrictions** | [**TokenRestrictionsPayload**](TokenRestrictionsPayload.md) |  |  [optional]
**offeringSettings** | [**OfferingSettingsUpdatePayload**](OfferingSettingsUpdatePayload.md) |  |  [optional]
**metadata** | **Object** | Custom information associated with the account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]



