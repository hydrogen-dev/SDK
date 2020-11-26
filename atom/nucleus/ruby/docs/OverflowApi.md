# NucleusApi::OverflowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_overflow_settings_using_post**](OverflowApi.md#create_overflow_settings_using_post) | **POST** /overflow_setting | Create a Overflow Settings request
[**create_overflow_using_post**](OverflowApi.md#create_overflow_using_post) | **POST** /overflow | Create a Overflow request
[**delete_overflow_settings_using_delete**](OverflowApi.md#delete_overflow_settings_using_delete) | **DELETE** /overflow_setting/{overflow_settings_id} | Delete a overflow settings
[**get_overflow_all_using_get**](OverflowApi.md#get_overflow_all_using_get) | **GET** /overflow | List all overflow objects
[**get_overflow_settings_all_using_get**](OverflowApi.md#get_overflow_settings_all_using_get) | **GET** /overflow_setting | List all overflow settings
[**get_overflow_settings_using_get**](OverflowApi.md#get_overflow_settings_using_get) | **GET** /overflow_setting/{overflow_settings_id} | Retrieve a Overflow Setting
[**get_overflow_using_get**](OverflowApi.md#get_overflow_using_get) | **GET** /overflow/{overflow_id} | Retrieve a Overflow object
[**update_overflow_settings_using_put**](OverflowApi.md#update_overflow_settings_using_put) | **PUT** /overflow_setting/{overflow_settings_id} | Update a overflow settings


# **create_overflow_settings_using_post**
> OverflowSettings create_overflow_settings_using_post(overflow_settings)

Create a Overflow Settings request

Create a new Overflow Settings request.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_settings = NucleusApi::OverflowSettings.new # OverflowSettings | overflowSettings


begin
  #Create a Overflow Settings request
  result = api_instance.create_overflow_settings_using_post(overflow_settings)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->create_overflow_settings_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**OverflowSettings**](OverflowSettings.md)| overflowSettings | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_overflow_using_post**
> Overflow create_overflow_using_post(overflow_vo)

Create a Overflow request

Create a new Overflow request.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_vo = NucleusApi::OverflowVO.new # OverflowVO | overflowVO


begin
  #Create a Overflow request
  result = api_instance.create_overflow_using_post(overflow_vo)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->create_overflow_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_vo** | [**OverflowVO**](OverflowVO.md)| overflowVO | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_overflow_settings_using_delete**
> delete_overflow_settings_using_delete(overflow_settings_id)

Delete a overflow settings

Permanently delete a  overflow settings registered with your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_settings_id = 'overflow_settings_id_example' # String | UUID overflow_settings_id


begin
  #Delete a overflow settings
  api_instance.delete_overflow_settings_using_delete(overflow_settings_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->delete_overflow_settings_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**String**](.md)| UUID overflow_settings_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_overflow_all_using_get**
> PageOverflow get_overflow_all_using_get(opts)

List all overflow objects

Get details for all overflow.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all overflow objects
  result = api_instance.get_overflow_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->get_overflow_all_using_get: #{e}"
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

[**PageOverflow**](PageOverflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_overflow_settings_all_using_get**
> PageOverflowSettings get_overflow_settings_all_using_get(opts)

List all overflow settings

Get details for all overflow setting.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all overflow settings
  result = api_instance.get_overflow_settings_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->get_overflow_settings_all_using_get: #{e}"
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

[**PageOverflowSettings**](PageOverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_overflow_settings_using_get**
> OverflowSettings get_overflow_settings_using_get(overflow_settings_id)

Retrieve a Overflow Setting

Retrieve the information for a Overflow Settings.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_settings_id = 'overflow_settings_id_example' # String | UUID overflow_settings_id


begin
  #Retrieve a Overflow Setting
  result = api_instance.get_overflow_settings_using_get(overflow_settings_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->get_overflow_settings_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**String**](.md)| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_overflow_using_get**
> Overflow get_overflow_using_get(overflow_id)

Retrieve a Overflow object

Retrieve the information for a Overflow.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_id = 'overflow_id_example' # String | UUID overflow_id


begin
  #Retrieve a Overflow object
  result = api_instance.get_overflow_using_get(overflow_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->get_overflow_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_id** | [**String**](.md)| UUID overflow_id | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_overflow_settings_using_put**
> OverflowSettings update_overflow_settings_using_put(overflow_settings, overflow_settings_id)

Update a overflow settings

Update the information for a overflow setting registered with your firm.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::OverflowApi.new

overflow_settings = NucleusApi::OverflowSettings.new # OverflowSettings | overflow_settings

overflow_settings_id = 'overflow_settings_id_example' # String | UUID overflow_settings_id


begin
  #Update a overflow settings
  result = api_instance.update_overflow_settings_using_put(overflow_settings, overflow_settings_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling OverflowApi->update_overflow_settings_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**OverflowSettings**](OverflowSettings.md)| overflow_settings | 
 **overflow_settings_id** | [**String**](.md)| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



