# MoleculeApi::EscrowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_escrow_using_post**](EscrowApi.md#create_escrow_using_post) | **POST** /escrow | Create a new Escrow
[**get_escrow_all_using_get**](EscrowApi.md#get_escrow_all_using_get) | **GET** /escrow | List all Escrow
[**get_escrow_using_get**](EscrowApi.md#get_escrow_using_get) | **GET** /escrow/{escrow_id} | Fetch Escrow


# **create_escrow_using_post**
> EscrowResponse create_escrow_using_post(escrow_params)

Create a new Escrow

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowApi.new

escrow_params = MoleculeApi::EscrowParams.new # EscrowParams | It enables a user to create a escrow


begin
  #Create a new Escrow
  result = api_instance.create_escrow_using_post(escrow_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowApi->create_escrow_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_params** | [**EscrowParams**](EscrowParams.md)| It enables a user to create a escrow | 

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_escrow_all_using_get**
> PageEscrowResponse get_escrow_all_using_get(opts)

List all Escrow

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowApi.new

opts = { 
  page: 56, # Integer | To filter response Escrow list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #List all Escrow
  result = api_instance.get_escrow_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowApi->get_escrow_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Escrow list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageEscrowResponse**](PageEscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_escrow_using_get**
> EscrowResponse get_escrow_using_get(escrow_id)

Fetch Escrow

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::EscrowApi.new

escrow_id = 'escrow_id_example' # String | Escrow ID


begin
  #Fetch Escrow
  result = api_instance.get_escrow_using_get(escrow_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling EscrowApi->get_escrow_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_id** | [**String**](.md)| Escrow ID | 

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



