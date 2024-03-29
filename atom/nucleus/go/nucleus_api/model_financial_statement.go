/*
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * API version: 1.9.5
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package nucleus_api

// FinancialStatement Object
type FinancialStatement struct {
	// accounting_method
	AccountingMethod string `json:"accounting_method"`
	// businessId
	BusinessId string `json:"business_id,omitempty"`
	// clientId
	ClientId   string `json:"client_id,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// currencyCode
	CurrencyCode string            `json:"currency_code"`
	Id           string            `json:"id,omitempty"`
	Metadata     map[string]string `json:"metadata,omitempty"`
	// periodLength
	PeriodLength string `json:"period_length,omitempty"`
	// periodMonth
	PeriodMonth int32 `json:"period_month,omitempty"`
	// periodQuarter
	PeriodQuarter int32 `json:"period_quarter,omitempty"`
	// periodType
	PeriodType string `json:"period_type,omitempty"`
	// periodYear
	PeriodYear  int32  `json:"period_year,omitempty"`
	SecondaryId string `json:"secondary_id,omitempty"`
	// statementDate
	StatementDate string `json:"statement_date"`
	// statement_type
	StatementType string `json:"statement_type"`
	// stats
	Stats      []Stat `json:"stats,omitempty"`
	UpdateDate string `json:"update_date,omitempty"`
}
