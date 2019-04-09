# CreateAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the account | 
**account_type_id** | **str** | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **bool** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed | [optional] [default to True]
**clients** | [**list[AccountCreateClient]**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data | [optional] 
**goals** | [**list[AccountCreateGoal]**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon | [optional] 
**metadata** | **object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**last** | **bool** | If true, the last record in the result set is shown | [optional] 
**total_pages** | **int** | Total number of pages in the result set | [optional] 
**total_elements** | **int** | Total number of elements in the result set | [optional] 
**sort** | [**list[PaginationSort]**](PaginationSort.md) | Details of the sort | [optional] 
**first** | **bool** | If true, the first record in the result set is shown | [optional] 
**number_of_elements** | **int** | Number of elements per page | [optional] 
**size** | **int** | The number or records to be included per page. The default is 25. There is no max value. | [optional] 
**number** | **int** | Number of the first result shown | [optional] 
**id** | **str** | ID of the account record | [optional] 
**create_date** | **str** | Datetime the account record was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


