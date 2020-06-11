# atom_api.UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_account_status_using_post**](UtilsApi.md#create_account_status_using_post) | **POST** /account_status | Create an account status
[**create_stage_using_post**](UtilsApi.md#create_stage_using_post) | **POST** /stage | Create an account stage
[**create_transaction_code_using_post**](UtilsApi.md#create_transaction_code_using_post) | **POST** /transaction_code | Create a transaction code
[**delete_account_status_using_delete**](UtilsApi.md#delete_account_status_using_delete) | **DELETE** /account_status/{account_status_id} | Delete an account status
[**delete_stage_using_delete**](UtilsApi.md#delete_stage_using_delete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**delete_transaction_code_using_delete**](UtilsApi.md#delete_transaction_code_using_delete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**get_account_status_all_using_get**](UtilsApi.md#get_account_status_all_using_get) | **GET** /account_status | List all account statuses
[**get_account_status_using_get**](UtilsApi.md#get_account_status_using_get) | **GET** /account_status/{account_status_id} | Retrieve an account status
[**get_stage_all_using_get**](UtilsApi.md#get_stage_all_using_get) | **GET** /stage | List all account stages
[**get_stage_using_get**](UtilsApi.md#get_stage_using_get) | **GET** /stage/{stage_id} | Retrieve an account stage
[**get_transaction_code_all_using_get**](UtilsApi.md#get_transaction_code_all_using_get) | **GET** /transaction_code | List all transaction codes
[**get_transaction_code_using_get**](UtilsApi.md#get_transaction_code_using_get) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**update_account_status_using_put**](UtilsApi.md#update_account_status_using_put) | **PUT** /account_status/{account_status_id} | Update an account status
[**update_stage_using_put**](UtilsApi.md#update_stage_using_put) | **PUT** /stage/{stage_id} | Update an account stage
[**update_transaction_code_using_put**](UtilsApi.md#update_transaction_code_using_put) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


# **create_account_status_using_post**
> AccountStatus create_account_status_using_post(account_status_request)

Create an account status

Create an account status record for an account.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
account_status_request = atom_api.AccountStatus() # AccountStatus | accountStatusRequest

try:
    # Create an account status
    api_response = api_instance.create_account_status_using_post(account_status_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_account_status_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_request** | [**AccountStatus**](AccountStatus.md)| accountStatusRequest | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_stage_using_post**
> Stage create_stage_using_post(stage_request)

Create an account stage

Create a new account stage

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
stage_request = atom_api.Stage() # Stage | stageRequest

try:
    # Create an account stage
    api_response = api_instance.create_stage_using_post(stage_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_stage_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_request** | [**Stage**](Stage.md)| stageRequest | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transaction_code_using_post**
> TransactionCode create_transaction_code_using_post(transaction_request)

Create a transaction code

Create a new transaction code for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
transaction_request = atom_api.TransactionCode() # TransactionCode | transactionRequest

try:
    # Create a transaction code
    api_response = api_instance.create_transaction_code_using_post(transaction_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_transaction_code_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_request** | [**TransactionCode**](TransactionCode.md)| transactionRequest | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_status_using_delete**
> delete_account_status_using_delete(account_status_id)

Delete an account status

Permanently delete an account status record from an account’s history.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
account_status_id = 'account_status_id_example' # str | UUID account_status_id

try:
    # Delete an account status
    api_instance.delete_account_status_using_delete(account_status_id)
except ApiException as e:
    print("Exception when calling UtilsApi->delete_account_status_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_id** | [**str**](.md)| UUID account_status_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_stage_using_delete**
> delete_stage_using_delete(stage_id)

Delete an account stage

Permanently delete an account stage.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
stage_id = 'stage_id_example' # str | UUID stage_id

try:
    # Delete an account stage
    api_instance.delete_stage_using_delete(stage_id)
except ApiException as e:
    print("Exception when calling UtilsApi->delete_stage_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_id** | [**str**](.md)| UUID stage_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_transaction_code_using_delete**
> delete_transaction_code_using_delete(transaction_code_id)

Delete a transaction code

Permanently delete a transaction code for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
transaction_code_id = 'transaction_code_id_example' # str | UUID transaction_code_id

try:
    # Delete a transaction code
    api_instance.delete_transaction_code_using_delete(transaction_code_id)
except ApiException as e:
    print("Exception when calling UtilsApi->delete_transaction_code_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code_id** | [**str**](.md)| UUID transaction_code_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_status_all_using_get**
> PageAccountStatus get_account_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account statuses

Get the account status history information for all accounts.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account statuses
    api_response = api_instance.get_account_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_account_status_all_using_get: %s\n" % e)
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

[**PageAccountStatus**](PageAccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_status_using_get**
> AccountStatus get_account_status_using_get(account_status_id)

Retrieve an account status

Retrieve the information for a specific account status record for an account.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
account_status_id = 'account_status_id_example' # str | UUID account_status_id

try:
    # Retrieve an account status
    api_response = api_instance.get_account_status_using_get(account_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_account_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status_id** | [**str**](.md)| UUID account_status_id | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stage_all_using_get**
> PageStage get_stage_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account stages

Get the information for all possible account stages.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account stages
    api_response = api_instance.get_stage_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_stage_all_using_get: %s\n" % e)
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

[**PageStage**](PageStage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_stage_using_get**
> Stage get_stage_using_get(stage_id)

Retrieve an account stage

Retrieve the information for a specific account stage.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
stage_id = 'stage_id_example' # str | UUID stage_id

try:
    # Retrieve an account stage
    api_response = api_instance.get_stage_using_get(stage_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_stage_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage_id** | [**str**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transaction_code_all_using_get**
> PageTransactionCode get_transaction_code_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all transaction codes

Get the information for all transaction codes defined by your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all transaction codes
    api_response = api_instance.get_transaction_code_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_transaction_code_all_using_get: %s\n" % e)
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

[**PageTransactionCode**](PageTransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transaction_code_using_get**
> TransactionCode get_transaction_code_using_get(transaction_code_id)

Retrieve a transaction code

Retrieve the information for a transaction code defined by your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
transaction_code_id = 'transaction_code_id_example' # str | UUID transaction_code_id

try:
    # Retrieve a transaction code
    api_response = api_instance.get_transaction_code_using_get(transaction_code_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_transaction_code_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code_id** | [**str**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_account_status_using_put**
> AccountStatus update_account_status_using_put(account_status, account_status_id)

Update an account status

Update an account status record for an account.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
account_status = atom_api.AccountStatus() # AccountStatus | account_status
account_status_id = 'account_status_id_example' # str | UUID account_status_id

try:
    # Update an account status
    api_response = api_instance.update_account_status_using_put(account_status, account_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->update_account_status_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_status** | [**AccountStatus**](AccountStatus.md)| account_status | 
 **account_status_id** | [**str**](.md)| UUID account_status_id | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_stage_using_put**
> Stage update_stage_using_put(stage, stage_id)

Update an account stage

Update the information for an account stage.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
stage = atom_api.Stage() # Stage | stage
stage_id = 'stage_id_example' # str | UUID stage_id

try:
    # Update an account stage
    api_response = api_instance.update_stage_using_put(stage, stage_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->update_stage_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | [**Stage**](Stage.md)| stage | 
 **stage_id** | [**str**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_transaction_code_using_put**
> TransactionCode update_transaction_code_using_put(transaction_code, transaction_code_id)

Update a transaction code

Update a transaction code for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.UtilsApi(atom_api.ApiClient(configuration))
transaction_code = atom_api.TransactionCode() # TransactionCode | transaction_code
transaction_code_id = 'transaction_code_id_example' # str | UUID transaction_code_id

try:
    # Update a transaction code
    api_response = api_instance.update_transaction_code_using_put(transaction_code, transaction_code_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->update_transaction_code_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_code** | [**TransactionCode**](TransactionCode.md)| transaction_code | 
 **transaction_code_id** | [**str**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

