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

# Unit tests for NucleusApi::BulkApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BulkApi' do
  before do
    # run before each test
    @instance = NucleusApi::BulkApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BulkApi' do
    it 'should create an instance of BulkApi' do
      expect(@instance).to be_instance_of(NucleusApi::BulkApi)
    end
  end

  # unit tests for create_bulk_using_post
  # Create a bulk data
  # Create a new bulk data for your firm.
  # @param data data
  # @param entity_uri UUID entity_uri
  # @param [Hash] opts the optional parameters
  # @return [BulkTransaction]
  describe 'create_bulk_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_bulk_using_delete
  # Delete a bulk data
  # Delete a bulk data for your firm.
  # @param data data
  # @param entity_uri UUID entity_uri
  # @param [Hash] opts the optional parameters
  # @return [BulkTransaction]
  describe 'delete_bulk_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_bulk_status_using_get
  # Status of bulk transaction
  # Get the status of bulk transaction.
  # @param id UUID Bulk Transaction Id
  # @param [Hash] opts the optional parameters
  # @return [BulkTransactionVO]
  describe 'get_bulk_status_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_bulk_using_put
  # Update a bulk data
  # Update a bulk data for your firm.
  # @param data data
  # @param entity_uri UUID entity_uri
  # @param [Hash] opts the optional parameters
  # @return [BulkTransaction]
  describe 'update_bulk_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
