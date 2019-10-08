# CreateTransactionCodeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_code** | **str** | Usually a standard short combination of letters and numbers used to identify the transaction code within your firm | 
**transaction_code_description** | **str** | Short description to clarify the type of transaction | [optional] 
**transaction_type** | **str** | Name of the transaction code such as “Customer Payment” | [optional] 
**category** | **str** | Grouping of similar transaction codes | [optional] 
**subcategory** | **str** | Sub-grouping of similar transaction codes | [optional] 
**is_buy** | **bool** | Indicates if the transaction is to buy securities. Defaults to false which means it is a sell transaction. | [optional] [default to False]
**metadata** | **object** | Custom information associated with the transaction code in the format key:value | [optional] 
**id** | **str** | ID of the transaction code | [optional] 
**create_date** | **str** | Datetime the transaction code was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


