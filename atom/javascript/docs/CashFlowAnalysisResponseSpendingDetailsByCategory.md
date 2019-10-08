# atom_api.CashFlowAnalysisResponseSpendingDetailsByCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Spending category as defined in the Nucleus transactions | [optional] 
**value** | **Number** | Sum of all transactions over the period for the given category | [optional] 
**benchmarkValue** | **Number** | Sum of all transactions over the benchmark period for the given category | [optional] 
**change** | [**CashFlowAnalysisResponseSpendingDetailsChange**](CashFlowAnalysisResponseSpendingDetailsChange.md) |  | [optional] 
**weight** | **Number** | The proportion of all spending over the period related to this category | [optional] 
**benchmarkWeight** | **Number** | The proportion of all spending over the benchmark period related to this category | [optional] 
**subcategories** | [**[CashFlowAnalysisResponseSpendingDetailsSubcategories]**](CashFlowAnalysisResponseSpendingDetailsSubcategories.md) |  | [optional] 


