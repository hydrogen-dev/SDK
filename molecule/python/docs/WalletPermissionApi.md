# swagger_client.WalletPermissionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_wallet_permission_all_using_get**](WalletPermissionApi.md#get_wallet_permission_all_using_get) | **GET** /wallet_permission | Fetch Wallet list with client&#39;s permissions
[**get_wallet_permission_using_get**](WalletPermissionApi.md#get_wallet_permission_using_get) | **GET** /wallet_permission/{wallet_id} | Fetch Wallet&#39;s client permissions details
[**update_wallet_permission_using_put**](WalletPermissionApi.md#update_wallet_permission_using_put) | **PUT** /wallet_permission/{wallet_id} | Update client&#39;s permission for provided Wallet


# **get_wallet_permission_all_using_get**
> PageWalletPermissionResponse get_wallet_permission_all_using_get(nucleus_client_id=nucleus_client_id, is_active=is_active, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Wallet list with client's permissions

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
api_instance = molecule_api.WalletPermissionApi(molecule_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | To filter response wallet list by client's ID (optional)
is_active = true # bool | To filter response for active wallets (optional)
page = 56 # int | To filter response wallet list page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Wallet list with client's permissions
    api_response = api_instance.get_wallet_permission_all_using_get(nucleus_client_id=nucleus_client_id, is_active=is_active, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletPermissionApi->get_wallet_permission_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| To filter response wallet list by client&#39;s ID | [optional] 
 **is_active** | **bool**| To filter response for active wallets | [optional] 
 **page** | **int**| To filter response wallet list page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletPermissionResponse**](PageWalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_permission_using_get**
> WalletPermissionResponse get_wallet_permission_using_get(wallet_id)

Fetch Wallet's client permissions details

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
api_instance = molecule_api.WalletPermissionApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | Wallet ID

try:
    # Fetch Wallet's client permissions details
    api_response = api_instance.get_wallet_permission_using_get(wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletPermissionApi->get_wallet_permission_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| Wallet ID | 

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wallet_permission_using_put**
> WalletPermissionResponse update_wallet_permission_using_put(wallet_id, client_permissions)

Update client's permission for provided Wallet

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
api_instance = molecule_api.WalletPermissionApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | Wallet ID
client_permissions = molecule_api.WalletPermissionUpdateParams() # WalletPermissionUpdateParams | Client's permission to be updated

try:
    # Update client's permission for provided Wallet
    api_response = api_instance.update_wallet_permission_using_put(wallet_id, client_permissions)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletPermissionApi->update_wallet_permission_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| Wallet ID | 
 **client_permissions** | [**WalletPermissionUpdateParams**](WalletPermissionUpdateParams.md)| Client&#39;s permission to be updated | 

### Return type

[**WalletPermissionResponse**](WalletPermissionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

