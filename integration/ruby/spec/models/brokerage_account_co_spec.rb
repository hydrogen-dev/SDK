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

# Unit tests for IntegrationApi::BrokerageAccountCO
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BrokerageAccountCO' do
  before do
    # run before each test
    @instance = IntegrationApi::BrokerageAccountCO.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BrokerageAccountCO' do
    it 'should create an instance of BrokerageAccountCO' do
      expect(@instance).to be_instance_of(IntegrationApi::BrokerageAccountCO)
    end
  end
  describe 'test attribute "nucleus_account_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "nucleus_document_ids"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
