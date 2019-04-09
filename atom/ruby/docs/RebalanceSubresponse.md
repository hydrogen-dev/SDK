# AtomApi::RebalanceSubresponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the order | [optional] 
**create_date** | **String** | Datetime the order was created | [optional] 
**update_date** | **String** | Datetime the order was last updated | [optional] 
**transaction_code_id** | **String** | ID of the transaction code | [optional] 
**date** | **Date** | Date the order was generated | [optional] 
**price** | **Float** | Price of the security at the time the order is created | [optional] 
**is_read** | **BOOLEAN** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read | [optional] [default to false]
**quantity** | **Float** | The number of shares of security being bought or sold | [optional] 
**security_id** | **String** | The ID of the security being bought or sold | [optional] 
**account_id** | **String** | The ID of the account that the order falls under | [optional] 
**portfolio_id** | **String** | The ID of the portfolio that the order falls under | [optional] 
**model_id** | **String** | The ID of the model with which the order is associated | [optional] 
**metadata** | **Object** | Custom information associated with the order record in the format key:value | [optional] 


