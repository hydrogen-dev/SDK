# RebalanceSignal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_date** | **str** | The date of the given rebalancing signal. | 
**ticker** | **str** | The unique identifier of a given security. | 
**signal** | **str** | The trade action, either BUY or SELL. | 
**amount** | **float** | The amount of the trade as a percentage. For example, amount &#x3D; 0.02 translates to selling 2% of a given ticker. | 
**type** | **int** | The type of trade signal. 1 &#x3D; period-based, 2 &#x3D; drift-based, and 4 &#x3D; downside protection. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


