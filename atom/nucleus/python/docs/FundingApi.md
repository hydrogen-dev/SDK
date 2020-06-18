# nucleus_api.FundingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bank_link_using_post**](FundingApi.md#create_bank_link_using_post) | **POST** /bank_link | Create a bank link
[**create_deposit_using_post**](FundingApi.md#create_deposit_using_post) | **POST** /deposit | Create a deposit request
[**create_funding_using_post**](FundingApi.md#create_funding_using_post) | **POST** /funding | Create a funding request
[**create_transfer_using_post**](FundingApi.md#create_transfer_using_post) | **POST** /transfer | Create a transfer requests
[**create_withdrawal_using_post**](FundingApi.md#create_withdrawal_using_post) | **POST** /withdrawal | Create a withdrawal request
[**delete_bank_link_using_delete**](FundingApi.md#delete_bank_link_using_delete) | **DELETE** /bank_link/{bank_link_id} | Delete a bank link
[**delete_deposit_using_delete**](FundingApi.md#delete_deposit_using_delete) | **DELETE** /deposit/{deposit_id} | Delete a deposit request
[**delete_funding_using_delete**](FundingApi.md#delete_funding_using_delete) | **DELETE** /funding/{funding_id} | Delete a funding request
[**delete_transfer_using_delete**](FundingApi.md#delete_transfer_using_delete) | **DELETE** /transfer/{transfer_id} | Delete a transfer request
[**delete_withdrawal_using_delete**](FundingApi.md#delete_withdrawal_using_delete) | **DELETE** /withdrawal/{withdrawal_id} | Delete a withdrawal request
[**get_bank_link_all_using_get**](FundingApi.md#get_bank_link_all_using_get) | **GET** /bank_link | List all bank links
[**get_bank_link_using_get**](FundingApi.md#get_bank_link_using_get) | **GET** /bank_link/{bank_link_id} | Retrieve a bank link
[**get_deposit_all_using_get**](FundingApi.md#get_deposit_all_using_get) | **GET** /deposit | List all deposit requests
[**get_deposit_using_get**](FundingApi.md#get_deposit_using_get) | **GET** /deposit/{deposit_id} | Retrieve a deposit request
[**get_funding_all_using_get**](FundingApi.md#get_funding_all_using_get) | **GET** /funding | List all funding requests 
[**get_funding_using_get**](FundingApi.md#get_funding_using_get) | **GET** /funding/{funding_id} | Retrieve a funding request
[**get_transfer_all_using_get**](FundingApi.md#get_transfer_all_using_get) | **GET** /transfer | List all transfer requests
[**get_transfer_using_get**](FundingApi.md#get_transfer_using_get) | **GET** /transfer/{transfer_id} | Retrieve a transfer request
[**get_withdrawal_all_using_get**](FundingApi.md#get_withdrawal_all_using_get) | **GET** /withdrawal | List all withdrawal requests
[**get_withdrawal_using_get**](FundingApi.md#get_withdrawal_using_get) | **GET** /withdrawal/{withdrawal_id} | Retrieve a withdrawal request
[**update_bank_link_bulk_using_put**](FundingApi.md#update_bank_link_bulk_using_put) | **PUT** /bulk_bank_link | Update list of bank link
[**update_bank_link_using_put**](FundingApi.md#update_bank_link_using_put) | **PUT** /bank_link/{bank_link_id} | Update a bank link
[**update_deposit_using_put**](FundingApi.md#update_deposit_using_put) | **PUT** /deposit/{deposit_id} | Update a deposit request
[**update_funding_using_put**](FundingApi.md#update_funding_using_put) | **PUT** /funding/{funding_id} | Update a funding request
[**update_transfer_using_put**](FundingApi.md#update_transfer_using_put) | **PUT** /transfer/{transfer_id} | Update a transfer request
[**update_withdrawal_using_put**](FundingApi.md#update_withdrawal_using_put) | **PUT** /withdrawal/{withdrawal_id} | Update a withdrawal request


# **create_bank_link_using_post**
> BankLink create_bank_link_using_post(bank_link_info_request)

Create a bank link

Create a new bank link for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
bank_link_info_request = nucleus_api.BankLink() # BankLink | bankLinkInfoRequest

try:
    # Create a bank link
    api_response = api_instance.create_bank_link_using_post(bank_link_info_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->create_bank_link_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_info_request** | [**BankLink**](BankLink.md)| bankLinkInfoRequest | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_deposit_using_post**
> DailyDeposit create_deposit_using_post(daily_deposit_request)

Create a deposit request

Create a new deposit request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
daily_deposit_request = nucleus_api.DailyDeposit() # DailyDeposit | dailyDepositRequest

try:
    # Create a deposit request
    api_response = api_instance.create_deposit_using_post(daily_deposit_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->create_deposit_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_deposit_request** | [**DailyDeposit**](DailyDeposit.md)| dailyDepositRequest | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_funding_using_post**
> Funding create_funding_using_post(funding_request)

Create a funding request

Create a new funding request for an account. 

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
funding_request = nucleus_api.Funding() # Funding | fundingRequest

try:
    # Create a funding request
    api_response = api_instance.create_funding_using_post(funding_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->create_funding_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_request** | [**Funding**](Funding.md)| fundingRequest | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transfer_using_post**
> ExternalAccountTransfer create_transfer_using_post(external_account_transfer_request)

Create a transfer requests

Create a new external account transfer for a client account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
external_account_transfer_request = nucleus_api.ExternalAccountTransfer() # ExternalAccountTransfer | externalAccountTransferRequest

try:
    # Create a transfer requests
    api_response = api_instance.create_transfer_using_post(external_account_transfer_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->create_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_request** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| externalAccountTransferRequest | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_withdrawal_using_post**
> DailyWithdrawal create_withdrawal_using_post(daily_withdrawal_request)

Create a withdrawal request

Create a new withdrawal request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
daily_withdrawal_request = nucleus_api.DailyWithdrawal() # DailyWithdrawal | dailyWithdrawalRequest

try:
    # Create a withdrawal request
    api_response = api_instance.create_withdrawal_using_post(daily_withdrawal_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->create_withdrawal_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daily_withdrawal_request** | [**DailyWithdrawal**](DailyWithdrawal.md)| dailyWithdrawalRequest | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_bank_link_using_delete**
> delete_bank_link_using_delete(bank_link_id)

Delete a bank link

Permanently delete a bank link defined for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
bank_link_id = 'bank_link_id_example' # str | UUID bank_link_id

try:
    # Delete a bank link
    api_instance.delete_bank_link_using_delete(bank_link_id)
except ApiException as e:
    print("Exception when calling FundingApi->delete_bank_link_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**str**](.md)| UUID bank_link_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_deposit_using_delete**
> delete_deposit_using_delete(deposit_id)

Delete a deposit request

Permanently delete a deposit request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
deposit_id = 'deposit_id_example' # str | UUID deposit_id

try:
    # Delete a deposit request
    api_instance.delete_deposit_using_delete(deposit_id)
except ApiException as e:
    print("Exception when calling FundingApi->delete_deposit_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**str**](.md)| UUID deposit_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_funding_using_delete**
> delete_funding_using_delete(funding_id)

Delete a funding request

Permanently delete a funding request defined for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
funding_id = 'funding_id_example' # str | UUID funding_id

try:
    # Delete a funding request
    api_instance.delete_funding_using_delete(funding_id)
except ApiException as e:
    print("Exception when calling FundingApi->delete_funding_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**str**](.md)| UUID funding_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_transfer_using_delete**
> delete_transfer_using_delete(transfer, transfer_id)

Delete a transfer request

Permanently delete a external account transfer from a client account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
transfer = 'transfer_example' # str | UUID external_account_transfer_id
transfer_id = 'transfer_id_example' # str | transfer_id

try:
    # Delete a transfer request
    api_instance.delete_transfer_using_delete(transfer, transfer_id)
except ApiException as e:
    print("Exception when calling FundingApi->delete_transfer_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**str**](.md)| UUID external_account_transfer_id | 
 **transfer_id** | [**str**](.md)| transfer_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_withdrawal_using_delete**
> delete_withdrawal_using_delete(withdrawal_id)

Delete a withdrawal request

Permanently delete a withdrawal request from an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
withdrawal_id = 'withdrawal_id_example' # str | UUID withdrawal_id

try:
    # Delete a withdrawal request
    api_instance.delete_withdrawal_using_delete(withdrawal_id)
except ApiException as e:
    print("Exception when calling FundingApi->delete_withdrawal_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**str**](.md)| UUID withdrawal_id | 

### Return type

void (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_all_using_get**
> PageBankLink get_bank_link_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all bank links

Get all bank links defined for all clients defined for your firm.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all bank links
    api_response = api_instance.get_bank_link_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_bank_link_all_using_get: %s\n" % e)
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

[**PageBankLink**](PageBankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bank_link_using_get**
> BankLink get_bank_link_using_get(bank_link_id)

Retrieve a bank link

Retrieve the information for a bank link for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
bank_link_id = 'bank_link_id_example' # str | UUID bank_link_id

try:
    # Retrieve a bank link
    api_response = api_instance.get_bank_link_using_get(bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_bank_link_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_id** | [**str**](.md)| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deposit_all_using_get**
> PageDailyDeposit get_deposit_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all deposit requests

Get the information for all deposit requests for all clients.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all deposit requests
    api_response = api_instance.get_deposit_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_deposit_all_using_get: %s\n" % e)
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

[**PageDailyDeposit**](PageDailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_deposit_using_get**
> DailyDeposit get_deposit_using_get(deposit_id)

Retrieve a deposit request

Retrieve the information for a deposit request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
deposit_id = 'deposit_id_example' # str | UUID deposit_id

try:
    # Retrieve a deposit request
    api_response = api_instance.get_deposit_using_get(deposit_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_deposit_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit_id** | [**str**](.md)| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funding_all_using_get**
> PageFunding get_funding_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all funding requests 

Get the information for all funding requests defined for your firm.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all funding requests 
    api_response = api_instance.get_funding_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_funding_all_using_get: %s\n" % e)
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

[**PageFunding**](PageFunding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funding_using_get**
> Funding get_funding_using_get(funding_id)

Retrieve a funding request

Retrieve the information for a funding request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
funding_id = 'funding_id_example' # str | UUID funding_id

try:
    # Retrieve a funding request
    api_response = api_instance.get_funding_using_get(funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_funding_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding_id** | [**str**](.md)| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transfer_all_using_get**
> PageExternalAccountTransfer get_transfer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all transfer requests

Get the information for all external account transfers defined for your firm.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all transfer requests
    api_response = api_instance.get_transfer_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_transfer_all_using_get: %s\n" % e)
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

[**PageExternalAccountTransfer**](PageExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transfer_using_get**
> ExternalAccountTransfer get_transfer_using_get(external_account_transfer_id, transfer_id)

Retrieve a transfer request

Retrieve the information for a external account transfer for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
external_account_transfer_id = 'external_account_transfer_id_example' # str | UUID external_account_transfer_id
transfer_id = 'transfer_id_example' # str | transfer_id

try:
    # Retrieve a transfer request
    api_response = api_instance.get_transfer_using_get(external_account_transfer_id, transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_transfer_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_account_transfer_id** | [**str**](.md)| UUID external_account_transfer_id | 
 **transfer_id** | [**str**](.md)| transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_withdrawal_all_using_get**
> PageDailyWithdrawal get_withdrawal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)

List all withdrawal requests

Get the information for all withdrawal requests for all clients.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
ascending = false # bool | ascending (optional) (default to false)
filter = 'filter_example' # str | filter (optional)
order_by = 'update_date' # str | order_by (optional) (default to update_date)
page = 0 # int | page (optional) (default to 0)
size = 25 # int | size (optional) (default to 25)

try:
    # List all withdrawal requests
    api_response = api_instance.get_withdrawal_all_using_get(ascending=ascending, filter=filter, order_by=order_by, page=page, size=size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_withdrawal_all_using_get: %s\n" % e)
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

[**PageDailyWithdrawal**](PageDailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_withdrawal_using_get**
> DailyWithdrawal get_withdrawal_using_get(withdrawal_id)

Retrieve a withdrawal request

Retrieve the information for a withdrawal request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
withdrawal_id = 'withdrawal_id_example' # str | UUID withdrawal_id

try:
    # Retrieve a withdrawal request
    api_response = api_instance.get_withdrawal_using_get(withdrawal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->get_withdrawal_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal_id** | [**str**](.md)| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_bulk_using_put**
> list[BankLink] update_bank_link_bulk_using_put(bank_link_list)

Update list of bank link

Update bank link list for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
bank_link_list = [nucleus_api.BankLink()] # list[BankLink] | bankLinkList

try:
    # Update list of bank link
    api_response = api_instance.update_bank_link_bulk_using_put(bank_link_list)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_bank_link_bulk_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link_list** | [**list[BankLink]**](BankLink.md)| bankLinkList | 

### Return type

[**list[BankLink]**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_bank_link_using_put**
> BankLink update_bank_link_using_put(bank_link, bank_link_id)

Update a bank link

Update the information for a bank link for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
bank_link = nucleus_api.BankLink() # BankLink | bank_link
bank_link_id = 'bank_link_id_example' # str | UUID bank_link_id

try:
    # Update a bank link
    api_response = api_instance.update_bank_link_using_put(bank_link, bank_link_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_bank_link_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank_link** | [**BankLink**](BankLink.md)| bank_link | 
 **bank_link_id** | [**str**](.md)| UUID bank_link_id | 

### Return type

[**BankLink**](BankLink.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_deposit_using_put**
> DailyDeposit update_deposit_using_put(deposit, deposit_id)

Update a deposit request

Update the information for a deposit request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
deposit = nucleus_api.DailyDeposit() # DailyDeposit | deposit
deposit_id = 'deposit_id_example' # str | UUID deposit_id

try:
    # Update a deposit request
    api_response = api_instance.update_deposit_using_put(deposit, deposit_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_deposit_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deposit** | [**DailyDeposit**](DailyDeposit.md)| deposit | 
 **deposit_id** | [**str**](.md)| UUID deposit_id | 

### Return type

[**DailyDeposit**](DailyDeposit.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_funding_using_put**
> Funding update_funding_using_put(funding, funding_id)

Update a funding request

Update the information for a funding request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
funding = nucleus_api.Funding() # Funding | funding
funding_id = 'funding_id_example' # str | UUID funding_id

try:
    # Update a funding request
    api_response = api_instance.update_funding_using_put(funding, funding_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_funding_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funding** | [**Funding**](Funding.md)| funding | 
 **funding_id** | [**str**](.md)| UUID funding_id | 

### Return type

[**Funding**](Funding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_transfer_using_put**
> ExternalAccountTransfer update_transfer_using_put(transfer, transfer_id)

Update a transfer request

Update the information for a external account transfer for a client account. 

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
transfer = nucleus_api.ExternalAccountTransfer() # ExternalAccountTransfer | transfer
transfer_id = 'transfer_id_example' # str | UUID external_account_transfer_id

try:
    # Update a transfer request
    api_response = api_instance.update_transfer_using_put(transfer, transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_transfer_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer** | [**ExternalAccountTransfer**](ExternalAccountTransfer.md)| transfer | 
 **transfer_id** | [**str**](.md)| UUID external_account_transfer_id | 

### Return type

[**ExternalAccountTransfer**](ExternalAccountTransfer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_withdrawal_using_put**
> DailyWithdrawal update_withdrawal_using_put(withdrawal, withdrawal_id)

Update a withdrawal request

Update the information for a withdrawal request for an account.

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
api_instance = nucleus_api.FundingApi(nucleus_api.ApiClient(configuration))
withdrawal = nucleus_api.DailyWithdrawal() # DailyWithdrawal | withdrawal
withdrawal_id = 'withdrawal_id_example' # str | UUID withdrawal_id

try:
    # Update a withdrawal request
    api_response = api_instance.update_withdrawal_using_put(withdrawal, withdrawal_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FundingApi->update_withdrawal_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawal** | [**DailyWithdrawal**](DailyWithdrawal.md)| withdrawal | 
 **withdrawal_id** | [**str**](.md)| UUID withdrawal_id | 

### Return type

[**DailyWithdrawal**](DailyWithdrawal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

