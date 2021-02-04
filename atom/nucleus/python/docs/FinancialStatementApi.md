# nucleus_api.FinancialStatementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_financial_statement_using_post**](FinancialStatementApi.md#create_financial_statement_using_post) | **POST** /financial_statement | Create an financialStatement
[**delete_financial_statement_using_delete**](FinancialStatementApi.md#delete_financial_statement_using_delete) | **DELETE** /financial_statement/{financial_statement_id} | Delete an financialStatement
[**get_financial_statement_all_using_get**](FinancialStatementApi.md#get_financial_statement_all_using_get) | **GET** /financial_statement | List all financialStatement
[**get_financial_statement_using_get**](FinancialStatementApi.md#get_financial_statement_using_get) | **GET** /financial_statement/{financial_statement_id} | Retrieve an financialStatement
[**update_financial_statement_using_put**](FinancialStatementApi.md#update_financial_statement_using_put) | **PUT** /financial_statement/{financial_statement_id} | Update an financialStatement


# **create_financial_statement_using_post**
> FinancialStatement create_financial_statement_using_post(financial_statement)

Create an financialStatement

Store stats pulled from financialStatement vendors.

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
api_instance = nucleus_api.FinancialStatementApi(nucleus_api.ApiClient(configuration))
financial_statement = nucleus_api.FinancialStatement() # FinancialStatement | financialStatement

try:
    # Create an financialStatement
    api_response = api_instance.create_financial_statement_using_post(financial_statement)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialStatementApi->create_financial_statement_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_financial_statement_using_delete**
> delete_financial_statement_using_delete(financial_statement_id)

Delete an financialStatement

Permanently delete an financialStatement.

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
api_instance = nucleus_api.FinancialStatementApi(nucleus_api.ApiClient(configuration))
financial_statement_id = 'financial_statement_id_example' # str | UUID financialStatement_id

try:
    # Delete an financialStatement
    api_instance.delete_financial_statement_using_delete(financial_statement_id)
except ApiException as e:
    print("Exception when calling FinancialStatementApi->delete_financial_statement_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**str**](.md)| UUID financialStatement_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_statement_all_using_get**
> PageFinancialStatement get_financial_statement_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all financialStatement

Get information for all financialStatement for all clients defined for your firm.

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
api_instance = nucleus_api.FinancialStatementApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all financialStatement
    api_response = api_instance.get_financial_statement_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialStatementApi->get_financial_statement_all_using_get: %s\n" % e)
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

[**PageFinancialStatement**](PageFinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_statement_using_get**
> FinancialStatement get_financial_statement_using_get(financial_statement_id, currency_conversion=currency_conversion)

Retrieve an financialStatement

Retrieve the information for a specific financialStatement associated with a client.

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
api_instance = nucleus_api.FinancialStatementApi(nucleus_api.ApiClient(configuration))
financial_statement_id = 'financial_statement_id_example' # str | UUID financial_statement_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve an financialStatement
    api_response = api_instance.get_financial_statement_using_get(financial_statement_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialStatementApi->get_financial_statement_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement_id** | [**str**](.md)| UUID financial_statement_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_financial_statement_using_put**
> FinancialStatement update_financial_statement_using_put(financial_statement, financial_statement_id)

Update an financialStatement

Update the information for an financialStatement.

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
api_instance = nucleus_api.FinancialStatementApi(nucleus_api.ApiClient(configuration))
financial_statement = NULL # object | financialStatement
financial_statement_id = 'financial_statement_id_example' # str | UUID financialStatement_id

try:
    # Update an financialStatement
    api_response = api_instance.update_financial_statement_using_put(financial_statement, financial_statement_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialStatementApi->update_financial_statement_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_statement** | **object**| financialStatement | 
 **financial_statement_id** | [**str**](.md)| UUID financialStatement_id | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

