# integration_api.IAVApi

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
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.IAVApi(integration_api.ApiClient(configuration))
iav_request_co = integration_api.IavRequestCO() # IavRequestCO | iavRequestCO

try:
    # Instant Account Verification of an account.
    api_response = api_instance.create_iav_using_post(iav_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IAVApi->create_iav_using_post: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_iav_using_get**
> IavResponseVo get_iav_using_get(nucleus_bank_link_id)

Get verified account based on id.

Get verified account based on id.

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
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.IAVApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get verified account based on id.
    api_response = api_instance.get_iav_using_get(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IAVApi->get_iav_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**IavResponseVo**](IavResponseVo.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

