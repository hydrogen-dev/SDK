# NucleusApi::BusinessApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_business_using_post**](BusinessApi.md#create_business_using_post) | **POST** /business | Create a business
[**delete_business_using_delete**](BusinessApi.md#delete_business_using_delete) | **DELETE** /business/{business_id} | Delete a business
[**get_business_all_using_get**](BusinessApi.md#get_business_all_using_get) | **GET** /business | List all business
[**get_business_asset_size_using_get**](BusinessApi.md#get_business_asset_size_using_get) | **GET** /business/{business_id}/asset_size | List all business asset sizes
[**get_business_client_transaction_all_using_get**](BusinessApi.md#get_business_client_transaction_all_using_get) | **GET** /business/{business_id}/transaction | List all business transactions
[**get_business_holding_using_get**](BusinessApi.md#get_business_holding_using_get) | **GET** /business/{business_id}/holding | List all business holdings
[**get_business_using_get**](BusinessApi.md#get_business_using_get) | **GET** /business/{business_id} | Retrieve a business
[**update_business_using_put**](BusinessApi.md#update_business_using_put) | **PUT** /business/{business_id} | Update a business


# **create_business_using_post**
> Business create_business_using_post(business_request)

Create a business

Create a new business, or register a new business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_request = NucleusApi::Business.new # Business | businessRequest


begin
  #Create a business
  result = api_instance.create_business_using_post(business_request)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->create_business_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**Business**](Business.md)| businessRequest | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_business_using_delete**
> delete_business_using_delete(business_id)

Delete a business

Permanently delete a business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_id = 'business_id_example' # String | UUID business_id


begin
  #Delete a business
  api_instance.delete_business_using_delete(business_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->delete_business_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**String**](.md)| UUID business_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_business_all_using_get**
> PageBusiness get_business_all_using_get(opts)

List all business

Get details for all business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all business
  result = api_instance.get_business_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->get_business_all_using_get: #{e}"
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

[**PageBusiness**](PageBusiness.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_business_asset_size_using_get**
> Array&lt;AvailableDateDoubleVO&gt; get_business_asset_size_using_get(business_id, opts)

List all business asset sizes

Get a list of asset sizes per date for a business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_id = 'business_id_example' # String | UUID business_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | Currency Code
  end_date: Date.parse('null'), # Date | end date
  exclude_subledger: false, # BOOLEAN | exclude_subledger
  get_latest: true, # BOOLEAN | true or false
  sort_type: 'sort_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  start_date: Date.parse('null') # Date | start date
}

begin
  #List all business asset sizes
  result = api_instance.get_business_asset_size_using_get(business_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->get_business_asset_size_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**String**](.md)| UUID business_id | 
 **currency_conversion** | **String**| Currency Code | [optional] 
 **end_date** | **Date**| end date | [optional] [default to null]
 **exclude_subledger** | **BOOLEAN**| exclude_subledger | [optional] [default to false]
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **sort_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **Date**| start date | [optional] [default to null]

### Return type

[**Array&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_business_client_transaction_all_using_get**
> PagePortfolioTransaction get_business_client_transaction_all_using_get(business_id, opts)

List all business transactions

Get the information for all transactions under all client registered with your business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_id = 'business_id_example' # String | UUID business_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | currency_conversion
  end_date: 'end_date_example', # String | end date - yyyy-mm-dd
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: 'start_date_example' # String | start date - yyyy-mm-dd
}

begin
  #List all business transactions
  result = api_instance.get_business_client_transaction_all_using_get(business_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->get_business_client_transaction_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**String**](.md)| UUID business_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| currency_conversion | [optional] 
 **end_date** | **String**| end date - yyyy-mm-dd | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_business_holding_using_get**
> Array&lt;PortfolioHoldingAgg&gt; get_business_holding_using_get(business_id, opts)

List all business holdings

Get a list of holdings for a business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_id = 'business_id_example' # String | UUID business_id

opts = { 
  currency_conversion: 'currency_conversion_example', # String | Currency Code
  end_date: 'end_date_example', # String | end date - yyyy-mm-dd
  get_latest: true, # BOOLEAN | true or false
  start_date: 'start_date_example' # String | start date - yyyy-mm-dd
}

begin
  #List all business holdings
  result = api_instance.get_business_holding_using_get(business_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->get_business_holding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**String**](.md)| UUID business_id | 
 **currency_conversion** | **String**| Currency Code | [optional] 
 **end_date** | **String**| end date - yyyy-mm-dd | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **start_date** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**Array&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_business_using_get**
> Business get_business_using_get(business_id)

Retrieve a business

Retrieve the information for a business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business_id = 'business_id_example' # String | UUID business_id


begin
  #Retrieve a business
  result = api_instance.get_business_using_get(business_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->get_business_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**String**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_business_using_put**
> Business update_business_using_put(business, business_id)

Update a business

Update the information for a business.

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
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN")
end

api_instance = NucleusApi::BusinessApi.new

business = nil # Object | business

business_id = 'business_id_example' # String | UUID business_id


begin
  #Update a business
  result = api_instance.update_business_using_put(business, business_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling BusinessApi->update_business_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **Object**| business | 
 **business_id** | [**String**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



