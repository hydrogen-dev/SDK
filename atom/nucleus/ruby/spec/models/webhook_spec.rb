=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for NucleusApi::Webhook
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'Webhook' do
  before do
    # run before each test
    @instance = NucleusApi::Webhook.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Webhook' do
    it 'should create an instance of Webhook' do
      expect(@instance).to be_instance_of(NucleusApi::Webhook)
    end
  end
  describe 'test attribute "atom_service"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Array<String>', ["CLIENT", "CLIENT_STATUS", "ACCOUNT_STATUS", "ACCOUNT", "CARD", "CARD_STATUS", "PORTFOLIO_ASSET_SIZE", "PORTFOLIO_TRANSACTION", "PORTFOLIO_TRANSACTION_STATUS", "PORTFOLIO_HOLDING", "AGGREGATION_ACCOUNT", "AGGREGATION_ACCOUNT_STATUS", "NOTIFICATION_CLIENT", "AGGREGATION_ACCOUNT_BALANCE", "AUDIT_LOG", "SUPPORT_TICKET", "FEATURE_TRACK", "AGGREGATION_ACCOUNT_TRANSACTION", "AGGREGATION_ACCOUNT_TRANSACTION_STATUS", "AGGREGATION_ACCOUNT_HOLDING", "ORDER_TRACK", "FUNDING", "FUNDING_STATUS", "BUDGET", "DOCUMENT", "CLIENT_RESPONSE", "CLIENT_VERIFIED", "DOCUMENT_VERIFIED", "BANK_LINK_VERIFIED"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.atom_service = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "create_date"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "is_active"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "secondary_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "secret"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "update_date"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "url"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
