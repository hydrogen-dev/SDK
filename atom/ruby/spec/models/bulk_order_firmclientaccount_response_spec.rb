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

# Unit tests for AtomApi::BulkOrderFirmclientaccountResponse
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BulkOrderFirmclientaccountResponse' do
  before do
    # run before each test
    @instance = AtomApi::BulkOrderFirmclientaccountResponse.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BulkOrderFirmclientaccountResponse' do
    it 'should create an instance of BulkOrderFirmclientaccountResponse' do
      expect(@instance).to be_instance_of(AtomApi::BulkOrderFirmclientaccountResponse)
    end
  end
end
