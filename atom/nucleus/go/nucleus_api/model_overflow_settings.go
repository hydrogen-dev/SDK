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

// Overflow Settings Object
type OverflowSettings struct {
	// account_id
	AccountId string                `json:"account_id"`
	BankLinks []OverflowBankLinkMap `json:"bank_links"`
	// clientId
	ClientId   string `json:"client_id"`
	CreateDate string `json:"create_date,omitempty"`
	Id         string `json:"id,omitempty"`
	// is_active
	IsActive bool `json:"is_active,omitempty"`
	// metadata
	Metadata map[string]string `json:"metadata,omitempty"`
	// portfolio_id
	PortfolioId string `json:"portfolio_id,omitempty"`
	SecondaryId string `json:"secondary_id,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}
