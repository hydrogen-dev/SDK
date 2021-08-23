=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module NucleusApi
  class SpendingControlApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a Spending Control
    # Create a new Spending Control.
    # @param spending_control spendingControl
    # @param [Hash] opts the optional parameters
    # @return [SpendingControl]
    def create_spending_control_using_post(spending_control, opts = {})
      data, _status_code, _headers = create_spending_control_using_post_with_http_info(spending_control, opts)
      data
    end

    # Create a Spending Control
    # Create a new Spending Control.
    # @param spending_control spendingControl
    # @param [Hash] opts the optional parameters
    # @return [Array<(SpendingControl, Fixnum, Hash)>] SpendingControl data, response status code and response headers
    def create_spending_control_using_post_with_http_info(spending_control, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SpendingControlApi.create_spending_control_using_post ...'
      end
      # verify the required parameter 'spending_control' is set
      if @api_client.config.client_side_validation && spending_control.nil?
        fail ArgumentError, "Missing the required parameter 'spending_control' when calling SpendingControlApi.create_spending_control_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/spending_control'

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
      post_body = @api_client.object_to_http_body(spending_control)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SpendingControl')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SpendingControlApi#create_spending_control_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a Spending Control
    # Permanently Delete Spending Control.
    # @param spending_control_id spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_spending_control_using_delete(spending_control_id, opts = {})
      delete_spending_control_using_delete_with_http_info(spending_control_id, opts)
      nil
    end

    # Delete a Spending Control
    # Permanently Delete Spending Control.
    # @param spending_control_id spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_spending_control_using_delete_with_http_info(spending_control_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SpendingControlApi.delete_spending_control_using_delete ...'
      end
      # verify the required parameter 'spending_control_id' is set
      if @api_client.config.client_side_validation && spending_control_id.nil?
        fail ArgumentError, "Missing the required parameter 'spending_control_id' when calling SpendingControlApi.delete_spending_control_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/spending_control/{spending_control_id}'.sub('{' + 'spending_control_id' + '}', spending_control_id.to_s)

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
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SpendingControlApi#delete_spending_control_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Spending Control
    # List all Spending Control.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageSpendingControl]
    def get_spending_control_all_using_get(opts = {})
      data, _status_code, _headers = get_spending_control_all_using_get_with_http_info(opts)
      data
    end

    # List all Spending Control
    # List all Spending Control.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageSpendingControl, Fixnum, Hash)>] PageSpendingControl data, response status code and response headers
    def get_spending_control_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SpendingControlApi.get_spending_control_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/spending_control'

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
        :return_type => 'PageSpendingControl')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SpendingControlApi#get_spending_control_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a Spending Control
    # Retrieve a Spending Control. 
    # @param spending_control_id spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [SpendingControl]
    def get_spending_control_using_get(spending_control_id, opts = {})
      data, _status_code, _headers = get_spending_control_using_get_with_http_info(spending_control_id, opts)
      data
    end

    # Retrieve a Spending Control
    # Retrieve a Spending Control. 
    # @param spending_control_id spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(SpendingControl, Fixnum, Hash)>] SpendingControl data, response status code and response headers
    def get_spending_control_using_get_with_http_info(spending_control_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SpendingControlApi.get_spending_control_using_get ...'
      end
      # verify the required parameter 'spending_control_id' is set
      if @api_client.config.client_side_validation && spending_control_id.nil?
        fail ArgumentError, "Missing the required parameter 'spending_control_id' when calling SpendingControlApi.get_spending_control_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/spending_control/{spending_control_id}'.sub('{' + 'spending_control_id' + '}', spending_control_id.to_s)

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
        :return_type => 'SpendingControl')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SpendingControlApi#get_spending_control_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a Spending Control
    # Update a Spending Control. 
    # @param spending_control spending_control
    # @param spending_control_id UUID spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [SpendingControl]
    def update_spending_control_using_put(spending_control, spending_control_id, opts = {})
      data, _status_code, _headers = update_spending_control_using_put_with_http_info(spending_control, spending_control_id, opts)
      data
    end

    # Update a Spending Control
    # Update a Spending Control. 
    # @param spending_control spending_control
    # @param spending_control_id UUID spending_control_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(SpendingControl, Fixnum, Hash)>] SpendingControl data, response status code and response headers
    def update_spending_control_using_put_with_http_info(spending_control, spending_control_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SpendingControlApi.update_spending_control_using_put ...'
      end
      # verify the required parameter 'spending_control' is set
      if @api_client.config.client_side_validation && spending_control.nil?
        fail ArgumentError, "Missing the required parameter 'spending_control' when calling SpendingControlApi.update_spending_control_using_put"
      end
      # verify the required parameter 'spending_control_id' is set
      if @api_client.config.client_side_validation && spending_control_id.nil?
        fail ArgumentError, "Missing the required parameter 'spending_control_id' when calling SpendingControlApi.update_spending_control_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/spending_control/{spending_control_id}'.sub('{' + 'spending_control_id' + '}', spending_control_id.to_s)

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
      post_body = @api_client.object_to_http_body(spending_control)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SpendingControl')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SpendingControlApi#update_spending_control_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
