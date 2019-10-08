=begin
#Hydrogen Molecule API

#The Hydrogen Molecule API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8-SNAPSHOT

=end

# Common files
require 'molecule_api/api_client'
require 'molecule_api/api_error'
require 'molecule_api/version'
require 'molecule_api/configuration'

# Models
require 'molecule_api/models/currency_balance_specific_response'
require 'molecule_api/models/currency_transfer_payload'
require 'molecule_api/models/currency_transfer_specific_response'
require 'molecule_api/models/offering_settings_create_payload'
require 'molecule_api/models/offering_settings_update_payload'
require 'molecule_api/models/pagination'
require 'molecule_api/models/pagination_sort'
require 'molecule_api/models/secondary_id'
require 'molecule_api/models/token_balance_specific_response'
require 'molecule_api/models/token_create_payload'
require 'molecule_api/models/token_crowdsale_payload'
require 'molecule_api/models/token_deploy_payload'
require 'molecule_api/models/token_purchase_payload'
require 'molecule_api/models/token_restrictions_payload'
require 'molecule_api/models/token_supply_specific_response'
require 'molecule_api/models/token_transfer_payload'
require 'molecule_api/models/token_transfer_specific_response'
require 'molecule_api/models/token_update_payload'
require 'molecule_api/models/token_whitelist_payload'
require 'molecule_api/models/wallet_create_client'
require 'molecule_api/models/wallet_create_payload'
require 'molecule_api/models/wallet_create_whitelist'
require 'molecule_api/models/wallet_key_create_payload'
require 'molecule_api/models/wallet_key_create_response'
require 'molecule_api/models/wallet_key_generator_payload'
require 'molecule_api/models/wallet_update_payload'
require 'molecule_api/models/currency_balance_get_response'
require 'molecule_api/models/currency_transfer_get_response'
require 'molecule_api/models/token_balance_get_response'
require 'molecule_api/models/token_create_response'
require 'molecule_api/models/token_get_response'
require 'molecule_api/models/token_supply_get_response'
require 'molecule_api/models/token_transfer_get_response'
require 'molecule_api/models/wallet_create_response'
require 'molecule_api/models/wallet_get_response'
require 'molecule_api/models/wallet_key_get_response'
require 'molecule_api/models/wallet_key_specific_response'
require 'molecule_api/models/token_specific_response'
require 'molecule_api/models/wallet_specific_response'

# APIs
require 'molecule_api/api/molecule_api'

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
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
