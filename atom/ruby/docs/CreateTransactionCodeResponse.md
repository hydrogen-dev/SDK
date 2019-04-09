# AtomApi::CreateTransactionCodeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_code** | **String** | Usually a standard short combination of letters and numbers used to identify the transaction code within your firm | 
**transaction_code_description** | **String** | Short description to clarify the type of transaction | [optional] 
**transaction_type** | **String** | Name of the transaction code such as “Customer Payment” | [optional] 
**category** | **String** | Grouping of similar transaction codes | [optional] 
**subcategory** | **String** | Sub-grouping of similar transaction codes | [optional] 
**is_buy** | **BOOLEAN** | Indicates if the transaction is to buy securities. Defaults to false which means it is a sell transaction. | [optional] [default to false]
**id** | **String** | ID of the transaction code | [optional] 
**create_date** | **String** | Datetime the transaction code was created | [optional] 


