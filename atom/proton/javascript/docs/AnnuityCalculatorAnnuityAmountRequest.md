# HydrogenProtonApi.AnnuityCalculatorAnnuityAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annuityAmount** | **Number** |  | [optional] [default to 1.0]
**aggregationAccountIds** | **[String]** |  | [optional] 
**taxRate** | **Number** |  | [optional] [default to 0.0]
**accountIds** | **[String]** |  | [optional] 
**initialBalance** | **Number** |  | [optional] [default to 0.0]
**createLog** | **Boolean** |  | [optional] [default to false]
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**decumulationHorizon** | **Number** |  | 
**accumulationHorizon** | **Number** |  | 
**annuityFrequencyInterval** | **String** |  | [optional] [default to 'year']
**portfolioReturn** | **Number** |  | 
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




