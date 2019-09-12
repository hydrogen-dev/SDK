# AtomApi::AccountCreatePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the account | 
**account_type_id** | **String** | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **BOOLEAN** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed | [optional] [default to true]
**clients** | [**Array&lt;AccountCreateClient&gt;**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data | [optional] 
**goals** | [**Array&lt;AccountCreateGoal&gt;**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


