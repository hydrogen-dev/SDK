# atom_api.HealthCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liquidityRatioExpenses** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**liquidityRatioLiabilities** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**currentRatio** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**assetAllocationRatio** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**savingsRatioGross** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**savingsRatioNet** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**totalAssets** | **Number** | Total assets, calculated as liquid_assets + non_liquid_assets. | [optional] 
**netWorth** | **Number** | Net worth, calculated as total_assets - total_liabilities. | [optional] 
**grossMonthlyIncome** | **Number** | Gross monthly income, calculated as gross_annual_income / 12. | [optional] 
**monthlySurplus** | **Number** | Net monthly surplus, calculated as net_monthly_income - monthly_expenses. | [optional] 


