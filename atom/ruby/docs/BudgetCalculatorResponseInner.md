# AtomApi::BudgetCalculatorResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_id** | **String** | The ID of the budget | [optional] 
**budget_name** | **String** | The name of the budget | [optional] 
**total_funds_available** | **Float** | Total amount of funds originally available in the budget | [optional] 
**total_funds_spent** | **Float** | Total amount of funds spent | [optional] 
**total_funds_remaining** | **Float** | Total amount of funds remaining; delta of total_funds_available - total_funds_spent | [optional] 
**budget_components** | [**Array&lt;BudgetCalculatorResponseInnerBudgetComponents&gt;**](BudgetCalculatorResponseInnerBudgetComponents.md) | Total funds spent per category | [optional] 
**average_amount_budgeted** | **Float** | Average amount budgeted for each budget component | [optional] 
**average_amount_spent** | **Float** | Average amount spent for each budget component | [optional] 


