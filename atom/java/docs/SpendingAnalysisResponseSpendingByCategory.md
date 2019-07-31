
# SpendingAnalysisResponseSpendingByCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **String** | Spending category as defined in the Nucleus transactions |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | Sum of all transactions over the period for the given category |  [optional]
**weight** | [**BigDecimal**](BigDecimal.md) | The proportion of all spending over the period related to this category |  [optional]
**benchmarkValue** | [**BigDecimal**](BigDecimal.md) | Sum of all transactions over the benchmark period for the given category |  [optional]
**benchmarkWeight** | [**BigDecimal**](BigDecimal.md) | The proportion of all spending over the benchmark period related to this category |  [optional]
**subcategories** | [**List&lt;SpendingAnalysisResponseSubcategories&gt;**](SpendingAnalysisResponseSubcategories.md) |  |  [optional]
**spendingByMerchant** | [**List&lt;SpendingAnalysisResponseSpendingByMerchant&gt;**](SpendingAnalysisResponseSpendingByMerchant.md) |  |  [optional]
**outlierTransactions** | [**List&lt;SpendingAnalysisResponseOutlierTransactions&gt;**](SpendingAnalysisResponseOutlierTransactions.md) |  |  [optional]



