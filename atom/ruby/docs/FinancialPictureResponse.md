# AtomApi::FinancialPictureResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency_code** | **String** | Currency code associated with monetary response values | 
**snapshot** | [**FinancialPictureResponseSnapshot**](FinancialPictureResponseSnapshot.md) |  | 
**change** | [**FinancialPictureResponseChange**](FinancialPictureResponseChange.md) |  | [optional] 
**history** | [**Array&lt;FinancialPictureResponseHistory&gt;**](FinancialPictureResponseHistory.md) | A historical record of the client’s financials for each date within the date range. This is an array of maps, with each map corresponding to a date. | [optional] 


