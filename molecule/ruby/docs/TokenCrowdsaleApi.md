# MoleculeApi::TokenCrowdsaleApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deploy_crowdsale_using_post**](TokenCrowdsaleApi.md#deploy_crowdsale_using_post) | **POST** /crowdsale/deploy | Deploy token for Crowdsale
[**fund_crowdsale_using_post**](TokenCrowdsaleApi.md#fund_crowdsale_using_post) | **POST** /crowdsale/fund | Fund/add Tokens supply to Crowdsale
[**purchase_crowdsale_using_post**](TokenCrowdsaleApi.md#purchase_crowdsale_using_post) | **POST** /crowdsale/purchase | Purchase Tokens from Crowdsale


# **deploy_crowdsale_using_post**
> TransactionSuccessResponse deploy_crowdsale_using_post(crowdsale_deploy_params)

Deploy token for Crowdsale

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

api_instance = MoleculeApi::TokenCrowdsaleApi.new

crowdsale_deploy_params = MoleculeApi::CrowdsaleDeployParams.new # CrowdsaleDeployParams | Deploy token for Crowdsale


begin
  #Deploy token for Crowdsale
  result = api_instance.deploy_crowdsale_using_post(crowdsale_deploy_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenCrowdsaleApi->deploy_crowdsale_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_deploy_params** | [**CrowdsaleDeployParams**](CrowdsaleDeployParams.md)| Deploy token for Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **fund_crowdsale_using_post**
> TransactionSuccessResponse fund_crowdsale_using_post(crowdsale_fund_params)

Fund/add Tokens supply to Crowdsale

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

api_instance = MoleculeApi::TokenCrowdsaleApi.new

crowdsale_fund_params = MoleculeApi::CrowdsaleFundParams.new # CrowdsaleFundParams | Fund provided Token's supply to Crowdsale


begin
  #Fund/add Tokens supply to Crowdsale
  result = api_instance.fund_crowdsale_using_post(crowdsale_fund_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenCrowdsaleApi->fund_crowdsale_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_fund_params** | [**CrowdsaleFundParams**](CrowdsaleFundParams.md)| Fund provided Token&#39;s supply to Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **purchase_crowdsale_using_post**
> TransactionSuccessResponse purchase_crowdsale_using_post(crowdsale_purchase_params)

Purchase Tokens from Crowdsale

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

api_instance = MoleculeApi::TokenCrowdsaleApi.new

crowdsale_purchase_params = MoleculeApi::CrowdsalePurchaseParams.new # CrowdsalePurchaseParams | Purchase Tokens


begin
  #Purchase Tokens from Crowdsale
  result = api_instance.purchase_crowdsale_using_post(crowdsale_purchase_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenCrowdsaleApi->purchase_crowdsale_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsale_purchase_params** | [**CrowdsalePurchaseParams**](CrowdsalePurchaseParams.md)| Purchase Tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



