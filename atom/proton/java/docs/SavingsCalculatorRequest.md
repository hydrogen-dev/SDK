
# SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositSchedule** | [**List&lt;SavingsDepositSchedule&gt;**](SavingsDepositSchedule.md) |  |  [optional]
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) |  |  [optional]
**initialBalance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**returnSchedule** | **List&lt;Float&gt;** |  | 
**taxRate** | **Float** |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**horizon** | **Integer** |  | 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



