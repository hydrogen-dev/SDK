# integration_api.SMTPApi

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
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

# create an instance of the API class
api_instance = integration_api.SMTPApi(integration_api.ApiClient(configuration))
email_id = 'email_id_example' # str | email_id

try:
    # Fetch details for corresponding email_id
    api_response = api_instance.get_email_details(email_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMTPApi->get_email_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email_id** | [**str**](.md)| email_id | 

### Return type

[**Email**](Email.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_mail1**
> SmtpResponseVO send_mail1(smtp_vo)

Send Mail to recipient

Send Mail to recipient

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

# create an instance of the API class
api_instance = integration_api.SMTPApi(integration_api.ApiClient(configuration))
smtp_vo = integration_api.SmtpVO() # SmtpVO | smtpVO

try:
    # Send Mail to recipient
    api_response = api_instance.send_mail1(smtp_vo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMTPApi->send_mail1: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

