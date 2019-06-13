# atom_api.AnnuityCalculatorAnnuityAmount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioReturn** | **Number** | The annualized portfolio return | 
**initialBalance** | **Number** | The initial balance of the account | 
**accumulationHorizon** | **Number** | The number of years in the accumulation period | 
**decumulationHorizon** | **Number** | The number of years in the accumulation period | 
**annuityFrequencyInterval** | **String** | The frequency interval of the annuity | [optional] [default to &#39;year&#39;]
**inflationRate** | **Number** | The annualized inflation rate | [optional] 
**taxRate** | **Number** | The tax rate on withdrawals | [optional] 
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)




