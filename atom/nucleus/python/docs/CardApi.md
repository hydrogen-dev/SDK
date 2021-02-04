# nucleus_api.CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_card_program_using_post**](CardApi.md#create_card_program_using_post) | **POST** /card_program | Create a cardProgram request
[**create_card_using_post**](CardApi.md#create_card_using_post) | **POST** /card | Create a card request
[**delete_card_program_using_delete**](CardApi.md#delete_card_program_using_delete) | **DELETE** /card_program/{card_program_id} | Delete an cardProgram
[**delete_card_using_delete**](CardApi.md#delete_card_using_delete) | **DELETE** /card/{card_id} | Delete a card request
[**get_card_all_using_get**](CardApi.md#get_card_all_using_get) | **GET** /card | List all card requests
[**get_card_asset_size_agg_all_using_get**](CardApi.md#get_card_asset_size_agg_all_using_get) | **GET** /card/{card_id}/asset_size | List all card asset sizes
[**get_card_program_all_using_get**](CardApi.md#get_card_program_all_using_get) | **GET** /card_program | List all cardProgram
[**get_card_program_using_get**](CardApi.md#get_card_program_using_get) | **GET** /card_program/{card_program_id} | Retrieve an cardProgram
[**get_card_transaction_agg_all_using_get**](CardApi.md#get_card_transaction_agg_all_using_get) | **GET** /card/{card_id}/transaction | List all card transactions
[**get_card_using_get**](CardApi.md#get_card_using_get) | **GET** /card/{card_id} | Retrieve a card request
[**update_card_program_using_put**](CardApi.md#update_card_program_using_put) | **PUT** /card_program/{card_program_id} | Update an cardProgram
[**update_card_using_put**](CardApi.md#update_card_using_put) | **PUT** /card/{card_id} | Update a card request


# **create_card_program_using_post**
> CardProgram create_card_program_using_post(card_program_request)

Create a cardProgram request

Create a new cardProgram request.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_program_request = nucleus_api.CardProgram() # CardProgram | cardProgramRequest

try:
    # Create a cardProgram request
    api_response = api_instance.create_card_program_using_post(card_program_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_program_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_request** | [**CardProgram**](CardProgram.md)| cardProgramRequest | 

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_using_post**
> Card create_card_using_post(card_request)

Create a card request

Create a new card request.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_request = nucleus_api.Card() # Card | cardRequest

try:
    # Create a card request
    api_response = api_instance.create_card_using_post(card_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_request** | [**Card**](Card.md)| cardRequest | 

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_card_program_using_delete**
> delete_card_program_using_delete(card_program_id)

Delete an cardProgram

Permanently delete an cardProgram.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_program_id = 'card_program_id_example' # str | UUID card_program_id

try:
    # Delete an cardProgram
    api_instance.delete_card_program_using_delete(card_program_id)
except ApiException as e:
    print("Exception when calling CardApi->delete_card_program_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_id** | [**str**](.md)| UUID card_program_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_card_using_delete**
> delete_card_using_delete(card_id)

Delete a card request

Permanently delete a card request.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_id = 'card_id_example' # str | UUID card_id

try:
    # Delete a card request
    api_instance.delete_card_using_delete(card_id)
except ApiException as e:
    print("Exception when calling CardApi->delete_card_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| UUID card_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_all_using_get**
> PageCard get_card_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all card requests

Get the information for all card requests.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all card requests
    api_response = api_instance.get_card_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_all_using_get: %s\n" % e)
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

[**PageCard**](PageCard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_asset_size_agg_all_using_get**
> list[object] get_card_asset_size_agg_all_using_get(card_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, sort_type=sort_type, start_date=start_date)

List all card asset sizes

Get a list of asset sizes by date for an card.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_id = 'card_id_example' # str | Card Id
currency_conversion = 'currency_conversion_example' # str | USD (optional)
end_date = '2013-10-20' # date | end date (optional)
get_latest = true # bool | true or false (optional)
sort_type = 'sort_type_example' # str |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () (optional)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all card asset sizes
    api_response = api_instance.get_card_asset_size_agg_all_using_get(card_id, currency_conversion=currency_conversion, end_date=end_date, get_latest=get_latest, sort_type=sort_type, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_asset_size_agg_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| Card Id | 
 **currency_conversion** | **str**| USD | [optional] 
 **end_date** | **date**| end date | [optional] 
 **get_latest** | **bool**| true or false | [optional] 
 **sort_type** | **str**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **start_date** | **date**| start date | [optional] 

### Return type

**list[object]**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_program_all_using_get**
> PageCardProgram get_card_program_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all cardProgram

Get information for all cardProgram.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all cardProgram
    api_response = api_instance.get_card_program_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_program_all_using_get: %s\n" % e)
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

[**PageCardProgram**](PageCardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_program_using_get**
> CardProgram get_card_program_using_get(card_program_id)

Retrieve an cardProgram

Retrieve the information for a specific cardProgram.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_program_id = 'card_program_id_example' # str | UUID card_program_id

try:
    # Retrieve an cardProgram
    api_response = api_instance.get_card_program_using_get(card_program_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_program_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program_id** | [**str**](.md)| UUID card_program_id | 

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_transaction_agg_all_using_get**
> PagePortfolioTransaction get_card_transaction_agg_all_using_get(card_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)

List all card transactions

Get the information for all transactions for an card.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_id = 'card_id_example' # str | UUID card_id
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | USD (optional)
end_date = '2013-10-20' # date | end date (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = '2013-10-20' # date | start date (optional)

try:
    # List all card transactions
    api_response = api_instance.get_card_transaction_agg_all_using_get(card_id, ascending=ascending, currency_conversion=currency_conversion, end_date=end_date, order_by=order_by, page=page, size=size, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_transaction_agg_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| UUID card_id | 
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

# **get_card_using_get**
> Card get_card_using_get(card_id)

Retrieve a card request

Retrieve the information for a card request.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_id = 'card_id_example' # str | UUID card_id

try:
    # Retrieve a card request
    api_response = api_instance.get_card_using_get(card_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| UUID card_id | 

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_card_program_using_put**
> CardProgram update_card_program_using_put(card_program, card_program_id)

Update an cardProgram

Update the information for an cardProgram.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card_program = NULL # object | card_program
card_program_id = 'card_program_id_example' # str | UUID card_program_id

try:
    # Update an cardProgram
    api_response = api_instance.update_card_program_using_put(card_program, card_program_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_program_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_program** | **object**| card_program | 
 **card_program_id** | [**str**](.md)| UUID card_program_id | 

### Return type

[**CardProgram**](CardProgram.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_card_using_put**
> Card update_card_using_put(card, card_id)

Update a card request

Update the information for a card request.

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
api_instance = nucleus_api.CardApi(nucleus_api.ApiClient(configuration))
card = NULL # object | card
card_id = 'card_id_example' # str | UUID card_id

try:
    # Update a card request
    api_response = api_instance.update_card_using_put(card, card_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | **object**| card | 
 **card_id** | [**str**](.md)| UUID card_id | 

### Return type

[**Card**](Card.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

