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

# Unit tests for AtomApi::AccountPermissionClientsPayload
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AccountPermissionClientsPayload' do
  before do
    # run before each test
    @instance = AtomApi::AccountPermissionClientsPayload.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AccountPermissionClientsPayload' do
    it 'should create an instance of AccountPermissionClientsPayload' do
      expect(@instance).to be_instance_of(AtomApi::AccountPermissionClientsPayload)
    end
  end
  describe 'test attribute "client_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "permission_type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["INQUIRY_ACCESS", "LIMTIED_AUTHORITY", "FULL_AUTHORITY", "POWER_OF_ATTORNEY"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.permission_type = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "acl_exist"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
