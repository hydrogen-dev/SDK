# MoleculeApi::WalletApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_wallet_using_post**](WalletApi.md#create_wallet_using_post) | **POST** /wallet | Creates a new Wallet
[**get_wallet_all_using_get**](WalletApi.md#get_wallet_all_using_get) | **GET** /wallet | Fetch Wallet list
[**get_wallet_by_wallet_key_using_get**](WalletApi.md#get_wallet_by_wallet_key_using_get) | **GET** /wallet/wallet_key/{wallet_key_id} | Fetch Wallet details by Wallet Key ID
[**get_wallet_using_get**](WalletApi.md#get_wallet_using_get) | **GET** /wallet/{wallet_id} | Fetch Wallet details
[**update_wallet_using_put**](WalletApi.md#update_wallet_using_put) | **PUT** /wallet/{wallet_id} | Update Wallet details


# **create_wallet_using_post**
> WalletResponse create_wallet_using_post(wallet_params)

Creates a new Wallet

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

api_instance = MoleculeApi::WalletApi.new

wallet_params = MoleculeApi::WalletParams.new # WalletParams | It enables a user to create a Wallet


begin
  #Creates a new Wallet
  result = api_instance.create_wallet_using_post(wallet_params)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletApi->create_wallet_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_params** | [**WalletParams**](WalletParams.md)| It enables a user to create a Wallet | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_all_using_get**
> PageWalletResponse get_wallet_all_using_get(opts)

Fetch Wallet list

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

api_instance = MoleculeApi::WalletApi.new

opts = { 
  nucleus_client_id: 'nucleus_client_id_example', # String | To filter response wallet list by client's ID
  is_primary: true, # BOOLEAN | To filter response for primary wallets
  page: 56, # Integer | To filter response wallet list by page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Wallet list
  result = api_instance.get_wallet_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletApi->get_wallet_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| To filter response wallet list by client&#39;s ID | [optional] 
 **is_primary** | **BOOLEAN**| To filter response for primary wallets | [optional] 
 **page** | **Integer**| To filter response wallet list by page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletResponse**](PageWalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_by_wallet_key_using_get**
> WalletResponse get_wallet_by_wallet_key_using_get(wallet_key_id)

Fetch Wallet details by Wallet Key ID

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

api_instance = MoleculeApi::WalletApi.new

wallet_key_id = 'wallet_key_id_example' # String | Wallet Key ID


begin
  #Fetch Wallet details by Wallet Key ID
  result = api_instance.get_wallet_by_wallet_key_using_get(wallet_key_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletApi->get_wallet_by_wallet_key_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**String**](.md)| Wallet Key ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_using_get**
> WalletResponse get_wallet_using_get(wallet_id)

Fetch Wallet details

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

api_instance = MoleculeApi::WalletApi.new

wallet_id = 'wallet_id_example' # String | Wallet ID


begin
  #Fetch Wallet details
  result = api_instance.get_wallet_using_get(wallet_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletApi->get_wallet_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| Wallet ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_wallet_using_put**
> WalletResponse update_wallet_using_put(wallet_id, opts)

Update Wallet details

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

api_instance = MoleculeApi::WalletApi.new

wallet_id = 'wallet_id_example' # String | Wallet ID

opts = { 
  wallet_update_params: MoleculeApi::WalletParams.new # WalletParams | Wallet details to be updated
}

begin
  #Update Wallet details
  result = api_instance.update_wallet_using_put(wallet_id, opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletApi->update_wallet_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| Wallet ID | 
 **wallet_update_params** | [**WalletParams**](WalletParams.md)| Wallet details to be updated | [optional] 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



