
# AnnuityCalculatorInitialBalanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflationRate** | **Float** |  |  [optional]
**annuityFrequencyInterval** | [**AnnuityFrequencyIntervalEnum**](#AnnuityFrequencyIntervalEnum) |  |  [optional]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]
**portfolioReturn** | **Float** |  | 
**createLog** | **Boolean** |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**decumulationHorizon** | **Integer** |  | 
**taxRate** | **Float** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**annuityAmount** | **Float** |  | 
**accumulationHorizon** | **Integer** |  | 


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



