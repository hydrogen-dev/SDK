
# AccumulationGoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depEndReference** | [**DepEndReferenceEnum**](#DepEndReferenceEnum) |  |  [optional]
**depInflation** | **Float** |  |  [optional]
**depAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**depStartReference** | [**DepStartReferenceEnum**](#DepStartReferenceEnum) |  |  [optional]
**depFrequency** | [**DepFrequencyEnum**](#DepFrequencyEnum) |  |  [optional]
**depEndPeriod** | **Integer** |  |  [optional]
**depStartPeriod** | **Integer** |  |  [optional]


<a name="DepEndReferenceEnum"></a>
## Enum: DepEndReferenceEnum
Name | Value
---- | -----
START | &quot;a_start&quot;
END | &quot;a_end&quot;


<a name="DepStartReferenceEnum"></a>
## Enum: DepStartReferenceEnum
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



