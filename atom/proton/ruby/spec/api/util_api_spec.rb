=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for ProtonApi::UtilApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'UtilApi' do
  before do
    # run before each test
    @instance = ProtonApi::UtilApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UtilApi' do
    it 'should create an instance of UtilApi' do
      expect(@instance).to be_instance_of(ProtonApi::UtilApi)
    end
  end

  # unit tests for decision_tree_result
  # Decision Tree Result
  # Traverse a decision tree and find the resulting leaf node
  # @param decision_tree_result_request Request payload for Decision Tree Result
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'decision_tree_result test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for order_rebalance
  # Order Rebalance
  # Create orders to rebalance client accounts or portfolios
  # @param order_rebalance_request Request payload for Order Rebalance
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'order_rebalance test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for performance_calculator
  # Performance Calculator
  # Calculate performance/risk metrics for a Nucleus entity
  # @param performance_calculator_request Request payload for Performance Calculator
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'performance_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
