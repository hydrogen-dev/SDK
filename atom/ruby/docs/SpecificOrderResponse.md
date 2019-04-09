# AtomApi::SpecificOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the order record | [optional] 
**create_date** | **String** | Datetime the order record was created | [optional] 
**transaction_code_id** | **String** | The ID referring to the transaction codes defined by your firm | 
**quantity** | **Float** | The number of shares of security being bought or sold | 
**security_id** | **String** | The ID of the security being bought or sold | 
**date** | **Date** | Date for when the order was generated | 
**price** | **Float** | Price of the security at the time the order is created. Should be provided to use the rebalancing functionality | [optional] 
**order_bulk_id** | **String** | In the case that the order is part of a bulk order, the ID of the bulk order | [optional] 
**is_read** | **BOOLEAN** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read | [optional] [default to false]
**order_type** | **String** | Type of the order transaction | [optional] 
**order_ticket_id** | **String** | The ID that reflects all orders generated during a rebalance | [optional] 
**portfolio_id** | **String** | The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**account_id** | **String** | The ID of the account that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**model_id** | **String** | The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order | [optional] 
**metadata** | **Object** | Custom information associated with the order record in the format key:value | [optional] 
**update_date** | **String** | Datetime the order record was last updated | [optional] 


