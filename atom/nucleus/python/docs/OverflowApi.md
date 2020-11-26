# nucleus_api.OverflowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_overflow_settings_using_post**](OverflowApi.md#create_overflow_settings_using_post) | **POST** /overflow_setting | Create a Overflow Settings request
[**create_overflow_using_post**](OverflowApi.md#create_overflow_using_post) | **POST** /overflow | Create a Overflow request
[**delete_overflow_settings_using_delete**](OverflowApi.md#delete_overflow_settings_using_delete) | **DELETE** /overflow_setting/{overflow_settings_id} | Delete a overflow settings
[**get_overflow_all_using_get**](OverflowApi.md#get_overflow_all_using_get) | **GET** /overflow | List all overflow objects
[**get_overflow_settings_all_using_get**](OverflowApi.md#get_overflow_settings_all_using_get) | **GET** /overflow_setting | List all overflow settings
[**get_overflow_settings_using_get**](OverflowApi.md#get_overflow_settings_using_get) | **GET** /overflow_setting/{overflow_settings_id} | Retrieve a Overflow Setting
[**get_overflow_using_get**](OverflowApi.md#get_overflow_using_get) | **GET** /overflow/{overflow_id} | Retrieve a Overflow object
[**update_overflow_settings_using_put**](OverflowApi.md#update_overflow_settings_using_put) | **PUT** /overflow_setting/{overflow_settings_id} | Update a overflow settings


# **create_overflow_settings_using_post**
> OverflowSettings create_overflow_settings_using_post(overflow_settings)

Create a Overflow Settings request

Create a new Overflow Settings request.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_settings = nucleus_api.OverflowSettings() # OverflowSettings | overflowSettings

try:
    # Create a Overflow Settings request
    api_response = api_instance.create_overflow_settings_using_post(overflow_settings)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->create_overflow_settings_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**OverflowSettings**](OverflowSettings.md)| overflowSettings | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_overflow_using_post**
> Overflow create_overflow_using_post(overflow_vo)

Create a Overflow request

Create a new Overflow request.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_vo = nucleus_api.OverflowVO() # OverflowVO | overflowVO

try:
    # Create a Overflow request
    api_response = api_instance.create_overflow_using_post(overflow_vo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->create_overflow_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_vo** | [**OverflowVO**](OverflowVO.md)| overflowVO | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_overflow_settings_using_delete**
> delete_overflow_settings_using_delete(overflow_settings_id)

Delete a overflow settings

Permanently delete a  overflow settings registered with your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_settings_id = 'overflow_settings_id_example' # str | UUID overflow_settings_id

try:
    # Delete a overflow settings
    api_instance.delete_overflow_settings_using_delete(overflow_settings_id)
except ApiException as e:
    print("Exception when calling OverflowApi->delete_overflow_settings_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**str**](.md)| UUID overflow_settings_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_overflow_all_using_get**
> PageOverflow get_overflow_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all overflow objects

Get details for all overflow.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all overflow objects
    api_response = api_instance.get_overflow_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->get_overflow_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageOverflow**](PageOverflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_overflow_settings_all_using_get**
> PageOverflowSettings get_overflow_settings_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all overflow settings

Get details for all overflow setting.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all overflow settings
    api_response = api_instance.get_overflow_settings_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->get_overflow_settings_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageOverflowSettings**](PageOverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_overflow_settings_using_get**
> OverflowSettings get_overflow_settings_using_get(overflow_settings_id)

Retrieve a Overflow Setting

Retrieve the information for a Overflow Settings.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_settings_id = 'overflow_settings_id_example' # str | UUID overflow_settings_id

try:
    # Retrieve a Overflow Setting
    api_response = api_instance.get_overflow_settings_using_get(overflow_settings_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->get_overflow_settings_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings_id** | [**str**](.md)| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_overflow_using_get**
> Overflow get_overflow_using_get(overflow_id)

Retrieve a Overflow object

Retrieve the information for a Overflow.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_id = 'overflow_id_example' # str | UUID overflow_id

try:
    # Retrieve a Overflow object
    api_response = api_instance.get_overflow_using_get(overflow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->get_overflow_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_id** | [**str**](.md)| UUID overflow_id | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_overflow_settings_using_put**
> OverflowSettings update_overflow_settings_using_put(overflow_settings, overflow_settings_id)

Update a overflow settings

Update the information for a overflow setting registered with your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.OverflowApi(nucleus_api.ApiClient(configuration))
overflow_settings = nucleus_api.OverflowSettings() # OverflowSettings | overflow_settings
overflow_settings_id = 'overflow_settings_id_example' # str | UUID overflow_settings_id

try:
    # Update a overflow settings
    api_response = api_instance.update_overflow_settings_using_put(overflow_settings, overflow_settings_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OverflowApi->update_overflow_settings_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflow_settings** | [**OverflowSettings**](OverflowSettings.md)| overflow_settings | 
 **overflow_settings_id** | [**str**](.md)| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

