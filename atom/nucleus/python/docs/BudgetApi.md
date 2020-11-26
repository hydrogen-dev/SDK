# nucleus_api.BudgetApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_budget_using_post**](BudgetApi.md#create_budget_using_post) | **POST** /budget | Create a budget request
[**delete_budget_using_delete**](BudgetApi.md#delete_budget_using_delete) | **DELETE** /budget/{budget_id} | Delete a budget request
[**get_budget_all_using_get**](BudgetApi.md#get_budget_all_using_get) | **GET** /budget | List all budget requests
[**get_budget_using_get**](BudgetApi.md#get_budget_using_get) | **GET** /budget/{budget_id} | Retrieve a budget request
[**update_budget_using_put**](BudgetApi.md#update_budget_using_put) | **PUT** /budget/{budget_id} | Update a budget request


# **create_budget_using_post**
> Budget create_budget_using_post(budget_request)

Create a budget request

Create a new budget request.

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
api_instance = nucleus_api.BudgetApi(nucleus_api.ApiClient(configuration))
budget_request = nucleus_api.Budget() # Budget | budgetRequest

try:
    # Create a budget request
    api_response = api_instance.create_budget_using_post(budget_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetApi->create_budget_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_request** | [**Budget**](Budget.md)| budgetRequest | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_budget_using_delete**
> delete_budget_using_delete(budget_id)

Delete a budget request

Permanently delete a budget request.

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
api_instance = nucleus_api.BudgetApi(nucleus_api.ApiClient(configuration))
budget_id = 'budget_id_example' # str | UUID budget_id

try:
    # Delete a budget request
    api_instance.delete_budget_using_delete(budget_id)
except ApiException as e:
    print("Exception when calling BudgetApi->delete_budget_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_id** | [**str**](.md)| UUID budget_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budget_all_using_get**
> PageBudget get_budget_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all budget requests

Get the information for all budget requests.

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
api_instance = nucleus_api.BudgetApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all budget requests
    api_response = api_instance.get_budget_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetApi->get_budget_all_using_get: %s\n" % e)
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

[**PageBudget**](PageBudget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_budget_using_get**
> Budget get_budget_using_get(budget_id, currency_conversion=currency_conversion)

Retrieve a budget request

Retrieve the information for a budget request.

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
api_instance = nucleus_api.BudgetApi(nucleus_api.ApiClient(configuration))
budget_id = 'budget_id_example' # str | UUID budget_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a budget request
    api_response = api_instance.get_budget_using_get(budget_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetApi->get_budget_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget_id** | [**str**](.md)| UUID budget_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_budget_using_put**
> Budget update_budget_using_put(budget, budget_id)

Update a budget request

Update the information for a budget request.

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
api_instance = nucleus_api.BudgetApi(nucleus_api.ApiClient(configuration))
budget = nucleus_api.Budget() # Budget | budget
budget_id = 'budget_id_example' # str | UUID budget_id

try:
    # Update a budget request
    api_response = api_instance.update_budget_using_put(budget, budget_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BudgetApi->update_budget_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget** | [**Budget**](Budget.md)| budget | 
 **budget_id** | [**str**](.md)| UUID budget_id | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

