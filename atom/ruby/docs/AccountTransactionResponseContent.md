# AtomApi::AccountTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for the transaction record | [optional] 
**date** | **Date** | Date for when the transaction occurred | [optional] 
**is_read** | **BOOLEAN** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read | [optional] 
**portfolio_id** | **String** | The ID for the portfolio that the transaction falls under | [optional] 
**model_id** | **String** | The ID for the model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **Float** | Price at which security was bought or sold included in the transaction | [optional] 
**quantity** | **Float** | Quantity of shares of the security purchased | [optional] 
**security_id** | **String** | The ID of the security included in the transaction | [optional] 
**transaction_code_id** | **String** | The ID referring to the transaction code, defined by your firm | [optional] 
**secondary_id** | **String** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**create_date** | **String** | Timestamp for the date and time that the transaction record was created | [optional] 
**update_date** | **String** | Timestamp for the date and time that the transaction record was last updated | [optional] 


