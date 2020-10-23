# MoleculeApi::TokenTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_token_transfer_using_post**](TokenTransferApi.md#create_token_transfer_using_post) | **POST** /token_transfer | Creates Token Transfer record
[**get_token_transfer_all_using_get**](TokenTransferApi.md#get_token_transfer_all_using_get) | **GET** /token_transfer | Fetch Token Transfer record list
[**get_token_transfer_using_get**](TokenTransferApi.md#get_token_transfer_using_get) | **GET** /token_transfer/{token_transfer_id} | Fetch Token Transfer record details


# **create_token_transfer_using_post**
> TransactionSuccessResponse create_token_transfer_using_post(token_transfer_params)

Creates Token Transfer record

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

api_instance = MoleculeApi::TokenTransferApi.new

token_transfer_params = MoleculeApi::TokenTransferParams.new # TokenTransferParams | It enables a user to transfer Tokens


begin
  #Creates Token Transfer record
  result = api_instance.create_token_transfer_using_post(token_transfer_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenTransferApi->create_token_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_params** | [**TokenTransferParams**](TokenTransferParams.md)| It enables a user to transfer Tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_transfer_all_using_get**
> PageTokenTransferResponse get_token_transfer_all_using_get(opts)

Fetch Token Transfer record list

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

api_instance = MoleculeApi::TokenTransferApi.new

opts = { 
  wallet_id: 'wallet_id_example', # String | To filter response Token Transfer list by Wallet ID
  page: 56, # Integer | To filter response Token Transfer list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Token Transfer record list
  result = api_instance.get_token_transfer_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenTransferApi->get_token_transfer_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| To filter response Token Transfer list by Wallet ID | [optional] 
 **page** | **Integer**| To filter response Token Transfer list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenTransferResponse**](PageTokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_transfer_using_get**
> TokenTransferResponse get_token_transfer_using_get(token_transfer_id)

Fetch Token Transfer record details

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

api_instance = MoleculeApi::TokenTransferApi.new

token_transfer_id = 'token_transfer_id_example' # String | Token Transfer ID


begin
  #Fetch Token Transfer record details
  result = api_instance.get_token_transfer_using_get(token_transfer_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenTransferApi->get_token_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_id** | [**String**](.md)| Token Transfer ID | 

### Return type

[**TokenTransferResponse**](TokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



