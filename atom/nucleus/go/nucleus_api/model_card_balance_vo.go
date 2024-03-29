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

// CardBalance Mapping Object
type CardBalanceVo struct {
	// balance
	Balance float64 `json:"balance,omitempty"`
	// balanceAvailable
	BalanceAvailable float64 `json:"balance_available,omitempty"`
	// balanceTimestamp
	BalanceTimestamp string `json:"balance_timestamp,omitempty"`
	// currencyCode
	CurrencyCode string `json:"currency_code,omitempty"`
}
