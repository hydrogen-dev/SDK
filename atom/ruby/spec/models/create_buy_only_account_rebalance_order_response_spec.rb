=begin
#Hydrogen Atom API

#The Hydrogen Atom API

OpenAPI spec version: 1.0.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.2-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for AtomApi::CreateBuyOnlyAccountRebalanceOrderResponse
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CreateBuyOnlyAccountRebalanceOrderResponse' do
  before do
    # run before each test
    @instance = AtomApi::CreateBuyOnlyAccountRebalanceOrderResponse.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CreateBuyOnlyAccountRebalanceOrderResponse' do
    it 'should create an instance of CreateBuyOnlyAccountRebalanceOrderResponse' do
      expect(@instance).to be_instance_of(AtomApi::CreateBuyOnlyAccountRebalanceOrderResponse)
    end
  end
end
