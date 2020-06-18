# NucleusApi::ApplicationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_application_using_post**](ApplicationApi.md#create_application_using_post) | **POST** /application | Create an application
[**delete_application_using_delete**](ApplicationApi.md#delete_application_using_delete) | **DELETE** /application/{application_id} | Delete an Application
[**get_application_all_using_get**](ApplicationApi.md#get_application_all_using_get) | **GET** /application | List all Application
[**get_application_using_get**](ApplicationApi.md#get_application_using_get) | **GET** /application/{application_id} | Retrieve an Application
[**update_application_using_put**](ApplicationApi.md#update_application_using_put) | **PUT** /application/{application_id} | Update an Application


# **create_application_using_post**
> Application create_application_using_post(application)

Create an application

Create an application

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


api_instance = NucleusApi::ApplicationApi.new

application = NucleusApi::Application.new # Application | application


begin
  #Create an application
  result = api_instance.create_application_using_post(application)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ApplicationApi->create_application_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_application_using_delete**
> delete_application_using_delete(application_id)

Delete an Application

Permanently delete an Application.

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


api_instance = NucleusApi::ApplicationApi.new

application_id = 'application_id_example' # String | UUID application_id


begin
  #Delete an Application
  api_instance.delete_application_using_delete(application_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling ApplicationApi->delete_application_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | [**String**](.md)| UUID application_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_application_all_using_get**
> PageApplication get_application_all_using_get(opts)

List all Application

Get details for all Application.

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


api_instance = NucleusApi::ApplicationApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Application
  result = api_instance.get_application_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ApplicationApi->get_application_all_using_get: #{e}"
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

[**PageApplication**](PageApplication.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_application_using_get**
> Application get_application_using_get(application_id)

Retrieve an Application

Retrieve the information for an Application.

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


api_instance = NucleusApi::ApplicationApi.new

application_id = 'application_id_example' # String | UUID application_id


begin
  #Retrieve an Application
  result = api_instance.get_application_using_get(application_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ApplicationApi->get_application_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | [**String**](.md)| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_application_using_put**
> Application update_application_using_put(application, application_id)

Update an Application

Update the information for an Application

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


api_instance = NucleusApi::ApplicationApi.new

application = NucleusApi::Application.new # Application | application

application_id = 'application_id_example' # String | UUID application_id


begin
  #Update an Application
  result = api_instance.update_application_using_put(application, application_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ApplicationApi->update_application_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application | 
 **application_id** | [**String**](.md)| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



