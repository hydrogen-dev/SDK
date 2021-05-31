=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for ProtonApi::PortfolioManagementApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PortfolioManagementApi' do
  before do
    # run before each test
    @instance = ProtonApi::PortfolioManagementApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PortfolioManagementApi' do
    it 'should create an instance of PortfolioManagementApi' do
      expect(@instance).to be_instance_of(ProtonApi::PortfolioManagementApi)
    end
  end

  # unit tests for rebalancing_signal
  # Rebalancing Signal
  # Generate rebalancing signals for a group of investments
  # @param rebalancing_signal_request Request payload for Rebalancing Signal
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'rebalancing_signal test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
