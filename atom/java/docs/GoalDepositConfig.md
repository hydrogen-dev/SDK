
# GoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depStartReference** | [**DepStartReferenceEnum**](#DepStartReferenceEnum) | The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start. |  [optional]
**depStartPeriod** | **Integer** | The starting period for the deposit |  [optional]
**depEndReference** | [**DepEndReferenceEnum**](#DepEndReferenceEnum) | The reference for the ending point of the deposit |  [optional]
**depEndPeriod** | **Integer** | The ending point for the deposit |  [optional]
**depAmount** | [**BigDecimal**](BigDecimal.md) | The deposit amount in present dollars |  [optional]
**depFrequency** | [**DepFrequencyEnum**](#DepFrequencyEnum) | The frequency of the deposit |  [optional]
**depInflation** | [**BigDecimal**](BigDecimal.md) | The annualized inflation for the deposits |  [optional]


<a name="DepStartReferenceEnum"></a>
## Enum: DepStartReferenceEnum
Name | Value
---- | -----
START | &quot;a_start&quot;
END | &quot;a_end&quot;


<a name="DepEndReferenceEnum"></a>
## Enum: DepEndReferenceEnum
Name | Value
---- | -----
A_START | &quot;a_start&quot;
A_END | &quot;a_end&quot;
D_END | &quot;d_end&quot;


<a name="DepFrequencyEnum"></a>
## Enum: DepFrequencyEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



