=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.5
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module NucleusApi
  class BudgetApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a budget request
    # Create a new budget request.
    # @param budget_request budgetRequest
    # @param [Hash] opts the optional parameters
    # @return [Budget]
    def create_budget_using_post(budget_request, opts = {})
      data, _status_code, _headers = create_budget_using_post_with_http_info(budget_request, opts)
      data
    end

    # Create a budget request
    # Create a new budget request.
    # @param budget_request budgetRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(Budget, Fixnum, Hash)>] Budget data, response status code and response headers
    def create_budget_using_post_with_http_info(budget_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BudgetApi.create_budget_using_post ...'
      end
      # verify the required parameter 'budget_request' is set
      if @api_client.config.client_side_validation && budget_request.nil?
        fail ArgumentError, "Missing the required parameter 'budget_request' when calling BudgetApi.create_budget_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/budget'

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
      post_body = @api_client.object_to_http_body(budget_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Budget')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BudgetApi#create_budget_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a budget request
    # Permanently delete a budget request.
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_budget_using_delete(budget_id, opts = {})
      delete_budget_using_delete_with_http_info(budget_id, opts)
      nil
    end

    # Delete a budget request
    # Permanently delete a budget request.
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_budget_using_delete_with_http_info(budget_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BudgetApi.delete_budget_using_delete ...'
      end
      # verify the required parameter 'budget_id' is set
      if @api_client.config.client_side_validation && budget_id.nil?
        fail ArgumentError, "Missing the required parameter 'budget_id' when calling BudgetApi.delete_budget_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/budget/{budget_id}'.sub('{' + 'budget_id' + '}', budget_id.to_s)

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
        @api_client.config.logger.debug "API called: BudgetApi#delete_budget_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all budget requests
    # Get the information for all budget requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageBudget]
    def get_budget_all_using_get(opts = {})
      data, _status_code, _headers = get_budget_all_using_get_with_http_info(opts)
      data
    end

    # List all budget requests
    # Get the information for all budget requests.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageBudget, Fixnum, Hash)>] PageBudget data, response status code and response headers
    def get_budget_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BudgetApi.get_budget_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/budget'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?
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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageBudget')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BudgetApi#get_budget_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a budget request
    # Retrieve the information for a budget request.
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [Budget]
    def get_budget_using_get(budget_id, opts = {})
      data, _status_code, _headers = get_budget_using_get_with_http_info(budget_id, opts)
      data
    end

    # Retrieve a budget request
    # Retrieve the information for a budget request.
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [Array<(Budget, Fixnum, Hash)>] Budget data, response status code and response headers
    def get_budget_using_get_with_http_info(budget_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BudgetApi.get_budget_using_get ...'
      end
      # verify the required parameter 'budget_id' is set
      if @api_client.config.client_side_validation && budget_id.nil?
        fail ArgumentError, "Missing the required parameter 'budget_id' when calling BudgetApi.get_budget_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/budget/{budget_id}'.sub('{' + 'budget_id' + '}', budget_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?

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
        :return_type => 'Budget')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BudgetApi#get_budget_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a budget request
    # Update the information for a budget request.
    # @param budget budget
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @return [Budget]
    def update_budget_using_put(budget, budget_id, opts = {})
      data, _status_code, _headers = update_budget_using_put_with_http_info(budget, budget_id, opts)
      data
    end

    # Update a budget request
    # Update the information for a budget request.
    # @param budget budget
    # @param budget_id UUID budget_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Budget, Fixnum, Hash)>] Budget data, response status code and response headers
    def update_budget_using_put_with_http_info(budget, budget_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BudgetApi.update_budget_using_put ...'
      end
      # verify the required parameter 'budget' is set
      if @api_client.config.client_side_validation && budget.nil?
        fail ArgumentError, "Missing the required parameter 'budget' when calling BudgetApi.update_budget_using_put"
      end
      # verify the required parameter 'budget_id' is set
      if @api_client.config.client_side_validation && budget_id.nil?
        fail ArgumentError, "Missing the required parameter 'budget_id' when calling BudgetApi.update_budget_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/budget/{budget_id}'.sub('{' + 'budget_id' + '}', budget_id.to_s)

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
      post_body = @api_client.object_to_http_body(budget)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Budget')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BudgetApi#update_budget_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
