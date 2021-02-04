
# PurchaseCalculatorDepositAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseAmount** | **Float** |  | 
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**currentSavings** | **Float** |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**investmentTax** | **Float** |  |  [optional]
**purchaseHorizon** | **Integer** |  | 
**inflationRate** | **Float** |  |  [optional]
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) |  |  [optional]
**portfolioReturn** | **Float** |  | 
**depositSchedule** | [**CalculatorDepositSchedule**](CalculatorDepositSchedule.md) |  |  [optional]


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



