# nucleus_api.RoundupApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_roundup_settings_using_post**](RoundupApi.md#create_roundup_settings_using_post) | **POST** /roundup_setting | Create a Roundup Settings
[**create_roundup_using_post**](RoundupApi.md#create_roundup_using_post) | **POST** /roundup | Create a roundup
[**delete_roundup_settings_using_delete**](RoundupApi.md#delete_roundup_settings_using_delete) | **DELETE** /roundup_setting/{roundup_setting_id} | Delete a roundup settings
[**get_roundup_all_using_get**](RoundupApi.md#get_roundup_all_using_get) | **GET** /roundup | List all roundups
[**get_roundup_settings_all_using_get**](RoundupApi.md#get_roundup_settings_all_using_get) | **GET** /roundup_setting | List all roundup settings
[**get_roundup_settings_using_get**](RoundupApi.md#get_roundup_settings_using_get) | **GET** /roundup_setting/{roundup_setting_id} | Retrieve a Roundup Setting
[**get_roundup_using_get**](RoundupApi.md#get_roundup_using_get) | **GET** /roundup/{roundup_id} | Retrieve a Roundup
[**update_roundup_settings_using_put**](RoundupApi.md#update_roundup_settings_using_put) | **PUT** /roundup_setting/{roundup_setting_id} | Update a roundup settings


# **create_roundup_settings_using_post**
> RoundupSettings create_roundup_settings_using_post(roundup_settings)

Create a Roundup Settings

Create a Roundup Settings for Roundup amount with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_settings = nucleus_api.RoundupSettings() # RoundupSettings | roundupSettings

try:
    # Create a Roundup Settings
    api_response = api_instance.create_roundup_settings_using_post(roundup_settings)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->create_roundup_settings_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_settings** | [**RoundupSettings**](RoundupSettings.md)| roundupSettings | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_roundup_using_post**
> Roundup create_roundup_using_post(roundup_co)

Create a roundup

Create a new roundup with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_co = nucleus_api.RoundupCO() # RoundupCO | roundupCO

try:
    # Create a roundup
    api_response = api_instance.create_roundup_using_post(roundup_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->create_roundup_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_co** | [**RoundupCO**](RoundupCO.md)| roundupCO | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_roundup_settings_using_delete**
> delete_roundup_settings_using_delete(roundup_setting_id)

Delete a roundup settings

Permanently delete a  roundup settings registered with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_setting_id = 'roundup_setting_id_example' # str | UUID roundup_setting_id

try:
    # Delete a roundup settings
    api_instance.delete_roundup_settings_using_delete(roundup_setting_id)
except ApiException as e:
    print("Exception when calling RoundupApi->delete_roundup_settings_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**str**](.md)| UUID roundup_setting_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_roundup_all_using_get**
> PageRoundup get_roundup_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all roundups

Get details for all roundups.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all roundups
    api_response = api_instance.get_roundup_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->get_roundup_all_using_get: %s\n" % e)
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

[**PageRoundup**](PageRoundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_roundup_settings_all_using_get**
> PageRoundupSettings get_roundup_settings_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all roundup settings

Get details for all roundup setting with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all roundup settings
    api_response = api_instance.get_roundup_settings_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->get_roundup_settings_all_using_get: %s\n" % e)
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

[**PageRoundupSettings**](PageRoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_roundup_settings_using_get**
> RoundupSettings get_roundup_settings_using_get(roundup_setting_id)

Retrieve a Roundup Setting

Retrieve the information for a Roundup Settings with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_setting_id = 'roundup_setting_id_example' # str | UUID roundup_setting_id

try:
    # Retrieve a Roundup Setting
    api_response = api_instance.get_roundup_settings_using_get(roundup_setting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->get_roundup_settings_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting_id** | [**str**](.md)| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_roundup_using_get**
> Roundup get_roundup_using_get(roundup_id)

Retrieve a Roundup

Retrieve the information for a Roundup.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_id = 'roundup_id_example' # str | UUID roundup_id

try:
    # Retrieve a Roundup
    api_response = api_instance.get_roundup_using_get(roundup_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->get_roundup_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_id** | [**str**](.md)| UUID roundup_id | 

### Return type

[**Roundup**](Roundup.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_roundup_settings_using_put**
> RoundupSettings update_roundup_settings_using_put(roundup_setting, roundup_setting_id)

Update a roundup settings

Update the information for a roundup setting registered with your firm.

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
api_instance = nucleus_api.RoundupApi(nucleus_api.ApiClient(configuration))
roundup_setting = NULL # object | roundup_setting
roundup_setting_id = 'roundup_setting_id_example' # str | UUID roundup_setting_id

try:
    # Update a roundup settings
    api_response = api_instance.update_roundup_settings_using_put(roundup_setting, roundup_setting_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RoundupApi->update_roundup_settings_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roundup_setting** | **object**| roundup_setting | 
 **roundup_setting_id** | [**str**](.md)| UUID roundup_setting_id | 

### Return type

[**RoundupSettings**](RoundupSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

