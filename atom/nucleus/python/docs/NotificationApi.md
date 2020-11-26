# nucleus_api.NotificationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_notification_client_using_post**](NotificationApi.md#create_notification_client_using_post) | **POST** /notification_client | Create a Notification Client
[**create_notification_setting_using_post**](NotificationApi.md#create_notification_setting_using_post) | **POST** /notification_setting | Create a Notification Setting
[**create_notification_using_post**](NotificationApi.md#create_notification_using_post) | **POST** /notification | Create a Notification
[**delete_notification_client_using_delete**](NotificationApi.md#delete_notification_client_using_delete) | **DELETE** /notification_client/{notification_client_id} | Delete a Notification Client
[**delete_notification_setting_using_delete**](NotificationApi.md#delete_notification_setting_using_delete) | **DELETE** /notification_setting/{notification_setting_id} | Delete a Notification Setting
[**delete_notification_using_delete**](NotificationApi.md#delete_notification_using_delete) | **DELETE** /notification/{notification_id} | Delete a Notification
[**get_notification_all_using_get**](NotificationApi.md#get_notification_all_using_get) | **GET** /notification | Get All Notifications
[**get_notification_client_all_using_get**](NotificationApi.md#get_notification_client_all_using_get) | **GET** /notification_client | List all Notification Client
[**get_notification_client_using_get**](NotificationApi.md#get_notification_client_using_get) | **GET** /notification_client/{notification_client_id} | Retrieve a Notification Client
[**get_notification_setting_all_using_get**](NotificationApi.md#get_notification_setting_all_using_get) | **GET** /notification_setting | List all Notification Setting
[**get_notification_setting_using_get**](NotificationApi.md#get_notification_setting_using_get) | **GET** /notification_setting/{notification_setting_id} | Retrieve a Notification Setting
[**get_notification_using_get**](NotificationApi.md#get_notification_using_get) | **GET** /notification/{notification_id} | Get a Notification
[**update_notification_client_using_put**](NotificationApi.md#update_notification_client_using_put) | **PUT** /notification_client/{notification_client_id} | Update a Notification Client
[**update_notification_setting_using_put**](NotificationApi.md#update_notification_setting_using_put) | **PUT** /notification_setting/{notification_setting_id} | Update a Notification Setting
[**update_notification_using_put**](NotificationApi.md#update_notification_using_put) | **PUT** /notification/{notification_id} | Update a Notification


# **create_notification_client_using_post**
> NotificationClient create_notification_client_using_post(notification_client)

Create a Notification Client

Create a new Notification Client. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_client = nucleus_api.NotificationClient() # NotificationClient | notificationClient

try:
    # Create a Notification Client
    api_response = api_instance.create_notification_client_using_post(notification_client)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->create_notification_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client** | [**NotificationClient**](NotificationClient.md)| notificationClient | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_notification_setting_using_post**
> NotificationSetting create_notification_setting_using_post(notification_setting)

Create a Notification Setting

Create a new Notification Setting. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_setting = nucleus_api.NotificationSetting() # NotificationSetting | notificationSetting

try:
    # Create a Notification Setting
    api_response = api_instance.create_notification_setting_using_post(notification_setting)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->create_notification_setting_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting** | [**NotificationSetting**](NotificationSetting.md)| notificationSetting | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_notification_using_post**
> Notification create_notification_using_post(notification)

Create a Notification

Create a new Notification. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification = nucleus_api.Notification() # Notification | notification

try:
    # Create a Notification
    api_response = api_instance.create_notification_using_post(notification)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->create_notification_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_notification_client_using_delete**
> delete_notification_client_using_delete(notification_client_id)

Delete a Notification Client

Permanently Delete Notification Client.

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_client_id = 'notification_client_id_example' # str | notification_client_id

try:
    # Delete a Notification Client
    api_instance.delete_notification_client_using_delete(notification_client_id)
except ApiException as e:
    print("Exception when calling NotificationApi->delete_notification_client_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client_id** | [**str**](.md)| notification_client_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_notification_setting_using_delete**
> delete_notification_setting_using_delete(notification_setting_id)

Delete a Notification Setting

Permanently Delete Notification Setting. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_setting_id = 'notification_setting_id_example' # str | notification_setting_id

try:
    # Delete a Notification Setting
    api_instance.delete_notification_setting_using_delete(notification_setting_id)
except ApiException as e:
    print("Exception when calling NotificationApi->delete_notification_setting_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting_id** | [**str**](.md)| notification_setting_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_notification_using_delete**
> delete_notification_using_delete(notification_id)

Delete a Notification

Permanently Delete a Notification. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_id = 'notification_id_example' # str | UUID notification_id

try:
    # Delete a Notification
    api_instance.delete_notification_using_delete(notification_id)
except ApiException as e:
    print("Exception when calling NotificationApi->delete_notification_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | [**str**](.md)| UUID notification_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_all_using_get**
> PageNotification get_notification_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

Get All Notifications

Get All Notification. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get All Notifications
    api_response = api_instance.get_notification_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_all_using_get: %s\n" % e)
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

[**PageNotification**](PageNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_client_all_using_get**
> PageNotificationClient get_notification_client_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Notification Client

List all Notification Client. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Notification Client
    api_response = api_instance.get_notification_client_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_client_all_using_get: %s\n" % e)
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

[**PageNotificationClient**](PageNotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_client_using_get**
> NotificationClient get_notification_client_using_get(notification_client_id)

Retrieve a Notification Client

Retrieve a  Notification Client. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_client_id = 'notification_client_id_example' # str | notification_client_id

try:
    # Retrieve a Notification Client
    api_response = api_instance.get_notification_client_using_get(notification_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_client_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client_id** | [**str**](.md)| notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_setting_all_using_get**
> PageNotificationSetting get_notification_setting_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Notification Setting

List all Notification Setting. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Notification Setting
    api_response = api_instance.get_notification_setting_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_setting_all_using_get: %s\n" % e)
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

[**PageNotificationSetting**](PageNotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_setting_using_get**
> NotificationSetting get_notification_setting_using_get(notification_setting_id)

Retrieve a Notification Setting

Retrieve a  Notification Setting. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_setting_id = 'notification_setting_id_example' # str | notification_setting_id

try:
    # Retrieve a Notification Setting
    api_response = api_instance.get_notification_setting_using_get(notification_setting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_setting_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting_id** | [**str**](.md)| notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_notification_using_get**
> Notification get_notification_using_get(notification_id)

Get a Notification

Get a Notification. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_id = 'notification_id_example' # str | notification_id

try:
    # Get a Notification
    api_response = api_instance.get_notification_using_get(notification_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->get_notification_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_id** | [**str**](.md)| notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_notification_client_using_put**
> NotificationClient update_notification_client_using_put(notification_client, notification_client_id)

Update a Notification Client

Update a  Notification Client. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_client = nucleus_api.NotificationClient() # NotificationClient | notification_client
notification_client_id = 'notification_client_id_example' # str | UUID notification_client_id

try:
    # Update a Notification Client
    api_response = api_instance.update_notification_client_using_put(notification_client, notification_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->update_notification_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_client** | [**NotificationClient**](NotificationClient.md)| notification_client | 
 **notification_client_id** | [**str**](.md)| UUID notification_client_id | 

### Return type

[**NotificationClient**](NotificationClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_notification_setting_using_put**
> NotificationSetting update_notification_setting_using_put(notification_setting, notification_setting_id)

Update a Notification Setting

Update a  Notification Setting. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification_setting = nucleus_api.NotificationSetting() # NotificationSetting | notification_setting
notification_setting_id = 'notification_setting_id_example' # str | UUID notification_setting_id

try:
    # Update a Notification Setting
    api_response = api_instance.update_notification_setting_using_put(notification_setting, notification_setting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->update_notification_setting_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_setting** | [**NotificationSetting**](NotificationSetting.md)| notification_setting | 
 **notification_setting_id** | [**str**](.md)| UUID notification_setting_id | 

### Return type

[**NotificationSetting**](NotificationSetting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_notification_using_put**
> Notification update_notification_using_put(notification, notification_id)

Update a Notification

Update a Notification. 

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
api_instance = nucleus_api.NotificationApi(nucleus_api.ApiClient(configuration))
notification = nucleus_api.Notification() # Notification | notification
notification_id = 'notification_id_example' # str | UUID notification_id

try:
    # Update a Notification
    api_response = api_instance.update_notification_using_put(notification, notification_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NotificationApi->update_notification_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification** | [**Notification**](Notification.md)| notification | 
 **notification_id** | [**str**](.md)| UUID notification_id | 

### Return type

[**Notification**](Notification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

