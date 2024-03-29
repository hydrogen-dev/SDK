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
  class PersonalFinancialManagementApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Budget Calculator
    # Analyze spending against a defined budget
    # @param budget_calculator_request Request payload for Budget Calculator
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def budget_calculator(budget_calculator_request, opts = {})
      data, _status_code, _headers = budget_calculator_with_http_info(budget_calculator_request, opts)
      data
    end

    # Budget Calculator
    # Analyze spending against a defined budget
    # @param budget_calculator_request Request payload for Budget Calculator
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def budget_calculator_with_http_info(budget_calculator_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.budget_calculator ...'
      end
      # verify the required parameter 'budget_calculator_request' is set
      if @api_client.config.client_side_validation && budget_calculator_request.nil?
        fail ArgumentError, "Missing the required parameter 'budget_calculator_request' when calling PersonalFinancialManagementApi.budget_calculator"
      end
      # resource path
      local_var_path = '/budget_calculator'

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
      post_body = @api_client.object_to_http_body(budget_calculator_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#budget_calculator\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Cash Flow Analysis
    # Analyze income, expenses, and net income
    # @param cash_flow_analysis_request Request payload for Cash Flow Analysis
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def cash_flow_analysis(cash_flow_analysis_request, opts = {})
      data, _status_code, _headers = cash_flow_analysis_with_http_info(cash_flow_analysis_request, opts)
      data
    end

    # Cash Flow Analysis
    # Analyze income, expenses, and net income
    # @param cash_flow_analysis_request Request payload for Cash Flow Analysis
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def cash_flow_analysis_with_http_info(cash_flow_analysis_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.cash_flow_analysis ...'
      end
      # verify the required parameter 'cash_flow_analysis_request' is set
      if @api_client.config.client_side_validation && cash_flow_analysis_request.nil?
        fail ArgumentError, "Missing the required parameter 'cash_flow_analysis_request' when calling PersonalFinancialManagementApi.cash_flow_analysis"
      end
      # resource path
      local_var_path = '/cash_flow_analysis'

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
      post_body = @api_client.object_to_http_body(cash_flow_analysis_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#cash_flow_analysis\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # RFee Analysis
    # Analyze fee data
    # @param fee_analysis_request Request payload for Fee Analysis
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def fee_analysis(fee_analysis_request, opts = {})
      data, _status_code, _headers = fee_analysis_with_http_info(fee_analysis_request, opts)
      data
    end

    # RFee Analysis
    # Analyze fee data
    # @param fee_analysis_request Request payload for Fee Analysis
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def fee_analysis_with_http_info(fee_analysis_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.fee_analysis ...'
      end
      # verify the required parameter 'fee_analysis_request' is set
      if @api_client.config.client_side_validation && fee_analysis_request.nil?
        fail ArgumentError, "Missing the required parameter 'fee_analysis_request' when calling PersonalFinancialManagementApi.fee_analysis"
      end
      # resource path
      local_var_path = '/fee_analysis'

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
      post_body = @api_client.object_to_http_body(fee_analysis_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#fee_analysis\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Financial Picture
    # Assess assets, liabilities, and net worth
    # @param financial_picture_request Request payload for Financial Picture
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def financial_picture(financial_picture_request, opts = {})
      data, _status_code, _headers = financial_picture_with_http_info(financial_picture_request, opts)
      data
    end

    # Financial Picture
    # Assess assets, liabilities, and net worth
    # @param financial_picture_request Request payload for Financial Picture
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def financial_picture_with_http_info(financial_picture_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.financial_picture ...'
      end
      # verify the required parameter 'financial_picture_request' is set
      if @api_client.config.client_side_validation && financial_picture_request.nil?
        fail ArgumentError, "Missing the required parameter 'financial_picture_request' when calling PersonalFinancialManagementApi.financial_picture"
      end
      # resource path
      local_var_path = '/financial_picture'

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
      post_body = @api_client.object_to_http_body(financial_picture_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#financial_picture\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Recurring Transaction Analysis
    # Analyze recurring transactions
    # @param recurring_transaction_analysis_request Request payload for Recurring Transaction Analysis
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def recurring_transaction_analysis(recurring_transaction_analysis_request, opts = {})
      data, _status_code, _headers = recurring_transaction_analysis_with_http_info(recurring_transaction_analysis_request, opts)
      data
    end

    # Recurring Transaction Analysis
    # Analyze recurring transactions
    # @param recurring_transaction_analysis_request Request payload for Recurring Transaction Analysis
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def recurring_transaction_analysis_with_http_info(recurring_transaction_analysis_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.recurring_transaction_analysis ...'
      end
      # verify the required parameter 'recurring_transaction_analysis_request' is set
      if @api_client.config.client_side_validation && recurring_transaction_analysis_request.nil?
        fail ArgumentError, "Missing the required parameter 'recurring_transaction_analysis_request' when calling PersonalFinancialManagementApi.recurring_transaction_analysis"
      end
      # resource path
      local_var_path = '/recurring_transaction_analysis'

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
      post_body = @api_client.object_to_http_body(recurring_transaction_analysis_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#recurring_transaction_analysis\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Spending Analysis
    # Analyze spending transaction activity
    # @param spending_analysis_request Request payload for Spending Analysis
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def spending_analysis(spending_analysis_request, opts = {})
      data, _status_code, _headers = spending_analysis_with_http_info(spending_analysis_request, opts)
      data
    end

    # Spending Analysis
    # Analyze spending transaction activity
    # @param spending_analysis_request Request payload for Spending Analysis
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def spending_analysis_with_http_info(spending_analysis_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PersonalFinancialManagementApi.spending_analysis ...'
      end
      # verify the required parameter 'spending_analysis_request' is set
      if @api_client.config.client_side_validation && spending_analysis_request.nil?
        fail ArgumentError, "Missing the required parameter 'spending_analysis_request' when calling PersonalFinancialManagementApi.spending_analysis"
      end
      # resource path
      local_var_path = '/spending_analysis'

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
      post_body = @api_client.object_to_http_body(spending_analysis_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PersonalFinancialManagementApi#spending_analysis\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
