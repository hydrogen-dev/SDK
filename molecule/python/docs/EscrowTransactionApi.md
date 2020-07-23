# swagger_client.EscrowTransactionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_escrow_transaction_using_post**](EscrowTransactionApi.md#create_escrow_transaction_using_post) | **POST** /escrow_transaction | Create a new Escrow Transaction
[**get_escrow_transaction_all_using_get**](EscrowTransactionApi.md#get_escrow_transaction_all_using_get) | **GET** /escrow_transaction | List all Escrow Transaction
[**get_escrow_transaction_using_get**](EscrowTransactionApi.md#get_escrow_transaction_using_get) | **GET** /escrow_transaction/{escrow_transaction_id} | Fetch Escrow Transaction
[**update_escrow_transaction_using_put**](EscrowTransactionApi.md#update_escrow_transaction_using_put) | **PUT** /escrow_transaction/{escrow_transaction_id} | Update Escrow Transaction


# **create_escrow_transaction_using_post**
> EscrowTransactionResponse create_escrow_transaction_using_post(escrow_deposit_params)

Create a new Escrow Transaction

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
api_instance = molecule_api.EscrowTransactionApi(molecule_api.ApiClient(configuration))
escrow_deposit_params = molecule_api.EscrowDepositParams() # EscrowDepositParams | It enables a user to create a escrow transaction

try:
    # Create a new Escrow Transaction
    api_response = api_instance.create_escrow_transaction_using_post(escrow_deposit_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowTransactionApi->create_escrow_transaction_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_deposit_params** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_escrow_transaction_all_using_get**
> PageEscrowTransactionResponse get_escrow_transaction_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

List all Escrow Transaction

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
api_instance = molecule_api.EscrowTransactionApi(molecule_api.ApiClient(configuration))
page = 56 # int | To filter response Escrow Transaction list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # List all Escrow Transaction
    api_response = api_instance.get_escrow_transaction_all_using_get(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowTransactionApi->get_escrow_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| To filter response Escrow Transaction list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageEscrowTransactionResponse**](PageEscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_escrow_transaction_using_get**
> EscrowTransactionResponse get_escrow_transaction_using_get(escrow_transaction_id)

Fetch Escrow Transaction

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
api_instance = molecule_api.EscrowTransactionApi(molecule_api.ApiClient(configuration))
escrow_transaction_id = 'escrow_transaction_id_example' # str | Escrow Transaction ID

try:
    # Fetch Escrow Transaction
    api_response = api_instance.get_escrow_transaction_using_get(escrow_transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowTransactionApi->get_escrow_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**str**](.md)| Escrow Transaction ID | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_escrow_transaction_using_put**
> EscrowTransactionResponse update_escrow_transaction_using_put(escrow_transaction_id, escrow_deposit_params=escrow_deposit_params)

Update Escrow Transaction

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
api_instance = molecule_api.EscrowTransactionApi(molecule_api.ApiClient(configuration))
escrow_transaction_id = 'escrow_transaction_id_example' # str | Escrow Transaction ID
escrow_deposit_params = molecule_api.EscrowDepositParams() # EscrowDepositParams | It enables a user to create a escrow transaction (optional)

try:
    # Update Escrow Transaction
    api_response = api_instance.update_escrow_transaction_using_put(escrow_transaction_id, escrow_deposit_params=escrow_deposit_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EscrowTransactionApi->update_escrow_transaction_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrow_transaction_id** | [**str**](.md)| Escrow Transaction ID | 
 **escrow_deposit_params** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | [optional] 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

