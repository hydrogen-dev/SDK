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
**inflation_rate** | **Float** | The annualized rate of inflation. Defaults to 0. | [optional] 
**tax_rate** | **Float** | The tax rate applied to annuity payouts. Defaults to 0. | [optional] 
**annuitization_rate** | **Float** | The discount rate used to calculate annuity payout amounts during decumulation_horizon. Defaults to 0. | [optional] 
**guaranteed_rate_benefit** | [**Array&lt;GuaranteedRateBenefitSubpayload&gt;**](GuaranteedRateBenefitSubpayload.md) | Boundaries enforced on the plan&#39;s rate of return. | [optional] 
**guaranteed_accumulation_benefit** | **Float** | A guaranteed lower bound for the plan balance at the end of accumulation_horizon. | [optional] 
**n** | **Integer** | The number of Monte Carlo simulations to run. Defaults to 1000. | [optional] 
**result_type** | **String** | The type of Monte Carlo result to output. Must be one of mean, median, or custom. Defaults to median. | [optional] [default to &#39;median&#39;]
**p** | **Float** | A result percentile to output, applicable when result_type is custom. Must be between 0 and 100 inclusive. Defaults to 50. | [optional] 
**remove_outliers** | **BOOLEAN** | If true, remove outlying results. If true, outlier analysis is performed on a median absolute deviation (MAD) basis, at the 2.5 threshold. Defaults to false. | [optional] [default to false]
**start_date** | **Date** | Start date used for ticker price history. Defaults to the earliest common date among portfolio_tickers prices. | [optional] 
**end_date** | **Date** | End date used for ticker price history. Defaults to the latest common date among portfolio_tickers prices. | [optional] 
**trading_days_per_year** | **Integer** | The number of days per year for which a portfolio is subject to market fluctuation. Defaults to 252. | [optional] 
**use_proxy_data** | **BOOLEAN** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. | [optional] [default to false]


