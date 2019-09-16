# TokenCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **str** | The symbol of the security token. Could be 3 or 4 characters long. | 
**name** | **str** | Name of the security token. | 
**nucleus_model_id** | **str** | The id of the associated Nucleus model for this security token | 
**owner_wallet_id** | **str** | The wallet id of the token owner. This wallet has the privileges to do on-chain modifications | 
**total_supply** | **int** | The total supply of the security token | 
**circulating_supply** | **int** | The amount of tokens in circulation. Defaults to 0 | [optional] 
**conract_address** | **str** | The contract address of the security token on the Ethereum blockchain | [optional] 
**crowdsale_address** | **str** | The crowdsale address of the security token on the Ethereum blockchain | [optional] 
**restrictions** | [**TokenCreatePayloadRestrictions**](TokenCreatePayloadRestrictions.md) |  | [optional] 
**offering_settings** | [**TokenCreatePayloadOfferingSettings**](TokenCreatePayloadOfferingSettings.md) |  | [optional] 
**metadata** | **object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the token record | [optional] 
**create_date** | **str** | Datetime the token record was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


