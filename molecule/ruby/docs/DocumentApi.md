# MoleculeApi::DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_document_using_post**](DocumentApi.md#create_document_using_post) | **POST** /document | Create a new Document
[**get_document_using_get**](DocumentApi.md#get_document_using_get) | **GET** /document/{document_id} | Retrieve a Document
[**verify_document_using_post**](DocumentApi.md#verify_document_using_post) | **POST** /document/verify | Verify a Document


# **create_document_using_post**
> TransactionSuccessResponse create_document_using_post(document_params)

Create a new Document

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::DocumentApi.new

document_params = MoleculeApi::DocumentParams.new # DocumentParams | Enables a user to store a Document hash on the blockchain


begin
  #Create a new Document
  result = api_instance.create_document_using_post(document_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling DocumentApi->create_document_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**DocumentParams**](DocumentParams.md)| Enables a user to store a Document hash on the blockchain | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_document_using_get**
> DocumentResponse get_document_using_get(document_id)

Retrieve a Document

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::DocumentApi.new

document_id = 'document_id_example' # String | Document ID


begin
  #Retrieve a Document
  result = api_instance.get_document_using_get(document_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling DocumentApi->get_document_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_id** | [**String**](.md)| Document ID | 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **verify_document_using_post**
> DocumentVerifyResponse verify_document_using_post(document_params)

Verify a Document

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::DocumentApi.new

document_params = MoleculeApi::DocumentParams.new # DocumentParams | Enables a user to verify a Document has not been changed


begin
  #Verify a Document
  result = api_instance.verify_document_using_post(document_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling DocumentApi->verify_document_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_params** | [**DocumentParams**](DocumentParams.md)| Enables a user to verify a Document has not been changed | 

### Return type

[**DocumentVerifyResponse**](DocumentVerifyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



