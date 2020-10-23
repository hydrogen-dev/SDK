# IntegrationApi::MarketDataApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_market_data_historical_using_post**](MarketDataApi.md#create_market_data_historical_using_post) | **POST** /market_data/historical | Create historical market data
[**create_market_data_quote_using_post**](MarketDataApi.md#create_market_data_quote_using_post) | **POST** /market_data/quote | Create quote market data


# **create_market_data_historical_using_post**
> MdHistoryResponseVO create_market_data_historical_using_post(history_request)

Create historical market data

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::MarketDataApi.new

history_request = IntegrationApi::MdHistoryRequestCO.new # MdHistoryRequestCO | historyRequest


begin
  #Create historical market data
  result = api_instance.create_market_data_historical_using_post(history_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling MarketDataApi->create_market_data_historical_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history_request** | [**MdHistoryRequestCO**](MdHistoryRequestCO.md)| historyRequest | 

### Return type

[**MdHistoryResponseVO**](MdHistoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_market_data_quote_using_post**
> MdQuoteResponseVO create_market_data_quote_using_post(quote_request)

Create quote market data

### Example
```ruby
# load the gem
require 'integration_api'

# Setup authorization
IntegrationApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
# Creating a token using client token
 config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end


api_instance = IntegrationApi::MarketDataApi.new

quote_request = IntegrationApi::MdQuoteRequestCO.new # MdQuoteRequestCO | quoteRequest


begin
  #Create quote market data
  result = api_instance.create_market_data_quote_using_post(quote_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling MarketDataApi->create_market_data_quote_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_request** | [**MdQuoteRequestCO**](MdQuoteRequestCO.md)| quoteRequest | 

### Return type

[**MdQuoteResponseVO**](MdQuoteResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



