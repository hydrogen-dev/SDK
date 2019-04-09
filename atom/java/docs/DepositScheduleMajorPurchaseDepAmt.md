
# DepositScheduleMajorPurchaseDepAmt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositFrequencyInterval** | [**DepositFrequencyIntervalEnum**](#DepositFrequencyIntervalEnum) | The deposit frequency interval |  [optional]
**adjustDepositForInflation** | **Boolean** | T/F adjust deposit for inflation rate |  [optional]
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The periodic additions to the major purchase goal. If excluded, defaults to 0. |  [optional]


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
MONTH | &quot;month&quot;
QUARTER | &quot;quarter&quot;
WEEK | &quot;week&quot;



