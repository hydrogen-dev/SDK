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

type EmergencyFundCalculatorRequest struct {
	ClientId                    string      `json:"client_id,omitempty"`
	SavingsHorizon              []int32     `json:"savings_horizon,omitempty"`
	HousingCost                 float32     `json:"housing_cost,omitempty"`
	OtherExpenses               interface{} `json:"other_expenses,omitempty"`
	AccountIds                  []string    `json:"account_ids,omitempty"`
	UtilityPayments             float32     `json:"utility_payments,omitempty"`
	FoodCosts                   float32     `json:"food_costs,omitempty"`
	DebtPayments                float32     `json:"debt_payments,omitempty"`
	LookbackPeriods             int32       `json:"lookback_periods,omitempty"`
	FrequencyUnit               string      `json:"frequency_unit,omitempty"`
	CurrentEmergencyFundBalance float32     `json:"current_emergency_fund_balance,omitempty"`
	InsurancePayments           float32     `json:"insurance_payments,omitempty"`
	TelecomPayments             float32     `json:"telecom_payments,omitempty"`
	TransportationCosts         float32     `json:"transportation_costs,omitempty"`
	InterestRate                float32     `json:"interest_rate,omitempty"`
	EmergencyFundDuration       int32       `json:"emergency_fund_duration"`
	AggregationAccountIds       []string    `json:"aggregation_account_ids,omitempty"`
}
