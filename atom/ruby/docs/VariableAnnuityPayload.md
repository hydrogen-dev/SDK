# AtomApi::VariableAnnuityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio_tickers** | **Array&lt;String&gt;** | Portfolio tickers, referencing securities defined in the Nucleus API. | 
**portfolio_weights** | **Array&lt;Float&gt;** | Portfolio weights, corresponding to portfolio_tickers. Must sum to 1.0. | 
**accumulation_horizon** | **Integer** | The number of years until the payout phase begins. | 
**decumulation_horizon** | **Integer** | The number of years in the payout or decumulation phase. | 
**initial_balance** | **Float** | The starting balance in the annuity plan, prior to any ongoing contributions. Must be greater than or equal to 0. | 
**frequency_interval** | **String** | Unit of time associated with accumulation_horizon, decumulation_horizon, start, end, and annuity payments. | [optional] 
**deposit_schedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


