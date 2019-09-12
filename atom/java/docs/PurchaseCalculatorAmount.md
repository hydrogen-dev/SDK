
# PurchaseCalculatorAmount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseHorizon** | **Integer** | The purchase horizon, in years | 
**portfolioReturn** | [**BigDecimal**](BigDecimal.md) | The annualized portfolio return | 
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) | The horizon frequency interval |  [optional]
**currentSavings** | [**BigDecimal**](BigDecimal.md) | The current savings amount |  [optional]
**depositSchedule** | [**DepositScheduleMajorPurchaseDepAmt**](DepositScheduleMajorPurchaseDepAmt.md) |  |  [optional]
**inflationRate** | [**BigDecimal**](BigDecimal.md) | The inflation rate |  [optional]
**investmentTax** | [**BigDecimal**](BigDecimal.md) | The tax on investments used for the major purchase |  [optional]


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



