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


// Benchmark Object
type Benchmark struct {
	// clientId
	ClientId string `json:"client_id,omitempty"`
	// composition
	Composition []BenchmarkComposition `json:"composition,omitempty"`
	CreateDate  string              `json:"create_date,omitempty"`
	// description
	Description string `json:"description,omitempty"`
	Id          string `json:"id,omitempty"`
	// isActive
	IsActive bool              `json:"is_active,omitempty"`
	Metadata map[string]string `json:"metadata,omitempty"`
	// name
	Name        string    `json:"name"`
	SecondaryId string    `json:"secondary_id,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}
