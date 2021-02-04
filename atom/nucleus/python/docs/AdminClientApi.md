# nucleus_api.AdminClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_admin_client_using_post**](AdminClientApi.md#create_admin_client_using_post) | **POST** /client | Create an admin client
[**delete_admin_client_using_get**](AdminClientApi.md#delete_admin_client_using_get) | **DELETE** /client/{client_id} | Delete an admin client
[**get_admin_client_using_get**](AdminClientApi.md#get_admin_client_using_get) | **GET** /client/{client_id} | Get an admin client
[**get_all_admin_client_using_get**](AdminClientApi.md#get_all_admin_client_using_get) | **GET** /client | List all admin clients
[**update_admin_client_using_put**](AdminClientApi.md#update_admin_client_using_put) | **PUT** /client/{client_id} | Update an admin client


# **create_admin_client_using_post**
> AdminClient create_admin_client_using_post(client)

Create an admin client

Create an admin client

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
api_instance = nucleus_api.AdminClientApi(nucleus_api.ApiClient(configuration))
client = nucleus_api.AdminClient() # AdminClient | client

try:
    # Create an admin client
    api_response = api_instance.create_admin_client_using_post(client)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminClientApi->create_admin_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_admin_client_using_get**
> delete_admin_client_using_get(client_id)

Delete an admin client

Delete an admin client

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
api_instance = nucleus_api.AdminClientApi(nucleus_api.ApiClient(configuration))
client_id = 789 # int | client_id

try:
    # Delete an admin client
    api_instance.delete_admin_client_using_get(client_id)
except ApiException as e:
    print("Exception when calling AdminClientApi->delete_admin_client_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **int**| client_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_admin_client_using_get**
> AdminClient get_admin_client_using_get(client_id)

Get an admin client

Get an admin client

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
api_instance = nucleus_api.AdminClientApi(nucleus_api.ApiClient(configuration))
client_id = 789 # int | client_id

try:
    # Get an admin client
    api_response = api_instance.get_admin_client_using_get(client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminClientApi->get_admin_client_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | **int**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_admin_client_using_get**
> PageAdminClient get_all_admin_client_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all admin clients

Get a list of all admin clients

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
api_instance = nucleus_api.AdminClientApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'username' # str | order_by (optional) (default to username)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all admin clients
    api_response = api_instance.get_all_admin_client_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminClientApi->get_all_admin_client_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to username]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAdminClient**](PageAdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_admin_client_using_put**
> AdminClient update_admin_client_using_put(client, client_id)

Update an admin client

Update an admin client

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
api_instance = nucleus_api.AdminClientApi(nucleus_api.ApiClient(configuration))
client = nucleus_api.AdminClient() # AdminClient | client
client_id = 789 # int | client_id

try:
    # Update an admin client
    api_response = api_instance.update_admin_client_using_put(client, client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AdminClientApi->update_admin_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 
 **client_id** | **int**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

