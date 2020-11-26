# HydrogenProtonApi.RecurringTransactionAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** |  | [optional] [default to 'all']
**amountDeviationThreshold** | **Number** |  | [optional] [default to 0.05]
**analyzeTransactions** | **Boolean** |  | [optional] [default to true]
**intervalDeviationThreshold** | **Number** |  | [optional] [default to 3]
**clientId** | **String** |  | [optional] 
**currencyConversion** | **String** |  | [optional] 
**startDate** | **Date** |  | [optional] 
**aggregationAccountIds** | **[String]** |  | [optional] 
**endDate** | **Date** |  | [optional] 
**showRecurringDetails** | **Boolean** |  | [optional] [default to false]
**currencyCode** | **String** |  | [optional] 
**accountIds** | **[String]** |  | [optional] 


<a name="ScopeEnum"></a>
## Enum: ScopeEnum


* `all` (value: `"all"`)

* `external` (value: `"external"`)

* `internal` (value: `"internal"`)




