
# SpecificSecurityExclusionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the security exclusion |  [optional]
**createDate** | **String** | Datetime the security exclusion was created |  [optional]
**clientId** | [**UUID**](UUID.md) | The ID of the client to which the security exclusion applies | 
**securityId** | [**UUID**](UUID.md) | The ID of the security that is subject to the exclusion | 
**isRestrictBuy** | **Boolean** | Indicates if the exclusion applies to buy transactions | 
**isRestrictSell** | **Boolean** | Indicates if the exclusion applies to sell transactions | 
**accountId** | [**UUID**](UUID.md) | The ID of the account to which the security exclusion applies (if account-specific) |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio to which the security exclusion applies (if portfolio-specific) |  [optional]
**secondaryId** | **String** |  |  [optional]
**metadata** | **Object** | Custom information associated with the security exclusion in the format key:value |  [optional]
**updateDate** | **String** | Datetime the security exclusion was last updated |  [optional]



