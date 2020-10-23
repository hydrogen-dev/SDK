# integration_api.AggregationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_aggregation_account_using_post**](AggregationApi.md#create_aggregation_account_using_post) | **POST** /aggregation/account | Create mapping between client,vendor,tenant
[**create_property_value_using_post**](AggregationApi.md#create_property_value_using_post) | **POST** /property_value | Create mapping between client,vendor,tenant for the property
[**delete_aggregation_account_using_delete**](AggregationApi.md#delete_aggregation_account_using_delete) | **DELETE** /aggregation/account/{nucleus_aggregation_account_id} | De-Link mapping between client,vendor,tenant
[**get_aggregation_account_all_using_get**](AggregationApi.md#get_aggregation_account_all_using_get) | **GET** /aggregation/account | Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
[**get_aggregation_account_balance_all_using_get**](AggregationApi.md#get_aggregation_account_balance_all_using_get) | **GET** /aggregation/balance | Fetch all aggregation account balance details with for the given aggregation accounts 
[**get_aggregation_account_balance_using_get**](AggregationApi.md#get_aggregation_account_balance_using_get) | **GET** /aggregation/balance/{nucleus_aggregation_account_id} | Fetch aggregation account balance details with the mapping created in POST endpoint
[**get_aggregation_account_holding_all_using_get**](AggregationApi.md#get_aggregation_account_holding_all_using_get) | **GET** /aggregation/holding | Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
[**get_aggregation_account_holding_using_get**](AggregationApi.md#get_aggregation_account_holding_using_get) | **GET** /aggregation/holding/{nucleus_aggregation_account_id} | Fetch aggregation account holding details with the mapping created in POST endpoint
[**get_aggregation_account_transaction_all_using_get**](AggregationApi.md#get_aggregation_account_transaction_all_using_get) | **GET** /aggregation/transaction | Fetch all aggregation account balance details with for the given aggregation accounts 
[**get_aggregation_account_transaction_using_get**](AggregationApi.md#get_aggregation_account_transaction_using_get) | **GET** /aggregation/transaction/{nucleus_aggregation_account_id} | Fetch aggregation account transaction details with the mapping created in POST endpoint
[**get_aggregation_account_using_get**](AggregationApi.md#get_aggregation_account_using_get) | **GET** /aggregation/account/{nucleus_aggregation_account_id} | Fetch aggregation account details with the mapping created in POST endpoint


# **create_aggregation_account_using_post**
> AggregationAccountsResponseVO create_aggregation_account_using_post(aggregation_request_object)

Create mapping between client,vendor,tenant

Create mapping between client,vendor,tenant

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_request_object = integration_api.AggregationRequestObject() # AggregationRequestObject | aggregationRequestObject

try:
    # Create mapping between client,vendor,tenant
    api_response = api_instance.create_aggregation_account_using_post(aggregation_request_object)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->create_aggregation_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 

### Return type

[**AggregationAccountsResponseVO**](AggregationAccountsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_property_value_using_post**
> PropertyValueResponseVO create_property_value_using_post(aggregation_request_object)

Create mapping between client,vendor,tenant for the property

Create mapping between client,vendor,tenant for property

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_request_object = integration_api.AggregationRequestObject() # AggregationRequestObject | aggregationRequestObject

try:
    # Create mapping between client,vendor,tenant for the property
    api_response = api_instance.create_property_value_using_post(aggregation_request_object)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->create_property_value_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_request_object** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 

### Return type

[**PropertyValueResponseVO**](PropertyValueResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_aggregation_account_using_delete**
> delete_aggregation_account_using_delete(nucleus_aggregation_account_id)

De-Link mapping between client,vendor,tenant

De-Link mapping between client,vendor,tenant

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # str | nucleus_aggregation_account_id

try:
    # De-Link mapping between client,vendor,tenant
    api_instance.delete_aggregation_account_using_delete(nucleus_aggregation_account_id)
except ApiException as e:
    print("Exception when calling AggregationApi->delete_aggregation_account_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**str**](.md)| nucleus_aggregation_account_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_all_using_get**
> list[AggregationAccountResponseVO] get_aggregation_account_all_using_get(aggregation_account_id_list)

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_account_id_list = ['aggregation_account_id_list_example'] # list[str] | aggregation_account_id_list

try:
    # Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
    api_response = api_instance.get_aggregation_account_all_using_get(aggregation_account_id_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**list[str]**](str.md)| aggregation_account_id_list | 

### Return type

[**list[AggregationAccountResponseVO]**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_balance_all_using_get**
> list[AggregationAccountBalanceResponseVO] get_aggregation_account_balance_all_using_get(aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_account_id_list = ['aggregation_account_id_list_example'] # list[str] | aggregation_account_id_list

try:
    # Fetch all aggregation account balance details with for the given aggregation accounts 
    api_response = api_instance.get_aggregation_account_balance_all_using_get(aggregation_account_id_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_balance_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**list[str]**](str.md)| aggregation_account_id_list | 

### Return type

[**list[AggregationAccountBalanceResponseVO]**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_balance_using_get**
> AggregationAccountBalanceResponseVO get_aggregation_account_balance_using_get(nucleus_aggregation_account_id)

Fetch aggregation account balance details with the mapping created in POST endpoint

Fetch aggregation account balance details with the mapping created in POST endpoint

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # str | nucleus_aggregation_account_id

try:
    # Fetch aggregation account balance details with the mapping created in POST endpoint
    api_response = api_instance.get_aggregation_account_balance_using_get(nucleus_aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**str**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountBalanceResponseVO**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_holding_all_using_get**
> list[AggregationAccountHoldingResponseVO] get_aggregation_account_holding_all_using_get(aggregation_account_id_list)

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_account_id_list = ['aggregation_account_id_list_example'] # list[str] | aggregation_account_id_list

try:
    # Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
    api_response = api_instance.get_aggregation_account_holding_all_using_get(aggregation_account_id_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_holding_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**list[str]**](str.md)| aggregation_account_id_list | 

### Return type

[**list[AggregationAccountHoldingResponseVO]**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_holding_using_get**
> AggregationAccountHoldingResponseVO get_aggregation_account_holding_using_get(nucleus_aggregation_account_id)

Fetch aggregation account holding details with the mapping created in POST endpoint

Fetch aggregation account holding details with the mapping created in POST endpoint

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # str | nucleus_aggregation_account_id

try:
    # Fetch aggregation account holding details with the mapping created in POST endpoint
    api_response = api_instance.get_aggregation_account_holding_using_get(nucleus_aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**str**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountHoldingResponseVO**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_transaction_all_using_get**
> list[AggregationAccountTransactionResponseVO] get_aggregation_account_transaction_all_using_get(aggregation_account_id_list)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
aggregation_account_id_list = ['aggregation_account_id_list_example'] # list[str] | aggregation_account_id_list

try:
    # Fetch all aggregation account balance details with for the given aggregation accounts 
    api_response = api_instance.get_aggregation_account_transaction_all_using_get(aggregation_account_id_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id_list** | [**list[str]**](str.md)| aggregation_account_id_list | 

### Return type

[**list[AggregationAccountTransactionResponseVO]**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_transaction_using_get**
> AggregationAccountTransactionResponseVO get_aggregation_account_transaction_using_get(nucleus_aggregation_account_id)

Fetch aggregation account transaction details with the mapping created in POST endpoint

Fetch aggregation account transaction details with the mapping created in POST endpoint

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # str | nucleus_aggregation_account_id

try:
    # Fetch aggregation account transaction details with the mapping created in POST endpoint
    api_response = api_instance.get_aggregation_account_transaction_using_get(nucleus_aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**str**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountTransactionResponseVO**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_using_get**
> AggregationAccountResponseVO get_aggregation_account_using_get(nucleus_aggregation_account_id)

Fetch aggregation account details with the mapping created in POST endpoint

Fetch aggregation account details with the mapping created in POST endpoint

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");
configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.AggregationApi(integration_api.ApiClient(configuration))
nucleus_aggregation_account_id = 'nucleus_aggregation_account_id_example' # str | nucleus_aggregation_account_id

try:
    # Fetch aggregation account details with the mapping created in POST endpoint
    api_response = api_instance.get_aggregation_account_using_get(nucleus_aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationApi->get_aggregation_account_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_aggregation_account_id** | [**str**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountResponseVO**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

