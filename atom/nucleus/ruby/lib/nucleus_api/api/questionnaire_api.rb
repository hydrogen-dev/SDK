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
  class QuestionnaireApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create an answer
    # Create a new answer for question.
    # @param answer answer
    # @param [Hash] opts the optional parameters
    # @return [Answer]
    def create_answer_using_post(answer, opts = {})
      data, _status_code, _headers = create_answer_using_post_with_http_info(answer, opts)
      data
    end

    # Create an answer
    # Create a new answer for question.
    # @param answer answer
    # @param [Hash] opts the optional parameters
    # @return [Array<(Answer, Fixnum, Hash)>] Answer data, response status code and response headers
    def create_answer_using_post_with_http_info(answer, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.create_answer_using_post ...'
      end
      # verify the required parameter 'answer' is set
      if @api_client.config.client_side_validation && answer.nil?
        fail ArgumentError, "Missing the required parameter 'answer' when calling QuestionnaireApi.create_answer_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/answer'

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
      post_body = @api_client.object_to_http_body(answer)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Answer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#create_answer_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a question
    # Create a new question for questionnaire.
    # @param question question
    # @param [Hash] opts the optional parameters
    # @return [Question]
    def create_question_using_post(question, opts = {})
      data, _status_code, _headers = create_question_using_post_with_http_info(question, opts)
      data
    end

    # Create a question
    # Create a new question for questionnaire.
    # @param question question
    # @param [Hash] opts the optional parameters
    # @return [Array<(Question, Fixnum, Hash)>] Question data, response status code and response headers
    def create_question_using_post_with_http_info(question, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.create_question_using_post ...'
      end
      # verify the required parameter 'question' is set
      if @api_client.config.client_side_validation && question.nil?
        fail ArgumentError, "Missing the required parameter 'question' when calling QuestionnaireApi.create_question_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/question'

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
      post_body = @api_client.object_to_http_body(question)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Question')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#create_question_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a questionnaire
    # Create a new questionnaire for your firm.
    # @param questionnaire questionnaire
    # @param [Hash] opts the optional parameters
    # @return [Questionnaire]
    def create_questionnaire_using_post(questionnaire, opts = {})
      data, _status_code, _headers = create_questionnaire_using_post_with_http_info(questionnaire, opts)
      data
    end

    # Create a questionnaire
    # Create a new questionnaire for your firm.
    # @param questionnaire questionnaire
    # @param [Hash] opts the optional parameters
    # @return [Array<(Questionnaire, Fixnum, Hash)>] Questionnaire data, response status code and response headers
    def create_questionnaire_using_post_with_http_info(questionnaire, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.create_questionnaire_using_post ...'
      end
      # verify the required parameter 'questionnaire' is set
      if @api_client.config.client_side_validation && questionnaire.nil?
        fail ArgumentError, "Missing the required parameter 'questionnaire' when calling QuestionnaireApi.create_questionnaire_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/questionnaire'

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
      post_body = @api_client.object_to_http_body(questionnaire)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Questionnaire')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#create_questionnaire_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete an answer
    # Delete an answer for the question
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_answer_using_delete(answer_id, opts = {})
      delete_answer_using_delete_with_http_info(answer_id, opts)
      nil
    end

    # Delete an answer
    # Delete an answer for the question
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_answer_using_delete_with_http_info(answer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.delete_answer_using_delete ...'
      end
      # verify the required parameter 'answer_id' is set
      if @api_client.config.client_side_validation && answer_id.nil?
        fail ArgumentError, "Missing the required parameter 'answer_id' when calling QuestionnaireApi.delete_answer_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/answer/{answer_id}'.sub('{' + 'answer_id' + '}', answer_id.to_s)

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
        @api_client.config.logger.debug "API called: QuestionnaireApi#delete_answer_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a question
    # Delete an answer for the question
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_question_using_delete(question_id, opts = {})
      delete_question_using_delete_with_http_info(question_id, opts)
      nil
    end

    # Delete a question
    # Delete an answer for the question
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_question_using_delete_with_http_info(question_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.delete_question_using_delete ...'
      end
      # verify the required parameter 'question_id' is set
      if @api_client.config.client_side_validation && question_id.nil?
        fail ArgumentError, "Missing the required parameter 'question_id' when calling QuestionnaireApi.delete_question_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/question/{question_id}'.sub('{' + 'question_id' + '}', question_id.to_s)

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
        @api_client.config.logger.debug "API called: QuestionnaireApi#delete_question_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a questionnaire
    # Permanently delete a questionnaire for your firm.
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_questionnaire_using_delete(questionnaire_id, opts = {})
      delete_questionnaire_using_delete_with_http_info(questionnaire_id, opts)
      nil
    end

    # Delete a questionnaire
    # Permanently delete a questionnaire for your firm.
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_questionnaire_using_delete_with_http_info(questionnaire_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.delete_questionnaire_using_delete ...'
      end
      # verify the required parameter 'questionnaire_id' is set
      if @api_client.config.client_side_validation && questionnaire_id.nil?
        fail ArgumentError, "Missing the required parameter 'questionnaire_id' when calling QuestionnaireApi.delete_questionnaire_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/questionnaire/{questionnaire_id}'.sub('{' + 'questionnaire_id' + '}', questionnaire_id.to_s)

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
        @api_client.config.logger.debug "API called: QuestionnaireApi#delete_questionnaire_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Answers
    # Get information for all Answers
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to label)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageAnswer]
    def get_answer_all_using_get(opts = {})
      data, _status_code, _headers = get_answer_all_using_get_with_http_info(opts)
      data
    end

    # List all Answers
    # Get information for all Answers
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageAnswer, Fixnum, Hash)>] PageAnswer data, response status code and response headers
    def get_answer_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_answer_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/answer'

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
        :return_type => 'PageAnswer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_answer_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve an answer
    # Retrieve the information for an answer for question
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [Answer]
    def get_answer_using_get(answer_id, opts = {})
      data, _status_code, _headers = get_answer_using_get_with_http_info(answer_id, opts)
      data
    end

    # Retrieve an answer
    # Retrieve the information for an answer for question
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Answer, Fixnum, Hash)>] Answer data, response status code and response headers
    def get_answer_using_get_with_http_info(answer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_answer_using_get ...'
      end
      # verify the required parameter 'answer_id' is set
      if @api_client.config.client_side_validation && answer_id.nil?
        fail ArgumentError, "Missing the required parameter 'answer_id' when calling QuestionnaireApi.get_answer_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/answer/{answer_id}'.sub('{' + 'answer_id' + '}', answer_id.to_s)

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
        :return_type => 'Answer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_answer_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Questions
    # Get information for all Questions
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to order_index)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageQuestion]
    def get_question_all_using_get(opts = {})
      data, _status_code, _headers = get_question_all_using_get_with_http_info(opts)
      data
    end

    # List all Questions
    # Get information for all Questions
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageQuestion, Fixnum, Hash)>] PageQuestion data, response status code and response headers
    def get_question_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_question_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/question'

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
        :return_type => 'PageQuestion')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_question_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a question
    # Retrieve the information for a question for questionnaire
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [Question]
    def get_question_using_get(question_id, opts = {})
      data, _status_code, _headers = get_question_using_get_with_http_info(question_id, opts)
      data
    end

    # Retrieve a question
    # Retrieve the information for a question for questionnaire
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Question, Fixnum, Hash)>] Question data, response status code and response headers
    def get_question_using_get_with_http_info(question_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_question_using_get ...'
      end
      # verify the required parameter 'question_id' is set
      if @api_client.config.client_side_validation && question_id.nil?
        fail ArgumentError, "Missing the required parameter 'question_id' when calling QuestionnaireApi.get_question_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/question/{question_id}'.sub('{' + 'question_id' + '}', question_id.to_s)

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
        :return_type => 'Question')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_question_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all questionnaires
    # Get the information for all questionnaires defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageQuestionnaire]
    def get_questionnaire_all_using_get(opts = {})
      data, _status_code, _headers = get_questionnaire_all_using_get_with_http_info(opts)
      data
    end

    # List all questionnaires
    # Get the information for all questionnaires defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageQuestionnaire, Fixnum, Hash)>] PageQuestionnaire data, response status code and response headers
    def get_questionnaire_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_questionnaire_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/questionnaire'

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
        :return_type => 'PageQuestionnaire')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_questionnaire_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a questionnaire
    # Retrieve the information for a questionnaire for your firm.
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [Questionnaire]
    def get_questionnaire_using_get(questionnaire_id, opts = {})
      data, _status_code, _headers = get_questionnaire_using_get_with_http_info(questionnaire_id, opts)
      data
    end

    # Retrieve a questionnaire
    # Retrieve the information for a questionnaire for your firm.
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Questionnaire, Fixnum, Hash)>] Questionnaire data, response status code and response headers
    def get_questionnaire_using_get_with_http_info(questionnaire_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.get_questionnaire_using_get ...'
      end
      # verify the required parameter 'questionnaire_id' is set
      if @api_client.config.client_side_validation && questionnaire_id.nil?
        fail ArgumentError, "Missing the required parameter 'questionnaire_id' when calling QuestionnaireApi.get_questionnaire_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/questionnaire/{questionnaire_id}'.sub('{' + 'questionnaire_id' + '}', questionnaire_id.to_s)

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
        :return_type => 'Questionnaire')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#get_questionnaire_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update an answer
    # Update a answer for question.
    # @param answer answer
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [Answer]
    def update_answer_using_put(answer, answer_id, opts = {})
      data, _status_code, _headers = update_answer_using_put_with_http_info(answer, answer_id, opts)
      data
    end

    # Update an answer
    # Update a answer for question.
    # @param answer answer
    # @param answer_id UUID answer_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Answer, Fixnum, Hash)>] Answer data, response status code and response headers
    def update_answer_using_put_with_http_info(answer, answer_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.update_answer_using_put ...'
      end
      # verify the required parameter 'answer' is set
      if @api_client.config.client_side_validation && answer.nil?
        fail ArgumentError, "Missing the required parameter 'answer' when calling QuestionnaireApi.update_answer_using_put"
      end
      # verify the required parameter 'answer_id' is set
      if @api_client.config.client_side_validation && answer_id.nil?
        fail ArgumentError, "Missing the required parameter 'answer_id' when calling QuestionnaireApi.update_answer_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/answer/{answer_id}'.sub('{' + 'answer_id' + '}', answer_id.to_s)

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
      post_body = @api_client.object_to_http_body(answer)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Answer')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#update_answer_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a question.
    # Update a question for questionnaire.
    # @param question question
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [Question]
    def update_question_using_put(question, question_id, opts = {})
      data, _status_code, _headers = update_question_using_put_with_http_info(question, question_id, opts)
      data
    end

    # Update a question.
    # Update a question for questionnaire.
    # @param question question
    # @param question_id UUID question_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Question, Fixnum, Hash)>] Question data, response status code and response headers
    def update_question_using_put_with_http_info(question, question_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.update_question_using_put ...'
      end
      # verify the required parameter 'question' is set
      if @api_client.config.client_side_validation && question.nil?
        fail ArgumentError, "Missing the required parameter 'question' when calling QuestionnaireApi.update_question_using_put"
      end
      # verify the required parameter 'question_id' is set
      if @api_client.config.client_side_validation && question_id.nil?
        fail ArgumentError, "Missing the required parameter 'question_id' when calling QuestionnaireApi.update_question_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/question/{question_id}'.sub('{' + 'question_id' + '}', question_id.to_s)

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
      post_body = @api_client.object_to_http_body(question)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Question')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#update_question_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a questionnaire
    # Update a questionnaire for your firm.
    # @param questionnaire questionnaire
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [Questionnaire]
    def update_questionnaire_using_put(questionnaire, questionnaire_id, opts = {})
      data, _status_code, _headers = update_questionnaire_using_put_with_http_info(questionnaire, questionnaire_id, opts)
      data
    end

    # Update a questionnaire
    # Update a questionnaire for your firm.
    # @param questionnaire questionnaire
    # @param questionnaire_id UUID questionnaire_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Questionnaire, Fixnum, Hash)>] Questionnaire data, response status code and response headers
    def update_questionnaire_using_put_with_http_info(questionnaire, questionnaire_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: QuestionnaireApi.update_questionnaire_using_put ...'
      end
      # verify the required parameter 'questionnaire' is set
      if @api_client.config.client_side_validation && questionnaire.nil?
        fail ArgumentError, "Missing the required parameter 'questionnaire' when calling QuestionnaireApi.update_questionnaire_using_put"
      end
      # verify the required parameter 'questionnaire_id' is set
      if @api_client.config.client_side_validation && questionnaire_id.nil?
        fail ArgumentError, "Missing the required parameter 'questionnaire_id' when calling QuestionnaireApi.update_questionnaire_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/questionnaire/{questionnaire_id}'.sub('{' + 'questionnaire_id' + '}', questionnaire_id.to_s)

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
      post_body = @api_client.object_to_http_body(questionnaire)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Questionnaire')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: QuestionnaireApi#update_questionnaire_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
