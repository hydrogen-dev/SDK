# swagger_client.CurrencyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_currency_using_post**](CurrencyApi.md#create_currency_using_post) | **POST** /currency | Creates a new Currency
[**get_currency_all_using_get**](CurrencyApi.md#get_currency_all_using_get) | **GET** /currency | Fetch Currency list
[**get_currency_using_get**](CurrencyApi.md#get_currency_using_get) | **GET** /currency/{currency_id} | Fetch Currency details
[**update_currency_using_put**](CurrencyApi.md#update_currency_using_put) | **PUT** /currency/{currency_id} | Update Currency details


# **create_currency_using_post**
> CurrencyResponse create_currency_using_post(currency_params)

Creates a new Currency

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
api_instance = molecule_api.CurrencyApi(molecule_api.ApiClient(configuration))
currency_params = molecule_api.CurrencyParams() # CurrencyParams | It enables a user to create a Currency

try:
    # Creates a new Currency
    api_response = api_instance.create_currency_using_post(currency_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyApi->create_currency_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_params** | [**CurrencyParams**](CurrencyParams.md)| It enables a user to create a Currency | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_all_using_get**
> PageCurrencyResponse get_currency_all_using_get(symbol=symbol, is_allowed=is_allowed, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Fetch Currency list

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
api_instance = molecule_api.CurrencyApi(molecule_api.ApiClient(configuration))
symbol = 'symbol_example' # str | To filter response Currency list by Symbol name (optional)
is_allowed = true # bool | To filter response Currency list (optional)
page = 56 # int | To filter response Currency list by page number (optional)
size = 56 # int | Number of records per page (optional)
order_by = 'order_by_example' # str | Field to sort record list (optional)
ascending = true # bool | Sorting order (optional)
get_latest = true # bool | To fetch latest (one) record (optional)

try:
    # Fetch Currency list
    api_response = api_instance.get_currency_all_using_get(symbol=symbol, is_allowed=is_allowed, page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyApi->get_currency_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| To filter response Currency list by Symbol name | [optional] 
 **is_allowed** | **bool**| To filter response Currency list | [optional] 
 **page** | **int**| To filter response Currency list by page number | [optional] 
 **size** | **int**| Number of records per page | [optional] 
 **order_by** | **str**| Field to sort record list | [optional] 
 **ascending** | **bool**| Sorting order | [optional] 
 **get_latest** | **bool**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyResponse**](PageCurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_using_get**
> CurrencyResponse get_currency_using_get(currency_id)

Fetch Currency details

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
api_instance = molecule_api.CurrencyApi(molecule_api.ApiClient(configuration))
currency_id = 'currency_id_example' # str | Currency ID

try:
    # Fetch Currency details
    api_response = api_instance.get_currency_using_get(currency_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyApi->get_currency_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**str**](.md)| Currency ID | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_currency_using_put**
> CurrencyResponse update_currency_using_put(currency_id, currency_update_params=currency_update_params)

Update Currency details

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
api_instance = molecule_api.CurrencyApi(molecule_api.ApiClient(configuration))
currency_id = 'currency_id_example' # str | Currency ID
currency_update_params = molecule_api.CurrencyUpdateParams() # CurrencyUpdateParams | Currency details to be updated (optional)

try:
    # Update Currency details
    api_response = api_instance.update_currency_using_put(currency_id, currency_update_params=currency_update_params)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CurrencyApi->update_currency_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**str**](.md)| Currency ID | 
 **currency_update_params** | [**CurrencyUpdateParams**](CurrencyUpdateParams.md)| Currency details to be updated | [optional] 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

