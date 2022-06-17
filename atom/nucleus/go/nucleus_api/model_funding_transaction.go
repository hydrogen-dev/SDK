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

// FundingTransaction Object
type FundingTransaction struct {
	// accountId
	AccountId string `json:"account_id,omitempty"`
	// amount
	Amount float64 `json:"amount"`
	// comments
	Comments   string `json:"comments,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// currency_code
	CurrencyCode string `json:"currency_code"`
	// fees
	Fees float64 `json:"fees,omitempty"`
	// fundingId
	FundingId string `json:"funding_id"`
	Id        string `json:"id,omitempty"`
	// investedDate
	InvestedDate string `json:"invested_date,omitempty"`
	// is deposit
	IsDeposit bool `json:"is_deposit"`
	// lastRequestDate
	LastRequestDate string            `json:"last_request_date,omitempty"`
	Metadata        map[string]string `json:"metadata,omitempty"`
	// portfolio_id
	PortfolioId string `json:"portfolio_id,omitempty"`
	// portfolioTransactionId
	PortfolioTransactionId string `json:"portfolio_transaction_id,omitempty"`
	// receivedDate
	ReceivedDate string `json:"received_date,omitempty"`
	SecondaryId  string `json:"secondary_id,omitempty"`
	// status
	Status string `json:"status,omitempty"`
	// statusTimeStamp
	StatusTimeStamp string `json:"status_time_stamp,omitempty"`
	// type
	Type_      string `json:"type,omitempty"`
	UpdateDate string `json:"update_date,omitempty"`
}
