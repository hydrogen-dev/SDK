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

// ClientAccountMapping Object
type ClientAccountMapping struct {
	// clientAccountAssociationType
	ClientAccountAssociationType string `json:"client_account_association_type"`
	// clientId
	ClientId      string `json:"client_id"`
	SignatureData string `json:"signature_data,omitempty"`
}
