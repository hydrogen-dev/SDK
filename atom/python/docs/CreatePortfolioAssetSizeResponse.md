# CreatePortfolioAssetSizeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_date** | **date** | Date for this asset size record | 
**asset_size** | **float** | Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0 | 
**cash_flow** | **float** | Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0 | 
**portfolio_id** | **str** | The ID of the portfolio that the asset size record falls under | 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**id** | **str** | ID of the portfolio asset size record | [optional] 
**create_date** | **str** | Datetime the portfolio asset size record was created | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


