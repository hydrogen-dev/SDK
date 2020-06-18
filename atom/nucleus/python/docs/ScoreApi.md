# nucleus_api.ScoreApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_score_using_post**](ScoreApi.md#create_score_using_post) | **POST** /score | Create a score
[**create_score_using_post1**](ScoreApi.md#create_score_using_post1) | **GET** /score/{score_id} | Retrieve a score
[**delete_score_using_delete**](ScoreApi.md#delete_score_using_delete) | **DELETE** /score/{score_id} | Delete a score
[**get_score_all_using_get**](ScoreApi.md#get_score_all_using_get) | **GET** /score | List all scores
[**update_score_using_put**](ScoreApi.md#update_score_using_put) | **PUT** /score/{score_id} | Update a score


# **create_score_using_post**
> Score create_score_using_post(score)

Create a score

Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.

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
api_instance = nucleus_api.ScoreApi(nucleus_api.ApiClient(configuration))
score = nucleus_api.Score() # Score | score

try:
    # Create a score
    api_response = api_instance.create_score_using_post(score)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreApi->create_score_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | [**Score**](Score.md)| score | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_score_using_post1**
> Score create_score_using_post1(score_id)

Retrieve a score

Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.

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
api_instance = nucleus_api.ScoreApi(nucleus_api.ApiClient(configuration))
score_id = 'score_id_example' # str | UUID score_id

try:
    # Retrieve a score
    api_response = api_instance.create_score_using_post1(score_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreApi->create_score_using_post1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score_id** | [**str**](.md)| UUID score_id | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_score_using_delete**
> delete_score_using_delete(score_id)

Delete a score

Permanently delete a score

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
api_instance = nucleus_api.ScoreApi(nucleus_api.ApiClient(configuration))
score_id = 'score_id_example' # str | UUID score_id

try:
    # Delete a score
    api_instance.delete_score_using_delete(score_id)
except ApiException as e:
    print("Exception when calling ScoreApi->delete_score_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score_id** | [**str**](.md)| UUID score_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_score_all_using_get**
> PageScore get_score_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all scores

Get information for all scores stored for your firm.

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
api_instance = nucleus_api.ScoreApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all scores
    api_response = api_instance.get_score_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreApi->get_score_all_using_get: %s\n" % e)
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

[**PageScore**](PageScore.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_score_using_put**
> Score update_score_using_put(score, score_id)

Update a score

Update the information for a score.

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
api_instance = nucleus_api.ScoreApi(nucleus_api.ApiClient(configuration))
score = nucleus_api.Score() # Score | score
score_id = 'score_id_example' # str | UUID score_id

try:
    # Update a score
    api_response = api_instance.update_score_using_put(score, score_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ScoreApi->update_score_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **score** | [**Score**](Score.md)| score | 
 **score_id** | [**str**](.md)| UUID score_id | 

### Return type

[**Score**](Score.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

