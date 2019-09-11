# AtomApi::HealthCheckResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liquidity_ratio_expenses** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**liquidity_ratio_liabilities** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**current_ratio** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**asset_allocation_ratio** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**savings_ratio_gross** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**savings_ratio_net** | [**HealthCheckResult**](HealthCheckResult.md) |  | [optional] 
**total_assets** | **Float** | Total assets, calculated as liquid_assets + non_liquid_assets. | [optional] 
**net_worth** | **Float** | Net worth, calculated as total_assets - total_liabilities. | [optional] 
**gross_monthly_income** | **Float** | Gross monthly income, calculated as gross_annual_income / 12. | [optional] 
**monthly_surplus** | **Float** | Net monthly surplus, calculated as net_monthly_income - monthly_expenses. | [optional] 

