# nucleus_api.InsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_insurance_coverage_using_post**](InsuranceApi.md#create_insurance_coverage_using_post) | **POST** /insurance_coverage | Create a insurance coverage request
[**create_insurance_discount_using_post**](InsuranceApi.md#create_insurance_discount_using_post) | **POST** /insurance_discount | Create a insurance discount request
[**create_insurance_quote_using_post**](InsuranceApi.md#create_insurance_quote_using_post) | **POST** /insurance_quote | Create a insuranceQuote request
[**delete_insurance_coverage_using_delete**](InsuranceApi.md#delete_insurance_coverage_using_delete) | **DELETE** /insurance_coverage/{insurance_coverage_id} | Delete an insurance coverage request
[**delete_insurance_discount_using_delete**](InsuranceApi.md#delete_insurance_discount_using_delete) | **DELETE** /insurance_discount/{insurance_discount_id} | Delete an insurance discount request
[**delete_insurance_quote_using_delete**](InsuranceApi.md#delete_insurance_quote_using_delete) | **DELETE** /insurance_quote/{insurance_quote_id} | Delete a insuranceQuote request
[**get_insurance_coverage_all_using_get**](InsuranceApi.md#get_insurance_coverage_all_using_get) | **GET** /insurance_coverage | Get all insurance coverage request
[**get_insurance_coverage_using_get**](InsuranceApi.md#get_insurance_coverage_using_get) | **GET** /insurance_coverage/{insurance_coverage_id} | Get a insurance coverage request
[**get_insurance_discount_all_using_get**](InsuranceApi.md#get_insurance_discount_all_using_get) | **GET** /insurance_discount | Get all insurance discount request
[**get_insurance_discount_using_get**](InsuranceApi.md#get_insurance_discount_using_get) | **GET** /insurance_discount/{insurance_discount_id} | Get a insurance discount request
[**get_insurance_quote_all_using_get**](InsuranceApi.md#get_insurance_quote_all_using_get) | **GET** /insurance_quote | List all insuranceQuote requests
[**get_insurance_quote_using_get**](InsuranceApi.md#get_insurance_quote_using_get) | **GET** /insurance_quote/{insurance_quote_id} | Retrieve a insuranceQuote request
[**update_insurance_coverage_using_put**](InsuranceApi.md#update_insurance_coverage_using_put) | **PUT** /insurance_coverage/{insurance_coverage_id} | Update a insurance coverage request
[**update_insurance_discount_using_put**](InsuranceApi.md#update_insurance_discount_using_put) | **PUT** /insurance_discount/{insurance_discount_id} | Update an insurance discount 
[**update_insurance_quote_using_put**](InsuranceApi.md#update_insurance_quote_using_put) | **PUT** /insurance_quote/{insurance_quote_id} | Update a insuranceQuote request


# **create_insurance_coverage_using_post**
> InsuranceCoverage create_insurance_coverage_using_post(insurance_coverage)

Create a insurance coverage request

Create a new insurance coverage.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_coverage = nucleus_api.InsuranceCoverage() # InsuranceCoverage | insuranceCoverage

try:
    # Create a insurance coverage request
    api_response = api_instance.create_insurance_coverage_using_post(insurance_coverage)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->create_insurance_coverage_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insuranceCoverage | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_insurance_discount_using_post**
> InsuranceDiscount create_insurance_discount_using_post(insurance_discount)

Create a insurance discount request

Create a new insurance discount.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_discount = nucleus_api.InsuranceDiscount() # InsuranceDiscount | insuranceDiscount

try:
    # Create a insurance discount request
    api_response = api_instance.create_insurance_discount_using_post(insurance_discount)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->create_insurance_discount_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insuranceDiscount | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_insurance_quote_using_post**
> InsuranceQuote create_insurance_quote_using_post(insurance_quote)

Create a insuranceQuote request

Create a new insuranceQuote request.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_quote = nucleus_api.InsuranceQuote() # InsuranceQuote | insuranceQuote

try:
    # Create a insuranceQuote request
    api_response = api_instance.create_insurance_quote_using_post(insurance_quote)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->create_insurance_quote_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**InsuranceQuote**](InsuranceQuote.md)| insuranceQuote | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_insurance_coverage_using_delete**
> delete_insurance_coverage_using_delete(insurance_coverage_id)

Delete an insurance coverage request

Delete an  insurance coverage.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_coverage_id = 'insurance_coverage_id_example' # str | UUID insurance_coverage_id

try:
    # Delete an insurance coverage request
    api_instance.delete_insurance_coverage_using_delete(insurance_coverage_id)
except ApiException as e:
    print("Exception when calling InsuranceApi->delete_insurance_coverage_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**str**](.md)| UUID insurance_coverage_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_insurance_discount_using_delete**
> delete_insurance_discount_using_delete(insurance_discount_id)

Delete an insurance discount request

Delete an  insurance discount.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_discount_id = 'insurance_discount_id_example' # str | UUID insurance_discount_id

try:
    # Delete an insurance discount request
    api_instance.delete_insurance_discount_using_delete(insurance_discount_id)
except ApiException as e:
    print("Exception when calling InsuranceApi->delete_insurance_discount_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**str**](.md)| UUID insurance_discount_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_insurance_quote_using_delete**
> delete_insurance_quote_using_delete(insurance_quote_id)

Delete a insuranceQuote request

Permanently delete a insuranceQuote request.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_quote_id = 'insurance_quote_id_example' # str | UUID insurance_quote_id

try:
    # Delete a insuranceQuote request
    api_instance.delete_insurance_quote_using_delete(insurance_quote_id)
except ApiException as e:
    print("Exception when calling InsuranceApi->delete_insurance_quote_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote_id** | [**str**](.md)| UUID insurance_quote_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_coverage_all_using_get**
> PageInsuranceCoverage get_insurance_coverage_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

Get all insurance coverage request

Get all new insurance coverage.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get all insurance coverage request
    api_response = api_instance.get_insurance_coverage_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_coverage_all_using_get: %s\n" % e)
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

[**PageInsuranceCoverage**](PageInsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_coverage_using_get**
> InsuranceCoverage get_insurance_coverage_using_get(insurance_coverage_id, currency_conversion=currency_conversion)

Get a insurance coverage request

Get a new insurance coverage.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_coverage_id = 'insurance_coverage_id_example' # str | UUID insurance_coverage_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Get a insurance coverage request
    api_response = api_instance.get_insurance_coverage_using_get(insurance_coverage_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_coverage_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage_id** | [**str**](.md)| UUID insurance_coverage_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_discount_all_using_get**
> PageInsuranceDiscount get_insurance_discount_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

Get all insurance discount request

Get all new insurance discount.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get all insurance discount request
    api_response = api_instance.get_insurance_discount_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_discount_all_using_get: %s\n" % e)
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

[**PageInsuranceDiscount**](PageInsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_discount_using_get**
> InsuranceDiscount get_insurance_discount_using_get(insurance_discount_id, currency_conversion=currency_conversion)

Get a insurance discount request

Get a new insurance discount.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_discount_id = 'insurance_discount_id_example' # str |  UUID insurance_discount_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Get a insurance discount request
    api_response = api_instance.get_insurance_discount_using_get(insurance_discount_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_discount_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount_id** | [**str**](.md)|  UUID insurance_discount_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_quote_all_using_get**
> PageInsuranceQuote get_insurance_quote_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all insuranceQuote requests

Get the information for all insuranceQuote requests.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all insuranceQuote requests
    api_response = api_instance.get_insurance_quote_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_quote_all_using_get: %s\n" % e)
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

[**PageInsuranceQuote**](PageInsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_insurance_quote_using_get**
> InsuranceQuote get_insurance_quote_using_get(insurance_quote_id, currency_conversion=currency_conversion)

Retrieve a insuranceQuote request

Retrieve the information for a insuranceQuote request.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_quote_id = 'insurance_quote_id_example' # str | UUID insurance_quote_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a insuranceQuote request
    api_response = api_instance.get_insurance_quote_using_get(insurance_quote_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->get_insurance_quote_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote_id** | [**str**](.md)| UUID insurance_quote_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_insurance_coverage_using_put**
> InsuranceCoverage update_insurance_coverage_using_put(insurance_coverage, insurance_coverage_id)

Update a insurance coverage request

Update a new insurance coverage.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_coverage = nucleus_api.InsuranceCoverage() # InsuranceCoverage | insurance_coverage
insurance_coverage_id = 'insurance_coverage_id_example' # str | UUID insurance_coverage_id

try:
    # Update a insurance coverage request
    api_response = api_instance.update_insurance_coverage_using_put(insurance_coverage, insurance_coverage_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->update_insurance_coverage_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_coverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insurance_coverage | 
 **insurance_coverage_id** | [**str**](.md)| UUID insurance_coverage_id | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_insurance_discount_using_put**
> InsuranceDiscount update_insurance_discount_using_put(insurance_discount, insurance_discount_id)

Update an insurance discount 

Update an new insurance .

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_discount = nucleus_api.InsuranceDiscount() # InsuranceDiscount | insurance_discount
insurance_discount_id = 'insurance_discount_id_example' # str | UUID insurance_discount_id

try:
    # Update an insurance discount 
    api_response = api_instance.update_insurance_discount_using_put(insurance_discount, insurance_discount_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->update_insurance_discount_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_discount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insurance_discount | 
 **insurance_discount_id** | [**str**](.md)| UUID insurance_discount_id | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_insurance_quote_using_put**
> InsuranceQuote update_insurance_quote_using_put(insurance_quote, insurance_quote_id)

Update a insuranceQuote request

Update the information for a insuranceQuote request.

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
api_instance = nucleus_api.InsuranceApi(nucleus_api.ApiClient(configuration))
insurance_quote = nucleus_api.InsuranceQuote() # InsuranceQuote | insurance_quote
insurance_quote_id = 'insurance_quote_id_example' # str | UUID insurance_quote_id

try:
    # Update a insuranceQuote request
    api_response = api_instance.update_insurance_quote_using_put(insurance_quote, insurance_quote_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InsuranceApi->update_insurance_quote_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insurance_quote** | [**InsuranceQuote**](InsuranceQuote.md)| insurance_quote | 
 **insurance_quote_id** | [**str**](.md)| UUID insurance_quote_id | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

