# integration_api.KMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_kms_using_post**](KMSApi.md#create_kms_using_post) | **POST** /kms | Create an secret key
[**delete_kms_using_delete**](KMSApi.md#delete_kms_using_delete) | **DELETE** /kms/{kms_id} | Delete an secret key value
[**get_kms_all_using_get**](KMSApi.md#get_kms_all_using_get) | **GET** /kms | List all KMS Clients
[**get_kms_using_get**](KMSApi.md#get_kms_using_get) | **GET** /kms/{kms_id} | Retrieve an secret key value
[**update_kms_using_put**](KMSApi.md#update_kms_using_put) | **PUT** /kms/{kms_id} | Update an Key Value


# **create_kms_using_post**
> KmsConfig create_kms_using_post(kms_config)

Create an secret key

Create an secret key.

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KMSApi(integration_api.ApiClient(configuration))
kms_config = integration_api.KmsConfig() # KmsConfig | kmsConfig

try:
    # Create an secret key
    api_response = api_instance.create_kms_using_post(kms_config)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KMSApi->create_kms_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_kms_using_delete**
> delete_kms_using_delete(kms_id)

Delete an secret key value

Permanently delete an secret key value under a tenant.

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KMSApi(integration_api.ApiClient(configuration))
kms_id = 'kms_id_example' # str | KMS Id

try:
    # Delete an secret key value
    api_instance.delete_kms_using_delete(kms_id)
except ApiException as e:
    print("Exception when calling KMSApi->delete_kms_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**str**](.md)| KMS Id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_kms_all_using_get**
> PageKmsConfig get_kms_all_using_get(ascending=ascending, order_by=order_by, page=page, size=size)

List all KMS Clients

Get details for all clients registered with your firm.

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KMSApi(integration_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all KMS Clients
    api_response = api_instance.get_kms_all_using_get(ascending=ascending, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KMSApi->get_kms_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageKmsConfig**](PageKmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_kms_using_get**
> KmsConfig get_kms_using_get(kms_id)

Retrieve an secret key value

Retrieve the information for a specific value associated with a Secret key.

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KMSApi(integration_api.ApiClient(configuration))
kms_id = 'kms_id_example' # str | KMS Id

try:
    # Retrieve an secret key value
    api_response = api_instance.get_kms_using_get(kms_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KMSApi->get_kms_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_id** | [**str**](.md)| KMS Id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_kms_using_put**
> KmsConfig update_kms_using_put(kms_config, kms_id)

Update an Key Value

Update the information for an key value.

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.KMSApi(integration_api.ApiClient(configuration))
kms_config = integration_api.KmsConfig() # KmsConfig | kmsConfig
kms_id = 'kms_id_example' # str | kms_id

try:
    # Update an Key Value
    api_response = api_instance.update_kms_using_put(kms_config, kms_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling KMSApi->update_kms_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kms_config** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 
 **kms_id** | [**str**](.md)| kms_id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

