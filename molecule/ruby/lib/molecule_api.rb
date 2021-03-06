=begin
#Molecule API Documentation

#The Hydrogen Molecule API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

# Common files
require 'molecule_api/api_client'
require 'molecule_api/api_error'
require 'molecule_api/version'
require 'molecule_api/configuration'
require 'molecule_api/auth_configuration'
# Models
require 'molecule_api/models/crowdsale_deploy_params'
require 'molecule_api/models/crowdsale_fund_params'
require 'molecule_api/models/crowdsale_purchase_params'
require 'molecule_api/models/currency_balance_response'
require 'molecule_api/models/currency_balance_update_params'
require 'molecule_api/models/currency_params'
require 'molecule_api/models/currency_response'
require 'molecule_api/models/currency_transfer_params'
require 'molecule_api/models/currency_transfer_response'
require 'molecule_api/models/currency_update_params'
require 'molecule_api/models/document'
require 'molecule_api/models/document_params'
require 'molecule_api/models/document_response'
require 'molecule_api/models/document_verify_response'
require 'molecule_api/models/error_response'
require 'molecule_api/models/escrow_deposit_params'
require 'molecule_api/models/escrow_params'
require 'molecule_api/models/escrow_response'
require 'molecule_api/models/escrow_transaction_response'
require 'molecule_api/models/page_currency_balance_response'
require 'molecule_api/models/page_currency_response'
require 'molecule_api/models/page_currency_transfer_response'
require 'molecule_api/models/page_escrow_response'
require 'molecule_api/models/page_escrow_transaction_response'
require 'molecule_api/models/page_token_balance_response'
require 'molecule_api/models/page_token_response'
require 'molecule_api/models/page_token_supply_response'
require 'molecule_api/models/page_token_transfer_response'
require 'molecule_api/models/page_transaction_success_response'
require 'molecule_api/models/page_wallet_key_response'
require 'molecule_api/models/page_wallet_permission_response'
require 'molecule_api/models/page_wallet_response'
require 'molecule_api/models/page_webhook_response'
require 'molecule_api/models/sort'
require 'molecule_api/models/token_balance_response'
require 'molecule_api/models/token_burn_params'
require 'molecule_api/models/token_deploy_params'
require 'molecule_api/models/token_mint_params'
require 'molecule_api/models/token_params'
require 'molecule_api/models/token_params_offering_settings'
require 'molecule_api/models/token_response'
require 'molecule_api/models/token_response_offering_settings'
require 'molecule_api/models/token_supply_response'
require 'molecule_api/models/token_transfer_params'
require 'molecule_api/models/token_transfer_response'
require 'molecule_api/models/token_update_params'
require 'molecule_api/models/token_whitelist_params'
require 'molecule_api/models/token_whitelists'
require 'molecule_api/models/transaction_success_response'
require 'molecule_api/models/wallet_clients'
require 'molecule_api/models/wallet_clients_permission'
require 'molecule_api/models/wallet_key_generate_params'
require 'molecule_api/models/wallet_key_params'
require 'molecule_api/models/wallet_key_response'
require 'molecule_api/models/wallet_params'
require 'molecule_api/models/wallet_permission_response'
require 'molecule_api/models/wallet_permission_update_params'
require 'molecule_api/models/wallet_response'
require 'molecule_api/models/webhook_params'
require 'molecule_api/models/webhook_response'

# APIs
require 'molecule_api/api/currency_api'
require 'molecule_api/api/currency_balance_api'
require 'molecule_api/api/currency_transfer_api'
require 'molecule_api/api/document_api'
require 'molecule_api/api/escrow_api'
require 'molecule_api/api/escrow_transaction_api'
require 'molecule_api/api/token_api'
require 'molecule_api/api/token_balance_api'
require 'molecule_api/api/token_crowdsale_api'
require 'molecule_api/api/token_supply_api'
require 'molecule_api/api/token_transfer_api'
require 'molecule_api/api/transaction_status_api'
require 'molecule_api/api/wallet_api'
require 'molecule_api/api/wallet_key_api'
require 'molecule_api/api/wallet_permission_api'
require 'molecule_api/api/webhook_api'

module MoleculeApi
  class << self
    # Customize default settings for the SDK using block.
    #   MoleculeApi.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(AuthConfiguration.default)
      else
        AuthConfiguration.default
      end
    end
  end
end
