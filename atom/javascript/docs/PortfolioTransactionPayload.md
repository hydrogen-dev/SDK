# atom_api.PortfolioTransactionPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | **String** | The ID of the portfolio that the transaction record falls under | 
**securityId** | **String** | The ID of the security that was bought or sold in the transaction | 
**transactionCodeId** | **String** | The ID of the transaction code for the type of transaction | 
**_date** | **Date** | Date for this transaction record | 
**isRead** | **Boolean** | Indicates if the transaction has been read. Defaults to false which indicates that it has not been read | [optional] [default to false]
**price** | **Number** | Price at which the security was bought or sold | [optional] 
**quantity** | **Number** | Quantity of units of a security that were bought or sold | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


