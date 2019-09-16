# atom_api.PortfolioAssetSizePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_date** | **Date** | Date for this asset size record | 
**assetSize** | **Number** | Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0 | 
**cashFlow** | **Number** | Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0 | 
**portfolioId** | **String** | The ID of the portfolio that the asset size record falls under | 
**currencyCode** | **String** | Alphabetic currency code for the base currency of the portfolio, limited to 3 characters | [optional] 
**secondaryId** | [**SecondaryId**](SecondaryId.md) |  | [optional] 


