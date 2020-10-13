# MoleculeApi::TokenBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_token_balance_all_using_get**](TokenBalanceApi.md#get_token_balance_all_using_get) | **GET** /token_balance | Fetch Token Balance list
[**get_token_balance_using_get**](TokenBalanceApi.md#get_token_balance_using_get) | **GET** /token_balance/{token_balance_id} | Fetch Token Balance details


# **get_token_balance_all_using_get**
> PageTokenBalanceResponse get_token_balance_all_using_get(opts)

Fetch Token Balance list

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

api_instance = MoleculeApi::TokenBalanceApi.new

opts = { 
  wallet_id: 'wallet_id_example', # String | To filter response Token Balance list by wallet ID
  token_id: 'token_id_example', # String | To filter response Token Balance list by Token ID
  page: 56, # Integer | To filter response Token Balance list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Token Balance list
  result = api_instance.get_token_balance_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenBalanceApi->get_token_balance_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| To filter response Token Balance list by wallet ID | [optional] 
 **token_id** | [**String**](.md)| To filter response Token Balance list by Token ID | [optional] 
 **page** | **Integer**| To filter response Token Balance list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenBalanceResponse**](PageTokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_balance_using_get**
> TokenBalanceResponse get_token_balance_using_get(token_balance_id)

Fetch Token Balance details

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

api_instance = MoleculeApi::TokenBalanceApi.new

token_balance_id = 'token_balance_id_example' # String | Token Balance ID


begin
  #Fetch Token Balance details
  result = api_instance.get_token_balance_using_get(token_balance_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenBalanceApi->get_token_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_balance_id** | [**String**](.md)| Token Balance ID | 

### Return type

[**TokenBalanceResponse**](TokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



