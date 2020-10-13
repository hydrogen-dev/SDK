# IntegrationApi::KMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_kms_using_post**](KMSApi.md#create_kms_using_post) | **POST** /kms | Create an secret key
[**delete_kms_using_delete**](KMSApi.md#delete_kms_using_delete) | **DELETE** /kms/{kms_id} | Delete an secret key value
[**get_kms_all_using_get**](KMSApi.md#get_kms_all_using_get) | **GET** /kms | List all KMS Clients
[**get_kms_using_get**](KMSApi.md#get_kms_using_get) | **GET** /kms/{kms_id} | Retrieve an secret key value
[**update_kms_using_put**](KMSApi.md#update_kms_using_put) | **PUT** /kms/{kms_id} | Update an Key Value


# **create_kms_using_post**
> KmsConfig create_kms_using_post(kms_config)

Create an secret key

Create an secret key.

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


api_instance = IntegrationApi::KMSApi.new

kms_config = IntegrationApi::KmsConfig.new # KmsConfig | kmsConfig


begin
  #Create an secret key
  result = api_instance.create_kms_using_post(kms_config)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KMSApi->create_kms_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_kms_using_delete**
> delete_kms_using_delete(kms_id)

Delete an secret key value

Permanently delete an secret key value under a tenant.

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


api_instance = IntegrationApi::KMSApi.new

kms_id = 'kms_id_example' # String | KMS Id


begin
  #Delete an secret key value
  api_instance.delete_kms_using_delete(kms_id)
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KMSApi->delete_kms_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**String**](.md)| KMS Id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_kms_all_using_get**
> PageKmsConfig get_kms_all_using_get(opts)

List all KMS Clients

Get details for all clients registered with your firm.

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


api_instance = IntegrationApi::KMSApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all KMS Clients
  result = api_instance.get_kms_all_using_get(opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KMSApi->get_kms_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageKmsConfig**](PageKmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_kms_using_get**
> KmsConfig get_kms_using_get(kms_id)

Retrieve an secret key value

Retrieve the information for a specific value associated with a Secret key.

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


api_instance = IntegrationApi::KMSApi.new

kms_id = 'kms_id_example' # String | KMS Id


begin
  #Retrieve an secret key value
  result = api_instance.get_kms_using_get(kms_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KMSApi->get_kms_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**String**](.md)| KMS Id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_kms_using_put**
> KmsConfig update_kms_using_put(kms_config, kms_id)

Update an Key Value

Update the information for an key value.

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


api_instance = IntegrationApi::KMSApi.new

kms_config = IntegrationApi::KmsConfig.new # KmsConfig | kmsConfig

kms_id = 'kms_id_example' # String | kms_id


begin
  #Update an Key Value
  result = api_instance.update_kms_using_put(kms_config, kms_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KMSApi->update_kms_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 
 **kms_id** | [**String**](.md)| kms_id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



