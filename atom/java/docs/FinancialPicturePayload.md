
# FinancialPicturePayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | The ID of a client&#39;s financial picture | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date of the financial picture analysis. Defaults to earliest date there is data. |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date of the financial picture analysis. Defaults to latest date there is data. |  [optional]
**currencyCode** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered |  [optional]
**showHistory** | **Boolean** | If true, return a daily history of the user’s financial picture within the specified date range |  [optional]
**showChange** | **Boolean** | If true, return cumulative changes in the user’s total assets, total liabilities, and net worth over time, within the specified date range |  [optional]



