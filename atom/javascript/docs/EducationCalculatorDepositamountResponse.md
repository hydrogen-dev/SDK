# atom_api.EducationCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | **Number** | The deposit amount to meet the education goal. | 
**depositFrequencyInterval** | **String** | The period interval to be used in relation to deposit_duration. | [default to &#39;year&#39;]
**totalCost** | **Number** | The total cost of education over the decumulation horizon, represented in future dollars. | 
**returnDetails** | [**{String: EducationCalculatorReturnDetail}**](EducationCalculatorReturnDetail.md) |  | 


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)




