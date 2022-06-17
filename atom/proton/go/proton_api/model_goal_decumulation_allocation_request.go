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

type GoalDecumulationAllocationRequest struct {
	RecommendationConfig RecommendationConfig            `json:"recommendation_config,omitempty"`
	CompoundingRate      float32                         `json:"compounding_rate,omitempty"`
	RiskScore            float32                         `json:"risk_score,omitempty"`
	RecommendType        string                          `json:"recommend_type,omitempty"`
	CreateLog            bool                            `json:"create_log,omitempty"`
	N                    int32                           `json:"n,omitempty"`
	AHorizon             int32                           `json:"a_horizon,omitempty"`
	AllocationMethod     string                          `json:"allocation_method"`
	AllocationPriority   string                          `json:"allocation_priority"`
	RemoveOutliers       bool                            `json:"remove_outliers,omitempty"`
	AdjustForCompounding bool                            `json:"adjust_for_compounding,omitempty"`
	GoalId               string                          `json:"goal_id,omitempty"`
	ConfTgt              float32                         `json:"conf_tgt,omitempty"`
	TradingDaysPerYear   int32                           `json:"trading_days_per_year,omitempty"`
	UseProxyData         bool                            `json:"use_proxy_data,omitempty"`
	Thresh               float32                         `json:"thresh,omitempty"`
	WithdrawalTax        float32                         `json:"withdrawal_tax,omitempty"`
	DHorizon             int32                           `json:"d_horizon,omitempty"`
	ClientId             string                          `json:"client_id,omitempty"`
	OptConfig            OptConfig                       `json:"opt_config,omitempty"`
	MarketDataSource     string                          `json:"market_data_source,omitempty"`
	ThreshType           string                          `json:"thresh_type,omitempty"`
	HorizonFrequency     string                          `json:"horizon_frequency,omitempty"`
	WithdrawalConfig     []GoalWithdrawalConfig          `json:"withdrawal_config,omitempty"`
	Allocations          []string                        `json:"allocations,omitempty"`
	CurrInv              float32                         `json:"curr_inv,omitempty"`
	DepositConfig        []DecumulationGoalDepositConfig `json:"deposit_config,omitempty"`
}
