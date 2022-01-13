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

type ClientViewGoalData struct {
	Accounts                []VAccountVo   `json:"accounts,omitempty"`
	AccumulationHorizon     float64        `json:"accumulation_horizon,omitempty"`
	DecumulationHorizon     float64        `json:"decumulation_horizon,omitempty"`
	GoalAmount              float64        `json:"goal_amount,omitempty"`
	GoalAssetSizeByGoal     float64        `json:"goal_asset_size_by_goal,omitempty"`
	GoalAssetSizeByGoalDate string         `json:"goal_asset_size_by_goal_date,omitempty"`
	GoalCategory            string         `json:"goal_category,omitempty"`
	GoalCreateDate          string         `json:"goal_create_date,omitempty"`
	GoalId                  string         `json:"goal_id,omitempty"`
	GoalName                string         `json:"goal_name,omitempty"`
	GoalType                string         `json:"goal_type,omitempty"`
	GoalUpdateDate          string         `json:"goal_update_date,omitempty"`
	IsDecumulation          bool           `json:"is_decumulation,omitempty"`
	Portfolios              []VPortfolioVo `json:"portfolios,omitempty"`
}
