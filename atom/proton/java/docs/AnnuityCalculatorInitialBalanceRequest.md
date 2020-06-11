
# AnnuityCalculatorInitialBalanceRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decumulationHorizon** | **Integer** |  | 
**annuityAmount** | **Float** |  | 
**depositSchedule** | **Object** |  |  [optional]
**initialBalance** | **Float** |  |  [optional]
**portfolioReturn** | **Float** |  | 
**taxRate** | **Float** |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**accumulationHorizon** | **Integer** |  | 
**annuityFrequencyInterval** | [**AnnuityFrequencyIntervalEnum**](#AnnuityFrequencyIntervalEnum) |  |  [optional]


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



