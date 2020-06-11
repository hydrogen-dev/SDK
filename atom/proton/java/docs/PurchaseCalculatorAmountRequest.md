
# PurchaseCalculatorAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositSchedule** | **Object** |  |  [optional]
**portfolioReturn** | **Float** |  | 
**inflationRate** | **Float** |  |  [optional]
**investmentTax** | **Float** |  |  [optional]
**purchaseHorizon** | **Integer** |  | 
**aggregationAccountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**accountIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**currentSavings** | **Float** |  |  [optional]
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) |  |  [optional]


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;



