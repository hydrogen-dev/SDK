# atom_api.BenchmarkApi

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
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
benchmark = atom_api.Benchmark() # Benchmark | benchmark

try:
    # Create a benchmark
    api_response = api_instance.create_benchmark_using_post(benchmark)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BenchmarkApi->create_benchmark_using_post: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_benchmark_using_delete**
> delete_benchmark_using_delete(benchmark_id)

Delete a benchmark

Permanently delete a benchmark.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
benchmark_id = 'benchmark_id_example' # str | UUID benchmark_id

try:
    # Delete a benchmark
    api_instance.delete_benchmark_using_delete(benchmark_id)
except ApiException as e:
    print("Exception when calling BenchmarkApi->delete_benchmark_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**str**](.md)| UUID benchmark_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_all_using_get**
> PageBenchmark get_benchmark_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all benchmarks

Get details for all benchmarks defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all benchmarks
    api_response = api_instance.get_benchmark_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BenchmarkApi->get_benchmark_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageBenchmark**](PageBenchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_asset_size_all_using_get**
> list[DateDoubleVO] get_benchmark_asset_size_all_using_get(benchmark_id, end_date=end_date, sort_type=sort_type, start_date=start_date)

List all benchmark asset sizes

Get a list of asset sizes by date for a benchmark.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
benchmark_id = 'benchmark_id_example' # str | benchmark_id
end_date = 'null' # datetime | end_date (optional) (default to null)
sort_type = 'sort_type_example' # str | sort_type (optional)
start_date = 'null' # datetime | start_date (optional) (default to null)

try:
    # List all benchmark asset sizes
    api_response = api_instance.get_benchmark_asset_size_all_using_get(benchmark_id, end_date=end_date, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BenchmarkApi->get_benchmark_asset_size_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**str**](.md)| benchmark_id | 
 **end_date** | **datetime**| end_date | [optional] [default to null]
 **sort_type** | **str**| sort_type | [optional] 
 **start_date** | **datetime**| start_date | [optional] [default to null]

### Return type

[**list[DateDoubleVO]**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_using_get**
> Benchmark get_benchmark_using_get(benchmark_id)

Retrieve a benchmark

Retrieve the information for a benchmark.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
benchmark_id = 'benchmark_id_example' # str | UUID benchmark_id

try:
    # Retrieve a benchmark
    api_response = api_instance.get_benchmark_using_get(benchmark_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BenchmarkApi->get_benchmark_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_id** | [**str**](.md)| UUID benchmark_id | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_benchmark_using_put**
> Benchmark update_benchmark_using_put(benchmark, benchmark_id)

Update a benchmark

Updated the information for a benchmark.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BenchmarkApi(atom_api.ApiClient(configuration))
benchmark = atom_api.Benchmark() # Benchmark | benchmark
benchmark_id = 'benchmark_id_example' # str | UUID benchmark_id

try:
    # Update a benchmark
    api_response = api_instance.update_benchmark_using_put(benchmark, benchmark_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BenchmarkApi->update_benchmark_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark** | [**Benchmark**](Benchmark.md)| benchmark | 
 **benchmark_id** | [**str**](.md)| UUID benchmark_id | 

### Return type

[**Benchmark**](Benchmark.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

