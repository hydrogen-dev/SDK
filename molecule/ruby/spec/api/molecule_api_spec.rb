=begin
#Hydrogen Molecule API

#The Hydrogen Molecule API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for MoleculeApi::MoleculeApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'MoleculeApi' do
  before do
    # run before each test
    @instance = MoleculeApi::MoleculeApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MoleculeApi' do
    it 'should create an instance of MoleculeApi' do
      expect(@instance).to be_instance_of(MoleculeApi::MoleculeApi)
    end
  end

  # unit tests for delete_token
  # Delete a token
  # @param token_id UUID of a token
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_currency_balance
  # Retrieve a currency balance
  # @param currency_balance_id UUID of a currency balance
  # @param [Hash] opts the optional parameters
  # @return [CurrencyBalanceSpecificResponse]
  describe 'get_currency_balance test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_currency_balances
  # Get information for all currency balances defined for your application.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [CurrencyBalanceGetResponse]
  describe 'get_currency_balances test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token
  # Retrieve a token
  # @param token_id UUID of a token
  # @param [Hash] opts the optional parameters
  # @return [TokenSpecificResponse]
  describe 'get_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_balance
  # Retrieve a token balance
  # @param token_balance_id UUID of a token balance
  # @param [Hash] opts the optional parameters
  # @return [TokenBalanceSpecificResponse]
  describe 'get_token_balance test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_balances
  # Get information for all token balances defined for your application.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [TokenBalanceGetResponse]
  describe 'get_token_balances test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_supplies
  # Get information for all token supplies defined for your application.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [TokenSupplyGetResponse]
  describe 'get_token_supplies test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_token_supply
  # Retrieve a token supply
  # @param token_supply_id UUID of a token supply
  # @param [Hash] opts the optional parameters
  # @return [TokenSupplySpecificResponse]
  describe 'get_token_supply test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_tokens
  # Get information for all tokens defined for your firm
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [TokenGetResponse]
  describe 'get_tokens test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_wallet
  # Retrieve a wallet
  # @param wallet_id UUID of a wallet
  # @param [Hash] opts the optional parameters
  # @return [WalletSpecificResponse]
  describe 'get_wallet test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_wallet_key
  # Retrieve a wallet key
  # @param wallet_key_id UUID of a wallet key
  # @param [Hash] opts the optional parameters
  # @return [WalletKeySpecificResponse]
  describe 'get_wallet_key test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_wallet_keys
  # Get all wallet keys associated with wallets defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [WalletKeyGetResponse]
  describe 'get_wallet_keys test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_wallets
  # Get information for all wallets defined for your firm
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :page Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0
  # @option opts [Integer] :size The number or records to be included per page. The default is 25. There is no max value.
  # @option opts [String] :order_by The field in the response body to order the list by. Default is update_date.
  # @option opts [BOOLEAN] :ascending If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending.
  # @return [WalletGetResponse]
  describe 'get_wallets test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_token
  # Create a token under your firm.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [TokenCreateResponse]
  describe 'post_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_token_crowdsale
  # Transfer tokens to a token&#39;s crowdsale address.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [TokenCreateResponse]
  describe 'post_token_crowdsale test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_token_deploy
  # Deploy a secuirty token contract and its crowdsale contract to blockchain.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [TokenCreateResponse]
  describe 'post_token_deploy test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_token_purchase
  # Participate in a token&#39;s crowdsale and purchase tokens.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_token_purchase test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_token_whitelist
  # Add an investor to a token&#39;s whitelist
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'post_token_whitelist test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_wallet
  # Create a wallet under your firm.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [WalletCreateResponse]
  describe 'post_wallet test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_wallet_key
  # Associate an existing key pair with a wallet defined for your firm.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [WalletKeyCreateResponse]
  describe 'post_wallet_key test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for post_wallet_key_generator
  # Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [WalletKeyCreateResponse]
  describe 'post_wallet_key_generator test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_token
  # Update a token
  # @param token_id UUID of a token
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [TokenSpecificResponse]
  describe 'update_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_wallet
  # Update a wallet
  # @param wallet_id UUID of a wallet
  # @param payload 
  # @param [Hash] opts the optional parameters
  # @return [WalletSpecificResponse]
  describe 'update_wallet test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
