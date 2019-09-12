# AccountTypePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the account type such as “Taxable” or “Joint” | 
**short_name** | **str** | Abbreviated name for the account type | [optional] 
**category** | **str** | Category grouping that the account type falls under | [optional] 
**subcategory** | **str** | Subcategory grouping under the category that the account type falls under | [optional] 
**code** | **str** | Code defined by your firm for the account type | [optional] 
**is_taxable** | **bool** | Indicates if this account type is taxable. true indicates it is taxable | [optional] 
**is_active** | **bool** | Indicates if this account type is active. Defaults to true which indicates it is active and available to be assigned to accounts | [optional] [default to True]
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


