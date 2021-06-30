=begin
#Hydrogen Admin API

#The Hydrogen Admin API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'uri'

module AdminApi
  class AutoGenerateAppTokenApi
    attr_accessor :api_client
    attr_accessor :auth_config

    def initialize(api_client = ApiClient.default, auth_config = AuthConfiguration.default)
      @api_client = api_client
      @auth_config = auth_config
    end
    # getAppToken
    # @param app_name app_name
    # @param [Hash] opts the optional parameters
    # @return [Array<AppToken>]
    def get_app_token_using_get(appTokenConfig = {})
      data, _status_code, _headers = get_app_token_using_get_with_http_info(appTokenConfig)
      data
    end
    def create_client_credential_return(appTokenConfig)
        client_credentials_token = @auth_config.create_client_credential_return(appTokenConfig['clientId'], appTokenConfig['clientSecret'])
        if @api_client.config.debugging
          @api_client.config.logger.debug "API called: AppTokenApi#get_app_token_using_get\nData: #{client_credentials_token.inspect}"
        end
      return client_credentials_token
    end

    def create_password_credential_return(appTokenConfig)

        password_credentials_token = @auth_config.create_password_credential_return(appTokenConfig['clientId'], appTokenConfig['clientSecret'],appTokenConfig['username'], appTokenConfig['password'] )
        if @api_client.config.debugging
          @api_client.config.logger.debug "API called: AppTokenApi#password_credentials_token\nData: #{client_credentials_token.inspect}"
        end
      return password_credentials_token
    end
    # getAppToken
    # @param app_name app_name
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<AppToken>, Fixnum, Hash)>] Array<AppToken> data, response status code and response headers
    def get_app_token_using_get_with_http_info(appTokenConfig = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AppTokenApi.get_app_token_using_get ...'
      end
      # verify the required parameter 'app_name' is set
      if @api_client.config.client_side_validation && appTokenConfig['appName'] == nil?
        fail ArgumentError, "Missing the required parameter 'app_name' when calling AppTokenApi.get_app_token_using_get"
      end

      template  = "<tag app-token='##app_token##' ##attrib_map##></tag>";
      @auth_config.config.host = appTokenConfig['basePath']
      @api_client.config.host = appTokenConfig['basePath']

      # resource path
      local_var_path = '/app_token'

      # query parameters
      query_params = {}
      #query_params[:'app_name'] = @api_client.build_collection_param(appTokenConfig['appName'], :multi)

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']

      app_names = appTokenConfig['appName']
      response = [];

      finalAttribMap = []
      if appTokenConfig['attribMap']
        finalAttribMap = appTokenConfig['attribMap'].map { |it| "#{it['name']}='#{it['value']}'"}
      end

      app_names.each do |app|
        if app[:auth_type].downcase == 'client_credentials'
          client_credentials_token = create_client_credential_return(appTokenConfig)
          @api_client.config.access_token = client_credentials_token
        elsif app[:auth_type].downcase == 'password_credentials'
          @api_client.config.access_token =  appTokenConfig['userAccessToken']
          if appTokenConfig['isCredsPassed']
            password_credentials_token = create_password_credential_return(appTokenConfig)
            @api_client.config.access_token = password_credentials_token
          end
        end 

        appTokenData, status_code, headers = @api_client.call_api(:GET, '/app_token?app_name=' + app[:app_name],
          :header_params => header_params,
          :query_params => [],
          :form_params => form_params,
          :body => post_body,
          :auth_names => auth_names,
          :return_type => 'Array<AppToken>')
        if @api_client.config.debugging
          @api_client.config.logger.debug "API called: AppTokenApi#get_app_token_using_get\nData: #{appTokenData.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
        end
        
        appTokenValue = appTokenData && appTokenData.length()>0 ? appTokenData.values_at(0).map(&:app_token)[0] : '';
        tagValue = app[:app_name].downcase.gsub(/_/, '-');
        fillTemplateValue = template.gsub(/tag/, tagValue)
                                  .gsub(/##app_token##/, appTokenValue)
                                  .gsub(/##attrib_map##/, finalAttribMap!=nil ?  finalAttribMap.join(' ') : '');
      item ={}
      item[app[:app_name]] = appTokenValue;
      if appTokenConfig['isEmbed']
        item[app[:app_name]] = fillTemplateValue;
      end
      response.append(item);
      end
      return response
    end
  end
end