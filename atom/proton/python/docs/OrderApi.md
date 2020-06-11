# atom_api.OrderApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_account_order_bulk_using_post**](OrderApi.md#create_account_order_bulk_using_post) | **POST** /account/{account_id}/order_bulk | Bulk orders for an account
[**create_account_order_buy_only_using_post**](OrderApi.md#create_account_order_buy_only_using_post) | **POST** /account/{account_id}/order_buy_only | Create buy-only account rebalance orders
[**create_account_order_rebalance_using_post**](OrderApi.md#create_account_order_rebalance_using_post) | **POST** /account/{account_id}/order_rebalance | Create account rebalance orders
[**create_account_order_reconciliation**](OrderApi.md#create_account_order_reconciliation) | **POST** /account/{account_id}/order_reconciliation | Create account reconciliation order
[**create_account_order_sell_all_using_post**](OrderApi.md#create_account_order_sell_all_using_post) | **POST** /account/{account_id}/order_sell_all | Sell all account order
[**create_account_order_sell_only_using_post**](OrderApi.md#create_account_order_sell_only_using_post) | **POST** /account/{account_id}/order_sell_only | Create sell-only account rebalance orders
[**create_client_order_bulk_using_post**](OrderApi.md#create_client_order_bulk_using_post) | **POST** /client/{client_id}/order_bulk | Bulk orders for a client
[**create_order_bulk_using_post**](OrderApi.md#create_order_bulk_using_post) | **POST** /order_bulk | Bulk orders for your firm
[**create_order_status_using_post**](OrderApi.md#create_order_status_using_post) | **POST** /order_status | Create an order status
[**create_order_track_using_post**](OrderApi.md#create_order_track_using_post) | **POST** /order_track | Create an order tracking record
[**create_portfolio_order_buy_only_using_post**](OrderApi.md#create_portfolio_order_buy_only_using_post) | **POST** /portfolio/{portfolio_id}/order_buy_only | Create buy-only portfolio rebalance orders
[**create_portfolio_order_rebalance_using_post**](OrderApi.md#create_portfolio_order_rebalance_using_post) | **POST** /portfolio/{portfolio_id}/order_rebalance | Create portfolio rebalance orders
[**create_portfolio_order_reconciliation**](OrderApi.md#create_portfolio_order_reconciliation) | **POST** /portfolio/{portfolio_id}/order_reconciliation | Create portfolio reconciliation order
[**create_portfolio_order_sell_all_using_post**](OrderApi.md#create_portfolio_order_sell_all_using_post) | **POST** /portfolio/{portfolio_id}/order_sell_all | Sell all portfolio order
[**create_portfolio_order_sell_only_using_post**](OrderApi.md#create_portfolio_order_sell_only_using_post) | **POST** /portfolio/{portfolio_id}/order_sell_only | Create sell-only portfolio rebalance orders
[**delete_order_status_using_delete**](OrderApi.md#delete_order_status_using_delete) | **DELETE** /order_status/{order_status_id} | Delete an order status
[**delete_order_track_using_delete**](OrderApi.md#delete_order_track_using_delete) | **DELETE** /order_track/{order_track_id} | Delete an order tracking record
[**delete_order_using_delete**](OrderApi.md#delete_order_using_delete) | **DELETE** /order/{order_id} | Delete an order record
[**get_order_all_using_get**](OrderApi.md#get_order_all_using_get) | **POST** /order | Create an order record
[**get_order_all_using_get1**](OrderApi.md#get_order_all_using_get1) | **GET** /order | List all order records
[**get_order_bulk_all_using_get**](OrderApi.md#get_order_bulk_all_using_get) | **GET** /order_bulk | List all bulk orders
[**get_order_status_all_using_get**](OrderApi.md#get_order_status_all_using_get) | **GET** /order_status | List all order statuses
[**get_order_status_using_get**](OrderApi.md#get_order_status_using_get) | **GET** /order_status/{order_status_id} | Retrieve an order status
[**get_order_track_all_using_get**](OrderApi.md#get_order_track_all_using_get) | **GET** /order_track | List all order tracking records
[**get_order_track_using_get**](OrderApi.md#get_order_track_using_get) | **GET** /order_track/{order_track_id} | Retrieve an order tracking record
[**get_order_using_get**](OrderApi.md#get_order_using_get) | **GET** /order/{order_id} | Retrieve an order record
[**update_order_status_using_put**](OrderApi.md#update_order_status_using_put) | **PUT** /order_status/{order_status_id} | Update an order status
[**update_order_track_using_put**](OrderApi.md#update_order_track_using_put) | **PUT** /order_track/{order_track_id} | Update an order tracking record
[**update_order_using_put**](OrderApi.md#update_order_using_put) | **PUT** /order/{order_id} | Update an order record


# **create_account_order_bulk_using_post**
> list[Order] create_account_order_bulk_using_post(account_id, req)

Bulk orders for an account

Aggregates all orders on a given date for an account.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.TokenDateRequest() # TokenDateRequest | req

try:
    # Bulk orders for an account
    api_response = api_instance.create_account_order_bulk_using_post(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**list[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_order_buy_only_using_post**
> list[OrderVoClone] create_account_order_buy_only_using_post(account_id, req)

Create buy-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create buy-only account rebalance orders
    api_response = api_instance.create_account_order_buy_only_using_post(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_buy_only_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_order_rebalance_using_post**
> list[OrderVoClone] create_account_order_rebalance_using_post(account_id, req)

Create account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe. 

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create account rebalance orders
    api_response = api_instance.create_account_order_rebalance_using_post(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_rebalance_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_order_reconciliation**
> OrderReconcileReturnObject create_account_order_reconciliation(account_id, req)

Create account reconciliation order

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.OrderReconcileRequest() # OrderReconcileRequest | req

try:
    # Create account reconciliation order
    api_response = api_instance.create_account_order_reconciliation(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_reconciliation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_order_sell_all_using_post**
> list[OrderVoClone] create_account_order_sell_all_using_post(account_id, req)

Sell all account order

Create order records necessary to entirely sell all the holdings within an account.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Sell all account order
    api_response = api_instance.create_account_order_sell_all_using_post(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_sell_all_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_account_order_sell_only_using_post**
> list[OrderVoClone] create_account_order_sell_only_using_post(account_id, req)

Create sell-only account rebalance orders

Create order records necessary to rebalance an account and all its portfolios according to the allocation(s) to which the account subscribes and models to which the portfolios subscribe.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
account_id = 'account_id_example' # str | account_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create sell-only account rebalance orders
    api_response = api_instance.create_account_order_sell_only_using_post(account_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_account_order_sell_only_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_id** | [**str**](.md)| account_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_order_bulk_using_post**
> list[Order] create_client_order_bulk_using_post(client_id, req)

Bulk orders for a client

Aggregates all orders on a given date for a client

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
client_id = 'client_id_example' # str | client_id
req = atom_api.TokenDateRequest() # TokenDateRequest | req

try:
    # Bulk orders for a client
    api_response = api_instance.create_client_order_bulk_using_post(client_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_client_order_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_id** | [**str**](.md)| client_id | 
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**list[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_order_bulk_using_post**
> list[Order] create_order_bulk_using_post(req)

Bulk orders for your firm

Aggregates all orders on a given date for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
req = atom_api.TokenDateRequest() # TokenDateRequest | req

try:
    # Bulk orders for your firm
    api_response = api_instance.create_order_bulk_using_post(req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_order_bulk_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**TokenDateRequest**](TokenDateRequest.md)| req | 

### Return type

[**list[Order]**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_order_status_using_post**
> OrderStatus create_order_status_using_post(order_status_request)

Create an order status

Create an order status for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_status_request = atom_api.OrderStatus() # OrderStatus | orderStatusRequest

try:
    # Create an order status
    api_response = api_instance.create_order_status_using_post(order_status_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_order_status_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_request** | [**OrderStatus**](OrderStatus.md)| orderStatusRequest | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_order_track_using_post**
> OrderTrack create_order_track_using_post(order_track_request)

Create an order tracking record

Create a new order tracking record for an order.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_track_request = atom_api.OrderTrack() # OrderTrack | orderTrackRequest

try:
    # Create an order tracking record
    api_response = api_instance.create_order_track_using_post(order_track_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_order_track_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_request** | [**OrderTrack**](OrderTrack.md)| orderTrackRequest | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_order_buy_only_using_post**
> list[OrderVoClone] create_portfolio_order_buy_only_using_post(portfolio_id, req)

Create buy-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes. However, these will only be buy transactions, and no securities will be sold.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create buy-only portfolio rebalance orders
    api_response = api_instance.create_portfolio_order_buy_only_using_post(portfolio_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_portfolio_order_buy_only_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_order_rebalance_using_post**
> list[OrderVoClone] create_portfolio_order_rebalance_using_post(portfolio_id, req)

Create portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create portfolio rebalance orders
    api_response = api_instance.create_portfolio_order_rebalance_using_post(portfolio_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_portfolio_order_rebalance_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_order_reconciliation**
> OrderReconcileReturnObject create_portfolio_order_reconciliation(portfolio_id, req)

Create portfolio reconciliation order

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
req = atom_api.OrderReconcileRequest() # OrderReconcileRequest | req

try:
    # Create portfolio reconciliation order
    api_response = api_instance.create_portfolio_order_reconciliation(portfolio_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_portfolio_order_reconciliation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **req** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| req | 

### Return type

[**OrderReconcileReturnObject**](OrderReconcileReturnObject.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_order_sell_all_using_post**
> list[OrderVoClone] create_portfolio_order_sell_all_using_post(portfolio_id, req)

Sell all portfolio order

Create order records necessary to entirely sell all the holdings within a portfolio.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Sell all portfolio order
    api_response = api_instance.create_portfolio_order_sell_all_using_post(portfolio_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_portfolio_order_sell_all_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_order_sell_only_using_post**
> list[OrderVoClone] create_portfolio_order_sell_only_using_post(portfolio_id, req)

Create sell-only portfolio rebalance orders

Create order records necessary to rebalance a portfolio to the model to which it subscribes.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
req = atom_api.AccountPortfolioRebalanceRequest() # AccountPortfolioRebalanceRequest | req

try:
    # Create sell-only portfolio rebalance orders
    api_response = api_instance.create_portfolio_order_sell_only_using_post(portfolio_id, req)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->create_portfolio_order_sell_only_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **req** | [**AccountPortfolioRebalanceRequest**](AccountPortfolioRebalanceRequest.md)| req | 

### Return type

[**list[OrderVoClone]**](OrderVoClone.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_order_status_using_delete**
> delete_order_status_using_delete(order_status_id)

Delete an order status

Permanently delete an order status defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_status_id = 'order_status_id_example' # str | UUID order_status_id

try:
    # Delete an order status
    api_instance.delete_order_status_using_delete(order_status_id)
except ApiException as e:
    print("Exception when calling OrderApi->delete_order_status_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**str**](.md)| UUID order_status_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_order_track_using_delete**
> delete_order_track_using_delete(order_track_id)

Delete an order tracking record

Permanently delete an order tracking record for an order.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_track_id = 'order_track_id_example' # str | UUID order_track_id

try:
    # Delete an order tracking record
    api_instance.delete_order_track_using_delete(order_track_id)
except ApiException as e:
    print("Exception when calling OrderApi->delete_order_track_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**str**](.md)| UUID order_track_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_order_using_delete**
> delete_order_using_delete(order_id)

Delete an order record

Permanently delete an order record.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_id = 'order_id_example' # str | UUID order_id

try:
    # Delete an order record
    api_instance.delete_order_using_delete(order_id)
except ApiException as e:
    print("Exception when calling OrderApi->delete_order_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**str**](.md)| UUID order_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_all_using_get**
> Order get_order_all_using_get(order_info_request)

Create an order record

Create an order record defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_info_request = atom_api.Order() # Order | orderInfoRequest

try:
    # Create an order record
    api_response = api_instance.get_order_all_using_get(order_info_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_info_request** | [**Order**](Order.md)| orderInfoRequest | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_all_using_get1**
> PageOrder get_order_all_using_get1(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all order records

Get the information for all order records defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all order records
    api_response = api_instance.get_order_all_using_get1(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_all_using_get1: %s\n" % e)
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

[**PageOrder**](PageOrder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_bulk_all_using_get**
> PageOrderBulk get_order_bulk_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all bulk orders

Get the information for all bulk order records.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all bulk orders
    api_response = api_instance.get_order_bulk_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_bulk_all_using_get: %s\n" % e)
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

[**PageOrderBulk**](PageOrderBulk.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_status_all_using_get**
> PageOrderStatus get_order_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all order statuses

Get the information for all order statuses defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all order statuses
    api_response = api_instance.get_order_status_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_status_all_using_get: %s\n" % e)
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

[**PageOrderStatus**](PageOrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_status_using_get**
> OrderStatus get_order_status_using_get(order_status_id)

Retrieve an order status

Retrieve the information for an order status defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_status_id = 'order_status_id_example' # str | UUID order_status_id

try:
    # Retrieve an order status
    api_response = api_instance.get_order_status_using_get(order_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_status_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status_id** | [**str**](.md)| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_track_all_using_get**
> PageOrderTrack get_order_track_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all order tracking records

Get the information for all order tracking record for all order records.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all order tracking records
    api_response = api_instance.get_order_track_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_track_all_using_get: %s\n" % e)
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

[**PageOrderTrack**](PageOrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_track_using_get**
> OrderTrack get_order_track_using_get(order_track_id)

Retrieve an order tracking record

Retrieve the information for an order tracking record for an order.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_track_id = 'order_track_id_example' # str | UUID order_track_id

try:
    # Retrieve an order tracking record
    api_response = api_instance.get_order_track_using_get(order_track_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_track_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track_id** | [**str**](.md)| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_using_get**
> Order get_order_using_get(order_id)

Retrieve an order record

Retrieve the information for an order record.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_id = 'order_id_example' # str | UUID order_id

try:
    # Retrieve an order record
    api_response = api_instance.get_order_using_get(order_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->get_order_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | [**str**](.md)| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order_status_using_put**
> OrderStatus update_order_status_using_put(order_status, order_status_id)

Update an order status

Update the information for an order status defined for your firm.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_status = atom_api.OrderStatus() # OrderStatus | order_status
order_status_id = 'order_status_id_example' # str | UUID order_status_id

try:
    # Update an order status
    api_response = api_instance.update_order_status_using_put(order_status, order_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->update_order_status_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_status** | [**OrderStatus**](OrderStatus.md)| order_status | 
 **order_status_id** | [**str**](.md)| UUID order_status_id | 

### Return type

[**OrderStatus**](OrderStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order_track_using_put**
> OrderTrack update_order_track_using_put(order_track, order_track_id)

Update an order tracking record

Update the information for an order tracking record for an order.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order_track = atom_api.OrderTrack() # OrderTrack | order_track
order_track_id = 'order_track_id_example' # str | UUID order_track_id

try:
    # Update an order tracking record
    api_response = api_instance.update_order_track_using_put(order_track, order_track_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->update_order_track_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_track** | [**OrderTrack**](OrderTrack.md)| order_track | 
 **order_track_id** | [**str**](.md)| UUID order_track_id | 

### Return type

[**OrderTrack**](OrderTrack.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order_using_put**
> Order update_order_using_put(order, order_id)

Update an order record

Update the information for an order record.

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
api_instance = atom_api.OrderApi(atom_api.ApiClient(configuration))
order = atom_api.Order() # Order | order
order_id = 'order_id_example' # str | UUID order_id

try:
    # Update an order record
    api_response = api_instance.update_order_using_put(order, order_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OrderApi->update_order_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| order | 
 **order_id** | [**str**](.md)| UUID order_id | 

### Return type

[**Order**](Order.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

