# NucleusApi::ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_fx_rate_bulk_using_post**](ResourceApi.md#create_fx_rate_bulk_using_post) | **POST** /resource/fx_rate | Create a bulk fxRate
[**get_all_country_using_get**](ResourceApi.md#get_all_country_using_get) | **GET** /resource/country | Get All Countries
[**get_all_currency_using_get**](ResourceApi.md#get_all_currency_using_get) | **GET** /resource/currency | Get All Currencies
[**get_all_merchant_category_code_using_get**](ResourceApi.md#get_all_merchant_category_code_using_get) | **GET** /resource/merchant_category_code | Get All Merchant Category Codes
[**get_all_states_using_get**](ResourceApi.md#get_all_states_using_get) | **GET** /resource/state | List all state resource
[**get_all_statistics_using_get**](ResourceApi.md#get_all_statistics_using_get) | **GET** /resource/statistic | List all statistic resource
[**get_currency_exchange_rate_all_using_get**](ResourceApi.md#get_currency_exchange_rate_all_using_get) | **GET** /resource/fx_rate | List all fxRates


# **create_fx_rate_bulk_using_post**
> Array&lt;FxRate&gt; create_fx_rate_bulk_using_post(fx_rate_list)

Create a bulk fxRate

Create a bulk fxRate.

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

api_instance = NucleusApi::ResourceApi.new

fx_rate_list = [NucleusApi::FxRate.new] # Array<FxRate> | fxRateList


begin
  #Create a bulk fxRate
  result = api_instance.create_fx_rate_bulk_using_post(fx_rate_list)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->create_fx_rate_bulk_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fx_rate_list** | [**Array&lt;FxRate&gt;**](FxRate.md)| fxRateList | 

### Return type

[**Array&lt;FxRate&gt;**](FxRate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **get_all_country_using_get**
> Array&lt;Country&gt; get_all_country_using_get

Get All Countries

Get All Countries. 

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

api_instance = NucleusApi::ResourceApi.new

begin
  #Get All Countries
  result = api_instance.get_all_country_using_get
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_all_country_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Country&gt;**](Country.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_all_currency_using_get**
> Array&lt;Currency&gt; get_all_currency_using_get

Get All Currencies

Get All Currencies. 

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

api_instance = NucleusApi::ResourceApi.new

begin
  #Get All Currencies
  result = api_instance.get_all_currency_using_get
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_all_currency_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Currency&gt;**](Currency.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_all_merchant_category_code_using_get**
> Array&lt;MerchantCategoryCode&gt; get_all_merchant_category_code_using_get

Get All Merchant Category Codes

Get All Merchant Category Codes.

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

api_instance = NucleusApi::ResourceApi.new

begin
  #Get All Merchant Category Codes
  result = api_instance.get_all_merchant_category_code_using_get
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_all_merchant_category_code_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;MerchantCategoryCode&gt;**](MerchantCategoryCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_all_states_using_get**
> Array&lt;State&gt; get_all_states_using_get(opts)

List all state resource

Get the information for all possible state resource.

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

api_instance = NucleusApi::ResourceApi.new

opts = { 
  country_code: 'US' # String | country_code
}

begin
  #List all state resource
  result = api_instance.get_all_states_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_all_states_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country_code** | **String**| country_code | [optional] [default to US]

### Return type

[**Array&lt;State&gt;**](State.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_all_statistics_using_get**
> Hash&lt;String, Array&lt;StatisticResourceVO&gt;&gt; get_all_statistics_using_get

List all statistic resource

Get the information for all possible statistic resource.

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

api_instance = NucleusApi::ResourceApi.new

begin
  #List all statistic resource
  result = api_instance.get_all_statistics_using_get
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_all_statistics_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Hash&lt;String, Array&lt;StatisticResourceVO&gt;&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_currency_exchange_rate_all_using_get**
> Array&lt;FxRateView&gt; get_currency_exchange_rate_all_using_get(opts)

List all fxRates

Get information for all fxRates defined for your firm.

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

api_instance = NucleusApi::ResourceApi.new

opts = { 
  filter: 'filter_example' # String | filter
}

begin
  #List all fxRates
  result = api_instance.get_currency_exchange_rate_all_using_get(opts)
  p result
rescue NucleusApi::ApiError => e
  puts "Exception when calling ResourceApi->get_currency_exchange_rate_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional] 

### Return type

[**Array&lt;FxRateView&gt;**](FxRateView.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



