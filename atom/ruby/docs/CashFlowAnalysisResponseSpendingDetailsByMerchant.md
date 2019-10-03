# AtomApi::CashFlowAnalysisResponseSpendingDetailsByMerchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** | Merchant name as defined in the Nucleus transactions | [optional] 
**value** | **Float** | Sum of all transactions over the period for the given merchant | [optional] 
**benchmark_value** | **Float** | Sum of all transactions over the benchmark period for the given merchant | [optional] 
**change** | [**CashFlowAnalysisResponseSpendingDetailsChange2**](CashFlowAnalysisResponseSpendingDetailsChange2.md) |  | [optional] 
**weight** | **Float** | The proportion of all spending over the period related to this merchant | [optional] 
**benchmark_weight** | **Float** | The proportion of all spending over the benchmark period related to this merchant | [optional] 


