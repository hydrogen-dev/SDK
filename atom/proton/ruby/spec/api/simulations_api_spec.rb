=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for ProtonApi::SimulationsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'SimulationsApi' do
  before do
    # run before each test
    @instance = ProtonApi::SimulationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SimulationsApi' do
    it 'should create an instance of SimulationsApi' do
      expect(@instance).to be_instance_of(ProtonApi::SimulationsApi)
    end
  end

  # unit tests for backtest
  # Backtest
  # Run a historical analysis for a group of investments
  # @param backtest_request Request payload for Backtest
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'backtest test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for event_study
  # Event Study
  # Analyze a group of investments against key historical events
  # @param event_study_request Request payload for Event Study
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'event_study test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for monte_carlo
  # Monte Carlo
  # Simulate the future growth of a group of investments
  # @param monte_carlo_request Request payload for Monte Carlo
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'monte_carlo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for portfolio_what_if
  # Porfolio What-If
  # Simulate the impact of adding, removing, reducing, or increasing various positions in a group of investments
  # @param portfolio_what_if_request Request payload for Portfolio What-If
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'portfolio_what_if test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for savings_calculator
  # Savings Calculator
  # Simulate the future growth of a simple savings account
  # @param savings_calculator_request Request payload for Savings Calculator
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'savings_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for scenario_analysis
  # Scenario Analysis
  # Analyze a group of investments against a series of external economic factors
  # @param scneario_analysis_request Request payload for Scenario Analysis
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'scenario_analysis test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sensitivity_analysis
  # Sensitivity Analysis
  # Analyze a group of investments against an external economic factor
  # @param sensitivity_analysis_request Request payload for Sensitivity Analysis
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'sensitivity_analysis test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
