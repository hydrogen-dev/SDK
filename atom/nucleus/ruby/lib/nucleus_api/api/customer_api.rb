=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'uri'

module NucleusApi
  class CustomerApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a customer revenue
    # Create a new customer revenue, with your firm.
    # @param customer_revenue customerRevenue
    # @param [Hash] opts the optional parameters
    # @return [CustomerRevenue]
    def create_customer_revenue_using_post(customer_revenue, opts = {})
      data, _status_code, _headers = create_customer_revenue_using_post_with_http_info(customer_revenue, opts)
      data
    end

    # Create a customer revenue
    # Create a new customer revenue, with your firm.
    # @param customer_revenue customerRevenue
    # @param [Hash] opts the optional parameters
    # @return [Array<(CustomerRevenue, Fixnum, Hash)>] CustomerRevenue data, response status code and response headers
    def create_customer_revenue_using_post_with_http_info(customer_revenue, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.create_customer_revenue_using_post ...'
      end
      # verify the required parameter 'customer_revenue' is set
      if @api_client.config.client_side_validation && customer_revenue.nil?
        fail ArgumentError, "Missing the required parameter 'customer_revenue' when calling CustomerApi.create_customer_revenue_using_post"
      end
      # resource path
      local_var_path = '/customer_revenue'

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
      post_body = @api_client.object_to_http_body(customer_revenue)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'CustomerRevenue')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#create_customer_revenue_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a customer
    # Create a new customer, with your firm.
    # @param customer customer
    # @param [Hash] opts the optional parameters
    # @return [Customer]
    def create_customer_using_post(customer, opts = {})
      data, _status_code, _headers = create_customer_using_post_with_http_info(customer, opts)
      data
    end

    # Create a customer
    # Create a new customer, with your firm.
    # @param customer customer
    # @param [Hash] opts the optional parameters
    # @return [Array<(Customer, Fixnum, Hash)>] Customer data, response status code and response headers
    def create_customer_using_post_with_http_info(customer, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.create_customer_using_post ...'
      end
      # verify the required parameter 'customer' is set
      if @api_client.config.client_side_validation && customer.nil?
        fail ArgumentError, "Missing the required parameter 'customer' when calling CustomerApi.create_customer_using_post"
      end
      # resource path
      local_var_path = '/customer'

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
      post_body = @api_client.object_to_http_body(customer)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Customer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#create_customer_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a customer revenue
    # Delete a customer revenue. 
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_customer_revenue_using_delete(customer_revenue_id, opts = {})
      delete_customer_revenue_using_delete_with_http_info(customer_revenue_id, opts)
      nil
    end

    # Delete a customer revenue
    # Delete a customer revenue. 
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_customer_revenue_using_delete_with_http_info(customer_revenue_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.delete_customer_revenue_using_delete ...'
      end
      # verify the required parameter 'customer_revenue_id' is set
      if @api_client.config.client_side_validation && customer_revenue_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_revenue_id' when calling CustomerApi.delete_customer_revenue_using_delete"
      end
      # resource path
      local_var_path = '/customer_revenue/{customer_revenue_id}'.sub('{' + 'customer_revenue_id' + '}', customer_revenue_id.to_s)

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
        @api_client.config.logger.debug "API called: CustomerApi#delete_customer_revenue_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a customer
    # Delete a customer. 
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_customer_using_delete(customer_id, opts = {})
      delete_customer_using_delete_with_http_info(customer_id, opts)
      nil
    end

    # Delete a customer
    # Delete a customer. 
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_customer_using_delete_with_http_info(customer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.delete_customer_using_delete ...'
      end
      # verify the required parameter 'customer_id' is set
      if @api_client.config.client_side_validation && customer_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_id' when calling CustomerApi.delete_customer_using_delete"
      end
      # resource path
      local_var_path = '/customer/{customer_id}'.sub('{' + 'customer_id' + '}', customer_id.to_s)

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
        @api_client.config.logger.debug "API called: CustomerApi#delete_customer_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all customer
    # List all customer. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageCustomer]
    def get_customer_all_using_get(opts = {})
      data, _status_code, _headers = get_customer_all_using_get_with_http_info(opts)
      data
    end

    # List all customer
    # List all customer. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageCustomer, Fixnum, Hash)>] PageCustomer data, response status code and response headers
    def get_customer_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.get_customer_all_using_get ...'
      end
      # resource path
      local_var_path = '/customer'

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
        :return_type => 'PageCustomer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#get_customer_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all customer revenue
    # List all customer revenue. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageCustomerRevenue]
    def get_customer_revenue_all_using_get(opts = {})
      data, _status_code, _headers = get_customer_revenue_all_using_get_with_http_info(opts)
      data
    end

    # List all customer revenue
    # List all customer revenue. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageCustomerRevenue, Fixnum, Hash)>] PageCustomerRevenue data, response status code and response headers
    def get_customer_revenue_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.get_customer_revenue_all_using_get ...'
      end
      # resource path
      local_var_path = '/customer_revenue'

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
        :return_type => 'PageCustomerRevenue')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#get_customer_revenue_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a customer revenue
    # Retrieve a customer revenue. 
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [CustomerRevenue]
    def get_customer_revenue_using_get(customer_revenue_id, opts = {})
      data, _status_code, _headers = get_customer_revenue_using_get_with_http_info(customer_revenue_id, opts)
      data
    end

    # Retrieve a customer revenue
    # Retrieve a customer revenue. 
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [Array<(CustomerRevenue, Fixnum, Hash)>] CustomerRevenue data, response status code and response headers
    def get_customer_revenue_using_get_with_http_info(customer_revenue_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.get_customer_revenue_using_get ...'
      end
      # verify the required parameter 'customer_revenue_id' is set
      if @api_client.config.client_side_validation && customer_revenue_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_revenue_id' when calling CustomerApi.get_customer_revenue_using_get"
      end
      # resource path
      local_var_path = '/customer_revenue/{customer_revenue_id}'.sub('{' + 'customer_revenue_id' + '}', customer_revenue_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?

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
        :return_type => 'CustomerRevenue')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#get_customer_revenue_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a customer
    # Retrieve a customer. 
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [Customer]
    def get_customer_using_get(customer_id, opts = {})
      data, _status_code, _headers = get_customer_using_get_with_http_info(customer_id, opts)
      data
    end

    # Retrieve a customer
    # Retrieve a customer. 
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Customer, Fixnum, Hash)>] Customer data, response status code and response headers
    def get_customer_using_get_with_http_info(customer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.get_customer_using_get ...'
      end
      # verify the required parameter 'customer_id' is set
      if @api_client.config.client_side_validation && customer_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_id' when calling CustomerApi.get_customer_using_get"
      end
      # resource path
      local_var_path = '/customer/{customer_id}'.sub('{' + 'customer_id' + '}', customer_id.to_s)

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
        :return_type => 'Customer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#get_customer_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a customer revenue
    # Update a customer revenue. 
    # @param customer_revenue customer_revenue
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @return [CustomerRevenue]
    def update_customer_revenue_using_put(customer_revenue, customer_revenue_id, opts = {})
      data, _status_code, _headers = update_customer_revenue_using_put_with_http_info(customer_revenue, customer_revenue_id, opts)
      data
    end

    # Update a customer revenue
    # Update a customer revenue. 
    # @param customer_revenue customer_revenue
    # @param customer_revenue_id UUID customer_revenue_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(CustomerRevenue, Fixnum, Hash)>] CustomerRevenue data, response status code and response headers
    def update_customer_revenue_using_put_with_http_info(customer_revenue, customer_revenue_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.update_customer_revenue_using_put ...'
      end
      # verify the required parameter 'customer_revenue' is set
      if @api_client.config.client_side_validation && customer_revenue.nil?
        fail ArgumentError, "Missing the required parameter 'customer_revenue' when calling CustomerApi.update_customer_revenue_using_put"
      end
      # verify the required parameter 'customer_revenue_id' is set
      if @api_client.config.client_side_validation && customer_revenue_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_revenue_id' when calling CustomerApi.update_customer_revenue_using_put"
      end
      # resource path
      local_var_path = '/customer_revenue/{customer_revenue_id}'.sub('{' + 'customer_revenue_id' + '}', customer_revenue_id.to_s)

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
      post_body = @api_client.object_to_http_body(customer_revenue)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'CustomerRevenue')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#update_customer_revenue_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a customer
    # Update a customer. 
    # @param customer customer
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [Customer]
    def update_customer_using_put(customer, customer_id, opts = {})
      data, _status_code, _headers = update_customer_using_put_with_http_info(customer, customer_id, opts)
      data
    end

    # Update a customer
    # Update a customer. 
    # @param customer customer
    # @param customer_id UUID customer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Customer, Fixnum, Hash)>] Customer data, response status code and response headers
    def update_customer_using_put_with_http_info(customer, customer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomerApi.update_customer_using_put ...'
      end
      # verify the required parameter 'customer' is set
      if @api_client.config.client_side_validation && customer.nil?
        fail ArgumentError, "Missing the required parameter 'customer' when calling CustomerApi.update_customer_using_put"
      end
      # verify the required parameter 'customer_id' is set
      if @api_client.config.client_side_validation && customer_id.nil?
        fail ArgumentError, "Missing the required parameter 'customer_id' when calling CustomerApi.update_customer_using_put"
      end
      # resource path
      local_var_path = '/customer/{customer_id}'.sub('{' + 'customer_id' + '}', customer_id.to_s)

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
      post_body = @api_client.object_to_http_body(customer)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Customer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomerApi#update_customer_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
