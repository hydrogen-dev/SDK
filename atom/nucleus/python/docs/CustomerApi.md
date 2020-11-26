# nucleus_api.CustomerApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_customer_revenue_using_post**](CustomerApi.md#create_customer_revenue_using_post) | **POST** /customer_revenue | Create a customer revenue
[**create_customer_using_post**](CustomerApi.md#create_customer_using_post) | **POST** /customer | Create a customer
[**delete_customer_revenue_using_delete**](CustomerApi.md#delete_customer_revenue_using_delete) | **DELETE** /customer_revenue/{customer_revenue_id} | Delete a customer revenue
[**delete_customer_using_delete**](CustomerApi.md#delete_customer_using_delete) | **DELETE** /customer/{customer_id} | Delete a customer
[**get_customer_all_using_get**](CustomerApi.md#get_customer_all_using_get) | **GET** /customer | List all customer
[**get_customer_revenue_all_using_get**](CustomerApi.md#get_customer_revenue_all_using_get) | **GET** /customer_revenue | List all customer revenue
[**get_customer_revenue_using_get**](CustomerApi.md#get_customer_revenue_using_get) | **GET** /customer_revenue/{customer_revenue_id} | Retrieve a customer revenue
[**get_customer_using_get**](CustomerApi.md#get_customer_using_get) | **GET** /customer/{customer_id} | Retrieve a customer
[**update_customer_revenue_using_put**](CustomerApi.md#update_customer_revenue_using_put) | **PUT** /customer_revenue/{customer_revenue_id} | Update a customer revenue
[**update_customer_using_put**](CustomerApi.md#update_customer_using_put) | **PUT** /customer/{customer_id} | Update a customer


# **create_customer_revenue_using_post**
> CustomerRevenue create_customer_revenue_using_post(customer_revenue)

Create a customer revenue

Create a new customer revenue, with your firm.

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_revenue = nucleus_api.CustomerRevenue() # CustomerRevenue | customerRevenue

try:
    # Create a customer revenue
    api_response = api_instance.create_customer_revenue_using_post(customer_revenue)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->create_customer_revenue_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue** | [**CustomerRevenue**](CustomerRevenue.md)| customerRevenue | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_customer_using_post**
> Customer create_customer_using_post(customer)

Create a customer

Create a new customer, with your firm.

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer = nucleus_api.Customer() # Customer | customer

try:
    # Create a customer
    api_response = api_instance.create_customer_using_post(customer)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->create_customer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_customer_revenue_using_delete**
> delete_customer_revenue_using_delete(customer_revenue_id)

Delete a customer revenue

Delete a customer revenue. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_revenue_id = 'customer_revenue_id_example' # str | UUID customer_revenue_id

try:
    # Delete a customer revenue
    api_instance.delete_customer_revenue_using_delete(customer_revenue_id)
except ApiException as e:
    print("Exception when calling CustomerApi->delete_customer_revenue_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue_id** | [**str**](.md)| UUID customer_revenue_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_customer_using_delete**
> delete_customer_using_delete(customer_id)

Delete a customer

Delete a customer. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_id = 'customer_id_example' # str | UUID customer_id

try:
    # Delete a customer
    api_instance.delete_customer_using_delete(customer_id)
except ApiException as e:
    print("Exception when calling CustomerApi->delete_customer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | [**str**](.md)| UUID customer_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_customer_all_using_get**
> PageCustomer get_customer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all customer

List all customer. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all customer
    api_response = api_instance.get_customer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->get_customer_all_using_get: %s\n" % e)
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

[**PageCustomer**](PageCustomer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_customer_revenue_all_using_get**
> PageCustomerRevenue get_customer_revenue_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all customer revenue

List all customer revenue. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all customer revenue
    api_response = api_instance.get_customer_revenue_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->get_customer_revenue_all_using_get: %s\n" % e)
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

[**PageCustomerRevenue**](PageCustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_customer_revenue_using_get**
> CustomerRevenue get_customer_revenue_using_get(customer_revenue_id, currency_conversion=currency_conversion)

Retrieve a customer revenue

Retrieve a customer revenue. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_revenue_id = 'customer_revenue_id_example' # str | UUID customer_revenue_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a customer revenue
    api_response = api_instance.get_customer_revenue_using_get(customer_revenue_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->get_customer_revenue_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue_id** | [**str**](.md)| UUID customer_revenue_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_customer_using_get**
> Customer get_customer_using_get(customer_id)

Retrieve a customer

Retrieve a customer. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_id = 'customer_id_example' # str | UUID customer_id

try:
    # Retrieve a customer
    api_response = api_instance.get_customer_using_get(customer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->get_customer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | [**str**](.md)| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_customer_revenue_using_put**
> CustomerRevenue update_customer_revenue_using_put(customer_revenue, customer_revenue_id)

Update a customer revenue

Update a customer revenue. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer_revenue = nucleus_api.CustomerRevenue() # CustomerRevenue | customer_revenue
customer_revenue_id = 'customer_revenue_id_example' # str | UUID customer_revenue_id

try:
    # Update a customer revenue
    api_response = api_instance.update_customer_revenue_using_put(customer_revenue, customer_revenue_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->update_customer_revenue_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_revenue** | [**CustomerRevenue**](CustomerRevenue.md)| customer_revenue | 
 **customer_revenue_id** | [**str**](.md)| UUID customer_revenue_id | 

### Return type

[**CustomerRevenue**](CustomerRevenue.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_customer_using_put**
> Customer update_customer_using_put(customer, customer_id)

Update a customer

Update a customer. 

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
api_instance = nucleus_api.CustomerApi(nucleus_api.ApiClient(configuration))
customer = nucleus_api.Customer() # Customer | customer
customer_id = 'customer_id_example' # str | UUID customer_id

try:
    # Update a customer
    api_response = api_instance.update_customer_using_put(customer, customer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CustomerApi->update_customer_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| customer | 
 **customer_id** | [**str**](.md)| UUID customer_id | 

### Return type

[**Customer**](Customer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

