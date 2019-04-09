# atom_api.SecurityExclusionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The ID of the client to which the security exclusion applies | 
**securityId** | **String** | The ID of the security that is subject to the exclusion | 
**isRestrictBuy** | **Boolean** | Indicates if the exclusion applies to buy transactions | 
**isRestrictSell** | **Boolean** | Indicates if the exclusion applies to sell transactions | 
**accountId** | **String** | The ID of the account to which the security exclusion applies (if account-specific) | [optional] 
**portfolioId** | **String** | The ID of the portfolio to which the security exclusion applies (if portfolio-specific) | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


