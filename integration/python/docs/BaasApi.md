# integration_api.BaasApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_baas_account_using_post**](BaasApi.md#create_baas_account_using_post) | **POST** /baas/account | create a Baas account
[**create_baas_business_using_post**](BaasApi.md#create_baas_business_using_post) | **POST** /baas/business | Create a Baas Business
[**create_baas_client_using_post**](BaasApi.md#create_baas_client_using_post) | **POST** /baas/client | Create a Baas Client
[**create_baas_sub_account_using_post**](BaasApi.md#create_baas_sub_account_using_post) | **POST** /baas/subaccount | create a Baas subaccount
[**get_baas_account_statement_using_get**](BaasApi.md#get_baas_account_statement_using_get) | **GET** /baas/statement/{nucleus_account_id} | Get a Baas account statement
[**get_baas_portfolio_balance_using_get**](BaasApi.md#get_baas_portfolio_balance_using_get) | **GET** /baas/balance/{nucleus_portfolio_id} | Get a Baas portfolio balance
[**get_baas_portfolio_transaction_using_get**](BaasApi.md#get_baas_portfolio_transaction_using_get) | **GET** /baas/transaction/{nucleus_portfolio_id} | Get a Baas portfolio transaction
[**update_baas_business_using_put**](BaasApi.md#update_baas_business_using_put) | **PUT** /baas/business/{nucleus_business_id} | Update a Baas business
[**update_baas_client_using_put**](BaasApi.md#update_baas_client_using_put) | **PUT** /baas/client/{nucleus_client_id} | Update a Baas client


# **create_baas_account_using_post**
> BaasAccountVO create_baas_account_using_post(baas_account_co)

create a Baas account

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
baas_account_co = integration_api.BaasAccountCO() # BaasAccountCO | baasAccountCO

try:
    # create a Baas account
    api_response = api_instance.create_baas_account_using_post(baas_account_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->create_baas_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_account_co** | [**BaasAccountCO**](BaasAccountCO.md)| baasAccountCO | 

### Return type

[**BaasAccountVO**](BaasAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_baas_business_using_post**
> BaasBusinessVO create_baas_business_using_post(baas_business_co)

Create a Baas Business

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
baas_business_co = integration_api.CreateBaasBusinessCO() # CreateBaasBusinessCO | baasBusinessCO

try:
    # Create a Baas Business
    api_response = api_instance.create_baas_business_using_post(baas_business_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->create_baas_business_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_business_co** | [**CreateBaasBusinessCO**](CreateBaasBusinessCO.md)| baasBusinessCO | 

### Return type

[**BaasBusinessVO**](BaasBusinessVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_baas_client_using_post**
> BaasClientVO create_baas_client_using_post(baas_client_co)

Create a Baas Client

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
baas_client_co = integration_api.CreateBaasClientCO() # CreateBaasClientCO | baasClientCO

try:
    # Create a Baas Client
    api_response = api_instance.create_baas_client_using_post(baas_client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->create_baas_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_client_co** | [**CreateBaasClientCO**](CreateBaasClientCO.md)| baasClientCO | 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_baas_sub_account_using_post**
> BaasSubAccountVO create_baas_sub_account_using_post(baas_sub_account_co)

create a Baas subaccount

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
baas_sub_account_co = integration_api.BaasSubAccountCO() # BaasSubAccountCO | baasSubAccountCO

try:
    # create a Baas subaccount
    api_response = api_instance.create_baas_sub_account_using_post(baas_sub_account_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->create_baas_sub_account_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baas_sub_account_co** | [**BaasSubAccountCO**](BaasSubAccountCO.md)| baasSubAccountCO | 

### Return type

[**BaasSubAccountVO**](BaasSubAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_baas_account_statement_using_get**
> BaasStatementsVO get_baas_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type=statement_type)

Get a Baas account statement

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
end_date = '2013-10-20' # date | end_date
nucleus_account_id = 'nucleus_account_id_example' # str | nucleus_account_id
start_date = '2013-10-20' # date | start_date
statement_type = 'statement_type_example' # str | statement_type (optional)

try:
    # Get a Baas account statement
    api_response = api_instance.get_baas_account_statement_using_get(end_date, nucleus_account_id, start_date, statement_type=statement_type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->get_baas_account_statement_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **date**| end_date | 
 **nucleus_account_id** | [**str**](.md)| nucleus_account_id | 
 **start_date** | **date**| start_date | 
 **statement_type** | **str**| statement_type | [optional] 

### Return type

[**BaasStatementsVO**](BaasStatementsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_baas_portfolio_balance_using_get**
> BaasBalanceVO get_baas_portfolio_balance_using_get(nucleus_portfolio_id, end_date=end_date, start_date=start_date)

Get a Baas portfolio balance

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get a Baas portfolio balance
    api_response = api_instance.get_baas_portfolio_balance_using_get(nucleus_portfolio_id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->get_baas_portfolio_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**BaasBalanceVO**](BaasBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_baas_portfolio_transaction_using_get**
> BaasTransactionsVO get_baas_portfolio_transaction_using_get(nucleus_portfolio_id, end_date=end_date, start_date=start_date)

Get a Baas portfolio transaction

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
nucleus_portfolio_id = 'nucleus_portfolio_id_example' # str | nucleus_portfolio_id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get a Baas portfolio transaction
    api_response = api_instance.get_baas_portfolio_transaction_using_get(nucleus_portfolio_id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->get_baas_portfolio_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_portfolio_id** | [**str**](.md)| nucleus_portfolio_id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**BaasTransactionsVO**](BaasTransactionsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_baas_business_using_put**
> BaasBusinessVO update_baas_business_using_put(nucleus_business_id, baas_business_co=baas_business_co)

Update a Baas business

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
nucleus_business_id = 'nucleus_business_id_example' # str | nucleus_business_id
baas_business_co = integration_api.UpdateBaasBusinessCO() # UpdateBaasBusinessCO | baasBusinessCO (optional)

try:
    # Update a Baas business
    api_response = api_instance.update_baas_business_using_put(nucleus_business_id, baas_business_co=baas_business_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->update_baas_business_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_business_id** | [**str**](.md)| nucleus_business_id | 
 **baas_business_co** | [**UpdateBaasBusinessCO**](UpdateBaasBusinessCO.md)| baasBusinessCO | [optional] 

### Return type

[**BaasBusinessVO**](BaasBusinessVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_baas_client_using_put**
> BaasClientVO update_baas_client_using_put(nucleus_client_id, baas_client_co=baas_client_co)

Update a Baas client

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
api_instance = integration_api.BaasApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id
baas_client_co = integration_api.UpdateBaasClientCO() # UpdateBaasClientCO | baasClientCO (optional)

try:
    # Update a Baas client
    api_response = api_instance.update_baas_client_using_put(nucleus_client_id, baas_client_co=baas_client_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaasApi->update_baas_client_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 
 **baas_client_co** | [**UpdateBaasClientCO**](UpdateBaasClientCO.md)| baasClientCO | [optional] 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

