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



// PortfolioComment Object
type PortfolioComment struct {
	// accountId
	AccountId  string    `json:"account_id"`
	CreateDate string `json:"create_date,omitempty"`
	Id         string    `json:"id,omitempty"`
	// isRead
	IsRead bool `json:"is_read,omitempty"`
	// modelCommentId
	ModelCommentId string `json:"model_comment_id"`
	// modelId
	ModelId string `json:"model_id"`
	// portfolioId
	PortfolioId string    `json:"portfolio_id"`
	SecondaryId string    `json:"secondary_id,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}