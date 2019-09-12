# AtomApi::CreateSecurityExclusionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **String** | The ID of the client to which the security exclusion applies | 
**security_id** | **String** | The ID of the security that is subject to the exclusion | 
**is_restrict_buy** | **BOOLEAN** | Indicates if the exclusion applies to buy transactions | 
**is_restrict_sell** | **BOOLEAN** | Indicates if the exclusion applies to sell transactions | 
**account_id** | **String** | The ID of the account to which the security exclusion applies (if account-specific) | [optional] 
**portfolio_id** | **String** | The ID of the portfolio to which the security exclusion applies (if portfolio-specific) | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**metadata** | **Object** | Custom information associated with the security exclusion in the format key:value | [optional] 
**id** | **String** | ID of the security exclusion | [optional] 
**create_date** | **String** | Datetime the security exclusion was created | [optional] 


