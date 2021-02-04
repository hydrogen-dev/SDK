# nucleus_api.WebhookApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_webhook_using_post**](WebhookApi.md#create_webhook_using_post) | **POST** /webhook | Create a webhook
[**delete_webhook_using_delete**](WebhookApi.md#delete_webhook_using_delete) | **DELETE** /webhook/{webhook_id} | Delete a webhook
[**get_webhook_all_using_get**](WebhookApi.md#get_webhook_all_using_get) | **GET** /webhook | List all webhooks
[**get_webhook_using_get**](WebhookApi.md#get_webhook_using_get) | **GET** /webhook/{webhook_id} | Retrieve a webhook
[**update_webhook_using_put**](WebhookApi.md#update_webhook_using_put) | **PUT** /webhook/{webhook_id} | Update a webhook


# **create_webhook_using_post**
> Webhook create_webhook_using_post(webhook_request)

Create a webhook

One active webhook service is allowed at all times.

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
api_instance = nucleus_api.WebhookApi(nucleus_api.ApiClient(configuration))
webhook_request = nucleus_api.Webhook() # Webhook | webhookRequest

try:
    # Create a webhook
    api_response = api_instance.create_webhook_using_post(webhook_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->create_webhook_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_request** | [**Webhook**](Webhook.md)| webhookRequest | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_webhook_using_delete**
> delete_webhook_using_delete(webhook_id)

Delete a webhook

Permanently delete a webhook for your firm. The webhook_id must be provided.

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
api_instance = nucleus_api.WebhookApi(nucleus_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | UUID webhook_id

try:
    # Delete a webhook
    api_instance.delete_webhook_using_delete(webhook_id)
except ApiException as e:
    print("Exception when calling WebhookApi->delete_webhook_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| UUID webhook_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhook_all_using_get**
> PageWebhook get_webhook_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all webhooks

Get information for all webhooks defined for your firm.

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
api_instance = nucleus_api.WebhookApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all webhooks
    api_response = api_instance.get_webhook_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->get_webhook_all_using_get: %s\n" % e)
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

[**PageWebhook**](PageWebhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhook_using_get**
> Webhook get_webhook_using_get(webhook_id)

Retrieve a webhook

Retrieve the information for a specific webhook. The webhook_id must be provided.

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
api_instance = nucleus_api.WebhookApi(nucleus_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | UUID webhook_id

try:
    # Retrieve a webhook
    api_response = api_instance.get_webhook_using_get(webhook_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->get_webhook_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_webhook_using_put**
> Webhook update_webhook_using_put(webhook, webhook_id)

Update a webhook

Update a webhook for your firm. The webhook_id must be provided

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
api_instance = nucleus_api.WebhookApi(nucleus_api.ApiClient(configuration))
webhook = NULL # object | webhook
webhook_id = 'webhook_id_example' # str | UUID webhook_id

try:
    # Update a webhook
    api_response = api_instance.update_webhook_using_put(webhook, webhook_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WebhookApi->update_webhook_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | **object**| webhook | 
 **webhook_id** | [**str**](.md)| UUID webhook_id | 

### Return type

[**Webhook**](Webhook.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

