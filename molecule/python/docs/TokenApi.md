# swagger_client.TokenApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**burn_token_using_post**](TokenApi.md#burn_token_using_post) | **POST** /token/burn | Burn tokens
[**create_token_using_post**](TokenApi.md#create_token_using_post) | **POST** /token | Creates a new Token
[**delete_token_using_delete**](TokenApi.md#delete_token_using_delete) | **DELETE** /token/{token_id} | Delete Token
[**deploy_token_using_post**](TokenApi.md#deploy_token_using_post) | **POST** /token/deploy | Deploys provided Token to network
[**get_token_all_using_get**](TokenApi.md#get_token_all_using_get) | **GET** /token | Fetch Token list
[**get_token_using_get**](TokenApi.md#get_token_using_get) | **GET** /token/{token_id} | Fetch Token details
[**mint_token_using_post**](TokenApi.md#mint_token_using_post) | **POST** /token/mint | Mint new tokens
[**update_token_using_put**](TokenApi.md#update_token_using_put) | **PUT** /token/{token_id} | Update Token details
[**whitelist_token_using_post**](TokenApi.md#whitelist_token_using_post) | **POST** /token/whitelist | Whitelist token for provided wallet


# **burn_token_using_post**
> TransactionSuccessResponse burn_token_using_post(token_burn_params)

Burn tokens

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_burn_params = molecule_api.TokenBurnParams() # TokenBurnParams | Burns provided amount of existing tokens

try:
    # Burn tokens
    api_response = api_instance.burn_token_using_post(token_burn_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->burn_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_burn_params** | [**TokenBurnParams**](TokenBurnParams.md)| Burns provided amount of existing tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_token_using_post**
> TokenResponse create_token_using_post(token_params)

Creates a new Token

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_params = molecule_api.TokenParams() # TokenParams | It enables a user to create a Token

try:
    # Creates a new Token
    api_response = api_instance.create_token_using_post(token_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->create_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_params** | [**TokenParams**](TokenParams.md)| It enables a user to create a Token | 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_token_using_delete**
> delete_token_using_delete(token_id)

Delete Token

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | Token ID

try:
    # Delete Token
    api_instance.delete_token_using_delete(token_id)
except ApiException as e:
    print("Exception when calling TokenApi->delete_token_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| Token ID | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deploy_token_using_post**
> TransactionSuccessResponse deploy_token_using_post(token_deploy_params)

Deploys provided Token to network

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_deploy_params = molecule_api.TokenDeployParams() # TokenDeployParams | Deploys provided Token to network

try:
    # Deploys provided Token to network
    api_response = api_instance.deploy_token_using_post(token_deploy_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->deploy_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_deploy_params** | [**TokenDeployParams**](TokenDeployParams.md)| Deploys provided Token to network | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_all_using_get**
> PageTokenResponse get_token_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Token list

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
page = 56 # int | To filter response Token list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Token list
    api_response = api_instance.get_token_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->get_token_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Token list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenResponse**](PageTokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_using_get**
> TokenResponse get_token_using_get(token_id)

Fetch Token details

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | Token ID

try:
    # Fetch Token details
    api_response = api_instance.get_token_using_get(token_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->get_token_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| Token ID | 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **mint_token_using_post**
> TransactionSuccessResponse mint_token_using_post(token_mint_params)

Mint new tokens

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_mint_params = molecule_api.TokenMintParams() # TokenMintParams | Mint new tokens

try:
    # Mint new tokens
    api_response = api_instance.mint_token_using_post(token_mint_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->mint_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_mint_params** | [**TokenMintParams**](TokenMintParams.md)| Mint new tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_token_using_put**
> TokenResponse update_token_using_put(token_id, token_update_params=token_update_params)

Update Token details

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | Token ID
token_update_params = molecule_api.TokenUpdateParams() # TokenUpdateParams | Token details to be updated (optional)

try:
    # Update Token details
    api_response = api_instance.update_token_using_put(token_id, token_update_params=token_update_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->update_token_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| Token ID | 
 **token_update_params** | [**TokenUpdateParams**](TokenUpdateParams.md)| Token details to be updated | [optional] 

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **whitelist_token_using_post**
> TransactionSuccessResponse whitelist_token_using_post(token_whitelist_params)

Whitelist token for provided wallet

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
api_instance = molecule_api.TokenApi(molecule_api.ApiClient(configuration))
token_whitelist_params = molecule_api.TokenWhitelistParams() # TokenWhitelistParams | Whitelist token for provided wallet

try:
    # Whitelist token for provided wallet
    api_response = api_instance.whitelist_token_using_post(token_whitelist_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TokenApi->whitelist_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_whitelist_params** | [**TokenWhitelistParams**](TokenWhitelistParams.md)| Whitelist token for provided wallet | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

