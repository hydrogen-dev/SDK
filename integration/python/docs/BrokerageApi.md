# integration_api.BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bank_link_using_post**](BrokerageApi.md#create_bank_link_using_post) | **POST** /brokerage/bank_link | create a Bank Link
[**create_brokerage_account_using_post**](BrokerageApi.md#create_brokerage_account_using_post) | **POST** /brokerage/account | create a Brokerage account
[**create_brokerage_client_using_post**](BrokerageApi.md#create_brokerage_client_using_post) | **POST** /brokerage/client | Create a Brokerage Client
[**create_order_using_post**](BrokerageApi.md#create_order_using_post) | **POST** /brokerage/order | Create an Order
[**delete_bank_link_using_delete**](BrokerageApi.md#delete_bank_link_using_delete) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**delete_order_using_delete**](BrokerageApi.md#delete_order_using_delete) | **DELETE** /brokerage/order | Delete an Order
[**get_bank_link_using_get**](BrokerageApi.md#get_bank_link_using_get) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**get_brokerage_account_statement_using_get**](BrokerageApi.md#get_brokerage_account_statement_using_get) | **GET** /brokerage/{nucleus_account_id}/statement | Get a Brokerage account statement
[**get_order_using_get**](BrokerageApi.md#get_order_using_get) | **GET** /brokerage/order | Get an Order
[**update_bank_link_using_put**](BrokerageApi.md#update_bank_link_using_put) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**update_brokerage_client_using_put**](BrokerageApi.md#update_brokerage_client_using_put) | **PUT** /brokerage/client | Update a Brokerage client


# **create_bank_link_using_post**
> BrokerageBankLinkVO create_bank_link_using_post(brokerage_bank_link_co)

create a Bank Link

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_bank_link_co = integration_api.BrokerageBankLinkCO() # BrokerageBankLinkCO | brokerageBankLinkCO

try:
    # create a Bank Link
    api_response = api_instance.create_bank_link_using_post(brokerage_bank_link_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_bank_link_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_bank_link_co** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_brokerage_account_using_post**
> BrokerageAccountVO create_brokerage_account_using_post(brokerage_account_co)

create a Brokerage account

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_account_co = integration_api.BrokerageAccountCO() # BrokerageAccountCO | brokerageAccountCO

try:
    # create a Brokerage account
    api_response = api_instance.create_brokerage_account_using_post(brokerage_account_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_brokerage_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_account_co** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO | 

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_brokerage_client_using_post**
> BrokerageCreateClientVO create_brokerage_client_using_post(client_co)

Create a Brokerage Client

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
client_co = integration_api.BrokerageClientCO() # BrokerageClientCO | clientCO

try:
    # Create a Brokerage Client
    api_response = api_instance.create_brokerage_client_using_post(client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_brokerage_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_order_using_post**
> CreateOrderResponse create_order_using_post(nucleus_order_id)

Create an Order

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_order_id = 'nucleus_order_id_example' # str | nucleus_order_id

try:
    # Create an Order
    api_response = api_instance.create_order_using_post(nucleus_order_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_order_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**str**](.md)| nucleus_order_id | 

### Return type

[**CreateOrderResponse**](CreateOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete**
> ResponseEntity delete_bank_link_using_delete(nucleus_bank_link_id)

Delete a Bank Link

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Delete a Bank Link
    api_response = api_instance.delete_bank_link_using_delete(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->delete_bank_link_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_order_using_delete**
> delete_order_using_delete(nucleus_order_id)

Delete an Order

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_order_id = 'nucleus_order_id_example' # str | nucleus_order_id

try:
    # Delete an Order
    api_instance.delete_order_using_delete(nucleus_order_id)
except ApiException as e:
    print("Exception when calling BrokerageApi->delete_order_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**str**](.md)| nucleus_order_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get**
> BrokerageBankLinkVO get_bank_link_using_get(nucleus_bank_link_id)

Get a Bank Link

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get a Bank Link
    api_response = api_instance.get_bank_link_using_get(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_bank_link_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_brokerage_account_statement_using_get**
> BrokerageStatementVO get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)

Get a Brokerage account statement

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
end_date = '2013-10-20T19:20:30+01:00' # datetime | end_date
nucleus_account_id = 'nucleus_account_id_example' # str | nucleus_account_id
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date
statement_type = 'statement_type_example' # str | statement_type

try:
    # Get a Brokerage account statement
    api_response = api_instance.get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_brokerage_account_statement_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **datetime**| end_date | 
 **nucleus_account_id** | [**str**](.md)| nucleus_account_id | 
 **start_date** | **datetime**| start_date | 
 **statement_type** | **str**| statement_type | 

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_using_get**
> GetOrderResponse get_order_using_get(nucleus_order_id)

Get an Order

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_order_id = 'nucleus_order_id_example' # str | nucleus_order_id

try:
    # Get an Order
    api_response = api_instance.get_order_using_get(nucleus_order_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_order_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**str**](.md)| nucleus_order_id | 

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put**
> BrokerageBankLinkVO update_bank_link_using_put(nucleus_bank_link_id)

Update a Bank Link

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Update a Bank Link
    api_response = api_instance.update_bank_link_using_put(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->update_bank_link_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_brokerage_client_using_put**
> BrokerageUpdateClientVO update_brokerage_client_using_put(client_co)

Update a Brokerage client

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
client_co = integration_api.BrokerageClientCO() # BrokerageClientCO | clientCO

try:
    # Update a Brokerage client
    api_response = api_instance.update_brokerage_client_using_put(client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->update_brokerage_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

