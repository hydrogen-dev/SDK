=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.2.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.14

=end

require 'uri'

module IntegrationApi
  class IAVApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Instant Account Verification of an account.
    # Endpoint is used to verify account.
    # @param iav_request_co iavRequestCO
    # @param [Hash] opts the optional parameters
    # @return [IavResponseVo]
    def create_iav_using_post(iav_request_co, opts = {})
      data, _status_code, _headers = create_iav_using_post_with_http_info(iav_request_co, opts)
      data
    end

    # Instant Account Verification of an account.
    # Endpoint is used to verify account.
    # @param iav_request_co iavRequestCO
    # @param [Hash] opts the optional parameters
    # @return [Array<(IavResponseVo, Fixnum, Hash)>] IavResponseVo data, response status code and response headers
    def create_iav_using_post_with_http_info(iav_request_co, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IAVApi.create_iav_using_post ...'
      end
      # verify the required parameter 'iav_request_co' is set
      if @api_client.config.client_side_validation && iav_request_co.nil?
        fail ArgumentError, "Missing the required parameter 'iav_request_co' when calling IAVApi.create_iav_using_post"
      end
      # resource path
      local_var_path = '/iav'

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
      post_body = @api_client.object_to_http_body(iav_request_co)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'IavResponseVo')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IAVApi#create_iav_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get verified account based on id.
    # Get verified account based on id.
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [IavResponseVo]
    def get_iav_using_get(nucleus_bank_link_id, opts = {})
      data, _status_code, _headers = get_iav_using_get_with_http_info(nucleus_bank_link_id, opts)
      data
    end

    # Get verified account based on id.
    # Get verified account based on id.
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(IavResponseVo, Fixnum, Hash)>] IavResponseVo data, response status code and response headers
    def get_iav_using_get_with_http_info(nucleus_bank_link_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: IAVApi.get_iav_using_get ...'
      end
      # verify the required parameter 'nucleus_bank_link_id' is set
      if @api_client.config.client_side_validation && nucleus_bank_link_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_bank_link_id' when calling IAVApi.get_iav_using_get"
      end
      # resource path
      local_var_path = '/iav/{nucleus_bank_link_id}'.sub('{' + 'nucleus_bank_link_id' + '}', nucleus_bank_link_id.to_s)

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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'IavResponseVo')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: IAVApi#get_iav_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
