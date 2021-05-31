=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.3.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module IntegrationApi
  class WireApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Cancel the Wire transfer
    # @param nucleus_funding_id nucleus_funding_id
    # @param [Hash] opts the optional parameters
    # @return [WireTransferResponseVO]
    def cancel_wire_transfer_using_delete(nucleus_funding_id, opts = {})
      data, _status_code, _headers = cancel_wire_transfer_using_delete_with_http_info(nucleus_funding_id, opts)
      data
    end

    # Cancel the Wire transfer
    # @param nucleus_funding_id nucleus_funding_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireTransferResponseVO, Fixnum, Hash)>] WireTransferResponseVO data, response status code and response headers
    def cancel_wire_transfer_using_delete_with_http_info(nucleus_funding_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.cancel_wire_transfer_using_delete ...'
      end
      # verify the required parameter 'nucleus_funding_id' is set
      if @api_client.config.client_side_validation && nucleus_funding_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_funding_id' when calling WireApi.cancel_wire_transfer_using_delete"
      end
      # resource path
      local_var_path = '/wire/{nucleus_funding_id}'.sub('{' + 'nucleus_funding_id' + '}', nucleus_funding_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'WireTransferResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#cancel_wire_transfer_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create bank link
    # @param request request
    # @param [Hash] opts the optional parameters
    # @return [WireBankLinkResponseVO]
    def create_bank_link_using_post3(request, opts = {})
      data, _status_code, _headers = create_bank_link_using_post3_with_http_info(request, opts)
      data
    end

    # Create bank link
    # @param request request
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireBankLinkResponseVO, Fixnum, Hash)>] WireBankLinkResponseVO data, response status code and response headers
    def create_bank_link_using_post3_with_http_info(request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.create_bank_link_using_post3 ...'
      end
      # verify the required parameter 'request' is set
      if @api_client.config.client_side_validation && request.nil?
        fail ArgumentError, "Missing the required parameter 'request' when calling WireApi.create_bank_link_using_post3"
      end
      # resource path
      local_var_path = '/wire/bank_link'

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
      post_body = @api_client.object_to_http_body(request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'WireBankLinkResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#create_bank_link_using_post3\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [WireBankLinkResponseVO]
    def delete_bank_link_using_delete4(nucleus_bank_link_id, opts = {})
      data, _status_code, _headers = delete_bank_link_using_delete4_with_http_info(nucleus_bank_link_id, opts)
      data
    end

    # Delete bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireBankLinkResponseVO, Fixnum, Hash)>] WireBankLinkResponseVO data, response status code and response headers
    def delete_bank_link_using_delete4_with_http_info(nucleus_bank_link_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.delete_bank_link_using_delete4 ...'
      end
      # verify the required parameter 'nucleus_bank_link_id' is set
      if @api_client.config.client_side_validation && nucleus_bank_link_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_bank_link_id' when calling WireApi.delete_bank_link_using_delete4"
      end
      # resource path
      local_var_path = '/wire/bank_link/{nucleus_bank_link_id}'.sub('{' + 'nucleus_bank_link_id' + '}', nucleus_bank_link_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'WireBankLinkResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#delete_bank_link_using_delete4\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [WireBankLinkResponseVO]
    def get_bank_link_using_get3(nucleus_bank_link_id, opts = {})
      data, _status_code, _headers = get_bank_link_using_get3_with_http_info(nucleus_bank_link_id, opts)
      data
    end

    # Get bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireBankLinkResponseVO, Fixnum, Hash)>] WireBankLinkResponseVO data, response status code and response headers
    def get_bank_link_using_get3_with_http_info(nucleus_bank_link_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.get_bank_link_using_get3 ...'
      end
      # verify the required parameter 'nucleus_bank_link_id' is set
      if @api_client.config.client_side_validation && nucleus_bank_link_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_bank_link_id' when calling WireApi.get_bank_link_using_get3"
      end
      # resource path
      local_var_path = '/wire/bank_link/{nucleus_bank_link_id}'.sub('{' + 'nucleus_bank_link_id' + '}', nucleus_bank_link_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'WireBankLinkResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#get_bank_link_using_get3\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get client bank links
    # @param nucleus_client_id nucleus_client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<WireBankLinkResponseVO>]
    def get_client_bank_links_using_get2(nucleus_client_id, opts = {})
      data, _status_code, _headers = get_client_bank_links_using_get2_with_http_info(nucleus_client_id, opts)
      data
    end

    # Get client bank links
    # @param nucleus_client_id nucleus_client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<WireBankLinkResponseVO>, Fixnum, Hash)>] Array<WireBankLinkResponseVO> data, response status code and response headers
    def get_client_bank_links_using_get2_with_http_info(nucleus_client_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.get_client_bank_links_using_get2 ...'
      end
      # verify the required parameter 'nucleus_client_id' is set
      if @api_client.config.client_side_validation && nucleus_client_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_client_id' when calling WireApi.get_client_bank_links_using_get2"
      end
      # resource path
      local_var_path = '/wire/bank_link/client/{nucleus_client_id}'.sub('{' + 'nucleus_client_id' + '}', nucleus_client_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<WireBankLinkResponseVO>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#get_client_bank_links_using_get2\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a list of Wire transfers
    # @param nucleus_client_id nucleus_client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<WireTransferResponseVO>]
    def get_list_of_wire_transfers_using_get(nucleus_client_id, opts = {})
      data, _status_code, _headers = get_list_of_wire_transfers_using_get_with_http_info(nucleus_client_id, opts)
      data
    end

    # Get a list of Wire transfers
    # @param nucleus_client_id nucleus_client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<WireTransferResponseVO>, Fixnum, Hash)>] Array<WireTransferResponseVO> data, response status code and response headers
    def get_list_of_wire_transfers_using_get_with_http_info(nucleus_client_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.get_list_of_wire_transfers_using_get ...'
      end
      # verify the required parameter 'nucleus_client_id' is set
      if @api_client.config.client_side_validation && nucleus_client_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_client_id' when calling WireApi.get_list_of_wire_transfers_using_get"
      end
      # resource path
      local_var_path = '/wire/client/{nucleus_client_id}'.sub('{' + 'nucleus_client_id' + '}', nucleus_client_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'Array<WireTransferResponseVO>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#get_list_of_wire_transfers_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get the Wire transfer
    # @param nucleus_funding_id nucleus_funding_id
    # @param [Hash] opts the optional parameters
    # @return [WireTransferResponseVO]
    def get_wire_transfer_using_get(nucleus_funding_id, opts = {})
      data, _status_code, _headers = get_wire_transfer_using_get_with_http_info(nucleus_funding_id, opts)
      data
    end

    # Get the Wire transfer
    # @param nucleus_funding_id nucleus_funding_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireTransferResponseVO, Fixnum, Hash)>] WireTransferResponseVO data, response status code and response headers
    def get_wire_transfer_using_get_with_http_info(nucleus_funding_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.get_wire_transfer_using_get ...'
      end
      # verify the required parameter 'nucleus_funding_id' is set
      if @api_client.config.client_side_validation && nucleus_funding_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_funding_id' when calling WireApi.get_wire_transfer_using_get"
      end
      # resource path
      local_var_path = '/wire/{nucleus_funding_id}'.sub('{' + 'nucleus_funding_id' + '}', nucleus_funding_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

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
        :return_type => 'WireTransferResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#get_wire_transfer_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Submit a Wire transfer
    # @param transfer_request transferRequest
    # @param [Hash] opts the optional parameters
    # @return [WireTransferResponseVO]
    def submit_wire_transfer_using_post(transfer_request, opts = {})
      data, _status_code, _headers = submit_wire_transfer_using_post_with_http_info(transfer_request, opts)
      data
    end

    # Submit a Wire transfer
    # @param transfer_request transferRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireTransferResponseVO, Fixnum, Hash)>] WireTransferResponseVO data, response status code and response headers
    def submit_wire_transfer_using_post_with_http_info(transfer_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.submit_wire_transfer_using_post ...'
      end
      # verify the required parameter 'transfer_request' is set
      if @api_client.config.client_side_validation && transfer_request.nil?
        fail ArgumentError, "Missing the required parameter 'transfer_request' when calling WireApi.submit_wire_transfer_using_post"
      end
      # resource path
      local_var_path = '/wire'

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
      post_body = @api_client.object_to_http_body(transfer_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'WireTransferResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#submit_wire_transfer_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [WireBankLinkResponseVO]
    def update_bank_link_using_put3(nucleus_bank_link_id, opts = {})
      data, _status_code, _headers = update_bank_link_using_put3_with_http_info(nucleus_bank_link_id, opts)
      data
    end

    # Update bank link
    # @param nucleus_bank_link_id nucleus_bank_link_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(WireBankLinkResponseVO, Fixnum, Hash)>] WireBankLinkResponseVO data, response status code and response headers
    def update_bank_link_using_put3_with_http_info(nucleus_bank_link_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WireApi.update_bank_link_using_put3 ...'
      end
      # verify the required parameter 'nucleus_bank_link_id' is set
      if @api_client.config.client_side_validation && nucleus_bank_link_id.nil?
        fail ArgumentError, "Missing the required parameter 'nucleus_bank_link_id' when calling WireApi.update_bank_link_using_put3"
      end
      # resource path
      local_var_path = '/wire/bank_link/{nucleus_bank_link_id}'.sub('{' + 'nucleus_bank_link_id' + '}', nucleus_bank_link_id.to_s)

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
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'WireBankLinkResponseVO')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WireApi#update_bank_link_using_put3\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
