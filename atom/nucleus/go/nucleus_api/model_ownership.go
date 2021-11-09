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

// Ownership Object
type Ownership struct {
	// client_id
	ClientId string `json:"client_id"`
	// is_beneficial
	IsBeneficial bool `json:"is_beneficial,omitempty"`
	// is_primary
	IsPrimary bool `json:"is_primary,omitempty"`
	// percent_ownership
	PercentOwnership float64 `json:"percent_ownership,omitempty"`
	// role
	Role string `json:"role"`
}
