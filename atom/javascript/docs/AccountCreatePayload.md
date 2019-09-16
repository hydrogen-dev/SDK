# atom_api.AccountCreatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the account | 
**accountTypeId** | **String** | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **Boolean** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed | [optional] [default to true]
**clients** | [**[AccountCreateClient]**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data | [optional] 
**goals** | [**[AccountCreateGoal]**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon | [optional] 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the account, limited to 3 characters | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


