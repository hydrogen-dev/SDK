# PurchaseCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_amount** | **float** | The amount to deposit in order to meet the purchase goal. | 
**deposit_frequency_interval** | **str** | The frequency interval of the deposit. | 
**adjusted_goal_amount** | **float** | The effective goal target amount, adjusted for taxes and inflation. | 
**projected_savings_at_purchase_horizon** | **float** | The total amount of savings that are projected to be available at the final horizon, expressed in today’s dollars. | 
**total_earnings** | **float** | The total earnings generated over the horizon. | 
**total_contributions** | **float** | The total contributions added over the horizon. | 
**return_details** | [**dict(str, PurchaseCalculatorReturnDetail)**](PurchaseCalculatorReturnDetail.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


