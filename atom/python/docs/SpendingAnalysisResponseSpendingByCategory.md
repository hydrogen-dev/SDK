# SpendingAnalysisResponseSpendingByCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | Spending category as defined in the Nucleus transactions | [optional] 
**value** | **float** | Sum of all transactions over the period for the given category | [optional] 
**weight** | **float** | The proportion of all spending over the period related to this category | [optional] 
**benchmark_value** | **float** | Sum of all transactions over the benchmark period for the given category | [optional] 
**benchmark_weight** | **float** | The proportion of all spending over the benchmark period related to this category | [optional] 
**subcategories** | [**list[SpendingAnalysisResponseSubcategories]**](SpendingAnalysisResponseSubcategories.md) |  | [optional] 
**spending_by_merchant** | [**list[SpendingAnalysisResponseSpendingByMerchant]**](SpendingAnalysisResponseSpendingByMerchant.md) |  | [optional] 
**outlier_transactions** | [**list[SpendingAnalysisResponseOutlierTransactions]**](SpendingAnalysisResponseOutlierTransactions.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


