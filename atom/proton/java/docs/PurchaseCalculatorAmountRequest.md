
# PurchaseCalculatorAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inflationRate** | **Float** |  |  [optional]
**purchaseHorizon** | **Integer** |  | 
**investmentTax** | **Float** |  |  [optional]
**depositSchedule** | [**CalculatorDepositSchedule1**](CalculatorDepositSchedule1.md) |  |  [optional]
**portfolioReturn** | **Float** |  | 
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**currentSavings** | **Float** |  |  [optional]


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



