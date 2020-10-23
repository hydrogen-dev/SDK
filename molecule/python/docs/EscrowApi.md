# swagger_client.EscrowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_escrow_using_post**](EscrowApi.md#create_escrow_using_post) | **POST** /escrow | Create a new Escrow
[**get_escrow_all_using_get**](EscrowApi.md#get_escrow_all_using_get) | **GET** /escrow | List all Escrow
[**get_escrow_using_get**](EscrowApi.md#get_escrow_using_get) | **GET** /escrow/{escrow_id} | Fetch Escrow


# **create_escrow_using_post**
> EscrowResponse create_escrow_using_post(escrow_params)

Create a new Escrow

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
api_instance = molecule_api.EscrowApi(molecule_api.ApiClient(configuration))
escrow_params = molecule_api.EscrowParams() # EscrowParams | It enables a user to create a escrow

try:
    # Create a new Escrow
    api_response = api_instance.create_escrow_using_post(escrow_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowApi->create_escrow_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_params** | [**EscrowParams**](EscrowParams.md)| It enables a user to create a escrow | 

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_escrow_all_using_get**
> PageEscrowResponse get_escrow_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

List all Escrow

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
api_instance = molecule_api.EscrowApi(molecule_api.ApiClient(configuration))
page = 56 # int | To filter response Escrow list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # List all Escrow
    api_response = api_instance.get_escrow_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowApi->get_escrow_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Escrow list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageEscrowResponse**](PageEscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_escrow_using_get**
> EscrowResponse get_escrow_using_get(escrow_id)

Fetch Escrow

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
api_instance = molecule_api.EscrowApi(molecule_api.ApiClient(configuration))
escrow_id = 'escrow_id_example' # str | Escrow ID

try:
    # Fetch Escrow
    api_response = api_instance.get_escrow_using_get(escrow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowApi->get_escrow_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_id** | [**str**](.md)| Escrow ID | 

### Return type

[**EscrowResponse**](EscrowResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

