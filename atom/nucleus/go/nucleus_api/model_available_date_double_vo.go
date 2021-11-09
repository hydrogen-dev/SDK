/*
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * API version: 1.9.4
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package nucleus_api

// Available Date-Double Mapping Object
type AvailableDateDoubleVo struct {
	// additions
	Additions float64 `json:"additions,omitempty"`
	// cashFlow
	CashFlow float64 `json:"cash_flow,omitempty"`
	// currencyCode
	CurrencyCode string `json:"currency_code,omitempty"`
	// date
	Date string `json:"date,omitempty"`
	// value
	Value float64 `json:"value,omitempty"`
	// valueAvailable
	ValueAvailable float64 `json:"value_available,omitempty"`
	// valuePending
	ValuePending float64 `json:"value_pending,omitempty"`
}