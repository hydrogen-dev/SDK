# swagger_client.TransactionStatusApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_transaction_status_all_using_get**](TransactionStatusApi.md#get_transaction_status_all_using_get) | **GET** /transaction_status | Fetch Transaction Status list
[**get_transaction_status_using_get**](TransactionStatusApi.md#get_transaction_status_using_get) | **GET** /transaction_status/{transaction_id} | Fetch Transaction record details


# **get_transaction_status_all_using_get**
> PageTransactionSuccessResponse get_transaction_status_all_using_get(hash=hash, wallet_id=wallet_id, status=status, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Transaction Status list

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
api_instance = molecule_api.TransactionStatusApi(molecule_api.ApiClient(configuration))
hash = 'hash_example' # str | To filter response Transaction record list by Transaction's hash (optional)
wallet_id = 'wallet_id_example' # str | To filter response Transaction record list by Wallet ID (optional)
status = 'status_example' # str | To filter response Transaction record list by Transaction's status (optional)
page = 56 # int | To filter response Transaction record list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Transaction Status list
    api_response = api_instance.get_transaction_status_all_using_get(hash=hash, wallet_id=wallet_id, status=status, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TransactionStatusApi->get_transaction_status_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **str**| To filter response Transaction record list by Transaction&#39;s hash | [optional] 
 **wallet_id** | [**str**](.md)| To filter response Transaction record list by Wallet ID | [optional] 
 **status** | **str**| To filter response Transaction record list by Transaction&#39;s status | [optional] 
 **page** | **int**| To filter response Transaction record list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageTransactionSuccessResponse**](PageTransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transaction_status_using_get**
> TransactionSuccessResponse get_transaction_status_using_get(transaction_id)

Fetch Transaction record details

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
api_instance = molecule_api.TransactionStatusApi(molecule_api.ApiClient(configuration))
transaction_id = 'transaction_id_example' # str | Transaction ID

try:
    # Fetch Transaction record details
    api_response = api_instance.get_transaction_status_using_get(transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling TransactionStatusApi->get_transaction_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_id** | [**str**](.md)| Transaction ID | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

