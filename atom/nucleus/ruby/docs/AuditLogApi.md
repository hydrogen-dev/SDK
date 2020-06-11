# AtomApi::AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_audit_log_using_post**](AuditLogApi.md#create_audit_log_using_post) | **POST** /audit_log | Create a audit log
[**get_audit_log_all_using_get**](AuditLogApi.md#get_audit_log_all_using_get) | **GET** /audit_log | List all audit log
[**get_audit_log_using_get**](AuditLogApi.md#get_audit_log_using_get) | **GET** /audit_log/{audit_log_id} | Retrieve a audit log


# **create_audit_log_using_post**
> AuditLog create_audit_log_using_post(audit_log)

Create a audit log

Create a new audit log.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AuditLogApi.new

audit_log = AtomApi::AuditLog.new # AuditLog | auditLog


begin
  #Create a audit log
  result = api_instance.create_audit_log_using_post(audit_log)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AuditLogApi->create_audit_log_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_log** | [**AuditLog**](AuditLog.md)| auditLog | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **get_audit_log_all_using_get**
> PageAuditLog get_audit_log_all_using_get(opts)

List all audit log

Get details for all audit log.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AuditLogApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all audit log
  result = api_instance.get_audit_log_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AuditLogApi->get_audit_log_all_using_get: #{e}"
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

[**PageAuditLog**](PageAuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_audit_log_using_get**
> AuditLog get_audit_log_using_get(audit_log_id)

Retrieve a audit log

Retrieve the information for a audit log.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AuditLogApi.new

audit_log_id = 'audit_log_id_example' # String | UUID audit_log_id


begin
  #Retrieve a audit log
  result = api_instance.get_audit_log_using_get(audit_log_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AuditLogApi->get_audit_log_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_log_id** | [**String**](.md)| UUID audit_log_id | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



