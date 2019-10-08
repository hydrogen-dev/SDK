# AccountCreatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the account | 
**account_type_id** | **str** | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **bool** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed | [optional] [default to True]
**clients** | [**list[AccountCreateClient]**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data | [optional] 
**goals** | [**list[AccountCreateGoal]**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon | [optional] 
**currency_code** | **str** | Alphabetic currency code for the base currency of the account, limited to 3 characters | [optional] 
**metadata** | **object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


