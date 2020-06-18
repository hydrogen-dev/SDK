# nucleus_api.FAQApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_faq_using_post**](FAQApi.md#create_faq_using_post) | **POST** /faq | Create a FAQ
[**delete_faq_using_delete**](FAQApi.md#delete_faq_using_delete) | **DELETE** /faq/{faq_id} | Delete a FAQ
[**get_faq_all_using_get**](FAQApi.md#get_faq_all_using_get) | **GET** /faq | List all FAQ
[**get_faq_using_get**](FAQApi.md#get_faq_using_get) | **GET** /faq/{faq_id} | Retrieve a FAQ
[**update_faq_using_put**](FAQApi.md#update_faq_using_put) | **PUT** /faq/{faq_id} | Update a FAQ


# **create_faq_using_post**
> Faq create_faq_using_post(faq_request)

Create a FAQ

Create a new FAQ

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
api_instance = nucleus_api.FAQApi(nucleus_api.ApiClient(configuration))
faq_request = nucleus_api.Faq() # Faq | faqRequest

try:
    # Create a FAQ
    api_response = api_instance.create_faq_using_post(faq_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FAQApi->create_faq_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_request** | [**Faq**](Faq.md)| faqRequest | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_faq_using_delete**
> delete_faq_using_delete(faq_id)

Delete a FAQ

Permanently delete a FAQ

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
api_instance = nucleus_api.FAQApi(nucleus_api.ApiClient(configuration))
faq_id = 'faq_id_example' # str | UUID faq_id

try:
    # Delete a FAQ
    api_instance.delete_faq_using_delete(faq_id)
except ApiException as e:
    print("Exception when calling FAQApi->delete_faq_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**str**](.md)| UUID faq_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_faq_all_using_get**
> PageFaq get_faq_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all FAQ

Get the information for all FAQ

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
api_instance = nucleus_api.FAQApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all FAQ
    api_response = api_instance.get_faq_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FAQApi->get_faq_all_using_get: %s\n" % e)
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

[**PageFaq**](PageFaq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_faq_using_get**
> Faq get_faq_using_get(faq_id)

Retrieve a FAQ

Retrieve the information for a FAQ

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
api_instance = nucleus_api.FAQApi(nucleus_api.ApiClient(configuration))
faq_id = 'faq_id_example' # str | UUID faq_id

try:
    # Retrieve a FAQ
    api_response = api_instance.get_faq_using_get(faq_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FAQApi->get_faq_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq_id** | [**str**](.md)| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_faq_using_put**
> Faq update_faq_using_put(faq, faq_id)

Update a FAQ

Update the information for a FAQ

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
api_instance = nucleus_api.FAQApi(nucleus_api.ApiClient(configuration))
faq = nucleus_api.Faq() # Faq | faq
faq_id = 'faq_id_example' # str | UUID faq_id

try:
    # Update a FAQ
    api_response = api_instance.update_faq_using_put(faq, faq_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FAQApi->update_faq_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **faq** | [**Faq**](Faq.md)| faq | 
 **faq_id** | [**str**](.md)| UUID faq_id | 

### Return type

[**Faq**](Faq.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

