# atom_api.AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_account_allocation_mapping_using_post**](AccountApi.md#create_account_allocation_mapping_using_post) | **POST** /account_allocation | Create an account allocation
[**create_account_type_using_post**](AccountApi.md#create_account_type_using_post) | **POST** /account_type | Create an account type
[**create_account_using_post**](AccountApi.md#create_account_using_post) | **POST** /account | Create an account
[**delete_account_allocation_mapping_using_delete**](AccountApi.md#delete_account_allocation_mapping_using_delete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**delete_account_permission_using_delete**](AccountApi.md#delete_account_permission_using_delete) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**delete_account_type_using_delete**](AccountApi.md#delete_account_type_using_delete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**delete_account_using_delete**](AccountApi.md#delete_account_using_delete) | **DELETE** /account/{account_id} | Delete an account
[**get_account_all_using_get**](AccountApi.md#get_account_all_using_get) | **GET** /account | List all accounts
[**get_account_allocation_mapping_all_using_get**](AccountApi.md#get_account_allocation_mapping_all_using_get) | **GET** /account_allocation | List all account allocations
[**get_account_allocation_mapping_using_get**](AccountApi.md#get_account_allocation_mapping_using_get) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**get_account_asset_size_agg_all_using_get**](AccountApi.md#get_account_asset_size_agg_all_using_get) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**get_account_asset_size_all_using_get**](AccountApi.md#get_account_asset_size_all_using_get) | **GET** /account_asset_size | List all account asset sizes
[**get_account_overview_using_get**](AccountApi.md#get_account_overview_using_get) | **GET** /account/{account_id}/account_overview | List all Account overview
[**get_account_permission_using_get**](AccountApi.md#get_account_permission_using_get) | **GET** /account_permission/{account_id} | Get an account permission
[**get_account_type_all_using_get**](AccountApi.md#get_account_type_all_using_get) | **GET** /account_type | List all account types
[**get_account_type_using_get**](AccountApi.md#get_account_type_using_get) | **GET** /account_type/{account_type_id} | Get an Account Type
[**get_account_using_get**](AccountApi.md#get_account_using_get) | **GET** /account/{account_id} | Retrieve an account
[**get_all_account_permission_using_get**](AccountApi.md#get_all_account_permission_using_get) | **GET** /account_permission | List all account permission
[**get_portfolio_holding_agg_all_using_get**](AccountApi.md#get_portfolio_holding_agg_all_using_get) | **GET** /account/{account_id}/holding | List all account holdings
[**get_portfolio_transaction_agg_all_using_get**](AccountApi.md#get_portfolio_transaction_agg_all_using_get) | **GET** /account/{account_id}/transaction | List all account transactions
[**insert_account_and_related_permission_using_post**](AccountApi.md#insert_account_and_related_permission_using_post) | **POST** /account_permission | create an account permission
[**subscribe_account_using_post**](AccountApi.md#subscribe_account_using_post) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**update_account_allocation_mapping_using_put**](AccountApi.md#update_account_allocation_mapping_using_put) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**update_account_type_using_put**](AccountApi.md#update_account_type_using_put) | **PUT** /account_type/{account_type_id} | Update an account type
[**update_account_using_put**](AccountApi.md#update_account_using_put) | **PUT** /account/{account_id} | Update an account
[**update_client_account_permission_using_put**](AccountApi.md#update_client_account_permission_using_put) | **PUT** /account_permission/{account_id} | Update an account permission


# **create_account_allocation_mapping_using_post**
> AccountAllocationMapping create_account_allocation_mapping_using_post(alloc_request)

Create an account allocation

Create an account-allocation mapping for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
alloc_request = atom_api.AccountAllocationMapping() # AccountAllocationMapping | allocRequest

try:
    # Create an account allocation
    api_response = api_instance.create_account_allocation_mapping_using_post(alloc_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->create_account_allocation_mapping_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_type_using_post**
> AccountType create_account_type_using_post(account_type_request)

Create an account type

Create a new account type for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_type_request = atom_api.AccountType() # AccountType | accountTypeRequest

try:
    # Create an account type
    api_response = api_instance.create_account_type_using_post(account_type_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->create_account_type_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_request** | [**AccountType**](AccountType.md)| accountTypeRequest | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_using_post**
> Account create_account_using_post(client_account_request)

Create an account

Create an account under a client.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
client_account_request = atom_api.Account() # Account | clientAccountRequest

try:
    # Create an account
    api_response = api_instance.create_account_using_post(client_account_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->create_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_account_request** | [**Account**](Account.md)| clientAccountRequest | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_allocation_mapping_using_delete**
> delete_account_allocation_mapping_using_delete(account_allocation_id)

Delete an account allocation

Permanently delete an account-allocation mapping for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_allocation_id = 'account_allocation_id_example' # str | UUID account_allocation_id

try:
    # Delete an account allocation
    api_instance.delete_account_allocation_mapping_using_delete(account_allocation_id)
except ApiException as e:
    print("Exception when calling AccountApi->delete_account_allocation_mapping_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**str**](.md)| UUID account_allocation_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_permission_using_delete**
> AccountPermissionVO delete_account_permission_using_delete(account_id)

Delete an account permission

Delete an account permission

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id

try:
    # Delete an account permission
    api_response = api_instance.delete_account_permission_using_delete(account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->delete_account_permission_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_type_using_delete**
> delete_account_type_using_delete(account_type_id, account_type_id2)

Delete an account type

Permanently delete a possible account type defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_type_id = 'account_type_id_example' # str | UUID account_type_id
account_type_id2 = 'account_type_id_example' # str | account_type_id

try:
    # Delete an account type
    api_instance.delete_account_type_using_delete(account_type_id, account_type_id2)
except ApiException as e:
    print("Exception when calling AccountApi->delete_account_type_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**str**](.md)| UUID account_type_id | 
 **account_type_id2** | [**str**](.md)| account_type_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_account_using_delete**
> delete_account_using_delete(account_id)

Delete an account

Permanently delete an account under a client.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id

try:
    # Delete an account
    api_instance.delete_account_using_delete(account_id)
except ApiException as e:
    print("Exception when calling AccountApi->delete_account_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_all_using_get**
> PageAccount get_account_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all accounts

Get information for all accounts for all clients defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all accounts
    api_response = api_instance.get_account_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_all_using_get: %s\n" % e)
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

[**PageAccount**](PageAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_allocation_mapping_all_using_get**
> PageAccountAllocationMapping get_account_allocation_mapping_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account allocations
    api_response = api_instance.get_account_allocation_mapping_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_allocation_mapping_all_using_get: %s\n" % e)
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

[**PageAccountAllocationMapping**](PageAccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_allocation_mapping_using_get**
> AccountAllocationMapping get_account_allocation_mapping_using_get(account_allocation_id)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_allocation_id = 'account_allocation_id_example' # str | UUID account_allocation_id

try:
    # Retrieve an account allocation
    api_response = api_instance.get_account_allocation_mapping_using_get(account_allocation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_allocation_mapping_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**str**](.md)| UUID account_allocation_id | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_asset_size_agg_all_using_get**
> list[AvailableDateDoubleVO] get_account_asset_size_agg_all_using_get(account_id, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)

List all account asset sizes

Get a list of asset sizes by date for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | Account Id
end_date = '2013-10-20' # date | end date (optional)
exclude_subledger = false # bool | exclude_subledger (optional) (default to false)
get_latest = true # bool | true or false (optional)
sort_type = 'sort_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () (optional)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all account asset sizes
    api_response = api_instance.get_account_asset_size_agg_all_using_get(account_id, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_asset_size_agg_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| Account Id | 
 **end_date** | **date**| end date | [optional] 
 **exclude_subledger** | **bool**| exclude_subledger | [optional] [default to false]
 **get_latest** | **bool**| true or false | [optional] 
 **sort_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **date**| start date | [optional] 

### Return type

[**list[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_asset_size_all_using_get**
> PageVAccountAssetSize get_account_asset_size_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account asset sizes

Get information for all account asset sizes

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'date' # str | order_by (optional) (default to date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account asset sizes
    api_response = api_instance.get_account_asset_size_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_asset_size_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageVAccountAssetSize**](PageVAccountAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_overview_using_get**
> AccountOverviewVO get_account_overview_using_get(account_id, ascending=ascending, order_by=order_by)

List all Account overview

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id
ascending = false # bool | ascending (optional) (default to false)
order_by = 'update_date' # str | order_by (optional) (default to update_date)

try:
    # List all Account overview
    api_response = api_instance.get_account_overview_using_get(account_id, ascending=ascending, order_by=order_by)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_overview_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **order_by** | **str**| order_by | [optional] [default to update_date]

### Return type

[**AccountOverviewVO**](AccountOverviewVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_permission_using_get**
> AccountPermissionVO get_account_permission_using_get(account_id)

Get an account permission

Get an account permission

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id

try:
    # Get an account permission
    api_response = api_instance.get_account_permission_using_get(account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_permission_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_type_all_using_get**
> PageAccountType get_account_type_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account types

List all account types defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account types
    api_response = api_instance.get_account_type_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_type_all_using_get: %s\n" % e)
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

[**PageAccountType**](PageAccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_type_using_get**
> AccountType get_account_type_using_get(account_type_id, account_type_id2)

Get an Account Type

Get an account types defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_type_id = 'account_type_id_example' # str | UUID account_type_id
account_type_id2 = 'account_type_id_example' # str | account_type_id

try:
    # Get an Account Type
    api_response = api_instance.get_account_type_using_get(account_type_id, account_type_id2)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_type_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type_id** | [**str**](.md)| UUID account_type_id | 
 **account_type_id2** | [**str**](.md)| account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_account_using_get**
> Account get_account_using_get(account_id)

Retrieve an account

Retrieve the information for a specific account associated with a client.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id

try:
    # Retrieve an account
    api_response = api_instance.get_account_using_get(account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_account_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_account_permission_using_get**
> PageAccountPermissionVO get_all_account_permission_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all account permission

List all account permission

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all account permission
    api_response = api_instance.get_all_account_permission_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_all_account_permission_using_get: %s\n" % e)
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

[**PageAccountPermissionVO**](PageAccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_holding_agg_all_using_get**
> list[PortfolioHoldingAgg] get_portfolio_holding_agg_all_using_get(account_id, end_date=end_date, get_latest=get_latest, start_date=start_date)

List all account holdings

Get information for all the securities that are currently being held by an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id
end_date = 'end_date_example' # str | end date  (optional)
get_latest = true # bool | true or false (optional)
start_date = 'start_date_example' # str | start date  (optional)

try:
    # List all account holdings
    api_response = api_instance.get_portfolio_holding_agg_all_using_get(account_id, end_date=end_date, get_latest=get_latest, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_portfolio_holding_agg_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 
 **end_date** | **str**| end date  | [optional] 
 **get_latest** | **bool**| true or false | [optional] 
 **start_date** | **str**| start date  | [optional] 

### Return type

[**list[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_transaction_agg_all_using_get**
> PagePortfolioTransaction get_portfolio_transaction_agg_all_using_get(account_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all account transactions

Get the information for all transactions for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id
ascending = false # bool | ascending (optional) (default to false)
end_date = 'null' # datetime | end_date (optional) (default to null)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = 'null' # datetime | start_date (optional) (default to null)

try:
    # List all account transactions
    api_response = api_instance.get_portfolio_transaction_agg_all_using_get(account_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->get_portfolio_transaction_agg_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **datetime**| end_date | [optional] [default to null]
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **datetime**| start_date | [optional] [default to null]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **insert_account_and_related_permission_using_post**
> AccountPermissionVO insert_account_and_related_permission_using_post(acl_client_permission_vo)

create an account permission

create an account permission

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
acl_client_permission_vo = atom_api.AclClientPermissionVO() # AclClientPermissionVO | aclClientPermissionVO

try:
    # create an account permission
    api_response = api_instance.insert_account_and_related_permission_using_post(acl_client_permission_vo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->insert_account_and_related_permission_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acl_client_permission_vo** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subscribe_account_using_post**
> list[Portfolio] subscribe_account_using_post(account_id, alloc_request)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | UUID account_id
alloc_request = atom_api.AccountAllocationMapping() # AccountAllocationMapping | allocRequest

try:
    # Subscribe an account
    api_response = api_instance.subscribe_account_using_post(account_id, alloc_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->subscribe_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| UUID account_id | 
 **alloc_request** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**list[Portfolio]**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_account_allocation_mapping_using_put**
> AccountAllocationMapping update_account_allocation_mapping_using_put(account_allocation_id, account_allocation_mapping=account_allocation_mapping)

Update an account allocation

Update the information for an account-allocation mapping.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_allocation_id = 'account_allocation_id_example' # str | UUID account_allocation_id
account_allocation_mapping = atom_api.AccountAllocationMapping() # AccountAllocationMapping | account_allocation_mapping (optional)

try:
    # Update an account allocation
    api_response = api_instance.update_account_allocation_mapping_using_put(account_allocation_id, account_allocation_mapping=account_allocation_mapping)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->update_account_allocation_mapping_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_allocation_id** | [**str**](.md)| UUID account_allocation_id | 
 **account_allocation_mapping** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| account_allocation_mapping | [optional] 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_account_type_using_put**
> AccountType update_account_type_using_put(account_type, account_type_id)

Update an account type

Update the information for a possible account type defined for your firm.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_type = atom_api.AccountType() # AccountType | account_type
account_type_id = 'account_type_id_example' # str | UUID account_type_id

try:
    # Update an account type
    api_response = api_instance.update_account_type_using_put(account_type, account_type_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->update_account_type_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_type** | [**AccountType**](AccountType.md)| account_type | 
 **account_type_id** | [**str**](.md)| UUID account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_account_using_put**
> Account update_account_using_put(account, account_id)

Update an account

Update the information for an account.

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account = atom_api.Account() # Account | account
account_id = 'account_id_example' # str | UUID account_id

try:
    # Update an account
    api_response = api_instance.update_account_using_put(account, account_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->update_account_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| account | 
 **account_id** | [**str**](.md)| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_account_permission_using_put**
> AccountPermissionVO update_client_account_permission_using_put(account_id, acl_client_permission_vo)

Update an account permission

Update an account permission

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
api_instance = atom_api.AccountApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
acl_client_permission_vo = atom_api.AclClientPermissionVO() # AclClientPermissionVO | aclClientPermissionVO

try:
    # Update an account permission
    api_response = api_instance.update_client_account_permission_using_put(account_id, acl_client_permission_vo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccountApi->update_client_account_permission_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **acl_client_permission_vo** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

