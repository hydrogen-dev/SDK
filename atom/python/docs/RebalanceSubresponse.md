# RebalanceSubresponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the order | [optional] 
**create_date** | **str** | Datetime the order was created | [optional] 
**update_date** | **str** | Datetime the order was last updated | [optional] 
**transaction_code_id** | **str** | ID of the transaction code | [optional] 
**_date** | **date** | Date the order was generated | [optional] 
**price** | **float** | Price of the security at the time the order is created | [optional] 
**is_read** | **bool** | Indicator for whether or not the order record has been read. Defaults to false which indicates that it has not been read | [optional] [default to False]
**quantity** | **float** | The number of shares of security being bought or sold | [optional] 
**security_id** | **str** | The ID of the security being bought or sold | [optional] 
**account_id** | **str** | The ID of the account that the order falls under | [optional] 
**portfolio_id** | **str** | The ID of the portfolio that the order falls under | [optional] 
**model_id** | **str** | The ID of the model with which the order is associated | [optional] 
**metadata** | **object** | Custom information associated with the order record in the format key:value | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


