# nucleus_api.HouseholdApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_household_using_post**](HouseholdApi.md#create_household_using_post) | **POST** /household | Create a Household
[**delete_household_using_delete**](HouseholdApi.md#delete_household_using_delete) | **DELETE** /household/{household_id} | Delete a Household
[**get_household_all_using_get**](HouseholdApi.md#get_household_all_using_get) | **GET** /household | List all household
[**get_household_client_asset_size_using_get**](HouseholdApi.md#get_household_client_asset_size_using_get) | **GET** /household/{household_id}/asset_size | List all household client asset sizes
[**get_household_client_holding_using_get**](HouseholdApi.md#get_household_client_holding_using_get) | **GET** /household/{household_id}/holding | List all household&#39;s clientIds holdings
[**get_household_client_transaction_using_get**](HouseholdApi.md#get_household_client_transaction_using_get) | **GET** /household/{household_id}/transaction | List all household&#39;s client ids transactions
[**get_household_using_get**](HouseholdApi.md#get_household_using_get) | **GET** /household/{household_id} | Retrieve a Household
[**update_household_using_put**](HouseholdApi.md#update_household_using_put) | **PUT** /household/{household_id} | Update a Household


# **create_household_using_post**
> Household create_household_using_post(household)

Create a Household

Create a new household, with your firm.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household = nucleus_api.Household() # Household | household

try:
    # Create a Household
    api_response = api_instance.create_household_using_post(household)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->create_household_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_household_using_delete**
> delete_household_using_delete(household_id)

Delete a Household

Permanently delete a household

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household_id = 'household_id_example' # str | UUID household_id

try:
    # Delete a Household
    api_instance.delete_household_using_delete(household_id)
except ApiException as e:
    print("Exception when calling HouseholdApi->delete_household_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**str**](.md)| UUID household_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_household_all_using_get**
> PageHousehold get_household_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all household

Get details for all Household.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all household
    api_response = api_instance.get_household_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->get_household_all_using_get: %s\n" % e)
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

[**PageHousehold**](PageHousehold.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_household_client_asset_size_using_get**
> list[AvailableDateDoubleVO] get_household_client_asset_size_using_get(household_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)

List all household client asset sizes

Get a list of asset sizes per date for a client's household.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household_id = 'household_id_example' # str | UUID household_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)
end_date = 'null' # date | end date (optional) (default to null)
exclude_subledger = true # bool | true or false (optional)
get_latest = true # bool | true or false (optional)
sort_type = 'sort_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () (optional)
start_date = 'null' # date | start date (optional) (default to null)

try:
    # List all household client asset sizes
    api_response = api_instance.get_household_client_asset_size_using_get(household_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->get_household_client_asset_size_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**str**](.md)| UUID household_id | 
 **currency_conversion** | **str**| USD | [optional] 
 **end_date** | **date**| end date | [optional] [default to null]
 **exclude_subledger** | **bool**| true or false | [optional] 
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

# **get_household_client_holding_using_get**
> list[PortfolioHoldingAgg] get_household_client_holding_using_get(household_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)

List all household's clientIds holdings

Get the information for all the securities that are currently being held by a household's client ids registered with your firm.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household_id = 'household_id_example' # str | UUID household_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)
end_date = '2013-10-20' # date | end date - yyyy-mm-dd (optional)
get_latest = true # bool | true or false (optional)
start_date = '2013-10-20' # date | start date - yyyy-mm-dd (optional)

try:
    # List all household's clientIds holdings
    api_response = api_instance.get_household_client_holding_using_get(household_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->get_household_client_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**str**](.md)| UUID household_id | 
 **currency_conversion** | **str**| USD | [optional] 
 **end_date** | **date**| end date - yyyy-mm-dd | [optional] 
 **get_latest** | **bool**| true or false | [optional] 
 **start_date** | **date**| start date - yyyy-mm-dd | [optional] 

### Return type

[**list[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_household_client_transaction_using_get**
> PagePortfolioTransaction get_household_client_transaction_using_get(household_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all household's client ids transactions

Get the information for all transactions under a household client ids registered with your firm.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household_id = 'household_id_example' # str | UUID household_id
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | USD (optional)
end_date = '2013-10-20' # date | end date (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all household's client ids transactions
    api_response = api_instance.get_household_client_transaction_using_get(household_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->get_household_client_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**str**](.md)| UUID household_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| USD | [optional] 
 **end_date** | **date**| end date | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **date**| start date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_household_using_get**
> Household get_household_using_get(household_id)

Retrieve a Household

Retrieve the information for a Household.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household_id = 'household_id_example' # str | UUID household_id

try:
    # Retrieve a Household
    api_response = api_instance.get_household_using_get(household_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->get_household_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household_id** | [**str**](.md)| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_household_using_put**
> Household update_household_using_put(household, household_id)

Update a Household

Update the information for a Household.

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
api_instance = nucleus_api.HouseholdApi(nucleus_api.ApiClient(configuration))
household = nucleus_api.Household() # Household | household
household_id = 'household_id_example' # str | UUID household_id

try:
    # Update a Household
    api_response = api_instance.update_household_using_put(household, household_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HouseholdApi->update_household_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 
 **household_id** | [**str**](.md)| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

