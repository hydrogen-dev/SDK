# AtomApi::CashFlowAnalysisResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency_code** | **String** | Currency associated with monetary response values | 
**income_summary** | [**CashFlowAnalysisResponseIncomeSummary**](CashFlowAnalysisResponseIncomeSummary.md) |  | 
**spending_summary** | [**CashFlowAnalysisResponseSpendingSummary**](CashFlowAnalysisResponseSpendingSummary.md) |  | 
**net_summary** | [**CashFlowAnalysisResponseNetSummary**](CashFlowAnalysisResponseNetSummary.md) |  | 
**history** | [**Array&lt;CashFlowAnalysisResponseHistory&gt;**](CashFlowAnalysisResponseHistory.md) | Cash flow values over time during the base period | [optional] 
**benchmark_history** | [**Array&lt;CashFlowAnalysisResponseHistory&gt;**](CashFlowAnalysisResponseHistory.md) | Cash flow values over time during the benchmark period | [optional] 
**spending_details** | [**CashFlowAnalysisResponseSpendingDetails**](CashFlowAnalysisResponseSpendingDetails.md) |  | [optional] 


