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

# Unit tests for NucleusApi::PortfolioApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PortfolioApi' do
  before do
    # run before each test
    @instance = NucleusApi::PortfolioApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PortfolioApi' do
    it 'should create an instance of PortfolioApi' do
      expect(@instance).to be_instance_of(NucleusApi::PortfolioApi)
    end
  end

  # unit tests for create_portfolio_asset_size_using_post
  # Create a portfolio asset size
  # Create a new asset size record for a portfolio.
  # @param portfolio_asset_size_log_request portfolioAssetSizeLogRequest
  # @param [Hash] opts the optional parameters
  # @return [PortfolioAssetSizeLog]
  describe 'create_portfolio_asset_size_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_portfolio_comment_using_post
  # Create a portfolio commentary
  # Create a new comment for a portfolio defined for your firm.
  # @param portfolio_comment portfolioComment
  # @param [Hash] opts the optional parameters
  # @return [PortfolioComment]
  describe 'create_portfolio_comment_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_portfolio_goal_using_post
  # Create an portfolio goal
  # Create an portfolio goal.
  # @param portfolio_goal portfolioGoal
  # @param [Hash] opts the optional parameters
  # @return [PortfolioGoal]
  describe 'create_portfolio_goal_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_portfolio_holding_using_post
  # Create a portfolio holding
  # Create a new holding record for a portfolio.
  # @param portfolio_holdin_log_request portfolioHoldinLogRequest
  # @param [Hash] opts the optional parameters
  # @return [PortfolioHoldingLog]
  describe 'create_portfolio_holding_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_portfolio_transaction_using_post
  # Create a portfolio transaction
  # Create a new transaction record for a portfolio.
  # @param portfolio_transaction_request portfolioTransactionRequest
  # @param [Hash] opts the optional parameters
  # @return [PortfolioTransaction]
  describe 'create_portfolio_transaction_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_portfolio_using_post
  # Create a portfolio
  # Create a new portfolio for an account.
  # @param portfolio_request portfolioRequest
  # @param [Hash] opts the optional parameters
  # @return [Portfolio]
  describe 'create_portfolio_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_asset_size_using_delete
  # Delete a portfolio asset size
  # Permanently delete a portfolio asset size record for a portfolio.
  # @param portfolio_asset_size_id UUID portfolio_asset_size_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_asset_size_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_comment_using_delete
  # Delete a portfolio commentary
  # Permanently delete a portfolio comment for a portfolio.
  # @param portfolio_comment_id UUID portfolio_comment_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_comment_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_goal_using_delete
  # Delete an portfolio goal
  # Permanently delete an portfolio-goal mapping.
  # @param portfolio_goal_id UUID portfolio_goal_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_goal_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_holding_using_delete
  # Delete a portfolio holding
  # Permanently delete a portfolio holding record for a portfolio.
  # @param portfolio_holding_id UUID portfolio_holding_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_holding_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_transaction_using_delete
  # Delete a portfolio transaction
  # Permanently delete a portfolio transaction record for a portfolio.
  # @param portfolio_transaction_id UUID portfolio_transaction_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_transaction_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_portfolio_using_delete
  # Delete a portfolio
  # Permanently delete a portfolio for an account.
  # @param portfolio_id UUID portfolio_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_portfolio_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_all_portfolio_transaction_by_post_using_post
  # getAllPortfolioTransactionByPost
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioTransaction]
  describe 'get_all_portfolio_transaction_by_post_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_aggregated_data_using_get
  # Retrieve an portfolio aggregate data
  # Retrieve the information for a securities associated with a portfolio.
  # @param portfolio_id Portfolio Id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :show_asset_class true or false
  # @option opts [BOOLEAN] :show_category true or false
  # @option opts [BOOLEAN] :show_industry true or false
  # @option opts [BOOLEAN] :show_sector true or false
  # @option opts [BOOLEAN] :show_security_class true or false
  # @return [Object]
  describe 'get_portfolio_aggregated_data_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_all_using_get
  # List all portfolios
  # Get the information for all portfolios assigned to all of your firm’s accounts. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolio]
  describe 'get_portfolio_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_asset_size_all_using_get
  # Retrieve a portfolio asset size
  # Retrieve the information for a portfolio asset size record for a portfolio. 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioAssetSizeLog]
  describe 'get_portfolio_asset_size_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_asset_size_using_get
  # Retrieve a portfolio asset size
  # Retrieve the information for a portfolio asset size record for a portfolio.
  # @param portfolio_asset_size_id portfolio_asset_size_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion currency_conversion
  # @return [PortfolioAssetSizeLog]
  describe 'get_portfolio_asset_size_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_comment_all_using_get
  # List all portfolio commentary
  # List all comments for all portfolios defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioComment]
  describe 'get_portfolio_comment_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_comment_using_get
  # Retrieve a portfolio commentary
  # Retrieve the information for a portfolio comment for a portfolio.
  # @param portfolio_comment_id UUID portfolio_comment_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioComment]
  describe 'get_portfolio_comment_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_goal_all_using_get
  # List all portfolio goals
  # Get information for all portfolio-goal mappings defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioGoal]
  describe 'get_portfolio_goal_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_goal_using_get
  # Retrieve an portfolio goal
  # Retrieve the information for a specific portfolio-goal mapping.
  # @param portfolio_goal_id UUID portfolio_goal_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioGoal]
  describe 'get_portfolio_goal_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_holding_all_using_get
  # List all portfolio holdings
  # Get the information for all holding records for all portfolios defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioHoldingLog]
  describe 'get_portfolio_holding_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_holding_using_get
  # Retrieve a portfolio holding
  # Retrieve the information for a portfolio holding record for a portfolio.
  # @param portfolio_holding_id UUID portfolio_holding_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [PortfolioHoldingLog]
  describe 'get_portfolio_holding_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_transaction_all_using_get
  # List all portfolio transactions
  # Get the information for all transaction records for all portfolios defined for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PagePortfolioTransaction]
  describe 'get_portfolio_transaction_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_transaction_using_get
  # Retrieve a portfolio transaction
  # Retrieve the information for a portfolio transaction record for a portfolio. 
  # @param portfolio_transaction_id UUID portfolio_transaction_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [PortfolioTransaction]
  describe 'get_portfolio_transaction_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_portfolio_using_get
  # Retrieve a portfolio
  # Retrieve a portfolio for an account.
  # @param portfolio_id UUID portfolio_id
  # @param [Hash] opts the optional parameters
  # @return [Portfolio]
  describe 'get_portfolio_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_asset_size_using_put
  # Update a portfolio asset size
  # Update the information for a portfolio asset size record for a portfolio.
  # @param portfolio_asset_size portfolio_asset_size
  # @param portfolio_asset_size_id UUID portfolio_asset_size_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioAssetSizeLog]
  describe 'update_portfolio_asset_size_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_comment_using_put
  # Update a portfolio comment
  # Update the information for a portfolio comment for a portfolio.
  # @param portfolio_comment portfolio_comment
  # @param portfolio_comment_id UUID portfolio_comment_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioComment]
  describe 'update_portfolio_comment_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_goal_using_put
  # Update an portfolio goal
  # Update the information for an portfolio-goal mapping.
  # @param portfolio_goal portfolio_goal
  # @param portfolio_goal_id UUID portfolio_goal_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioGoal]
  describe 'update_portfolio_goal_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_holding_using_put
  # Update a portfolio holding
  # Update the information for a portfolio holding record for a portfolio.
  # @param portfolio_holding portfolio_holding
  # @param portfolio_holding_id UUID portfolio_holding_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioHoldingLog]
  describe 'update_portfolio_holding_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_transaction_using_put
  # Update a portfolio transaction
  # Update the information for a portfolio transaction record for a portfolio.
  # @param portfolio_transaction portfolio_transaction
  # @param portfolio_transaction_id UUID portfolio_transaction_id
  # @param [Hash] opts the optional parameters
  # @return [PortfolioTransaction]
  describe 'update_portfolio_transaction_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_portfolio_using_put
  # Update a portfolio
  # Update a portfolio for an account.
  # @param portfolio portfolio
  # @param portfolio_id UUID portfolio_id
  # @param [Hash] opts the optional parameters
  # @return [Portfolio]
  describe 'update_portfolio_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
