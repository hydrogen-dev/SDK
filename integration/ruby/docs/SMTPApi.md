# IntegrationApi::SMTPApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_email_details**](SMTPApi.md#get_email_details) | **GET** /smtp/status/{email_id} | Fetch details for corresponding email_id
[**send_mail1**](SMTPApi.md#send_mail1) | **POST** /smtp | Send Mail to recipient


# **get_email_details**
> Email get_email_details(email_id)

Fetch details for corresponding email_id

Fetch details for corresponding email_id

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


api_instance = IntegrationApi::SMTPApi.new

email_id = 'email_id_example' # String | email_id


begin
  #Fetch details for corresponding email_id
  result = api_instance.get_email_details(email_id)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling SMTPApi->get_email_details: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email_id** | [**String**](.md)| email_id | 

### Return type

[**Email**](Email.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*



# **send_mail1**
> SmtpResponseVO send_mail1(smtp_vo)

Send Mail to recipient

Send Mail to recipient

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


api_instance = IntegrationApi::SMTPApi.new

smtp_vo = IntegrationApi::SmtpVO.new # SmtpVO | smtpVO


begin
  #Send Mail to recipient
  result = api_instance.send_mail1(smtp_vo)
  p result
rescue IntegrationApi::ApiError => e
  puts "Exception when calling SMTPApi->send_mail1: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smtp_vo** | [**SmtpVO**](SmtpVO.md)| smtpVO | 

### Return type

[**SmtpResponseVO**](SmtpResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



