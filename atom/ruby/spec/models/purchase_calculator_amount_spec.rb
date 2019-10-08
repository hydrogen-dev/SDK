=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for AtomApi::PurchaseCalculatorAmount
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PurchaseCalculatorAmount' do
  before do
    # run before each test
    @instance = AtomApi::PurchaseCalculatorAmount.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PurchaseCalculatorAmount' do
    it 'should create an instance of PurchaseCalculatorAmount' do
      expect(@instance).to be_instance_of(AtomApi::PurchaseCalculatorAmount)
    end
  end
  describe 'test attribute "purchase_horizon"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "portfolio_return"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "horizon_frequency_interval"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["year", "quarter", "month", "week"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.horizon_frequency_interval = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "current_savings"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "deposit_schedule"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "inflation_rate"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "investment_tax"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
