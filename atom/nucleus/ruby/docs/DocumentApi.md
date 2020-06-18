# NucleusApi::DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_document_using_post**](DocumentApi.md#create_document_using_post) | **POST** /document | Create a Document
[**delete_document_using_delete**](DocumentApi.md#delete_document_using_delete) | **DELETE** /document/{document_id} | Delete a tenant document by Id
[**get_document_all_using_get**](DocumentApi.md#get_document_all_using_get) | **GET** /document | List all Documents
[**get_document_using_get**](DocumentApi.md#get_document_using_get) | **GET** /document/{document_id} | Retrieve a Tenant Document by Document Id
[**update_document_using_put**](DocumentApi.md#update_document_using_put) | **PUT** /document/{document_id} | Update a Tenant Document


# **create_document_using_post**
> Document create_document_using_post(document_request)

Create a Document

Create a new Document for your firm.

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


api_instance = NucleusApi::DocumentApi.new

document_request = NucleusApi::Document.new # Document | documentRequest


begin
  #Create a Document
  result = api_instance.create_document_using_post(document_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DocumentApi->create_document_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_request** | [**Document**](Document.md)| documentRequest | 

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_document_using_delete**
> delete_document_using_delete(document_id)

Delete a tenant document by Id

Permanently delete a tenant document by Id

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


api_instance = NucleusApi::DocumentApi.new

document_id = 'document_id_example' # String | UUID document_id


begin
  #Delete a tenant document by Id
  api_instance.delete_document_using_delete(document_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling DocumentApi->delete_document_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**String**](.md)| UUID document_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_document_all_using_get**
> PageDocument get_document_all_using_get(opts)

List all Documents

Get the information for all Documents 

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


api_instance = NucleusApi::DocumentApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all Documents
  result = api_instance.get_document_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DocumentApi->get_document_all_using_get: #{e}"
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

[**PageDocument**](PageDocument.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_document_using_get**
> Document get_document_using_get(document_id)

Retrieve a Tenant Document by Document Id

Retrieve the information for a Tenant Document by Document Id

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


api_instance = NucleusApi::DocumentApi.new

document_id = 'document_id_example' # String | UUID document_id


begin
  #Retrieve a Tenant Document by Document Id
  result = api_instance.get_document_using_get(document_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DocumentApi->get_document_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**String**](.md)| UUID document_id | 

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_document_using_put**
> Document update_document_using_put(document, document_id)

Update a Tenant Document

Updated the information for a Tenant Documents

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


api_instance = NucleusApi::DocumentApi.new

document = NucleusApi::Document.new # Document | document

document_id = 'document_id_example' # String | UUID document_id


begin
  #Update a Tenant Document
  result = api_instance.update_document_using_put(document, document_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling DocumentApi->update_document_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document** | [**Document**](Document.md)| document | 
 **document_id** | [**String**](.md)| UUID document_id | 

### Return type

[**Document**](Document.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



