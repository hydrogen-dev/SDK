# nucleus_api.AggregationAccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_aggregation_account_balance_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_balance_bulk_using_post) | **POST** /bulk_aggregation_account_balance | Create a bulk aggregation account balance
[**create_aggregation_account_balance_using_post**](AggregationAccountApi.md#create_aggregation_account_balance_using_post) | **POST** /aggregation_account_balance | Create an aggregation account balance
[**create_aggregation_account_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_bulk_using_post) | **POST** /bulk_aggregation_account | Create a bulk aggregation account
[**create_aggregation_account_holding_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_holding_bulk_using_post) | **POST** /bulk_aggregation_account_holding | Create a bulk aggregation account holding
[**create_aggregation_account_holding_using_post**](AggregationAccountApi.md#create_aggregation_account_holding_using_post) | **POST** /aggregation_account_holding | Create an aggregation account holding
[**create_aggregation_account_transaction_bulk_using_post**](AggregationAccountApi.md#create_aggregation_account_transaction_bulk_using_post) | **POST** /bulk_aggregation_account_transaction | Create a bulk aggregation account transaction
[**create_aggregation_account_transaction_using_post**](AggregationAccountApi.md#create_aggregation_account_transaction_using_post) | **POST** /aggregation_account_transaction | Create an aggregation account transaction
[**create_aggregation_account_using_post**](AggregationAccountApi.md#create_aggregation_account_using_post) | **POST** /aggregation_account | Create an aggregation account
[**delete_aggregation_account_balance_using_delete**](AggregationAccountApi.md#delete_aggregation_account_balance_using_delete) | **DELETE** /aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**delete_aggregation_account_holding_using_delete**](AggregationAccountApi.md#delete_aggregation_account_holding_using_delete) | **DELETE** /aggregation_account_holding/{aggregation_account_holding_id} | Delete an aggregation account holding
[**delete_aggregation_account_transaction_using_delete**](AggregationAccountApi.md#delete_aggregation_account_transaction_using_delete) | **DELETE** /aggregation_account_transaction/{aggregation_account_transaction_id} | Delete an aggregation account transaction
[**delete_aggregation_account_using_delete**](AggregationAccountApi.md#delete_aggregation_account_using_delete) | **DELETE** /aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**get_aggregation_account_aggregate_data_using_get**](AggregationAccountApi.md#get_aggregation_account_aggregate_data_using_get) | **GET** /aggregation_account/{aggregation_account_id}/aggregate_data | Retrieve an aggregation account aggregate data
[**get_aggregation_account_all_using_get**](AggregationAccountApi.md#get_aggregation_account_all_using_get) | **GET** /aggregation_account | List all aggregation accounts
[**get_aggregation_account_balance_all_using_get**](AggregationAccountApi.md#get_aggregation_account_balance_all_using_get) | **GET** /aggregation_account_balance | List all aggregation account balances
[**get_aggregation_account_balance_using_get**](AggregationAccountApi.md#get_aggregation_account_balance_using_get) | **GET** /aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**get_aggregation_account_holding_all_using_get**](AggregationAccountApi.md#get_aggregation_account_holding_all_using_get) | **GET** /aggregation_account_holding | List all aggregation account holdings
[**get_aggregation_account_holding_using_get**](AggregationAccountApi.md#get_aggregation_account_holding_using_get) | **GET** /aggregation_account_holding/{aggregation_account_holding_id} | Retrieve an aggregation account holding
[**get_aggregation_account_overview_using_get**](AggregationAccountApi.md#get_aggregation_account_overview_using_get) | **GET** /client/{client_id}/aggregation_account_overview | Retrieve an aggregation account aggregate data
[**get_aggregation_account_transaction_all_using_get**](AggregationAccountApi.md#get_aggregation_account_transaction_all_using_get) | **GET** /aggregation_account_transaction | List all aggregation account transactions
[**get_aggregation_account_transaction_using_get**](AggregationAccountApi.md#get_aggregation_account_transaction_using_get) | **GET** /aggregation_account_transaction/{aggregation_account_transaction_id} | Retrieve an aggregation account transaction
[**get_aggregation_account_using_get**](AggregationAccountApi.md#get_aggregation_account_using_get) | **GET** /aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**update_aggregation_account_balance_using_put**](AggregationAccountApi.md#update_aggregation_account_balance_using_put) | **PUT** /aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**update_aggregation_account_bulk_using_put**](AggregationAccountApi.md#update_aggregation_account_bulk_using_put) | **PUT** /bulk_aggregation_account | Update a bulk aggregation account
[**update_aggregation_account_holding_bulk_using_put**](AggregationAccountApi.md#update_aggregation_account_holding_bulk_using_put) | **PUT** /bulk_aggregation_account_holding | Update an bulk aggregation account holding
[**update_aggregation_account_holding_using_put**](AggregationAccountApi.md#update_aggregation_account_holding_using_put) | **PUT** /aggregation_account_holding/{aggregation_account_holding_id} | Update an aggregation account holding
[**update_aggregation_account_transaction_using_put**](AggregationAccountApi.md#update_aggregation_account_transaction_using_put) | **PUT** /aggregation_account_transaction/{aggregation_account_transaction_id} | Update an aggregation account transaction
[**update_aggregation_account_using_put**](AggregationAccountApi.md#update_aggregation_account_using_put) | **PUT** /aggregation_account/{aggregation_account_id} | Update an aggregation account


# **create_aggregation_account_balance_bulk_using_post**
> list[AggregationAccountBalance] create_aggregation_account_balance_bulk_using_post(aggregation_account_balance)

Create a bulk aggregation account balance

Create a balance records under an aggregation accounts.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_balance = [nucleus_api.AggregationAccountBalance()] # list[AggregationAccountBalance] | aggregationAccountBalance

try:
    # Create a bulk aggregation account balance
    api_response = api_instance.create_aggregation_account_balance_bulk_using_post(aggregation_account_balance)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_balance_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**list[AggregationAccountBalance]**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**list[AggregationAccountBalance]**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_balance_using_post**
> AggregationAccountBalance create_aggregation_account_balance_using_post(aggregation_account_balance)

Create an aggregation account balance

Create a balance record under an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_balance = nucleus_api.AggregationAccountBalance() # AggregationAccountBalance | aggregationAccountBalance

try:
    # Create an aggregation account balance
    api_response = api_instance.create_aggregation_account_balance_using_post(aggregation_account_balance)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_balance_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_bulk_using_post**
> list[AggregationAccount] create_aggregation_account_bulk_using_post(aggregation_account_list)

Create a bulk aggregation account

Create a bulk aggregation account under a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_list = [nucleus_api.AggregationAccount()] # list[AggregationAccount] | aggregationAccountList

try:
    # Create a bulk aggregation account
    api_response = api_instance.create_aggregation_account_bulk_using_post(aggregation_account_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**list[AggregationAccount]**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**list[AggregationAccount]**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_holding_bulk_using_post**
> list[AggregationAccountHolding] create_aggregation_account_holding_bulk_using_post(aggregation_transaction)

Create a bulk aggregation account holding

Create a bulk aggregation account holding.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_transaction = [nucleus_api.AggregationAccountHolding()] # list[AggregationAccountHolding] | aggregationTransaction

try:
    # Create a bulk aggregation account holding
    api_response = api_instance.create_aggregation_account_holding_bulk_using_post(aggregation_transaction)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_holding_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_transaction** | [**list[AggregationAccountHolding]**](AggregationAccountHolding.md)| aggregationTransaction | 

### Return type

[**list[AggregationAccountHolding]**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_holding_using_post**
> AggregationAccountHolding create_aggregation_account_holding_using_post(aggregation_account_holding)

Create an aggregation account holding

Create a holding record under an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_holding = nucleus_api.AggregationAccountHolding() # AggregationAccountHolding | aggregationAccountHolding

try:
    # Create an aggregation account holding
    api_response = api_instance.create_aggregation_account_holding_using_post(aggregation_account_holding)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_holding_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_transaction_bulk_using_post**
> list[AggregationAccountTransaction] create_aggregation_account_transaction_bulk_using_post(aggregation_account_transactions)

Create a bulk aggregation account transaction

Create a bulk transaction record under an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_transactions = [nucleus_api.AggregationAccountTransaction()] # list[AggregationAccountTransaction] | aggregationAccountTransactions

try:
    # Create a bulk aggregation account transaction
    api_response = api_instance.create_aggregation_account_transaction_bulk_using_post(aggregation_account_transactions)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_transaction_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transactions** | [**list[AggregationAccountTransaction]**](AggregationAccountTransaction.md)| aggregationAccountTransactions | 

### Return type

[**list[AggregationAccountTransaction]**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_transaction_using_post**
> AggregationAccountTransaction create_aggregation_account_transaction_using_post(aggregation_account_transaction)

Create an aggregation account transaction

Create a transaction record under an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_transaction = nucleus_api.AggregationAccountTransaction() # AggregationAccountTransaction | aggregationAccountTransaction

try:
    # Create an aggregation account transaction
    api_response = api_instance.create_aggregation_account_transaction_using_post(aggregation_account_transaction)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_transaction_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregationAccountTransaction | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_aggregation_account_using_post**
> AggregationAccount create_aggregation_account_using_post(aggregation_account)

Create an aggregation account

Create an aggregation account under a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account = nucleus_api.AggregationAccount() # AggregationAccount | aggregationAccount

try:
    # Create an aggregation account
    api_response = api_instance.create_aggregation_account_using_post(aggregation_account)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->create_aggregation_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**AggregationAccount**](AggregationAccount.md)| aggregationAccount | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_aggregation_account_balance_using_delete**
> delete_aggregation_account_balance_using_delete(aggregation_account_balance_id)

Delete an aggregation account balance

Permanently delete a balance record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_balance_id = 'aggregation_account_balance_id_example' # str | UUID aggregation_account_balance_id

try:
    # Delete an aggregation account balance
    api_instance.delete_aggregation_account_balance_using_delete(aggregation_account_balance_id)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->delete_aggregation_account_balance_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**str**](.md)| UUID aggregation_account_balance_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_aggregation_account_holding_using_delete**
> delete_aggregation_account_holding_using_delete(aggregation_account_holding_id)

Delete an aggregation account holding

Permanently delete a holding record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_holding_id = 'aggregation_account_holding_id_example' # str | UUID aggregation_account_holding_id

try:
    # Delete an aggregation account holding
    api_instance.delete_aggregation_account_holding_using_delete(aggregation_account_holding_id)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->delete_aggregation_account_holding_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**str**](.md)| UUID aggregation_account_holding_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_aggregation_account_transaction_using_delete**
> delete_aggregation_account_transaction_using_delete(aggregation_account_transaction_id)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # str | UUID aggregation_account_transaction_id

try:
    # Delete an aggregation account transaction
    api_instance.delete_aggregation_account_transaction_using_delete(aggregation_account_transaction_id)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->delete_aggregation_account_transaction_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**str**](.md)| UUID aggregation_account_transaction_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_aggregation_account_using_delete**
> delete_aggregation_account_using_delete(aggregation_account_id)

Delete an aggregation account

Permanently delete an aggregation account under a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_id = 'aggregation_account_id_example' # str | UUID aggregation_account_id

try:
    # Delete an aggregation account
    api_instance.delete_aggregation_account_using_delete(aggregation_account_id)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->delete_aggregation_account_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**str**](.md)| UUID aggregation_account_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_aggregate_data_using_get**
> object get_aggregation_account_aggregate_data_using_get(aggregation_account_id, currency_conversion=currency_conversion)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_id = 'aggregation_account_id_example' # str | UUID aggregation_account_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an aggregation account aggregate data
    api_response = api_instance.get_aggregation_account_aggregate_data_using_get(aggregation_account_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_aggregate_data_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**str**](.md)| UUID aggregation_account_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_all_using_get**
> PageAggregationAccount get_aggregation_account_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all aggregation accounts

Get information for all aggregation accounts for all clients defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all aggregation accounts
    api_response = api_instance.get_aggregation_account_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccount**](PageAggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_balance_all_using_get**
> PageAggregationAccountBalance get_aggregation_account_balance_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all aggregation account balances

Get all of the balance records for all aggregation accounts defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all aggregation account balances
    api_response = api_instance.get_aggregation_account_balance_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_balance_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountBalance**](PageAggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_balance_using_get**
> AggregationAccountBalance get_aggregation_account_balance_using_get(aggregation_account_balance_id, currency_conversion=currency_conversion)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_balance_id = 'aggregation_account_balance_id_example' # str | UUID aggregation_account_balance_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an aggregation account balance
    api_response = api_instance.get_aggregation_account_balance_using_get(aggregation_account_balance_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance_id** | [**str**](.md)| UUID aggregation_account_balance_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_holding_all_using_get**
> PageAggregationAccountHolding get_aggregation_account_holding_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all aggregation account holdings

Get all of the holding records for all aggregation accounts defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all aggregation account holdings
    api_response = api_instance.get_aggregation_account_holding_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_holding_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountHolding**](PageAggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_holding_using_get**
> AggregationAccountHolding get_aggregation_account_holding_using_get(aggregation_account_holding_id, currency_conversion=currency_conversion)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_holding_id = 'aggregation_account_holding_id_example' # str | UUID aggregation_account_holding_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an aggregation account holding
    api_response = api_instance.get_aggregation_account_holding_using_get(aggregation_account_holding_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding_id** | [**str**](.md)| UUID aggregation_account_holding_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_overview_using_get**
> object get_aggregation_account_overview_using_get(client_id, currency_conversion=currency_conversion)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an aggregation account aggregate data
    api_response = api_instance.get_aggregation_account_overview_using_get(client_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_overview_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_transaction_all_using_get**
> PageAggregationAccountTransaction get_aggregation_account_transaction_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all aggregation account transactions

Get all of the transaction records for all aggregation accounts defined for your firm.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all aggregation account transactions
    api_response = api_instance.get_aggregation_account_transaction_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAggregationAccountTransaction**](PageAggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_transaction_using_get**
> AggregationAccountTransaction get_aggregation_account_transaction_using_get(aggregation_account_transaction_id, currency_conversion=currency_conversion)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # str | UUID aggregation_account_transaction_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an aggregation account transaction
    api_response = api_instance.get_aggregation_account_transaction_using_get(aggregation_account_transaction_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction_id** | [**str**](.md)| UUID aggregation_account_transaction_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_using_get**
> AggregationAccount get_aggregation_account_using_get(aggregation_account_id)

Retrieve an aggregation account

Retrieve the information for a specific aggregation account associated with a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_id = 'aggregation_account_id_example' # str | UUID aggregation_account_id

try:
    # Retrieve an aggregation account
    api_response = api_instance.get_aggregation_account_using_get(aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->get_aggregation_account_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_id** | [**str**](.md)| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_balance_using_put**
> AggregationAccountBalance update_aggregation_account_balance_using_put(aggregation_account_balance, aggregation_account_balance_id)

Update an aggregation account balance

Update a balance record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_balance = nucleus_api.AggregationAccountBalance() # AggregationAccountBalance | aggregation_account_balance
aggregation_account_balance_id = 'aggregation_account_balance_id_example' # str | UUID aggregation_account_balance_id

try:
    # Update an aggregation account balance
    api_response = api_instance.update_aggregation_account_balance_using_put(aggregation_account_balance, aggregation_account_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_balance_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_balance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregation_account_balance | 
 **aggregation_account_balance_id** | [**str**](.md)| UUID aggregation_account_balance_id | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_bulk_using_put**
> list[AggregationAccount] update_aggregation_account_bulk_using_put(aggregation_account_list)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_list = [nucleus_api.AggregationAccount()] # list[AggregationAccount] | aggregationAccountList

try:
    # Update a bulk aggregation account
    api_response = api_instance.update_aggregation_account_bulk_using_put(aggregation_account_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_bulk_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_list** | [**list[AggregationAccount]**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**list[AggregationAccount]**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_holding_bulk_using_put**
> list[AggregationAccountHolding] update_aggregation_account_holding_bulk_using_put(aggregation_account_holding)

Update an bulk aggregation account holding

Update a bulk holding record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_holding = [nucleus_api.AggregationAccountHolding()] # list[AggregationAccountHolding] | aggregationAccountHolding

try:
    # Update an bulk aggregation account holding
    api_response = api_instance.update_aggregation_account_holding_bulk_using_put(aggregation_account_holding)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_holding_bulk_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**list[AggregationAccountHolding]**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**list[AggregationAccountHolding]**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_holding_using_put**
> AggregationAccountHolding update_aggregation_account_holding_using_put(aggregation_account_holding, aggregation_account_holding_id)

Update an aggregation account holding

Update a holding record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_holding = nucleus_api.AggregationAccountHolding() # AggregationAccountHolding | aggregation_account_holding
aggregation_account_holding_id = 'aggregation_account_holding_id_example' # str | UUID aggregation_account_holding_id

try:
    # Update an aggregation account holding
    api_response = api_instance.update_aggregation_account_holding_using_put(aggregation_account_holding, aggregation_account_holding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_holding_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_holding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregation_account_holding | 
 **aggregation_account_holding_id** | [**str**](.md)| UUID aggregation_account_holding_id | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_transaction_using_put**
> AggregationAccountTransaction update_aggregation_account_transaction_using_put(aggregation_account_transaction, aggregation_account_transaction_id)

Update an aggregation account transaction

Update a transaction record for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account_transaction = nucleus_api.AggregationAccountTransaction() # AggregationAccountTransaction | aggregation_account_transaction
aggregation_account_transaction_id = 'aggregation_account_transaction_id_example' # str | UUID aggregation_account_transaction_id

try:
    # Update an aggregation account transaction
    api_response = api_instance.update_aggregation_account_transaction_using_put(aggregation_account_transaction, aggregation_account_transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_transaction_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account_transaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregation_account_transaction | 
 **aggregation_account_transaction_id** | [**str**](.md)| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_aggregation_account_using_put**
> AggregationAccount update_aggregation_account_using_put(aggregation_account, aggregation_account_id)

Update an aggregation account

Update the information for an aggregation account.

### Example
```python
from __future__ import print_function
import time
import nucleus_api
from nucleus_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = nucleus_api.Configuration()

# create an instance of the API class
api_instance = nucleus_api.AuthApi(nucleus_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = nucleus_api.AggregationAccountApi(nucleus_api.ApiClient(configuration))
aggregation_account = nucleus_api.AggregationAccount() # AggregationAccount | aggregation_account
aggregation_account_id = 'aggregation_account_id_example' # str | UUID aggregation_account_id

try:
    # Update an aggregation account
    api_response = api_instance.update_aggregation_account_using_put(aggregation_account, aggregation_account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AggregationAccountApi->update_aggregation_account_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregation_account** | [**AggregationAccount**](AggregationAccount.md)| aggregation_account | 
 **aggregation_account_id** | [**str**](.md)| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

