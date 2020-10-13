# swagger_client.TokenSupplyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_token_supply_all_using_get**](TokenSupplyApi.md#get_token_supply_all_using_get) | **GET** /token_supply | Fetch Token Supply record list
[**get_token_supply_using_get**](TokenSupplyApi.md#get_token_supply_using_get) | **GET** /token_supply/{token_supply_id} | Fetch Token Supply details


# **get_token_supply_all_using_get**
> PageTokenSupplyResponse get_token_supply_all_using_get(token_id=token_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Token Supply record list

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
api_instance = molecule_api.TokenSupplyApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | To filter response Token Supply list by Token ID (optional)
page = 56 # int | To filter response Token Supply list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Token Supply record list
    api_response = api_instance.get_token_supply_all_using_get(token_id=token_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenSupplyApi->get_token_supply_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| To filter response Token Supply list by Token ID | [optional] 
 **page** | **int**| To filter response Token Supply list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenSupplyResponse**](PageTokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_supply_using_get**
> TokenSupplyResponse get_token_supply_using_get(token_supply_id)

Fetch Token Supply details

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
api_instance = molecule_api.TokenSupplyApi(molecule_api.ApiClient(configuration))
token_supply_id = 'token_supply_id_example' # str | Token Supply ID

try:
    # Fetch Token Supply details
    api_response = api_instance.get_token_supply_using_get(token_supply_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenSupplyApi->get_token_supply_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_supply_id** | [**str**](.md)| Token Supply ID | 

### Return type

[**TokenSupplyResponse**](TokenSupplyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

