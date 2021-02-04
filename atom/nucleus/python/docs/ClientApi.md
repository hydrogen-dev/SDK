# nucleus_api.ClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_client_status_using_post**](ClientApi.md#create_client_status_using_post) | **POST** /client_status | Create an client status
[**create_client_using_post**](ClientApi.md#create_client_using_post) | **POST** /client | Create a client
[**delete_client_status_using_delete**](ClientApi.md#delete_client_status_using_delete) | **DELETE** /client_status/{client_status_id} | Delete an client status
[**delete_client_using_delete**](ClientApi.md#delete_client_using_delete) | **DELETE** /client/{client_id} | Delete a client
[**get_client_account_overview_using_get**](ClientApi.md#get_client_account_overview_using_get) | **GET** /client/{client_id}/account_overview | List all client Account overview
[**get_client_advisor_overview_using_get**](ClientApi.md#get_client_advisor_overview_using_get) | **GET** /client/{client_id}/advisor_overview | Advisor overview
[**get_client_all_using_get**](ClientApi.md#get_client_all_using_get) | **GET** /client | List all clients
[**get_client_asset_size_using_get**](ClientApi.md#get_client_asset_size_using_get) | **GET** /client/{client_id}/asset_size | List all client asset sizes
[**get_client_goal_overview_using_get**](ClientApi.md#get_client_goal_overview_using_get) | **GET** /client/{client_id}/goal_overview | Retrieve client&#39;s goal details 
[**get_client_holding_using_get**](ClientApi.md#get_client_holding_using_get) | **GET** /client/{client_id}/holding | List all client holdings
[**get_client_status_all_using_get**](ClientApi.md#get_client_status_all_using_get) | **GET** /client_status | List all client statuses
[**get_client_status_using_get**](ClientApi.md#get_client_status_using_get) | **GET** /client_status/{client_status_id} | Retrieve an client status
[**get_client_transaction_all_using_get**](ClientApi.md#get_client_transaction_all_using_get) | **GET** /client/{client_id}/transaction | List all client transactions
[**get_client_using_get**](ClientApi.md#get_client_using_get) | **GET** /client/{client_id} | Retrieve a client
[**update_client_status_using_put**](ClientApi.md#update_client_status_using_put) | **PUT** /client_status/{client_status_id} | Update an client status
[**update_client_using_put**](ClientApi.md#update_client_using_put) | **PUT** /client/{client_id} | Update a client


# **create_client_status_using_post**
> ClientStatus create_client_status_using_post(client_status_request)

Create an client status

Create an client status record for an client.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_status_request = nucleus_api.ClientStatus() # ClientStatus | clientStatusRequest

try:
    # Create an client status
    api_response = api_instance.create_client_status_using_post(client_status_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->create_client_status_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_request** | [**ClientStatus**](ClientStatus.md)| clientStatusRequest | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_using_post**
> Client create_client_using_post(client_request)

Create a client

Create a new client, or register a new user, with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_request = nucleus_api.Client() # Client | clientRequest

try:
    # Create a client
    api_response = api_instance.create_client_using_post(client_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->create_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_request** | [**Client**](Client.md)| clientRequest | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_status_using_delete**
> delete_client_status_using_delete(client_status_id)

Delete an client status

Permanently delete an client status record from an client’s history.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_status_id = 'client_status_id_example' # str | UUID client_status_id

try:
    # Delete an client status
    api_instance.delete_client_status_using_delete(client_status_id)
except ApiException as e:
    print("Exception when calling ClientApi->delete_client_status_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_id** | [**str**](.md)| UUID client_status_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_using_delete**
> delete_client_using_delete(client_id)

Delete a client

Permanently delete a client registered with your firm. Turns the client's is_active  = 0

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id

try:
    # Delete a client
    api_instance.delete_client_using_delete(client_id)
except ApiException as e:
    print("Exception when calling ClientApi->delete_client_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_account_overview_using_get**
> object get_client_account_overview_using_get(client_id, ascending=ascending, order_by=order_by)

List all client Account overview

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
ascending = false # bool | ascending (optional) (default to false)
order_by = 'update_date' # str | order_by (optional) (default to update_date)

try:
    # List all client Account overview
    api_response = api_instance.get_client_account_overview_using_get(client_id, ascending=ascending, order_by=order_by)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_account_overview_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **order_by** | **str**| order_by | [optional] [default to update_date]

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_advisor_overview_using_get**
> object get_client_advisor_overview_using_get(client_id, show_clients=show_clients)

Advisor overview

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
show_clients = false # bool | show_clients (optional) (default to false)

try:
    # Advisor overview
    api_response = api_instance.get_client_advisor_overview_using_get(client_id, show_clients=show_clients)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_advisor_overview_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
 **show_clients** | **bool**| show_clients | [optional] [default to false]

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_all_using_get**
> PageClient get_client_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all clients

Get details for all clients registered with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all clients
    api_response = api_instance.get_client_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_all_using_get: %s\n" % e)
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

[**PageClient**](PageClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_asset_size_using_get**
> list[AvailableDateDoubleVO] get_client_asset_size_using_get(client_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)

List all client asset sizes

Get a list of asset sizes per date for a client.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
currency_conversion = 'currency_conversion_example' # str | Currency Code (optional)
end_date = 'null' # date | end date (optional) (default to null)
exclude_subledger = false # bool | exclude_subledger (optional) (default to false)
get_latest = true # bool | true or false (optional)
sort_type = 'sort_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () (optional)
start_date = 'null' # date | start date (optional) (default to null)

try:
    # List all client asset sizes
    api_response = api_instance.get_client_asset_size_using_get(client_id, currency_conversion=currency_conversion, end_date=end_date, exclude_subledger=exclude_subledger, get_latest=get_latest, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_asset_size_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
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

# **get_client_goal_overview_using_get**
> VClientGoalViewData get_client_goal_overview_using_get(client_id, portfolio_goal=portfolio_goal)

Retrieve client's goal details 

Retrieve client's goal details

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
portfolio_goal = false # bool | portfolio_goal (optional) (default to false)

try:
    # Retrieve client's goal details 
    api_response = api_instance.get_client_goal_overview_using_get(client_id, portfolio_goal=portfolio_goal)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_goal_overview_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]

### Return type

[**VClientGoalViewData**](VClientGoalViewData.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_holding_using_get**
> list[PortfolioHoldingAgg] get_client_holding_using_get(client_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)

List all client holdings

Get the information for all the securities that are currently being held by a client registered with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
currency_conversion = 'currency_conversion_example' # str | Currency Code (optional)
end_date = 'end_date_example' # str | end date - yyyy-mm-dd (optional)
get_latest = true # bool | true or false (optional)
start_date = 'start_date_example' # str | start date - yyyy-mm-dd (optional)

try:
    # List all client holdings
    api_response = api_instance.get_client_holding_using_get(client_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
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

# **get_client_status_all_using_get**
> PageClientStatus get_client_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all client statuses

Get the client status history information for all clients.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all client statuses
    api_response = api_instance.get_client_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_status_all_using_get: %s\n" % e)
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

[**PageClientStatus**](PageClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_status_using_get**
> ClientStatus get_client_status_using_get(client_status_id)

Retrieve an client status

Retrieve the information for a specific client status record for an client.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_status_id = 'client_status_id_example' # str | UUID client_status_id

try:
    # Retrieve an client status
    api_response = api_instance.get_client_status_using_get(client_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status_id** | [**str**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_transaction_all_using_get**
> PagePortfolioTransaction get_client_transaction_all_using_get(client_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all client transactions

Get the information for all transactions under a client registered with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
end_date = 'end_date_example' # str | end date - yyyy-mm-dd (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = 'start_date_example' # str | start date - yyyy-mm-dd (optional)

try:
    # List all client transactions
    api_response = api_instance.get_client_transaction_all_using_get(client_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 
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

# **get_client_using_get**
> Client get_client_using_get(client_id)

Retrieve a client

Retrieve the information for a client registered with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | UUID client_id

try:
    # Retrieve a client
    api_response = api_instance.get_client_using_get(client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->get_client_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_status_using_put**
> ClientStatus update_client_status_using_put(client_status, client_status_id)

Update an client status

Update an client status record for an client.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client_status = NULL # object | client_status
client_status_id = 'client_status_id_example' # str | UUID client_status_id

try:
    # Update an client status
    api_response = api_instance.update_client_status_using_put(client_status, client_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->update_client_status_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_status** | **object**| client_status | 
 **client_status_id** | [**str**](.md)| UUID client_status_id | 

### Return type

[**ClientStatus**](ClientStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_client_using_put**
> Client update_client_using_put(client, client_id)

Update a client

Update the information for a client registered with your firm.

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
api_instance = nucleus_api.ClientApi(nucleus_api.ApiClient(configuration))
client = NULL # object | client
client_id = 'client_id_example' # str | UUID client_id

try:
    # Update a client
    api_response = api_instance.update_client_using_put(client, client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ClientApi->update_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | **object**| client | 
 **client_id** | [**str**](.md)| UUID client_id | 

### Return type

[**Client**](Client.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

