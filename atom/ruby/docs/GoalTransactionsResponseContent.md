# AtomApi::GoalTransactionsResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for the transaction record | [optional] 
**date** | **Date** | Date of the transaction record | [optional] 
**is_read** | **BOOLEAN** | Indicator to show whether or not the transaction has been read. Defaults to true which indicates it has been read. | [optional] [default to true]
**portfolio_id** | **String** | The ID of the portfolio that the transaction falls under | [optional] 
**model_id** | **String** | The ID of the model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **Float** | Price for the security included in the transaction at which is was sold or purchased | [optional] 
**quantity** | **Float** | Quantity of shares of the security purchased | [optional] 
**security_id** | **String** | The ID of the security included in the transaction | [optional] 
**transaction_code_id** | **String** | The ID referring to the transaction codes defined by your firm | [optional] 
**secondary_id** | **String** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**create_date** | **String** | Timestamp for the date and time that the record was created | [optional] 
**update_date** | **String** | Timestamp for the date and time that the record was last updated | [optional] 


