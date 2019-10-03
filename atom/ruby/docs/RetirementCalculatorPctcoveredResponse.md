# AtomApi::RetirementCalculatorPctcoveredResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**achievable_expenses** | **Float** | The annual retirement expenses that can be covered, expressed in today&#39;s dollars. | 
**target_expenses** | **Float** | The retirement_expenses input representing the target annual goal amount. | 
**percent_of_expenses_covered** | **Float** | The percentage of expenses covered, given the other user inputs. | 
**projected_savings_at_retirement** | **Float** | The total amount of savings projected to be available at retirement, expressed in today’s dollars. | 
**total_earnings** | **Float** | The total earnings generated over the horizon. | 
**total_contributions** | **Float** | The total contributions added over the horizon. | 
**total_withdrawals** | **Float** | The total amount of withdrawals taken over decumulation_horizon. | 
**total_taxes** | **Float** | The total taxes paid on withdrawals over decumulation_horizon. | 
**return_details** | [**Hash&lt;String, RetirementReturnDetail&gt;**](RetirementReturnDetail.md) |  | 


