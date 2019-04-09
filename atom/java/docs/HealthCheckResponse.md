
# HealthCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liquidityRatioExpenses** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**liquidityRatioLiabilities** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**currentRatio** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**assetAllocationRatio** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**savingsRatioGross** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**savingsRatioNet** | [**HealthCheckResult**](HealthCheckResult.md) |  |  [optional]
**totalAssets** | [**BigDecimal**](BigDecimal.md) | Total assets, calculated as liquid_assets + non_liquid_assets. |  [optional]
**netWorth** | [**BigDecimal**](BigDecimal.md) | Net worth, calculated as total_assets - total_liabilities. |  [optional]
**grossMonthlyIncome** | [**BigDecimal**](BigDecimal.md) | Gross monthly income, calculated as gross_annual_income / 12. |  [optional]
**monthlySurplus** | [**BigDecimal**](BigDecimal.md) | Net monthly surplus, calculated as net_monthly_income - monthly_expenses. |  [optional]



