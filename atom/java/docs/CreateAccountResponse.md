
# CreateAccountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the account | 
**accountTypeId** | [**UUID**](UUID.md) | The ID of the account type for the account. Account types are defined by your firm | 
**managed** | **Boolean** | Indicates if the account is managed or self directed. Defaults to true, or that it’s managed |  [optional]
**clients** | [**List&lt;AccountCreateClient&gt;**](AccountCreateClient.md) | List of clients associated with the account and their association type as well as signature data |  [optional]
**goals** | [**List&lt;AccountCreateGoal&gt;**](AccountCreateGoal.md) | List of goals mapped to the account with information such as goal amount and horizon |  [optional]
**metadata** | **Object** | Custom information associated with the account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**last** | **Boolean** | If true, the last record in the result set is shown |  [optional]
**totalPages** | **Integer** | Total number of pages in the result set |  [optional]
**totalElements** | **Integer** | Total number of elements in the result set |  [optional]
**sort** | [**List&lt;PaginationSort&gt;**](PaginationSort.md) | Details of the sort |  [optional]
**first** | **Boolean** | If true, the first record in the result set is shown |  [optional]
**numberOfElements** | **Integer** | Number of elements per page |  [optional]
**size** | **Integer** | The number or records to be included per page. The default is 25. There is no max value. |  [optional]
**number** | **Integer** | Number of the first result shown |  [optional]
**id** | [**UUID**](UUID.md) | ID of the account record |  [optional]
**createDate** | **String** | Datetime the account record was created |  [optional]



