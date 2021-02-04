# IntegrationApi::ACHApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_ach_transfer_using_delete**](ACHApi.md#cancel_ach_transfer_using_delete) | **DELETE** /ach/{nucleus_funding_id} | Cancel the ACH transfer
[**create_ach_card_link_using_post**](ACHApi.md#create_ach_card_link_using_post) | **POST** /ach/card_link | Create an ACH card link
[**create_bank_link_using_post**](ACHApi.md#create_bank_link_using_post) | **POST** /ach/bank_link | Create bank link
[**create_business_using_post**](ACHApi.md#create_business_using_post) | **POST** /ach/business | Create a business
[**create_client_using_post**](ACHApi.md#create_client_using_post) | **POST** /ach/client | Create a client
[**delete_bank_link_using_delete**](ACHApi.md#delete_bank_link_using_delete) | **DELETE** /ach/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_ach_transfer_using_get**](ACHApi.md#get_ach_transfer_using_get) | **GET** /ach/{nucleus_funding_id} | Get the ACH transfer
[**get_balance_using_get**](ACHApi.md#get_balance_using_get) | **GET** /ach/balance/{portfolio_id} | Get balance
[**get_bank_link_using_get**](ACHApi.md#get_bank_link_using_get) | **GET** /ach/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_bank_links_for_reserve_account_using_get**](ACHApi.md#get_bank_links_for_reserve_account_using_get) | **GET** /ach/bank_link/reserve | Get bank links for a reserve account
[**get_client_bank_links_using_get**](ACHApi.md#get_client_bank_links_using_get) | **GET** /ach/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_client_ach_transfers_using_get**](ACHApi.md#get_list_of_client_ach_transfers_using_get) | **GET** /ach/client/{nucleus_client_id} | Get a list of client&#39;s ACH transfers
[**get_list_of_tenant_ach_transfers_using_get**](ACHApi.md#get_list_of_tenant_ach_transfers_using_get) | **GET** /ach | Get a list of tenant&#39;s ACH transfers
[**submit_ach_transfer_using_post**](ACHApi.md#submit_ach_transfer_using_post) | **POST** /ach | Submit an ACH transfer
[**update_bank_link_using_put**](ACHApi.md#update_bank_link_using_put) | **PUT** /ach/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_ach_transfer_using_delete**
> AchTransferResponseVO cancel_ach_transfer_using_delete(nucleus_funding_id)

Cancel the ACH transfer

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

api_instance = IntegrationApi::ACHApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Cancel the ACH transfer
  result = api_instance.cancel_ach_transfer_using_delete(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->cancel_ach_transfer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_ach_card_link_using_post**
> AchCardLinkResponseVO create_ach_card_link_using_post(card_link_request_co)

Create an ACH card link

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

api_instance = IntegrationApi::ACHApi.new

card_link_request_co = IntegrationApi::AchCardLinkRequestCO.new # AchCardLinkRequestCO | cardLinkRequestCO


begin
  #Create an ACH card link
  result = api_instance.create_ach_card_link_using_post(card_link_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->create_ach_card_link_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_link_request_co** | [**AchCardLinkRequestCO**](AchCardLinkRequestCO.md)| cardLinkRequestCO | 

### Return type

[**AchCardLinkResponseVO**](AchCardLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_bank_link_using_post**
> AchBankLinkResponseVO create_bank_link_using_post(ach_bank_link_request_co)

Create bank link

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

api_instance = IntegrationApi::ACHApi.new

ach_bank_link_request_co = IntegrationApi::AchBankLinkRequestCO.new # AchBankLinkRequestCO | achBankLinkRequestCO


begin
  #Create bank link
  result = api_instance.create_bank_link_using_post(ach_bank_link_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->create_bank_link_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ach_bank_link_request_co** | [**AchBankLinkRequestCO**](AchBankLinkRequestCO.md)| achBankLinkRequestCO | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_business_using_post**
> BaseResponseVO create_business_using_post(business_request)

Create a business

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

api_instance = IntegrationApi::ACHApi.new

business_request = IntegrationApi::AchBusinessRequestCO.new # AchBusinessRequestCO | businessRequest


begin
  #Create a business
  result = api_instance.create_business_using_post(business_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->create_business_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**AchBusinessRequestCO**](AchBusinessRequestCO.md)| businessRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **create_client_using_post**
> AchClientResponseVO create_client_using_post(client_request)

Create a client

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

api_instance = IntegrationApi::ACHApi.new

client_request = IntegrationApi::AchClientRequestCO.new # AchClientRequestCO | clientRequest


begin
  #Create a client
  result = api_instance.create_client_using_post(client_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->create_client_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_request** | [**AchClientRequestCO**](AchClientRequestCO.md)| clientRequest | 

### Return type

[**AchClientResponseVO**](AchClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_bank_link_using_delete**
> AchBankLinkResponseVO delete_bank_link_using_delete(nucleus_bank_link_id)

Delete bank link

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

api_instance = IntegrationApi::ACHApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Delete bank link
  result = api_instance.delete_bank_link_using_delete(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->delete_bank_link_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_ach_transfer_using_get**
> AchTransferResponseVO get_ach_transfer_using_get(nucleus_funding_id)

Get the ACH transfer

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

api_instance = IntegrationApi::ACHApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Get the ACH transfer
  result = api_instance.get_ach_transfer_using_get(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_ach_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_balance_using_get**
> AchBalanceResponseVO get_balance_using_get(portfolio_id, opts)

Get balance

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

api_instance = IntegrationApi::ACHApi.new

portfolio_id = 'portfolio_id_example' # String | portfolio_id

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  start_date: Date.parse('2013-10-20') # Date | start_date
}

begin
  #Get balance
  result = api_instance.get_balance_using_get(portfolio_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_balance_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**String**](.md)| portfolio_id | 
 **end_date** | **Date**| end_date | [optional] 
 **start_date** | **Date**| start_date | [optional] 

### Return type

[**AchBalanceResponseVO**](AchBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_bank_link_using_get**
> AchBankLinkResponseVO get_bank_link_using_get(nucleus_bank_link_id)

Get bank link

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

api_instance = IntegrationApi::ACHApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Get bank link
  result = api_instance.get_bank_link_using_get(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_bank_link_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_bank_links_for_reserve_account_using_get**
> Array&lt;AchBankLinkResponseVO&gt; get_bank_links_for_reserve_account_using_get

Get bank links for a reserve account

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

api_instance = IntegrationApi::ACHApi.new

begin
  #Get bank links for a reserve account
  result = api_instance.get_bank_links_for_reserve_account_using_get
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_bank_links_for_reserve_account_using_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;AchBankLinkResponseVO&gt;**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_client_bank_links_using_get**
> Array&lt;AchBankLinkResponseVO&gt; get_client_bank_links_using_get(nucleus_client_id)

Get client bank links

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

api_instance = IntegrationApi::ACHApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get client bank links
  result = api_instance.get_client_bank_links_using_get(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_client_bank_links_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**Array&lt;AchBankLinkResponseVO&gt;**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_list_of_client_ach_transfers_using_get**
> PageAchTransferResponseVO get_list_of_client_ach_transfers_using_get(nucleus_client_id, opts)

Get a list of client's ACH transfers

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

api_instance = IntegrationApi::ACHApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id

opts = { 
  page: 0, # Integer | page
  size: 25 # Integer | size
}

begin
  #Get a list of client's ACH transfers
  result = api_instance.get_list_of_client_ach_transfers_using_get(nucleus_client_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_list_of_client_ach_transfers_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_list_of_tenant_ach_transfers_using_get**
> PageAchTransferResponseVO get_list_of_tenant_ach_transfers_using_get(opts)

Get a list of tenant's ACH transfers

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

api_instance = IntegrationApi::ACHApi.new

opts = { 
  end_date: Date.parse('2013-10-20'), # Date | end_date
  page: 0, # Integer | page
  size: 25, # Integer | size
  start_date: Date.parse('2013-10-20'), # Date | start_date
  status: 'status_example' # String | status
}

begin
  #Get a list of tenant's ACH transfers
  result = api_instance.get_list_of_tenant_ach_transfers_using_get(opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->get_list_of_tenant_ach_transfers_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **Date**| end_date | [optional] 
 **page** | **Integer**| page | [optional] [default to 0]
 **size** | **Integer**| size | [optional] [default to 25]
 **start_date** | **Date**| start_date | [optional] 
 **status** | **String**| status | [optional] 

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **submit_ach_transfer_using_post**
> AchTransferResponseVO submit_ach_transfer_using_post(transfer_request)

Submit an ACH transfer

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

api_instance = IntegrationApi::ACHApi.new

transfer_request = IntegrationApi::AchTransferRequestCO.new # AchTransferRequestCO | transferRequest


begin
  #Submit an ACH transfer
  result = api_instance.submit_ach_transfer_using_post(transfer_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->submit_ach_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**AchTransferRequestCO**](AchTransferRequestCO.md)| transferRequest | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_bank_link_using_put**
> AchBankLinkResponseVO update_bank_link_using_put(nucleus_bank_link_id)

Update bank link

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

api_instance = IntegrationApi::ACHApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Update bank link
  result = api_instance.update_bank_link_using_put(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling ACHApi->update_bank_link_using_put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



