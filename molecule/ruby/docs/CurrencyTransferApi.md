# MoleculeApi::CurrencyTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_currency_transfer_using_post**](CurrencyTransferApi.md#create_currency_transfer_using_post) | **POST** /currency_transfer | Creates Currency Transfer record
[**get_currency_transfer_all_using_get**](CurrencyTransferApi.md#get_currency_transfer_all_using_get) | **GET** /currency_transfer | Fetch Currency Transfer record list
[**get_currency_transfer_using_get**](CurrencyTransferApi.md#get_currency_transfer_using_get) | **GET** /currency_transfer/{currency_transfer_id} | Fetch Currency Transfer record details


# **create_currency_transfer_using_post**
> TransactionSuccessResponse create_currency_transfer_using_post(currency_transfer_params)

Creates Currency Transfer record

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyTransferApi.new

currency_transfer_params = MoleculeApi::CurrencyTransferParams.new # CurrencyTransferParams | It enables a user to transfer Currency


begin
  #Creates Currency Transfer record
  result = api_instance.create_currency_transfer_using_post(currency_transfer_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyTransferApi->create_currency_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_params** | [**CurrencyTransferParams**](CurrencyTransferParams.md)| It enables a user to transfer Currency | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_transfer_all_using_get**
> PageCurrencyTransferResponse get_currency_transfer_all_using_get(opts)

Fetch Currency Transfer record list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyTransferApi.new

opts = { 
  wallet_id: 'wallet_id_example', # String | To filter response Currency Transfer list by Wallet ID
  currency_id: 'currency_id_example', # String | To filter response Currency Transfer list by Currency ID
  page: 56, # Integer | To filter response Currency Transfer list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Currency Transfer record list
  result = api_instance.get_currency_transfer_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyTransferApi->get_currency_transfer_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| To filter response Currency Transfer list by Wallet ID | [optional] 
 **currency_id** | [**String**](.md)| To filter response Currency Transfer list by Currency ID | [optional] 
 **page** | **Integer**| To filter response Currency Transfer list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyTransferResponse**](PageCurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_transfer_using_get**
> CurrencyTransferResponse get_currency_transfer_using_get(currency_transfer_id)

Fetch Currency Transfer record details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyTransferApi.new

currency_transfer_id = 'currency_transfer_id_example' # String | Currency Transfer ID


begin
  #Fetch Currency Transfer record details
  result = api_instance.get_currency_transfer_using_get(currency_transfer_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyTransferApi->get_currency_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_id** | [**String**](.md)| Currency Transfer ID | 

### Return type

[**CurrencyTransferResponse**](CurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



