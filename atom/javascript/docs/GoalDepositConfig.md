# atom_api.GoalDepositConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depStartReference** | **String** | The reference for the starting point of the deposit. May be a_start or a_end, which refer to the start of the accumulation phase and the end of the accumulation phase, respectively. Defaults to a_start. | [optional] [default to &#39;a_start&#39;]
**depStartPeriod** | **Number** | The starting period for the deposit | [optional] 
**depEndReference** | **String** | The reference for the ending point of the deposit | [optional] [default to &#39;a_end&#39;]
**depEndPeriod** | **Number** | The ending point for the deposit | [optional] 
**depAmount** | **Number** | The deposit amount in present dollars | [optional] 
**depFrequency** | **String** | The frequency of the deposit | [optional] [default to &#39;year&#39;]
**depInflation** | **Number** | The annualized inflation for the deposits | [optional] 


<a name="DepStartReferenceEnum"></a>
## Enum: DepStartReferenceEnum


* `start` (value: `"a_start"`)

* `end` (value: `"a_end"`)




<a name="DepEndReferenceEnum"></a>
## Enum: DepEndReferenceEnum


* `a_start` (value: `"a_start"`)

* `a_end` (value: `"a_end"`)

* `d_end` (value: `"d_end"`)




<a name="DepFrequencyEnum"></a>
## Enum: DepFrequencyEnum


* `year` (value: `"year"`)

* `six_months` (value: `"six_months"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `two_weeks` (value: `"two_weeks"`)

* `week` (value: `"week"`)

* `day` (value: `"day"`)




