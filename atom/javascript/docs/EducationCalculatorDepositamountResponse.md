# atom_api.EducationCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**depositAmount** | **Number** | The deposit amount to meet the education goal. | 
**depositFrequencyInterval** | **String** | The period interval to be used in relation to deposit_duration. | [default to &#39;year&#39;]
**projectedAccumulationSavings** | **Number** | The projected balance at the end of accumulation_horizon. | 
**totalEarnings** | **Number** | The total earnings generated over the horizon. | 
**totalContributions** | **Number** | The total contributions added over the horizon. | 
**totalCost** | **Number** | The total cost of education over the decumulation horizon, represented in future dollars. | 
**totalTaxes** | **Number** | The total taxes paid on withdrawals over decumulation_horizon. | 
**returnDetails** | [**{String: EducationCalculatorReturnDetail}**](EducationCalculatorReturnDetail.md) |  | 


<a name="DepositFrequencyIntervalEnum"></a>
## Enum: DepositFrequencyIntervalEnum


* `year` (value: `"year"`)

* `quarter` (value: `"quarter"`)

* `month` (value: `"month"`)

* `week` (value: `"week"`)




