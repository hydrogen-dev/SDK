=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module NucleusApi
  class RiskProfileApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a Risk Profile
    # Create a new Risk Profile. 
    # @param risk_profile riskProfile
    # @param [Hash] opts the optional parameters
    # @return [RiskProfile]
    def create_risk_profile_using_post(risk_profile, opts = {})
      data, _status_code, _headers = create_risk_profile_using_post_with_http_info(risk_profile, opts)
      data
    end

    # Create a Risk Profile
    # Create a new Risk Profile. 
    # @param risk_profile riskProfile
    # @param [Hash] opts the optional parameters
    # @return [Array<(RiskProfile, Fixnum, Hash)>] RiskProfile data, response status code and response headers
    def create_risk_profile_using_post_with_http_info(risk_profile, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RiskProfileApi.create_risk_profile_using_post ...'
      end
      # verify the required parameter 'risk_profile' is set
      if @api_client.config.client_side_validation && risk_profile.nil?
        fail ArgumentError, "Missing the required parameter 'risk_profile' when calling RiskProfileApi.create_risk_profile_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/risk_profile'

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
      post_body = @api_client.object_to_http_body(risk_profile)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'RiskProfile')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RiskProfileApi#create_risk_profile_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a Risk Profile
    # Permanently Delete a Risk Profile.
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_risk_profile_using_delete(risk_profile_id, opts = {})
      delete_risk_profile_using_delete_with_http_info(risk_profile_id, opts)
      nil
    end

    # Delete a Risk Profile
    # Permanently Delete a Risk Profile.
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_risk_profile_using_delete_with_http_info(risk_profile_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RiskProfileApi.delete_risk_profile_using_delete ...'
      end
      # verify the required parameter 'risk_profile_id' is set
      if @api_client.config.client_side_validation && risk_profile_id.nil?
        fail ArgumentError, "Missing the required parameter 'risk_profile_id' when calling RiskProfileApi.delete_risk_profile_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/risk_profile/{risk_profile_id}'.sub('{' + 'risk_profile_id' + '}', risk_profile_id.to_s)

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
        @api_client.config.logger.debug "API called: RiskProfileApi#delete_risk_profile_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get All Risk Profile
    # Get All Risk Profile. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageRiskProfile]
    def get_risk_profile_all_using_get(opts = {})
      data, _status_code, _headers = get_risk_profile_all_using_get_with_http_info(opts)
      data
    end

    # Get All Risk Profile
    # Get All Risk Profile. 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageRiskProfile, Fixnum, Hash)>] PageRiskProfile data, response status code and response headers
    def get_risk_profile_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RiskProfileApi.get_risk_profile_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/risk_profile'

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
        :return_type => 'PageRiskProfile')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RiskProfileApi#get_risk_profile_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get a Risk Profile
    # Get a Risk Profile. 
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [RiskProfile]
    def get_risk_profile_using_get(risk_profile_id, opts = {})
      data, _status_code, _headers = get_risk_profile_using_get_with_http_info(risk_profile_id, opts)
      data
    end

    # Get a Risk Profile
    # Get a Risk Profile. 
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(RiskProfile, Fixnum, Hash)>] RiskProfile data, response status code and response headers
    def get_risk_profile_using_get_with_http_info(risk_profile_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RiskProfileApi.get_risk_profile_using_get ...'
      end
      # verify the required parameter 'risk_profile_id' is set
      if @api_client.config.client_side_validation && risk_profile_id.nil?
        fail ArgumentError, "Missing the required parameter 'risk_profile_id' when calling RiskProfileApi.get_risk_profile_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/risk_profile/{risk_profile_id}'.sub('{' + 'risk_profile_id' + '}', risk_profile_id.to_s)

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
        :return_type => 'RiskProfile')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RiskProfileApi#get_risk_profile_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a Risk Profile
    # Update a Risk Profile. 
    # @param risk_profile risk_profile
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [RiskProfile]
    def update_risk_profile_using_put(risk_profile, risk_profile_id, opts = {})
      data, _status_code, _headers = update_risk_profile_using_put_with_http_info(risk_profile, risk_profile_id, opts)
      data
    end

    # Update a Risk Profile
    # Update a Risk Profile. 
    # @param risk_profile risk_profile
    # @param risk_profile_id UUID risk_profile_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(RiskProfile, Fixnum, Hash)>] RiskProfile data, response status code and response headers
    def update_risk_profile_using_put_with_http_info(risk_profile, risk_profile_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: RiskProfileApi.update_risk_profile_using_put ...'
      end
      # verify the required parameter 'risk_profile' is set
      if @api_client.config.client_side_validation && risk_profile.nil?
        fail ArgumentError, "Missing the required parameter 'risk_profile' when calling RiskProfileApi.update_risk_profile_using_put"
      end
      # verify the required parameter 'risk_profile_id' is set
      if @api_client.config.client_side_validation && risk_profile_id.nil?
        fail ArgumentError, "Missing the required parameter 'risk_profile_id' when calling RiskProfileApi.update_risk_profile_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/risk_profile/{risk_profile_id}'.sub('{' + 'risk_profile_id' + '}', risk_profile_id.to_s)

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
      post_body = @api_client.object_to_http_body(risk_profile)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'RiskProfile')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: RiskProfileApi#update_risk_profile_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
