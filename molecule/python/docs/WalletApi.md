# swagger_client.WalletApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_wallet_using_post**](WalletApi.md#create_wallet_using_post) | **POST** /wallet | Creates a new Wallet
[**get_wallet_all_using_get**](WalletApi.md#get_wallet_all_using_get) | **GET** /wallet | Fetch Wallet list
[**get_wallet_by_wallet_key_using_get**](WalletApi.md#get_wallet_by_wallet_key_using_get) | **GET** /wallet/wallet_key/{wallet_key_id} | Fetch Wallet details by Wallet Key ID
[**get_wallet_using_get**](WalletApi.md#get_wallet_using_get) | **GET** /wallet/{wallet_id} | Fetch Wallet details
[**update_wallet_using_put**](WalletApi.md#update_wallet_using_put) | **PUT** /wallet/{wallet_id} | Update Wallet details


# **create_wallet_using_post**
> WalletResponse create_wallet_using_post(wallet_params)

Creates a new Wallet

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
api_instance = molecule_api.WalletApi(molecule_api.ApiClient(configuration))
wallet_params = molecule_api.WalletParams() # WalletParams | It enables a user to create a Wallet

try:
    # Creates a new Wallet
    api_response = api_instance.create_wallet_using_post(wallet_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->create_wallet_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_params** | [**WalletParams**](WalletParams.md)| It enables a user to create a Wallet | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_all_using_get**
> PageWalletResponse get_wallet_all_using_get(nucleus_client_id=nucleus_client_id, is_primary=is_primary, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Wallet list

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
api_instance = molecule_api.WalletApi(molecule_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | To filter response wallet list by client's ID (optional)
is_primary = true # bool | To filter response for primary wallets (optional)
page = 56 # int | To filter response wallet list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Wallet list
    api_response = api_instance.get_wallet_all_using_get(nucleus_client_id=nucleus_client_id, is_primary=is_primary, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->get_wallet_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| To filter response wallet list by client&#39;s ID | [optional] 
 **is_primary** | **bool**| To filter response for primary wallets | [optional] 
 **page** | **int**| To filter response wallet list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletResponse**](PageWalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_by_wallet_key_using_get**
> WalletResponse get_wallet_by_wallet_key_using_get(wallet_key_id)

Fetch Wallet details by Wallet Key ID

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
api_instance = molecule_api.WalletApi(molecule_api.ApiClient(configuration))
wallet_key_id = 'wallet_key_id_example' # str | Wallet Key ID

try:
    # Fetch Wallet details by Wallet Key ID
    api_response = api_instance.get_wallet_by_wallet_key_using_get(wallet_key_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->get_wallet_by_wallet_key_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**str**](.md)| Wallet Key ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_using_get**
> WalletResponse get_wallet_using_get(wallet_id)

Fetch Wallet details

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
api_instance = molecule_api.WalletApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | Wallet ID

try:
    # Fetch Wallet details
    api_response = api_instance.get_wallet_using_get(wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->get_wallet_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| Wallet ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wallet_using_put**
> WalletResponse update_wallet_using_put(wallet_id, wallet_update_params=wallet_update_params)

Update Wallet details

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
api_instance = molecule_api.WalletApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | Wallet ID
wallet_update_params = molecule_api.WalletParams() # WalletParams | Wallet details to be updated (optional)

try:
    # Update Wallet details
    api_response = api_instance.update_wallet_using_put(wallet_id, wallet_update_params=wallet_update_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->update_wallet_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| Wallet ID | 
 **wallet_update_params** | [**WalletParams**](WalletParams.md)| Wallet details to be updated | [optional] 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

