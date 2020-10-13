# MoleculeApi::TokenSupplyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_token_supply_all_using_get**](TokenSupplyApi.md#get_token_supply_all_using_get) | **GET** /token_supply | Fetch Token Supply record list
[**get_token_supply_using_get**](TokenSupplyApi.md#get_token_supply_using_get) | **GET** /token_supply/{token_supply_id} | Fetch Token Supply details


# **get_token_supply_all_using_get**
> PageTokenSupplyResponse get_token_supply_all_using_get(opts)

Fetch Token Supply record list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = MoleculeApi::TokenSupplyApi.new

opts = { 
  token_id: 'token_id_example', # String | To filter response Token Supply list by Token ID
  page: 56, # Integer | To filter response Token Supply list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Token Supply record list
  result = api_instance.get_token_supply_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenSupplyApi->get_token_supply_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| To filter response Token Supply list by Token ID | [optional] 
 **page** | **Integer**| To filter response Token Supply list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenSupplyResponse**](PageTokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_supply_using_get**
> TokenSupplyResponse get_token_supply_using_get(token_supply_id)

Fetch Token Supply details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Use one of the below method to generate oauth token        
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end

api_instance = MoleculeApi::TokenSupplyApi.new

token_supply_id = 'token_supply_id_example' # String | Token Supply ID


begin
  #Fetch Token Supply details
  result = api_instance.get_token_supply_using_get(token_supply_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenSupplyApi->get_token_supply_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_supply_id** | [**String**](.md)| Token Supply ID | 

### Return type

[**TokenSupplyResponse**](TokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



