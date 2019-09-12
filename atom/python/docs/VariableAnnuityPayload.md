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
**inflation_rate** | **float** | The annualized rate of inflation. Defaults to 0. | [optional] 
**tax_rate** | **float** | The tax rate applied to annuity payouts. Defaults to 0. | [optional] 
**annuitization_rate** | **float** | The discount rate used to calculate annuity payout amounts during decumulation_horizon. Defaults to 0. | [optional] 
**guaranteed_rate_benefit** | [**list[GuaranteedRateBenefitSubpayload]**](GuaranteedRateBenefitSubpayload.md) | Boundaries enforced on the plan&#39;s rate of return. | [optional] 
**guaranteed_accumulation_benefit** | **float** | A guaranteed lower bound for the plan balance at the end of accumulation_horizon. | [optional] 
**n** | **int** | The number of Monte Carlo simulations to run. Defaults to 1000. | [optional] 
**result_type** | **str** | The type of Monte Carlo result to output. Must be one of mean, median, or custom. Defaults to median. | [optional] [default to 'median']
**p** | **float** | A result percentile to output, applicable when result_type is custom. Must be between 0 and 100 inclusive. Defaults to 50. | [optional] 
**remove_outliers** | **bool** | If true, remove outlying results. If true, outlier analysis is performed on a median absolute deviation (MAD) basis, at the 2.5 threshold. Defaults to false. | [optional] [default to False]
**start_date** | **date** | Start date used for ticker price history. Defaults to the earliest common date among portfolio_tickers prices. | [optional] 
**end_date** | **date** | End date used for ticker price history. Defaults to the latest common date among portfolio_tickers prices. | [optional] 
**trading_days_per_year** | **int** | The number of days per year for which a portfolio is subject to market fluctuation. Defaults to 252. | [optional] 
**use_proxy_data** | **bool** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to False]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


