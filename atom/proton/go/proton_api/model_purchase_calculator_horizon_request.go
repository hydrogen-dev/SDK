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

type PurchaseCalculatorHorizonRequest struct {
	AccountIds            []string                   `json:"account_ids,omitempty"`
	InvestmentTax         float32                    `json:"investment_tax,omitempty"`
	PortfolioReturn       float32                    `json:"portfolio_return"`
	DepositSchedule       CalculatorDepositSchedule1 `json:"deposit_schedule,omitempty"`
	CurrentSavings        float32                    `json:"current_savings,omitempty"`
	PurchaseAmount        float32                    `json:"purchase_amount"`
	InflationRate         float32                    `json:"inflation_rate,omitempty"`
	AggregationAccountIds []string                   `json:"aggregation_account_ids,omitempty"`
}
