# AtomApi::CreatePortfolioTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_id** | **String** | The ID of the portfolio that the transaction record falls under | 
**security_id** | **String** | The ID of the security that was bought or sold in the transaction | 
**transaction_code_id** | **String** | The ID of the transaction code for the type of transaction | 
**date** | **Date** | Date for this transaction record | 
**is_read** | **BOOLEAN** | Indicates if the transaction has been read. Defaults to false which indicates that it has not been read | [optional] [default to false]
**price** | **Float** | Price at which the security was bought or sold | [optional] 
**quantity** | **Float** | Quantity of units of a security that were bought or sold | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **String** | ID of the portfolio transaction record | [optional] 
**create_date** | **String** | Datetime the portfolio transaction record was created | [optional] 


