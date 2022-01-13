/*
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * API version: 1.3.1
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package integration_api

type MergerAcquisition struct {
	Acquiree Acquiree `json:"acquiree,omitempty"`
	Acquirer Acquirer `json:"acquirer,omitempty"`
	Type_    string   `json:"type,omitempty"`
}