=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.9.2
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module ProtonApi
  class GoalsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Goal Accumulation Allocation
    # Allocate based on an accumulation goal
    # @param goal_accumulation_allocation_request Request payload for Goal Accumulation Allocation
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_accumulation_allocation(goal_accumulation_allocation_request, opts = {})
      data, _status_code, _headers = goal_accumulation_allocation_with_http_info(goal_accumulation_allocation_request, opts)
      data
    end

    # Goal Accumulation Allocation
    # Allocate based on an accumulation goal
    # @param goal_accumulation_allocation_request Request payload for Goal Accumulation Allocation
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_accumulation_allocation_with_http_info(goal_accumulation_allocation_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_accumulation_allocation ...'
      end
      # verify the required parameter 'goal_accumulation_allocation_request' is set
      if @api_client.config.client_side_validation && goal_accumulation_allocation_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_accumulation_allocation_request' when calling GoalsApi.goal_accumulation_allocation"
      end
      # resource path
      local_var_path = '/goal_accumulation/allocation'

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
      post_body = @api_client.object_to_http_body(goal_accumulation_allocation_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_accumulation_allocation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Goal Accumulation Recommendation
    # Generate recommendations to achieve an accumulation goal
    # @param goal_accumulation_recommendation_request Request payload for Goal Accumulation Recommendation
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_accumulation_recommendation(goal_accumulation_recommendation_request, opts = {})
      data, _status_code, _headers = goal_accumulation_recommendation_with_http_info(goal_accumulation_recommendation_request, opts)
      data
    end

    # Goal Accumulation Recommendation
    # Generate recommendations to achieve an accumulation goal
    # @param goal_accumulation_recommendation_request Request payload for Goal Accumulation Recommendation
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_accumulation_recommendation_with_http_info(goal_accumulation_recommendation_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_accumulation_recommendation ...'
      end
      # verify the required parameter 'goal_accumulation_recommendation_request' is set
      if @api_client.config.client_side_validation && goal_accumulation_recommendation_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_accumulation_recommendation_request' when calling GoalsApi.goal_accumulation_recommendation"
      end
      # resource path
      local_var_path = '/goal_accumulation/recommendation'

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
      post_body = @api_client.object_to_http_body(goal_accumulation_recommendation_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_accumulation_recommendation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Goal Accumulation Status
    # Track the status of an accumulation goal
    # @param goal_accumulation_status_request Request payload for Goal Accumulation Status
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_accumulation_status(goal_accumulation_status_request, opts = {})
      data, _status_code, _headers = goal_accumulation_status_with_http_info(goal_accumulation_status_request, opts)
      data
    end

    # Goal Accumulation Status
    # Track the status of an accumulation goal
    # @param goal_accumulation_status_request Request payload for Goal Accumulation Status
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_accumulation_status_with_http_info(goal_accumulation_status_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_accumulation_status ...'
      end
      # verify the required parameter 'goal_accumulation_status_request' is set
      if @api_client.config.client_side_validation && goal_accumulation_status_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_accumulation_status_request' when calling GoalsApi.goal_accumulation_status"
      end
      # resource path
      local_var_path = '/goal_accumulation/status'

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
      post_body = @api_client.object_to_http_body(goal_accumulation_status_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_accumulation_status\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Goal Decumulation Allocation
    # Allocate based on a decumulation goal
    # @param goal_decumulation_allocation_request Request payload for Goal Decumulation Allocation
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_decumulation_allocation(goal_decumulation_allocation_request, opts = {})
      data, _status_code, _headers = goal_decumulation_allocation_with_http_info(goal_decumulation_allocation_request, opts)
      data
    end

    # Goal Decumulation Allocation
    # Allocate based on a decumulation goal
    # @param goal_decumulation_allocation_request Request payload for Goal Decumulation Allocation
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_decumulation_allocation_with_http_info(goal_decumulation_allocation_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_decumulation_allocation ...'
      end
      # verify the required parameter 'goal_decumulation_allocation_request' is set
      if @api_client.config.client_side_validation && goal_decumulation_allocation_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_decumulation_allocation_request' when calling GoalsApi.goal_decumulation_allocation"
      end
      # resource path
      local_var_path = '/goal_decumulation/allocation'

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
      post_body = @api_client.object_to_http_body(goal_decumulation_allocation_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_decumulation_allocation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Goal Decumulation Recommendation
    # Generate recommendations to achieve a decumulation goal
    # @param goal_decumulation_recommendation_request Request payload for Goal Decumulation Recommendation
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_decumulation_recommendation(goal_decumulation_recommendation_request, opts = {})
      data, _status_code, _headers = goal_decumulation_recommendation_with_http_info(goal_decumulation_recommendation_request, opts)
      data
    end

    # Goal Decumulation Recommendation
    # Generate recommendations to achieve a decumulation goal
    # @param goal_decumulation_recommendation_request Request payload for Goal Decumulation Recommendation
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_decumulation_recommendation_with_http_info(goal_decumulation_recommendation_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_decumulation_recommendation ...'
      end
      # verify the required parameter 'goal_decumulation_recommendation_request' is set
      if @api_client.config.client_side_validation && goal_decumulation_recommendation_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_decumulation_recommendation_request' when calling GoalsApi.goal_decumulation_recommendation"
      end
      # resource path
      local_var_path = '/goal_decumulation/recommendation'

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
      post_body = @api_client.object_to_http_body(goal_decumulation_recommendation_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_decumulation_recommendation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Goal Decumulation Status
    # Track the status of a decumulation goal
    # @param goal_decumulation_status_request Request payload for Goal Decumulation Status
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def goal_decumulation_status(goal_decumulation_status_request, opts = {})
      data, _status_code, _headers = goal_decumulation_status_with_http_info(goal_decumulation_status_request, opts)
      data
    end

    # Goal Decumulation Status
    # Track the status of a decumulation goal
    # @param goal_decumulation_status_request Request payload for Goal Decumulation Status
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def goal_decumulation_status_with_http_info(goal_decumulation_status_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: GoalsApi.goal_decumulation_status ...'
      end
      # verify the required parameter 'goal_decumulation_status_request' is set
      if @api_client.config.client_side_validation && goal_decumulation_status_request.nil?
        fail ArgumentError, "Missing the required parameter 'goal_decumulation_status_request' when calling GoalsApi.goal_decumulation_status"
      end
      # resource path
      local_var_path = '/goal_decumulation/status'

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
      post_body = @api_client.object_to_http_body(goal_decumulation_status_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: GoalsApi#goal_decumulation_status\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
