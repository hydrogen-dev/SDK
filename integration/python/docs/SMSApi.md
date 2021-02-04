# integration_api.SMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_vendor_call_limit**](SMSApi.md#get_vendor_call_limit) | **GET** /sms/status/{sms_id} | Fetch details for corresponding sms_id
[**send_mail**](SMSApi.md#send_mail) | **POST** /sms | Send SMS to recipient


# **get_vendor_call_limit**
> SMS get_vendor_call_limit(sms_id)

Fetch details for corresponding sms_id

Fetch details for corresponding sms_id

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
api_instance = integration_api.SMSApi(integration_api.ApiClient(configuration))
sms_id = 'sms_id_example' # str | sms_id

try:
    # Fetch details for corresponding sms_id
    api_response = api_instance.get_vendor_call_limit(sms_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->get_vendor_call_limit: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sms_id** | [**str**](.md)| sms_id | 

### Return type

[**SMS**](SMS.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_mail**
> SMSResponseVO send_mail(sms_vo)

Send SMS to recipient

Send SMS to recipient

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
api_instance = integration_api.SMSApi(integration_api.ApiClient(configuration))
sms_vo = integration_api.SMSVO() # SMSVO | smsVO

try:
    # Send SMS to recipient
    api_response = api_instance.send_mail(sms_vo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SMSApi->send_mail: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

