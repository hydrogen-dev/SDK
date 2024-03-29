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

// SpendingControl Object
type SpendingControl struct {
	// client_group
	ClientGroup string `json:"client_group,omitempty"`
	// client_id
	ClientId string `json:"client_id,omitempty"`
	// controlScope
	ControlScope string `json:"control_scope"`
	// controlType
	ControlType string `json:"control_type"`
	// control_values
	ControlValues []string `json:"control_values,omitempty"`
	CreateDate    string   `json:"create_date,omitempty"`
	// currency_code
	CurrencyCode string `json:"currency_code"`
	// description
	Description string `json:"description,omitempty"`
	// frequency
	Frequency int32 `json:"frequency,omitempty"`
	// frequency_unit
	FrequencyUnit string `json:"frequency_unit,omitempty"`
	Id            string `json:"id,omitempty"`
	// is_active
	IsActive bool `json:"is_active,omitempty"`
	// limitValue
	LimitValue  float64           `json:"limit_value,omitempty"`
	Metadata    map[string]string `json:"metadata,omitempty"`
	SecondaryId string            `json:"secondary_id,omitempty"`
	UpdateDate  string            `json:"update_date,omitempty"`
}
