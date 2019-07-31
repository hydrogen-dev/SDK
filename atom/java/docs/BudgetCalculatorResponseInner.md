
# BudgetCalculatorResponseInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**budgetId** | [**UUID**](UUID.md) | The ID of the budget |  [optional]
**budgetName** | **String** | The name of the budget |  [optional]
**totalFundsAvailable** | **Double** | Total amount of funds originally available in the budget |  [optional]
**totalFundsSpent** | **Double** | Total amount of funds spent |  [optional]
**totalFundsRemaining** | **Double** | Total amount of funds remaining; delta of total_funds_available - total_funds_spent |  [optional]
**budgetComponents** | [**List&lt;BudgetCalculatorResponseInnerBudgetComponents&gt;**](BudgetCalculatorResponseInnerBudgetComponents.md) | Total funds spent per category |  [optional]
**averageAmountBudgeted** | **Double** | Average amount budgeted for each budget component |  [optional]
**averageAmountSpent** | **Double** | Average amount spent for each budget component |  [optional]



