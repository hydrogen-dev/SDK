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

// Contact Object
type Contact struct {
	Address  []ContactAddress `json:"address,omitempty"`
	Balances Balances         `json:"balances,omitempty"`
	// businessId
	BusinessId string `json:"business_id,omitempty"`
	// clientId
	ClientId string `json:"client_id,omitempty"`
	// companyName
	CompanyName string `json:"company_name"`
	CreateDate  string `json:"create_date,omitempty"`
	// description
	Description string `json:"description,omitempty"`
	// firstName
	FirstName string `json:"first_name,omitempty"`
	Id        string `json:"id,omitempty"`
	// identificationNumber
	IdentificationNumber string `json:"identification_number,omitempty"`
	// isActive
	IsActive bool `json:"is_active,omitempty"`
	// isCustomer
	IsCustomer bool `json:"is_customer,omitempty"`
	// isSupplier
	IsSupplier bool `json:"is_supplier,omitempty"`
	// lastName
	LastName string `json:"last_name,omitempty"`
	// metadata
	Metadata    map[string]string `json:"metadata,omitempty"`
	SecondaryId string            `json:"secondary_id,omitempty"`
	// status
	Status     string `json:"status,omitempty"`
	UpdateDate string `json:"update_date,omitempty"`
}