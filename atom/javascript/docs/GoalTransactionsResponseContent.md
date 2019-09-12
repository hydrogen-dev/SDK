# atom_api.GoalTransactionsResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for the transaction record | [optional] 
**_date** | **Date** | Date of the transaction record | [optional] 
**isRead** | **Boolean** | Indicator to show whether or not the transaction has been read. Defaults to true which indicates it has been read. | [optional] [default to true]
**portfolioId** | **String** | The ID of the portfolio that the transaction falls under | [optional] 
**modelId** | **String** | The ID of the model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **Number** | Price for the security included in the transaction at which is was sold or purchased | [optional] 
**quantity** | **Number** | Quantity of shares of the security purchased | [optional] 
**securityId** | **String** | The ID of the security included in the transaction | [optional] 
**transactionCodeId** | **String** | The ID referring to the transaction codes defined by your firm | [optional] 
**secondaryId** | **String** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**createDate** | **String** | Timestamp for the date and time that the record was created | [optional] 
**updateDate** | **String** | Timestamp for the date and time that the record was last updated | [optional] 


