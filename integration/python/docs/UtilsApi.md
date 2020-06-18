# integration_api.UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_token_exchange_using_post**](UtilsApi.md#create_token_exchange_using_post) | **POST** /token_exchange | Retrieve token based on certain vendor specific value
[**create_user_using_post**](UtilsApi.md#create_user_using_post) | **POST** /user | Create user in vendor
[**get_widget_link_using_get**](UtilsApi.md#get_widget_link_using_get) | **GET** /widget_link/{nucleus_client_id} | Retrieve widget link


# **create_token_exchange_using_post**
> ExchangePublicTokenVO create_token_exchange_using_post(exchange_token_co)

Retrieve token based on certain vendor specific value

Retrieve the token.

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.UtilsApi(integration_api.ApiClient(configuration))
exchange_token_co = integration_api.ExchangeTokenCO() # ExchangeTokenCO | exchangeTokenCO

try:
    # Retrieve token based on certain vendor specific value
    api_response = api_instance.create_token_exchange_using_post(exchange_token_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_token_exchange_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange_token_co** | [**ExchangeTokenCO**](ExchangeTokenCO.md)| exchangeTokenCO | 

### Return type

[**ExchangePublicTokenVO**](ExchangePublicTokenVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_user_using_post**
> UserResponseVO create_user_using_post(create_user_request)

Create user in vendor

Create user in vendor.

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.UtilsApi(integration_api.ApiClient(configuration))
create_user_request = integration_api.CreateUserRequest() # CreateUserRequest | createUserRequest

try:
    # Create user in vendor
    api_response = api_instance.create_user_using_post(create_user_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_user_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_user_request** | [**CreateUserRequest**](CreateUserRequest.md)| createUserRequest | 

### Return type

[**UserResponseVO**](UserResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_widget_link_using_get**
> WidgetUrlVO get_widget_link_using_get(nucleus_client_id, is_mobile_webview=is_mobile_webview, mode=mode, vendor_name=vendor_name)

Retrieve widget link

Retrieve the widget link.

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.UtilsApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id
is_mobile_webview = false # bool | is_mobile_webview (optional) (default to false)
mode = 'aggregation' # str | mode (optional) (default to aggregation)
vendor_name = 'vendor_name_example' # str | vendor_name (optional)

try:
    # Retrieve widget link
    api_response = api_instance.get_widget_link_using_get(nucleus_client_id, is_mobile_webview=is_mobile_webview, mode=mode, vendor_name=vendor_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_widget_link_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 
 **is_mobile_webview** | **bool**| is_mobile_webview | [optional] [default to false]
 **mode** | **str**| mode | [optional] [default to aggregation]
 **vendor_name** | **str**| vendor_name | [optional] 

### Return type

[**WidgetUrlVO**](WidgetUrlVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

