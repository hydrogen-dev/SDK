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

type OverflowBankLinkMap struct {
	// amount
	Amount float64 `json:"amount"`
	// bankLinkId
	BankLinkId string `json:"bank_link_id"`
	// max
	Max float64 `json:"max,omitempty"`
}
