# ProtonApi::SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_account_ids** | **Array&lt;String&gt;** |  | [optional] 
**tax_rate** | **Float** |  | [optional] [default to 0.0]
**account_ids** | **Array&lt;String&gt;** |  | [optional] 
**initial_balance** | **Float** |  | [optional] 
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**inflation_rate** | **Float** |  | [optional] [default to 0.0]
**horizon** | **Integer** |  | 
**horizon_frequency_interval** | **String** |  | [optional] [default to &#39;year&#39;]
**deposit_schedule** | [**Array&lt;SavingsDepositSchedule&gt;**](SavingsDepositSchedule.md) |  | [optional] 
**return_schedule** | **Array&lt;Float&gt;** |  | 


