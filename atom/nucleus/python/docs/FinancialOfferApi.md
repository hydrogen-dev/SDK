# atom_api.FinancialOfferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_financial_offer_using_post**](FinancialOfferApi.md#create_financial_offer_using_post) | **POST** /financial_offer | Create a comparison request
[**delete_financial_offer_using_delete**](FinancialOfferApi.md#delete_financial_offer_using_delete) | **DELETE** /financial_offer/{financial_offer_id} | Delete a comparison request
[**get_financial_offer_all_using_get**](FinancialOfferApi.md#get_financial_offer_all_using_get) | **GET** /financial_offer | List all comparison requests
[**get_financial_offer_using_get**](FinancialOfferApi.md#get_financial_offer_using_get) | **GET** /financial_offer/{financial_offer_id} | Retrieve a comparison request
[**update_financial_offer_using_put**](FinancialOfferApi.md#update_financial_offer_using_put) | **PUT** /financial_offer/{financial_offer_id} | Update a comparison request


# **create_financial_offer_using_post**
> FinancialOffer create_financial_offer_using_post(financial_offer)

Create a comparison request

Create a new comparison request.

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
api_instance = atom_api.FinancialOfferApi(atom_api.ApiClient(configuration))
financial_offer = atom_api.FinancialOffer() # FinancialOffer | financialOffer

try:
    # Create a comparison request
    api_response = api_instance.create_financial_offer_using_post(financial_offer)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialOfferApi->create_financial_offer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**FinancialOffer**](FinancialOffer.md)| financialOffer | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_financial_offer_using_delete**
> delete_financial_offer_using_delete(financial_offer, financial_offer_id)

Delete a comparison request

Permanently delete a comparison request.

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
api_instance = atom_api.FinancialOfferApi(atom_api.ApiClient(configuration))
financial_offer = 'financial_offer_example' # str | UUID financial_offer_id
financial_offer_id = 'financial_offer_id_example' # str | financial_offer_id

try:
    # Delete a comparison request
    api_instance.delete_financial_offer_using_delete(financial_offer, financial_offer_id)
except ApiException as e:
    print("Exception when calling FinancialOfferApi->delete_financial_offer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**str**](.md)| UUID financial_offer_id | 
 **financial_offer_id** | [**str**](.md)| financial_offer_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_offer_all_using_get**
> PageFinancialOffer get_financial_offer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all comparison requests

Get the information for all comparison requests.

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
api_instance = atom_api.FinancialOfferApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all comparison requests
    api_response = api_instance.get_financial_offer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialOfferApi->get_financial_offer_all_using_get: %s\n" % e)
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

[**PageFinancialOffer**](PageFinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financial_offer_using_get**
> FinancialOffer get_financial_offer_using_get(financial_offer, financial_offer_id)

Retrieve a comparison request

Retrieve the information for a comparison request.

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
api_instance = atom_api.FinancialOfferApi(atom_api.ApiClient(configuration))
financial_offer = 'financial_offer_example' # str | UUID financial_offer_id
financial_offer_id = 'financial_offer_id_example' # str | financial_offer_id

try:
    # Retrieve a comparison request
    api_response = api_instance.get_financial_offer_using_get(financial_offer, financial_offer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialOfferApi->get_financial_offer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**str**](.md)| UUID financial_offer_id | 
 **financial_offer_id** | [**str**](.md)| financial_offer_id | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_financial_offer_using_put**
> FinancialOffer update_financial_offer_using_put(financial_offer, financial_offer_id)

Update a comparison request

Update the information for a comparison request.

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
api_instance = atom_api.FinancialOfferApi(atom_api.ApiClient(configuration))
financial_offer = atom_api.FinancialOffer() # FinancialOffer | financial_offer
financial_offer_id = 'financial_offer_id_example' # str | UUID financial_offer_id

try:
    # Update a comparison request
    api_response = api_instance.update_financial_offer_using_put(financial_offer, financial_offer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FinancialOfferApi->update_financial_offer_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financial_offer** | [**FinancialOffer**](FinancialOffer.md)| financial_offer | 
 **financial_offer_id** | [**str**](.md)| UUID financial_offer_id | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

