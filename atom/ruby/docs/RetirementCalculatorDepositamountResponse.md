# AtomApi::RetirementCalculatorDepositamountResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deposit_amount** | **Float** | The amount to deposit in order to meet the retirement goal. | 
**deposit_frequency_interval** | **String** | The frequency interval of the deposit. | 
**projected_savings_at_retirement** | **Float** | The total amount of savings projected to be available at retirement, expressed in today’s dollars. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**total_withdrawals** | **Float** | The total amount of withdrawals taken over decumulation_horizon. | 
**total_taxes** | **Float** | The total taxes paid on withdrawals over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, RetirementReturnDetail&gt;**](RetirementReturnDetail.md) |  | 


