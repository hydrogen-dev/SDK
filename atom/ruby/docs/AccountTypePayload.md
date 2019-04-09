# AtomApi::AccountTypePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the account type such as “Taxable” or “Joint” | 
**short_name** | **String** | Abbreviated name for the account type | [optional] 
**category** | **String** | Category grouping that the account type falls under | [optional] 
**subcategory** | **String** | Subcategory grouping under the category that the account type falls under | [optional] 
**code** | **String** | Code defined by your firm for the account type | [optional] 
**is_taxable** | **BOOLEAN** | Indicates if this account type is taxable. true indicates it is taxable | [optional] 
**is_active** | **BOOLEAN** | Indicates if this account type is active. Defaults to true which indicates it is active and available to be assigned to accounts | [optional] [default to true]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


