/*
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * API version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package proton_api

type PortfolioWhatIfRequest struct {
	AllocationId            string    `json:"allocation_id,omitempty"`
	EndDate                 string    `json:"end_date,omitempty"`
	MarketDataSource        string    `json:"market_data_source,omitempty"`
	ModelId                 string    `json:"model_id,omitempty"`
	AccountId               string    `json:"account_id,omitempty"`
	StartDate               string    `json:"start_date,omitempty"`
	CurrentPortfolioWeights []float32 `json:"current_portfolio_weights,omitempty"`
	UseProxyData            bool      `json:"use_proxy_data,omitempty"`
	AlteredPortfolioWeights []float32 `json:"altered_portfolio_weights"`
	CreateLog               bool      `json:"create_log,omitempty"`
	CurrentPortfolioTickers []string  `json:"current_portfolio_tickers,omitempty"`
	AggregationAccountId    string    `json:"aggregation_account_id,omitempty"`
	AlteredPortfolioTickers []string  `json:"altered_portfolio_tickers,omitempty"`
	PortfolioId             string    `json:"portfolio_id,omitempty"`
}
