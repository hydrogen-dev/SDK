# swagger_client.TokenBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_token_balance_all_using_get**](TokenBalanceApi.md#get_token_balance_all_using_get) | **GET** /token_balance | Fetch Token Balance list
[**get_token_balance_using_get**](TokenBalanceApi.md#get_token_balance_using_get) | **GET** /token_balance/{token_balance_id} | Fetch Token Balance details


# **get_token_balance_all_using_get**
> PageTokenBalanceResponse get_token_balance_all_using_get(wallet_id=wallet_id, token_id=token_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Token Balance list

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
api_instance = molecule_api.TokenBalanceApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | To filter response Token Balance list by wallet ID (optional)
token_id = 'token_id_example' # str | To filter response Token Balance list by Token ID (optional)
page = 56 # int | To filter response Token Balance list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Token Balance list
    api_response = api_instance.get_token_balance_all_using_get(wallet_id=wallet_id, token_id=token_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenBalanceApi->get_token_balance_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| To filter response Token Balance list by wallet ID | [optional] 
 **token_id** | [**str**](.md)| To filter response Token Balance list by Token ID | [optional] 
 **page** | **int**| To filter response Token Balance list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenBalanceResponse**](PageTokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_balance_using_get**
> TokenBalanceResponse get_token_balance_using_get(token_balance_id)

Fetch Token Balance details

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
api_instance = molecule_api.TokenBalanceApi(molecule_api.ApiClient(configuration))
token_balance_id = 'token_balance_id_example' # str | Token Balance ID

try:
    # Fetch Token Balance details
    api_response = api_instance.get_token_balance_using_get(token_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenBalanceApi->get_token_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_balance_id** | [**str**](.md)| Token Balance ID | 

### Return type

[**TokenBalanceResponse**](TokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

