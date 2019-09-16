# AtomApi::PortfolioAssetSizePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | **Date** | Date for this asset size record | 
**asset_size** | **Float** | Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0 | 
**cash_flow** | **Float** | Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0 | 
**portfolio_id** | **String** | The ID of the portfolio that the asset size record falls under | 
**currency_code** | **String** | Alphabetic currency code for the base currency of the portfolio, limited to 3 characters | [optional] 
**secondary_id** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


