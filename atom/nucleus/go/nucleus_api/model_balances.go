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

// Balances Object
type Balances struct {
	// currencyCode
	CurrencyCode string `json:"currency_code,omitempty"`
	// payableOutstanding
	PayableOutstanding float64 `json:"payable_outstanding,omitempty"`
	// payableOverdue
	PayableOverdue float64 `json:"payable_overdue,omitempty"`
	// receivableOutstanding
	ReceivableOutstanding float64 `json:"receivable_outstanding,omitempty"`
	// receivableOverdue
	ReceivableOverdue float64 `json:"receivable_overdue,omitempty"`
}
