# AtomApi::PurchaseCalculatorPurchasehorizonResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchase_horizon** | **Integer** | The number of periods needed in order to meet the major purchase goal. | 
**purchase_horizon_frequency_interval** | **String** | The unit of time associated with purchase_horizon. | 
**adjusted_goal_amount** | **Float** | The effective goal target amount, adjusted for taxes and inflation. | 
**projected_savings_at_purchase_horizon** | **Float** | The total amount of savings that are projected to be available at the major purchase date, expressed in today’s dollars. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**return_details** | [**Hash&lt;String, PurchaseCalculatorReturnDetail&gt;**](PurchaseCalculatorReturnDetail.md) |  | 


