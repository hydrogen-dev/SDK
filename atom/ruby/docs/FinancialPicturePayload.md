# AtomApi::FinancialPicturePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **String** | The ID of a client&#39;s financial picture | 
**start_date** | **Date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | [optional] 
**end_date** | **Date** | End date of the financial picture analysis. Defaults to latest date there is data. | [optional] 
**currency_code** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [optional] [default to &#39;USD&#39;]
**show_history** | **BOOLEAN** | If true, return a daily history of the user’s financial picture within the specified date range | [optional] [default to false]
**show_change** | **BOOLEAN** | If true, return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range | [optional] [default to false]


