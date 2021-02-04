# IntegrationApi::AsyncApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_async_data**](AsyncApi.md#get_async_data) | **GET** /async/{integration_type}/{service} | Create async transaction for GET endpoints for bulk data
[**get_async_data1**](AsyncApi.md#get_async_data1) | **GET** /async/{integration_type}/{service}/{id} | Create async transaction for GET endpoints for bulk data
[**get_async_data2**](AsyncApi.md#get_async_data2) | **POST** /async/{integration_type}/{service} | Create async transaction for POST endpoints for bulk data
[**get_async_status**](AsyncApi.md#get_async_status) | **GET** /async/status/{id} | Get Status of async transaction created through GET/POST endpoints


# **get_async_data**
> AsyncTransaction get_async_data(id, integration_type, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = IntegrationApi::AsyncApi.new

id = 'id_example' # String | UUID id

integration_type = 'integration_type_example' # String | String integration_type

service = 'service_example' # String | String service


begin
  #Create async transaction for GET endpoints for bulk data
  result = api_instance.get_async_data(id, integration_type, service)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AsyncApi->get_async_data: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID id | 
 **integration_type** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_async_data1**
> AsyncTransaction get_async_data1(id, integration_type, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = IntegrationApi::AsyncApi.new

id = 'id_example' # String | UUID id

integration_type = 'integration_type_example' # String | String integration_type

service = 'service_example' # String | String service


begin
  #Create async transaction for GET endpoints for bulk data
  result = api_instance.get_async_data1(id, integration_type, service)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AsyncApi->get_async_data1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID id | 
 **integration_type** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_async_data2**
> AsyncTransaction get_async_data2(data, integration_type, service)

Create async transaction for POST endpoints for bulk data

Create async transaction for POST endpoints for bulk data

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = IntegrationApi::AsyncApi.new

data = IntegrationApi::JsonNode.new # JsonNode | data

integration_type = 'integration_type_example' # String | String integration_type

service = 'service_example' # String | String service


begin
  #Create async transaction for POST endpoints for bulk data
  result = api_instance.get_async_data2(data, integration_type, service)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AsyncApi->get_async_data2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **integration_type** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_async_status**
> AsyncTransactionVO get_async_status(id)

Get Status of async transaction created through GET/POST endpoints

Get Status of async transaction created through GET/POST endpoints

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = IntegrationApi::AsyncApi.new

id = 'id_example' # String | UUID Async Transaction Id


begin
  #Get Status of async transaction created through GET/POST endpoints
  result = api_instance.get_async_status(id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling AsyncApi->get_async_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID Async Transaction Id | 

### Return type

[**AsyncTransactionVO**](AsyncTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



