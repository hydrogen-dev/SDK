=begin
#Hydrogen Admin API

#The Hydrogen Admin API

OpenAPI spec version: 1.0.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'uri'

module AdminApi
  class CardApi
    attr_accessor :api_client
    attr_accessor :auth_config
    def initialize(api_client = ApiClient.default, auth_config = AuthConfiguration.default)
      @api_client = api_client
      @auth_config = auth_config
    end

    def create_client_credential_return(appTokenConfig)
      client_credentials_token = @auth_config.create_client_credential_return(appTokenConfig['clientId'], appTokenConfig['clientSecret'])
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppTokenApi#client_credentials_token\nData: #{client_credentials_token.inspect}"
      end
      return client_credentials_token
    end

    def create_password_credential_return(appTokenConfig)

      password_credentials_token = @auth_config.create_password_credential_return(appTokenConfig['clientId'], appTokenConfig['clientSecret'],appTokenConfig['username'], appTokenConfig['password'] )
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppTokenApi#password_credentials_token\nData: #{password_credentials_token.inspect}"
      end
      return password_credentials_token
    end

    def create_client_token_credential_return(appTokenConfig)

      client_token_credentials = @auth_config.create_client_token_credential(appTokenConfig['clientId'], appTokenConfig['clientSecret'],appTokenConfig['clientToken'])
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AppTokenApi#client_token_credentials\nData: #{client_token_credentials.inspect}"
      end
      return client_token_credentials
    end



    # Create a card request
    # Create a new card request.
    # @param card_request cardRequest
    # @param [Hash] opts the optional parameters
    # @return [Card]
    def create_card_using_post(card_request, appTokenConfig = {}, opts = {})
      data, _status_code, _headers = create_card_using_post_with_http_info(card_request, appTokenConfig, opts)
      data
    end

    # Create a card request
    # Create a new card request.
    # @param card_request cardRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(Card, Fixnum, Hash)>] Card data, response status code and response headers
    def create_card_using_post_with_http_info(card_request, appTokenConfig = {}, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardApi.create_card_using_post ...'
      end
      # verify the required parameter 'card_request' is set
      if @api_client.config.client_side_validation && card_request.nil?
        fail ArgumentError, "Missing the required parameter 'card_request' when calling CardApi.create_card_using_post"
      end

      # resource path
      local_var_path = '/nucleus/v1/card'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      if @api_client.config.client_side_validation && appTokenConfig['basePath'].nil?
        fail ArgumentError, "Missing the required parameter 'basePath'"
      end

      if @api_client.config.client_side_validation && appTokenConfig['authType'].nil?
        fail ArgumentError, "Missing the required parameter 'authType'"
      end

      @auth_config.config.host = appTokenConfig['basePath']
      @api_client.config.host = appTokenConfig['basePath']

      if appTokenConfig['authType'].downcase == 'client_credentials'
        client_credentials_token = create_client_credential_return(appTokenConfig)
        @api_client.config.access_token = client_credentials_token
      elsif appTokenConfig['authType'].downcase == 'password_credentials'
        password_credential_token = create_password_credential_return(appTokenConfig)
        @api_client.config.access_token = password_credential_token
      elsif  appTokenConfig['authType'].downcase == 'password_credentials'
        client_token_credential = create_client_token_credential_return(appTokenConfig)
        @api_client.config.access_token = client_token_credential
      end

      # http body (model)
      post_body = @api_client.object_to_http_body(card_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Card')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardApi#create_card_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all card requests
    # Get the information for all card requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageCard]
    def get_card_all_using_get(appTokenConfig = {}, opts = {})
      data, _status_code, _headers = get_card_all_using_get_with_http_info(appTokenConfig, opts)
      data
    end

    # List all card requests
    # Get the information for all card requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageCard, Fixnum, Hash)>] PageCard data, response status code and response headers
    def get_card_all_using_get_with_http_info(appTokenConfig = {}, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardApi.get_card_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/card'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']

      if @api_client.config.client_side_validation && appTokenConfig['basePath'].nil?
        fail ArgumentError, "Missing the required parameter 'basePath'"
      end

      if @api_client.config.client_side_validation && appTokenConfig['authType'].nil?
        fail ArgumentError, "Missing the required parameter 'authType'"
      end

      @auth_config.config.host = appTokenConfig['basePath']
      @api_client.config.host = appTokenConfig['basePath']

      if appTokenConfig['authType'].downcase == 'client_credentials'
        client_credentials_token = create_client_credential_return(appTokenConfig)
        @api_client.config.access_token = client_credentials_token
      elsif appTokenConfig['authType'].downcase == 'password_credentials'
        password_credential_token = create_password_credential_return(appTokenConfig)
        @api_client.config.access_token = password_credential_token
      elsif  appTokenConfig['authType'].downcase == 'password_credentials'
        client_token_credential = create_client_token_credential_return(appTokenConfig)
        @api_client.config.access_token = client_token_credential
      end

      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageCard')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardApi#get_card_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a card request
    # Retrieve the information for a card request.
    # @param card_id UUID card_id
    # @param [Hash] opts the optional parameters
    # @return [Card]
    def get_card_using_get(card_id, appTokenConfig = {}, opts = {})
      data, _status_code, _headers = get_card_using_get_with_http_info(card_id, appTokenConfig, opts)
      data
    end

    # Retrieve a card request
    # Retrieve the information for a card request.
    # @param card_id UUID card_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Card, Fixnum, Hash)>] Card data, response status code and response headers
    def get_card_using_get_with_http_info(card_id, appTokenConfig = {}, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardApi.get_card_using_get ...'
      end
      # verify the required parameter 'card_id' is set
      if @api_client.config.client_side_validation && card_id.nil?
        fail ArgumentError, "Missing the required parameter 'card_id' when calling CardApi.get_card_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/card/{card_id}'.sub('{' + 'card_id' + '}', card_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']

      if @api_client.config.client_side_validation && appTokenConfig['basePath'].nil?
        fail ArgumentError, "Missing the required parameter 'basePath'"
      end

      if @api_client.config.client_side_validation && appTokenConfig['authType'].nil?
        fail ArgumentError, "Missing the required parameter 'authType'"
      end

      @auth_config.config.host = appTokenConfig['basePath']
      @api_client.config.host = appTokenConfig['basePath']

      if appTokenConfig['authType'].downcase == 'client_credentials'
        client_credentials_token = create_client_credential_return(appTokenConfig)
        @api_client.config.access_token = client_credentials_token
      elsif appTokenConfig['authType'].downcase == 'password_credentials'
        password_credential_token = create_password_credential_return(appTokenConfig)
        @api_client.config.access_token = password_credential_token
      elsif  appTokenConfig['authType'].downcase == 'password_credentials'
        client_token_credential = create_client_token_credential_return(appTokenConfig)
        @api_client.config.access_token = client_token_credential
      end

      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Card')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardApi#get_card_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a card request
    # Update the information for a card request.
    # @param card card
    # @param card_id UUID card_id
    # @param [Hash] opts the optional parameters
    # @return [Card]
    def update_card_using_put(card, card_id, appTokenConfig = {}, opts = {})
      data, _status_code, _headers = update_card_using_put_with_http_info(card, card_id, appTokenConfig, opts)
      data
    end

    # Update a card request
    # Update the information for a card request.
    # @param card card
    # @param card_id UUID card_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Card, Fixnum, Hash)>] Card data, response status code and response headers
    def update_card_using_put_with_http_info(card, card_id, appTokenConfig = {}, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardApi.update_card_using_put ...'
      end
      # verify the required parameter 'card' is set
      if @api_client.config.client_side_validation && card.nil?
        fail ArgumentError, "Missing the required parameter 'card' when calling CardApi.update_card_using_put"
      end
      # verify the required parameter 'card_id' is set
      if @api_client.config.client_side_validation && card_id.nil?
        fail ArgumentError, "Missing the required parameter 'card_id' when calling CardApi.update_card_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/card/{card_id}'.sub('{' + 'card_id' + '}', card_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(card)
      auth_names = ['oauth2']

      if @api_client.config.client_side_validation && appTokenConfig['basePath'].nil?
        fail ArgumentError, "Missing the required parameter 'basePath'"
      end

      if @api_client.config.client_side_validation && appTokenConfig['authType'].nil?
        fail ArgumentError, "Missing the required parameter 'authType'"
      end

      @auth_config.config.host = appTokenConfig['basePath']
      @api_client.config.host = appTokenConfig['basePath']

      if appTokenConfig['authType'].downcase == 'client_credentials'
        client_credentials_token = create_client_credential_return(appTokenConfig)
        @api_client.config.access_token = client_credentials_token
      elsif appTokenConfig['authType'].downcase == 'password_credentials'
        password_credential_token = create_password_credential_return(appTokenConfig)
        @api_client.config.access_token = password_credential_token
      elsif  appTokenConfig['authType'].downcase == 'password_credentials'
        client_token_credential = create_client_token_credential_return(appTokenConfig)
        @api_client.config.access_token = client_token_credential
      end
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Card')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardApi#update_card_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
