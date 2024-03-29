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

// CardAddress Object
type CardAddress struct {
	// addressLine1
	AddressLine1 string `json:"address_line1"`
	// addressLine2
	AddressLine2 string `json:"address_line2,omitempty"`
	// city
	City string `json:"city"`
	// country
	Country string `json:"country"`
	// postalcode
	Postalcode string `json:"postalcode,omitempty"`
	// state
	State string `json:"state"`
	// type
	Type_ string `json:"type"`
}
