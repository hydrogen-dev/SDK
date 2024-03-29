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

// FxRate Object
type FxRate struct {
	// currency_code_from
	CurrencyCodeFrom string `json:"currency_code_from"`
	// currency_code_to
	CurrencyCodeTo string `json:"currency_code_to"`
	// date
	Date string `json:"date"`
	// exchangeRate
	ExchangeRate float64 `json:"exchange_rate"`
}
