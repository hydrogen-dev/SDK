=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for NucleusApi::BudgetAggregationAccount
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BudgetAggregationAccount' do
  before do
    # run before each test
    @instance = NucleusApi::BudgetAggregationAccount.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BudgetAggregationAccount' do
    it 'should create an instance of BudgetAggregationAccount' do
      expect(@instance).to be_instance_of(NucleusApi::BudgetAggregationAccount)
    end
  end
  describe 'test attribute "aggregation_account_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
