# FinancialPicture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** | The ID of a client&#39;s financial picture | 
**start_date** | **date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | [optional] 
**end_date** | **date** | End date of the financial picture analysis. Defaults to latest date there is data. | [optional] 
**show_change** | **bool** | Indicates whether to return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range. Defaults to FALSE which indicates it will not return these changes. | [optional] [default to False]
**show_history** | **bool** | Indicates whether to return a daily history of the user’s financial picture within the specified date range. Defaults to FALSE which indicates it will not return daily historical records. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


