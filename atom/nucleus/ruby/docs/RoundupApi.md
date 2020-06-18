# NucleusApi::RoundupApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_roundup_settings_using_post**](RoundupApi.md#create_roundup_settings_using_post) | **POST** /roundup_setting | Create a Roundup Settings
[**create_roundup_using_post**](RoundupApi.md#create_roundup_using_post) | **POST** /roundup | Create a roundup
[**delete_roundup_settings_using_delete**](RoundupApi.md#delete_roundup_settings_using_delete) | **DELETE** /roundup_setting/{roundup_setting_id} | Delete a roundup settings
[**get_roundup_all_using_get**](RoundupApi.md#get_roundup_all_using_get) | **GET** /roundup | List all roundups
[**get_roundup_settings_all_using_get**](RoundupApi.md#get_roundup_settings_all_using_get) | **GET** /roundup_setting | List all roundup settings
[**get_roundup_settings_using_get**](RoundupApi.md#get_roundup_settings_using_get) | **GET** /roundup_setting/{roundup_setting_id} | Retrieve a Roundup Setting
[**get_roundup_using_get**](RoundupApi.md#get_roundup_using_get) | **GET** /roundup/{roundup_id} | Retrieve a Roundup
[**update_roundup_settings_using_put**](RoundupApi.md#update_roundup_settings_using_put) | **PUT** /roundup_setting/{roundup_setting_id} | Update a roundup settings


# **create_roundup_settings_using_post**
> RoundupSettings create_roundup_settings_using_post(roundup_settings)

Create a Roundup Settings

Create a Roundup Settings for Roundup amount with your firm.

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


api_instance = NucleusApi::RoundupApi.new

roundup_settings = NucleusApi::RoundupSettings.new # RoundupSettings | roundupSettings


begin
  #Create a Roundup Settings
  result = api_instance.create_roundup_settings_using_post(roundup_settings)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->create_roundup_settings_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_settings** | [**RoundupSettings**](RoundupSettings.md)| roundupSettings | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_roundup_using_post**
> Roundup create_roundup_using_post(roundup_co)

Create a roundup

Create a new roundup with your firm.

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


api_instance = NucleusApi::RoundupApi.new

roundup_co = NucleusApi::RoundupCO.new # RoundupCO | roundupCO


begin
  #Create a roundup
  result = api_instance.create_roundup_using_post(roundup_co)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->create_roundup_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_co** | [**RoundupCO**](RoundupCO.md)| roundupCO | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_roundup_settings_using_delete**
> delete_roundup_settings_using_delete(roundup_setting_id)

Delete a roundup settings

Permanently delete a  roundup settings registered with your firm.

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


api_instance = NucleusApi::RoundupApi.new

roundup_setting_id = 'roundup_setting_id_example' # String | UUID roundup_setting_id


begin
  #Delete a roundup settings
  api_instance.delete_roundup_settings_using_delete(roundup_setting_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->delete_roundup_settings_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**String**](.md)| UUID roundup_setting_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_roundup_all_using_get**
> PageRoundup get_roundup_all_using_get(opts)

List all roundups

Get details for all roundups.

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


api_instance = NucleusApi::RoundupApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all roundups
  result = api_instance.get_roundup_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->get_roundup_all_using_get: #{e}"
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

[**PageRoundup**](PageRoundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_roundup_settings_all_using_get**
> PageRoundupSettings get_roundup_settings_all_using_get(opts)

List all roundup settings

Get details for all roundup setting with your firm.

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


api_instance = NucleusApi::RoundupApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all roundup settings
  result = api_instance.get_roundup_settings_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->get_roundup_settings_all_using_get: #{e}"
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

[**PageRoundupSettings**](PageRoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_roundup_settings_using_get**
> RoundupSettings get_roundup_settings_using_get(roundup_setting_id)

Retrieve a Roundup Setting

Retrieve the information for a Roundup Settings with your firm.

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


api_instance = NucleusApi::RoundupApi.new

roundup_setting_id = 'roundup_setting_id_example' # String | UUID roundup_setting_id


begin
  #Retrieve a Roundup Setting
  result = api_instance.get_roundup_settings_using_get(roundup_setting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->get_roundup_settings_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**String**](.md)| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_roundup_using_get**
> Roundup get_roundup_using_get(roundup_id)

Retrieve a Roundup

Retrieve the information for a Roundup.

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


api_instance = NucleusApi::RoundupApi.new

roundup_id = 'roundup_id_example' # String | UUID roundup_id


begin
  #Retrieve a Roundup
  result = api_instance.get_roundup_using_get(roundup_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->get_roundup_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_id** | [**String**](.md)| UUID roundup_id | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_roundup_settings_using_put**
> RoundupSettings update_roundup_settings_using_put(roundup_setting, roundup_setting_id)

Update a roundup settings

Update the information for a roundup setting registered with your firm.

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


api_instance = NucleusApi::RoundupApi.new

roundup_setting = NucleusApi::RoundupSettings.new # RoundupSettings | roundup_setting

roundup_setting_id = 'roundup_setting_id_example' # String | UUID roundup_setting_id


begin
  #Update a roundup settings
  result = api_instance.update_roundup_settings_using_put(roundup_setting, roundup_setting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling RoundupApi->update_roundup_settings_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting** | [**RoundupSettings**](RoundupSettings.md)| roundup_setting | 
 **roundup_setting_id** | [**String**](.md)| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



