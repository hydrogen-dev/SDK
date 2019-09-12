
# BudgetCalculatorResponseBudgetTrack

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodStart** | [**LocalDate**](LocalDate.md) | Start date of the budget period |  [optional]
**periodEnd** | [**LocalDate**](LocalDate.md) | End date of the budget period |  [optional]
**totalFundsBudgeted** | **Double** | Total amount of funds originally budgeted |  [optional]
**totalFundsSpent** | **Double** | Total amount of funds spent |  [optional]
**totalFundsRemaining** | **Double** | Total amount of funds remaining; delta of total_funds_budgeted - total_funds_spent |  [optional]
**budgetComponents** | [**List&lt;BudgetCalculatorResponseBudgetComponents&gt;**](BudgetCalculatorResponseBudgetComponents.md) | Details about each item defined in the budget |  [optional]



