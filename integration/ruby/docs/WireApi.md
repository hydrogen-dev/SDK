# IntegrationApi::WireApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_wire_transfer_using_delete**](WireApi.md#cancel_wire_transfer_using_delete) | **DELETE** /wire/{nucleus_funding_id} | Cancel the Wire transfer
[**create_bank_link_using_post3**](WireApi.md#create_bank_link_using_post3) | **POST** /wire/bank_link | Create bank link
[**delete_bank_link_using_delete3**](WireApi.md#delete_bank_link_using_delete3) | **DELETE** /wire/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_bank_link_using_get3**](WireApi.md#get_bank_link_using_get3) | **GET** /wire/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_client_bank_links_using_get2**](WireApi.md#get_client_bank_links_using_get2) | **GET** /wire/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_wire_transfers_using_get**](WireApi.md#get_list_of_wire_transfers_using_get) | **GET** /wire/client/{nucleus_client_id} | Get a list of Wire transfers
[**get_wire_transfer_using_get**](WireApi.md#get_wire_transfer_using_get) | **GET** /wire/{nucleus_funding_id} | Get the Wire transfer
[**submit_wire_transfer_using_post**](WireApi.md#submit_wire_transfer_using_post) | **POST** /wire | Submit a Wire transfer
[**update_bank_link_using_put3**](WireApi.md#update_bank_link_using_put3) | **PUT** /wire/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_wire_transfer_using_delete**
> WireTransferResponseVO cancel_wire_transfer_using_delete(nucleus_funding_id)

Cancel the Wire transfer

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

api_instance = IntegrationApi::WireApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Cancel the Wire transfer
  result = api_instance.cancel_wire_transfer_using_delete(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->cancel_wire_transfer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_bank_link_using_post3**
> WireBankLinkResponseVO create_bank_link_using_post3(request)

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

api_instance = IntegrationApi::WireApi.new

request = IntegrationApi::WireBankLinkRequestCO.new # WireBankLinkRequestCO | request


begin
  #Create bank link
  result = api_instance.create_bank_link_using_post3(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->create_bank_link_using_post3: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**WireBankLinkRequestCO**](WireBankLinkRequestCO.md)| request | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_bank_link_using_delete3**
> WireBankLinkResponseVO delete_bank_link_using_delete3(nucleus_bank_link_id)

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

api_instance = IntegrationApi::WireApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Delete bank link
  result = api_instance.delete_bank_link_using_delete3(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->delete_bank_link_using_delete3: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_bank_link_using_get3**
> WireBankLinkResponseVO get_bank_link_using_get3(nucleus_bank_link_id)

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

api_instance = IntegrationApi::WireApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Get bank link
  result = api_instance.get_bank_link_using_get3(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->get_bank_link_using_get3: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_client_bank_links_using_get2**
> Array&lt;WireBankLinkResponseVO&gt; get_client_bank_links_using_get2(nucleus_client_id)

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

api_instance = IntegrationApi::WireApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get client bank links
  result = api_instance.get_client_bank_links_using_get2(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->get_client_bank_links_using_get2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**Array&lt;WireBankLinkResponseVO&gt;**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_list_of_wire_transfers_using_get**
> Array&lt;WireTransferResponseVO&gt; get_list_of_wire_transfers_using_get(nucleus_client_id)

Get a list of Wire transfers

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

api_instance = IntegrationApi::WireApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get a list of Wire transfers
  result = api_instance.get_list_of_wire_transfers_using_get(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->get_list_of_wire_transfers_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**Array&lt;WireTransferResponseVO&gt;**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_wire_transfer_using_get**
> WireTransferResponseVO get_wire_transfer_using_get(nucleus_funding_id)

Get the Wire transfer

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

api_instance = IntegrationApi::WireApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Get the Wire transfer
  result = api_instance.get_wire_transfer_using_get(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->get_wire_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **submit_wire_transfer_using_post**
> WireTransferResponseVO submit_wire_transfer_using_post(transfer_request)

Submit a Wire transfer

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

api_instance = IntegrationApi::WireApi.new

transfer_request = IntegrationApi::WireTransferRequestCO.new # WireTransferRequestCO | transferRequest


begin
  #Submit a Wire transfer
  result = api_instance.submit_wire_transfer_using_post(transfer_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->submit_wire_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**WireTransferRequestCO**](WireTransferRequestCO.md)| transferRequest | 

### Return type

[**WireTransferResponseVO**](WireTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_bank_link_using_put3**
> WireBankLinkResponseVO update_bank_link_using_put3(nucleus_bank_link_id)

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

api_instance = IntegrationApi::WireApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Update bank link
  result = api_instance.update_bank_link_using_put3(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling WireApi->update_bank_link_using_put3: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**WireBankLinkResponseVO**](WireBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



