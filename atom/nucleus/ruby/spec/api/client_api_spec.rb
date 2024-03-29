=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.5
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.20

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::ClientApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ClientApi' do
  before do
    # run before each test
    @instance = NucleusApi::ClientApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ClientApi' do
    it 'should create an instance of ClientApi' do
      expect(@instance).to be_instance_of(NucleusApi::ClientApi)
    end
  end

  # unit tests for create_client_response_using_post
  # Create a client response
  # Create a new client response for a question as part of a questionnaires.
  # @param client_response clientResponse
  # @param [Hash] opts the optional parameters
  # @return [ClientResponse]
  describe 'create_client_response_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_client_status_using_post
  # Create an client status
  # Create an client status record for an client.
  # @param client_status_request clientStatusRequest
  # @param [Hash] opts the optional parameters
  # @return [ClientStatus]
  describe 'create_client_status_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_client_using_post
  # Create a client
  # Create a new client, or register a new user, with your firm.
  # @param client_request clientRequest
  # @param [Hash] opts the optional parameters
  # @return [Client]
  describe 'create_client_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_client_response_using_delete
  # Delete a client response
  # Permanently delete a client response for a client.
  # @param client_response_id UUID client_response_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_client_response_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_client_status_using_delete
  # Delete an client status
  # Permanently delete an client status record from an client’s history.
  # @param client_status_id UUID client_status_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_client_status_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_client_using_delete
  # Delete a client
  # Permanently delete a client registered with your firm. Turns the client&#39;s is_active  &#x3D; 0
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_client_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_account_overview_using_get
  # List all client Account overview
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :order_by order_by
  # @return [Object]
  describe 'get_client_account_overview_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_advisor_overview_using_get
  # Advisor overview
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :show_clients show_clients
  # @return [Object]
  describe 'get_client_advisor_overview_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_all_using_get
  # List all clients
  # Get details for all clients registered with your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageClient]
  describe 'get_client_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_asset_size_using_get
  # List all client asset sizes
  # Get a list of asset sizes per date for a client.
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion Currency Code
  # @option opts [Date] :end_date end date
  # @option opts [BOOLEAN] :exclude_subledger exclude_subledger
  # @option opts [BOOLEAN] :get_latest true or false
  # @option opts [String] :sort_type  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  # @option opts [Date] :start_date start date
  # @return [Array<AvailableDateDoubleVO>]
  describe 'get_client_asset_size_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_goal_overview_using_get
  # Retrieve client&#39;s goal details 
  # Retrieve client&#39;s goal details
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :portfolio_goal portfolio_goal
  # @return [VClientGoalViewData]
  describe 'get_client_goal_overview_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_holding_using_get
  # List all client holdings
  # Get the information for all the securities that are currently being held by a client registered with your firm.
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion Currency Code
  # @option opts [String] :end_date end date - yyyy-mm-dd
  # @option opts [String] :filter filter
  # @option opts [BOOLEAN] :get_latest true or false
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @option opts [String] :start_date start date - yyyy-mm-dd
  # @return [PagePortfolioHoldingAgg]
  describe 'get_client_holding_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_response_all_using_get
  # List all client responses
  # Get all the client responses for questions as part of a questionnaire defined by your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageClientResponse]
  describe 'get_client_response_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_response_using_get
  # Retrieve a client response
  # Retrieve the information for a client response for a client.
  # @param client_response_id UUID client_response_id
  # @param [Hash] opts the optional parameters
  # @return [ClientResponse]
  describe 'get_client_response_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_status_all_using_get
  # List all client statuses
  # Get the client status history information for all clients.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageClientStatus]
  describe 'get_client_status_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_status_using_get
  # Retrieve an client status
  # Retrieve the information for a specific client status record for an client.
  # @param client_status_id UUID client_status_id
  # @param [Hash] opts the optional parameters
  # @return [ClientStatus]
  describe 'get_client_status_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_transaction_all_using_get
  # List all client transactions
  # Get the information for all transactions under a client registered with your firm.
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :end_date end date - yyyy-mm-dd
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @option opts [String] :start_date start date - yyyy-mm-dd
  # @return [PagePortfolioTransaction]
  describe 'get_client_transaction_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_client_using_get
  # Retrieve a client
  # Retrieve the information for a client registered with your firm.
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @return [Client]
  describe 'get_client_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_client_response_using_put
  # Update a client response
  # Update a client response for a client.
  # @param client_response client_response
  # @param client_response_id UUID client_response_id
  # @param [Hash] opts the optional parameters
  # @return [ClientResponse]
  describe 'update_client_response_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_client_status_using_put
  # Update an client status
  # Update an client status record for an client.
  # @param client_status client_status
  # @param client_status_id UUID client_status_id
  # @param [Hash] opts the optional parameters
  # @return [ClientStatus]
  describe 'update_client_status_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_client_using_put
  # Update a client
  # Update the information for a client registered with your firm.
  # @param client client
  # @param client_id UUID client_id
  # @param [Hash] opts the optional parameters
  # @return [Client]
  describe 'update_client_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
