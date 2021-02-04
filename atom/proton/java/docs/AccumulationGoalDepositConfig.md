
# AccumulationGoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**depEndPeriod** | **Integer** |  |  [optional]
**depEndReference** | [**DepEndReferenceEnum**](#DepEndReferenceEnum) |  |  [optional]
**depFrequency** | [**DepFrequencyEnum**](#DepFrequencyEnum) |  |  [optional]
**depStartPeriod** | **Integer** |  |  [optional]
**depInflation** | **Float** |  |  [optional]
**depStartReference** | [**DepStartReferenceEnum**](#DepStartReferenceEnum) |  |  [optional]


<a name="DepEndReferenceEnum"></a>
## Enum: DepEndReferenceEnum
Name | Value
---- | -----
START | &quot;a_start&quot;
END | &quot;a_end&quot;


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


<a name="DepStartReferenceEnum"></a>
## Enum: DepStartReferenceEnum
Name | Value
---- | -----
START | &quot;a_start&quot;
END | &quot;a_end&quot;



