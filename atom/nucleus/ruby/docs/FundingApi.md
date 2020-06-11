# AtomApi::FundingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bank_link_using_post**](FundingApi.md#create_bank_link_using_post) | **POST** /bank_link | Create a bank link
[**create_deposit_using_post**](FundingApi.md#create_deposit_using_post) | **POST** /deposit | Create a deposit request
[**create_funding_using_post**](FundingApi.md#create_funding_using_post) | **POST** /funding | Create a funding request
[**create_transfer_using_post**](FundingApi.md#create_transfer_using_post) | **POST** /transfer | Create a transfer requests
[**create_withdrawal_using_post**](FundingApi.md#create_withdrawal_using_post) | **POST** /withdrawal | Create a withdrawal request
[**delete_bank_link_using_delete**](FundingApi.md#delete_bank_link_using_delete) | **DELETE** /bank_link/{bank_link_id} | Delete a bank link
[**delete_deposit_using_delete**](FundingApi.md#delete_deposit_using_delete) | **DELETE** /deposit/{deposit_id} | Delete a deposit request
[**delete_funding_using_delete**](FundingApi.md#delete_funding_using_delete) | **DELETE** /funding/{funding_id} | Delete a funding request
[**delete_transfer_using_delete**](FundingApi.md#delete_transfer_using_delete) | **DELETE** /transfer/{transfer_id} | Delete a transfer request
[**delete_withdrawal_using_delete**](FundingApi.md#delete_withdrawal_using_delete) | **DELETE** /withdrawal/{withdrawal_id} | Delete a withdrawal request
[**get_bank_link_all_using_get**](FundingApi.md#get_bank_link_all_using_get) | **GET** /bank_link | List all bank links
[**get_bank_link_using_get**](FundingApi.md#get_bank_link_using_get) | **GET** /bank_link/{bank_link_id} | Retrieve a bank link
[**get_deposit_all_using_get**](FundingApi.md#get_deposit_all_using_get) | **GET** /deposit | List all deposit requests
[**get_deposit_using_get**](FundingApi.md#get_deposit_using_get) | **GET** /deposit/{deposit_id} | Retrieve a deposit request
[**get_funding_all_using_get**](FundingApi.md#get_funding_all_using_get) | **GET** /funding | List all funding requests 
[**get_funding_using_get**](FundingApi.md#get_funding_using_get) | **GET** /funding/{funding_id} | Retrieve a funding request
[**get_transfer_all_using_get**](FundingApi.md#get_transfer_all_using_get) | **GET** /transfer | List all transfer requests
[**get_transfer_using_get**](FundingApi.md#get_transfer_using_get) | **GET** /transfer/{transfer_id} | Retrieve a transfer request
[**get_withdrawal_all_using_get**](FundingApi.md#get_withdrawal_all_using_get) | **GET** /withdrawal | List all withdrawal requests
[**get_withdrawal_using_get**](FundingApi.md#get_withdrawal_using_get) | **GET** /withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**update_bank_link_bulk_using_put**](FundingApi.md#update_bank_link_bulk_using_put) | **PUT** /bulk_bank_link | Update list of bank link
[**update_bank_link_using_put**](FundingApi.md#update_bank_link_using_put) | **PUT** /bank_link/{bank_link_id} | Update a bank link
[**update_deposit_using_put**](FundingApi.md#update_deposit_using_put) | **PUT** /deposit/{deposit_id} | Update a deposit request
[**update_funding_using_put**](FundingApi.md#update_funding_using_put) | **PUT** /funding/{funding_id} | Update a funding request
[**update_transfer_using_put**](FundingApi.md#update_transfer_using_put) | **PUT** /transfer/{transfer_id} | Update a transfer request
[**update_withdrawal_using_put**](FundingApi.md#update_withdrawal_using_put) | **PUT** /withdrawal/{withdrawal_id} | Update a withdrawal request


# **create_bank_link_using_post**
> BankLink create_bank_link_using_post(bank_link_info_request)

Create a bank link

Create a new bank link for an account.

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


api_instance = AtomApi::FundingApi.new

bank_link_info_request = AtomApi::BankLink.new # BankLink | bankLinkInfoRequest


begin
  #Create a bank link
  result = api_instance.create_bank_link_using_post(bank_link_info_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->create_bank_link_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_info_request** | [**BankLink**](BankLink.md)| bankLinkInfoRequest | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_deposit_using_post**
> DailyDeposit create_deposit_using_post(daily_deposit_request)

Create a deposit request

Create a new deposit request for an account.

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


api_instance = AtomApi::FundingApi.new

daily_deposit_request = AtomApi::DailyDeposit.new # DailyDeposit | dailyDepositRequest


begin
  #Create a deposit request
  result = api_instance.create_deposit_using_post(daily_deposit_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->create_deposit_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_deposit_request** | [**DailyDeposit**](DailyDeposit.md)| dailyDepositRequest | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_funding_using_post**
> Funding create_funding_using_post(funding_request)

Create a funding request

Create a new funding request for an account. 

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


api_instance = AtomApi::FundingApi.new

funding_request = AtomApi::Funding.new # Funding | fundingRequest


begin
  #Create a funding request
  result = api_instance.create_funding_using_post(funding_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->create_funding_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_request** | [**Funding**](Funding.md)| fundingRequest | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_transfer_using_post**
> ExternalAccountTransfer create_transfer_using_post(external_account_transfer_request)

Create a transfer requests

Create a new external account transfer for a client account.

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


api_instance = AtomApi::FundingApi.new

external_account_transfer_request = AtomApi::ExternalAccountTransfer.new # ExternalAccountTransfer | externalAccountTransferRequest


begin
  #Create a transfer requests
  result = api_instance.create_transfer_using_post(external_account_transfer_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->create_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_request** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| externalAccountTransferRequest | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **create_withdrawal_using_post**
> DailyWithdrawal create_withdrawal_using_post(daily_withdrawal_request)

Create a withdrawal request

Create a new withdrawal request for an account.

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


api_instance = AtomApi::FundingApi.new

daily_withdrawal_request = AtomApi::DailyWithdrawal.new # DailyWithdrawal | dailyWithdrawalRequest


begin
  #Create a withdrawal request
  result = api_instance.create_withdrawal_using_post(daily_withdrawal_request)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->create_withdrawal_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_withdrawal_request** | [**DailyWithdrawal**](DailyWithdrawal.md)| dailyWithdrawalRequest | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **delete_bank_link_using_delete**
> delete_bank_link_using_delete(bank_link_id)

Delete a bank link

Permanently delete a bank link defined for an account.

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


api_instance = AtomApi::FundingApi.new

bank_link_id = 'bank_link_id_example' # String | UUID bank_link_id


begin
  #Delete a bank link
  api_instance.delete_bank_link_using_delete(bank_link_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->delete_bank_link_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**String**](.md)| UUID bank_link_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_deposit_using_delete**
> delete_deposit_using_delete(deposit_id)

Delete a deposit request

Permanently delete a deposit request for an account.

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


api_instance = AtomApi::FundingApi.new

deposit_id = 'deposit_id_example' # String | UUID deposit_id


begin
  #Delete a deposit request
  api_instance.delete_deposit_using_delete(deposit_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->delete_deposit_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**String**](.md)| UUID deposit_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_funding_using_delete**
> delete_funding_using_delete(funding_id)

Delete a funding request

Permanently delete a funding request defined for an account.

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


api_instance = AtomApi::FundingApi.new

funding_id = 'funding_id_example' # String | UUID funding_id


begin
  #Delete a funding request
  api_instance.delete_funding_using_delete(funding_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->delete_funding_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**String**](.md)| UUID funding_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_transfer_using_delete**
> delete_transfer_using_delete(transfer, transfer_id)

Delete a transfer request

Permanently delete a external account transfer from a client account.

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


api_instance = AtomApi::FundingApi.new

transfer = 'transfer_example' # String | UUID external_account_transfer_id

transfer_id = 'transfer_id_example' # String | transfer_id


begin
  #Delete a transfer request
  api_instance.delete_transfer_using_delete(transfer, transfer_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->delete_transfer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**String**](.md)| UUID external_account_transfer_id | 
 **transfer_id** | [**String**](.md)| transfer_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **delete_withdrawal_using_delete**
> delete_withdrawal_using_delete(withdrawal_id)

Delete a withdrawal request

Permanently delete a withdrawal request from an account.

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


api_instance = AtomApi::FundingApi.new

withdrawal_id = 'withdrawal_id_example' # String | UUID withdrawal_id


begin
  #Delete a withdrawal request
  api_instance.delete_withdrawal_using_delete(withdrawal_id)
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->delete_withdrawal_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**String**](.md)| UUID withdrawal_id | 

### Return type

nil (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_bank_link_all_using_get**
> PageBankLink get_bank_link_all_using_get(opts)

List all bank links

Get all bank links defined for all clients defined for your firm.

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


api_instance = AtomApi::FundingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all bank links
  result = api_instance.get_bank_link_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_bank_link_all_using_get: #{e}"
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

[**PageBankLink**](PageBankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_bank_link_using_get**
> BankLink get_bank_link_using_get(bank_link_id)

Retrieve a bank link

Retrieve the information for a bank link for an account.

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


api_instance = AtomApi::FundingApi.new

bank_link_id = 'bank_link_id_example' # String | UUID bank_link_id


begin
  #Retrieve a bank link
  result = api_instance.get_bank_link_using_get(bank_link_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_bank_link_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**String**](.md)| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_deposit_all_using_get**
> PageDailyDeposit get_deposit_all_using_get(opts)

List all deposit requests

Get the information for all deposit requests for all clients.

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


api_instance = AtomApi::FundingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all deposit requests
  result = api_instance.get_deposit_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_deposit_all_using_get: #{e}"
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

[**PageDailyDeposit**](PageDailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_deposit_using_get**
> DailyDeposit get_deposit_using_get(deposit_id)

Retrieve a deposit request

Retrieve the information for a deposit request for an account.

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


api_instance = AtomApi::FundingApi.new

deposit_id = 'deposit_id_example' # String | UUID deposit_id


begin
  #Retrieve a deposit request
  result = api_instance.get_deposit_using_get(deposit_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_deposit_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**String**](.md)| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_funding_all_using_get**
> PageFunding get_funding_all_using_get(opts)

List all funding requests 

Get the information for all funding requests defined for your firm.

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


api_instance = AtomApi::FundingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all funding requests 
  result = api_instance.get_funding_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_funding_all_using_get: #{e}"
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

[**PageFunding**](PageFunding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_funding_using_get**
> Funding get_funding_using_get(funding_id)

Retrieve a funding request

Retrieve the information for a funding request for an account.

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


api_instance = AtomApi::FundingApi.new

funding_id = 'funding_id_example' # String | UUID funding_id


begin
  #Retrieve a funding request
  result = api_instance.get_funding_using_get(funding_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_funding_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**String**](.md)| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_transfer_all_using_get**
> PageExternalAccountTransfer get_transfer_all_using_get(opts)

List all transfer requests

Get the information for all external account transfers defined for your firm.

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


api_instance = AtomApi::FundingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all transfer requests
  result = api_instance.get_transfer_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_transfer_all_using_get: #{e}"
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

[**PageExternalAccountTransfer**](PageExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_transfer_using_get**
> ExternalAccountTransfer get_transfer_using_get(external_account_transfer_id, transfer_id)

Retrieve a transfer request

Retrieve the information for a external account transfer for an account.

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


api_instance = AtomApi::FundingApi.new

external_account_transfer_id = 'external_account_transfer_id_example' # String | UUID external_account_transfer_id

transfer_id = 'transfer_id_example' # String | transfer_id


begin
  #Retrieve a transfer request
  result = api_instance.get_transfer_using_get(external_account_transfer_id, transfer_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_id** | [**String**](.md)| UUID external_account_transfer_id | 
 **transfer_id** | [**String**](.md)| transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_withdrawal_all_using_get**
> PageDailyWithdrawal get_withdrawal_all_using_get(opts)

List all withdrawal requests

Get the information for all withdrawal requests for all clients.

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


api_instance = AtomApi::FundingApi.new

opts = { 
  ascending: false, # BOOLEAN | ascending
  filter: 'filter_example', # String | filter
  order_by: 'update_date', # String | order_by
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #List all withdrawal requests
  result = api_instance.get_withdrawal_all_using_get(opts)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_withdrawal_all_using_get: #{e}"
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

[**PageDailyWithdrawal**](PageDailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **get_withdrawal_using_get**
> DailyWithdrawal get_withdrawal_using_get(withdrawal_id)

Retrieve a withdrawal request

Retrieve the information for a withdrawal request for an account.

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


api_instance = AtomApi::FundingApi.new

withdrawal_id = 'withdrawal_id_example' # String | UUID withdrawal_id


begin
  #Retrieve a withdrawal request
  result = api_instance.get_withdrawal_using_get(withdrawal_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->get_withdrawal_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**String**](.md)| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **update_bank_link_bulk_using_put**
> Array&lt;BankLink&gt; update_bank_link_bulk_using_put(bank_link_list)

Update list of bank link

Update bank link list for an account.

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


api_instance = AtomApi::FundingApi.new

bank_link_list = [AtomApi::BankLink.new] # Array<BankLink> | bankLinkList


begin
  #Update list of bank link
  result = api_instance.update_bank_link_bulk_using_put(bank_link_list)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_bank_link_bulk_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_list** | [**Array&lt;BankLink&gt;**](BankLink.md)| bankLinkList | 

### Return type

[**Array&lt;BankLink&gt;**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_bank_link_using_put**
> BankLink update_bank_link_using_put(bank_link, bank_link_id)

Update a bank link

Update the information for a bank link for an account.

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


api_instance = AtomApi::FundingApi.new

bank_link = AtomApi::BankLink.new # BankLink | bank_link

bank_link_id = 'bank_link_id_example' # String | UUID bank_link_id


begin
  #Update a bank link
  result = api_instance.update_bank_link_using_put(bank_link, bank_link_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_bank_link_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link** | [**BankLink**](BankLink.md)| bank_link | 
 **bank_link_id** | [**String**](.md)| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_deposit_using_put**
> DailyDeposit update_deposit_using_put(deposit, deposit_id)

Update a deposit request

Update the information for a deposit request for an account.

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


api_instance = AtomApi::FundingApi.new

deposit = AtomApi::DailyDeposit.new # DailyDeposit | deposit

deposit_id = 'deposit_id_example' # String | UUID deposit_id


begin
  #Update a deposit request
  result = api_instance.update_deposit_using_put(deposit, deposit_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_deposit_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit** | [**DailyDeposit**](DailyDeposit.md)| deposit | 
 **deposit_id** | [**String**](.md)| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_funding_using_put**
> Funding update_funding_using_put(funding, funding_id)

Update a funding request

Update the information for a funding request for an account.

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


api_instance = AtomApi::FundingApi.new

funding = AtomApi::Funding.new # Funding | funding

funding_id = 'funding_id_example' # String | UUID funding_id


begin
  #Update a funding request
  result = api_instance.update_funding_using_put(funding, funding_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_funding_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding** | [**Funding**](Funding.md)| funding | 
 **funding_id** | [**String**](.md)| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_transfer_using_put**
> ExternalAccountTransfer update_transfer_using_put(transfer, transfer_id)

Update a transfer request

Update the information for a external account transfer for a client account. 

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


api_instance = AtomApi::FundingApi.new

transfer = AtomApi::ExternalAccountTransfer.new # ExternalAccountTransfer | transfer

transfer_id = 'transfer_id_example' # String | UUID external_account_transfer_id


begin
  #Update a transfer request
  result = api_instance.update_transfer_using_put(transfer, transfer_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_transfer_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| transfer | 
 **transfer_id** | [**String**](.md)| UUID external_account_transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **update_withdrawal_using_put**
> DailyWithdrawal update_withdrawal_using_put(withdrawal, withdrawal_id)

Update a withdrawal request

Update the information for a withdrawal request for an account.

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


api_instance = AtomApi::FundingApi.new

withdrawal = AtomApi::DailyWithdrawal.new # DailyWithdrawal | withdrawal

withdrawal_id = 'withdrawal_id_example' # String | UUID withdrawal_id


begin
  #Update a withdrawal request
  result = api_instance.update_withdrawal_using_put(withdrawal, withdrawal_id)
  p result
rescue AtomApi::ApiError => e
  puts "Exception when calling FundingApi->update_withdrawal_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal** | [**DailyWithdrawal**](DailyWithdrawal.md)| withdrawal | 
 **withdrawal_id** | [**String**](.md)| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



