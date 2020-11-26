# NucleusApi::FinancialOfferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_financial_offer_using_post**](FinancialOfferApi.md#create_financial_offer_using_post) | **POST** /financial_offer | Create a comparison request
[**delete_financial_offer_using_delete**](FinancialOfferApi.md#delete_financial_offer_using_delete) | **DELETE** /financial_offer/{financial_offer_id} | Delete a comparison request
[**get_financial_offer_all_using_get**](FinancialOfferApi.md#get_financial_offer_all_using_get) | **GET** /financial_offer | List all comparison requests
[**get_financial_offer_using_get**](FinancialOfferApi.md#get_financial_offer_using_get) | **GET** /financial_offer/{financial_offer_id} | Retrieve a comparison request
[**update_financial_offer_using_put**](FinancialOfferApi.md#update_financial_offer_using_put) | **PUT** /financial_offer/{financial_offer_id} | Update a comparison request


# **create_financial_offer_using_post**
> FinancialOffer create_financial_offer_using_post(financial_offer)

Create a comparison request

Create a new comparison request.

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

api_instance = NucleusApi::FinancialOfferApi.new

financial_offer = NucleusApi::FinancialOffer.new # FinancialOffer | financialOffer


begin
  #Create a comparison request
  result = api_instance.create_financial_offer_using_post(financial_offer)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialOfferApi->create_financial_offer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**FinancialOffer**](FinancialOffer.md)| financialOffer | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_financial_offer_using_delete**
> delete_financial_offer_using_delete(financial_offer_id)

Delete a comparison request

Permanently delete a comparison request.

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

api_instance = NucleusApi::FinancialOfferApi.new

financial_offer_id = 'financial_offer_id_example' # String | UUID financial_offer_id


begin
  #Delete a comparison request
  api_instance.delete_financial_offer_using_delete(financial_offer_id)
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialOfferApi->delete_financial_offer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer_id** | [**String**](.md)| UUID financial_offer_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_financial_offer_all_using_get**
> PageFinancialOffer get_financial_offer_all_using_get(opts)

List all comparison requests

Get the information for all comparison requests.

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

api_instance = NucleusApi::FinancialOfferApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  currency_conversion: 'currency_conversion_example', # String | currency_conversion
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all comparison requests
  result = api_instance.get_financial_offer_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialOfferApi->get_financial_offer_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **currency_conversion** | **String**| currency_conversion | [optional] 
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageFinancialOffer**](PageFinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_financial_offer_using_get**
> FinancialOffer get_financial_offer_using_get(financial_offer_id, opts)

Retrieve a comparison request

Retrieve the information for a comparison request.

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

api_instance = NucleusApi::FinancialOfferApi.new

financial_offer_id = 'financial_offer_id_example' # String | UUID financial_offer_id

opts = { 
  currency_conversion: 'currency_conversion_example' # String | USD
}

begin
  #Retrieve a comparison request
  result = api_instance.get_financial_offer_using_get(financial_offer_id, opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialOfferApi->get_financial_offer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer_id** | [**String**](.md)| UUID financial_offer_id | 
 **currency_conversion** | **String**| USD | [optional] 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_financial_offer_using_put**
> FinancialOffer update_financial_offer_using_put(financial_offer, financial_offer_id)

Update a comparison request

Update the information for a comparison request.

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

api_instance = NucleusApi::FinancialOfferApi.new

financial_offer = NucleusApi::FinancialOffer.new # FinancialOffer | financial_offer

financial_offer_id = 'financial_offer_id_example' # String | UUID financial_offer_id


begin
  #Update a comparison request
  result = api_instance.update_financial_offer_using_put(financial_offer, financial_offer_id)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling FinancialOfferApi->update_financial_offer_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**FinancialOffer**](FinancialOffer.md)| financial_offer | 
 **financial_offer_id** | [**String**](.md)| UUID financial_offer_id | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



