=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.3
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.20

=end

require 'uri'

module NucleusApi
  class BenchmarkApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a benchmark
    # Create a new benchmark for your firm.
    # @param benchmark benchmark
    # @param [Hash] opts the optional parameters
    # @return [Benchmark]
    def create_benchmark_using_post(benchmark, opts = {})
      data, _status_code, _headers = create_benchmark_using_post_with_http_info(benchmark, opts)
      data
    end

    # Create a benchmark
    # Create a new benchmark for your firm.
    # @param benchmark benchmark
    # @param [Hash] opts the optional parameters
    # @return [Array<(Benchmark, Fixnum, Hash)>] Benchmark data, response status code and response headers
    def create_benchmark_using_post_with_http_info(benchmark, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.create_benchmark_using_post ...'
      end
      # verify the required parameter 'benchmark' is set
      if @api_client.config.client_side_validation && benchmark.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark' when calling BenchmarkApi.create_benchmark_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark'

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
      post_body = @api_client.object_to_http_body(benchmark)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Benchmark')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BenchmarkApi#create_benchmark_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a benchmark
    # Permanently delete a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_benchmark_using_delete(benchmark_id, opts = {})
      delete_benchmark_using_delete_with_http_info(benchmark_id, opts)
      nil
    end

    # Delete a benchmark
    # Permanently delete a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_benchmark_using_delete_with_http_info(benchmark_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.delete_benchmark_using_delete ...'
      end
      # verify the required parameter 'benchmark_id' is set
      if @api_client.config.client_side_validation && benchmark_id.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark_id' when calling BenchmarkApi.delete_benchmark_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark/{benchmark_id}'.sub('{' + 'benchmark_id' + '}', benchmark_id.to_s)

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
        @api_client.config.logger.debug "API called: BenchmarkApi#delete_benchmark_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all benchmarks
    # Get details for all benchmarks defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageBenchmark]
    def get_benchmark_all_using_get(opts = {})
      data, _status_code, _headers = get_benchmark_all_using_get_with_http_info(opts)
      data
    end

    # List all benchmarks
    # Get details for all benchmarks defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageBenchmark, Fixnum, Hash)>] PageBenchmark data, response status code and response headers
    def get_benchmark_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.get_benchmark_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark'

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
        :return_type => 'PageBenchmark')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BenchmarkApi#get_benchmark_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all benchmark asset sizes
    # Get a list of asset sizes by date for a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @option opts [Date] :end_date end date
    # @option opts [String] :sort_type sort_type
    # @option opts [Date] :start_date start date
    # @return [Array<DateDoubleVO>]
    def get_benchmark_asset_size_all_using_get(benchmark_id, opts = {})
      data, _status_code, _headers = get_benchmark_asset_size_all_using_get_with_http_info(benchmark_id, opts)
      data
    end

    # List all benchmark asset sizes
    # Get a list of asset sizes by date for a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @option opts [Date] :end_date end date
    # @option opts [String] :sort_type sort_type
    # @option opts [Date] :start_date start date
    # @return [Array<(Array<DateDoubleVO>, Fixnum, Hash)>] Array<DateDoubleVO> data, response status code and response headers
    def get_benchmark_asset_size_all_using_get_with_http_info(benchmark_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.get_benchmark_asset_size_all_using_get ...'
      end
      # verify the required parameter 'benchmark_id' is set
      if @api_client.config.client_side_validation && benchmark_id.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark_id' when calling BenchmarkApi.get_benchmark_asset_size_all_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark/{benchmark_id}/asset_size'.sub('{' + 'benchmark_id' + '}', benchmark_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'end_date'] = opts[:'end_date'] if !opts[:'end_date'].nil?
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
        :return_type => 'Array<DateDoubleVO>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BenchmarkApi#get_benchmark_asset_size_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a benchmark
    # Retrieve the information for a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [Benchmark]
    def get_benchmark_using_get(benchmark_id, opts = {})
      data, _status_code, _headers = get_benchmark_using_get_with_http_info(benchmark_id, opts)
      data
    end

    # Retrieve a benchmark
    # Retrieve the information for a benchmark.
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Benchmark, Fixnum, Hash)>] Benchmark data, response status code and response headers
    def get_benchmark_using_get_with_http_info(benchmark_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.get_benchmark_using_get ...'
      end
      # verify the required parameter 'benchmark_id' is set
      if @api_client.config.client_side_validation && benchmark_id.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark_id' when calling BenchmarkApi.get_benchmark_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark/{benchmark_id}'.sub('{' + 'benchmark_id' + '}', benchmark_id.to_s)

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
        :return_type => 'Benchmark')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BenchmarkApi#get_benchmark_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a benchmark
    # Updated the information for a benchmark.
    # @param benchmark benchmark
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [Benchmark]
    def update_benchmark_using_put(benchmark, benchmark_id, opts = {})
      data, _status_code, _headers = update_benchmark_using_put_with_http_info(benchmark, benchmark_id, opts)
      data
    end

    # Update a benchmark
    # Updated the information for a benchmark.
    # @param benchmark benchmark
    # @param benchmark_id UUID benchmark_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Benchmark, Fixnum, Hash)>] Benchmark data, response status code and response headers
    def update_benchmark_using_put_with_http_info(benchmark, benchmark_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BenchmarkApi.update_benchmark_using_put ...'
      end
      # verify the required parameter 'benchmark' is set
      if @api_client.config.client_side_validation && benchmark.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark' when calling BenchmarkApi.update_benchmark_using_put"
      end
      # verify the required parameter 'benchmark_id' is set
      if @api_client.config.client_side_validation && benchmark_id.nil?
        fail ArgumentError, "Missing the required parameter 'benchmark_id' when calling BenchmarkApi.update_benchmark_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/benchmark/{benchmark_id}'.sub('{' + 'benchmark_id' + '}', benchmark_id.to_s)

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
      post_body = @api_client.object_to_http_body(benchmark)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Benchmark')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BenchmarkApi#update_benchmark_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
