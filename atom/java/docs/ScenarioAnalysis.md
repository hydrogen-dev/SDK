
# ScenarioAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** | A list of symbols for securities in the portfolio | 
**portfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  | 
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) | Frequency interval for returns, change_duration, and lag | 
**scenario** | [**List&lt;SensitivityFactor&gt;**](SensitivityFactor.md) |  | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date of data |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date of data |  [optional]
**tradingDaysPerYear** | **Integer** | Number of trading days per year, used in calculations |  [optional]
**useProxyData** | **Boolean** | If true, incorporate proxy price data as defined at the Security level in the Nucleus API. Proxy data is merged with base security data to form a continuous price history. Defaults to false. |  [optional]


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



