=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module ProtonApi
  class CardsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Card Analysis
    # Analyze cardholder activity over time
    # @param card_analysis_request Request payload for Card Analysis
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def card_analysis(card_analysis_request, opts = {})
      data, _status_code, _headers = card_analysis_with_http_info(card_analysis_request, opts)
      data
    end

    # Card Analysis
    # Analyze cardholder activity over time
    # @param card_analysis_request Request payload for Card Analysis
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def card_analysis_with_http_info(card_analysis_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardsApi.card_analysis ...'
      end
      # verify the required parameter 'card_analysis_request' is set
      if @api_client.config.client_side_validation && card_analysis_request.nil?
        fail ArgumentError, "Missing the required parameter 'card_analysis_request' when calling CardsApi.card_analysis"
      end
      # resource path
      local_var_path = '/card_analysis'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(card_analysis_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardsApi#card_analysis\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Card Limit Check
    # Evaluate card transaction history against spending controls
    # @param card_limit_check_request Request payload for Card Limit Check
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def card_limit_check(card_limit_check_request, opts = {})
      data, _status_code, _headers = card_limit_check_with_http_info(card_limit_check_request, opts)
      data
    end

    # Card Limit Check
    # Evaluate card transaction history against spending controls
    # @param card_limit_check_request Request payload for Card Limit Check
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def card_limit_check_with_http_info(card_limit_check_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardsApi.card_limit_check ...'
      end
      # verify the required parameter 'card_limit_check_request' is set
      if @api_client.config.client_side_validation && card_limit_check_request.nil?
        fail ArgumentError, "Missing the required parameter 'card_limit_check_request' when calling CardsApi.card_limit_check"
      end
      # resource path
      local_var_path = '/card_limit_check'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(card_limit_check_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardsApi#card_limit_check\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Card Transaction Authorization
    # Approve or reject a card transaction based on applicable conditions
    # @param card_transaction_authorization_request Request payload for Card Transaction Authorization
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def card_transaction_authorization(card_transaction_authorization_request, opts = {})
      data, _status_code, _headers = card_transaction_authorization_with_http_info(card_transaction_authorization_request, opts)
      data
    end

    # Card Transaction Authorization
    # Approve or reject a card transaction based on applicable conditions
    # @param card_transaction_authorization_request Request payload for Card Transaction Authorization
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def card_transaction_authorization_with_http_info(card_transaction_authorization_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CardsApi.card_transaction_authorization ...'
      end
      # verify the required parameter 'card_transaction_authorization_request' is set
      if @api_client.config.client_side_validation && card_transaction_authorization_request.nil?
        fail ArgumentError, "Missing the required parameter 'card_transaction_authorization_request' when calling CardsApi.card_transaction_authorization"
      end
      # resource path
      local_var_path = '/card_authorization'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(card_transaction_authorization_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CardsApi#card_transaction_authorization\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
