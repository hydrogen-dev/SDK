# ClientTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID for the transaction record | [optional] 
**_date** | **date** | Date of the transaction record | [optional] 
**is_read** | **bool** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read | [optional] 
**portfolio_id** | **str** | The ID of the portfolio that the transaction falls under | [optional] 
**model_id** | **str** | Model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **int** | Price for the security included in the transaction at which it was sold or purchased | [optional] 
**quantity** | **int** | Quantity of shares of the security purchased | [optional] 
**security_id** | **str** | The ID of the security included in the transaction | [optional] 
**transaction_code_id** | **str** | The ID referring to the transaction codes defined by your firm | [optional] 
**secondary_id** | **str** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**create_date** | **str** | Timestamp for the date and time that the record was created | [optional] 
**update_date** | **str** | Timestamp for the date and time that the record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


