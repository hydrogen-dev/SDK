# atom_api.BudgetCalculatorResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budgetId** | **String** | The ID of the budget | [optional] 
**budgetName** | **String** | The name of the budget | [optional] 
**totalFundsAvailable** | **Number** | Total amount of funds originally available in the budget | [optional] 
**totalFundsSpent** | **Number** | Total amount of funds spent | [optional] 
**totalFundsRemaining** | **Number** | Total amount of funds remaining; delta of total_funds_available - total_funds_spent | [optional] 
**budgetComponents** | [**[BudgetCalculatorResponseInnerBudgetComponents]**](BudgetCalculatorResponseInnerBudgetComponents.md) | Total funds spent per category | [optional] 
**averageAmountBudgeted** | **Number** | Average amount budgeted for each budget component | [optional] 
**averageAmountSpent** | **Number** | Average amount spent for each budget component | [optional] 


