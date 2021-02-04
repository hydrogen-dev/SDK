# nucleus_api.UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_reason_code_using_post**](UtilsApi.md#create_reason_code_using_post) | **POST** /reason_code | Create a reason code
[**create_stage_using_post**](UtilsApi.md#create_stage_using_post) | **POST** /stage | Create an account stage
[**create_transaction_code_using_post**](UtilsApi.md#create_transaction_code_using_post) | **POST** /transaction_code | Create a transaction code
[**delete_reason_code_using_delete**](UtilsApi.md#delete_reason_code_using_delete) | **DELETE** /reason_code/{reason_code_id} | Delete a reason code
[**delete_stage_using_delete**](UtilsApi.md#delete_stage_using_delete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**delete_transaction_code_using_delete**](UtilsApi.md#delete_transaction_code_using_delete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**get_reason_code_all_using_get**](UtilsApi.md#get_reason_code_all_using_get) | **GET** /reason_code | List all reason codes
[**get_reason_code_using_get**](UtilsApi.md#get_reason_code_using_get) | **GET** /reason_code/{reason_code_id} | Retrieve a reason code
[**get_stage_all_using_get**](UtilsApi.md#get_stage_all_using_get) | **GET** /stage | List all account stages
[**get_stage_using_get**](UtilsApi.md#get_stage_using_get) | **GET** /stage/{stage_id} | Retrieve an account stage
[**get_transaction_code_all_using_get**](UtilsApi.md#get_transaction_code_all_using_get) | **GET** /transaction_code | List all transaction codes
[**get_transaction_code_using_get**](UtilsApi.md#get_transaction_code_using_get) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**update_reason_code_using_put**](UtilsApi.md#update_reason_code_using_put) | **PUT** /reason_code/{reason_code_id} | Update a reason code
[**update_stage_using_put**](UtilsApi.md#update_stage_using_put) | **PUT** /stage/{stage_id} | Update an account stage
[**update_transaction_code_using_put**](UtilsApi.md#update_transaction_code_using_put) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


# **create_reason_code_using_post**
> ReasonCode create_reason_code_using_post(reason_code_request)

Create a reason code

Create a new reason code for your firm.

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
reason_code_request = nucleus_api.ReasonCode() # ReasonCode | reasonCodeRequest

try:
    # Create a reason code
    api_response = api_instance.create_reason_code_using_post(reason_code_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->create_reason_code_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_request** | [**ReasonCode**](ReasonCode.md)| reasonCodeRequest | 

### Return type

[**ReasonCode**](ReasonCode.md)

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
stage_request = nucleus_api.Stage() # Stage | stageRequest

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
transaction_request = nucleus_api.TransactionCode() # TransactionCode | transactionRequest

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

# **delete_reason_code_using_delete**
> delete_reason_code_using_delete(reason_code_id)

Delete a reason code

Permanently delete a reason code for your firm.

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
reason_code_id = 'reason_code_id_example' # str | UUID reason_code_id

try:
    # Delete a reason code
    api_instance.delete_reason_code_using_delete(reason_code_id)
except ApiException as e:
    print("Exception when calling UtilsApi->delete_reason_code_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_id** | [**str**](.md)| UUID reason_code_id | 

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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

# **get_reason_code_all_using_get**
> PageReasonCode get_reason_code_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all reason codes

Get the information for all reason codes defined by your firm.

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all reason codes
    api_response = api_instance.get_reason_code_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_reason_code_all_using_get: %s\n" % e)
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

[**PageReasonCode**](PageReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reason_code_using_get**
> ReasonCode get_reason_code_using_get(reason_code_id)

Retrieve a reason code

Retrieve the information for a reason code defined by your firm.

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
reason_code_id = 'reason_code_id_example' # str | UUID reason_code_id

try:
    # Retrieve a reason code
    api_response = api_instance.get_reason_code_using_get(reason_code_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->get_reason_code_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code_id** | [**str**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
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

# **update_reason_code_using_put**
> ReasonCode update_reason_code_using_put(reason_code, reason_code_id)

Update a reason code

Update a reason code for your firm.

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
reason_code = NULL # object | reason_code
reason_code_id = 'reason_code_id_example' # str | UUID reason_code_id

try:
    # Update a reason code
    api_response = api_instance.update_reason_code_using_put(reason_code, reason_code_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UtilsApi->update_reason_code_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reason_code** | **object**| reason_code | 
 **reason_code_id** | [**str**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
stage = NULL # object | stage
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
 **stage** | **object**| stage | 
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
api_instance = nucleus_api.UtilsApi(nucleus_api.ApiClient(configuration))
transaction_code = NULL # object | transaction_code
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
 **transaction_code** | **object**| transaction_code | 
 **transaction_code_id** | [**str**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

