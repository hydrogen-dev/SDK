# NucleusApi::BulkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bulk_using_post**](BulkApi.md#create_bulk_using_post) | **POST** /bulk/{entity_uri} | Create a bulk data
[**delete_bulk_using_delete**](BulkApi.md#delete_bulk_using_delete) | **DELETE** /bulk/{entity_uri} | Delete a bulk data
[**get_bulk_status_using_get**](BulkApi.md#get_bulk_status_using_get) | **GET** /bulk/status/{id} | Status of bulk transaction
[**update_bulk_using_put**](BulkApi.md#update_bulk_using_put) | **PUT** /bulk/{entity_uri} | Update a bulk data


# **create_bulk_using_post**
> BulkTransaction create_bulk_using_post(data, entity_uri)

Create a bulk data

Create a new bulk data for your firm.

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


api_instance = NucleusApi::BulkApi.new

data = NucleusApi::JsonNode.new # JsonNode | data

entity_uri = 'entity_uri_example' # String | UUID entity_uri


begin
  #Create a bulk data
  result = api_instance.create_bulk_using_post(data, entity_uri)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BulkApi->create_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**String**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_bulk_using_delete**
> BulkTransaction delete_bulk_using_delete(data, entity_uri)

Delete a bulk data

Delete a bulk data for your firm.

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


api_instance = NucleusApi::BulkApi.new

data = NucleusApi::JsonNode.new # JsonNode | data

entity_uri = 'entity_uri_example' # String | UUID entity_uri


begin
  #Delete a bulk data
  result = api_instance.delete_bulk_using_delete(data, entity_uri)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BulkApi->delete_bulk_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**String**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_bulk_status_using_get**
> BulkTransactionVO get_bulk_status_using_get(id)

Status of bulk transaction

Get the status of bulk transaction.

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


api_instance = NucleusApi::BulkApi.new

id = 'id_example' # String | UUID Bulk Transaction Id


begin
  #Status of bulk transaction
  result = api_instance.get_bulk_status_using_get(id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BulkApi->get_bulk_status_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID Bulk Transaction Id | 

### Return type

[**BulkTransactionVO**](BulkTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_bulk_using_put**
> BulkTransaction update_bulk_using_put(data, entity_uri)

Update a bulk data

Update a bulk data for your firm.

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


api_instance = NucleusApi::BulkApi.new

data = NucleusApi::JsonNode.new # JsonNode | data

entity_uri = 'entity_uri_example' # String | UUID entity_uri


begin
  #Update a bulk data
  result = api_instance.update_bulk_using_put(data, entity_uri)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BulkApi->update_bulk_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**String**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



