# HydrogenProtonApi.SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**depositSchedule** | [**[SavingsDepositSchedule]**](SavingsDepositSchedule.md) |  | [optional] 
**createLog** | **Boolean** |  | [optional] [default to false]
**aggregationAccountIds** | **[String]** |  | [optional] 
**initialBalance** | **Number** |  | [optional] 
**horizon** | **Number** |  | 
**horizonFrequencyInterval** | **String** |  | [optional] [default to 'year']
**taxRate** | **Number** |  | [optional] [default to 0.0]
**accountIds** | **[String]** |  | [optional] 
**returnSchedule** | **[Number]** |  | 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




