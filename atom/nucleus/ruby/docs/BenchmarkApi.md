# NucleusApi::BenchmarkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_benchmark_using_post**](BenchmarkApi.md#create_benchmark_using_post) | **POST** /benchmark | Create a benchmark
[**delete_benchmark_using_delete**](BenchmarkApi.md#delete_benchmark_using_delete) | **DELETE** /benchmark/{benchmark_id} | Delete a benchmark
[**get_benchmark_all_using_get**](BenchmarkApi.md#get_benchmark_all_using_get) | **GET** /benchmark | List all benchmarks
[**get_benchmark_asset_size_all_using_get**](BenchmarkApi.md#get_benchmark_asset_size_all_using_get) | **GET** /benchmark/{benchmark_id}/asset_size | List all benchmark asset sizes
[**get_benchmark_using_get**](BenchmarkApi.md#get_benchmark_using_get) | **GET** /benchmark/{benchmark_id} | Retrieve a benchmark
[**update_benchmark_using_put**](BenchmarkApi.md#update_benchmark_using_put) | **PUT** /benchmark/{benchmark_id} | Update a benchmark


# **create_benchmark_using_post**
> Benchmark create_benchmark_using_post(benchmark)

Create a benchmark

Create a new benchmark for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

benchmark = NucleusApi::Benchmark.new # Benchmark | benchmark


begin
  #Create a benchmark
  result = api_instance.create_benchmark_using_post(benchmark)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->create_benchmark_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_benchmark_using_delete**
> delete_benchmark_using_delete(benchmark_id)

Delete a benchmark

Permanently delete a benchmark.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

benchmark_id = 'benchmark_id_example' # String | UUID benchmark_id


begin
  #Delete a benchmark
  api_instance.delete_benchmark_using_delete(benchmark_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->delete_benchmark_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**String**](.md)| UUID benchmark_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_benchmark_all_using_get**
> PageBenchmark get_benchmark_all_using_get(opts)

List all benchmarks

Get details for all benchmarks defined for your firm.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all benchmarks
  result = api_instance.get_benchmark_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->get_benchmark_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageBenchmark**](PageBenchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_benchmark_asset_size_all_using_get**
> Array&lt;DateDoubleVO&gt; get_benchmark_asset_size_all_using_get(benchmark_id, opts)

List all benchmark asset sizes

Get a list of asset sizes by date for a benchmark.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

benchmark_id = 'benchmark_id_example' # String | benchmark_id

opts = { 
  end_date: DateTime.parse('null'), # DateTime | end_date
  sort_type: 'sort_type_example', # String | sort_type
  start_date: DateTime.parse('null') # DateTime | start_date
}

begin
  #List all benchmark asset sizes
  result = api_instance.get_benchmark_asset_size_all_using_get(benchmark_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->get_benchmark_asset_size_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**String**](.md)| benchmark_id | 
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **sort_type** | **String**| sort_type | [optional] 
 **start_date** | **DateTime**| start_date | [optional] [default to null]

### Return type

[**Array&lt;DateDoubleVO&gt;**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_benchmark_using_get**
> Benchmark get_benchmark_using_get(benchmark_id)

Retrieve a benchmark

Retrieve the information for a benchmark.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

benchmark_id = 'benchmark_id_example' # String | UUID benchmark_id


begin
  #Retrieve a benchmark
  result = api_instance.get_benchmark_using_get(benchmark_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->get_benchmark_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**String**](.md)| UUID benchmark_id | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_benchmark_using_put**
> Benchmark update_benchmark_using_put(benchmark, benchmark_id)

Update a benchmark

Updated the information for a benchmark.

### Example
```ruby
# load the gem
require 'nucleus_api'
# Setup authorization
NucleusApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = NucleusApi::BenchmarkApi.new

benchmark = NucleusApi::Benchmark.new # Benchmark | benchmark

benchmark_id = 'benchmark_id_example' # String | UUID benchmark_id


begin
  #Update a benchmark
  result = api_instance.update_benchmark_using_put(benchmark, benchmark_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BenchmarkApi->update_benchmark_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark | 
 **benchmark_id** | [**String**](.md)| UUID benchmark_id | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



