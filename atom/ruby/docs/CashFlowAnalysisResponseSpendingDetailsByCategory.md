# AtomApi::CashFlowAnalysisResponseSpendingDetailsByCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Spending category as defined in the Nucleus transactions | [optional] 
**value** | **Float** | Sum of all transactions over the period for the given category | [optional] 
**benchmark_value** | **Float** | Sum of all transactions over the benchmark period for the given category | [optional] 
**change** | [**CashFlowAnalysisResponseSpendingDetailsChange**](CashFlowAnalysisResponseSpendingDetailsChange.md) |  | [optional] 
**weight** | **Float** | The proportion of all spending over the period related to this category | [optional] 
**benchmark_weight** | **Float** | The proportion of all spending over the benchmark period related to this category | [optional] 
**subcategories** | [**Array&lt;CashFlowAnalysisResponseSpendingDetailsSubcategories&gt;**](CashFlowAnalysisResponseSpendingDetailsSubcategories.md) |  | [optional] 


