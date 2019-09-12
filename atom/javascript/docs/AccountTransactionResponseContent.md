# atom_api.AccountTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID for the transaction record | [optional] 
**_date** | **Date** | Date for when the transaction occurred | [optional] 
**isRead** | **Boolean** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read | [optional] 
**portfolioId** | **String** | The ID for the portfolio that the transaction falls under | [optional] 
**modelId** | **String** | The ID for the model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **Number** | Price at which security was bought or sold included in the transaction | [optional] 
**quantity** | **Number** | Quantity of shares of the security purchased | [optional] 
**securityId** | **String** | The ID of the security included in the transaction | [optional] 
**transactionCodeId** | **String** | The ID referring to the transaction code, defined by your firm | [optional] 
**secondaryId** | **String** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**createDate** | **String** | Timestamp for the date and time that the transaction record was created | [optional] 
**updateDate** | **String** | Timestamp for the date and time that the transaction record was last updated | [optional] 


