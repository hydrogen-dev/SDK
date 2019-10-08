# AtomApi::PurchaseCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_amount** | **Float** | The amount to deposit in order to meet the purchase goal. | 
**deposit_frequency_interval** | **String** | The frequency interval of the deposit. | 
**adjusted_goal_amount** | **Float** | The effective goal target amount, adjusted for taxes and inflation. | 
**projected_savings_at_purchase_horizon** | **Float** | The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**return_details** | [**Hash&lt;String, PurchaseCalculatorReturnDetail&gt;**](PurchaseCalculatorReturnDetail.md) |  | 


