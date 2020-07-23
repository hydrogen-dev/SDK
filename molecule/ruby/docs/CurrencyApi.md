# MoleculeApi::CurrencyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_currency_using_post**](CurrencyApi.md#create_currency_using_post) | **POST** /currency | Creates a new Currency
[**get_currency_all_using_get**](CurrencyApi.md#get_currency_all_using_get) | **GET** /currency | Fetch Currency list
[**get_currency_using_get**](CurrencyApi.md#get_currency_using_get) | **GET** /currency/{currency_id} | Fetch Currency details
[**update_currency_using_put**](CurrencyApi.md#update_currency_using_put) | **PUT** /currency/{currency_id} | Update Currency details


# **create_currency_using_post**
> CurrencyResponse create_currency_using_post(currency_params)

Creates a new Currency

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyApi.new

currency_params = MoleculeApi::CurrencyParams.new # CurrencyParams | It enables a user to create a Currency


begin
  #Creates a new Currency
  result = api_instance.create_currency_using_post(currency_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyApi->create_currency_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_params** | [**CurrencyParams**](CurrencyParams.md)| It enables a user to create a Currency | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_all_using_get**
> PageCurrencyResponse get_currency_all_using_get(opts)

Fetch Currency list

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyApi.new

opts = { 
  symbol: 'symbol_example', # String | To filter response Currency list by Symbol name
  is_allowed: true, # BOOLEAN | To filter response Currency list
  page: 56, # Integer | To filter response Currency list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Currency list
  result = api_instance.get_currency_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyApi->get_currency_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| To filter response Currency list by Symbol name | [optional] 
 **is_allowed** | **BOOLEAN**| To filter response Currency list | [optional] 
 **page** | **Integer**| To filter response Currency list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyResponse**](PageCurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_using_get**
> CurrencyResponse get_currency_using_get(currency_id)

Fetch Currency details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyApi.new

currency_id = 'currency_id_example' # String | Currency ID


begin
  #Fetch Currency details
  result = api_instance.get_currency_using_get(currency_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyApi->get_currency_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**String**](.md)| Currency ID | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_currency_using_put**
> CurrencyResponse update_currency_using_put(currency_id, opts)

Update Currency details

### Example
```ruby
# load the gem
require 'molecule_api'
# setup authorization
MoleculeApi.configure do |config|
  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = MoleculeApi::CurrencyApi.new

currency_id = 'currency_id_example' # String | Currency ID

opts = { 
  currency_update_params: MoleculeApi::CurrencyUpdateParams.new # CurrencyUpdateParams | Currency details to be updated
}

begin
  #Update Currency details
  result = api_instance.update_currency_using_put(currency_id, opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyApi->update_currency_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**String**](.md)| Currency ID | 
 **currency_update_params** | [**CurrencyUpdateParams**](CurrencyUpdateParams.md)| Currency details to be updated | [optional] 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



