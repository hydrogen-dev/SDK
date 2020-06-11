# atom_api.ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_country_using_get**](ResourceApi.md#get_all_country_using_get) | **GET** /resource/country | Get All Countries
[**get_all_currency_using_get**](ResourceApi.md#get_all_currency_using_get) | **GET** /resource/currency | Get All Currencies
[**get_all_states_using_get**](ResourceApi.md#get_all_states_using_get) | **GET** /resource/state | List all state resource
[**get_all_statistics_using_get**](ResourceApi.md#get_all_statistics_using_get) | **GET** /resource/statistic | List all statistic resource


# **get_all_country_using_get**
> list[Country] get_all_country_using_get()

Get All Countries

Get All Countries. 

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.ResourceApi(atom_api.ApiClient(configuration))

try:
    # Get All Countries
    api_response = api_instance.get_all_country_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_country_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Country]**](Country.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_currency_using_get**
> list[Currency] get_all_currency_using_get()

Get All Currencies

Get All Currencies. 

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.ResourceApi(atom_api.ApiClient(configuration))

try:
    # Get All Currencies
    api_response = api_instance.get_all_currency_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_currency_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Currency]**](Currency.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_states_using_get**
> list[State] get_all_states_using_get(country_code=country_code)

List all state resource

Get the information for all possible state resource.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.ResourceApi(atom_api.ApiClient(configuration))
country_code = 'US' # str | country_code (optional) (default to US)

try:
    # List all state resource
    api_response = api_instance.get_all_states_using_get(country_code=country_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_states_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country_code** | **str**| country_code | [optional] [default to US]

### Return type

[**list[State]**](State.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_statistics_using_get**
> dict(str, list[StatisticResourceVO]) get_all_statistics_using_get()

List all statistic resource

Get the information for all possible statistic resource.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.ResourceApi(atom_api.ApiClient(configuration))

try:
    # List all statistic resource
    api_response = api_instance.get_all_statistics_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_statistics_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**dict(str, list[StatisticResourceVO])**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

