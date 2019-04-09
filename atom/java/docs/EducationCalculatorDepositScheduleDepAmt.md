
# EducationCalculatorDepositScheduleDepAmt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositFrequencyInterval** | [**DepositFrequencyIntervalEnum**](#DepositFrequencyIntervalEnum) | The period interval to be used in relation to the deposit_amount. |  [optional]
**adjustDepositForInflation** | **Boolean** | If true, the deposits should be increased over time with the rate of inflation. If excluded, defaults to true. |  [optional]
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The amount deposited per a given period &amp; number of intervals. Deposits are assumed to continue through the length of accumulation_horizon and decumulation_horizon. If excluded, defaults to 0. |  [optional]


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



