# atom_api.BulkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bulk_using_post**](BulkApi.md#create_bulk_using_post) | **POST** /bulk/{entity_uri} | Create a bulk data
[**delete_bulk_using_delete**](BulkApi.md#delete_bulk_using_delete) | **DELETE** /bulk/{entity_uri} | Delete a bulk data
[**get_bulk_status_using_get**](BulkApi.md#get_bulk_status_using_get) | **GET** /bulk/status/{id} | Status of bulk transaction
[**update_bulk_using_put**](BulkApi.md#update_bulk_using_put) | **PUT** /bulk/{entity_uri} | Update a bulk data


# **create_bulk_using_post**
> BulkTransaction create_bulk_using_post(data, entity_uri)

Create a bulk data

Create a new bulk data for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BulkApi(atom_api.ApiClient(configuration))
data = atom_api.JsonNode() # JsonNode | data
entity_uri = 'entity_uri_example' # str | UUID entity_uri

try:
    # Create a bulk data
    api_response = api_instance.create_bulk_using_post(data, entity_uri)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BulkApi->create_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**str**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bulk_using_delete**
> BulkTransaction delete_bulk_using_delete(data, entity_uri)

Delete a bulk data

Delete a bulk data for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BulkApi(atom_api.ApiClient(configuration))
data = atom_api.JsonNode() # JsonNode | data
entity_uri = 'entity_uri_example' # str | UUID entity_uri

try:
    # Delete a bulk data
    api_response = api_instance.delete_bulk_using_delete(data, entity_uri)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BulkApi->delete_bulk_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**str**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulk_status_using_get**
> BulkTransactionVO get_bulk_status_using_get(id)

Status of bulk transaction

Get the status of bulk transaction.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BulkApi(atom_api.ApiClient(configuration))
id = 'id_example' # str | UUID Bulk Transaction Id

try:
    # Status of bulk transaction
    api_response = api_instance.get_bulk_status_using_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BulkApi->get_bulk_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| UUID Bulk Transaction Id | 

### Return type

[**BulkTransactionVO**](BulkTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bulk_using_put**
> BulkTransaction update_bulk_using_put(data, entity_uri)

Update a bulk data

Update a bulk data for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.BulkApi(atom_api.ApiClient(configuration))
data = atom_api.JsonNode() # JsonNode | data
entity_uri = 'entity_uri_example' # str | UUID entity_uri

try:
    # Update a bulk data
    api_response = api_instance.update_bulk_using_put(data, entity_uri)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BulkApi->update_bulk_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entity_uri** | [**str**](.md)| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

