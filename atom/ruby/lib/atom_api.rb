=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

# Common files
require 'atom_api/api_client'
require 'atom_api/api_error'
require 'atom_api/version'
require 'atom_api/configuration'

# Models
require 'atom_api/models/account_allocation_payload'
require 'atom_api/models/account_create_client'
require 'atom_api/models/account_create_goal'
require 'atom_api/models/account_create_payload'
require 'atom_api/models/account_permission_clients_payload'
require 'atom_api/models/account_permission_payload'
require 'atom_api/models/account_rebalance_buy_only_order_payload'
require 'atom_api/models/account_rebalance_order_payload'
require 'atom_api/models/account_rebalance_sell_only_order_payload'
require 'atom_api/models/account_stage_payload'
require 'atom_api/models/account_status_payload'
require 'atom_api/models/account_subscribe_payload'
require 'atom_api/models/account_subscribe_payload_inner'
require 'atom_api/models/account_transaction_response_content'
require 'atom_api/models/account_type_payload'
require 'atom_api/models/address'
require 'atom_api/models/aggregation_account_balance_payload'
require 'atom_api/models/aggregation_account_payload'
require 'atom_api/models/allocation_asset_size_response'
require 'atom_api/models/allocation_asset_size_response_inner'
require 'atom_api/models/allocation_composition_payload'
require 'atom_api/models/allocation_holdings_response'
require 'atom_api/models/allocation_holdings_response_inner'
require 'atom_api/models/allocation_payload'
require 'atom_api/models/allocation_transaction_response_content'
require 'atom_api/models/annuity_accumulation_response'
require 'atom_api/models/annuity_amount_response'
require 'atom_api/models/annuity_calculator_accumulation_horizon'
require 'atom_api/models/annuity_calculator_annuity_amount'
require 'atom_api/models/annuity_calculator_decumulation_horizon'
require 'atom_api/models/annuity_calculator_deposit_amount'
require 'atom_api/models/annuity_calculator_initial_balance'
require 'atom_api/models/annuity_decumulation_response'
require 'atom_api/models/annuity_deposit_schedule'
require 'atom_api/models/annuity_depositamount_response'
require 'atom_api/models/annuity_horizon'
require 'atom_api/models/annuity_initialbalance_response'
require 'atom_api/models/annuity_return_detail'
require 'atom_api/models/backtest'
require 'atom_api/models/backtest_response'
require 'atom_api/models/bank_link_payload'
require 'atom_api/models/benchmark_asset_size_response'
require 'atom_api/models/benchmark_asset_size_response_inner'
require 'atom_api/models/benchmark_payload'
require 'atom_api/models/benchmark_payload_composition'
require 'atom_api/models/beneficiary_bequest_config'
require 'atom_api/models/bulk_order_account_payload'
require 'atom_api/models/bulk_order_client_payload'
require 'atom_api/models/bulk_order_firm_payload'
require 'atom_api/models/bulk_order_firmclientaccount_response'
require 'atom_api/models/campaign_data_payload'
require 'atom_api/models/campaign_management_payload'
require 'atom_api/models/campaign_plan_payload'
require 'atom_api/models/campaign_plan_payload_plan_rates'
require 'atom_api/models/change_model_composition_response'
require 'atom_api/models/change_model_composition_response_inner'
require 'atom_api/models/chat_payload'
require 'atom_api/models/children_education_config'
require 'atom_api/models/client_asset_size_response'
require 'atom_api/models/client_asset_size_response_inner'
require 'atom_api/models/client_campaign_payload'
require 'atom_api/models/client_holdings_response'
require 'atom_api/models/client_holdings_response_inner'
require 'atom_api/models/client_hydro_payload'
require 'atom_api/models/client_payload'
require 'atom_api/models/client_response_payload'
require 'atom_api/models/client_transaction_response_content'
require 'atom_api/models/consultation_payload'
require 'atom_api/models/create_account_rebalance_order_response'
require 'atom_api/models/create_account_status_response'
require 'atom_api/models/create_aggregation_account_balance_response'
require 'atom_api/models/create_buy_only_account_rebalance_order_response'
require 'atom_api/models/create_buy_only_portfolio_rebalance_order_response'
require 'atom_api/models/create_portfolio_rebalance_order_response'
require 'atom_api/models/create_sell_only_account_rebalance_order_response'
require 'atom_api/models/create_sell_only_portfolio_rebalance_order_response'
require 'atom_api/models/decision_tree_payload'
require 'atom_api/models/deposit_request_payload'
require 'atom_api/models/deposit_schedule'
require 'atom_api/models/deposit_schedule_major_purchase_dep_amt'
require 'atom_api/models/deposit_schedule_major_purchase_no_dep_amt'
require 'atom_api/models/dim_risk_score_response'
require 'atom_api/models/dimensional_risk_score'
require 'atom_api/models/diversification_score'
require 'atom_api/models/document_payload'
require 'atom_api/models/education_calculator_annual_cost'
require 'atom_api/models/education_calculator_annualcost_response'
require 'atom_api/models/education_calculator_deposit_amount'
require 'atom_api/models/education_calculator_deposit_schedule_dep_amt'
require 'atom_api/models/education_calculator_deposit_schedule_no_dep_amt'
require 'atom_api/models/education_calculator_depositamount_response'
require 'atom_api/models/education_calculator_pctcovered_response'
require 'atom_api/models/education_calculator_percent_covered'
require 'atom_api/models/education_calculator_return_detail'
require 'atom_api/models/education_config'
require 'atom_api/models/emergency_fund_calculator'
require 'atom_api/models/emergency_fund_response'
require 'atom_api/models/event'
require 'atom_api/models/event_study'
require 'atom_api/models/event_study_response'
require 'atom_api/models/faq_payload'
require 'atom_api/models/faq_payload_faq_keywords'
require 'atom_api/models/financial_health_check'
require 'atom_api/models/funding_request_payload'
require 'atom_api/models/get_account_asset_size_response'
require 'atom_api/models/get_account_asset_size_response_inner'
require 'atom_api/models/get_account_holding_response'
require 'atom_api/models/get_account_holding_response_inner'
require 'atom_api/models/get_account_type_subresponse'
require 'atom_api/models/goal_accumulation_allocation'
require 'atom_api/models/goal_accumulation_recommendation'
require 'atom_api/models/goal_accumulation_status'
require 'atom_api/models/goal_allocation_response'
require 'atom_api/models/goal_allocation_section_response'
require 'atom_api/models/goal_asset_size_response'
require 'atom_api/models/goal_asset_size_response_inner'
require 'atom_api/models/goal_config'
require 'atom_api/models/goal_decumulation_allocation'
require 'atom_api/models/goal_decumulation_recommendation'
require 'atom_api/models/goal_decumulation_status'
require 'atom_api/models/goal_deposit_config'
require 'atom_api/models/goal_holdings_response'
require 'atom_api/models/goal_holdings_response_inner'
require 'atom_api/models/goal_opt_config'
require 'atom_api/models/goal_payload'
require 'atom_api/models/goal_recommendation_config_rec'
require 'atom_api/models/goal_recommendation_config_status'
require 'atom_api/models/goal_recommendation_response'
require 'atom_api/models/goal_recommendation_response_action'
require 'atom_api/models/goal_return_details_period_response'
require 'atom_api/models/goal_status_response'
require 'atom_api/models/goal_status_section_response'
require 'atom_api/models/goal_track_payload'
require 'atom_api/models/goal_transactions_response_content'
require 'atom_api/models/goal_weight_config'
require 'atom_api/models/goal_withdrawal_config'
require 'atom_api/models/health_check_response'
require 'atom_api/models/health_check_result'
require 'atom_api/models/holdings_detail'
require 'atom_api/models/income_config'
require 'atom_api/models/life_insurance_calculator'
require 'atom_api/models/life_insurance_needs_breakdown'
require 'atom_api/models/life_insurance_needs_response'
require 'atom_api/models/life_insurance_return_detail'
require 'atom_api/models/model_asset_size_payload'
require 'atom_api/models/model_comment_payload'
require 'atom_api/models/model_composition_payload'
require 'atom_api/models/model_composition_payload_holdings'
require 'atom_api/models/model_holding_payload'
require 'atom_api/models/model_payload'
require 'atom_api/models/model_transaction_payload'
require 'atom_api/models/monte_carlo'
require 'atom_api/models/monte_carlo_response'
require 'atom_api/models/mortgage_calculator_down_payment'
require 'atom_api/models/mortgage_calculator_downpayment_response'
require 'atom_api/models/mortgage_calculator_home_price'
require 'atom_api/models/mortgage_calculator_homeprice_response'
require 'atom_api/models/mortgage_calculator_periodic_payment'
require 'atom_api/models/mortgage_calculator_periodicpayment_response'
require 'atom_api/models/mortgage_schedule_period'
require 'atom_api/models/mvo_response'
require 'atom_api/models/node_payload'
require 'atom_api/models/node_relationship_payload'
require 'atom_api/models/opt_config'
require 'atom_api/models/opt_config_portfolio'
require 'atom_api/models/opt_score_portfolio'
require 'atom_api/models/optimization_score'
require 'atom_api/models/order_payload'
require 'atom_api/models/order_status_payload'
require 'atom_api/models/order_track_payload'
require 'atom_api/models/pagination'
require 'atom_api/models/pagination_sort'
require 'atom_api/models/performance_response'
require 'atom_api/models/pflo_diversification_score_response'
require 'atom_api/models/pflo_optimization_score_response'
require 'atom_api/models/portfolio_asset_size_payload'
require 'atom_api/models/portfolio_comment_payload'
require 'atom_api/models/portfolio_holding_payload'
require 'atom_api/models/portfolio_payload'
require 'atom_api/models/portfolio_rebalance_buy_only_order_payload'
require 'atom_api/models/portfolio_rebalance_order_payload'
require 'atom_api/models/portfolio_rebalance_sell_only_order_payload'
require 'atom_api/models/portfolio_transaction_payload'
require 'atom_api/models/portfolio_what_if_response'
require 'atom_api/models/portfolio_what_if_stat'
require 'atom_api/models/purchase_calculator_amount'
require 'atom_api/models/purchase_calculator_deposit_amount'
require 'atom_api/models/purchase_calculator_depositamount_response'
require 'atom_api/models/purchase_calculator_horizon'
require 'atom_api/models/purchase_calculator_purchaseamount_response'
require 'atom_api/models/purchase_calculator_purchasehorizon_response'
require 'atom_api/models/purchase_calculator_return_detail'
require 'atom_api/models/questionnaire_payload'
require 'atom_api/models/questionnaire_payload_answers'
require 'atom_api/models/questionnaire_payload_questions'
require 'atom_api/models/ratio_targets'
require 'atom_api/models/rebalance'
require 'atom_api/models/rebalance_response'
require 'atom_api/models/rebalance_signal'
require 'atom_api/models/rebalance_subresponse'
require 'atom_api/models/retirement_calculator_deposit_amount'
require 'atom_api/models/retirement_calculator_depositamount_response'
require 'atom_api/models/retirement_calculator_expenses'
require 'atom_api/models/retirement_calculator_expenses_response'
require 'atom_api/models/retirement_calculator_pctcovered_response'
require 'atom_api/models/retirement_calculator_percent_covered'
require 'atom_api/models/retirement_return_detail'
require 'atom_api/models/risk_allocation'
require 'atom_api/models/risk_allocation_response'
require 'atom_api/models/risk_score'
require 'atom_api/models/risk_score_opt_config_model'
require 'atom_api/models/risk_score_opt_config_model_w_config'
require 'atom_api/models/risk_score_response'
require 'atom_api/models/sales_payload'
require 'atom_api/models/savings_calculator_response'
require 'atom_api/models/savings_calculator_return_details_period_response'
require 'atom_api/models/scenario_analysis'
require 'atom_api/models/scenario_analysis_response'
require 'atom_api/models/scenario_results'
require 'atom_api/models/score_payload'
require 'atom_api/models/secondary_id'
require 'atom_api/models/security_exclusion_payload'
require 'atom_api/models/security_payload'
require 'atom_api/models/security_payload_security_composition'
require 'atom_api/models/security_payload_security_country'
require 'atom_api/models/security_price_payload'
require 'atom_api/models/sell_all_account_payload'
require 'atom_api/models/sell_all_account_response'
require 'atom_api/models/sell_all_portfolio_payload'
require 'atom_api/models/sell_all_portfolio_response'
require 'atom_api/models/sensitivity_analysis'
require 'atom_api/models/sensitivity_analysis_response'
require 'atom_api/models/sensitivity_factor'
require 'atom_api/models/simple_savings_calculator'
require 'atom_api/models/specific_account_stage_response'
require 'atom_api/models/specific_account_status_response'
require 'atom_api/models/stats_detail'
require 'atom_api/models/subscribe_account_response'
require 'atom_api/models/subscribe_account_response_inner'
require 'atom_api/models/support_ticket_comment_payload'
require 'atom_api/models/support_ticket_comment_payload_support_ticket_document'
require 'atom_api/models/support_ticket_payload'
require 'atom_api/models/target_portfolio_response'
require 'atom_api/models/transaction_code_payload'
require 'atom_api/models/transfer_request_payload'
require 'atom_api/models/variable_annuity_payload'
require 'atom_api/models/variable_annuity_response'
require 'atom_api/models/variable_annuity_return_detail'
require 'atom_api/models/w_config_portfolio'
require 'atom_api/models/what_if_portfolio'
require 'atom_api/models/withdrawal_payload'
require 'atom_api/models/account_transaction_response'
require 'atom_api/models/allocation_transaction_response'
require 'atom_api/models/bulk_order_subresponse'
require 'atom_api/models/client_transaction_response'
require 'atom_api/models/create_account_response'
require 'atom_api/models/create_aggregation_account_response'
require 'atom_api/models/create_allocation_composition_response'
require 'atom_api/models/create_allocation_response'
require 'atom_api/models/create_bank_link_response'
require 'atom_api/models/create_benchmark_response'
require 'atom_api/models/create_campaign_data_response'
require 'atom_api/models/create_campaign_plan_response'
require 'atom_api/models/create_campaign_response'
require 'atom_api/models/create_chat_response'
require 'atom_api/models/create_client_campaign_response'
require 'atom_api/models/create_client_hydro_response'
require 'atom_api/models/create_client_response'
require 'atom_api/models/create_client_response_response'
require 'atom_api/models/create_consultation_response'
require 'atom_api/models/create_decision_tree_response'
require 'atom_api/models/create_deposit_request_response'
require 'atom_api/models/create_document_response'
require 'atom_api/models/create_faq_response'
require 'atom_api/models/create_funding_request_response'
require 'atom_api/models/create_goal_response'
require 'atom_api/models/create_goal_track_response'
require 'atom_api/models/create_model_asset_size_response'
require 'atom_api/models/create_model_comment_response'
require 'atom_api/models/create_model_holding_response'
require 'atom_api/models/create_model_response'
require 'atom_api/models/create_model_transaction_response'
require 'atom_api/models/create_node_relationship_response'
require 'atom_api/models/create_node_response'
require 'atom_api/models/create_order_response'
require 'atom_api/models/create_order_status_response'
require 'atom_api/models/create_order_track_response'
require 'atom_api/models/create_portfolio_asset_size_response'
require 'atom_api/models/create_portfolio_comment_response'
require 'atom_api/models/create_portfolio_holding_response'
require 'atom_api/models/create_portfolio_response'
require 'atom_api/models/create_portfolio_transaction_response'
require 'atom_api/models/create_questionnaire_response'
require 'atom_api/models/create_sales_response'
require 'atom_api/models/create_score_response'
require 'atom_api/models/create_security_exclusion_response'
require 'atom_api/models/create_security_price_response'
require 'atom_api/models/create_security_response'
require 'atom_api/models/create_support_ticket_comment_response'
require 'atom_api/models/create_support_ticket_response'
require 'atom_api/models/create_transaction_code_response'
require 'atom_api/models/create_transfer_response'
require 'atom_api/models/create_withdrawal_response'
require 'atom_api/models/get_account_allocation_response'
require 'atom_api/models/get_account_permissions_response'
require 'atom_api/models/get_account_response'
require 'atom_api/models/get_account_stage_response'
require 'atom_api/models/get_account_status_response'
require 'atom_api/models/get_account_type_response'
require 'atom_api/models/get_aggregation_account_balance_response'
require 'atom_api/models/get_aggregation_accounts_response'
require 'atom_api/models/get_allocation_composition_response'
require 'atom_api/models/get_allocation_response'
require 'atom_api/models/get_bank_link_response'
require 'atom_api/models/get_benchmark_response'
require 'atom_api/models/get_bulk_order_response'
require 'atom_api/models/get_campaign_data_response'
require 'atom_api/models/get_campaign_plan_response'
require 'atom_api/models/get_campaign_response'
require 'atom_api/models/get_chat_response'
require 'atom_api/models/get_client_campaign_response'
require 'atom_api/models/get_client_hydro_response'
require 'atom_api/models/get_client_response'
require 'atom_api/models/get_client_response_response'
require 'atom_api/models/get_consultation_response'
require 'atom_api/models/get_decision_tree_response'
require 'atom_api/models/get_deposit_request_response'
require 'atom_api/models/get_document_response'
require 'atom_api/models/get_faq_response'
require 'atom_api/models/get_funding_request_response'
require 'atom_api/models/get_goal_response'
require 'atom_api/models/get_goal_track_response'
require 'atom_api/models/get_model_asset_size_response'
require 'atom_api/models/get_model_comment_response'
require 'atom_api/models/get_model_holding_response'
require 'atom_api/models/get_model_response'
require 'atom_api/models/get_model_transaction_response'
require 'atom_api/models/get_node_relationship_response'
require 'atom_api/models/get_node_response'
require 'atom_api/models/get_order_response'
require 'atom_api/models/get_order_status_response'
require 'atom_api/models/get_order_track_response'
require 'atom_api/models/get_portfolio_asset_size_response'
require 'atom_api/models/get_portfolio_comment_response'
require 'atom_api/models/get_portfolio_holding_response'
require 'atom_api/models/get_portfolio_response'
require 'atom_api/models/get_portfolio_transaction_response'
require 'atom_api/models/get_questionnaire_response'
require 'atom_api/models/get_sales_response'
require 'atom_api/models/get_score_response'
require 'atom_api/models/get_security_exclusion_response'
require 'atom_api/models/get_security_price_response'
require 'atom_api/models/get_security_response'
require 'atom_api/models/get_support_ticket_comment_response'
require 'atom_api/models/get_support_ticket_response'
require 'atom_api/models/get_transaction_code_response'
require 'atom_api/models/get_transfer_response'
require 'atom_api/models/get_withdrawal_response'
require 'atom_api/models/goal_transactions_response'
require 'atom_api/models/specific_account_allocation_response'
require 'atom_api/models/specific_account_permission_response'
require 'atom_api/models/specific_aggregation_account_balance_response'
require 'atom_api/models/specific_transfer_response'
require 'atom_api/models/specific_account_response'
require 'atom_api/models/specific_aggregation_account_response'
require 'atom_api/models/specific_allocation_composition_response'
require 'atom_api/models/specific_allocation_response'
require 'atom_api/models/specific_bank_link_response'
require 'atom_api/models/specific_benchmark_response'
require 'atom_api/models/specific_campaign_data_response'
require 'atom_api/models/specific_campaign_plan_response'
require 'atom_api/models/specific_campaign_response'
require 'atom_api/models/specific_chat_response'
require 'atom_api/models/specific_client_campaign_response'
require 'atom_api/models/specific_client_hydro_response'
require 'atom_api/models/specific_client_response'
require 'atom_api/models/specific_client_response_response'
require 'atom_api/models/specific_consultation_response'
require 'atom_api/models/specific_decision_tree_response'
require 'atom_api/models/specific_deposit_request_response'
require 'atom_api/models/specific_document_response'
require 'atom_api/models/specific_faq_response'
require 'atom_api/models/specific_funding_request_response'
require 'atom_api/models/specific_goal_response'
require 'atom_api/models/specific_goal_track_response'
require 'atom_api/models/specific_model_asset_size_response'
require 'atom_api/models/specific_model_comment_response'
require 'atom_api/models/specific_model_holding_response'
require 'atom_api/models/specific_model_response'
require 'atom_api/models/specific_model_transaction_response'
require 'atom_api/models/specific_node_relationship_response'
require 'atom_api/models/specific_node_response'
require 'atom_api/models/specific_order_response'
require 'atom_api/models/specific_order_status_response'
require 'atom_api/models/specific_order_track_response'
require 'atom_api/models/specific_portfolio_asset_size_response'
require 'atom_api/models/specific_portfolio_comment_response'
require 'atom_api/models/specific_portfolio_holding_response'
require 'atom_api/models/specific_portfolio_response'
require 'atom_api/models/specific_portfolio_transaction_response'
require 'atom_api/models/specific_questionnaire_response'
require 'atom_api/models/specific_sales_response'
require 'atom_api/models/specific_score_response'
require 'atom_api/models/specific_security_exclusion_response'
require 'atom_api/models/specific_security_price_response'
require 'atom_api/models/specific_security_response'
require 'atom_api/models/specific_support_ticket_comment_response'
require 'atom_api/models/specific_support_ticket_response'
require 'atom_api/models/specific_transaction_code_response'
require 'atom_api/models/specific_withdrawal_response'

# APIs
require 'atom_api/api/electron_api'
require 'atom_api/api/nucleus_api'
require 'atom_api/api/proton_api'

module AtomApi
  class << self
    # Customize default settings for the SDK using block.
    #   AtomApi.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
