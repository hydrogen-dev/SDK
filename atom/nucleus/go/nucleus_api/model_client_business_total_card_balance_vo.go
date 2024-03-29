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

// Client/Business Total CardBalance Mapping Object
type ClientBusinessTotalCardBalanceVo struct {
	// currencyCode
	CurrencyCode string `json:"currency_code,omitempty"`
	// totalBalance
	TotalBalance float64 `json:"total_balance,omitempty"`
	// totalBalanceAvailable
	TotalBalanceAvailable float64 `json:"total_balance_available,omitempty"`
}
