# atom_api.FinancialPicturePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The ID of a client&#39;s financial picture | 
**startDate** | **Date** | Start date of the financial picture analysis. Defaults to earliest date there is data. | [optional] 
**endDate** | **Date** | End date of the financial picture analysis. Defaults to latest date there is data. | [optional] 
**currencyCode** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [optional] [default to &#39;USD&#39;]
**showHistory** | **Boolean** | If true, return a daily history of the user’s financial picture within the specified date range | [optional] [default to false]
**showChange** | **Boolean** | If true, return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range | [optional] [default to false]


