# ProtonApi::PortfolioConstructionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mvo**](PortfolioConstructionApi.md#mvo) | **POST** /mvo | MVO


# **mvo**
> Hash&lt;String, Object&gt; mvo(mvo_request)

MVO

Run a mean-variance optimization for a group of potential investments

### Example
```ruby
# load the gem
require 'proton_api'
ProtonApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = ProtonApi::PortfolioConstructionApi.new

mvo_request = ProtonApi::MvoRequest.new # MvoRequest | Request payload for MVO


begin
  #MVO
  result = api_instance.mvo(mvo_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling PortfolioConstructionApi->mvo: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mvo_request** | [**MvoRequest**](MvoRequest.md)| Request payload for MVO | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



