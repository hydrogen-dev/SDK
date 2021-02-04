# integration_api.AsyncApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_async_data**](AsyncApi.md#get_async_data) | **GET** /async/{integration_type}/{service} | Create async transaction for GET endpoints for bulk data
[**get_async_data1**](AsyncApi.md#get_async_data1) | **GET** /async/{integration_type}/{service}/{id} | Create async transaction for GET endpoints for bulk data
[**get_async_data2**](AsyncApi.md#get_async_data2) | **POST** /async/{integration_type}/{service} | Create async transaction for POST endpoints for bulk data
[**get_async_status**](AsyncApi.md#get_async_status) | **GET** /async/status/{id} | Get Status of async transaction created through GET/POST endpoints


# **get_async_data**
> AsyncTransaction get_async_data(id, integration_type, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

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
api_instance = integration_api.AsyncApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | UUID id
integration_type = 'integration_type_example' # str | String integration_type
service = 'service_example' # str | String service

try:
    # Create async transaction for GET endpoints for bulk data
    api_response = api_instance.get_async_data(id, integration_type, service)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AsyncApi->get_async_data: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| UUID id | 
 **integration_type** | **str**| String integration_type | 
 **service** | **str**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_async_data1**
> AsyncTransaction get_async_data1(id, integration_type, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

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
api_instance = integration_api.AsyncApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | UUID id
integration_type = 'integration_type_example' # str | String integration_type
service = 'service_example' # str | String service

try:
    # Create async transaction for GET endpoints for bulk data
    api_response = api_instance.get_async_data1(id, integration_type, service)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AsyncApi->get_async_data1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| UUID id | 
 **integration_type** | **str**| String integration_type | 
 **service** | **str**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_async_data2**
> AsyncTransaction get_async_data2(data, integration_type, service)

Create async transaction for POST endpoints for bulk data

Create async transaction for POST endpoints for bulk data

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
api_instance = integration_api.AsyncApi(integration_api.ApiClient(configuration))
data = integration_api.JsonNode() # JsonNode | data
integration_type = 'integration_type_example' # str | String integration_type
service = 'service_example' # str | String service

try:
    # Create async transaction for POST endpoints for bulk data
    api_response = api_instance.get_async_data2(data, integration_type, service)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AsyncApi->get_async_data2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **integration_type** | **str**| String integration_type | 
 **service** | **str**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_async_status**
> AsyncTransactionVO get_async_status(id)

Get Status of async transaction created through GET/POST endpoints

Get Status of async transaction created through GET/POST endpoints

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
api_instance = integration_api.AsyncApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | UUID Async Transaction Id

try:
    # Get Status of async transaction created through GET/POST endpoints
    api_response = api_instance.get_async_status(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AsyncApi->get_async_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| UUID Async Transaction Id | 

### Return type

[**AsyncTransactionVO**](AsyncTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

