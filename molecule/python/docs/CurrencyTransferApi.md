# swagger_client.CurrencyTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_currency_transfer_using_post**](CurrencyTransferApi.md#create_currency_transfer_using_post) | **POST** /currency_transfer | Creates Currency Transfer record
[**get_currency_transfer_all_using_get**](CurrencyTransferApi.md#get_currency_transfer_all_using_get) | **GET** /currency_transfer | Fetch Currency Transfer record list
[**get_currency_transfer_using_get**](CurrencyTransferApi.md#get_currency_transfer_using_get) | **GET** /currency_transfer/{currency_transfer_id} | Fetch Currency Transfer record details


# **create_currency_transfer_using_post**
> TransactionSuccessResponse create_currency_transfer_using_post(currency_transfer_params)

Creates Currency Transfer record

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
api_instance = molecule_api.CurrencyTransferApi(molecule_api.ApiClient(configuration))
currency_transfer_params = molecule_api.CurrencyTransferParams() # CurrencyTransferParams | It enables a user to transfer Currency

try:
    # Creates Currency Transfer record
    api_response = api_instance.create_currency_transfer_using_post(currency_transfer_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyTransferApi->create_currency_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_params** | [**CurrencyTransferParams**](CurrencyTransferParams.md)| It enables a user to transfer Currency | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_transfer_all_using_get**
> PageCurrencyTransferResponse get_currency_transfer_all_using_get(wallet_id=wallet_id, currency_id=currency_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Currency Transfer record list

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
api_instance = molecule_api.CurrencyTransferApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | To filter response Currency Transfer list by Wallet ID (optional)
currency_id = 'currency_id_example' # str | To filter response Currency Transfer list by Currency ID (optional)
page = 56 # int | To filter response Currency Transfer list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Currency Transfer record list
    api_response = api_instance.get_currency_transfer_all_using_get(wallet_id=wallet_id, currency_id=currency_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyTransferApi->get_currency_transfer_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| To filter response Currency Transfer list by Wallet ID | [optional] 
 **currency_id** | [**str**](.md)| To filter response Currency Transfer list by Currency ID | [optional] 
 **page** | **int**| To filter response Currency Transfer list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyTransferResponse**](PageCurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_transfer_using_get**
> CurrencyTransferResponse get_currency_transfer_using_get(currency_transfer_id)

Fetch Currency Transfer record details

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
api_instance = molecule_api.CurrencyTransferApi(molecule_api.ApiClient(configuration))
currency_transfer_id = 'currency_transfer_id_example' # str | Currency Transfer ID

try:
    # Fetch Currency Transfer record details
    api_response = api_instance.get_currency_transfer_using_get(currency_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyTransferApi->get_currency_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_id** | [**str**](.md)| Currency Transfer ID | 

### Return type

[**CurrencyTransferResponse**](CurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

