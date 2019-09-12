# atom_api.PurchaseCalculatorPurchasehorizonResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseHorizon** | **Number** | The number of periods needed in order to meet the major purchase goal. | 
**purchaseHorizonFrequencyInterval** | **String** | The unit of time associated with purchase_horizon. | 
**adjustedGoalAmount** | **Number** | The effective goal target amount, adjusted for taxes and inflation. | 
**projectedSavingsAtPurchaseHorizon** | **Number** | The total amount of savings that are projected to be available at the major purchase date, expressed in today’s dollars. | 
**totalEarnings** | **Number** | The total earnings generated over the horizon. | 
**totalContributions** | **Number** | The total contributions added over the horizon. | 
**returnDetails** | [**{String: PurchaseCalculatorReturnDetail}**](PurchaseCalculatorReturnDetail.md) |  | 


