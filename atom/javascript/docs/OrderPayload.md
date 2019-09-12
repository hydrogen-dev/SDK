# atom_api.OrderPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionCodeId** | **String** | The ID referring to the transaction codes defined by your firm | 
**quantity** | **Number** | The number of shares of security being bought or sold | 
**securityId** | **String** | The ID of the security being bought or sold | 
**_date** | **Date** | Date for when the order was generated | 
**price** | **Number** | Price of the security at the time the order is created. Should be provided to use the rebalancing functionality | [optional] 
**orderBulkId** | **String** | In the case that the order is part of a bulk order, the ID of the bulk order | [optional] 
**isRead** | **Boolean** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read | [optional] [default to false]
**orderType** | **String** | Type of the order transaction | [optional] 
**orderTicketId** | **String** | The ID that reflects all orders generated during a rebalance | [optional] 
**portfolioId** | **String** | The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**accountId** | **String** | The ID of the account that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**modelId** | **String** | The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order | [optional] 
**metadata** | **Object** | Custom information associated with the order record in the format key:value | [optional] 


