=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for AtomApi::ProtonApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ProtonApi' do
  before do
    # run before each test
    @instance = AtomApi::ProtonApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ProtonApi' do
    it 'should create an instance of ProtonApi' do
      expect(@instance).to be_instance_of(AtomApi::ProtonApi)
    end
  end

  # unit tests for annuity_calculator_accumulation_horizon
  # Annuity calculator - accumulation horizon
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [AnnuityAccumulationResponse]
  describe 'annuity_calculator_accumulation_horizon test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for annuity_calculator_annuity_amount
  # Annuity calculator - annuity amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [AnnuityAmountResponse]
  describe 'annuity_calculator_annuity_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for annuity_calculator_decumulation_horizon
  # Annuity calculator - decumulation horizon
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [AnnuityDecumulationResponse]
  describe 'annuity_calculator_decumulation_horizon test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for annuity_calculator_deposit_amount
  # Annuity calculator - deposit amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [AnnuityDepositamountResponse]
  describe 'annuity_calculator_deposit_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for annuity_calculator_initial_balance
  # Annuity calculator - initial balance
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [AnnuityInitialbalanceResponse]
  describe 'annuity_calculator_initial_balance test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dimensional_risk_score
  # Dimensional risk score
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [DimRiskScoreResponse]
  describe 'dimensional_risk_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for education_calculator_annual_cost
  # Education calculator - total annual cost
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [EducationCalculatorAnnualcostResponse]
  describe 'education_calculator_annual_cost test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for education_calculator_deposit_amount
  # Education calculator - deposit amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [EducationCalculatorDepositamountResponse]
  describe 'education_calculator_deposit_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for education_calculator_percent_covered
  # Education calculator - percent covered
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [EducationCalculatorPctcoveredResponse]
  describe 'education_calculator_percent_covered test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for emergency_fund_calculator
  # Emergency fund calculator
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [EmergencyFundResponse]
  describe 'emergency_fund_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for event_study
  # Event study
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [EventStudyResponse]
  describe 'event_study test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for financial_health_check
  # Financial health check
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [HealthCheckResponse]
  describe 'financial_health_check test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_accumulation_allocation
  # Goal accumulation allocation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalAllocationResponse]
  describe 'goal_accumulation_allocation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_accumulation_recommendation
  # Goal accumulation recommendation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalRecommendationResponse]
  describe 'goal_accumulation_recommendation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_accumulation_status
  # Goal accumulation status
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalStatusResponse]
  describe 'goal_accumulation_status test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_allocation
  # Goal decumulation allocation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalAllocationResponse]
  describe 'goal_decumulation_allocation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_recommendation
  # Goal decumulation recommendation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalRecommendationResponse]
  describe 'goal_decumulation_recommendation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for goal_decumulation_status
  # Goal decumulation status
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [GoalStatusResponse]
  describe 'goal_decumulation_status test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for life_insurance_needs_calculator
  # Life insurance needs calculator
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [LifeInsuranceNeedsResponse]
  describe 'life_insurance_needs_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for model_backtest
  # Model backtest
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [BacktestResponse]
  describe 'model_backtest test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for monte_carlo
  # Monte Carlo
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [MonteCarloResponse]
  describe 'monte_carlo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for mortgage_calculator_down_payment
  # Mortgage calculator - down payment
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [MortgageCalculatorDownpaymentResponse]
  describe 'mortgage_calculator_down_payment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for mortgage_calculator_home_price
  # Mortgage calculator - home price
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [MortgageCalculatorHomepriceResponse]
  describe 'mortgage_calculator_home_price test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for mortgage_calculator_periodic_payment
  # Mortgage calculator - periodic payment
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [MortgageCalculatorPeriodicpaymentResponse]
  describe 'mortgage_calculator_periodic_payment test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for mvo
  # Mean-variance optimization
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [MvoResponse]
  describe 'mvo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for portfolio_diversification_score
  # Portfolio diversification score
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PfloDiversificationScoreResponse]
  describe 'portfolio_diversification_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for portfolio_optimization_score
  # Portfolio optimization score
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PfloOptimizationScoreResponse]
  describe 'portfolio_optimization_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for portfolio_what_if
  # Portfolio what-if
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PortfolioWhatIfResponse]
  describe 'portfolio_what_if test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for purchase_calculator_deposit_amount
  # Purchase calculator - deposit amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PurchaseCalculatorDepositamountResponse]
  describe 'purchase_calculator_deposit_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for purchase_calculator_horizon
  # Purchase calculator - horizon
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PurchaseCalculatorPurchasehorizonResponse]
  describe 'purchase_calculator_horizon test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for purchase_calculator_purchase_amount
  # Purchase calculator - purchase amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [PurchaseCalculatorPurchaseamountResponse]
  describe 'purchase_calculator_purchase_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for rebalancing_signal
  # Rebalancing
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RebalanceResponse]
  describe 'rebalancing_signal test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for retirement_calculator_deposit_amount
  # Retirement calculator - deposit amount
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RetirementCalculatorDepositamountResponse]
  describe 'retirement_calculator_deposit_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for retirement_calculator_expenses
  # Retirement calculator - expenses
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RetirementCalculatorExpensesResponse]
  describe 'retirement_calculator_expenses test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for retirement_calculator_percent_covered
  # Retirement calculator - percent of costs covered
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RetirementCalculatorPctcoveredResponse]
  describe 'retirement_calculator_percent_covered test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for risk_allocation
  # Risk allocation
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RiskAllocationResponse]
  describe 'risk_allocation test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for risk_score
  # Risk score
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [RiskScoreResponse]
  describe 'risk_score test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for savings_calculator
  # Savings calculator
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SavingsCalculatorResponse]
  describe 'savings_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for scenario_analysis
  # Scenario analysis
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [ScenarioAnalysisResponse]
  describe 'scenario_analysis test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sensitivity_analysis
  # Sensitivity analysis
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [SensitivityAnalysisResponse]
  describe 'sensitivity_analysis test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for variable_annuity
  # Variable annuity
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [VariableAnnuityResponse]
  describe 'variable_annuity test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
