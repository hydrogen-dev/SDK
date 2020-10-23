# MoleculeApi::CurrencyBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_currency_balance_all_using_get**](CurrencyBalanceApi.md#get_currency_balance_all_using_get) | **GET** /currency_balance | Fetch Currency Balance list
[**get_currency_balance_using_get**](CurrencyBalanceApi.md#get_currency_balance_using_get) | **GET** /currency_balance/{currency_balance_id} | Fetch Currency Balance details
[**update_currency_balance_using_post**](CurrencyBalanceApi.md#update_currency_balance_using_post) | **POST** /currency_balance/update | Update(Fetch) latest Currency Balance


# **get_currency_balance_all_using_get**
> PageCurrencyBalanceResponse get_currency_balance_all_using_get(opts)

Fetch Currency Balance list

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

api_instance = MoleculeApi::CurrencyBalanceApi.new

opts = { 
  wallet_id: 'wallet_id_example', # String | To filter response Currency Balance list by wallet ID
  currency_id: 'currency_id_example', # String | To filter response Currency Balance list by currency ID
  page: 56, # Integer | To filter response Currency Balance list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Currency Balance list
  result = api_instance.get_currency_balance_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyBalanceApi->get_currency_balance_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| To filter response Currency Balance list by wallet ID | [optional] 
 **currency_id** | [**String**](.md)| To filter response Currency Balance list by currency ID | [optional] 
 **page** | **Integer**| To filter response Currency Balance list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyBalanceResponse**](PageCurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_balance_using_get**
> CurrencyBalanceResponse get_currency_balance_using_get(currency_balance_id)

Fetch Currency Balance details

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

api_instance = MoleculeApi::CurrencyBalanceApi.new

currency_balance_id = 'currency_balance_id_example' # String | Currency Balance ID


begin
  #Fetch Currency Balance details
  result = api_instance.get_currency_balance_using_get(currency_balance_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyBalanceApi->get_currency_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_id** | [**String**](.md)| Currency Balance ID | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_currency_balance_using_post**
> CurrencyBalanceResponse update_currency_balance_using_post(currency_balance_update_params)

Update(Fetch) latest Currency Balance

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

api_instance = MoleculeApi::CurrencyBalanceApi.new

currency_balance_update_params = MoleculeApi::CurrencyBalanceUpdateParams.new # CurrencyBalanceUpdateParams | To fetch/update latest record


begin
  #Update(Fetch) latest Currency Balance
  result = api_instance.update_currency_balance_using_post(currency_balance_update_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling CurrencyBalanceApi->update_currency_balance_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_update_params** | [**CurrencyBalanceUpdateParams**](CurrencyBalanceUpdateParams.md)| To fetch/update latest record | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



