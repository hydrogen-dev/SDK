# HydrogenProtonApi.SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositSchedule** | [**[SavingsDepositSchedule]**](SavingsDepositSchedule.md) |  | [optional] 
**horizonFrequencyInterval** | **String** |  | [optional] [default to 'year']
**initialBalance** | **Number** |  | [optional] 
**returnSchedule** | **[Number]** |  | 
**taxRate** | **Number** |  | [optional] [default to 0.0]
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**aggregationAccountIds** | **[String]** |  | [optional] 
**accountIds** | **[String]** |  | [optional] 
**horizon** | **Number** |  | 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




