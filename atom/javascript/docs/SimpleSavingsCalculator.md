# atom_api.SimpleSavingsCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialBalance** | **Number** | The initial savings balance | 
**horizon** | **Number** | The savings horizon | 
**returnSchedule** | **[Number]** | The return schedule for the given horizon | 
**horizonFrequencyInterval** | **String** | The frequency interval for the horizon | [optional] [default to &#39;year&#39;]
**depositSchedule** | [**[DepositSchedule]**](DepositSchedule.md) | The deposit schedule | [optional] 
**taxRate** | **Number** | The tax rate to be applied to investment earnings | [optional] 
**inflationRate** | **Number** | The inflation rate | [optional] 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `six_months` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `two_weeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




