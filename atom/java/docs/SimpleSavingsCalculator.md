
# SimpleSavingsCalculator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initialBalance** | [**BigDecimal**](BigDecimal.md) | The initial savings balance | 
**horizon** | **Integer** | The savings horizon | 
**returnSchedule** | [**List&lt;BigDecimal&gt;**](BigDecimal.md) | The return schedule for the given horizon | 
**horizonFrequencyInterval** | [**HorizonFrequencyIntervalEnum**](#HorizonFrequencyIntervalEnum) | The frequency interval for the horizon |  [optional]
**depositSchedule** | [**List&lt;DepositSchedule&gt;**](DepositSchedule.md) | The deposit schedule |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | The tax rate to be applied to investment earnings |  [optional]
**inflationRate** | [**BigDecimal**](BigDecimal.md) | The inflation rate |  [optional]


<a name="HorizonFrequencyIntervalEnum"></a>
## Enum: HorizonFrequencyIntervalEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



