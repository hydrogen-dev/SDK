# IntegrationApi::KYCApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_kyc_using_post**](KYCApi.md#create_kyc_using_post) | **POST** /kyc | Do kyc for the client.
[**get_kyc_status_using_get**](KYCApi.md#get_kyc_status_using_get) | **GET** /kyc_status/{nucleus_client_id} | Fetch kyc_status for the given nucleus_client_id


# **create_kyc_using_post**
> KycResponseVo create_kyc_using_post(kyc_request_co)

Do kyc for the client.

Do kyc for the client.

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


api_instance = IntegrationApi::KYCApi.new

kyc_request_co = IntegrationApi::KycRequestCO.new # KycRequestCO | kycRequestCO


begin
  #Do kyc for the client.
  result = api_instance.create_kyc_using_post(kyc_request_co)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KYCApi->create_kyc_using_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kyc_request_co** | [**KycRequestCO**](KycRequestCO.md)| kycRequestCO | 

### Return type

[**KycResponseVo**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*



# **get_kyc_status_using_get**
> Array&lt;KycResponseVo&gt; get_kyc_status_using_get(nucleus_client_id, opts)

Fetch kyc_status for the given nucleus_client_id

Fetch kyc_status for the given nucleus_client_id

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


api_instance = IntegrationApi::KYCApi.new

nucleus_client_id = 'nucleus_client_id_example' # String | nucleus_client_id

opts = { 
  get_latest: false, # BOOLEAN | get_latest
  kyc_type: 'all', # String | kyc_type
  product: 'atom' # String | product
}

begin
  #Fetch kyc_status for the given nucleus_client_id
  result = api_instance.get_kyc_status_using_get(nucleus_client_id, opts)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling KYCApi->get_kyc_status_using_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**String**](.md)| nucleus_client_id | 
 **get_latest** | **BOOLEAN**| get_latest | [optional] [default to false]
 **kyc_type** | **String**| kyc_type | [optional] [default to all]
 **product** | **String**| product | [optional] [default to atom]

### Return type

[**Array&lt;KycResponseVo&gt;**](KycResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



