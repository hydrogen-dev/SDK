# BudgetCalculatorResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budget_id** | **str** | The ID of the budget | [optional] 
**budget_name** | **str** | The name of the budget | [optional] 
**total_funds_available** | **float** | Total amount of funds originally available in the budget | [optional] 
**total_funds_spent** | **float** | Total amount of funds spent | [optional] 
**total_funds_remaining** | **float** | Total amount of funds remaining; delta of total_funds_available - total_funds_spent | [optional] 
**budget_components** | [**list[BudgetCalculatorResponseInnerBudgetComponents]**](BudgetCalculatorResponseInnerBudgetComponents.md) | Total funds spent per category | [optional] 
**average_amount_budgeted** | **float** | Average amount budgeted for each budget component | [optional] 
**average_amount_spent** | **float** | Average amount spent for each budget component | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


