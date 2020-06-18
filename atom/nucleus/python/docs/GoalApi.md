# nucleus_api.GoalApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_goal_track_using_post**](GoalApi.md#create_goal_track_using_post) | **POST** /goal_track | Create a goal track record
[**create_goal_using_post**](GoalApi.md#create_goal_using_post) | **POST** /goal | Create a goal
[**delete_goal_track_using_delete**](GoalApi.md#delete_goal_track_using_delete) | **DELETE** /goal_track/{goal_track_id} | Delete a goal track record
[**delete_goal_using_delete**](GoalApi.md#delete_goal_using_delete) | **DELETE** /goal/{goal_id} | Delete a goal
[**get_goal_all_using_get**](GoalApi.md#get_goal_all_using_get) | **GET** /goal | List all goals
[**get_goal_asset_size_all_using_get**](GoalApi.md#get_goal_asset_size_all_using_get) | **GET** /goal/{goal_id}/asset_size | List goal asset sizes
[**get_goal_holding_all_using_get**](GoalApi.md#get_goal_holding_all_using_get) | **GET** /goal/{goal_id}/holding | List goal holdings
[**get_goal_track_all_using_get**](GoalApi.md#get_goal_track_all_using_get) | **GET** /goal_track | List all goal track records
[**get_goal_track_using_get**](GoalApi.md#get_goal_track_using_get) | **GET** /goal_track/{goal_track_id} | Retrieve a goal track record
[**get_goal_transaction_all_using_get**](GoalApi.md#get_goal_transaction_all_using_get) | **GET** /goal/{goal_id}/transaction | List goal transactions
[**get_goal_using_get**](GoalApi.md#get_goal_using_get) | **GET** /goal/{goal_id} | Retrieve a goal
[**update_goal_track_using_put**](GoalApi.md#update_goal_track_using_put) | **PUT** /goal_track/{goal_track_id} | Update a goal track record
[**update_goal_using_put**](GoalApi.md#update_goal_using_put) | **PUT** /goal/{goal_id} | Update a goal


# **create_goal_track_using_post**
> GoalTrack create_goal_track_using_post(goal_track)

Create a goal track record

Create a goal track record for a goal under a client.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_track = nucleus_api.GoalTrack() # GoalTrack | goalTrack

try:
    # Create a goal track record
    api_response = api_instance.create_goal_track_using_post(goal_track)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->create_goal_track_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**GoalTrack**](GoalTrack.md)| goalTrack | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_goal_using_post**
> Goal create_goal_using_post(goal_request)

Create a goal

Create a new goal for your firm that clients can customize for themselves.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_request = nucleus_api.Goal() # Goal | goalRequest

try:
    # Create a goal
    api_response = api_instance.create_goal_using_post(goal_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->create_goal_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_request** | [**Goal**](Goal.md)| goalRequest | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_goal_track_using_delete**
> delete_goal_track_using_delete(goal_track_id, goal_track_id2)

Delete a goal track record

Permanently delete an goal track record for a goal under a client.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_track_id = 'goal_track_id_example' # str | UUID goal_track_id
goal_track_id2 = 'goal_track_id_example' # str | goal_track_id

try:
    # Delete a goal track record
    api_instance.delete_goal_track_using_delete(goal_track_id, goal_track_id2)
except ApiException as e:
    print("Exception when calling GoalApi->delete_goal_track_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**str**](.md)| UUID goal_track_id | 
 **goal_track_id2** | [**str**](.md)| goal_track_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_goal_using_delete**
> delete_goal_using_delete(goal_id)

Delete a goal

Permanently delete a goal for your firm.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_id = 'goal_id_example' # str | UUID goal_id

try:
    # Delete a goal
    api_instance.delete_goal_using_delete(goal_id)
except ApiException as e:
    print("Exception when calling GoalApi->delete_goal_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**str**](.md)| UUID goal_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_all_using_get**
> PageGoal get_goal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all goals

Get the details for all goals defined by your firm.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all goals
    api_response = api_instance.get_goal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_all_using_get: %s\n" % e)
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

[**PageGoal**](PageGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_asset_size_all_using_get**
> list[AvailableDateDoubleVO] get_goal_asset_size_all_using_get(client_id, goal_id, end_date=end_date, get_latest=get_latest, portfolio_goal=portfolio_goal, sort_type=sort_type, start_date=start_date)

List goal asset sizes

Get a list of asset sizes per date for a goal for a specified client.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | client_id
goal_id = 'goal_id_example' # str | UUID goal_id
end_date = '2013-10-20T19:20:30+01:00' # datetime | end_date (optional)
get_latest = false # bool | get_latest (optional) (default to false)
portfolio_goal = false # bool | portfolio_goal (optional) (default to false)
sort_type = 'sort_type_example' # str | sort_type (optional)
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date (optional)

try:
    # List goal asset sizes
    api_response = api_instance.get_goal_asset_size_all_using_get(client_id, goal_id, end_date=end_date, get_latest=get_latest, portfolio_goal=portfolio_goal, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_asset_size_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| client_id | 
 **goal_id** | [**str**](.md)| UUID goal_id | 
 **end_date** | **datetime**| end_date | [optional] 
 **get_latest** | **bool**| get_latest | [optional] [default to false]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **sort_type** | **str**| sort_type | [optional] 
 **start_date** | **datetime**| start_date | [optional] 

### Return type

[**list[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_holding_all_using_get**
> list[PortfolioHoldingAgg] get_goal_holding_all_using_get(client_id, goal_id, end_date=end_date, portfolio_goal=portfolio_goal, start_date=start_date)

List goal holdings

Get the information for all the securities that are currently being held in portfolios associated with a particular goal.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | client_id
goal_id = 'goal_id_example' # str | UUID goal_id
end_date = '2013-10-20T19:20:30+01:00' # datetime | end_date (optional)
portfolio_goal = false # bool | portfolio_goal (optional) (default to false)
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date (optional)

try:
    # List goal holdings
    api_response = api_instance.get_goal_holding_all_using_get(client_id, goal_id, end_date=end_date, portfolio_goal=portfolio_goal, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_holding_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| client_id | 
 **goal_id** | [**str**](.md)| UUID goal_id | 
 **end_date** | **datetime**| end_date | [optional] 
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **start_date** | **datetime**| start_date | [optional] 

### Return type

[**list[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_track_all_using_get**
> PageGoalTrack get_goal_track_all_using_get(ascending=ascending, end_date=end_date, filter=filter, get_latest=get_latest, order_by=order_by, page=page, size=size, start_date=start_date)

List all goal track records

Get information for all goal track records stored for your firm.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
end_date = 'end_date_example' # str | end date  (optional)
filter = 'filter_example' # str | filter (optional)
get_latest = true # bool | true or false (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = 'start_date_example' # str | start date  (optional)

try:
    # List all goal track records
    api_response = api_instance.get_goal_track_all_using_get(ascending=ascending, end_date=end_date, filter=filter, get_latest=get_latest, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_track_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **str**| end date  | [optional] 
 **filter** | **str**| filter | [optional] 
 **get_latest** | **bool**| true or false | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **str**| start date  | [optional] 

### Return type

[**PageGoalTrack**](PageGoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_track_using_get**
> GoalTrack get_goal_track_using_get(goal_track_id, goal_track_id2)

Retrieve a goal track record

Retrieve the information for a specific goal track record for a goal under a client.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_track_id = 'goal_track_id_example' # str | UUID goal_track_id
goal_track_id2 = 'goal_track_id_example' # str | goal_track_id

try:
    # Retrieve a goal track record
    api_response = api_instance.get_goal_track_using_get(goal_track_id, goal_track_id2)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_track_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track_id** | [**str**](.md)| UUID goal_track_id | 
 **goal_track_id2** | [**str**](.md)| goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_transaction_all_using_get**
> PagePortfolioTransaction get_goal_transaction_all_using_get(client_id, goal_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, portfolio_goal=portfolio_goal, size=size, start_date=start_date)

List goal transactions

Get the information for all transactions under portfolios associated with a particular goal.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
client_id = 'client_id_example' # str | client_id
goal_id = 'goal_id_example' # str | UUID goal_id
ascending = false # bool | ascending (optional) (default to false)
end_date = '2013-10-20T19:20:30+01:00' # datetime | end_date (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
portfolio_goal = false # bool | portfolio_goal (optional) (default to false)
size = 25 # int | size (optional) (default to 25)
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date (optional)

try:
    # List goal transactions
    api_response = api_instance.get_goal_transaction_all_using_get(client_id, goal_id, ascending=ascending, end_date=end_date, order_by=order_by, page=page, portfolio_goal=portfolio_goal, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| client_id | 
 **goal_id** | [**str**](.md)| UUID goal_id | 
 **ascending** | **bool**| ascending | [optional] [default to false]
 **end_date** | **datetime**| end_date | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **portfolio_goal** | **bool**| portfolio_goal | [optional] [default to false]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **datetime**| start_date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goal_using_get**
> Goal get_goal_using_get(goal_id)

Retrieve a goal

Retrieve the information for a goal defined for your firm.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_id = 'goal_id_example' # str | UUID goal_id

try:
    # Retrieve a goal
    api_response = api_instance.get_goal_using_get(goal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->get_goal_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_id** | [**str**](.md)| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_goal_track_using_put**
> GoalTrack update_goal_track_using_put(goal_track, goal_track_id)

Update a goal track record

Update the information for a goal track record.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal_track = nucleus_api.GoalTrack() # GoalTrack | goal_track
goal_track_id = 'goal_track_id_example' # str | UUID goal_track_id

try:
    # Update a goal track record
    api_response = api_instance.update_goal_track_using_put(goal_track, goal_track_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->update_goal_track_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal_track** | [**GoalTrack**](GoalTrack.md)| goal_track | 
 **goal_track_id** | [**str**](.md)| UUID goal_track_id | 

### Return type

[**GoalTrack**](GoalTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_goal_using_put**
> Goal update_goal_using_put(goal, goal_id)

Update a goal

Update a goal defined for your firm.

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
api_instance = nucleus_api.GoalApi(nucleus_api.ApiClient(configuration))
goal = nucleus_api.Goal() # Goal | goal
goal_id = 'goal_id_example' # str | UUID goal_id

try:
    # Update a goal
    api_response = api_instance.update_goal_using_put(goal, goal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GoalApi->update_goal_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goal** | [**Goal**](Goal.md)| goal | 
 **goal_id** | [**str**](.md)| UUID goal_id | 

### Return type

[**Goal**](Goal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

