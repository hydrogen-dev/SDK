
# VariableAnnuityPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** | Portfolio tickers, referencing securities defined in the Nucleus API. | 
**portfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | Portfolio weights, corresponding to portfolio_tickers. Must sum to 1.0. | 
**accumulationHorizon** | **Integer** | The number of years until the payout phase begins. | 
**decumulationHorizon** | **Integer** | The number of years in the payout or decumulation phase. | 
**initialBalance** | [**BigDecimal**](BigDecimal.md) | The starting balance in the annuity plan, prior to any ongoing contributions. Must be greater than or equal to 0. | 
**frequencyInterval** | **String** | Unit of time associated with accumulation_horizon, decumulation_horizon, start, end, and annuity payments. |  [optional]
**depositSchedule** | [**AnnuityDepositSchedule**](AnnuityDepositSchedule.md) |  |  [optional]
**inflationRate** | [**BigDecimal**](BigDecimal.md) | The annualized rate of inflation. Defaults to 0. |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | The tax rate applied to annuity payouts. Defaults to 0. |  [optional]
**annuitizationRate** | [**BigDecimal**](BigDecimal.md) | The discount rate used to calculate annuity payout amounts during decumulation_horizon. Defaults to 0. |  [optional]
**guaranteedRateBenefit** | [**List&lt;GuaranteedRateBenefitSubpayload&gt;**](GuaranteedRateBenefitSubpayload.md) | Boundaries enforced on the plan&#39;s rate of return. |  [optional]
**guaranteedAccumulationBenefit** | [**BigDecimal**](BigDecimal.md) | A guaranteed lower bound for the plan balance at the end of accumulation_horizon. |  [optional]
**n** | **Integer** | The number of Monte Carlo simulations to run. Defaults to 1000. |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) | The type of Monte Carlo result to output. Must be one of mean, median, or custom. Defaults to median. |  [optional]
**p** | [**BigDecimal**](BigDecimal.md) | A result percentile to output, applicable when result_type is custom. Must be between 0 and 100 inclusive. Defaults to 50. |  [optional]
**removeOutliers** | **Boolean** | If true, remove outlying results. If true, outlier analysis is performed on a median absolute deviation (MAD) basis, at the 2.5 threshold. Defaults to false. |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | Start date used for ticker price history. Defaults to the earliest common date among portfolio_tickers prices. |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date used for ticker price history. Defaults to the latest common date among portfolio_tickers prices. |  [optional]
**tradingDaysPerYear** | **Integer** | The number of days per year for which a portfolio is subject to market fluctuation. Defaults to 252. |  [optional]
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. |  [optional]


<a name="ResultTypeEnum"></a>
## Enum: ResultTypeEnum
Name | Value
---- | -----
MEAN | &quot;mean&quot;
MEDIAN | &quot;median&quot;
CUSTOM | &quot;custom&quot;



