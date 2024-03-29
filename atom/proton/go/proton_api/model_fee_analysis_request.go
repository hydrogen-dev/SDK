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

type FeeAnalysisRequest struct {
	CurrencyCode           string   `json:"currency_code,omitempty"`
	ClientId               string   `json:"client_id,omitempty"`
	EndDate                string   `json:"end_date,omitempty"`
	CurrencyConversion     string   `json:"currency_conversion,omitempty"`
	StartDate              string   `json:"start_date,omitempty"`
	TransactionStatusScope []string `json:"transaction_status_scope,omitempty"`
	AggregationAccountIds  []string `json:"aggregation_account_ids,omitempty"`
}
