
# CashFlowAnalysisPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | [**UUID**](UUID.md) | The ID of the client’s cash flows | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date of the analysis period |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date of the analysis period |  [optional]
**benchmarkStartDate** | [**LocalDate**](LocalDate.md) | Start date of the benchmark analysis period |  [optional]
**benchmarkEndDate** | [**LocalDate**](LocalDate.md) | End date of the benchmark analysis period |  [optional]
**currencyCode** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered |  [optional]
**showHistory** | **Boolean** | If true, return a daily history of cash flow values |  [optional]
**showSpendingDetails** | **Boolean** | If true, return advanced details on spending over the analysis period |  [optional]



