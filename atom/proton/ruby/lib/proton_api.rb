=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

# Common files
require 'proton_api/api_client'
require 'proton_api/api_error'
require 'proton_api/version'
require 'proton_api/configuration'
require 'proton_api/auth_configuration'

# Models
require 'proton_api/models/accumulation_goal_deposit_config'
require 'proton_api/models/annuity_calculator_accumulation_horizon_request'
require 'proton_api/models/annuity_calculator_annuity_amount_request'
require 'proton_api/models/annuity_calculator_decumulation_horizon_request'
require 'proton_api/models/annuity_calculator_deposit_amount_request'
require 'proton_api/models/annuity_calculator_initial_balance_request'
require 'proton_api/models/annuity_deposit_schedule'
require 'proton_api/models/answer'
require 'proton_api/models/backtest_request'
require 'proton_api/models/beneficiary_bequest_config'
require 'proton_api/models/budget_aggregation_account'
require 'proton_api/models/budget_calculator_request'
require 'proton_api/models/budget_component'
require 'proton_api/models/budget_details'
require 'proton_api/models/business_financial_health_check_request'
require 'proton_api/models/business_invoice_analysis_request'
require 'proton_api/models/calculator_deposit_schedule'
require 'proton_api/models/calculator_deposit_schedule1'
require 'proton_api/models/card_analysis_request'
require 'proton_api/models/card_limit_check_request'
require 'proton_api/models/card_transaction_authorization_request'
require 'proton_api/models/cash_analysis_request'
require 'proton_api/models/cash_flow_analysis_request'
require 'proton_api/models/children_education_config'
require 'proton_api/models/customer_analysis_request'
require 'proton_api/models/decision_tree_result_request'
require 'proton_api/models/decumulation_goal_deposit_config'
require 'proton_api/models/dimensional_risk_score_request'
require 'proton_api/models/diversification_score_request'
require 'proton_api/models/education_calculator_annual_cost_request'
require 'proton_api/models/education_calculator_deposit_amount_request'
require 'proton_api/models/education_calculator_percent_covered_request'
require 'proton_api/models/education_config'
require 'proton_api/models/emergency_fund_calculator_request'
require 'proton_api/models/event_study_request'
require 'proton_api/models/fee_analysis_request'
require 'proton_api/models/financial_health_check_request'
require 'proton_api/models/financial_picture_request'
require 'proton_api/models/financial_statement_analysis_request'
require 'proton_api/models/goal_accumulation_allocation_request'
require 'proton_api/models/goal_accumulation_recommendation_request'
require 'proton_api/models/goal_accumulation_status_request'
require 'proton_api/models/goal_config'
require 'proton_api/models/goal_decumulation_allocation_request'
require 'proton_api/models/goal_decumulation_recommendation_request'
require 'proton_api/models/goal_decumulation_status_request'
require 'proton_api/models/goal_withdrawal_config'
require 'proton_api/models/guaranteed_rate_benefit'
require 'proton_api/models/income_config'
require 'proton_api/models/life_insurance_needs_calculator_request'
require 'proton_api/models/location'
require 'proton_api/models/monte_carlo_request'
require 'proton_api/models/mortgage_calculator_down_payment_request'
require 'proton_api/models/mortgage_calculator_home_price_request'
require 'proton_api/models/mortgage_calculator_periodic_payment_request'
require 'proton_api/models/mvo_request'
require 'proton_api/models/opt_config'
require 'proton_api/models/opt_config1'
require 'proton_api/models/order_rebalance_request'
require 'proton_api/models/performance_calculator_request'
require 'proton_api/models/periods'
require 'proton_api/models/portfolio_optimization_score_request'
require 'proton_api/models/portfolio_what_if_request'
require 'proton_api/models/purchase_calculator_amount_request'
require 'proton_api/models/purchase_calculator_deposit_amount_request'
require 'proton_api/models/purchase_calculator_horizon_request'
require 'proton_api/models/ratio_targets'
require 'proton_api/models/ratio_targets1'
require 'proton_api/models/rebalancing_signal_request'
require 'proton_api/models/recommendation_config'
require 'proton_api/models/recommendation_config1'
require 'proton_api/models/recurring_transaction_analysis_request'
require 'proton_api/models/retirement_calculator_deposit_amount_request'
require 'proton_api/models/retirement_calculator_expenses_request'
require 'proton_api/models/retirement_calculator_percent_covered_request'
require 'proton_api/models/risk_allocation_request'
require 'proton_api/models/risk_score_request'
require 'proton_api/models/savings_calculator_request'
require 'proton_api/models/savings_deposit_schedule'
require 'proton_api/models/scenario_analysis_request'
require 'proton_api/models/sensitivity_analysis_request'
require 'proton_api/models/sensitivity_factor'
require 'proton_api/models/settings'
require 'proton_api/models/spending_analysis_request'
require 'proton_api/models/variable_annuity_request'
require 'proton_api/models/w_config'
require 'proton_api/models/w_config1'

# APIs
require 'proton_api/api/annuities_api'
require 'proton_api/api/business_financial_management_api'
require 'proton_api/api/cards_api'
require 'proton_api/api/financial_health_api'
require 'proton_api/api/financial_planning_api'
require 'proton_api/api/goals_api'
require 'proton_api/api/life_insurance_api'
require 'proton_api/api/personal_financial_management_api'
require 'proton_api/api/portfolio_construction_api'
require 'proton_api/api/portfolio_management_api'
require 'proton_api/api/risk_scoring_api'
require 'proton_api/api/simulations_api'
require 'proton_api/api/util_api'

module ProtonApi
  class << self
    # Customize default settings for the SDK using block.
    #   ProtonApi.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(AuthConfiguration.default)
      else
        AuthConfiguration.default
      end
    end
  end
end
