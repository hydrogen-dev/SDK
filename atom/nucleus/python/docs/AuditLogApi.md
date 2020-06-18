# nucleus_api.AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_audit_log_using_post**](AuditLogApi.md#create_audit_log_using_post) | **POST** /audit_log | Create a audit log
[**get_audit_log_all_using_get**](AuditLogApi.md#get_audit_log_all_using_get) | **GET** /audit_log | List all audit log
[**get_audit_log_using_get**](AuditLogApi.md#get_audit_log_using_get) | **GET** /audit_log/{audit_log_id} | Retrieve a audit log


# **create_audit_log_using_post**
> AuditLog create_audit_log_using_post(audit_log)

Create a audit log

Create a new audit log.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.AuditLogApi(nucleus_api.ApiClient(configuration))
audit_log = nucleus_api.AuditLog() # AuditLog | auditLog

try:
    # Create a audit log
    api_response = api_instance.create_audit_log_using_post(audit_log)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->create_audit_log_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_log** | [**AuditLog**](AuditLog.md)| auditLog | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_audit_log_all_using_get**
> PageAuditLog get_audit_log_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all audit log

Get details for all audit log.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.AuditLogApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all audit log
    api_response = api_instance.get_audit_log_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->get_audit_log_all_using_get: %s\n" % e)
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

[**PageAuditLog**](PageAuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_audit_log_using_get**
> AuditLog get_audit_log_using_get(audit_log_id)

Retrieve a audit log

Retrieve the information for a audit log.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.AuditLogApi(nucleus_api.ApiClient(configuration))
audit_log_id = 'audit_log_id_example' # str | UUID audit_log_id

try:
    # Retrieve a audit log
    api_response = api_instance.get_audit_log_using_get(audit_log_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->get_audit_log_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audit_log_id** | [**str**](.md)| UUID audit_log_id | 

### Return type

[**AuditLog**](AuditLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

