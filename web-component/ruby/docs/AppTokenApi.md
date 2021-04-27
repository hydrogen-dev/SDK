# AdminApi::AppTokenApi

All URIs are relative to *https://api.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_token_using_get**](AppTokenApi.md#get_app_token_using_get) | **GET** /app_token | getAppToken


# **get_app_token_using_get**
> Array&lt;AppToken&gt; get_app_token_using_get(app_name)

getAppToken

### Example
```ruby
# Load the gem
require 'admin_api'

# Setup authorization
AdminApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = AdminApi::AppTokenApi.new

app_name = ['app_name_example'] # Array<String> | app_name


begin
  #getAppToken
  result = api_instance.get_app_token_using_get(app_name)
  p result
rescue AdminApi::ApiError => e
  puts "Exception when calling AppTokenApi->get_app_token_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **app_name** | [**Array&lt;String&gt;**](String.md)| app_name |

### Return type

[**Array&lt;AppToken&gt;**](AppToken.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*
