# ProtonApi::AnnuityCalculatorDecumulationHorizonRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annuity_amount** | **Float** |  | 
**aggregation_account_ids** | **Array&lt;String&gt;** |  | [optional] 
**tax_rate** | **Float** |  | [optional] [default to 0.0]
**account_ids** | **Array&lt;String&gt;** |  | [optional] 
**initial_balance** | **Float** |  | [optional] [default to 0.0]
**create_log** | **BOOLEAN** |  | [optional] [default to false]
**inflation_rate** | **Float** |  | [optional] [default to 0.0]
**decumulation_horizon** | **Integer** |  | [optional] 
**accumulation_horizon** | **Integer** |  | 
**annuity_frequency_interval** | **String** |  | [optional] [default to &#39;year&#39;]
**portfolio_return** | **Float** |  | 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


