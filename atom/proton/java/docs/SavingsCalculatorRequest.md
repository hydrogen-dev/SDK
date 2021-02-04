
# SavingsCalculatorRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**taxRate** | **Float** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**initialBalance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**createLog** | **Boolean** |  |  [optional]
**inflationRate** | **Float** |  |  [optional]
**horizon** | **Integer** |  | 
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) |  |  [optional]
**depositSchedule** | [**List&lt;SavingsDepositSchedule&gt;**](SavingsDepositSchedule.md) |  |  [optional]
**returnSchedule** | **List&lt;Float&gt;** |  | 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



