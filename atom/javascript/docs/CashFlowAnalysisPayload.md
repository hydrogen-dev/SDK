# atom_api.CashFlowAnalysisPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The ID of the client’s cash flows | 
**startDate** | **Date** | Start date of the analysis period | [optional] 
**endDate** | **Date** | End date of the analysis period | [optional] 
**benchmarkStartDate** | **Date** | Start date of the benchmark analysis period | [optional] 
**benchmarkEndDate** | **Date** | End date of the benchmark analysis period | [optional] 
**currencyCode** | **String** | Currency code used conduct the analysis. Only aggregation account records with this currency code will be considered | [optional] 
**showHistory** | **Boolean** | If true, return a daily history of cash flow values | [optional] [default to false]
**showSpendingDetails** | **Boolean** | If true, return advanced details on spending over the analysis period | [optional] [default to false]


