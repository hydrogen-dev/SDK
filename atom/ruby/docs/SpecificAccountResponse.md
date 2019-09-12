# AtomApi::SpecificAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the account record | [optional] 
**create_date** | **String** | Datetime the account record was created | [optional] 
**name** | **String** | Name of the account | 
**account_type_id** | **String** | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **BOOLEAN** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed | [optional] [default to true]
**clients** | [**Array&lt;AccountCreateClient&gt;**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data | [optional] 
**goals** | [**Array&lt;AccountCreateGoal&gt;**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon | [optional] 
**metadata** | **Object** | Custom information associated with the account in the format key:value | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**last** | **BOOLEAN** | If true, the last record in the result set is shown | [optional] 
**total_pages** | **Integer** | Total number of pages in the result set | [optional] 
**total_elements** | **Integer** | Total number of elements in the result set | [optional] 
**sort** | [**Array&lt;PaginationSort&gt;**](PaginationSort.md) | Details of the sort | [optional] 
**first** | **BOOLEAN** | If true, the first record in the result set is shown | [optional] 
**number_of_elements** | **Integer** | Number of elements per page | [optional] 
**size** | **Integer** | The number or records to be included per page. The default is 25. There is no max value. | [optional] 
**number** | **Integer** | Number of the first result shown | [optional] 
**update_date** | **String** |  | [optional] 


