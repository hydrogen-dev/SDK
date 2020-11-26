# nucleus_api.RiskProfileApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_risk_profile_using_post**](RiskProfileApi.md#create_risk_profile_using_post) | **POST** /risk_profile | Create a Risk Profile
[**delete_risk_profile_using_delete**](RiskProfileApi.md#delete_risk_profile_using_delete) | **DELETE** /risk_profile/{risk_profile_id} | Delete a Risk Profile
[**get_risk_profile_all_using_get**](RiskProfileApi.md#get_risk_profile_all_using_get) | **GET** /risk_profile | Get All Risk Profile
[**get_risk_profile_using_get**](RiskProfileApi.md#get_risk_profile_using_get) | **GET** /risk_profile/{risk_profile_id} | Get a Risk Profile
[**update_risk_profile_using_put**](RiskProfileApi.md#update_risk_profile_using_put) | **PUT** /risk_profile/{risk_profile_id} | Update a Risk Profile


# **create_risk_profile_using_post**
> RiskProfile create_risk_profile_using_post(risk_profile)

Create a Risk Profile

Create a new Risk Profile. 

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
api_instance = nucleus_api.RiskProfileApi(nucleus_api.ApiClient(configuration))
risk_profile = nucleus_api.RiskProfile() # RiskProfile | riskProfile

try:
    # Create a Risk Profile
    api_response = api_instance.create_risk_profile_using_post(risk_profile)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskProfileApi->create_risk_profile_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile** | [**RiskProfile**](RiskProfile.md)| riskProfile | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_risk_profile_using_delete**
> delete_risk_profile_using_delete(risk_profile_id)

Delete a Risk Profile

Permanently Delete a Risk Profile.

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
api_instance = nucleus_api.RiskProfileApi(nucleus_api.ApiClient(configuration))
risk_profile_id = 'risk_profile_id_example' # str | UUID risk_profile_id

try:
    # Delete a Risk Profile
    api_instance.delete_risk_profile_using_delete(risk_profile_id)
except ApiException as e:
    print("Exception when calling RiskProfileApi->delete_risk_profile_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile_id** | [**str**](.md)| UUID risk_profile_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_risk_profile_all_using_get**
> PageRiskProfile get_risk_profile_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

Get All Risk Profile

Get All Risk Profile. 

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
api_instance = nucleus_api.RiskProfileApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get All Risk Profile
    api_response = api_instance.get_risk_profile_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskProfileApi->get_risk_profile_all_using_get: %s\n" % e)
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

[**PageRiskProfile**](PageRiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_risk_profile_using_get**
> RiskProfile get_risk_profile_using_get(risk_profile_id)

Get a Risk Profile

Get a Risk Profile. 

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
api_instance = nucleus_api.RiskProfileApi(nucleus_api.ApiClient(configuration))
risk_profile_id = 'risk_profile_id_example' # str | UUID risk_profile_id

try:
    # Get a Risk Profile
    api_response = api_instance.get_risk_profile_using_get(risk_profile_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskProfileApi->get_risk_profile_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile_id** | [**str**](.md)| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_risk_profile_using_put**
> RiskProfile update_risk_profile_using_put(risk_profile, risk_profile_id)

Update a Risk Profile

Update a Risk Profile. 

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
api_instance = nucleus_api.RiskProfileApi(nucleus_api.ApiClient(configuration))
risk_profile = nucleus_api.RiskProfile() # RiskProfile | risk_profile
risk_profile_id = 'risk_profile_id_example' # str | UUID risk_profile_id

try:
    # Update a Risk Profile
    api_response = api_instance.update_risk_profile_using_put(risk_profile, risk_profile_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling RiskProfileApi->update_risk_profile_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **risk_profile** | [**RiskProfile**](RiskProfile.md)| risk_profile | 
 **risk_profile_id** | [**str**](.md)| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

