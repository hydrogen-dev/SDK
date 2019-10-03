# AtomApi::AnnuityCalculatorInitialBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_return** | **Float** | The annualized portfolio return | 
**accumulation_horizon** | **Integer** | The number of years in the accumulation period | 
**decumulation_horizon** | **Integer** | The number of years in the accumulation period | 
**annuity_amount** | **Float** | The amount of the annuity payments | 
**annuity_frequency_interval** | **String** | The frequency interval of the annuity | [optional] [default to &#39;year&#39;]
**inflation_rate** | **Float** | The annualized inflation rate | [optional] 
**tax_rate** | **Float** | The tax rate on withdrawals | [optional] 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


