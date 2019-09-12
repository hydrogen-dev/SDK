
# CashFlowAnalysisResponseSpendingDetailsByCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Spending category as defined in the Nucleus transactions |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | Sum of all transactions over the period for the given category |  [optional]
**benchmarkValue** | [**BigDecimal**](BigDecimal.md) | Sum of all transactions over the benchmark period for the given category |  [optional]
**change** | [**CashFlowAnalysisResponseSpendingDetailsChange**](CashFlowAnalysisResponseSpendingDetailsChange.md) |  |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) | The proportion of all spending over the period related to this category |  [optional]
**benchmarkWeight** | [**BigDecimal**](BigDecimal.md) | The proportion of all spending over the benchmark period related to this category |  [optional]
**subcategories** | [**List&lt;CashFlowAnalysisResponseSpendingDetailsSubcategories&gt;**](CashFlowAnalysisResponseSpendingDetailsSubcategories.md) |  |  [optional]



