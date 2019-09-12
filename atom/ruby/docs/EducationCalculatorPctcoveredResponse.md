# AtomApi::EducationCalculatorPctcoveredResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievable_cost** | **Float** | The annual cost that can be covered, expressed in today&#39;s dollars. | 
**target_cost** | **Float** | The total_annual_cost input representing the target annual goal amount. | 
**percent_of_costs_covered** | **Float** | The percentage of total_annual_cost that can be paid for, given the other inputs provided by the user. | 
**projected_accumulation_savings** | **Float** | The projected balance at the end of accumulation_horizon | 
**total_earnings** | **Float** | The total earnings generated over the horizon | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**total_cost** | **Float** | The total cost of education over the decumulation horizon, represented in future dollars. | 
**total_taxes** | **Float** | The total taxes paid on withdrawals over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, EducationCalculatorReturnDetail&gt;**](EducationCalculatorReturnDetail.md) |  | 


