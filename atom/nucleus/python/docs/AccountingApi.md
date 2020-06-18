# nucleus_api.AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_accounting_using_post**](AccountingApi.md#create_accounting_using_post) | **POST** /accounting | Create an accounting
[**delete_accounting_using_delete**](AccountingApi.md#delete_accounting_using_delete) | **DELETE** /accounting/{accounting_id} | Delete an accounting
[**get_accounting_all_using_get**](AccountingApi.md#get_accounting_all_using_get) | **GET** /accounting | List all accounting
[**get_accounting_using_get**](AccountingApi.md#get_accounting_using_get) | **GET** /accounting/{accounting_id} | Retrieve an accounting
[**update_accounting_using_put**](AccountingApi.md#update_accounting_using_put) | **PUT** /accounting/{accounting_id} | Update an accounting


# **create_accounting_using_post**
> Accounting create_accounting_using_post(accounting)

Create an accounting

Store stats pulled from accounting vendors.

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
api_instance = nucleus_api.AccountingApi(nucleus_api.ApiClient(configuration))
accounting = nucleus_api.Accounting() # Accounting | accounting

try:
    # Create an accounting
    api_response = api_instance.create_accounting_using_post(accounting)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->create_accounting_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_accounting_using_delete**
> delete_accounting_using_delete(accounting_id)

Delete an accounting

Permanently delete an accounting.

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
api_instance = nucleus_api.AccountingApi(nucleus_api.ApiClient(configuration))
accounting_id = 'accounting_id_example' # str | UUID accounting_id

try:
    # Delete an accounting
    api_instance.delete_accounting_using_delete(accounting_id)
except ApiException as e:
    print("Exception when calling AccountingApi->delete_accounting_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_id** | [**str**](.md)| UUID accounting_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_accounting_all_using_get**
> PageAccounting get_accounting_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all accounting

Get information for all accounting for all clients defined for your firm.

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
api_instance = nucleus_api.AccountingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all accounting
    api_response = api_instance.get_accounting_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->get_accounting_all_using_get: %s\n" % e)
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

[**PageAccounting**](PageAccounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_accounting_using_get**
> Accounting get_accounting_using_get(accounting_id)

Retrieve an accounting

Retrieve the information for a specific accounting associated with a client.

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
api_instance = nucleus_api.AccountingApi(nucleus_api.ApiClient(configuration))
accounting_id = 'accounting_id_example' # str | UUID accounting_id

try:
    # Retrieve an accounting
    api_response = api_instance.get_accounting_using_get(accounting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->get_accounting_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting_id** | [**str**](.md)| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_accounting_using_put**
> Accounting update_accounting_using_put(accounting, accounting_id)

Update an accounting

Update the information for an accounting.

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
api_instance = nucleus_api.AccountingApi(nucleus_api.ApiClient(configuration))
accounting = nucleus_api.Accounting() # Accounting | accounting
accounting_id = 'accounting_id_example' # str | UUID accounting_id

try:
    # Update an accounting
    api_response = api_instance.update_accounting_using_put(accounting, accounting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountingApi->update_accounting_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 
 **accounting_id** | [**str**](.md)| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

