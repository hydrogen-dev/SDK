=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.5
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::SpendingControlApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'SpendingControlApi' do
  before do
    # run before each test
    @instance = NucleusApi::SpendingControlApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SpendingControlApi' do
    it 'should create an instance of SpendingControlApi' do
      expect(@instance).to be_instance_of(NucleusApi::SpendingControlApi)
    end
  end

  # unit tests for create_spending_control_using_post
  # Create a Spending Control
  # Create a new Spending Control.
  # @param spending_control spendingControl
  # @param [Hash] opts the optional parameters
  # @return [SpendingControl]
  describe 'create_spending_control_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_spending_control_using_delete
  # Delete a Spending Control
  # Permanently Delete Spending Control.
  # @param spending_control_id spending_control_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_spending_control_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_spending_control_all_using_get
  # List all Spending Control
  # List all Spending Control.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageSpendingControl]
  describe 'get_spending_control_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_spending_control_using_get
  # Retrieve a Spending Control
  # Retrieve a Spending Control. 
  # @param spending_control_id spending_control_id
  # @param [Hash] opts the optional parameters
  # @return [SpendingControl]
  describe 'get_spending_control_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_spending_control_using_put
  # Update a Spending Control
  # Update a Spending Control. 
  # @param spending_control spending_control
  # @param spending_control_id UUID spending_control_id
  # @param [Hash] opts the optional parameters
  # @return [SpendingControl]
  describe 'update_spending_control_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
