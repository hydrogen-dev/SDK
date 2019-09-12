# PurchaseCalculatorPurchasehorizonResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchase_horizon** | **int** | The number of periods needed in order to meet the major purchase goal. | 
**purchase_horizon_frequency_interval** | **str** | The unit of time associated with purchase_horizon. | 
**adjusted_goal_amount** | **float** | The effective goal target amount, adjusted for taxes and inflation. | 
**projected_savings_at_purchase_horizon** | **float** | The total amount of savings that are projected to be available at the major purchase date, expressed in today’s dollars. | 
**total_earnings** | **float** | The total earnings generated over the horizon. | 
**total_contributions** | **float** | The total contributions added over the horizon. | 
**return_details** | [**dict(str, PurchaseCalculatorReturnDetail)**](PurchaseCalculatorReturnDetail.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


