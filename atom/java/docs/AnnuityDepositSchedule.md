
# AnnuityDepositSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | [**BigDecimal**](BigDecimal.md) | Amount deposited each period |  [optional]
**depositFrequencyInterval** | [**DepositFrequencyIntervalEnum**](#DepositFrequencyIntervalEnum) | Time interval between each period |  [optional]
**adjustDepositForInflation** | **Boolean** | If true, adjust deposit for inflation |  [optional]


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



