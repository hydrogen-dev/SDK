# AtomApi::BudgetCalculatorResponseBudgetTrack

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period_start** | **Date** | Start date of the budget period | [optional] 
**period_end** | **Date** | End date of the budget period | [optional] 
**total_funds_budgeted** | **Float** | Total amount of funds originally budgeted | [optional] 
**total_funds_spent** | **Float** | Total amount of funds spent | [optional] 
**total_funds_remaining** | **Float** | Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent | [optional] 
**budget_components** | [**Array&lt;BudgetCalculatorResponseBudgetComponents&gt;**](BudgetCalculatorResponseBudgetComponents.md) | Details about each item defined in the budget | [optional] 


