# swagger_client.WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_webhook_using_post**](WebhookApi.md#create_webhook_using_post) | **POST** /webhook | Creates a new Webhook record
[**delete_webhook_using_delete**](WebhookApi.md#delete_webhook_using_delete) | **DELETE** /webhook/{webhook_id} | Delete Webhook
[**get_webhook_all_using_get**](WebhookApi.md#get_webhook_all_using_get) | **GET** /webhook | Fetch Webhook list
[**get_webhook_using_get**](WebhookApi.md#get_webhook_using_get) | **GET** /webhook/{webhook_id} | Fetch Webhook details
[**update_webhook_using_put**](WebhookApi.md#update_webhook_using_put) | **PUT** /webhook/{webhook_id} | Update Webhook details


# **create_webhook_using_post**
> WebhookResponse create_webhook_using_post(webhook_params)

Creates a new Webhook record

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.WebhookApi(molecule_api.ApiClient(configuration))
webhook_params = molecule_api.WebhookParams() # WebhookParams | It enables a user to create a Webhook record

try:
    # Creates a new Webhook record
    api_response = api_instance.create_webhook_using_post(webhook_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->create_webhook_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_params** | [**WebhookParams**](WebhookParams.md)| It enables a user to create a Webhook record | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_webhook_using_delete**
> delete_webhook_using_delete(webhook_id)

Delete Webhook

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.WebhookApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | Webhook ID

try:
    # Delete Webhook
    api_instance.delete_webhook_using_delete(webhook_id)
except ApiException as e:
    print("Exception when calling WebhookApi->delete_webhook_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| Webhook ID | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhook_all_using_get**
> PageWebhookResponse get_webhook_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Webhook list

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.WebhookApi(molecule_api.ApiClient(configuration))
page = 56 # int | To filter response webhook list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Webhook list
    api_response = api_instance.get_webhook_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->get_webhook_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response webhook list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageWebhookResponse**](PageWebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhook_using_get**
> WebhookResponse get_webhook_using_get(webhook_id)

Fetch Webhook details

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.WebhookApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | Webhook ID

try:
    # Fetch Webhook details
    api_response = api_instance.get_webhook_using_get(webhook_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->get_webhook_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| Webhook ID | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_webhook_using_put**
> WebhookResponse update_webhook_using_put(webhook_id, webhook_update_params)

Update Webhook details

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = molecule_api.Configuration()

# create an instance of the API class
api_instance = molecule_api.AuthApi(molecule_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.WebhookApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | Webhook ID
webhook_update_params = molecule_api.WebhookParams() # WebhookParams | Webhook details to be updated

try:
    # Update Webhook details
    api_response = api_instance.update_webhook_using_put(webhook_id, webhook_update_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->update_webhook_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| Webhook ID | 
 **webhook_update_params** | [**WebhookParams**](WebhookParams.md)| Webhook details to be updated | 

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

