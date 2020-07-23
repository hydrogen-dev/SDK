# MoleculeApi::WalletKeyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_wallet_key_using_post**](WalletKeyApi.md#create_wallet_key_using_post) | **POST** /wallet_key | Creates a new Wallet Key for provided Wallet ID
[**generate_wallet_key_using_post**](WalletKeyApi.md#generate_wallet_key_using_post) | **POST** /wallet_key/generator | Generates Wallet Key for provided Wallet ID
[**get_wallet_key_all_using_get**](WalletKeyApi.md#get_wallet_key_all_using_get) | **GET** /wallet_key | Fetch Wallet Key list
[**get_wallet_key_using_get**](WalletKeyApi.md#get_wallet_key_using_get) | **GET** /wallet_key/{wallet_key_id} | Fetch Wallet Key details


# **create_wallet_key_using_post**
> WalletKeyResponse create_wallet_key_using_post(wallet_key_params)

Creates a new Wallet Key for provided Wallet ID

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WalletKeyApi.new

wallet_key_params = MoleculeApi::WalletKeyParams.new # WalletKeyParams | It enables a user to create a Wallet Key record


begin
  #Creates a new Wallet Key for provided Wallet ID
  result = api_instance.create_wallet_key_using_post(wallet_key_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletKeyApi->create_wallet_key_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_params** | [**WalletKeyParams**](WalletKeyParams.md)| It enables a user to create a Wallet Key record | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **generate_wallet_key_using_post**
> WalletKeyResponse generate_wallet_key_using_post(wallet_key_generate_params)

Generates Wallet Key for provided Wallet ID

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WalletKeyApi.new

wallet_key_generate_params = MoleculeApi::WalletKeyGenerateParams.new # WalletKeyGenerateParams | It enables a user to generate a Wallet Key record


begin
  #Generates Wallet Key for provided Wallet ID
  result = api_instance.generate_wallet_key_using_post(wallet_key_generate_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletKeyApi->generate_wallet_key_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_generate_params** | [**WalletKeyGenerateParams**](WalletKeyGenerateParams.md)| It enables a user to generate a Wallet Key record | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_key_all_using_get**
> PageWalletKeyResponse get_wallet_key_all_using_get(opts)

Fetch Wallet Key list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WalletKeyApi.new

opts = { 
  page: 56, # Integer | To filter response wallet list page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Wallet Key list
  result = api_instance.get_wallet_key_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletKeyApi->get_wallet_key_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response wallet list page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletKeyResponse**](PageWalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_key_using_get**
> WalletKeyResponse get_wallet_key_using_get(wallet_key_id)

Fetch Wallet Key details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::WalletKeyApi.new

wallet_key_id = 'wallet_key_id_example' # String | Wallet Key ID


begin
  #Fetch Wallet Key details
  result = api_instance.get_wallet_key_using_get(wallet_key_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletKeyApi->get_wallet_key_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**String**](.md)| Wallet Key ID | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



