# atom_api.GoalWithdrawalConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withStartReference** | **String** | The reference for the starting point of the withdrawal | [optional] [default to &#39;a_end&#39;]
**withStartPeriod** | **Number** | The starting period for the withdrawal | [optional] 
**withEndReference** | **String** | The reference for the ending point of the withdrawal | [optional] [default to &#39;d_end&#39;]
**withEndPeriod** | **Number** | The ending point for the withdrawal | [optional] 
**withAmount** | **Number** | The withdrawal amount in today&#39;s dollars | 
**withFrequency** | **String** | The frequency of the withdrawal | [optional] [default to &#39;year&#39;]
**withInflation** | **Number** | The annualized inflation for the withdrawals | [optional] 


<a name="WithStartReferenceEnum"></a>
## Enum: WithStartReferenceEnum


* `a_end` (value: `"a_end"`)

* `d_end` (value: `"d_end"`)




<a name="WithEndReferenceEnum"></a>
## Enum: WithEndReferenceEnum


* `a_end` (value: `"a_end"`)

* `d_end` (value: `"d_end"`)




<a name="WithFrequencyEnum"></a>
## Enum: WithFrequencyEnum


* `year` (value: `"year"`)

* `six_months` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `two_weeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




