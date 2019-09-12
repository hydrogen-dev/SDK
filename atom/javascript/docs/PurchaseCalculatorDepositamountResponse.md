# atom_api.PurchaseCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | **Number** | The amount to deposit in order to meet the purchase goal. | 
**depositFrequencyInterval** | **String** | The frequency interval of the deposit. | 
**adjustedGoalAmount** | **Number** | The effective goal target amount, adjusted for taxes and inflation. | 
**projectedSavingsAtPurchaseHorizon** | **Number** | The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars. | 
**totalEarnings** | **Number** | The total earnings generated over the horizon. | 
**totalContributions** | **Number** | The total contributions added over the horizon. | 
**returnDetails** | [**{String: PurchaseCalculatorReturnDetail}**](PurchaseCalculatorReturnDetail.md) |  | 


