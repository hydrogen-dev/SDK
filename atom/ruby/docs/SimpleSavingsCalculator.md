# AtomApi::SimpleSavingsCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial_balance** | **Float** | The initial savings balance | 
**horizon** | **Integer** | The savings horizon | 
**return_schedule** | **Array&lt;Float&gt;** | The return schedule for the given horizon | 
**horizon_frequency_interval** | **String** | The frequency interval for the horizon | [optional] [default to &#39;year&#39;]
**deposit_schedule** | [**Array&lt;DepositSchedule&gt;**](DepositSchedule.md) | The deposit schedule | [optional] 
**tax_rate** | **Float** | The tax rate to be applied to investment earnings | [optional] 
**inflation_rate** | **Float** | The inflation rate | [optional] 


