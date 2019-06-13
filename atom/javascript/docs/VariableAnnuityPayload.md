# atom_api.VariableAnnuityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **[String]** | Portfolio tickers, referencing securities defined in the Nucleus API. | 
**portfolioWeights** | **[Number]** | Portfolio weights, corresponding to portfolio_tickers. Must sum to 1.0. | 
**accumulationHorizon** | **Number** | The number of years until the payout phase begins. | 
**decumulationHorizon** | **Number** | The number of years in the payout or decumulation phase. | 
**initialBalance** | **Number** | The starting balance in the annuity plan, prior to any ongoing contributions. Must be greater than or equal to 0. | 
**frequencyInterval** | **String** | Unit of time associated with accumulation_horizon, decumulation_horizon, start, end, and annuity payments. | [optional] 
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  | [optional] 


