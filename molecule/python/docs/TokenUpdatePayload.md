# TokenUpdatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **str** | The symbol of the security token. Could be 3 or 4 characters long. | [optional] 
**name** | **str** | Name of the security token. | [optional] 
**nucleus_model_id** | **str** | The id of the associated Nucleus model for this security token | [optional] 
**owner_wallet_id** | **str** | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | [optional] 
**total_supply** | **int** | The total supply of the security token | [optional] 
**circulating_supply** | **int** | The amount of tokens in circulation. Defaults to 0 | [optional] 
**conract_address** | **str** | The contract address of the security token on the Ethereum blockchain | [optional] 
**crowdsale_address** | **str** | The crowdsale address of the security token on the Ethereum blockchain | [optional] 
**restrictions** | [**TokenRestrictionsPayload**](TokenRestrictionsPayload.md) |  | [optional] 
**offering_settings** | [**OfferingSettingsUpdatePayload**](OfferingSettingsUpdatePayload.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


