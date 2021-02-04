# nucleus_api.ApplicationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_application_using_post**](ApplicationApi.md#create_application_using_post) | **POST** /application | Create an application
[**delete_application_using_delete**](ApplicationApi.md#delete_application_using_delete) | **DELETE** /application/{application_id} | Delete an Application
[**get_application_all_using_get**](ApplicationApi.md#get_application_all_using_get) | **GET** /application | List all Application
[**get_application_using_get**](ApplicationApi.md#get_application_using_get) | **GET** /application/{application_id} | Retrieve an Application
[**update_application_using_put**](ApplicationApi.md#update_application_using_put) | **PUT** /application/{application_id} | Update an Application


# **create_application_using_post**
> Application create_application_using_post(application)

Create an application

Create an application

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


# create an instance of the API class
api_instance = nucleus_api.ApplicationApi(nucleus_api.ApiClient(configuration))
application = nucleus_api.Application() # Application | application

try:
    # Create an application
    api_response = api_instance.create_application_using_post(application)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationApi->create_application_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_application_using_delete**
> delete_application_using_delete(application_id)

Delete an Application

Permanently delete an Application.

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


# create an instance of the API class
api_instance = nucleus_api.ApplicationApi(nucleus_api.ApiClient(configuration))
application_id = 'application_id_example' # str | UUID application_id

try:
    # Delete an Application
    api_instance.delete_application_using_delete(application_id)
except ApiException as e:
    print("Exception when calling ApplicationApi->delete_application_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | [**str**](.md)| UUID application_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_application_all_using_get**
> PageApplication get_application_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Application

Get details for all Application.

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


# create an instance of the API class
api_instance = nucleus_api.ApplicationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Application
    api_response = api_instance.get_application_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationApi->get_application_all_using_get: %s\n" % e)
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

[**PageApplication**](PageApplication.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_application_using_get**
> Application get_application_using_get(application_id)

Retrieve an Application

Retrieve the information for an Application.

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


# create an instance of the API class
api_instance = nucleus_api.ApplicationApi(nucleus_api.ApiClient(configuration))
application_id = 'application_id_example' # str | UUID application_id

try:
    # Retrieve an Application
    api_response = api_instance.get_application_using_get(application_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationApi->get_application_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | [**str**](.md)| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_application_using_put**
> Application update_application_using_put(application, application_id)

Update an Application

Update the information for an Application

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


# create an instance of the API class
api_instance = nucleus_api.ApplicationApi(nucleus_api.ApiClient(configuration))
application = NULL # object | application
application_id = 'application_id_example' # str | UUID application_id

try:
    # Update an Application
    api_response = api_instance.update_application_using_put(application, application_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ApplicationApi->update_application_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **object**| application | 
 **application_id** | [**str**](.md)| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

