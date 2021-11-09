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



type ReasonCode struct {
	// category
	Category   string            `json:"category,omitempty"`
	CreateDate string         `json:"create_date,omitempty"`
	Id         string            `json:"id,omitempty"`
	Metadata   map[string]string `json:"metadata,omitempty"`
	// reasonCode
	ReasonCode string `json:"reason_code"`
	// reasonCodeDescription
	ReasonCodeDescription string `json:"reason_code_description,omitempty"`
	// reasonType
	ReasonType  string `json:"reason_type,omitempty"`
	SecondaryId string `json:"secondary_id,omitempty"`
	// subcategory
	Subcategory string    `json:"subcategory,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}
