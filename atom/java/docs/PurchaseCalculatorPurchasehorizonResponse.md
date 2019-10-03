
# PurchaseCalculatorPurchasehorizonResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseHorizon** | **Integer** | The number of periods needed in order to meet the major purchase goal. | 
**purchaseHorizonFrequencyInterval** | **String** | The unit of time associated with purchase_horizon. | 
**adjustedGoalAmount** | [**BigDecimal**](BigDecimal.md) | The effective goal target amount, adjusted for taxes and inflation. | 
**projectedSavingsAtPurchaseHorizon** | [**BigDecimal**](BigDecimal.md) | The total amount of savings that are projected to be available at the major purchase date, expressed in today’s dollars. | 
**totalEarnings** | [**BigDecimal**](BigDecimal.md) | The total earnings generated over the horizon. | 
**totalContributions** | [**BigDecimal**](BigDecimal.md) | The total contributions added over the horizon. | 
**returnDetails** | [**Map&lt;String, PurchaseCalculatorReturnDetail&gt;**](PurchaseCalculatorReturnDetail.md) |  | 



