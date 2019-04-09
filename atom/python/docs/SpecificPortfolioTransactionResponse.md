# SpecificPortfolioTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | ID of the portfolio transaction record | [optional] 
**create_date** | **str** | Datetime the portfolio transaction record was created | [optional] 
**portfolio_id** | **str** | The ID of the portfolio that the transaction record falls under | 
**security_id** | **str** | The ID of the security that was bought or sold in the transaction | 
**transaction_code_id** | **str** | The ID of the transaction code for the type of transaction | 
**_date** | **date** | Date for this transaction record | 
**is_read** | **bool** | Indicates if the transaction has been read. Defaults to false which indicates that it has not been read | [optional] [default to False]
**price** | **float** | Price at which the security was bought or sold | [optional] 
**quantity** | **float** | Quantity of units of a security that were bought or sold | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **str** | Datetime the portfolio transaction record was last updated | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


