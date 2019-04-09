# EducationCalculatorDepositScheduleDepAmt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_frequency_interval** | **str** | The period interval to be used in relation to the deposit_amount. | [optional] [default to 'year']
**adjust_deposit_for_inflation** | **bool** | If true, the deposits should be increased over time with the rate of inflation. If excluded, defaults to true. | [optional] [default to True]
**deposit_amount** | **float** | The amount deposited per a given period &amp; number of intervals. Deposits are assumed to continue through the length of accumulation_horizon and decumulation_horizon. If excluded, defaults to 0. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


