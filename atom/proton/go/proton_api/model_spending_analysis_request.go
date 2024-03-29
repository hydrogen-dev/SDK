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

type SpendingAnalysisRequest struct {
	MerchantScope            []string `json:"merchant_scope,omitempty"`
	AccountIds               []string `json:"account_ids,omitempty"`
	BusinessIds              []string `json:"business_ids,omitempty"`
	CardIds                  []string `json:"card_ids,omitempty"`
	ShowByMerchant           bool     `json:"show_by_merchant,omitempty"`
	ShowByPeriod             bool     `json:"show_by_period,omitempty"`
	OnlyCleansed             bool     `json:"only_cleansed,omitempty"`
	Frequency                int32    `json:"frequency,omitempty"`
	EndDate                  string   `json:"end_date,omitempty"`
	AsOfDate                 string   `json:"as_of_date,omitempty"`
	TransactionCategoryScope []string `json:"transaction_category_scope,omitempty"`
	StartDate                string   `json:"start_date,omitempty"`
	CardStatusScope          []string `json:"card_status_scope,omitempty"`
	OnlyActiveClients        bool     `json:"only_active_clients,omitempty"`
	LookbackPeriods          int32    `json:"lookback_periods,omitempty"`
	FrequencyUnit            string   `json:"frequency_unit"`
	HouseholdIds             []string `json:"household_ids,omitempty"`
	AggregationAccountIds    []string `json:"aggregation_account_ids,omitempty"`
	CurrencyCode             string   `json:"currency_code,omitempty"`
	ClientIds                []string `json:"client_ids,omitempty"`
	Scope                    string   `json:"scope,omitempty"`
	CurrencyConversion       string   `json:"currency_conversion,omitempty"`
	TransactionStatusScope   []string `json:"transaction_status_scope,omitempty"`
	ShowByCategory           bool     `json:"show_by_category,omitempty"`
}
