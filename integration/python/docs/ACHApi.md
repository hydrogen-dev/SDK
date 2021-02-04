# integration_api.ACHApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_ach_transfer_using_delete**](ACHApi.md#cancel_ach_transfer_using_delete) | **DELETE** /ach/{nucleus_funding_id} | Cancel the ACH transfer
[**create_ach_card_link_using_post**](ACHApi.md#create_ach_card_link_using_post) | **POST** /ach/card_link | Create an ACH card link
[**create_bank_link_using_post**](ACHApi.md#create_bank_link_using_post) | **POST** /ach/bank_link | Create bank link
[**create_business_using_post**](ACHApi.md#create_business_using_post) | **POST** /ach/business | Create a business
[**create_client_using_post**](ACHApi.md#create_client_using_post) | **POST** /ach/client | Create a client
[**delete_bank_link_using_delete**](ACHApi.md#delete_bank_link_using_delete) | **DELETE** /ach/bank_link/{nucleus_bank_link_id} | Delete bank link
[**get_ach_transfer_using_get**](ACHApi.md#get_ach_transfer_using_get) | **GET** /ach/{nucleus_funding_id} | Get the ACH transfer
[**get_balance_using_get**](ACHApi.md#get_balance_using_get) | **GET** /ach/balance/{portfolio_id} | Get balance
[**get_bank_link_using_get**](ACHApi.md#get_bank_link_using_get) | **GET** /ach/bank_link/{nucleus_bank_link_id} | Get bank link
[**get_bank_links_for_reserve_account_using_get**](ACHApi.md#get_bank_links_for_reserve_account_using_get) | **GET** /ach/bank_link/reserve | Get bank links for a reserve account
[**get_client_bank_links_using_get**](ACHApi.md#get_client_bank_links_using_get) | **GET** /ach/bank_link/client/{nucleus_client_id} | Get client bank links
[**get_list_of_client_ach_transfers_using_get**](ACHApi.md#get_list_of_client_ach_transfers_using_get) | **GET** /ach/client/{nucleus_client_id} | Get a list of client&#39;s ACH transfers
[**get_list_of_tenant_ach_transfers_using_get**](ACHApi.md#get_list_of_tenant_ach_transfers_using_get) | **GET** /ach | Get a list of tenant&#39;s ACH transfers
[**submit_ach_transfer_using_post**](ACHApi.md#submit_ach_transfer_using_post) | **POST** /ach | Submit an ACH transfer
[**update_bank_link_using_put**](ACHApi.md#update_bank_link_using_put) | **PUT** /ach/bank_link/{nucleus_bank_link_id} | Update bank link


# **cancel_ach_transfer_using_delete**
> AchTransferResponseVO cancel_ach_transfer_using_delete(nucleus_funding_id)

Cancel the ACH transfer

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Cancel the ACH transfer
    api_response = api_instance.cancel_ach_transfer_using_delete(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->cancel_ach_transfer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_ach_card_link_using_post**
> AchCardLinkResponseVO create_ach_card_link_using_post(card_link_request_co)

Create an ACH card link

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
card_link_request_co = integration_api.AchCardLinkRequestCO() # AchCardLinkRequestCO | cardLinkRequestCO

try:
    # Create an ACH card link
    api_response = api_instance.create_ach_card_link_using_post(card_link_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->create_ach_card_link_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_link_request_co** | [**AchCardLinkRequestCO**](AchCardLinkRequestCO.md)| cardLinkRequestCO | 

### Return type

[**AchCardLinkResponseVO**](AchCardLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_bank_link_using_post**
> AchBankLinkResponseVO create_bank_link_using_post(ach_bank_link_request_co)

Create bank link

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
ach_bank_link_request_co = integration_api.AchBankLinkRequestCO() # AchBankLinkRequestCO | achBankLinkRequestCO

try:
    # Create bank link
    api_response = api_instance.create_bank_link_using_post(ach_bank_link_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->create_bank_link_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ach_bank_link_request_co** | [**AchBankLinkRequestCO**](AchBankLinkRequestCO.md)| achBankLinkRequestCO | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_business_using_post**
> BaseResponseVO create_business_using_post(business_request)

Create a business

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
business_request = integration_api.AchBusinessRequestCO() # AchBusinessRequestCO | businessRequest

try:
    # Create a business
    api_response = api_instance.create_business_using_post(business_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->create_business_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_request** | [**AchBusinessRequestCO**](AchBusinessRequestCO.md)| businessRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_using_post**
> AchClientResponseVO create_client_using_post(client_request)

Create a client

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
client_request = integration_api.AchClientRequestCO() # AchClientRequestCO | clientRequest

try:
    # Create a client
    api_response = api_instance.create_client_using_post(client_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->create_client_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_request** | [**AchClientRequestCO**](AchClientRequestCO.md)| clientRequest | 

### Return type

[**AchClientResponseVO**](AchClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete**
> AchBankLinkResponseVO delete_bank_link_using_delete(nucleus_bank_link_id)

Delete bank link

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Delete bank link
    api_response = api_instance.delete_bank_link_using_delete(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->delete_bank_link_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ach_transfer_using_get**
> AchTransferResponseVO get_ach_transfer_using_get(nucleus_funding_id)

Get the ACH transfer

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_funding_id = 'nucleus_funding_id_example' # str | nucleus_funding_id

try:
    # Get the ACH transfer
    api_response = api_instance.get_ach_transfer_using_get(nucleus_funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_ach_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_funding_id** | [**str**](.md)| nucleus_funding_id | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_balance_using_get**
> AchBalanceResponseVO get_balance_using_get(portfolio_id, end_date=end_date, start_date=start_date)

Get balance

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
portfolio_id = 'portfolio_id_example' # str | portfolio_id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get balance
    api_response = api_instance.get_balance_using_get(portfolio_id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio_id** | [**str**](.md)| portfolio_id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**AchBalanceResponseVO**](AchBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get**
> AchBankLinkResponseVO get_bank_link_using_get(nucleus_bank_link_id)

Get bank link

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Get bank link
    api_response = api_instance.get_bank_link_using_get(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_bank_link_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_links_for_reserve_account_using_get**
> list[AchBankLinkResponseVO] get_bank_links_for_reserve_account_using_get()

Get bank links for a reserve account

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))

try:
    # Get bank links for a reserve account
    api_response = api_instance.get_bank_links_for_reserve_account_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_bank_links_for_reserve_account_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[AchBankLinkResponseVO]**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_bank_links_using_get**
> list[AchBankLinkResponseVO] get_client_bank_links_using_get(nucleus_client_id)

Get client bank links

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id

try:
    # Get client bank links
    api_response = api_instance.get_client_bank_links_using_get(nucleus_client_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_client_bank_links_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 

### Return type

[**list[AchBankLinkResponseVO]**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_list_of_client_ach_transfers_using_get**
> PageAchTransferResponseVO get_list_of_client_ach_transfers_using_get(nucleus_client_id, page=page, size=size)

Get a list of client's ACH transfers

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_client_id = 'nucleus_client_id_example' # str | nucleus_client_id
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # Get a list of client's ACH transfers
    api_response = api_instance.get_list_of_client_ach_transfers_using_get(nucleus_client_id, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_list_of_client_ach_transfers_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_client_id** | [**str**](.md)| nucleus_client_id | 
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_list_of_tenant_ach_transfers_using_get**
> PageAchTransferResponseVO get_list_of_tenant_ach_transfers_using_get(end_date=end_date, page=page, size=size, start_date=start_date, status=status)

Get a list of tenant's ACH transfers

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
end_date = '2013-10-20' # date | end_date (optional)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)
start_date = '2013-10-20' # date | start_date (optional)
status = 'status_example' # str | status (optional)

try:
    # Get a list of tenant's ACH transfers
    api_response = api_instance.get_list_of_tenant_ach_transfers_using_get(end_date=end_date, page=page, size=size, start_date=start_date, status=status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->get_list_of_tenant_ach_transfers_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **date**| end_date | [optional] 
 **page** | **int**| page | [optional] [default to 0]
 **size** | **int**| size | [optional] [default to 25]
 **start_date** | **date**| start_date | [optional] 
 **status** | **str**| status | [optional] 

### Return type

[**PageAchTransferResponseVO**](PageAchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_ach_transfer_using_post**
> AchTransferResponseVO submit_ach_transfer_using_post(transfer_request)

Submit an ACH transfer

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
transfer_request = integration_api.AchTransferRequestCO() # AchTransferRequestCO | transferRequest

try:
    # Submit an ACH transfer
    api_response = api_instance.submit_ach_transfer_using_post(transfer_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->submit_ach_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**AchTransferRequestCO**](AchTransferRequestCO.md)| transferRequest | 

### Return type

[**AchTransferResponseVO**](AchTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put**
> AchBankLinkResponseVO update_bank_link_using_put(nucleus_bank_link_id)

Update bank link

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
api_instance = integration_api.ACHApi(integration_api.ApiClient(configuration))
nucleus_bank_link_id = 'nucleus_bank_link_id_example' # str | nucleus_bank_link_id

try:
    # Update bank link
    api_response = api_instance.update_bank_link_using_put(nucleus_bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ACHApi->update_bank_link_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_bank_link_id** | [**str**](.md)| nucleus_bank_link_id | 

### Return type

[**AchBankLinkResponseVO**](AchBankLinkResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

