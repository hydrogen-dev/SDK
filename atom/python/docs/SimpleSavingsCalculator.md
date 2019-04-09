# SimpleSavingsCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial_balance** | **float** | The initial savings balance | 
**horizon** | **int** | The savings horizon | 
**return_schedule** | **list[float]** | The return schedule for the given horizon | 
**horizon_frequency_interval** | **str** | The frequency interval for the horizon | [optional] [default to 'year']
**deposit_schedule** | [**list[DepositSchedule]**](DepositSchedule.md) | The deposit schedule | [optional] 
**tax_rate** | **float** | The tax rate to be applied to investment earnings | [optional] 
**inflation_rate** | **float** | The inflation rate | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


