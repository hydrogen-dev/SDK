# swagger_client.WalletKeyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_wallet_key_using_post**](WalletKeyApi.md#create_wallet_key_using_post) | **POST** /wallet_key | Creates a new Wallet Key for provided Wallet ID
[**generate_wallet_key_using_post**](WalletKeyApi.md#generate_wallet_key_using_post) | **POST** /wallet_key/generator | Generates Wallet Key for provided Wallet ID
[**get_wallet_key_all_using_get**](WalletKeyApi.md#get_wallet_key_all_using_get) | **GET** /wallet_key | Fetch Wallet Key list
[**get_wallet_key_using_get**](WalletKeyApi.md#get_wallet_key_using_get) | **GET** /wallet_key/{wallet_key_id} | Fetch Wallet Key details


# **create_wallet_key_using_post**
> WalletKeyResponse create_wallet_key_using_post(wallet_key_params)

Creates a new Wallet Key for provided Wallet ID

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
api_instance = molecule_api.WalletKeyApi(molecule_api.ApiClient(configuration))
wallet_key_params = molecule_api.WalletKeyParams() # WalletKeyParams | It enables a user to create a Wallet Key record

try:
    # Creates a new Wallet Key for provided Wallet ID
    api_response = api_instance.create_wallet_key_using_post(wallet_key_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletKeyApi->create_wallet_key_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_params** | [**WalletKeyParams**](WalletKeyParams.md)| It enables a user to create a Wallet Key record | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_wallet_key_using_post**
> WalletKeyResponse generate_wallet_key_using_post(wallet_key_generate_params)

Generates Wallet Key for provided Wallet ID

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
api_instance = molecule_api.WalletKeyApi(molecule_api.ApiClient(configuration))
wallet_key_generate_params = molecule_api.WalletKeyGenerateParams() # WalletKeyGenerateParams | It enables a user to generate a Wallet Key record

try:
    # Generates Wallet Key for provided Wallet ID
    api_response = api_instance.generate_wallet_key_using_post(wallet_key_generate_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletKeyApi->generate_wallet_key_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_generate_params** | [**WalletKeyGenerateParams**](WalletKeyGenerateParams.md)| It enables a user to generate a Wallet Key record | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_key_all_using_get**
> PageWalletKeyResponse get_wallet_key_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Wallet Key list

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
api_instance = molecule_api.WalletKeyApi(molecule_api.ApiClient(configuration))
page = 56 # int | To filter response wallet list page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Wallet Key list
    api_response = api_instance.get_wallet_key_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletKeyApi->get_wallet_key_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response wallet list page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletKeyResponse**](PageWalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_key_using_get**
> WalletKeyResponse get_wallet_key_using_get(wallet_key_id)

Fetch Wallet Key details

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
api_instance = molecule_api.WalletKeyApi(molecule_api.ApiClient(configuration))
wallet_key_id = 'wallet_key_id_example' # str | Wallet Key ID

try:
    # Fetch Wallet Key details
    api_response = api_instance.get_wallet_key_using_get(wallet_key_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletKeyApi->get_wallet_key_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**str**](.md)| Wallet Key ID | 

### Return type

[**WalletKeyResponse**](WalletKeyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

