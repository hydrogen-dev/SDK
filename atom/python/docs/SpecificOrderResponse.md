# SpecificOrderResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the order record | [optional] 
**create_date** | **str** | Datetime the order record was created | [optional] 
**transaction_code_id** | **str** | The ID referring to the transaction codes defined by your firm | 
**quantity** | **float** | The number of shares of security being bought or sold | 
**security_id** | **str** | The ID of the security being bought or sold | 
**_date** | **date** | Date for when the order was generated | 
**price** | **float** | Price of the security at the time the order is created. Should be provided to use the rebalancing functionality | [optional] 
**order_bulk_id** | **str** | In the case that the order is part of a bulk order, the ID of the bulk order | [optional] 
**is_read** | **bool** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read | [optional] [default to False]
**order_type** | **str** | Type of the order transaction | [optional] 
**order_ticket_id** | **str** | The ID that reflects all orders generated during a rebalance | [optional] 
**portfolio_id** | **str** | The ID of the portfolio that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**account_id** | **str** | The ID of the account that the order falls under. Used when aggregating order records into Bulk Order | [optional] 
**model_id** | **str** | The ID of the model with which the order is associated. Used when aggregating order records into Bulk Order | [optional] 
**metadata** | **object** | Custom information associated with the order record in the format key:value | [optional] 
**update_date** | **str** | Datetime the order record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


