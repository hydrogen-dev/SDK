# AtomApi::AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_account_allocation_mapping_using_post**](AccountApi.md#create_account_allocation_mapping_using_post) | **POST** /account_allocation | Create an account allocation
[**create_account_type_using_post**](AccountApi.md#create_account_type_using_post) | **POST** /account_type | Create an account type
[**create_account_using_post**](AccountApi.md#create_account_using_post) | **POST** /account | Create an account
[**delete_account_allocation_mapping_using_delete**](AccountApi.md#delete_account_allocation_mapping_using_delete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**delete_account_permission_using_delete**](AccountApi.md#delete_account_permission_using_delete) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**delete_account_type_using_delete**](AccountApi.md#delete_account_type_using_delete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**delete_account_using_delete**](AccountApi.md#delete_account_using_delete) | **DELETE** /account/{account_id} | Delete an account
[**get_account_all_using_get**](AccountApi.md#get_account_all_using_get) | **GET** /account | List all accounts
[**get_account_allocation_mapping_all_using_get**](AccountApi.md#get_account_allocation_mapping_all_using_get) | **GET** /account_allocation | List all account allocations
[**get_account_allocation_mapping_using_get**](AccountApi.md#get_account_allocation_mapping_using_get) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**get_account_asset_size_agg_all_using_get**](AccountApi.md#get_account_asset_size_agg_all_using_get) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**get_account_asset_size_all_using_get**](AccountApi.md#get_account_asset_size_all_using_get) | **GET** /account_asset_size | List all account asset sizes
[**get_account_overview_using_get**](AccountApi.md#get_account_overview_using_get) | **GET** /account/{account_id}/account_overview | List all Account overview
[**get_account_permission_using_get**](AccountApi.md#get_account_permission_using_get) | **GET** /account_permission/{account_id} | Get an account permission
[**get_account_type_all_using_get**](AccountApi.md#get_account_type_all_using_get) | **GET** /account_type | List all account types
[**get_account_type_using_get**](AccountApi.md#get_account_type_using_get) | **GET** /account_type/{account_type_id} | Get an Account Type
[**get_account_using_get**](AccountApi.md#get_account_using_get) | **GET** /account/{account_id} | Retrieve an account
[**get_all_account_permission_using_get**](AccountApi.md#get_all_account_permission_using_get) | **GET** /account_permission | List all account permission
[**get_portfolio_holding_agg_all_using_get**](AccountApi.md#get_portfolio_holding_agg_all_using_get) | **GET** /account/{account_id}/holding | List all account holdings
[**get_portfolio_transaction_agg_all_using_get**](AccountApi.md#get_portfolio_transaction_agg_all_using_get) | **GET** /account/{account_id}/transaction | List all account transactions
[**insert_account_and_related_permission_using_post**](AccountApi.md#insert_account_and_related_permission_using_post) | **POST** /account_permission | create an account permission
[**subscribe_account_using_post**](AccountApi.md#subscribe_account_using_post) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**update_account_allocation_mapping_using_put**](AccountApi.md#update_account_allocation_mapping_using_put) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**update_account_type_using_put**](AccountApi.md#update_account_type_using_put) | **PUT** /account_type/{account_type_id} | Update an account type
[**update_account_using_put**](AccountApi.md#update_account_using_put) | **PUT** /account/{account_id} | Update an account
[**update_client_account_permission_using_put**](AccountApi.md#update_client_account_permission_using_put) | **PUT** /account_permission/{account_id} | Update an account permission


# **create_account_allocation_mapping_using_post**
> AccountAllocationMapping create_account_allocation_mapping_using_post(alloc_request)

Create an account allocation

Create an account-allocation mapping for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

alloc_request = AtomApi::AccountAllocationMapping.new # AccountAllocationMapping | allocRequest


begin
  #Create an account allocation
  result = api_instance.create_account_allocation_mapping_using_post(alloc_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->create_account_allocation_mapping_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_type_using_post**
> AccountType create_account_type_using_post(account_type_request)

Create an account type

Create a new account type for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_type_request = AtomApi::AccountType.new # AccountType | accountTypeRequest


begin
  #Create an account type
  result = api_instance.create_account_type_using_post(account_type_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->create_account_type_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_request** | [**AccountType**](AccountType.md)| accountTypeRequest | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_account_using_post**
> Account create_account_using_post(client_account_request)

Create an account

Create an account under a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

client_account_request = AtomApi::Account.new # Account | clientAccountRequest


begin
  #Create an account
  result = api_instance.create_account_using_post(client_account_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->create_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_account_request** | [**Account**](Account.md)| clientAccountRequest | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_account_allocation_mapping_using_delete**
> delete_account_allocation_mapping_using_delete(account_allocation_id)

Delete an account allocation

Permanently delete an account-allocation mapping for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_allocation_id = 'account_allocation_id_example' # String | UUID account_allocation_id


begin
  #Delete an account allocation
  api_instance.delete_account_allocation_mapping_using_delete(account_allocation_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->delete_account_allocation_mapping_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**String**](.md)| UUID account_allocation_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_account_permission_using_delete**
> AccountPermissionVO delete_account_permission_using_delete(account_id)

Delete an account permission

Delete an account permission

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | account_id


begin
  #Delete an account permission
  result = api_instance.delete_account_permission_using_delete(account_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->delete_account_permission_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_account_type_using_delete**
> delete_account_type_using_delete(account_type_id, account_type_id2)

Delete an account type

Permanently delete a possible account type defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_type_id = 'account_type_id_example' # String | UUID account_type_id

account_type_id2 = 'account_type_id_example' # String | account_type_id


begin
  #Delete an account type
  api_instance.delete_account_type_using_delete(account_type_id, account_type_id2)
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->delete_account_type_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**String**](.md)| UUID account_type_id | 
 **account_type_id2** | [**String**](.md)| account_type_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_account_using_delete**
> delete_account_using_delete(account_id)

Delete an account

Permanently delete an account under a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id


begin
  #Delete an account
  api_instance.delete_account_using_delete(account_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->delete_account_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_all_using_get**
> PageAccount get_account_all_using_get(opts)

List all accounts

Get information for all accounts for all clients defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all accounts
  result = api_instance.get_account_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAccount**](PageAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_allocation_mapping_all_using_get**
> PageAccountAllocationMapping get_account_allocation_mapping_all_using_get(opts)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all account allocations
  result = api_instance.get_account_allocation_mapping_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_allocation_mapping_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAccountAllocationMapping**](PageAccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_allocation_mapping_using_get**
> AccountAllocationMapping get_account_allocation_mapping_using_get(account_allocation_id)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_allocation_id = 'account_allocation_id_example' # String | UUID account_allocation_id


begin
  #Retrieve an account allocation
  result = api_instance.get_account_allocation_mapping_using_get(account_allocation_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_allocation_mapping_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**String**](.md)| UUID account_allocation_id | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_asset_size_agg_all_using_get**
> Array&lt;AvailableDateDoubleVO&gt; get_account_asset_size_agg_all_using_get(account_id, opts)

List all account asset sizes

Get a list of asset sizes by date for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | Account Id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end date
  exclude_subledger: false, # BOOLEAN | exclude_subledger
  get_latest: true, # BOOLEAN | true or false
  sort_type: 'sort_type_example', # String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  start_date: Date.parse('2013-10-20') # Date | start date
}

begin
  #List all account asset sizes
  result = api_instance.get_account_asset_size_agg_all_using_get(account_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_asset_size_agg_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| Account Id | 
 **end_date** | **Date**| end date | [optional] 
 **exclude_subledger** | **BOOLEAN**| exclude_subledger | [optional] [default to false]
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **sort_type** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **Date**| start date | [optional] 

### Return type

[**Array&lt;AvailableDateDoubleVO&gt;**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_asset_size_all_using_get**
> PageVAccountAssetSize get_account_asset_size_all_using_get(opts)

List all account asset sizes

Get information for all account asset sizes

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all account asset sizes
  result = api_instance.get_account_asset_size_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_asset_size_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageVAccountAssetSize**](PageVAccountAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_overview_using_get**
> AccountOverviewVO get_account_overview_using_get(account_id, opts)

List all Account overview

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  order_by: 'update_date' # String | order_by
}

begin
  #List all Account overview
  result = api_instance.get_account_overview_using_get(account_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_overview_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **order_by** | **String**| order_by | [optional] [default to update_date]

### Return type

[**AccountOverviewVO**](AccountOverviewVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_permission_using_get**
> AccountPermissionVO get_account_permission_using_get(account_id)

Get an account permission

Get an account permission

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | account_id


begin
  #Get an account permission
  result = api_instance.get_account_permission_using_get(account_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_permission_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_type_all_using_get**
> PageAccountType get_account_type_all_using_get(opts)

List all account types

List all account types defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all account types
  result = api_instance.get_account_type_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_type_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAccountType**](PageAccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_type_using_get**
> AccountType get_account_type_using_get(account_type_id, account_type_id2)

Get an Account Type

Get an account types defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_type_id = 'account_type_id_example' # String | UUID account_type_id

account_type_id2 = 'account_type_id_example' # String | account_type_id


begin
  #Get an Account Type
  result = api_instance.get_account_type_using_get(account_type_id, account_type_id2)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_type_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**String**](.md)| UUID account_type_id | 
 **account_type_id2** | [**String**](.md)| account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_account_using_get**
> Account get_account_using_get(account_id)

Retrieve an account

Retrieve the information for a specific account associated with a client.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id


begin
  #Retrieve an account
  result = api_instance.get_account_using_get(account_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_account_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_all_account_permission_using_get**
> PageAccountPermissionVO get_all_account_permission_using_get(opts)

List all account permission

List all account permission

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all account permission
  result = api_instance.get_all_account_permission_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_all_account_permission_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAccountPermissionVO**](PageAccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_holding_agg_all_using_get**
> Array&lt;PortfolioHoldingAgg&gt; get_portfolio_holding_agg_all_using_get(account_id, opts)

List all account holdings

Get information for all the securities that are currently being held by an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id

opts = { 
  end_date: 'end_date_example', # String | end date 
  get_latest: true, # BOOLEAN | true or false
  start_date: 'start_date_example' # String | start date 
}

begin
  #List all account holdings
  result = api_instance.get_portfolio_holding_agg_all_using_get(account_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_portfolio_holding_agg_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 
 **end_date** | **String**| end date  | [optional] 
 **get_latest** | **BOOLEAN**| true or false | [optional] 
 **start_date** | **String**| start date  | [optional] 

### Return type

[**Array&lt;PortfolioHoldingAgg&gt;**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_portfolio_transaction_agg_all_using_get**
> PagePortfolioTransaction get_portfolio_transaction_agg_all_using_get(account_id, opts)

List all account transactions

Get the information for all transactions for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id

opts = { 
  ascending: false, # BOOLEAN | ascending
  end_date: DateTime.parse('null'), # DateTime | end_date
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: DateTime.parse('null') # DateTime | start_date
}

begin
  #List all account transactions
  result = api_instance.get_portfolio_transaction_agg_all_using_get(account_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->get_portfolio_transaction_agg_all_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 
 **ascending** | **BOOLEAN**| ascending | [optional] [default to false]
 **end_date** | **DateTime**| end_date | [optional] [default to null]
 **order_by** | **String**| order_by | [optional] [default to update_date]
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **DateTime**| start_date | [optional] [default to null]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **insert_account_and_related_permission_using_post**
> AccountPermissionVO insert_account_and_related_permission_using_post(acl_client_permission_vo)

create an account permission

create an account permission

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

acl_client_permission_vo = AtomApi::AclClientPermissionVO.new # AclClientPermissionVO | aclClientPermissionVO


begin
  #create an account permission
  result = api_instance.insert_account_and_related_permission_using_post(acl_client_permission_vo)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->insert_account_and_related_permission_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acl_client_permission_vo** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **subscribe_account_using_post**
> Array&lt;Portfolio&gt; subscribe_account_using_post(account_id, alloc_request)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | UUID account_id

alloc_request = AtomApi::AccountAllocationMapping.new # AccountAllocationMapping | allocRequest


begin
  #Subscribe an account
  result = api_instance.subscribe_account_using_post(account_id, alloc_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->subscribe_account_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| UUID account_id | 
 **alloc_request** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**Array&lt;Portfolio&gt;**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_account_allocation_mapping_using_put**
> AccountAllocationMapping update_account_allocation_mapping_using_put(account_allocation_id, opts)

Update an account allocation

Update the information for an account-allocation mapping.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_allocation_id = 'account_allocation_id_example' # String | UUID account_allocation_id

opts = { 
  account_allocation_mapping: AtomApi::AccountAllocationMapping.new # AccountAllocationMapping | account_allocation_mapping
}

begin
  #Update an account allocation
  result = api_instance.update_account_allocation_mapping_using_put(account_allocation_id, opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->update_account_allocation_mapping_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**String**](.md)| UUID account_allocation_id | 
 **account_allocation_mapping** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| account_allocation_mapping | [optional] 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_account_type_using_put**
> AccountType update_account_type_using_put(account_type, account_type_id)

Update an account type

Update the information for a possible account type defined for your firm.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_type = AtomApi::AccountType.new # AccountType | account_type

account_type_id = 'account_type_id_example' # String | UUID account_type_id


begin
  #Update an account type
  result = api_instance.update_account_type_using_put(account_type, account_type_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->update_account_type_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type** | [**AccountType**](AccountType.md)| account_type | 
 **account_type_id** | [**String**](.md)| UUID account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_account_using_put**
> Account update_account_using_put(account, account_id)

Update an account

Update the information for an account.

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account = AtomApi::Account.new # Account | account

account_id = 'account_id_example' # String | UUID account_id


begin
  #Update an account
  result = api_instance.update_account_using_put(account, account_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->update_account_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| account | 
 **account_id** | [**String**](.md)| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_client_account_permission_using_put**
> AccountPermissionVO update_client_account_permission_using_put(account_id, acl_client_permission_vo)

Update an account permission

Update an account permission

### Example
```ruby
# load the gem
require 'atom_api'
# Setup authorization
AtomApi.configure do |config|
# Use one of the below method to generate oauth token        
# Creating a token for grant_type=client_credentials
 config.create_client_credential("CLIENT_ID", "CLIENT_SECRET");
# Creating a token for grant_type=password
 config.create_password_credential("CLIENT_ID", "CLIENT_SECRET", "USERNAME", "PASSWORD");
end


api_instance = AtomApi::AccountApi.new

account_id = 'account_id_example' # String | account_id

acl_client_permission_vo = AtomApi::AclClientPermissionVO.new # AclClientPermissionVO | aclClientPermissionVO


begin
  #Update an account permission
  result = api_instance.update_client_account_permission_using_put(account_id, acl_client_permission_vo)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling AccountApi->update_client_account_permission_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**String**](.md)| account_id | 
 **acl_client_permission_vo** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



