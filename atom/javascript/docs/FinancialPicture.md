# atom_api.FinancialPicture

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The ID of a client&#39;s financial picture | 
**startDate** | **Date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | [optional] 
**endDate** | **Date** | End date of the financial picture analysis. Defaults to latest date there is data. | [optional] 
**showChange** | **Boolean** | Indicates whether to return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range. Defaults to FALSE which indicates it will not return these changes. | [optional] [default to false]
**showHistory** | **Boolean** | Indicates whether to return a daily history of the user’s financial picture within the specified date range. Defaults to FALSE which indicates it will not return daily historical records. | [optional] [default to false]


