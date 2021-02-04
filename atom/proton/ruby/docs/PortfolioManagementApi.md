# ProtonApi::PortfolioManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rebalancing_signal**](PortfolioManagementApi.md#rebalancing_signal) | **POST** /rebalancing_signal | Rebalancing Signal


# **rebalancing_signal**
> Hash&lt;String, Object&gt; rebalancing_signal(rebalancing_signal_request)

Rebalancing Signal

Generate rebalancing signals for a group of investments

### Example
```ruby
# load the gem
require 'proton_api'
# setup authorization
ProtonApi.configure do |config|
  # Creating a token for grant_type=client_credentials
   config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
  # Creating a token for grant_type=password
   config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
  # Creating a token using client token
   config.create_client_token_credential("CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN");
end
api_instance = ProtonApi::PortfolioManagementApi.new

rebalancing_signal_request = ProtonApi::RebalancingSignalRequest.new # RebalancingSignalRequest | Request payload for Rebalancing Signal


begin
  #Rebalancing Signal
  result = api_instance.rebalancing_signal(rebalancing_signal_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PortfolioManagementApi->rebalancing_signal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rebalancing_signal_request** | [**RebalancingSignalRequest**](RebalancingSignalRequest.md)| Request payload for Rebalancing Signal | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



