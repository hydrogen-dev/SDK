# atom_api.PurchaseCalculatorDepositAmount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseHorizon** | **Number** | The purchase horizon, in years | 
**purchaseAmount** | **Number** | The amount of the purchase | 
**portfolioReturn** | **Number** | The annualized portfolio return | 
**horizonFrequencyInterval** | **String** | The horizon frequency interval | [optional] [default to &#39;year&#39;]
**currentSavings** | **Number** | The current savings amount | [optional] 
**depositSchedule** | **Object** |  | [optional] 
**inflationRate** | **Number** | The inflation rate | [optional] 
**investmentTax** | **Number** | The tax on investments used for the major purchase | [optional] 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)




