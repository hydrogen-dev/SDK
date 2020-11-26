# HydrogenProtonApi.AnnuityCalculatorDepositAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**annuityFrequencyInterval** | **String** |  | [optional] [default to 'year']
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 
**portfolioReturn** | **Number** |  | 
**createLog** | **Boolean** |  | [optional] [default to false]
**aggregationAccountIds** | **[String]** |  | [optional] 
**initialBalance** | **Number** |  | [optional] [default to 0.0]
**decumulationHorizon** | **Number** |  | 
**taxRate** | **Number** |  | [optional] [default to 0.0]
**accountIds** | **[String]** |  | [optional] 
**annuityAmount** | **Number** |  | 
**accumulationHorizon** | **Number** |  | 


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




