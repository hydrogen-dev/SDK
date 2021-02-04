# ProtonApi::CardsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**card_limit_check**](CardsApi.md#card_limit_check) | **POST** /card_limit_check | Card Limit Check
[**card_transaction_authorization**](CardsApi.md#card_transaction_authorization) | **POST** /card_authorization | Card Transaction Authorization


# **card_limit_check**
> Hash&lt;String, Object&gt; card_limit_check(card_limit_check_request)

Card Limit Check

Evaluate card transaction history against spending controls

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
api_instance = ProtonApi::CardsApi.new

card_limit_check_request = ProtonApi::CardLimitCheckRequest.new # CardLimitCheckRequest | Request payload for Card Limit Check


begin
  #Card Limit Check
  result = api_instance.card_limit_check(card_limit_check_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling CardsApi->card_limit_check: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_limit_check_request** | [**CardLimitCheckRequest**](CardLimitCheckRequest.md)| Request payload for Card Limit Check | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **card_transaction_authorization**
> Hash&lt;String, Object&gt; card_transaction_authorization(card_transaction_authorization_request)

Card Transaction Authorization

Approve or reject a card transaction based on applicable conditions

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
api_instance = ProtonApi::CardsApi.new

card_transaction_authorization_request = ProtonApi::CardTransactionAuthorizationRequest.new # CardTransactionAuthorizationRequest | Request payload for Card Transaction Authorization


begin
  #Card Transaction Authorization
  result = api_instance.card_transaction_authorization(card_transaction_authorization_request)
  p result
rescue ProtonApi::ApiError => e
  puts "Exception when calling CardsApi->card_transaction_authorization: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_transaction_authorization_request** | [**CardTransactionAuthorizationRequest**](CardTransactionAuthorizationRequest.md)| Request payload for Card Transaction Authorization | 

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



