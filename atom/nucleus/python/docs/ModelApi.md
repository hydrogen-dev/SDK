# nucleus_api.ModelApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_model_asset_size_using_post**](ModelApi.md#create_model_asset_size_using_post) | **POST** /model_asset_size | Create a model asset size
[**create_model_change_using_post**](ModelApi.md#create_model_change_using_post) | **POST** /model/{model_id}/model_change | Change a model composition
[**create_model_comment_using_post**](ModelApi.md#create_model_comment_using_post) | **POST** /model_comment | Create a model commentary
[**create_model_holding_using_post**](ModelApi.md#create_model_holding_using_post) | **POST** /model_holding | Create a model holding
[**create_model_transaction_using_post**](ModelApi.md#create_model_transaction_using_post) | **POST** /model_transaction | Create a model transaction
[**create_model_using_post**](ModelApi.md#create_model_using_post) | **POST** /model | Create a model
[**delete_model_asset_size_using_delete**](ModelApi.md#delete_model_asset_size_using_delete) | **DELETE** /model_asset_size/{model_asset_size_id} | Delete a model asset size
[**delete_model_comment_using_delete**](ModelApi.md#delete_model_comment_using_delete) | **DELETE** /model_comment/{model_comment_id} | Delete a model commentary
[**delete_model_holding_using_delete**](ModelApi.md#delete_model_holding_using_delete) | **DELETE** /model_holding/{model_holding_id} | Delete a model holding
[**delete_model_transaction_using_delete**](ModelApi.md#delete_model_transaction_using_delete) | **DELETE** /model_transaction/{model_transaction_id} | Delete a model transaction
[**delete_model_using_delete**](ModelApi.md#delete_model_using_delete) | **DELETE** /model/{model_id} | Delete a model
[**get_model_all_using_get**](ModelApi.md#get_model_all_using_get) | **GET** /model | List all models
[**get_model_asset_size_all_using_get**](ModelApi.md#get_model_asset_size_all_using_get) | **GET** /model_asset_size | List all model asset sizes
[**get_model_asset_size_using_get**](ModelApi.md#get_model_asset_size_using_get) | **GET** /model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**get_model_comment_all_using_get**](ModelApi.md#get_model_comment_all_using_get) | **GET** /model_comment | List all model commentary
[**get_model_comment_using_get**](ModelApi.md#get_model_comment_using_get) | **GET** /model_comment/{model_comment_id} | Retrieve a model commentary
[**get_model_holding_all_using_get**](ModelApi.md#get_model_holding_all_using_get) | **GET** /model_holding | List all model holdings
[**get_model_holding_using_get**](ModelApi.md#get_model_holding_using_get) | **GET** /model_holding/{model_holding_id} | Retrieve a model holding
[**get_model_transaction_all_using_get**](ModelApi.md#get_model_transaction_all_using_get) | **GET** /model_transaction | List all model transactions
[**get_model_transaction_using_get**](ModelApi.md#get_model_transaction_using_get) | **GET** /model_transaction/{model_transaction_id} | Retrieve a model transaction
[**get_model_using_get**](ModelApi.md#get_model_using_get) | **GET** /model/{model_id} | Retrieve a model
[**update_model_asset_size_using_put**](ModelApi.md#update_model_asset_size_using_put) | **PUT** /model_asset_size/{model_asset_size_id} | Update a model asset size
[**update_model_comment_using_put**](ModelApi.md#update_model_comment_using_put) | **PUT** /model_comment/{model_comment_id} | Update a model commentary
[**update_model_holding_using_put**](ModelApi.md#update_model_holding_using_put) | **PUT** /model_holding/{model_holding_id} | Update a model holding
[**update_model_transaction_using_put**](ModelApi.md#update_model_transaction_using_put) | **PUT** /model_transaction/{model_transaction_id} | Update a model transaction
[**update_model_using_put**](ModelApi.md#update_model_using_put) | **PUT** /model/{model_id} | Update a model


# **create_model_asset_size_using_post**
> ModelAssetSize create_model_asset_size_using_post(req)

Create a model asset size

Create a new asset size record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
req = nucleus_api.ModelAssetSize() # ModelAssetSize | req

try:
    # Create a model asset size
    api_response = api_instance.create_model_asset_size_using_post(req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_asset_size_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**ModelAssetSize**](ModelAssetSize.md)| req | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_model_change_using_post**
> list[ModelTransaction] create_model_change_using_post(change_request, model_id)

Change a model composition

Model composition changes represent a change in a model’s holdings.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
change_request = nucleus_api.OrderReconcileRequest() # OrderReconcileRequest | changeRequest
model_id = 'model_id_example' # str | UUID model_id

try:
    # Change a model composition
    api_response = api_instance.create_model_change_using_post(change_request, model_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_change_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **change_request** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| changeRequest | 
 **model_id** | [**str**](.md)| UUID model_id | 

### Return type

[**list[ModelTransaction]**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_model_comment_using_post**
> int create_model_comment_using_post(model_comment_request)

Create a model commentary

Create a new comment for a model available for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_comment_request = nucleus_api.ModelComment() # ModelComment | modelCommentRequest

try:
    # Create a model commentary
    api_response = api_instance.create_model_comment_using_post(model_comment_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_comment_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_request** | [**ModelComment**](ModelComment.md)| modelCommentRequest | 

### Return type

**int**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_model_holding_using_post**
> ModelHolding create_model_holding_using_post(model_holding_request)

Create a model holding

Create a new model holding record for a specific model and date.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_holding_request = nucleus_api.ModelHolding() # ModelHolding | modelHoldingRequest

try:
    # Create a model holding
    api_response = api_instance.create_model_holding_using_post(model_holding_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_holding_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_request** | [**ModelHolding**](ModelHolding.md)| modelHoldingRequest | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_model_transaction_using_post**
> ModelTransaction create_model_transaction_using_post(model_transaction_request)

Create a model transaction

Create a new transaction record for a security under a model for a specific date.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_transaction_request = nucleus_api.ModelTransaction() # ModelTransaction | modelTransactionRequest

try:
    # Create a model transaction
    api_response = api_instance.create_model_transaction_using_post(model_transaction_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_transaction_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_request** | [**ModelTransaction**](ModelTransaction.md)| modelTransactionRequest | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_model_using_post**
> Model create_model_using_post(model_info_request)

Create a model

Create a new model for your firm to which a portfolios can later subscribe.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_info_request = nucleus_api.Model() # Model | modelInfoRequest

try:
    # Create a model
    api_response = api_instance.create_model_using_post(model_info_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->create_model_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_info_request** | [**Model**](Model.md)| modelInfoRequest | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model_asset_size_using_delete**
> delete_model_asset_size_using_delete(model_asset_size_id)

Delete a model asset size

Permanently delete a model asset size record for a model. 

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_asset_size_id = 'model_asset_size_id_example' # str | UUID model_asset_size_id

try:
    # Delete a model asset size
    api_instance.delete_model_asset_size_using_delete(model_asset_size_id)
except ApiException as e:
    print("Exception when calling ModelApi->delete_model_asset_size_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**str**](.md)| UUID model_asset_size_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model_comment_using_delete**
> delete_model_comment_using_delete(model_comment_id)

Delete a model commentary

Permanently delete a model comment for a model

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_comment_id = 'model_comment_id_example' # str | UUID model_comment_id

try:
    # Delete a model commentary
    api_instance.delete_model_comment_using_delete(model_comment_id)
except ApiException as e:
    print("Exception when calling ModelApi->delete_model_comment_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**str**](.md)| UUID model_comment_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model_holding_using_delete**
> delete_model_holding_using_delete(model_holding_id)

Delete a model holding

Permanently delete a model holding record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_holding_id = 'model_holding_id_example' # str | UUID model_holding_id

try:
    # Delete a model holding
    api_instance.delete_model_holding_using_delete(model_holding_id)
except ApiException as e:
    print("Exception when calling ModelApi->delete_model_holding_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**str**](.md)| UUID model_holding_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model_transaction_using_delete**
> delete_model_transaction_using_delete(model_transaction_id)

Delete a model transaction

Permanently delete a model transaction for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_transaction_id = 'model_transaction_id_example' # str | UUID model_transaction_id

try:
    # Delete a model transaction
    api_instance.delete_model_transaction_using_delete(model_transaction_id)
except ApiException as e:
    print("Exception when calling ModelApi->delete_model_transaction_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**str**](.md)| UUID model_transaction_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model_using_delete**
> delete_model_using_delete(model_id)

Delete a model

Permanently delete a model for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_id = 'model_id_example' # str | UUID model_id

try:
    # Delete a model
    api_instance.delete_model_using_delete(model_id)
except ApiException as e:
    print("Exception when calling ModelApi->delete_model_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**str**](.md)| UUID model_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_all_using_get**
> PageModel get_model_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all models

Get details for all models defined for your firm to which portfolios can subscribe.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all models
    api_response = api_instance.get_model_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_all_using_get: %s\n" % e)
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

[**PageModel**](PageModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_asset_size_all_using_get**
> PageModelAssetSize get_model_asset_size_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all model asset sizes

Get a list of asset sizes per date for all models defined for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all model asset sizes
    api_response = api_instance.get_model_asset_size_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_asset_size_all_using_get: %s\n" % e)
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

[**PageModelAssetSize**](PageModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_asset_size_using_get**
> ModelAssetSize get_model_asset_size_using_get(model_asset_size_id)

Retrieve a model asset size

Retrieve the information for a model asset size record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_asset_size_id = 'model_asset_size_id_example' # str | UUID model_asset_size_id

try:
    # Retrieve a model asset size
    api_response = api_instance.get_model_asset_size_using_get(model_asset_size_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_asset_size_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size_id** | [**str**](.md)| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_comment_all_using_get**
> PageModelComment get_model_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all model commentary

List all comments for all models defined by your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all model commentary
    api_response = api_instance.get_model_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_comment_all_using_get: %s\n" % e)
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

[**PageModelComment**](PageModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_comment_using_get**
> ModelComment get_model_comment_using_get(model_comment_id)

Retrieve a model commentary

Retrieve the information for a model comment for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_comment_id = 'model_comment_id_example' # str | UUID model_comment_id

try:
    # Retrieve a model commentary
    api_response = api_instance.get_model_comment_using_get(model_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_comment_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment_id** | [**str**](.md)| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_holding_all_using_get**
> PageModelHolding get_model_holding_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all model holdings

Get all model holding records for all models defined for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all model holdings
    api_response = api_instance.get_model_holding_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_holding_all_using_get: %s\n" % e)
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

[**PageModelHolding**](PageModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_holding_using_get**
> ModelHolding get_model_holding_using_get(model_holding_id)

Retrieve a model holding

Retrieve the information for a model holding record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_holding_id = 'model_holding_id_example' # str | UUID model_holding_id

try:
    # Retrieve a model holding
    api_response = api_instance.get_model_holding_using_get(model_holding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding_id** | [**str**](.md)| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_transaction_all_using_get**
> PageModelTransaction get_model_transaction_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all model transactions

Get details for all transaction records for all models defined by your firm. 

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all model transactions
    api_response = api_instance.get_model_transaction_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_transaction_all_using_get: %s\n" % e)
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

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_transaction_using_get**
> ModelTransaction get_model_transaction_using_get(model_transaction_id)

Retrieve a model transaction

Retrieve the information for a model transaction for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_transaction_id = 'model_transaction_id_example' # str | UUID model_transaction_id

try:
    # Retrieve a model transaction
    api_response = api_instance.get_model_transaction_using_get(model_transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction_id** | [**str**](.md)| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_model_using_get**
> Model get_model_using_get(model_id)

Retrieve a model

Get the information for a model for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_id = 'model_id_example' # str | UUID model_id

try:
    # Retrieve a model
    api_response = api_instance.get_model_using_get(model_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->get_model_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_id** | [**str**](.md)| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_model_asset_size_using_put**
> ModelAssetSize update_model_asset_size_using_put(model_asset_size, model_asset_size_id)

Update a model asset size

Update a model asset size record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_asset_size = nucleus_api.ModelAssetSize() # ModelAssetSize | model_asset_size
model_asset_size_id = 'model_asset_size_id_example' # str | UUID model_asset_size_id

try:
    # Update a model asset size
    api_response = api_instance.update_model_asset_size_using_put(model_asset_size, model_asset_size_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->update_model_asset_size_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_asset_size** | [**ModelAssetSize**](ModelAssetSize.md)| model_asset_size | 
 **model_asset_size_id** | [**str**](.md)| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_model_comment_using_put**
> ModelComment update_model_comment_using_put(model_comment, model_comment_id)

Update a model commentary

Update a model comment for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_comment = nucleus_api.ModelComment() # ModelComment | model_comment
model_comment_id = 'model_comment_id_example' # str | UUID model_comment_id

try:
    # Update a model commentary
    api_response = api_instance.update_model_comment_using_put(model_comment, model_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->update_model_comment_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_comment** | [**ModelComment**](ModelComment.md)| model_comment | 
 **model_comment_id** | [**str**](.md)| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_model_holding_using_put**
> ModelHolding update_model_holding_using_put(model_holding, model_holding_id)

Update a model holding

Update a model holding record for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_holding = nucleus_api.ModelHolding() # ModelHolding | model_holding
model_holding_id = 'model_holding_id_example' # str | UUID model_holding_id

try:
    # Update a model holding
    api_response = api_instance.update_model_holding_using_put(model_holding, model_holding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->update_model_holding_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_holding** | [**ModelHolding**](ModelHolding.md)| model_holding | 
 **model_holding_id** | [**str**](.md)| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_model_transaction_using_put**
> ModelTransaction update_model_transaction_using_put(model_transaction, model_transaction_id)

Update a model transaction

Update a model transaction for a model.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model_transaction = nucleus_api.ModelTransaction() # ModelTransaction | model_transaction
model_transaction_id = 'model_transaction_id_example' # str | UUID model_transaction_id

try:
    # Update a model transaction
    api_response = api_instance.update_model_transaction_using_put(model_transaction, model_transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->update_model_transaction_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_transaction** | [**ModelTransaction**](ModelTransaction.md)| model_transaction | 
 **model_transaction_id** | [**str**](.md)| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_model_using_put**
> Model update_model_using_put(model, model_id)

Update a model

Update a model for your firm.

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

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = nucleus_api.ModelApi(nucleus_api.ApiClient(configuration))
model = nucleus_api.Model() # Model | model
model_id = 'model_id_example' # str | UUID model_id

try:
    # Update a model
    api_response = api_instance.update_model_using_put(model, model_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelApi->update_model_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**Model**](Model.md)| model | 
 **model_id** | [**str**](.md)| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

