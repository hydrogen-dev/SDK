
# PurchaseCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | [**BigDecimal**](BigDecimal.md) | The amount to deposit in order to meet the purchase goal. | 
**depositFrequencyInterval** | **String** | The frequency interval of the deposit. | 
**adjustedGoalAmount** | [**BigDecimal**](BigDecimal.md) | The effective goal target amount, adjusted for taxes and inflation. | 
**projectedSavingsAtPurchaseHorizon** | [**BigDecimal**](BigDecimal.md) | The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars. | 
**totalEarnings** | [**BigDecimal**](BigDecimal.md) | The total earnings generated over the horizon. | 
**totalContributions** | [**BigDecimal**](BigDecimal.md) | The total contributions added over the horizon. | 
**returnDetails** | [**Map&lt;String, PurchaseCalculatorReturnDetail&gt;**](PurchaseCalculatorReturnDetail.md) |  | 



