
# AnnuityCalculatorDecumulationHorizonRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annuityAmount** | **Float** |  | 
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**decumulationHorizon** | **Integer** |  |  [optional]
**accumulationHorizon** | **Integer** |  | 
**annuityFrequencyInterval** | [**AnnuityFrequencyIntervalEnum**](#AnnuityFrequencyIntervalEnum) |  |  [optional]
**portfolioReturn** | **Float** |  | 
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



