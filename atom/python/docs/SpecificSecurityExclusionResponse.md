# SpecificSecurityExclusionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the security exclusion | [optional] 
**create_date** | **str** | Datetime the security exclusion was created | [optional] 
**client_id** | **str** | The ID of the client to which the security exclusion applies | 
**security_id** | **str** | The ID of the security that is subject to the exclusion | 
**is_restrict_buy** | **bool** | Indicates if the exclusion applies to buy transactions | 
**is_restrict_sell** | **bool** | Indicates if the exclusion applies to sell transactions | 
**account_id** | **str** | The ID of the account to which the security exclusion applies (if account-specific) | [optional] 
**portfolio_id** | **str** | The ID of the portfolio to which the security exclusion applies (if portfolio-specific) | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the security exclusion was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


