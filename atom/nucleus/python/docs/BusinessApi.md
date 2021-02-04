# nucleus_api.BusinessApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_business_using_post**](BusinessApi.md#create_business_using_post) | **POST** /business | Create a business
[**delete_business_using_delete**](BusinessApi.md#delete_business_using_delete) | **DELETE** /business/{business_id} | Delete a business
[**get_business_all_using_get**](BusinessApi.md#get_business_all_using_get) | **GET** /business | List all business
[**get_business_asset_size_using_get**](BusinessApi.md#get_business_asset_size_using_get) | **GET** /business/{business_id}/asset_size | List all business asset sizes
[**get_business_client_transaction_all_using_get**](BusinessApi.md#get_business_client_transaction_all_using_get) | **GET** /business/{business_id}/transaction | List all business transactions
[**get_business_holding_using_get**](BusinessApi.md#get_business_holding_using_get) | **GET** /business/{business_id}/holding | List all business holdings
[**get_business_using_get**](BusinessApi.md#get_business_using_get) | **GET** /business/{business_id} | Retrieve a business
[**update_business_using_put**](BusinessApi.md#update_business_using_put) | **PUT** /business/{business_id} | Update a business


# **create_business_using_post**
> Business create_business_using_post(business_request)

Create a business

Create a new business, or register a new business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_request = nucleus_api.Business() # Business | businessRequest

try:
    # Create a business
    api_response = api_instance.create_business_using_post(business_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->create_business_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**Business**](Business.md)| businessRequest | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_using_delete**
> delete_business_using_delete(business_id)

Delete a business

Permanently delete a business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_id = 'business_id_example' # str | UUID business_id

try:
    # Delete a business
    api_instance.delete_business_using_delete(business_id)
except ApiException as e:
    print("Exception when calling BusinessApi->delete_business_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**str**](.md)| UUID business_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_all_using_get**
> PageBusiness get_business_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all business

Get details for all business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all business
    api_response = api_instance.get_business_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->get_business_all_using_get: %s\n" % e)
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

[**PageBusiness**](PageBusiness.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_asset_size_using_get**
> list[AvailableDateDoubleVO] get_business_asset_size_using_get(business_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)

List all business asset sizes

Get a list of asset sizes per date for a business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_id = 'business_id_example' # str | UUID business_id
currency_conversion = 'currency_conversion_example' # str | Currency Code (optional)
end_date = 'null' # date | end date (optional) (default to null)
exclude_subledger = false # bool | exclude_subledger (optional) (default to false)
get_latest = true # bool | true or false (optional)
sort_type = 'sort_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () (optional)
start_date = 'null' # date | start date (optional) (default to null)

try:
    # List all business asset sizes
    api_response = api_instance.get_business_asset_size_using_get(business_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->get_business_asset_size_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**str**](.md)| UUID business_id | 
 **currency_conversion** | **str**| Currency Code | [optional] 
 **end_date** | **date**| end date | [optional] [default to null]
 **exclude_subledger** | **bool**| exclude_subledger | [optional] [default to false]
 **get_latest** | **bool**| true or false | [optional] 
 **sort_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **date**| start date | [optional] [default to null]

### Return type

[**list[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_client_transaction_all_using_get**
> PagePortfolioTransaction get_business_client_transaction_all_using_get(business_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all business transactions

Get the information for all transactions under all client registered with your business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_id = 'business_id_example' # str | UUID business_id
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
end_date = 'end_date_example' # str | end date - yyyy-mm-dd (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = 'start_date_example' # str | start date - yyyy-mm-dd (optional)

try:
    # List all business transactions
    api_response = api_instance.get_business_client_transaction_all_using_get(business_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->get_business_client_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**str**](.md)| UUID business_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **end_date** | **str**| end date - yyyy-mm-dd | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **str**| start date - yyyy-mm-dd | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_holding_using_get**
> list[PortfolioHoldingAgg] get_business_holding_using_get(business_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)

List all business holdings

Get a list of holdings for a business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_id = 'business_id_example' # str | UUID business_id
currency_conversion = 'currency_conversion_example' # str | Currency Code (optional)
end_date = 'end_date_example' # str | end date - yyyy-mm-dd (optional)
get_latest = true # bool | true or false (optional)
start_date = 'start_date_example' # str | start date - yyyy-mm-dd (optional)

try:
    # List all business holdings
    api_response = api_instance.get_business_holding_using_get(business_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->get_business_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**str**](.md)| UUID business_id | 
 **currency_conversion** | **str**| Currency Code | [optional] 
 **end_date** | **str**| end date - yyyy-mm-dd | [optional] 
 **get_latest** | **bool**| true or false | [optional] 
 **start_date** | **str**| start date - yyyy-mm-dd | [optional] 

### Return type

[**list[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_using_get**
> Business get_business_using_get(business_id)

Retrieve a business

Retrieve the information for a business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business_id = 'business_id_example' # str | UUID business_id

try:
    # Retrieve a business
    api_response = api_instance.get_business_using_get(business_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->get_business_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | [**str**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_using_put**
> Business update_business_using_put(business, business_id)

Update a business

Update the information for a business.

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
api_instance = nucleus_api.BusinessApi(nucleus_api.ApiClient(configuration))
business = NULL # object | business
business_id = 'business_id_example' # str | UUID business_id

try:
    # Update a business
    api_response = api_instance.update_business_using_put(business, business_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BusinessApi->update_business_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **object**| business | 
 **business_id** | [**str**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

