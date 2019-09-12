# FinancialPicturePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The ID of a client&#39;s financial picture | 
**start_date** | **date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | 
**end_date** | **date** | End date of the financial picture analysis. Defaults to latest date there is data. | 
**currency_code** | **str** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [default to 'USD']
**show_history** | **bool** | If true, return a daily history of the user’s financial picture within the specified date range | 
**show_change** | **bool** | If true, return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


