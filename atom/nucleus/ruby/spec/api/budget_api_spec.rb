=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::BudgetApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BudgetApi' do
  before do
    # run before each test
    @instance = NucleusApi::BudgetApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BudgetApi' do
    it 'should create an instance of BudgetApi' do
      expect(@instance).to be_instance_of(NucleusApi::BudgetApi)
    end
  end

  # unit tests for create_budget_using_post
  # Create a budget request
  # Create a new budget request.
  # @param budget_request budgetRequest
  # @param [Hash] opts the optional parameters
  # @return [Budget]
  describe 'create_budget_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_budget_using_delete
  # Delete a budget request
  # Permanently delete a budget request.
  # @param budget_id UUID budget_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_budget_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_budget_all_using_get
  # List all budget requests
  # Get the information for all budget requests.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageBudget]
  describe 'get_budget_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_budget_using_get
  # Retrieve a budget request
  # Retrieve the information for a budget request.
  # @param budget_id UUID budget_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [Budget]
  describe 'get_budget_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_budget_using_put
  # Update a budget request
  # Update the information for a budget request.
  # @param budget budget
  # @param budget_id UUID budget_id
  # @param [Hash] opts the optional parameters
  # @return [Budget]
  describe 'update_budget_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
