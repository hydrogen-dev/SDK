# atom_api.SecuritiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_security_exclusion_using_post**](SecuritiesApi.md#create_security_exclusion_using_post) | **POST** /security_exclusion | Create a security exclusion
[**create_security_price_using_post**](SecuritiesApi.md#create_security_price_using_post) | **POST** /security_price | Create a security price
[**create_security_using_post**](SecuritiesApi.md#create_security_using_post) | **POST** /security | Create a security
[**delete_security_exclusion_using_delete**](SecuritiesApi.md#delete_security_exclusion_using_delete) | **DELETE** /security_exclusion/{security_exclusion_id} | Delete a security exclusion
[**delete_security_price_using_delete**](SecuritiesApi.md#delete_security_price_using_delete) | **DELETE** /security_price/{security_price_id} | Delete a security price
[**delete_security_using_delete**](SecuritiesApi.md#delete_security_using_delete) | **DELETE** /security/{security_id} | Delete a security
[**get_security_all_using_get**](SecuritiesApi.md#get_security_all_using_get) | **GET** /security | List all securities
[**get_security_exclusion_all_using_get**](SecuritiesApi.md#get_security_exclusion_all_using_get) | **GET** /security_exclusion | List all security exclusions
[**get_security_exclusion_using_get**](SecuritiesApi.md#get_security_exclusion_using_get) | **GET** /security_exclusion/{security_exclusion_id} | Retrieve a security exclusion
[**get_security_price_all_using_get**](SecuritiesApi.md#get_security_price_all_using_get) | **GET** /security_price | List all security prices
[**get_security_price_using_get**](SecuritiesApi.md#get_security_price_using_get) | **GET** /security_price/{security_price_id} | Retrieve a security price
[**get_security_using_get**](SecuritiesApi.md#get_security_using_get) | **GET** /security/{security_id} | Retrieve a security
[**update_security_exclusion_using_put**](SecuritiesApi.md#update_security_exclusion_using_put) | **PUT** /security_exclusion/{security_exclusion_id} | Update a security exclusion
[**update_security_price_using_put**](SecuritiesApi.md#update_security_price_using_put) | **PUT** /security_price/{security_price_id} | Update a security price
[**update_security_using_put**](SecuritiesApi.md#update_security_using_put) | **PUT** /security/{security_id} | Update a security


# **create_security_exclusion_using_post**
> SecurityExclusion create_security_exclusion_using_post(security_exclusion_request)

Create a security exclusion

Create a new security exclusion for a specific account or portfolio.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_exclusion_request = atom_api.SecurityExclusion() # SecurityExclusion | securityExclusionRequest

try:
    # Create a security exclusion
    api_response = api_instance.create_security_exclusion_using_post(security_exclusion_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->create_security_exclusion_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_request** | [**SecurityExclusion**](SecurityExclusion.md)| securityExclusionRequest | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_security_price_using_post**
> SecurityPrice create_security_price_using_post(security_price_request)

Create a security price

Create a new price for a security defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_price_request = atom_api.SecurityPrice() # SecurityPrice | securityPriceRequest

try:
    # Create a security price
    api_response = api_instance.create_security_price_using_post(security_price_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->create_security_price_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_request** | [**SecurityPrice**](SecurityPrice.md)| securityPriceRequest | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_security_using_post**
> Security create_security_using_post(securities_info_request)

Create a security

Create a new security for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
securities_info_request = atom_api.Security() # Security | securitiesInfoRequest

try:
    # Create a security
    api_response = api_instance.create_security_using_post(securities_info_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->create_security_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securities_info_request** | [**Security**](Security.md)| securitiesInfoRequest | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_security_exclusion_using_delete**
> delete_security_exclusion_using_delete(security_exclusion_id)

Delete a security exclusion

Permanently delete a security exclusion

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_exclusion_id = 'security_exclusion_id_example' # str | UUID security_exclusion_id

try:
    # Delete a security exclusion
    api_instance.delete_security_exclusion_using_delete(security_exclusion_id)
except ApiException as e:
    print("Exception when calling SecuritiesApi->delete_security_exclusion_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_id** | [**str**](.md)| UUID security_exclusion_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_security_price_using_delete**
> delete_security_price_using_delete(security_price_id)

Delete a security price

Permanently delete a security price from a security.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_price_id = 'security_price_id_example' # str | UUID security_price_id

try:
    # Delete a security price
    api_instance.delete_security_price_using_delete(security_price_id)
except ApiException as e:
    print("Exception when calling SecuritiesApi->delete_security_price_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_id** | [**str**](.md)| UUID security_price_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_security_using_delete**
> delete_security_using_delete(security_id)

Delete a security

Permanently delete a security for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_id = 'security_id_example' # str | UUID security_id

try:
    # Delete a security
    api_instance.delete_security_using_delete(security_id)
except ApiException as e:
    print("Exception when calling SecuritiesApi->delete_security_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**str**](.md)| UUID security_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_all_using_get**
> PageSecurity get_security_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all securities

Get details for all securities defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all securities
    api_response = api_instance.get_security_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_all_using_get: %s\n" % e)
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

[**PageSecurity**](PageSecurity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_exclusion_all_using_get**
> PageSecurityExclusion get_security_exclusion_all_using_get(security_exclusion_id, ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all security exclusions

Get details for all security exclusions defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_exclusion_id = 'security_exclusion_id_example' # str | UUID security_exclusion_id
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all security exclusions
    api_response = api_instance.get_security_exclusion_all_using_get(security_exclusion_id, ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_exclusion_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_id** | [**str**](.md)| UUID security_exclusion_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageSecurityExclusion**](PageSecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_exclusion_using_get**
> SecurityExclusion get_security_exclusion_using_get(security_exclusion_id)

Retrieve a security exclusion

Retrieve the information for a security exclusion.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_exclusion_id = 'security_exclusion_id_example' # str | security exclusion id

try:
    # Retrieve a security exclusion
    api_response = api_instance.get_security_exclusion_using_get(security_exclusion_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_exclusion_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion_id** | [**str**](.md)| security exclusion id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_price_all_using_get**
> PageSecurityPrice get_security_price_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all security prices

Get prices for all securities defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all security prices
    api_response = api_instance.get_security_price_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_price_all_using_get: %s\n" % e)
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

[**PageSecurityPrice**](PageSecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_price_using_get**
> SecurityPrice get_security_price_using_get(security_price_id)

Retrieve a security price

Retrieve the information for a security price for a security.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_price_id = 'security_price_id_example' # str | UUID security_price_id

try:
    # Retrieve a security price
    api_response = api_instance.get_security_price_using_get(security_price_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_price_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price_id** | [**str**](.md)| UUID security_price_id | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_security_using_get**
> Security get_security_using_get(security_id)

Retrieve a security

Retrieve the information for a security defined for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_id = 'security_id_example' # str | UUID security_id

try:
    # Retrieve a security
    api_response = api_instance.get_security_using_get(security_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->get_security_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_id** | [**str**](.md)| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_security_exclusion_using_put**
> SecurityExclusion update_security_exclusion_using_put(security_exclusion, security_exclusion_id)

Update a security exclusion

Update the information for a security exclusion.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_exclusion = atom_api.SecurityExclusion() # SecurityExclusion | security_exclusion
security_exclusion_id = 'security_exclusion_id_example' # str | UUID security_exclusion_id

try:
    # Update a security exclusion
    api_response = api_instance.update_security_exclusion_using_put(security_exclusion, security_exclusion_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->update_security_exclusion_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_exclusion** | [**SecurityExclusion**](SecurityExclusion.md)| security_exclusion | 
 **security_exclusion_id** | [**str**](.md)| UUID security_exclusion_id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_security_price_using_put**
> SecurityPrice update_security_price_using_put(security_price, security_price_id)

Update a security price

Update a security price for a security.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security_price = atom_api.SecurityPrice() # SecurityPrice | security_price
security_price_id = 'security_price_id_example' # str | UUID security_price_id

try:
    # Update a security price
    api_response = api_instance.update_security_price_using_put(security_price, security_price_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->update_security_price_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_price** | [**SecurityPrice**](SecurityPrice.md)| security_price | 
 **security_price_id** | [**str**](.md)| UUID security_price_id | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_security_using_put**
> Security update_security_using_put(security, security_id)

Update a security

Update a security for your firm.

### Example
```python
from __future__ import print_function
import time
import atom_api
from atom_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = atom_api.Configuration()

# create an instance of the API class
api_instance = atom_api.AuthApi(atom_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

configuration.access_token = api_token_response.access_token


# create an instance of the API class
api_instance = atom_api.SecuritiesApi(atom_api.ApiClient(configuration))
security = atom_api.Security() # Security | security
security_id = 'security_id_example' # str | UUID security_id

try:
    # Update a security
    api_response = api_instance.update_security_using_put(security, security_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecuritiesApi->update_security_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security** | [**Security**](Security.md)| security | 
 **security_id** | [**str**](.md)| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

