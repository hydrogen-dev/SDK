# AccountTransactionResponseContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID for the transaction record | [optional] 
**_date** | **date** | Date for when the transaction occurred | [optional] 
**is_read** | **bool** | Indicates if the transaction has been read. Defaults to false which indicates it has not been read | [optional] 
**portfolio_id** | **str** | The ID for the portfolio that the transaction falls under | [optional] 
**model_id** | **str** | The ID for the model to which the portfolio that the transaction falls under subscribes | [optional] 
**price** | **float** | Price at which security was bought or sold included in the transaction | [optional] 
**quantity** | **float** | Quantity of shares of the security purchased | [optional] 
**security_id** | **str** | The ID of the security included in the transaction | [optional] 
**transaction_code_id** | **str** | The ID referring to the transaction code, defined by your firm | [optional] 
**secondary_id** | **str** | Alternate ID that can be used to identify the object such as an internal id | [optional] 
**create_date** | **str** | Timestamp for the date and time that the transaction record was created | [optional] 
**update_date** | **str** | Timestamp for the date and time that the transaction record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


