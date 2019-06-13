# AtomApi::EducationCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_amount** | **Float** | The deposit amount to meet the education goal. | 
**deposit_frequency_interval** | **String** | The period interval to be used in relation to deposit_duration. | [default to &#39;year&#39;]
**projected_accumulation_savings** | **Float** | The projected balance at the end of accumulation_horizon. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**total_cost** | **Float** | The total cost of education over the decumulation horizon, represented in future dollars. | 
**total_taxes** | **Float** | The total taxes paid on withdrawals over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, EducationCalculatorReturnDetail&gt;**](EducationCalculatorReturnDetail.md) |  | 


