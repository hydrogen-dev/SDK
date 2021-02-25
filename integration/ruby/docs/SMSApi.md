# IntegrationApi::SMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_sms_status**](SMSApi.md#get_sms_status) | **GET** /sms/status/{sms_id} | Fetch details for corresponding sms_id
[**send_mail**](SMSApi.md#send_mail) | **POST** /sms | Send SMS to recipient


# **get_sms_status**
> SMS get_sms_status(sms_id)

Fetch details for corresponding sms_id

Fetch details for corresponding sms_id

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


api_instance = IntegrationApi::SMSApi.new

sms_id = 'sms_id_example' # String | sms_id


begin
  #Fetch details for corresponding sms_id
  result = api_instance.get_sms_status(sms_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling SMSApi->get_sms_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sms_id** | [**String**](.md)| sms_id | 

### Return type

[**SMS**](SMS.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **send_mail**
> SMSResponseVO send_mail(sms_vo)

Send SMS to recipient

Send SMS to recipient

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


api_instance = IntegrationApi::SMSApi.new

sms_vo = IntegrationApi::SMSVO.new # SMSVO | smsVO


begin
  #Send SMS to recipient
  result = api_instance.send_mail(sms_vo)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling SMSApi->send_mail: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sms_vo** | [**SMSVO**](SMSVO.md)| smsVO | 

### Return type

[**SMSResponseVO**](SMSResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



