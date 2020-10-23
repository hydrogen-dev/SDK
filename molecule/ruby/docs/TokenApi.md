# MoleculeApi::TokenApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**burn_token_using_post**](TokenApi.md#burn_token_using_post) | **POST** /token/burn | Burn tokens
[**create_token_using_post**](TokenApi.md#create_token_using_post) | **POST** /token | Creates a new Token
[**delete_token_using_delete**](TokenApi.md#delete_token_using_delete) | **DELETE** /token/{token_id} | Delete Token
[**deploy_token_using_post**](TokenApi.md#deploy_token_using_post) | **POST** /token/deploy | Deploys provided Token to network
[**get_token_all_using_get**](TokenApi.md#get_token_all_using_get) | **GET** /token | Fetch Token list
[**get_token_using_get**](TokenApi.md#get_token_using_get) | **GET** /token/{token_id} | Fetch Token details
[**mint_token_using_post**](TokenApi.md#mint_token_using_post) | **POST** /token/mint | Mint new tokens
[**update_token_using_put**](TokenApi.md#update_token_using_put) | **PUT** /token/{token_id} | Update Token details
[**whitelist_token_using_post**](TokenApi.md#whitelist_token_using_post) | **POST** /token/whitelist | Whitelist token for provided wallet


# **burn_token_using_post**
> TransactionSuccessResponse burn_token_using_post(token_burn_params)

Burn tokens

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

api_instance = MoleculeApi::TokenApi.new

token_burn_params = MoleculeApi::TokenBurnParams.new # TokenBurnParams | Burns provided amount of existing tokens


begin
  #Burn tokens
  result = api_instance.burn_token_using_post(token_burn_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->burn_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_burn_params** | [**TokenBurnParams**](TokenBurnParams.md)| Burns provided amount of existing tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_token_using_post**
> TokenResponse create_token_using_post(token_params)

Creates a new Token

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

api_instance = MoleculeApi::TokenApi.new

token_params = MoleculeApi::TokenParams.new # TokenParams | It enables a user to create a Token


begin
  #Creates a new Token
  result = api_instance.create_token_using_post(token_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->create_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_params** | [**TokenParams**](TokenParams.md)| It enables a user to create a Token | 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **delete_token_using_delete**
> delete_token_using_delete(token_id)

Delete Token

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

api_instance = MoleculeApi::TokenApi.new

token_id = 'token_id_example' # String | Token ID


begin
  #Delete Token
  api_instance.delete_token_using_delete(token_id)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->delete_token_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| Token ID | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **deploy_token_using_post**
> TransactionSuccessResponse deploy_token_using_post(token_deploy_params)

Deploys provided Token to network

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

api_instance = MoleculeApi::TokenApi.new

token_deploy_params = MoleculeApi::TokenDeployParams.new # TokenDeployParams | Deploys provided Token to network


begin
  #Deploys provided Token to network
  result = api_instance.deploy_token_using_post(token_deploy_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->deploy_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_deploy_params** | [**TokenDeployParams**](TokenDeployParams.md)| Deploys provided Token to network | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_all_using_get**
> PageTokenResponse get_token_all_using_get(opts)

Fetch Token list

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

api_instance = MoleculeApi::TokenApi.new

opts = { 
  page: 56, # Integer | To filter response Token list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Token list
  result = api_instance.get_token_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->get_token_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| To filter response Token list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenResponse**](PageTokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_token_using_get**
> TokenResponse get_token_using_get(token_id)

Fetch Token details

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

api_instance = MoleculeApi::TokenApi.new

token_id = 'token_id_example' # String | Token ID


begin
  #Fetch Token details
  result = api_instance.get_token_using_get(token_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->get_token_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| Token ID | 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **mint_token_using_post**
> TransactionSuccessResponse mint_token_using_post(token_mint_params)

Mint new tokens

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

api_instance = MoleculeApi::TokenApi.new

token_mint_params = MoleculeApi::TokenMintParams.new # TokenMintParams | Mint new tokens


begin
  #Mint new tokens
  result = api_instance.mint_token_using_post(token_mint_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->mint_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_mint_params** | [**TokenMintParams**](TokenMintParams.md)| Mint new tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_token_using_put**
> TokenResponse update_token_using_put(token_id, opts)

Update Token details

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

api_instance = MoleculeApi::TokenApi.new

token_id = 'token_id_example' # String | Token ID

opts = { 
  token_update_params: MoleculeApi::TokenUpdateParams.new # TokenUpdateParams | Token details to be updated
}

begin
  #Update Token details
  result = api_instance.update_token_using_put(token_id, opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->update_token_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**String**](.md)| Token ID | 
 **token_update_params** | [**TokenUpdateParams**](TokenUpdateParams.md)| Token details to be updated | [optional] 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **whitelist_token_using_post**
> TransactionSuccessResponse whitelist_token_using_post(token_whitelist_params)

Whitelist token for provided wallet

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

api_instance = MoleculeApi::TokenApi.new

token_whitelist_params = MoleculeApi::TokenWhitelistParams.new # TokenWhitelistParams | Whitelist token for provided wallet


begin
  #Whitelist token for provided wallet
  result = api_instance.whitelist_token_using_post(token_whitelist_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling TokenApi->whitelist_token_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_whitelist_params** | [**TokenWhitelistParams**](TokenWhitelistParams.md)| Whitelist token for provided wallet | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



