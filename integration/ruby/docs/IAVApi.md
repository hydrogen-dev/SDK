# IntegrationApi::IAVApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_iav_using_post**](IAVApi.md#create_iav_using_post) | **POST** /iav | Instant Account Verification of an account.
[**get_iav_using_get**](IAVApi.md#get_iav_using_get) | **GET** /iav/{nucleus_bank_link_id} | Get verified account based on id.


# **create_iav_using_post**
> IavResponseVo create_iav_using_post(iav_request_co)

Instant Account Verification of an account.

Endpoint is used to verify account.

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
end


api_instance = IntegrationApi::IAVApi.new

iav_request_co = IntegrationApi::IavRequestCO.new # IavRequestCO | iavRequestCO


begin
  #Instant Account Verification of an account.
  result = api_instance.create_iav_using_post(iav_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling IAVApi->create_iav_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iav_request_co** | [**IavRequestCO**](IavRequestCO.md)| iavRequestCO | 

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **get_iav_using_get**
> IavResponseVo get_iav_using_get(nucleus_bank_link_id)

Get verified account based on id.

Get verified account based on id.

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
end


api_instance = IntegrationApi::IAVApi.new

nucleus_bank_link_id = 'nucleus_bank_link_id_example' # String | nucleus_bank_link_id


begin
  #Get verified account based on id.
  result = api_instance.get_iav_using_get(nucleus_bank_link_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling IAVApi->get_iav_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



