# integration_api.AuditLogApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_audit_log_all_using_get**](AuditLogApi.md#get_audit_log_all_using_get) | **GET** /audit_log | Gel all audit log


# **get_audit_log_all_using_get**
> Pageobject get_audit_log_all_using_get(ascending=ascending, end_date=end_date, event=event, integration_type=integration_type, is_request=is_request, nucleus_client_id=nucleus_client_id, order_by=order_by, page=page, request_type=request_type, size=size, start_date=start_date, vendor_name=vendor_name)

Gel all audit log

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
api_instance = integration_api.AuditLogApi(integration_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
end_date = 'null' # datetime | end_date (optional) (default to null)
event = 'event_example' # str | event (optional)
integration_type = 'integration_type_example' # str | integration_type (optional)
is_request = false # bool | is_request (optional) (default to false)
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
request_type = 'request_type_example' # str | request_type (optional)
size = 25 # int | size (optional) (default to 25)
start_date = 'null' # datetime | start_date (optional) (default to null)
vendor_name = 'vendor_name_example' # str | vendor_name (optional)

try:
    # Gel all audit log
    api_response = api_instance.get_audit_log_all_using_get(ascending=ascending, end_date=end_date, event=event, integration_type=integration_type, is_request=is_request, nucleus_client_id=nucleus_client_id, order_by=order_by, page=page, request_type=request_type, size=size, start_date=start_date, vendor_name=vendor_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuditLogApi->get_audit_log_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **datetime**| end_date | [optional] [default to null]
 **event** | **str**| event | [optional] 
 **integration_type** | **str**| integration_type | [optional] 
 **is_request** | **bool**| is_request | [optional] [default to false]
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **request_type** | **str**| request_type | [optional] 
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **datetime**| start_date | [optional] [default to null]
 **vendor_name** | **str**| vendor_name | [optional] 

### Return type

[**Pageobject**](Pageobject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

