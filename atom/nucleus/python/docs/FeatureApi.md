# nucleus_api.FeatureApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_feature_track_using_post**](FeatureApi.md#create_feature_track_using_post) | **POST** /feature_track | Create a Feature Track
[**create_feature_using_post**](FeatureApi.md#create_feature_using_post) | **POST** /feature | Create a  Feature
[**delete_feature_track_using_delete**](FeatureApi.md#delete_feature_track_using_delete) | **DELETE** /feature_track/{feature_track_id} | Delete a Feature Track
[**delete_feature_using_delete**](FeatureApi.md#delete_feature_using_delete) | **DELETE** /feature/{feature_id} | Delete a Feature
[**get_feature_all_using_get**](FeatureApi.md#get_feature_all_using_get) | **GET** /feature | List all Feature
[**get_feature_track_all_using_get**](FeatureApi.md#get_feature_track_all_using_get) | **GET** /feature_track | List all Feature track
[**get_feature_track_using_get**](FeatureApi.md#get_feature_track_using_get) | **GET** /feature_track/{feature_track_id} | Retrieve a Feature track
[**get_feature_using_get**](FeatureApi.md#get_feature_using_get) | **GET** /feature/{feature_id} | Retrieve a Feature
[**update_feature_track_using_put**](FeatureApi.md#update_feature_track_using_put) | **PUT** /feature_track/{feature_track_id} | Update a Feature Track
[**update_feature_using_put**](FeatureApi.md#update_feature_using_put) | **PUT** /feature/{feature_id} | Update a Feature


# **create_feature_track_using_post**
> FeatureTrack create_feature_track_using_post(feature_track)

Create a Feature Track

Create a new feature track.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_track = nucleus_api.FeatureTrack() # FeatureTrack | featureTrack

try:
    # Create a Feature Track
    api_response = api_instance.create_feature_track_using_post(feature_track)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->create_feature_track_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track** | [**FeatureTrack**](FeatureTrack.md)| featureTrack | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_feature_using_post**
> Feature create_feature_using_post(feature)

Create a  Feature

Create a new feature.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature = nucleus_api.Feature() # Feature | feature

try:
    # Create a  Feature
    api_response = api_instance.create_feature_using_post(feature)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->create_feature_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | [**Feature**](Feature.md)| feature | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_feature_track_using_delete**
> delete_feature_track_using_delete(feature_track_id)

Delete a Feature Track

Permanently delete a feature track registered with your firm.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_track_id = 'feature_track_id_example' # str | UUID feature_track_id

try:
    # Delete a Feature Track
    api_instance.delete_feature_track_using_delete(feature_track_id)
except ApiException as e:
    print("Exception when calling FeatureApi->delete_feature_track_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track_id** | [**str**](.md)| UUID feature_track_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_feature_using_delete**
> delete_feature_using_delete(feature_id)

Delete a Feature

Permanently delete a  feature registered with your firm.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_id = 'feature_id_example' # str | UUID feature_id

try:
    # Delete a Feature
    api_instance.delete_feature_using_delete(feature_id)
except ApiException as e:
    print("Exception when calling FeatureApi->delete_feature_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_id** | [**str**](.md)| UUID feature_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_feature_all_using_get**
> PageFeature get_feature_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Feature

Get details for all features.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Feature
    api_response = api_instance.get_feature_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->get_feature_all_using_get: %s\n" % e)
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

[**PageFeature**](PageFeature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_feature_track_all_using_get**
> PageFeatureTrack get_feature_track_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all Feature track

Get details for all feature track.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all Feature track
    api_response = api_instance.get_feature_track_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->get_feature_track_all_using_get: %s\n" % e)
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

[**PageFeatureTrack**](PageFeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_feature_track_using_get**
> FeatureTrack get_feature_track_using_get(feature_track_id)

Retrieve a Feature track

Retrieve the information for a Feature track.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_track_id = 'feature_track_id_example' # str | UUID feature_track_id

try:
    # Retrieve a Feature track
    api_response = api_instance.get_feature_track_using_get(feature_track_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->get_feature_track_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track_id** | [**str**](.md)| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_feature_using_get**
> Feature get_feature_using_get(feature_id)

Retrieve a Feature

Retrieve the information for a Feature.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_id = 'feature_id_example' # str | UUID feature_id

try:
    # Retrieve a Feature
    api_response = api_instance.get_feature_using_get(feature_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->get_feature_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_id** | [**str**](.md)| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_feature_track_using_put**
> FeatureTrack update_feature_track_using_put(feature_track, feature_track_id)

Update a Feature Track

Update the information for a Feature track registered with your firm.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature_track = NULL # object | feature_track
feature_track_id = 'feature_track_id_example' # str | UUID feature_track_id

try:
    # Update a Feature Track
    api_response = api_instance.update_feature_track_using_put(feature_track, feature_track_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->update_feature_track_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature_track** | **object**| feature_track | 
 **feature_track_id** | [**str**](.md)| UUID feature_track_id | 

### Return type

[**FeatureTrack**](FeatureTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_feature_using_put**
> Feature update_feature_using_put(feature, feature_id)

Update a Feature

Update the information for a Feature registered with your firm.

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
api_instance = nucleus_api.FeatureApi(nucleus_api.ApiClient(configuration))
feature = NULL # object | feature
feature_id = 'feature_id_example' # str | UUID feature_id

try:
    # Update a Feature
    api_response = api_instance.update_feature_using_put(feature, feature_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FeatureApi->update_feature_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feature** | **object**| feature | 
 **feature_id** | [**str**](.md)| UUID feature_id | 

### Return type

[**Feature**](Feature.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

