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



type Household struct {
	// category
	Category   string    `json:"category,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// householdIncome
	HouseholdIncome float64 `json:"household_income,omitempty"`
	Id              string  `json:"id,omitempty"`
	// is_active
	IsActive bool              `json:"is_active,omitempty"`
	Members  []Member          `json:"members,omitempty"`
	Metadata map[string]string `json:"metadata,omitempty"`
	// name
	Name        string `json:"name"`
	SecondaryId string `json:"secondary_id,omitempty"`
	// subcategory
	Subcategory string    `json:"subcategory,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}