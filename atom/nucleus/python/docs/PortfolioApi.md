# nucleus_api.PortfolioApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_portfolio_asset_size_using_post**](PortfolioApi.md#create_portfolio_asset_size_using_post) | **POST** /portfolio_asset_size | Create a portfolio asset size
[**create_portfolio_comment_using_post**](PortfolioApi.md#create_portfolio_comment_using_post) | **POST** /portfolio_comment | Create a portfolio commentary
[**create_portfolio_goal_using_post**](PortfolioApi.md#create_portfolio_goal_using_post) | **POST** /portfolio_goal | Create an portfolio goal
[**create_portfolio_holding_using_post**](PortfolioApi.md#create_portfolio_holding_using_post) | **POST** /portfolio_holding | Create a portfolio holding
[**create_portfolio_transaction_using_post**](PortfolioApi.md#create_portfolio_transaction_using_post) | **POST** /portfolio_transaction | Create a portfolio transaction
[**create_portfolio_using_post**](PortfolioApi.md#create_portfolio_using_post) | **POST** /portfolio | Create a portfolio
[**delete_portfolio_asset_size_using_delete**](PortfolioApi.md#delete_portfolio_asset_size_using_delete) | **DELETE** /portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**delete_portfolio_comment_using_delete**](PortfolioApi.md#delete_portfolio_comment_using_delete) | **DELETE** /portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**delete_portfolio_goal_using_delete**](PortfolioApi.md#delete_portfolio_goal_using_delete) | **DELETE** /portfolio_goal/{portfolio_goal_id} | Delete an portfolio goal
[**delete_portfolio_holding_using_delete**](PortfolioApi.md#delete_portfolio_holding_using_delete) | **DELETE** /portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**delete_portfolio_transaction_using_delete**](PortfolioApi.md#delete_portfolio_transaction_using_delete) | **DELETE** /portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**delete_portfolio_using_delete**](PortfolioApi.md#delete_portfolio_using_delete) | **DELETE** /portfolio/{portfolio_id} | Delete a portfolio
[**get_portfolio_aggregated_data_using_get**](PortfolioApi.md#get_portfolio_aggregated_data_using_get) | **GET** /portfolio/{portfolio_id}/aggregate_data | Retrieve an portfolio aggregate data
[**get_portfolio_all_using_get**](PortfolioApi.md#get_portfolio_all_using_get) | **GET** /portfolio | List all portfolios
[**get_portfolio_asset_size_all_using_get**](PortfolioApi.md#get_portfolio_asset_size_all_using_get) | **GET** /portfolio_asset_size | Retrieve a portfolio asset size
[**get_portfolio_asset_size_using_get**](PortfolioApi.md#get_portfolio_asset_size_using_get) | **GET** /portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**get_portfolio_comment_all_using_get**](PortfolioApi.md#get_portfolio_comment_all_using_get) | **GET** /portfolio_comment | List all portfolio commentary
[**get_portfolio_comment_using_get**](PortfolioApi.md#get_portfolio_comment_using_get) | **GET** /portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**get_portfolio_goal_all_using_get**](PortfolioApi.md#get_portfolio_goal_all_using_get) | **GET** /portfolio_goal | List all portfolio goals
[**get_portfolio_goal_using_get**](PortfolioApi.md#get_portfolio_goal_using_get) | **GET** /portfolio_goal/{portfolio_goal_id} | Retrieve an portfolio goal
[**get_portfolio_holding_all_using_get**](PortfolioApi.md#get_portfolio_holding_all_using_get) | **GET** /portfolio_holding | List all portfolio holdings
[**get_portfolio_holding_using_get**](PortfolioApi.md#get_portfolio_holding_using_get) | **GET** /portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**get_portfolio_transaction_all_using_get**](PortfolioApi.md#get_portfolio_transaction_all_using_get) | **GET** /portfolio_transaction | List all portfolio transactions
[**get_portfolio_transaction_using_get**](PortfolioApi.md#get_portfolio_transaction_using_get) | **GET** /portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**get_portfolio_using_get**](PortfolioApi.md#get_portfolio_using_get) | **GET** /portfolio/{portfolio_id} | Retrieve a portfolio
[**update_portfolio_asset_size_using_put**](PortfolioApi.md#update_portfolio_asset_size_using_put) | **PUT** /portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**update_portfolio_comment_using_put**](PortfolioApi.md#update_portfolio_comment_using_put) | **PUT** /portfolio_comment/{portfolio_comment_id} | Update a portfolio comment
[**update_portfolio_goal_using_put**](PortfolioApi.md#update_portfolio_goal_using_put) | **PUT** /portfolio_goal/{portfolio_goal_id} | Update an portfolio goal
[**update_portfolio_holding_using_put**](PortfolioApi.md#update_portfolio_holding_using_put) | **PUT** /portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**update_portfolio_transaction_using_put**](PortfolioApi.md#update_portfolio_transaction_using_put) | **PUT** /portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**update_portfolio_using_put**](PortfolioApi.md#update_portfolio_using_put) | **PUT** /portfolio/{portfolio_id} | Update a portfolio


# **create_portfolio_asset_size_using_post**
> PortfolioAssetSizeLog create_portfolio_asset_size_using_post(portfolio_asset_size_log_request)

Create a portfolio asset size

Create a new asset size record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_asset_size_log_request = nucleus_api.PortfolioAssetSizeLog() # PortfolioAssetSizeLog | portfolioAssetSizeLogRequest

try:
    # Create a portfolio asset size
    api_response = api_instance.create_portfolio_asset_size_using_post(portfolio_asset_size_log_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_asset_size_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_log_request** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolioAssetSizeLogRequest | 

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_comment_using_post**
> PortfolioComment create_portfolio_comment_using_post(portfolio_comment)

Create a portfolio commentary

Create a new comment for a portfolio defined for your firm.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_comment = nucleus_api.PortfolioComment() # PortfolioComment | portfolioComment

try:
    # Create a portfolio commentary
    api_response = api_instance.create_portfolio_comment_using_post(portfolio_comment)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_comment_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | [**PortfolioComment**](PortfolioComment.md)| portfolioComment | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_goal_using_post**
> PortfolioGoal create_portfolio_goal_using_post(portfolio_goal)

Create an portfolio goal

Create an portfolio goal.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_goal = nucleus_api.PortfolioGoal() # PortfolioGoal | portfolioGoal

try:
    # Create an portfolio goal
    api_response = api_instance.create_portfolio_goal_using_post(portfolio_goal)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_goal_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolioGoal | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_holding_using_post**
> PortfolioHoldingLog create_portfolio_holding_using_post(portfolio_holdin_log_request)

Create a portfolio holding

Create a new holding record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_holdin_log_request = nucleus_api.PortfolioHoldingLog() # PortfolioHoldingLog | portfolioHoldinLogRequest

try:
    # Create a portfolio holding
    api_response = api_instance.create_portfolio_holding_using_post(portfolio_holdin_log_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_holding_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holdin_log_request** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolioHoldinLogRequest | 

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_transaction_using_post**
> PortfolioTransaction create_portfolio_transaction_using_post(portfolio_transaction_request)

Create a portfolio transaction

Create a new transaction record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_transaction_request = nucleus_api.PortfolioTransaction() # PortfolioTransaction | portfolioTransactionRequest

try:
    # Create a portfolio transaction
    api_response = api_instance.create_portfolio_transaction_using_post(portfolio_transaction_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_transaction_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_request** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolioTransactionRequest | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_portfolio_using_post**
> Portfolio create_portfolio_using_post(portfolio_request)

Create a portfolio

Create a new portfolio for an account.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_request = nucleus_api.Portfolio() # Portfolio | portfolioRequest

try:
    # Create a portfolio
    api_response = api_instance.create_portfolio_using_post(portfolio_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->create_portfolio_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_request** | [**Portfolio**](Portfolio.md)| portfolioRequest | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_asset_size_using_delete**
> delete_portfolio_asset_size_using_delete(portfolio_asset_size_id)

Delete a portfolio asset size

Permanently delete a portfolio asset size record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_asset_size_id = 'portfolio_asset_size_id_example' # str | UUID portfolio_asset_size_id

try:
    # Delete a portfolio asset size
    api_instance.delete_portfolio_asset_size_using_delete(portfolio_asset_size_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_asset_size_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**str**](.md)| UUID portfolio_asset_size_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_comment_using_delete**
> delete_portfolio_comment_using_delete(portfolio_comment_id)

Delete a portfolio commentary

Permanently delete a portfolio comment for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_comment_id = 'portfolio_comment_id_example' # str | UUID portfolio_comment_id

try:
    # Delete a portfolio commentary
    api_instance.delete_portfolio_comment_using_delete(portfolio_comment_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_comment_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**str**](.md)| UUID portfolio_comment_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_goal_using_delete**
> delete_portfolio_goal_using_delete(portfolio_goal_id)

Delete an portfolio goal

Permanently delete an portfolio-goal mapping.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_goal_id = 'portfolio_goal_id_example' # str | UUID portfolio_goal_id

try:
    # Delete an portfolio goal
    api_instance.delete_portfolio_goal_using_delete(portfolio_goal_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_goal_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**str**](.md)| UUID portfolio_goal_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_holding_using_delete**
> delete_portfolio_holding_using_delete(portfolio_holding_id)

Delete a portfolio holding

Permanently delete a portfolio holding record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_holding_id = 'portfolio_holding_id_example' # str | UUID portfolio_holding_id

try:
    # Delete a portfolio holding
    api_instance.delete_portfolio_holding_using_delete(portfolio_holding_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_holding_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**str**](.md)| UUID portfolio_holding_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_transaction_using_delete**
> delete_portfolio_transaction_using_delete(portfolio_transaction_id)

Delete a portfolio transaction

Permanently delete a portfolio transaction record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_transaction_id = 'portfolio_transaction_id_example' # str | UUID portfolio_transaction_id

try:
    # Delete a portfolio transaction
    api_instance.delete_portfolio_transaction_using_delete(portfolio_transaction_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_transaction_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**str**](.md)| UUID portfolio_transaction_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_portfolio_using_delete**
> delete_portfolio_using_delete(portfolio_id)

Delete a portfolio

Permanently delete a portfolio for an account.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | UUID portfolio_id

try:
    # Delete a portfolio
    api_instance.delete_portfolio_using_delete(portfolio_id)
except ApiException as e:
    print("Exception when calling PortfolioApi->delete_portfolio_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| UUID portfolio_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_aggregated_data_using_get**
> object get_portfolio_aggregated_data_using_get(portfolio_id, show_asset_class=show_asset_class, show_category=show_category, show_industry=show_industry, show_sector=show_sector, show_security_class=show_security_class)

Retrieve an portfolio aggregate data

Retrieve the information for a securities associated with a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | Portfolio Id
show_asset_class = true # bool | true or false (optional) (default to true)
show_category = true # bool | true or false (optional) (default to true)
show_industry = true # bool | true or false (optional) (default to true)
show_sector = true # bool | true or false (optional) (default to true)
show_security_class = true # bool | true or false (optional) (default to true)

try:
    # Retrieve an portfolio aggregate data
    api_response = api_instance.get_portfolio_aggregated_data_using_get(portfolio_id, show_asset_class=show_asset_class, show_category=show_category, show_industry=show_industry, show_sector=show_sector, show_security_class=show_security_class)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_aggregated_data_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| Portfolio Id | 
 **show_asset_class** | **bool**| true or false | [optional] [default to true]
 **show_category** | **bool**| true or false | [optional] [default to true]
 **show_industry** | **bool**| true or false | [optional] [default to true]
 **show_sector** | **bool**| true or false | [optional] [default to true]
 **show_security_class** | **bool**| true or false | [optional] [default to true]

### Return type

**object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_all_using_get**
> PagePortfolio get_portfolio_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all portfolios

Get the information for all portfolios assigned to all of your firm’s accounts. 

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all portfolios
    api_response = api_instance.get_portfolio_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_all_using_get: %s\n" % e)
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

[**PagePortfolio**](PagePortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_asset_size_all_using_get**
> PagePortfolioAssetSizeLog get_portfolio_asset_size_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio. 

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Retrieve a portfolio asset size
    api_response = api_instance.get_portfolio_asset_size_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_asset_size_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PagePortfolioAssetSizeLog**](PagePortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_asset_size_using_get**
> PortfolioAssetSizeLog get_portfolio_asset_size_using_get(portfolio_asset_size_id, currency_conversion=currency_conversion)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_asset_size_id = 'portfolio_asset_size_id_example' # str | portfolio_asset_size_id
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)

try:
    # Retrieve a portfolio asset size
    api_response = api_instance.get_portfolio_asset_size_using_get(portfolio_asset_size_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_asset_size_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size_id** | [**str**](.md)| portfolio_asset_size_id | 
 **currency_conversion** | **str**| currency_conversion | [optional] 

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_comment_all_using_get**
> PagePortfolioComment get_portfolio_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all portfolio commentary

List all comments for all portfolios defined for your firm.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all portfolio commentary
    api_response = api_instance.get_portfolio_comment_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_comment_all_using_get: %s\n" % e)
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

[**PagePortfolioComment**](PagePortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_comment_using_get**
> PortfolioComment get_portfolio_comment_using_get(portfolio_comment_id)

Retrieve a portfolio commentary

Retrieve the information for a portfolio comment for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_comment_id = 'portfolio_comment_id_example' # str | UUID portfolio_comment_id

try:
    # Retrieve a portfolio commentary
    api_response = api_instance.get_portfolio_comment_using_get(portfolio_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_comment_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment_id** | [**str**](.md)| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_goal_all_using_get**
> PagePortfolioGoal get_portfolio_goal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all portfolio goals

Get information for all portfolio-goal mappings defined for your firm.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all portfolio goals
    api_response = api_instance.get_portfolio_goal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_goal_all_using_get: %s\n" % e)
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

[**PagePortfolioGoal**](PagePortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_goal_using_get**
> PortfolioGoal get_portfolio_goal_using_get(portfolio_goal_id)

Retrieve an portfolio goal

Retrieve the information for a specific portfolio-goal mapping.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_goal_id = 'portfolio_goal_id_example' # str | UUID portfolio_goal_id

try:
    # Retrieve an portfolio goal
    api_response = api_instance.get_portfolio_goal_using_get(portfolio_goal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_goal_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal_id** | [**str**](.md)| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_holding_all_using_get**
> PagePortfolioHoldingLog get_portfolio_holding_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all portfolio holdings

Get the information for all holding records for all portfolios defined for your firm.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all portfolio holdings
    api_response = api_instance.get_portfolio_holding_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_holding_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PagePortfolioHoldingLog**](PagePortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_holding_using_get**
> PortfolioHoldingLog get_portfolio_holding_using_get(portfolio_holding_id, currency_conversion=currency_conversion)

Retrieve a portfolio holding

Retrieve the information for a portfolio holding record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_holding_id = 'portfolio_holding_id_example' # str | UUID portfolio_holding_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a portfolio holding
    api_response = api_instance.get_portfolio_holding_using_get(portfolio_holding_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding_id** | [**str**](.md)| UUID portfolio_holding_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_transaction_all_using_get**
> PagePortfolioTransaction get_portfolio_transaction_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)

List all portfolio transactions

Get the information for all transaction records for all portfolios defined for your firm.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
currency_conversion = 'currency_conversion_example' # str | currency_conversion (optional)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all portfolio transactions
    api_response = api_instance.get_portfolio_transaction_all_using_get(ascending=ascending, currency_conversion=currency_conversion, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_transaction_all_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **bool**| ascending | [optional] [default to false]
 **currency_conversion** | **str**| currency_conversion | [optional] 
 **filter** | **str**| filter | [optional] 
 **order_by** | **str**| order_by | [optional] [default to update_date]
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_transaction_using_get**
> PortfolioTransaction get_portfolio_transaction_using_get(portfolio_transaction_id, currency_conversion=currency_conversion)

Retrieve a portfolio transaction

Retrieve the information for a portfolio transaction record for a portfolio. 

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_transaction_id = 'portfolio_transaction_id_example' # str | UUID portfolio_transaction_id
currency_conversion = 'currency_conversion_example' # str | USD (optional)

try:
    # Retrieve a portfolio transaction
    api_response = api_instance.get_portfolio_transaction_using_get(portfolio_transaction_id, currency_conversion=currency_conversion)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction_id** | [**str**](.md)| UUID portfolio_transaction_id | 
 **currency_conversion** | **str**| USD | [optional] 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_portfolio_using_get**
> Portfolio get_portfolio_using_get(portfolio_id)

Retrieve a portfolio

Retrieve a portfolio for an account.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | UUID portfolio_id

try:
    # Retrieve a portfolio
    api_response = api_instance.get_portfolio_using_get(portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->get_portfolio_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_asset_size_using_put**
> PortfolioAssetSizeLog update_portfolio_asset_size_using_put(portfolio_asset_size, portfolio_asset_size_id)

Update a portfolio asset size

Update the information for a portfolio asset size record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_asset_size = NULL # object | portfolio_asset_size
portfolio_asset_size_id = 'portfolio_asset_size_id_example' # str | UUID portfolio_asset_size_id

try:
    # Update a portfolio asset size
    api_response = api_instance.update_portfolio_asset_size_using_put(portfolio_asset_size, portfolio_asset_size_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_asset_size_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_asset_size** | **object**| portfolio_asset_size | 
 **portfolio_asset_size_id** | [**str**](.md)| UUID portfolio_asset_size_id | 

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_comment_using_put**
> PortfolioComment update_portfolio_comment_using_put(portfolio_comment, portfolio_comment_id)

Update a portfolio comment

Update the information for a portfolio comment for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_comment = NULL # object | portfolio_comment
portfolio_comment_id = 'portfolio_comment_id_example' # str | UUID portfolio_comment_id

try:
    # Update a portfolio comment
    api_response = api_instance.update_portfolio_comment_using_put(portfolio_comment, portfolio_comment_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_comment_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_comment** | **object**| portfolio_comment | 
 **portfolio_comment_id** | [**str**](.md)| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_goal_using_put**
> PortfolioGoal update_portfolio_goal_using_put(portfolio_goal, portfolio_goal_id)

Update an portfolio goal

Update the information for an portfolio-goal mapping.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_goal = NULL # object | portfolio_goal
portfolio_goal_id = 'portfolio_goal_id_example' # str | UUID portfolio_goal_id

try:
    # Update an portfolio goal
    api_response = api_instance.update_portfolio_goal_using_put(portfolio_goal, portfolio_goal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_goal_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_goal** | **object**| portfolio_goal | 
 **portfolio_goal_id** | [**str**](.md)| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_holding_using_put**
> PortfolioHoldingLog update_portfolio_holding_using_put(portfolio_holding, portfolio_holding_id)

Update a portfolio holding

Update the information for a portfolio holding record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_holding = NULL # object | portfolio_holding
portfolio_holding_id = 'portfolio_holding_id_example' # str | UUID portfolio_holding_id

try:
    # Update a portfolio holding
    api_response = api_instance.update_portfolio_holding_using_put(portfolio_holding, portfolio_holding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_holding_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_holding** | **object**| portfolio_holding | 
 **portfolio_holding_id** | [**str**](.md)| UUID portfolio_holding_id | 

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_transaction_using_put**
> PortfolioTransaction update_portfolio_transaction_using_put(portfolio_transaction, portfolio_transaction_id)

Update a portfolio transaction

Update the information for a portfolio transaction record for a portfolio.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio_transaction = NULL # object | portfolio_transaction
portfolio_transaction_id = 'portfolio_transaction_id_example' # str | UUID portfolio_transaction_id

try:
    # Update a portfolio transaction
    api_response = api_instance.update_portfolio_transaction_using_put(portfolio_transaction, portfolio_transaction_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_transaction_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_transaction** | **object**| portfolio_transaction | 
 **portfolio_transaction_id** | [**str**](.md)| UUID portfolio_transaction_id | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_portfolio_using_put**
> Portfolio update_portfolio_using_put(portfolio, portfolio_id)

Update a portfolio

Update a portfolio for an account.

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
api_instance = nucleus_api.PortfolioApi(nucleus_api.ApiClient(configuration))
portfolio = NULL # object | portfolio
portfolio_id = 'portfolio_id_example' # str | UUID portfolio_id

try:
    # Update a portfolio
    api_response = api_instance.update_portfolio_using_put(portfolio, portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioApi->update_portfolio_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | **object**| portfolio | 
 **portfolio_id** | [**str**](.md)| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

