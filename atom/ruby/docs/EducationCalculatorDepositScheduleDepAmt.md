# AtomApi::EducationCalculatorDepositScheduleDepAmt

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_frequency_interval** | **String** | The period interval to be used in relation to the deposit_amount. | [optional] [default to &#39;year&#39;]
**adjust_deposit_for_inflation** | **BOOLEAN** | If true, the deposits should be increased over time with the rate of inflation. If excluded, defaults to true. | [optional] [default to true]
**deposit_amount** | **Float** | The amount deposited per a given period &amp; number of intervals. Deposits are assumed to continue through the length of accumulation_horizon and decumulation_horizon. If excluded, defaults to 0. | [optional] 


