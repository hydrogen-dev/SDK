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
  class DocumentApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a Document
    # Create a new Document for your firm.
    # @param document_request documentRequest
    # @param [Hash] opts the optional parameters
    # @return [Document]
    def create_document_using_post(document_request, opts = {})
      data, _status_code, _headers = create_document_using_post_with_http_info(document_request, opts)
      data
    end

    # Create a Document
    # Create a new Document for your firm.
    # @param document_request documentRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(Document, Fixnum, Hash)>] Document data, response status code and response headers
    def create_document_using_post_with_http_info(document_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DocumentApi.create_document_using_post ...'
      end
      # verify the required parameter 'document_request' is set
      if @api_client.config.client_side_validation && document_request.nil?
        fail ArgumentError, "Missing the required parameter 'document_request' when calling DocumentApi.create_document_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/document'

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
      post_body = @api_client.object_to_http_body(document_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Document')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DocumentApi#create_document_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a tenant document by Id
    # Permanently delete a tenant document by Id
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_document_using_delete(document_id, opts = {})
      delete_document_using_delete_with_http_info(document_id, opts)
      nil
    end

    # Delete a tenant document by Id
    # Permanently delete a tenant document by Id
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_document_using_delete_with_http_info(document_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DocumentApi.delete_document_using_delete ...'
      end
      # verify the required parameter 'document_id' is set
      if @api_client.config.client_side_validation && document_id.nil?
        fail ArgumentError, "Missing the required parameter 'document_id' when calling DocumentApi.delete_document_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/document/{document_id}'.sub('{' + 'document_id' + '}', document_id.to_s)

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
        @api_client.config.logger.debug "API called: DocumentApi#delete_document_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Documents
    # Get the information for all Documents 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageDocument]
    def get_document_all_using_get(opts = {})
      data, _status_code, _headers = get_document_all_using_get_with_http_info(opts)
      data
    end

    # List all Documents
    # Get the information for all Documents 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageDocument, Fixnum, Hash)>] PageDocument data, response status code and response headers
    def get_document_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DocumentApi.get_document_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/document'

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
        :return_type => 'PageDocument')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DocumentApi#get_document_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a Tenant Document by Document Id
    # Retrieve the information for a Tenant Document by Document Id
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [Document]
    def get_document_using_get(document_id, opts = {})
      data, _status_code, _headers = get_document_using_get_with_http_info(document_id, opts)
      data
    end

    # Retrieve a Tenant Document by Document Id
    # Retrieve the information for a Tenant Document by Document Id
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Document, Fixnum, Hash)>] Document data, response status code and response headers
    def get_document_using_get_with_http_info(document_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DocumentApi.get_document_using_get ...'
      end
      # verify the required parameter 'document_id' is set
      if @api_client.config.client_side_validation && document_id.nil?
        fail ArgumentError, "Missing the required parameter 'document_id' when calling DocumentApi.get_document_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/document/{document_id}'.sub('{' + 'document_id' + '}', document_id.to_s)

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
        :return_type => 'Document')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DocumentApi#get_document_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a Tenant Document
    # Updated the information for a Tenant Documents
    # @param document document
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [Document]
    def update_document_using_put(document, document_id, opts = {})
      data, _status_code, _headers = update_document_using_put_with_http_info(document, document_id, opts)
      data
    end

    # Update a Tenant Document
    # Updated the information for a Tenant Documents
    # @param document document
    # @param document_id UUID document_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Document, Fixnum, Hash)>] Document data, response status code and response headers
    def update_document_using_put_with_http_info(document, document_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: DocumentApi.update_document_using_put ...'
      end
      # verify the required parameter 'document' is set
      if @api_client.config.client_side_validation && document.nil?
        fail ArgumentError, "Missing the required parameter 'document' when calling DocumentApi.update_document_using_put"
      end
      # verify the required parameter 'document_id' is set
      if @api_client.config.client_side_validation && document_id.nil?
        fail ArgumentError, "Missing the required parameter 'document_id' when calling DocumentApi.update_document_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/document/{document_id}'.sub('{' + 'document_id' + '}', document_id.to_s)

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
      post_body = @api_client.object_to_http_body(document)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Document')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: DocumentApi#update_document_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
