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

// Cash Object
type Cash struct {
	// cashAmount
	Amount float64 `json:"amount"`
	// cashName
	Name string `json:"name,omitempty"`
	// cashTransactionType
	TransactionType string `json:"transaction_type"`
}
