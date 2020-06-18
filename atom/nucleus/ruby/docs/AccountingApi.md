# NucleusApi::AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_accounting_using_post**](AccountingApi.md#create_accounting_using_post) | **POST** /accounting | Create an accounting
[**delete_accounting_using_delete**](AccountingApi.md#delete_accounting_using_delete) | **DELETE** /accounting/{accounting_id} | Delete an accounting
[**get_accounting_all_using_get**](AccountingApi.md#get_accounting_all_using_get) | **GET** /accounting | List all accounting
[**get_accounting_using_get**](AccountingApi.md#get_accounting_using_get) | **GET** /accounting/{accounting_id} | Retrieve an accounting
[**update_accounting_using_put**](AccountingApi.md#update_accounting_using_put) | **PUT** /accounting/{accounting_id} | Update an accounting


# **create_accounting_using_post**
> Accounting create_accounting_using_post(accounting)

Create an accounting

Store stats pulled from accounting vendors.

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


api_instance = NucleusApi::AccountingApi.new

accounting = NucleusApi::Accounting.new # Accounting | accounting


begin
  #Create an accounting
  result = api_instance.create_accounting_using_post(accounting)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountingApi->create_accounting_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_accounting_using_delete**
> delete_accounting_using_delete(accounting_id)

Delete an accounting

Permanently delete an accounting.

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


api_instance = NucleusApi::AccountingApi.new

accounting_id = 'accounting_id_example' # String | UUID accounting_id


begin
  #Delete an accounting
  api_instance.delete_accounting_using_delete(accounting_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountingApi->delete_accounting_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_id** | [**String**](.md)| UUID accounting_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_accounting_all_using_get**
> PageAccounting get_accounting_all_using_get(opts)

List all accounting

Get information for all accounting for all clients defined for your firm.

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


api_instance = NucleusApi::AccountingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all accounting
  result = api_instance.get_accounting_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountingApi->get_accounting_all_using_get: #{e}"
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

[**PageAccounting**](PageAccounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_accounting_using_get**
> Accounting get_accounting_using_get(accounting_id)

Retrieve an accounting

Retrieve the information for a specific accounting associated with a client.

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


api_instance = NucleusApi::AccountingApi.new

accounting_id = 'accounting_id_example' # String | UUID accounting_id


begin
  #Retrieve an accounting
  result = api_instance.get_accounting_using_get(accounting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountingApi->get_accounting_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_id** | [**String**](.md)| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_accounting_using_put**
> Accounting update_accounting_using_put(accounting, accounting_id)

Update an accounting

Update the information for an accounting.

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


api_instance = NucleusApi::AccountingApi.new

accounting = NucleusApi::Accounting.new # Accounting | accounting

accounting_id = 'accounting_id_example' # String | UUID accounting_id


begin
  #Update an accounting
  result = api_instance.update_accounting_using_put(accounting, accounting_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling AccountingApi->update_accounting_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 
 **accounting_id** | [**String**](.md)| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



