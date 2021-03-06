=begin
#Molecule API Documentation

#The Hydrogen Molecule API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'spec_helper'
require 'json'

# Unit tests for MoleculeApi::TokenApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TokenApi' do
  before do
    # run before each test
    @instance = MoleculeApi::TokenApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TokenApi' do
    it 'should create an instance of TokenApi' do
      expect(@instance).to be_instance_of(MoleculeApi::TokenApi)
    end
  end

  # unit tests for burn_token_using_post
  # Burn tokens
  # @param token_burn_params Burns provided amount of existing tokens
  # @param [Hash] opts the optional parameters
  # @return [TransactionSuccessResponse]
  describe 'burn_token_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_token_using_post
  # Creates a new Token
  # @param token_params It enables a user to create a Token
  # @param [Hash] opts the optional parameters
  # @return [TokenResponse]
  describe 'create_token_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_token_using_delete
  # Delete Token
  # @param token_id Token ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_token_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for deploy_token_using_post
  # Deploys provided Token to network
  # @param token_deploy_params Deploys provided Token to network
  # @param [Hash] opts the optional parameters
  # @return [TransactionSuccessResponse]
  describe 'deploy_token_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_all_using_get
  # Fetch Token list
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page To filter response Token list by page number
  # @option opts [Integer] :size Number of records per page
  # @option opts [String] :order_by Field to sort record list
  # @option opts [BOOLEAN] :ascending Sorting order
  # @option opts [BOOLEAN] :get_latest To fetch latest (one) record
  # @return [PageTokenResponse]
  describe 'get_token_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_using_get
  # Fetch Token details
  # @param token_id Token ID
  # @param [Hash] opts the optional parameters
  # @return [TokenResponse]
  describe 'get_token_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for mint_token_using_post
  # Mint new tokens
  # @param token_mint_params Mint new tokens
  # @param [Hash] opts the optional parameters
  # @return [TransactionSuccessResponse]
  describe 'mint_token_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_token_using_put
  # Update Token details
  # @param token_id Token ID
  # @param [Hash] opts the optional parameters
  # @option opts [TokenUpdateParams] :token_update_params Token details to be updated
  # @return [TokenResponse]
  describe 'update_token_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for whitelist_token_using_post
  # Whitelist token for provided wallet
  # @param token_whitelist_params Whitelist token for provided wallet
  # @param [Hash] opts the optional parameters
  # @return [TransactionSuccessResponse]
  describe 'whitelist_token_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
