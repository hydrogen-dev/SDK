# HydrogenProtonApi.RecurringTransactionAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountIds** | **[String]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**clientId** | **String** |  | [optional] 
**accountIds** | **[String]** |  | [optional] 
**intervalDeviationThreshold** | **Number** |  | [optional] [default to 3]
**analyzeTransactions** | **Boolean** |  | [optional] [default to true]
**currencyConversion** | **String** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**currencyCode** | **String** |  | [optional] 
**showRecurringDetails** | **Boolean** |  | [optional] [default to false]
**scope** | **String** |  | [optional] [default to 'all']
**amountDeviationThreshold** | **Number** |  | [optional] [default to 0.05]


<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `all` (value: `"all"`)

* `external` (value: `"external"`)

* `internal` (value: `"internal"`)




