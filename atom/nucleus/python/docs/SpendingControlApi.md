# nucleus_api.SpendingControlApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_spending_control_using_post**](SpendingControlApi.md#create_spending_control_using_post) | **POST** /spending_control | Create a Spending Control
[**delete_spending_control_using_delete**](SpendingControlApi.md#delete_spending_control_using_delete) | **DELETE** /spending_control/{spending_control_id} | Delete a Spending Control
[**get_spending_control_all_using_get**](SpendingControlApi.md#get_spending_control_all_using_get) | **GET** /spending_control | List all Spending Control
[**get_spending_control_using_get**](SpendingControlApi.md#get_spending_control_using_get) | **GET** /spending_control/{spending_control_id} | Retrieve a Spending Control
[**update_spending_control_using_put**](SpendingControlApi.md#update_spending_control_using_put) | **PUT** /spending_control/{spending_control_id} | Update a Spending Control


# **create_spending_control_using_post**
> SpendingControl create_spending_control_using_post(spending_control)

Create a Spending Control

Create a new Spending Control.

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
api_instance = nucleus_api.SpendingControlApi(nucleus_api.ApiClient(configuration))
spending_control = nucleus_api.SpendingControl() # SpendingControl | spendingControl

try:
    # Create a Spending Control
    api_response = api_instance.create_spending_control_using_post(spending_control)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpendingControlApi->create_spending_control_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control** | [**SpendingControl**](SpendingControl.md)| spendingControl | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_spending_control_using_delete**
> delete_spending_control_using_delete(spending_control_id)

Delete a Spending Control

Permanently Delete Spending Control.

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
api_instance = nucleus_api.SpendingControlApi(nucleus_api.ApiClient(configuration))
spending_control_id = 'spending_control_id_example' # str | spending_control_id

try:
    # Delete a Spending Control
    api_instance.delete_spending_control_using_delete(spending_control_id)
except ApiException as e:
    print("Exception when calling SpendingControlApi->delete_spending_control_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control_id** | [**str**](.md)| spending_control_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spending_control_all_using_get**
> PageSpendingControl get_spending_control_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Spending Control

List all Spending Control.

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
api_instance = nucleus_api.SpendingControlApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Spending Control
    api_response = api_instance.get_spending_control_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpendingControlApi->get_spending_control_all_using_get: %s\n" % e)
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

[**PageSpendingControl**](PageSpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_spending_control_using_get**
> SpendingControl get_spending_control_using_get(spending_control_id)

Retrieve a Spending Control

Retrieve a Spending Control. 

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
api_instance = nucleus_api.SpendingControlApi(nucleus_api.ApiClient(configuration))
spending_control_id = 'spending_control_id_example' # str | spending_control_id

try:
    # Retrieve a Spending Control
    api_response = api_instance.get_spending_control_using_get(spending_control_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpendingControlApi->get_spending_control_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control_id** | [**str**](.md)| spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_spending_control_using_put**
> SpendingControl update_spending_control_using_put(spending_control, spending_control_id)

Update a Spending Control

Update a Spending Control. 

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
api_instance = nucleus_api.SpendingControlApi(nucleus_api.ApiClient(configuration))
spending_control = NULL # object | spending_control
spending_control_id = 'spending_control_id_example' # str | UUID spending_control_id

try:
    # Update a Spending Control
    api_response = api_instance.update_spending_control_using_put(spending_control, spending_control_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SpendingControlApi->update_spending_control_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spending_control** | **object**| spending_control | 
 **spending_control_id** | [**str**](.md)| UUID spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

