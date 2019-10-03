# atom_api.CashFlowAnalysisResponseSpendingDetailsByMerchant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchant** | **String** | Merchant name as defined in the Nucleus transactions | [optional] 
**value** | **Number** | Sum of all transactions over the period for the given merchant | [optional] 
**benchmarkValue** | **Number** | Sum of all transactions over the benchmark period for the given merchant | [optional] 
**change** | [**CashFlowAnalysisResponseSpendingDetailsChange2**](CashFlowAnalysisResponseSpendingDetailsChange2.md) |  | [optional] 
**weight** | **Number** | The proportion of all spending over the period related to this merchant | [optional] 
**benchmarkWeight** | **Number** | The proportion of all spending over the benchmark period related to this merchant | [optional] 


