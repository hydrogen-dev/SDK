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

# Unit tests for ProtonApi::CardsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CardsApi' do
  before do
    # run before each test
    @instance = ProtonApi::CardsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CardsApi' do
    it 'should create an instance of CardsApi' do
      expect(@instance).to be_instance_of(ProtonApi::CardsApi)
    end
  end

  # unit tests for card_analysis
  # Card Analysis
  # Analyze cardholder activity over time
  # @param card_analysis_request Request payload for Card Analysis
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'card_analysis test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for card_limit_check
  # Card Limit Check
  # Evaluate card transaction history against spending controls
  # @param card_limit_check_request Request payload for Card Limit Check
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'card_limit_check test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for card_transaction_authorization
  # Card Transaction Authorization
  # Approve or reject a card transaction based on applicable conditions
  # @param card_transaction_authorization_request Request payload for Card Transaction Authorization
  # @param [Hash] opts the optional parameters
  # @return [Hash<String, Object>]
  describe 'card_transaction_authorization test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
