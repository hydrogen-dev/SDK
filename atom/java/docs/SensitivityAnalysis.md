
# SensitivityAnalysis

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioTickers** | **List&lt;String&gt;** | A list of symbols for securities in the portfolio | 
**portfolioWeights** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) |  | 
**frequencyInterval** | [**FrequencyIntervalEnum**](#FrequencyIntervalEnum) | Frequency interval for returns, change_duration, and lag | 
**sensitivityFactor** | **Object** |  | 
**startDate** | [**LocalDate**](LocalDate.md) | Start date of data |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | End date of data |  [optional]
**tradingDaysPerYear** | **Integer** | Number of trading days per year, used in calculations |  [optional]


<a name="FrequencyIntervalEnum"></a>
## Enum: FrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



