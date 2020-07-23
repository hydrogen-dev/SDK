# swagger_client.CurrencyBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_currency_balance_all_using_get**](CurrencyBalanceApi.md#get_currency_balance_all_using_get) | **GET** /currency_balance | Fetch Currency Balance list
[**get_currency_balance_using_get**](CurrencyBalanceApi.md#get_currency_balance_using_get) | **GET** /currency_balance/{currency_balance_id} | Fetch Currency Balance details
[**update_currency_balance_using_post**](CurrencyBalanceApi.md#update_currency_balance_using_post) | **POST** /currency_balance/update | Update(Fetch) latest Currency Balance


# **get_currency_balance_all_using_get**
> PageCurrencyBalanceResponse get_currency_balance_all_using_get(wallet_id=wallet_id, currency_id=currency_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Currency Balance list

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
api_instance = molecule_api.CurrencyBalanceApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | To filter response Currency Balance list by wallet ID (optional)
currency_id = 'currency_id_example' # str | To filter response Currency Balance list by currency ID (optional)
page = 56 # int | To filter response Currency Balance list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Currency Balance list
    api_response = api_instance.get_currency_balance_all_using_get(wallet_id=wallet_id, currency_id=currency_id, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyBalanceApi->get_currency_balance_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| To filter response Currency Balance list by wallet ID | [optional] 
 **currency_id** | [**str**](.md)| To filter response Currency Balance list by currency ID | [optional] 
 **page** | **int**| To filter response Currency Balance list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyBalanceResponse**](PageCurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_balance_using_get**
> CurrencyBalanceResponse get_currency_balance_using_get(currency_balance_id)

Fetch Currency Balance details

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
api_instance = molecule_api.CurrencyBalanceApi(molecule_api.ApiClient(configuration))
currency_balance_id = 'currency_balance_id_example' # str | Currency Balance ID

try:
    # Fetch Currency Balance details
    api_response = api_instance.get_currency_balance_using_get(currency_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyBalanceApi->get_currency_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_id** | [**str**](.md)| Currency Balance ID | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_currency_balance_using_post**
> CurrencyBalanceResponse update_currency_balance_using_post(currency_balance_update_params)

Update(Fetch) latest Currency Balance

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
api_instance = molecule_api.CurrencyBalanceApi(molecule_api.ApiClient(configuration))
currency_balance_update_params = molecule_api.CurrencyBalanceUpdateParams() # CurrencyBalanceUpdateParams | To fetch/update latest record

try:
    # Update(Fetch) latest Currency Balance
    api_response = api_instance.update_currency_balance_using_post(currency_balance_update_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyBalanceApi->update_currency_balance_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_update_params** | [**CurrencyBalanceUpdateParams**](CurrencyBalanceUpdateParams.md)| To fetch/update latest record | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

