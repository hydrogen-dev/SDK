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

type SecurityCompositionVo struct {
	EndDate               string              `json:"end_date,omitempty"`
	SecurityAssetClass    string              `json:"security_asset_class,omitempty"`
	SecurityCountries     []SecurityCountryVo `json:"security_countries,omitempty"`
	SecurityCreateDate    string              `json:"security_create_date,omitempty"`
	SecurityId            string              `json:"security_id,omitempty"`
	SecurityIndustry      string              `json:"security_industry,omitempty"`
	SecurityName          string              `json:"security_name,omitempty"`
	SecuritySecondaryId   string              `json:"security_secondary_id,omitempty"`
	SecuritySector        string              `json:"security_sector,omitempty"`
	SecuritySecurityClass string              `json:"security_security_class,omitempty"`
	SecurityTicker        string              `json:"security_ticker,omitempty"`
	SecurityUpdateDate    string              `json:"security_update_date,omitempty"`
	SecurityWeight        float64             `json:"security_weight,omitempty"`
	StartDate             string              `json:"start_date,omitempty"`
}
