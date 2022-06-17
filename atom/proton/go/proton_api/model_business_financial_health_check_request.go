/*
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * API version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package proton_api

type BusinessFinancialHealthCheckRequest struct {
	CurrencyCode       string        `json:"currency_code,omitempty"`
	ClientId           string        `json:"client_id,omitempty"`
	RatioTargets       RatioTargets1 `json:"ratio_targets,omitempty"`
	AccountingMethod   string        `json:"accounting_method,omitempty"`
	TotalLiabilities   float32       `json:"total_liabilities,omitempty"`
	TotalAssets        float32       `json:"total_assets,omitempty"`
	CurrencyConversion string        `json:"currency_conversion,omitempty"`
	PeriodQuarter      int32         `json:"period_quarter,omitempty"`
	PeriodMonth        int32         `json:"period_month,omitempty"`
	TotalEquity        float32       `json:"total_equity,omitempty"`
	BusinessId         string        `json:"business_id,omitempty"`
	PeriodYear         int32         `json:"period_year,omitempty"`
	TotalRevenue       float32       `json:"total_revenue,omitempty"`
	PeriodLength       string        `json:"period_length,omitempty"`
	NetIncome          float32       `json:"net_income,omitempty"`
	PeriodType         string        `json:"period_type,omitempty"`
}
