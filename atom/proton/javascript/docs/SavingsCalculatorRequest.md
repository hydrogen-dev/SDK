# HydrogenProtonApi.SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountIds** | **[String]** |  | [optional] 
**taxRate** | **Number** |  | [optional] [default to 0.0]
**accountIds** | **[String]** |  | [optional] 
**initialBalance** | **Number** |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**horizon** | **Number** |  | 
**horizonFrequencyInterval** | **String** |  | [optional] [default to 'year']
**depositSchedule** | [**[SavingsDepositSchedule]**](SavingsDepositSchedule.md) |  | [optional] 
**returnSchedule** | **[Number]** |  | 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




