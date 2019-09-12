# AtomApi::GuaranteedRateBenefitSubpayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **Integer** | The starting period for the guarantee, where 1 indicates the first period in accumulation_horizon. Must be greater than or equal to 1. Defaults to 1. | [optional] 
**_end** | **Integer** | The ending period for the guarantee. Must be less than or equal to the sum of accumulation_horizon and decumulation_horizon. Defaults to the sum of accumulation_horizon and decumulation_horizon. | [optional] 
**min_rate** | **Float** | The minimum allowable rate. Must be less than or equal to max_rate. | [optional] 
**max_rate** | **Float** | The minimum allowable rate. Must be greater than or equal to min_rate. | [optional] 


