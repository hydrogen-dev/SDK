# AtomApi::SpecificPortfolioAssetSizeResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of the portfolio asset size record | [optional] 
**create_date** | **String** | Datetime the portfolio asset size record was created | [optional] 
**date** | **Date** | Date for this asset size record | 
**asset_size** | **Float** | Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0 | 
**cash_flow** | **Float** | Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0 | 
**portfolio_id** | **String** | The ID of the portfolio that the asset size record falls under | 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 
**update_date** | **String** | Datetime the portfolio asset size record was last updated | [optional] 


