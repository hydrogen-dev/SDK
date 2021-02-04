# IntegrationApi::UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_token_exchange_using_post**](UtilsApi.md#create_token_exchange_using_post) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**create_user_using_post**](UtilsApi.md#create_user_using_post) | **POST** /user | Create user in vendor
[**get_audit_log_all_using_get**](UtilsApi.md#get_audit_log_all_using_get) | **GET** /audit_log | Gel all audit log
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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
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



# **get_audit_log_all_using_get**
> Pageobject get_audit_log_all_using_get(opts)

Gel all audit log

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

api_instance = IntegrationApi::UtilsApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  end_date: DateTime.parse('null'), # DateTime | end_date
  event: 'event_example', # String | event
  integration_type: 'integration_type_example', # String | integration_type
  is_request: false, # BOOLEAN | is_request
  nucleus_client_id: 'nucleus_client_id_example', # String | nucleus_client_id
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  request_type: 'request_type_example', # String | request_type
  size: 25, # Integer | size
  start_date: DateTime.parse('null'), # DateTime | start_date
  vendor_name: 'vendor_name_example' # String | vendor_name
}

begin
  #Gel all audit log
  result = api_instance.get_audit_log_all_using_get(opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling UtilsApi->get_audit_log_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **event** | **String**| event | [optional] 
 **integration_type** | **String**| integration_type | [optional] 
 **is_request** | **BOOLEAN**| is_request | [optional] [default to false]
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **request_type** | **String**| request_type | [optional] 
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **DateTime**| start_date | [optional] [default to null]
 **vendor_name** | **String**| vendor_name | [optional] 

### Return type

[**Pageobject**](Pageobject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
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



