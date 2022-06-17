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

// Model Asset_Size Object
type ModelAssetSize struct {
	// Model asset_size
	AssetSize  float64 `json:"asset_size"`
	CreateDate string  `json:"create_date,omitempty"`
	// currency_code
	CurrencyCode string `json:"currency_code,omitempty"`
	// Model asset_size date
	Date string `json:"date"`
	Id   string `json:"id,omitempty"`
	// Model asset_size is reconciled
	IsReconciled bool `json:"is_reconciled,omitempty"`
	// Model asset_size Model id
	ModelId     string `json:"model_id"`
	SecondaryId string `json:"secondary_id,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}
