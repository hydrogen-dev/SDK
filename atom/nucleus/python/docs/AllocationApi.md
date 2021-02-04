# nucleus_api.AllocationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_allocation_composition_using_post**](AllocationApi.md#create_allocation_composition_using_post) | **POST** /allocation_composition | Create an allocation composition
[**create_allocation_using_post**](AllocationApi.md#create_allocation_using_post) | **POST** /allocation | Create an allocation
[**delete_allocation_composition_using_delete**](AllocationApi.md#delete_allocation_composition_using_delete) | **DELETE** /allocation_composition/{allocation_composition_id} | Delete an allocation composition
[**delete_allocation_using_delete**](AllocationApi.md#delete_allocation_using_delete) | **DELETE** /allocation/{allocation_id} | Delete an allocation
[**get_allocation_all_aggregate_data_using_get**](AllocationApi.md#get_allocation_all_aggregate_data_using_get) | **GET** /allocation/{allocation_id}/aggregate_data | List all Allocation aggregated data overview
[**get_allocation_all_asset_size_all_using_get**](AllocationApi.md#get_allocation_all_asset_size_all_using_get) | **GET** /allocation/{allocation_id}/asset_size | List all allocation asset sizes
[**get_allocation_all_holding_all_using_get**](AllocationApi.md#get_allocation_all_holding_all_using_get) | **GET** /allocation/{allocation_id}/holding | List all allocation holdings
[**get_allocation_all_transaction_all_using_get**](AllocationApi.md#get_allocation_all_transaction_all_using_get) | **GET** /allocation/{allocation_id}/transaction | List all allocation transactions
[**get_allocation_all_using_get**](AllocationApi.md#get_allocation_all_using_get) | **GET** /allocation | List all allocations
[**get_allocation_composition_all_using_get**](AllocationApi.md#get_allocation_composition_all_using_get) | **GET** /allocation_composition | List all allocations compositions
[**get_allocation_composition_using_get**](AllocationApi.md#get_allocation_composition_using_get) | **GET** /allocation_composition/{allocation_composition_id} | Retrieve an allocation composition
[**get_allocation_using_get**](AllocationApi.md#get_allocation_using_get) | **GET** /allocation/{allocation_id} | Retrieve an allocation
[**update_allocation_composition_using_put**](AllocationApi.md#update_allocation_composition_using_put) | **PUT** /allocation_composition/{allocation_composition_id} | Update an allocation composition
[**update_allocation_using_put**](AllocationApi.md#update_allocation_using_put) | **PUT** /allocation/{allocation_id} | Update an allocation


# **create_allocation_composition_using_post**
> AllocationComposition create_allocation_composition_using_post(alloc_request)

Create an allocation composition

Create a new allocation composition record for an allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
alloc_request = nucleus_api.AllocationComposition() # AllocationComposition | allocRequest

try:
    # Create an allocation composition
    api_response = api_instance.create_allocation_composition_using_post(alloc_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->create_allocation_composition_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alloc_request** | [**AllocationComposition**](AllocationComposition.md)| allocRequest | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_allocation_using_post**
> Allocation create_allocation_using_post(allocation_request)

Create an allocation

Create a new allocation for your firm.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_request = nucleus_api.Allocation() # Allocation | allocationRequest

try:
    # Create an allocation
    api_response = api_instance.create_allocation_using_post(allocation_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->create_allocation_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_request** | [**Allocation**](Allocation.md)| allocationRequest | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_allocation_composition_using_delete**
> delete_allocation_composition_using_delete(allocation_composition_id)

Delete an allocation composition

Permanently delete an allocation composition record for an allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_composition_id = 'allocation_composition_id_example' # str | UUID allocation_composition_id

try:
    # Delete an allocation composition
    api_instance.delete_allocation_composition_using_delete(allocation_composition_id)
except ApiException as e:
    print("Exception when calling AllocationApi->delete_allocation_composition_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**str**](.md)| UUID allocation_composition_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_allocation_using_delete**
> delete_allocation_using_delete(allocation_id)

Delete an allocation

Permanently delete an allocation defined by your firm.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | UUID allocation_id

try:
    # Delete an allocation
    api_instance.delete_allocation_using_delete(allocation_id)
except ApiException as e:
    print("Exception when calling AllocationApi->delete_allocation_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| UUID allocation_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_all_aggregate_data_using_get**
> AllocationAggregatedVO get_allocation_all_aggregate_data_using_get(allocation_id)

List all Allocation aggregated data overview

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | Allocation Id

try:
    # List all Allocation aggregated data overview
    api_response = api_instance.get_allocation_all_aggregate_data_using_get(allocation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_all_aggregate_data_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| Allocation Id | 

### Return type

[**AllocationAggregatedVO**](AllocationAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_all_asset_size_all_using_get**
> list[DateDoubleVO] get_allocation_all_asset_size_all_using_get(allocation_id, end_date=end_date, get_latest=get_latest, is_current_weight=is_current_weight, sort_type=sort_type, start_date=start_date)

List all allocation asset sizes

Get a list of asset sizes by date for a specific allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | UUID allocation_id
end_date = '2013-10-20' # date | end date (optional)
get_latest = true # bool | get_latest (optional)
is_current_weight = true # bool | is_current_weight (optional) (default to true)
sort_type = 'sort_type_example' # str | D (Daily), Q (quarterly), M (Monthly), Y (Annually)  (optional)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all allocation asset sizes
    api_response = api_instance.get_allocation_all_asset_size_all_using_get(allocation_id, end_date=end_date, get_latest=get_latest, is_current_weight=is_current_weight, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_all_asset_size_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| UUID allocation_id | 
 **end_date** | **date**| end date | [optional] 
 **get_latest** | **bool**| get_latest | [optional] 
 **is_current_weight** | **bool**| is_current_weight | [optional] [default to true]
 **sort_type** | **str**| D (Daily), Q (quarterly), M (Monthly), Y (Annually)  | [optional] 
 **start_date** | **date**| start date | [optional] 

### Return type

[**list[DateDoubleVO]**](DateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_all_holding_all_using_get**
> list[ModelHoldingVO] get_allocation_all_holding_all_using_get(allocation_id, end_date=end_date, start_date=start_date)

List all allocation holdings

Get the information for all securities assigned to a specific allocation. 

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | UUID allocation_id
end_date = '2013-10-20' # date | end date (optional)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all allocation holdings
    api_response = api_instance.get_allocation_all_holding_all_using_get(allocation_id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_all_holding_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| UUID allocation_id | 
 **end_date** | **date**| end date | [optional] 
 **start_date** | **date**| start date | [optional] 

### Return type

[**list[ModelHoldingVO]**](ModelHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_all_transaction_all_using_get**
> PageModelTransaction get_allocation_all_transaction_all_using_get(allocation_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all allocation transactions

Get the information for all transactions made under an allocation to achieve the composition of the allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | UUID allocation_id
ascending = false # bool | ascending (optional) (default to false)
end_date = '2013-10-20' # date | end date (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all allocation transactions
    api_response = api_instance.get_allocation_all_transaction_all_using_get(allocation_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_all_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| UUID allocation_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **date**| end date | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **date**| start date | [optional] 

### Return type

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_all_using_get**
> PageAllocation get_allocation_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all allocations

Get details for all allocations defined for your firm.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all allocations
    api_response = api_instance.get_allocation_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_all_using_get: %s\n" % e)
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

[**PageAllocation**](PageAllocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_composition_all_using_get**
> PageAllocationComposition get_allocation_composition_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all allocations compositions

Get the allocation composition for all allocations.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all allocations compositions
    api_response = api_instance.get_allocation_composition_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_composition_all_using_get: %s\n" % e)
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

[**PageAllocationComposition**](PageAllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_composition_using_get**
> AllocationComposition get_allocation_composition_using_get(allocation_composition_id)

Retrieve an allocation composition

Retrieve the information of an allocation composition record for an allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_composition_id = 'allocation_composition_id_example' # str | UUID allocation_composition_id

try:
    # Retrieve an allocation composition
    api_response = api_instance.get_allocation_composition_using_get(allocation_composition_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_composition_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition_id** | [**str**](.md)| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_allocation_using_get**
> Allocation get_allocation_using_get(allocation_id)

Retrieve an allocation

Retrieve the information for an allocation defined by your firm.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_id = 'allocation_id_example' # str | UUID allocation_id

try:
    # Retrieve an allocation
    api_response = api_instance.get_allocation_using_get(allocation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->get_allocation_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_id** | [**str**](.md)| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_allocation_composition_using_put**
> AllocationComposition update_allocation_composition_using_put(allocation_composition, allocation_composition_id)

Update an allocation composition

Update the information of an allocation composition record for an allocation.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation_composition = NULL # object | allocation_composition
allocation_composition_id = 'allocation_composition_id_example' # str | UUID allocation_composition_id

try:
    # Update an allocation composition
    api_response = api_instance.update_allocation_composition_using_put(allocation_composition, allocation_composition_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->update_allocation_composition_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation_composition** | **object**| allocation_composition | 
 **allocation_composition_id** | [**str**](.md)| UUID allocation_composition_id | 

### Return type

[**AllocationComposition**](AllocationComposition.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_allocation_using_put**
> Allocation update_allocation_using_put(allocation, allocation_id)

Update an allocation

Update an allocation defined by your firm.

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


# create an instance of the API class
api_instance = nucleus_api.AllocationApi(nucleus_api.ApiClient(configuration))
allocation = NULL # object | allocation
allocation_id = 'allocation_id_example' # str | UUID allocation_id

try:
    # Update an allocation
    api_response = api_instance.update_allocation_using_put(allocation, allocation_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AllocationApi->update_allocation_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | **object**| allocation | 
 **allocation_id** | [**str**](.md)| UUID allocation_id | 

### Return type

[**Allocation**](Allocation.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

