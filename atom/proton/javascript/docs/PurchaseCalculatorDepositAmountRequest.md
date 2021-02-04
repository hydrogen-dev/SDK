# HydrogenProtonApi.PurchaseCalculatorDepositAmountRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseAmount** | **Number** |  | 
**aggregationAccountIds** | **[String]** |  | [optional] 
**currentSavings** | **Number** |  | [optional] [default to 0.0]
**accountIds** | **[String]** |  | [optional] 
**investmentTax** | **Number** |  | [optional] [default to 0.0]
**purchaseHorizon** | **Number** |  | 
**inflationRate** | **Number** |  | [optional] [default to 0.0]
**horizonFrequencyInterval** | **String** |  | [optional] [default to 'year']
**portfolioReturn** | **Number** |  | 
**depositSchedule** | [**CalculatorDepositSchedule**](CalculatorDepositSchedule.md) |  | [optional] 


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)




