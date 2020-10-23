# MoleculeApi::WalletPermissionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_wallet_permission_all_using_get**](WalletPermissionApi.md#get_wallet_permission_all_using_get) | **GET** /wallet_permission | Fetch Wallet list with client&#39;s permissions
[**get_wallet_permission_using_get**](WalletPermissionApi.md#get_wallet_permission_using_get) | **GET** /wallet_permission/{wallet_id} | Fetch Wallet&#39;s client permissions details
[**update_wallet_permission_using_put**](WalletPermissionApi.md#update_wallet_permission_using_put) | **PUT** /wallet_permission/{wallet_id} | Update client&#39;s permission for provided Wallet


# **get_wallet_permission_all_using_get**
> PageWalletPermissionResponse get_wallet_permission_all_using_get(opts)

Fetch Wallet list with client's permissions

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

api_instance = MoleculeApi::WalletPermissionApi.new

opts = { 
  nucleus_client_id: 'nucleus_client_id_example', # String | To filter response wallet list by client's ID
  is_active: true, # BOOLEAN | To filter response for active wallets
  page: 56, # Integer | To filter response wallet list page number
  size: 56, # Integer | Number of records per page
  order_by: 'order_by_example', # String | Field to sort record list
  ascending: true, # BOOLEAN | Sorting order
  get_latest: true # BOOLEAN | To fetch latest (one) record
}

begin
  #Fetch Wallet list with client's permissions
  result = api_instance.get_wallet_permission_all_using_get(opts)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletPermissionApi->get_wallet_permission_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| To filter response wallet list by client&#39;s ID | [optional] 
 **is_active** | **BOOLEAN**| To filter response for active wallets | [optional] 
 **page** | **Integer**| To filter response wallet list page number | [optional] 
 **size** | **Integer**| Number of records per page | [optional] 
 **order_by** | **String**| Field to sort record list | [optional] 
 **ascending** | **BOOLEAN**| Sorting order | [optional] 
 **get_latest** | **BOOLEAN**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletPermissionResponse**](PageWalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wallet_permission_using_get**
> WalletPermissionResponse get_wallet_permission_using_get(wallet_id)

Fetch Wallet's client permissions details

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

api_instance = MoleculeApi::WalletPermissionApi.new

wallet_id = 'wallet_id_example' # String | Wallet ID


begin
  #Fetch Wallet's client permissions details
  result = api_instance.get_wallet_permission_using_get(wallet_id)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletPermissionApi->get_wallet_permission_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| Wallet ID | 

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **update_wallet_permission_using_put**
> WalletPermissionResponse update_wallet_permission_using_put(wallet_id, client_permissions)

Update client's permission for provided Wallet

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

api_instance = MoleculeApi::WalletPermissionApi.new

wallet_id = 'wallet_id_example' # String | Wallet ID

client_permissions = MoleculeApi::WalletPermissionUpdateParams.new # WalletPermissionUpdateParams | Client's permission to be updated


begin
  #Update client's permission for provided Wallet
  result = api_instance.update_wallet_permission_using_put(wallet_id, client_permissions)
  p result
rescue MoleculeApi::ApiError => e
  puts "Exception when calling WalletPermissionApi->update_wallet_permission_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**String**](.md)| Wallet ID | 
 **client_permissions** | [**WalletPermissionUpdateParams**](WalletPermissionUpdateParams.md)| Client&#39;s permission to be updated | 

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



