# integration_api.BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_order_using_put**](BrokerageApi.md#cancel_order_using_put) | **PUT** /brokerage/order/{nucleus_order_id} | Cancel an Order
[**create_bank_link_using_post1**](BrokerageApi.md#create_bank_link_using_post1) | **POST** /brokerage/bank_link | create a Bank Link
[**create_brokerage_account_using_post**](BrokerageApi.md#create_brokerage_account_using_post) | **POST** /brokerage/account | create a Brokerage account
[**create_brokerage_client_using_post**](BrokerageApi.md#create_brokerage_client_using_post) | **POST** /brokerage/client | Create a Brokerage Client
[**create_deposit_using_post**](BrokerageApi.md#create_deposit_using_post) | **POST** /brokerage/deposit | Create a deposit
[**create_document_using_post**](BrokerageApi.md#create_document_using_post) | **POST** /brokerage/document | Create a Brokerage document
[**create_order_using_post**](BrokerageApi.md#create_order_using_post) | **POST** /brokerage/order | Create an Order
[**create_withdrawal_using_post**](BrokerageApi.md#create_withdrawal_using_post) | **POST** /brokerage/withdrawal | Create a withdrawal
[**delete_bank_link_using_delete1**](BrokerageApi.md#delete_bank_link_using_delete1) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**get_balance_using_get1**](BrokerageApi.md#get_balance_using_get1) | **GET** /brokerage/balance/{nucleus_portfolio_id} | Get account balance
[**get_bank_link_using_get1**](BrokerageApi.md#get_bank_link_using_get1) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**get_brokerage_account_statement_using_get**](BrokerageApi.md#get_brokerage_account_statement_using_get) | **GET** /brokerage/statement/{nucleus_account_id} | Get a Brokerage account statement
[**get_document_using_get**](BrokerageApi.md#get_document_using_get) | **GET** /brokerage/document/{nucleus_document_id} | Get a Brokerage document
[**get_holding_performance_using_get**](BrokerageApi.md#get_holding_performance_using_get) | **GET** /brokerage/holding/performance/{nucleus_portfolio_id} | Get portfolio holding performance
[**get_holding_using_get**](BrokerageApi.md#get_holding_using_get) | **GET** /brokerage/holding/{nucleus_portfolio_id} | Get portfolio holdings
[**get_order_using_get**](BrokerageApi.md#get_order_using_get) | **GET** /brokerage/order/{nucleus_order_id} | Get an Order
[**get_securities_using_get**](BrokerageApi.md#get_securities_using_get) | **GET** /brokerage/securities | Get securities information
[**get_transactions_using_get**](BrokerageApi.md#get_transactions_using_get) | **GET** /brokerage/transaction/{nucleus_portfolio_id} | Get account transactions
[**update_bank_link_using_put1**](BrokerageApi.md#update_bank_link_using_put1) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**update_brokerage_client_using_put**](BrokerageApi.md#update_brokerage_client_using_put) | **PUT** /brokerage/client | Update a Brokerage client


# **cancel_order_using_put**
> cancel_order_using_put(nucleus_order_id)

Cancel an Order

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_order_id = 'nucleus_order_id_example' # str | nucleus_order_id

try:
    # Cancel an Order
    api_instance.cancel_order_using_put(nucleus_order_id)
except ApiException as e:
    print("Exception when calling BrokerageApi->cancel_order_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**str**](.md)| nucleus_order_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_bank_link_using_post1**
> BrokerageBankLinkVO create_bank_link_using_post1(brokerage_bank_link_co)

create a Bank Link

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_bank_link_co = integration_api.BrokerageBankLinkCO() # BrokerageBankLinkCO | brokerageBankLinkCO

try:
    # create a Bank Link
    api_response = api_instance.create_bank_link_using_post1(brokerage_bank_link_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_bank_link_using_post1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_bank_link_co** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_brokerage_account_using_post**
> BrokerageAccountVO create_brokerage_account_using_post(brokerage_account_co)

create a Brokerage account

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_account_co = integration_api.BrokerageAccountCO() # BrokerageAccountCO | brokerageAccountCO

try:
    # create a Brokerage account
    api_response = api_instance.create_brokerage_account_using_post(brokerage_account_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_brokerage_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_account_co** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO | 

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_brokerage_client_using_post**
> BrokerageCreateClientVO create_brokerage_client_using_post(client_co)

Create a Brokerage Client

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
client_co = integration_api.BrokerageClientCO() # BrokerageClientCO | clientCO

try:
    # Create a Brokerage Client
    api_response = api_instance.create_brokerage_client_using_post(client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_brokerage_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_deposit_using_post**
> BrokerageDepositVO create_deposit_using_post(brokerage_deposit_co)

Create a deposit

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_deposit_co = integration_api.BrokerageDepositCO() # BrokerageDepositCO | brokerageDepositCO

try:
    # Create a deposit
    api_response = api_instance.create_deposit_using_post(brokerage_deposit_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_deposit_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_deposit_co** | [**BrokerageDepositCO**](BrokerageDepositCO.md)| brokerageDepositCO | 

### Return type

[**BrokerageDepositVO**](BrokerageDepositVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_document_using_post**
> BrokerageDocumentVO create_document_using_post(document_co)

Create a Brokerage document

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
document_co = integration_api.BrokerageDocumentCO() # BrokerageDocumentCO | documentCO

try:
    # Create a Brokerage document
    api_response = api_instance.create_document_using_post(document_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_document_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **document_co** | [**BrokerageDocumentCO**](BrokerageDocumentCO.md)| documentCO | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_order_using_post**
> BrokerageOrderVO create_order_using_post(brokerage_order_co)

Create an Order

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_order_co = integration_api.BrokerageOrderCO() # BrokerageOrderCO | brokerageOrderCO

try:
    # Create an Order
    api_response = api_instance.create_order_using_post(brokerage_order_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_order_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_order_co** | [**BrokerageOrderCO**](BrokerageOrderCO.md)| brokerageOrderCO | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_withdrawal_using_post**
> BrokerageWithdrawalVO create_withdrawal_using_post(brokerage_withdrawal_co)

Create a withdrawal

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
brokerage_withdrawal_co = integration_api.BrokerageWithdrawalCO() # BrokerageWithdrawalCO | brokerageWithdrawalCO

try:
    # Create a withdrawal
    api_response = api_instance.create_withdrawal_using_post(brokerage_withdrawal_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->create_withdrawal_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerage_withdrawal_co** | [**BrokerageWithdrawalCO**](BrokerageWithdrawalCO.md)| brokerageWithdrawalCO | 

### Return type

[**BrokerageWithdrawalVO**](BrokerageWithdrawalVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete1**
> delete_bank_link_using_delete1(nucleus_bank_link_id)

Delete a Bank Link

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Delete a Bank Link
    api_instance.delete_bank_link_using_delete1(nucleus_bank_link_id)
except ApiException as e:
    print("Exception when calling BrokerageApi->delete_bank_link_using_delete1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_balance_using_get1**
> BrokerageBalanceVO get_balance_using_get1(nucleus_portfolio_id)

Get account balance

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id

try:
    # Get account balance
    api_response = api_instance.get_balance_using_get1(nucleus_portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_balance_using_get1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageBalanceVO**](BrokerageBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get1**
> BrokerageBankLinkVO get_bank_link_using_get1(nucleus_bank_link_id)

Get a Bank Link

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get a Bank Link
    api_response = api_instance.get_bank_link_using_get1(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_bank_link_using_get1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_brokerage_account_statement_using_get**
> BrokerageStatementVO get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)

Get a Brokerage account statement

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
end_date = '2013-10-20T19:20:30+01:00' # datetime | end_date
nucleus_account_id = 'nucleus_account_id_example' # str | nucleus_account_id
start_date = '2013-10-20T19:20:30+01:00' # datetime | start_date
statement_type = 'statement_type_example' # str | statement_type

try:
    # Get a Brokerage account statement
    api_response = api_instance.get_brokerage_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_brokerage_account_statement_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **datetime**| end_date | 
 **nucleus_account_id** | [**str**](.md)| nucleus_account_id | 
 **start_date** | **datetime**| start_date | 
 **statement_type** | **str**| statement_type | 

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_using_get**
> BrokerageDocumentVO get_document_using_get(nucleus_document_id)

Get a Brokerage document

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_document_id = 'nucleus_document_id_example' # str | nucleus_document_id

try:
    # Get a Brokerage document
    api_response = api_instance.get_document_using_get(nucleus_document_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_document_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_document_id** | [**str**](.md)| nucleus_document_id | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_holding_performance_using_get**
> BrokeragePerformanceVO get_holding_performance_using_get(nucleus_portfolio_id)

Get portfolio holding performance

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id

try:
    # Get portfolio holding performance
    api_response = api_instance.get_holding_performance_using_get(nucleus_portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_holding_performance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokeragePerformanceVO**](BrokeragePerformanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_holding_using_get**
> BrokerageHoldingVO get_holding_using_get(nucleus_portfolio_id)

Get portfolio holdings

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id

try:
    # Get portfolio holdings
    api_response = api_instance.get_holding_using_get(nucleus_portfolio_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_holding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageHoldingVO**](BrokerageHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_using_get**
> BrokerageOrderVO get_order_using_get(nucleus_order_id)

Get an Order

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_order_id = 'nucleus_order_id_example' # str | nucleus_order_id

try:
    # Get an Order
    api_response = api_instance.get_order_using_get(nucleus_order_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_order_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_order_id** | [**str**](.md)| nucleus_order_id | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_securities_using_get**
> BrokerageSecuritiesVO get_securities_using_get(vendor_name, get_fundamentals=get_fundamentals, nucleus_security_id=nucleus_security_id)

Get securities information

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
vendor_name = 'vendor_name_example' # str | vendor_name
get_fundamentals = false # bool | get_fundamentals (optional) (default to false)
nucleus_security_id = 'nucleus_security_id_example' # str | nucleus_security_id (optional)

try:
    # Get securities information
    api_response = api_instance.get_securities_using_get(vendor_name, get_fundamentals=get_fundamentals, nucleus_security_id=nucleus_security_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_securities_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor_name** | **str**| vendor_name | 
 **get_fundamentals** | **bool**| get_fundamentals | [optional] [default to false]
 **nucleus_security_id** | [**str**](.md)| nucleus_security_id | [optional] 

### Return type

[**BrokerageSecuritiesVO**](BrokerageSecuritiesVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transactions_using_get**
> BrokerageTransactionVO get_transactions_using_get(drivewealth_response, end_date, nucleus_portfolio_id, start_date)

Get account transactions

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
drivewealth_response = integration_api.GetTransactionsResponse() # GetTransactionsResponse | drivewealthResponse
end_date = '2013-10-20' # date | end_date
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id
start_date = '2013-10-20' # date | start_date

try:
    # Get account transactions
    api_response = api_instance.get_transactions_using_get(drivewealth_response, end_date, nucleus_portfolio_id, start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->get_transactions_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivewealth_response** | [**GetTransactionsResponse**](GetTransactionsResponse.md)| drivewealthResponse | 
 **end_date** | **date**| end_date | 
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 
 **start_date** | **date**| start_date | 

### Return type

[**BrokerageTransactionVO**](BrokerageTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put1**
> BrokerageBankLinkVO update_bank_link_using_put1(nucleus_bank_link_id)

Update a Bank Link

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Update a Bank Link
    api_response = api_instance.update_bank_link_using_put1(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->update_bank_link_using_put1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_brokerage_client_using_put**
> BrokerageUpdateClientVO update_brokerage_client_using_put(client_co)

Update a Brokerage client

### Example
```python
from __future__ import print_function
import time
import integration_api
from integration_api.rest import ApiException
from pprint import pprint


# Configure OAuth2 access token for authorization: oauth2
configuration = integration_api.Configuration()

# create an instance of the API class
api_instance = integration_api.AuthApi(integration_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.BrokerageApi(integration_api.ApiClient(configuration))
client_co = integration_api.BrokerageClientCO() # BrokerageClientCO | clientCO

try:
    # Update a Brokerage client
    api_response = api_instance.update_brokerage_client_using_put(client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BrokerageApi->update_brokerage_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_co** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

