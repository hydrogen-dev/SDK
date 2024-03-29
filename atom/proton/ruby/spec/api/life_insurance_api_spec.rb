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

# Unit tests for ProtonApi::LifeInsuranceApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LifeInsuranceApi' do
  before do
    # run before each test
    @instance = ProtonApi::LifeInsuranceApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LifeInsuranceApi' do
    it 'should create an instance of LifeInsuranceApi' do
      expect(@instance).to be_instance_of(ProtonApi::LifeInsuranceApi)
    end
  end

  # unit tests for life_insurance_needs_calculator
  # Life Insurance Needs Calculator
  # Calculate life insurance needs based on existing asset and liability data
  # @param life_insurance_needs_calculator_request Request payload for Life Insurance Needs Calculator
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'life_insurance_needs_calculator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
