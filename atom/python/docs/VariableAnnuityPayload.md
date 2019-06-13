# VariableAnnuityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_tickers** | **list[str]** | Portfolio tickers, referencing securities defined in the Nucleus API. | 
**portfolio_weights** | **list[float]** | Portfolio weights, corresponding to portfolio_tickers. Must sum to 1.0. | 
**accumulation_horizon** | **int** | The number of years until the payout phase begins. | 
**decumulation_horizon** | **int** | The number of years in the payout or decumulation phase. | 
**initial_balance** | **float** | The starting balance in the annuity plan, prior to any ongoing contributions. Must be greater than or equal to 0. | 
**frequency_interval** | **str** | Unit of time associated with accumulation_horizon, decumulation_horizon, start, end, and annuity payments. | [optional] 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


