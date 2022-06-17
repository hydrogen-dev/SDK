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

// Roundup Object
type Roundup struct {
	// account_id
	AccountId string `json:"account_id"`
	// client_id
	ClientId        string              `json:"client_id"`
	CreateDate      string              `json:"create_date,omitempty"`
	FundingRequests []FundingRequestMap `json:"funding_requests,omitempty"`
	Id              string              `json:"id,omitempty"`
	// roundup_setting_id
	RoundupSettingId string `json:"roundup_setting_id"`
	// totalRoundupAmount
	TotalRoundupAmount float64 `json:"total_roundup_amount,omitempty"`
	UpdateDate         string  `json:"update_date,omitempty"`
}
