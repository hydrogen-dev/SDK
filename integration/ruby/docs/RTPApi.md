# IntegrationApi::RTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_rtp_transfer_using_delete**](RTPApi.md#cancel_rtp_transfer_using_delete) | **DELETE** /rtp/{nucleus_funding_id} | Cancel the RTP transfer
[**create_bank_link_using_post2**](RTPApi.md#create_bank_link_using_post2) | **POST** /rtp/bank_link | Create bank link
[**delete_bank_link_using_delete2**](RTPApi.md#delete_bank_link_using_delete2) | **DELETE** /rtp/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_bank_link_using_get2**](RTPApi.md#get_bank_link_using_get2) | **GET** /rtp/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_client_bank_links_using_get1**](RTPApi.md#get_client_bank_links_using_get1) | **GET** /rtp/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_rtp_transfers_using_get**](RTPApi.md#get_list_of_rtp_transfers_using_get) | **GET** /rtp/client/{nucleus_client_id} | Get a list of Rtp transfers
[**get_rtp_transfer_using_get**](RTPApi.md#get_rtp_transfer_using_get) | **GET** /rtp/{nucleus_funding_id} | Get the RTP transfer
[**submit_rtp_transfer_using_post**](RTPApi.md#submit_rtp_transfer_using_post) | **POST** /rtp | Submit a RTP transfer
[**update_bank_link_using_put2**](RTPApi.md#update_bank_link_using_put2) | **PUT** /rtp/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_rtp_transfer_using_delete**
> RtpTransferResponseVO cancel_rtp_transfer_using_delete(nucleus_funding_id)

Cancel the RTP transfer

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

api_instance = IntegrationApi::RTPApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Cancel the RTP transfer
  result = api_instance.cancel_rtp_transfer_using_delete(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->cancel_rtp_transfer_using_delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **create_bank_link_using_post2**
> RtpBankLinkResponseVO create_bank_link_using_post2(request)

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

api_instance = IntegrationApi::RTPApi.new

request = IntegrationApi::RtpBankLinkRequestCO.new # RtpBankLinkRequestCO | request


begin
  #Create bank link
  result = api_instance.create_bank_link_using_post2(request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->create_bank_link_using_post2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**RtpBankLinkRequestCO**](RtpBankLinkRequestCO.md)| request | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **delete_bank_link_using_delete2**
> RtpBankLinkResponseVO delete_bank_link_using_delete2(nucleus_bank_link_id)

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

api_instance = IntegrationApi::RTPApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Delete bank link
  result = api_instance.delete_bank_link_using_delete2(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->delete_bank_link_using_delete2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_bank_link_using_get2**
> RtpBankLinkResponseVO get_bank_link_using_get2(nucleus_bank_link_id)

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

api_instance = IntegrationApi::RTPApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Get bank link
  result = api_instance.get_bank_link_using_get2(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->get_bank_link_using_get2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_client_bank_links_using_get1**
> Array&lt;RtpBankLinkResponseVO&gt; get_client_bank_links_using_get1(nucleus_client_id)

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

api_instance = IntegrationApi::RTPApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get client bank links
  result = api_instance.get_client_bank_links_using_get1(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->get_client_bank_links_using_get1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**Array&lt;RtpBankLinkResponseVO&gt;**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_list_of_rtp_transfers_using_get**
> Array&lt;RtpTransferResponseVO&gt; get_list_of_rtp_transfers_using_get(nucleus_client_id)

Get a list of Rtp transfers

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

api_instance = IntegrationApi::RTPApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id


begin
  #Get a list of Rtp transfers
  result = api_instance.get_list_of_rtp_transfers_using_get(nucleus_client_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->get_list_of_rtp_transfers_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 

### Return type

[**Array&lt;RtpTransferResponseVO&gt;**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_rtp_transfer_using_get**
> RtpTransferResponseVO get_rtp_transfer_using_get(nucleus_funding_id)

Get the RTP transfer

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

api_instance = IntegrationApi::RTPApi.new

nucleus_funding_id = 'nucleus_funding_id_example' # String | nucleus_funding_id


begin
  #Get the RTP transfer
  result = api_instance.get_rtp_transfer_using_get(nucleus_funding_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->get_rtp_transfer_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**String**](.md)| nucleus_funding_id | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **submit_rtp_transfer_using_post**
> RtpTransferResponseVO submit_rtp_transfer_using_post(transfer_request)

Submit a RTP transfer

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

api_instance = IntegrationApi::RTPApi.new

transfer_request = IntegrationApi::RtpTransferRequestCO.new # RtpTransferRequestCO | transferRequest


begin
  #Submit a RTP transfer
  result = api_instance.submit_rtp_transfer_using_post(transfer_request)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->submit_rtp_transfer_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**RtpTransferRequestCO**](RtpTransferRequestCO.md)| transferRequest | 

### Return type

[**RtpTransferResponseVO**](RtpTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **update_bank_link_using_put2**
> RtpBankLinkResponseVO update_bank_link_using_put2(nucleus_bank_link_id)

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

api_instance = IntegrationApi::RTPApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Update bank link
  result = api_instance.update_bank_link_using_put2(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling RTPApi->update_bank_link_using_put2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**RtpBankLinkResponseVO**](RtpBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



