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

// Allocation Object
type Allocation struct {
	// benchmarkId
	BenchmarkId string `json:"benchmark_id,omitempty"`
	Category    string `json:"category,omitempty"`
	// clientId
	ClientId   string `json:"client_id,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// description
	Description string `json:"description,omitempty"`
	Id          string `json:"id,omitempty"`
	// inceptionDate
	InceptionDate string `json:"inception_date,omitempty"`
	// isActive
	IsActive bool              `json:"is_active,omitempty"`
	Metadata map[string]string `json:"metadata,omitempty"`
	// name
	Name    string              `json:"name"`
	NodeMap []AllocationNodeMap `json:"node_map,omitempty"`
	// performance
	Performance float64 `json:"performance,omitempty"`
	SecondaryId string  `json:"secondary_id,omitempty"`
	UpdateDate  string  `json:"update_date,omitempty"`
	// volatility
	Volatility float64 `json:"volatility,omitempty"`
}
