
# GoalWithdrawalConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withStartReference** | [**WithStartReferenceEnum**](#WithStartReferenceEnum) | The reference for the starting point of the withdrawal |  [optional]
**withStartPeriod** | **Integer** | The starting period for the withdrawal |  [optional]
**withEndReference** | [**WithEndReferenceEnum**](#WithEndReferenceEnum) | The reference for the ending point of the withdrawal |  [optional]
**withEndPeriod** | **Integer** | The ending point for the withdrawal |  [optional]
**withAmount** | [**BigDecimal**](BigDecimal.md) | The withdrawal amount in today&#39;s dollars | 
**withFrequency** | [**WithFrequencyEnum**](#WithFrequencyEnum) | The frequency of the withdrawal |  [optional]
**withInflation** | [**BigDecimal**](BigDecimal.md) | The annualized inflation for the withdrawals |  [optional]


<a name="WithStartReferenceEnum"></a>
## Enum: WithStartReferenceEnum
Name | Value
---- | -----
A_END | &quot;a_end&quot;
D_END | &quot;d_end&quot;


<a name="WithEndReferenceEnum"></a>
## Enum: WithEndReferenceEnum
Name | Value
---- | -----
A_END | &quot;a_end&quot;
D_END | &quot;d_end&quot;


<a name="WithFrequencyEnum"></a>
## Enum: WithFrequencyEnum
Name | Value
---- | -----
YEAR | &quot;year&quot;
SIX_MONTHS | &quot;six_months&quot;
QUARTER | &quot;quarter&quot;
MONTH | &quot;month&quot;
TWO_WEEKS | &quot;two_weeks&quot;
WEEK | &quot;week&quot;
DAY | &quot;day&quot;



