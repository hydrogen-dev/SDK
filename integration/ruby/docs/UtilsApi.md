# IntegrationApi::UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_token_exchange_using_post**](UtilsApi.md#create_token_exchange_using_post) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**create_user_using_post**](UtilsApi.md#create_user_using_post) | **POST** /user | Create user in vendor
[**get_widget_link_using_get**](UtilsApi.md#get_widget_link_using_get) | **GET** /widget_link/{nucleus_client_id} | Retrieve widget link


# **create_token_exchange_using_post**
> ExchangePublicTokenVO create_token_exchange_using_post(exchange_token_co)

Retrieve token based on certain vendor specific value

Retrieve the token.

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
end


api_instance = IntegrationApi::UtilsApi.new

exchange_token_co = IntegrationApi::ExchangeTokenCO.new # ExchangeTokenCO | exchangeTokenCO


begin
  #Retrieve token based on certain vendor specific value
  result = api_instance.create_token_exchange_using_post(exchange_token_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling UtilsApi->create_token_exchange_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange_token_co** | [**ExchangeTokenCO**](ExchangeTokenCO.md)| exchangeTokenCO | 

### Return type

[**ExchangePublicTokenVO**](ExchangePublicTokenVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_user_using_post**
> UserResponseVO create_user_using_post(create_user_request)

Create user in vendor

Create user in vendor.

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
end


api_instance = IntegrationApi::UtilsApi.new

create_user_request = IntegrationApi::CreateUserRequest.new # CreateUserRequest | createUserRequest


begin
  #Create user in vendor
  result = api_instance.create_user_using_post(create_user_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling UtilsApi->create_user_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_user_request** | [**CreateUserRequest**](CreateUserRequest.md)| createUserRequest | 

### Return type

[**UserResponseVO**](UserResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_widget_link_using_get**
> WidgetUrlVO get_widget_link_using_get(nucleus_client_id, opts)

Retrieve widget link

Retrieve the widget link.

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
end


api_instance = IntegrationApi::UtilsApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id

opts = { 
  is_mobile_webview: false, # BOOLEAN | is_mobile_webview
  mode: 'aggregation', # String | mode
  vendor_name: 'vendor_name_example' # String | vendor_name
}

begin
  #Retrieve widget link
  result = api_instance.get_widget_link_using_get(nucleus_client_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling UtilsApi->get_widget_link_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 
 **is_mobile_webview** | **BOOLEAN**| is_mobile_webview | [optional] [default to false]
 **mode** | **String**| mode | [optional] [default to aggregation]
 **vendor_name** | **String**| vendor_name | [optional] 

### Return type

[**WidgetUrlVO**](WidgetUrlVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



