
# AnnuityCalculatorDepositAmount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioReturn** | [**BigDecimal**](BigDecimal.md) | The annualized portfolio return | 
**initialBalance** | [**BigDecimal**](BigDecimal.md) | The initial balance of the account | 
**accumulationHorizon** | **Integer** | The number of years in the accumulation period | 
**decumulationHorizon** | **Integer** | The number of years in the accumulation period | 
**annuityAmount** | [**BigDecimal**](BigDecimal.md) | The amount of the annuity payments | 
**annuityFrequencyInterval** | [**AnnuityFrequencyIntervalEnum**](#AnnuityFrequencyIntervalEnum) | The frequency interval of the annuity |  [optional]
**inflationRate** | [**BigDecimal**](BigDecimal.md) | The annualized inflation rate |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | The tax rate on withdrawals |  [optional]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]


<a name="AnnuityFrequencyIntervalEnum"></a>
## Enum: AnnuityFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



