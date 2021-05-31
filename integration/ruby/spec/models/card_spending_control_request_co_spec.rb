=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for IntegrationApi::CardSpendingControlRequestCO
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CardSpendingControlRequestCO' do
  before do
    # run before each test
    @instance = IntegrationApi::CardSpendingControlRequestCO.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CardSpendingControlRequestCO' do
    it 'should create an instance of CardSpendingControlRequestCO' do
      expect(@instance).to be_instance_of(IntegrationApi::CardSpendingControlRequestCO)
    end
  end
  describe 'test attribute "nucleus_spending_control_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
