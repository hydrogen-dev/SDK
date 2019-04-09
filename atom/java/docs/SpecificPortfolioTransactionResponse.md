
# SpecificPortfolioTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the portfolio transaction record |  [optional]
**createDate** | **String** | Datetime the portfolio transaction record was created |  [optional]
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the transaction record falls under | 
**securityId** | [**UUID**](UUID.md) | The ID of the security that was bought or sold in the transaction | 
**transactionCodeId** | [**UUID**](UUID.md) | The ID of the transaction code for the type of transaction | 
**date** | [**LocalDate**](LocalDate.md) | Date for this transaction record | 
**isRead** | **Boolean** | Indicates if the transaction has been read. Defaults to false which indicates that it has not been read |  [optional]
**price** | **Double** | Price at which the security was bought or sold |  [optional]
**quantity** | **Double** | Quantity of units of a security that were bought or sold |  [optional]
**secondaryId** | **String** |  |  [optional]
**updateDate** | **String** | Datetime the portfolio transaction record was last updated |  [optional]



