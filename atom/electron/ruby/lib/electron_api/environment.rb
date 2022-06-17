=begin
#Hydrogen Electron API

#The Hydrogen Electron API

OpenAPI spec version: 1.3.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.24

=end
require 'uri'

module ElectronApi
  class Environment
    attr_accessor :api_client
    attr_accessor :auth_config
    attr_accessor :SANDBOX
    attr_accessor :PRODUCTION
    def initialize(api_client = ApiClient.default, config = Configuration.default, auth_config = AuthConfiguration.default)
      @api_client = api_client
      @config = config
      @auth_config = auth_config
      @SANDBOX = 'sandbox.hydrogenplatform.com'
      @PRODUCTION = 'api.hydrogenplatform.com'
    end

    def set_environment(host)
      if (host)
        @config.config.host=host
        @api_client.config.host=host
        @auth_config.set_base_url(host)
      end
    end
  end
end