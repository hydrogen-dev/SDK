# IntegrationApi::AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_audit_log_all_using_get**](AuditLogApi.md#get_audit_log_all_using_get) | **GET** /audit_log | Gel all audit log


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


api_instance = IntegrationApi::AuditLogApi.new

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
  puts "Exception when calling AuditLogApi->get_audit_log_all_using_get: #{e}"
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



