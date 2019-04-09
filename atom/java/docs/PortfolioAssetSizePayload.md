
# PortfolioAssetSizePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | Date for this asset size record | 
**assetSize** | **Double** | Monetary value of the portfolio on the particular date. Can be less than, greater than or equal to 0 | 
**cashFlow** | **Double** | Net monetary value that has flowed in or out of the portfolio since the last asset size date, usually via deposits or withdrawals. Can be less than, greater than or equal to 0 | 
**portfolioId** | [**UUID**](UUID.md) | The ID of the portfolio that the asset size record falls under | 
**secondaryId** | **String** |  |  [optional]



