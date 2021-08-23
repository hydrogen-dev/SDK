=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.20

=end

require 'uri'

module NucleusApi
  class BusinessApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a business
    # Create a new business, or register a new business.
    # @param business_request businessRequest
    # @param [Hash] opts the optional parameters
    # @return [Business]
    def create_business_using_post(business_request, opts = {})
      data, _status_code, _headers = create_business_using_post_with_http_info(business_request, opts)
      data
    end

    # Create a business
    # Create a new business, or register a new business.
    # @param business_request businessRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(Business, Fixnum, Hash)>] Business data, response status code and response headers
    def create_business_using_post_with_http_info(business_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.create_business_using_post ...'
      end
      # verify the required parameter 'business_request' is set
      if @api_client.config.client_side_validation && business_request.nil?
        fail ArgumentError, "Missing the required parameter 'business_request' when calling BusinessApi.create_business_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/business'

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
      post_body = @api_client.object_to_http_body(business_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Business')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#create_business_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a business
    # Permanently delete a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_business_using_delete(business_id, opts = {})
      delete_business_using_delete_with_http_info(business_id, opts)
      nil
    end

    # Delete a business
    # Permanently delete a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_business_using_delete_with_http_info(business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.delete_business_using_delete ...'
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.delete_business_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}'.sub('{' + 'business_id' + '}', business_id.to_s)

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
        @api_client.config.logger.debug "API called: BusinessApi#delete_business_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all business
    # Get details for all business.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageBusiness]
    def get_business_all_using_get(opts = {})
      data, _status_code, _headers = get_business_all_using_get_with_http_info(opts)
      data
    end

    # List all business
    # Get details for all business.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageBusiness, Fixnum, Hash)>] PageBusiness data, response status code and response headers
    def get_business_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.get_business_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/business'

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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageBusiness')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#get_business_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all business asset sizes
    # Get a list of asset sizes per date for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion Currency Code
    # @option opts [Date] :end_date end date (default to null)
    # @option opts [BOOLEAN] :exclude_subledger exclude_subledger (default to false)
    # @option opts [BOOLEAN] :get_latest true or false
    # @option opts [String] :sort_type  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
    # @option opts [Date] :start_date start date (default to null)
    # @return [Array<AvailableDateDoubleVO>]
    def get_business_asset_size_using_get(business_id, opts = {})
      data, _status_code, _headers = get_business_asset_size_using_get_with_http_info(business_id, opts)
      data
    end

    # List all business asset sizes
    # Get a list of asset sizes per date for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion Currency Code
    # @option opts [Date] :end_date end date
    # @option opts [BOOLEAN] :exclude_subledger exclude_subledger
    # @option opts [BOOLEAN] :get_latest true or false
    # @option opts [String] :sort_type  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
    # @option opts [Date] :start_date start date
    # @return [Array<(Array<AvailableDateDoubleVO>, Fixnum, Hash)>] Array<AvailableDateDoubleVO> data, response status code and response headers
    def get_business_asset_size_using_get_with_http_info(business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.get_business_asset_size_using_get ...'
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.get_business_asset_size_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}/asset_size'.sub('{' + 'business_id' + '}', business_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?
      query_params[:'end_date'] = opts[:'end_date'] if !opts[:'end_date'].nil?
      query_params[:'exclude_subledger'] = opts[:'exclude_subledger'] if !opts[:'exclude_subledger'].nil?
      query_params[:'get_latest'] = opts[:'get_latest'] if !opts[:'get_latest'].nil?
      query_params[:'sort_type'] = opts[:'sort_type'] if !opts[:'sort_type'].nil?
      query_params[:'start_date'] = opts[:'start_date'] if !opts[:'start_date'].nil?

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
        :return_type => 'Array<AvailableDateDoubleVO>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#get_business_asset_size_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all business transactions
    # Get the information for all transactions under all client registered with your business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :end_date end date - yyyy-mm-dd
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @option opts [String] :start_date start date - yyyy-mm-dd
    # @return [PagePortfolioTransaction]
    def get_business_client_transaction_all_using_get(business_id, opts = {})
      data, _status_code, _headers = get_business_client_transaction_all_using_get_with_http_info(business_id, opts)
      data
    end

    # List all business transactions
    # Get the information for all transactions under all client registered with your business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :end_date end date - yyyy-mm-dd
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @option opts [String] :start_date start date - yyyy-mm-dd
    # @return [Array<(PagePortfolioTransaction, Fixnum, Hash)>] PagePortfolioTransaction data, response status code and response headers
    def get_business_client_transaction_all_using_get_with_http_info(business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.get_business_client_transaction_all_using_get ...'
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.get_business_client_transaction_all_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}/transaction'.sub('{' + 'business_id' + '}', business_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?
      query_params[:'end_date'] = opts[:'end_date'] if !opts[:'end_date'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?
      query_params[:'start_date'] = opts[:'start_date'] if !opts[:'start_date'].nil?

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
        :return_type => 'PagePortfolioTransaction')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#get_business_client_transaction_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all business holdings
    # Get a list of holdings for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :currency_conversion Currency Code
    # @option opts [String] :end_date end date - yyyy-mm-dd
    # @option opts [String] :filter filter
    # @option opts [BOOLEAN] :get_latest true or false
    # @option opts [String] :order_by order_by (default to date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @option opts [String] :start_date start date - yyyy-mm-dd
    # @return [PagePortfolioHoldingAgg]
    def get_business_holding_using_get(business_id, opts = {})
      data, _status_code, _headers = get_business_holding_using_get_with_http_info(business_id, opts)
      data
    end

    # List all business holdings
    # Get a list of holdings for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :currency_conversion Currency Code
    # @option opts [String] :end_date end date - yyyy-mm-dd
    # @option opts [String] :filter filter
    # @option opts [BOOLEAN] :get_latest true or false
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @option opts [String] :start_date start date - yyyy-mm-dd
    # @return [Array<(PagePortfolioHoldingAgg, Fixnum, Hash)>] PagePortfolioHoldingAgg data, response status code and response headers
    def get_business_holding_using_get_with_http_info(business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.get_business_holding_using_get ...'
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.get_business_holding_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}/holding'.sub('{' + 'business_id' + '}', business_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?
      query_params[:'end_date'] = opts[:'end_date'] if !opts[:'end_date'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'get_latest'] = opts[:'get_latest'] if !opts[:'get_latest'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?
      query_params[:'start_date'] = opts[:'start_date'] if !opts[:'start_date'].nil?

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
        :return_type => 'PagePortfolioHoldingAgg')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#get_business_holding_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a business
    # Retrieve the information for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [Business]
    def get_business_using_get(business_id, opts = {})
      data, _status_code, _headers = get_business_using_get_with_http_info(business_id, opts)
      data
    end

    # Retrieve a business
    # Retrieve the information for a business.
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Business, Fixnum, Hash)>] Business data, response status code and response headers
    def get_business_using_get_with_http_info(business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.get_business_using_get ...'
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.get_business_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}'.sub('{' + 'business_id' + '}', business_id.to_s)

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
        :return_type => 'Business')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#get_business_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a business
    # Update the information for a business.
    # @param business business
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [Business]
    def update_business_using_put(business, business_id, opts = {})
      data, _status_code, _headers = update_business_using_put_with_http_info(business, business_id, opts)
      data
    end

    # Update a business
    # Update the information for a business.
    # @param business business
    # @param business_id UUID business_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Business, Fixnum, Hash)>] Business data, response status code and response headers
    def update_business_using_put_with_http_info(business, business_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BusinessApi.update_business_using_put ...'
      end
      # verify the required parameter 'business' is set
      if @api_client.config.client_side_validation && business.nil?
        fail ArgumentError, "Missing the required parameter 'business' when calling BusinessApi.update_business_using_put"
      end
      # verify the required parameter 'business_id' is set
      if @api_client.config.client_side_validation && business_id.nil?
        fail ArgumentError, "Missing the required parameter 'business_id' when calling BusinessApi.update_business_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/business/{business_id}'.sub('{' + 'business_id' + '}', business_id.to_s)

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
      post_body = @api_client.object_to_http_body(business)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Business')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BusinessApi#update_business_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
