# nucleus_api.ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*
Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aggregation_account_category_mapping_using_get**](ResourceApi.md#get_aggregation_account_category_mapping_using_get) | **GET** /resource/account_category | Get All Aggregation Account Category mapping
[**get_aggregation_account_transaction_category_mapping_using_get**](ResourceApi.md#get_aggregation_account_transaction_category_mapping_using_get) | **GET** /resource/merchant_category | Get All Aggregation Account Transaction Category mapping
[**get_all_country_using_get**](ResourceApi.md#get_all_country_using_get) | **GET** /resource/country | Get All Countries
[**get_all_currency_using_get**](ResourceApi.md#get_all_currency_using_get) | **GET** /resource/currency | Get All Currencies
[**get_all_merchant_category_code_using_get**](ResourceApi.md#get_all_merchant_category_code_using_get) | **GET** /resource/merchant_category_code | Get All Merchant Category Codes
[**get_all_states_using_get**](ResourceApi.md#get_all_states_using_get) | **GET** /resource/state | List all state resource
[**get_all_statistics_using_get**](ResourceApi.md#get_all_statistics_using_get) | **GET** /resource/statistic | List all statistic resource
[**get_currency_exchange_rate_all_using_get**](ResourceApi.md#get_currency_exchange_rate_all_using_get) | **GET** /resource/fx_rate | List all fxRates
[**get_merchants_all_using_get**](ResourceApi.md#get_merchants_all_using_get) | **GET** /resource/merchant | Get all merchants


# **get_aggregation_account_category_mapping_using_get**
> list[CategoryResponseVO] get_aggregation_account_category_mapping_using_get(tenant_name=tenant_name)

Get All Aggregation Account Category mapping

Get All Aggregation Account Category mapping.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
tenant_name = 'tenant_name_example' # str | tenant_name (optional)

try:
    # Get All Aggregation Account Category mapping
    api_response = api_instance.get_aggregation_account_category_mapping_using_get(tenant_name=tenant_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_aggregation_account_category_mapping_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_name** | **str**| tenant_name | [optional] 

### Return type

[**list[CategoryResponseVO]**](CategoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_aggregation_account_transaction_category_mapping_using_get**
> list[CategoryResponseVO] get_aggregation_account_transaction_category_mapping_using_get(tenant_name=tenant_name)

Get All Aggregation Account Transaction Category mapping

Get All Aggregation Account Transaction Category mapping.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
tenant_name = 'tenant_name_example' # str | tenant_name (optional)

try:
    # Get All Aggregation Account Transaction Category mapping
    api_response = api_instance.get_aggregation_account_transaction_category_mapping_using_get(tenant_name=tenant_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_aggregation_account_transaction_category_mapping_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant_name** | **str**| tenant_name | [optional] 

### Return type

[**list[CategoryResponseVO]**](CategoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_country_using_get**
> list[Country] get_all_country_using_get()

Get All Countries

Get All Countries. 

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))

try:
    # Get All Countries
    api_response = api_instance.get_all_country_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_country_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Country]**](Country.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_currency_using_get**
> list[Currency] get_all_currency_using_get()

Get All Currencies

Get All Currencies. 

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))

try:
    # Get All Currencies
    api_response = api_instance.get_all_currency_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_currency_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Currency]**](Currency.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_merchant_category_code_using_get**
> list[MerchantCategoryCode] get_all_merchant_category_code_using_get(filter=filter)

Get All Merchant Category Codes

Get All Merchant Category Codes.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
filter = 'filter_example' # str | filter (optional)

try:
    # Get All Merchant Category Codes
    api_response = api_instance.get_all_merchant_category_code_using_get(filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_merchant_category_code_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| filter | [optional] 

### Return type

[**list[MerchantCategoryCode]**](MerchantCategoryCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_states_using_get**
> list[State] get_all_states_using_get(country_code=country_code)

List all state resource

Get the information for all possible state resource.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
country_code = 'US' # str | country_code (optional) (default to US)

try:
    # List all state resource
    api_response = api_instance.get_all_states_using_get(country_code=country_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_states_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country_code** | **str**| country_code | [optional] [default to US]

### Return type

[**list[State]**](State.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_statistics_using_get**
> dict(str, list[StatisticResourceVO]) get_all_statistics_using_get()

List all statistic resource

Get the information for all possible statistic resource.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))

try:
    # List all statistic resource
    api_response = api_instance.get_all_statistics_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_all_statistics_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**dict(str, list[StatisticResourceVO])**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_exchange_rate_all_using_get**
> list[FxRateView] get_currency_exchange_rate_all_using_get(filter=filter)

List all fxRates

Get information for all fxRates defined for your firm.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
filter = 'filter_example' # str | filter (optional)

try:
    # List all fxRates
    api_response = api_instance.get_currency_exchange_rate_all_using_get(filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_currency_exchange_rate_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| filter | [optional] 

### Return type

[**list[FxRateView]**](FxRateView.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_merchants_all_using_get**
> MXMerchantRes get_merchants_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

Get all merchants

List all merchants.

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
api_instance = nucleus_api.ResourceApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'id' # str | order_by (optional) (default to id)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get all merchants
    api_response = api_instance.get_merchants_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourceApi->get_merchants_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to id]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**MXMerchantRes**](MXMerchantRes.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

