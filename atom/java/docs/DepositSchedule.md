
# DepositSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The periodic deposit amount |  [optional]
**depositFrequencyInterval** | [**DepositFrequencyIntervalEnum**](#DepositFrequencyIntervalEnum) | The deposit frequency interval |  [optional]
**depositDuration** | **Integer** | The duration of the deposits |  [optional]
**adjustDepositForInflation** | **Boolean** | T/F adjust deposit for inflation rate |  [optional]


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
WEEK | &quot;week&quot;



