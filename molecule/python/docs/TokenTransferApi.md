# swagger_client.TokenTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_token_transfer_using_post**](TokenTransferApi.md#create_token_transfer_using_post) | **POST** /token_transfer | Creates Token Transfer record
[**get_token_transfer_all_using_get**](TokenTransferApi.md#get_token_transfer_all_using_get) | **GET** /token_transfer | Fetch Token Transfer record list
[**get_token_transfer_using_get**](TokenTransferApi.md#get_token_transfer_using_get) | **GET** /token_transfer/{token_transfer_id} | Fetch Token Transfer record details


# **create_token_transfer_using_post**
> TransactionSuccessResponse create_token_transfer_using_post(token_transfer_params)

Creates Token Transfer record

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenTransferApi(molecule_api.ApiClient(configuration))
token_transfer_params = molecule_api.TokenTransferParams() # TokenTransferParams | It enables a user to transfer Tokens

try:
    # Creates Token Transfer record
    api_response = api_instance.create_token_transfer_using_post(token_transfer_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenTransferApi->create_token_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_params** | [**TokenTransferParams**](TokenTransferParams.md)| It enables a user to transfer Tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_transfer_all_using_get**
> PageTokenTransferResponse get_token_transfer_all_using_get(wallet_id=wallet_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Token Transfer record list

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenTransferApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | To filter response Token Transfer list by Wallet ID (optional)
page = 56 # int | To filter response Token Transfer list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Token Transfer record list
    api_response = api_instance.get_token_transfer_all_using_get(wallet_id=wallet_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenTransferApi->get_token_transfer_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| To filter response Token Transfer list by Wallet ID | [optional] 
 **page** | **int**| To filter response Token Transfer list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenTransferResponse**](PageTokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_transfer_using_get**
> TokenTransferResponse get_token_transfer_using_get(token_transfer_id)

Fetch Token Transfer record details

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = molecule_api.TokenTransferApi(molecule_api.ApiClient(configuration))
token_transfer_id = 'token_transfer_id_example' # str | Token Transfer ID

try:
    # Fetch Token Transfer record details
    api_response = api_instance.get_token_transfer_using_get(token_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenTransferApi->get_token_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_id** | [**str**](.md)| Token Transfer ID | 

### Return type

[**TokenTransferResponse**](TokenTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

