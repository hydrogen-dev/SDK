# AtomApi::FinancialPicture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **String** | The ID of a client&#39;s financial picture | 
**start_date** | **Date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | [optional] 
**end_date** | **Date** | End date of the financial picture analysis. Defaults to latest date there is data. | [optional] 
**show_change** | **BOOLEAN** | Indicates whether to return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range. Defaults to FALSE which indicates it will not return these changes. | [optional] [default to false]
**show_history** | **BOOLEAN** | Indicates whether to return a daily history of the user’s financial picture within the specified date range. Defaults to FALSE which indicates it will not return daily historical records. | [optional] [default to false]


