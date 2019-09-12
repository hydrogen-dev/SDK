
# SpecificTransactionCodeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the transaction code |  [optional]
**createDate** | **String** | Datetime the transaction code was created |  [optional]
**transactionCode** | **String** | Usually a standard short combination of letters and numbers used to identify the transaction code within your firm | 
**transactionCodeDescription** | **String** | Short description to clarify the type of transaction |  [optional]
**transactionType** | **String** | Name of the transaction code such as “Customer Payment” |  [optional]
**category** | **String** | Grouping of similar transaction codes |  [optional]
**subcategory** | **String** | Sub-grouping of similar transaction codes |  [optional]
**isBuy** | **Boolean** | Indicates if the transaction is to buy securities. Defaults to false which means it is a sell transaction. |  [optional]
**metadata** | **Object** | Custom information associated with the transaction code in the format key:value |  [optional]
**updateDate** | **String** | Datetime the transaction code was last updated |  [optional]



