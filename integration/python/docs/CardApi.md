# integration_api.CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_card_activate_using_post**](CardApi.md#create_card_activate_using_post) | **POST** /card/activate | Activate card
[**create_card_close_using_post**](CardApi.md#create_card_close_using_post) | **POST** /card/close | close a card
[**create_card_issue_using_post**](CardApi.md#create_card_issue_using_post) | **POST** /card/issue | issue a card
[**create_card_pin_using_post**](CardApi.md#create_card_pin_using_post) | **POST** /card/pin | pin card
[**create_card_reactivate_using_post**](CardApi.md#create_card_reactivate_using_post) | **POST** /card/reactivate | reactivate card
[**create_card_reissue_using_post**](CardApi.md#create_card_reissue_using_post) | **POST** /card/reissue | Reissue a card
[**create_card_reload_using_post**](CardApi.md#create_card_reload_using_post) | **POST** /card/reload | Create a card reload
[**create_card_suspend_using_post**](CardApi.md#create_card_suspend_using_post) | **POST** /card/suspend | suspend card
[**create_card_token_using_post**](CardApi.md#create_card_token_using_post) | **POST** /card/token | token card
[**create_card_transfer_using_post**](CardApi.md#create_card_transfer_using_post) | **POST** /card/transfer | Create Card transfer
[**create_card_unload_using_post**](CardApi.md#create_card_unload_using_post) | **POST** /card/unload | Create a card upload
[**create_client_card_using_post**](CardApi.md#create_client_card_using_post) | **POST** /card/client | Create a card client
[**get_card_balance_using_get**](CardApi.md#get_card_balance_using_get) | **GET** /card/balance/{id} | Get a Card Balance
[**get_card_token_using_token**](CardApi.md#get_card_token_using_token) | **GET** /card/token/{id} | Get a card token
[**get_card_transaction_using_get**](CardApi.md#get_card_transaction_using_get) | **GET** /card/transaction/{id} | Get a card transaction
[**get_card_using_get**](CardApi.md#get_card_using_get) | **GET** /card/{id} | Get a card information
[**update_card_pin_using_post**](CardApi.md#update_card_pin_using_post) | **PUT** /card/pin/{id} | update a pin card
[**update_card_using_put**](CardApi.md#update_card_using_put) | **PUT** /card/{id} | Update a card information


# **create_card_activate_using_post**
> BaseResponseVO create_card_activate_using_post(activate_request)

Activate card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
activate_request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | activateRequest

try:
    # Activate card
    api_response = api_instance.create_card_activate_using_post(activate_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_activate_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activate_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| activateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_close_using_post**
> BaseResponseVO create_card_close_using_post(close_request)

close a card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
close_request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | closeRequest

try:
    # close a card
    api_response = api_instance.create_card_close_using_post(close_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_close_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **close_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| closeRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_issue_using_post**
> BaseResponseVO create_card_issue_using_post(issue_request)

issue a card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
issue_request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | issueRequest

try:
    # issue a card
    api_response = api_instance.create_card_issue_using_post(issue_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_issue_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| issueRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_pin_using_post**
> BaseResponseVO create_card_pin_using_post(card_pin_request_co)

pin card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_pin_request_co = integration_api.CardPinRequestCO() # CardPinRequestCO | cardPinRequestCO

try:
    # pin card
    api_response = api_instance.create_card_pin_using_post(card_pin_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_pin_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_reactivate_using_post**
> BaseResponseVO create_card_reactivate_using_post(reactivate_request)

reactivate card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
reactivate_request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | reactivateRequest

try:
    # reactivate card
    api_response = api_instance.create_card_reactivate_using_post(reactivate_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_reactivate_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reactivate_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| reactivateRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_reissue_using_post**
> BaseResponseVO create_card_reissue_using_post(request)

Reissue a card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | request

try:
    # Reissue a card
    api_response = api_instance.create_card_reissue_using_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_reissue_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_reload_using_post**
> CardReloadUnloadResponseVO create_card_reload_using_post(reload_request)

Create a card reload

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
reload_request = integration_api.CardReloadRequestCO() # CardReloadRequestCO | reloadRequest

try:
    # Create a card reload
    api_response = api_instance.create_card_reload_using_post(reload_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_reload_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**CardReloadRequestCO**](CardReloadRequestCO.md)| reloadRequest | 

### Return type

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_suspend_using_post**
> BaseResponseVO create_card_suspend_using_post(suspend_request)

suspend card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
suspend_request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | suspendRequest

try:
    # suspend card
    api_response = api_instance.create_card_suspend_using_post(suspend_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_suspend_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suspend_request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| suspendRequest | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_token_using_post**
> CardTokenResponseVO create_card_token_using_post(tokenize_request)

token card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
tokenize_request = integration_api.CardTokenRequestCO() # CardTokenRequestCO | tokenizeRequest

try:
    # token card
    api_response = api_instance.create_card_token_using_post(tokenize_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_token_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenize_request** | [**CardTokenRequestCO**](CardTokenRequestCO.md)| tokenizeRequest | 

### Return type

[**CardTokenResponseVO**](CardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_transfer_using_post**
> CardTransferResponseVO create_card_transfer_using_post(transfer_request)

Create Card transfer

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
transfer_request = integration_api.CardTransferRequestCO() # CardTransferRequestCO | transferRequest

try:
    # Create Card transfer
    api_response = api_instance.create_card_transfer_using_post(transfer_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_transfer_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transfer_request** | [**CardTransferRequestCO**](CardTransferRequestCO.md)| transferRequest | 

### Return type

[**CardTransferResponseVO**](CardTransferResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_unload_using_post**
> CardReloadUnloadResponseVO create_card_unload_using_post(reload_request)

Create a card upload

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
reload_request = integration_api.CardUnloadRequestCO() # CardUnloadRequestCO | reloadRequest

try:
    # Create a card upload
    api_response = api_instance.create_card_unload_using_post(reload_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_unload_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reload_request** | [**CardUnloadRequestCO**](CardUnloadRequestCO.md)| reloadRequest | 

### Return type

[**CardReloadUnloadResponseVO**](CardReloadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_card_using_post**
> CardClientResponseVO create_client_card_using_post(card_client_request_co)

Create a card client

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_client_request_co = integration_api.CardClientRequestCO() # CardClientRequestCO | cardClientRequestCO

try:
    # Create a card client
    api_response = api_instance.create_client_card_using_post(card_client_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_client_card_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_client_request_co** | [**CardClientRequestCO**](CardClientRequestCO.md)| cardClientRequestCO | 

### Return type

[**CardClientResponseVO**](CardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_balance_using_get**
> CardBalanceResponseVO get_card_balance_using_get(id, end_date=end_date, start_date=start_date)

Get a Card Balance

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get a Card Balance
    api_response = api_instance.get_card_balance_using_get(id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_balance_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**CardBalanceResponseVO**](CardBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_token_using_token**
> GetCardTokenResponseVO get_card_token_using_token(id)

Get a card token

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id

try:
    # Get a card token
    api_response = api_instance.get_card_token_using_token(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_token_using_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

[**GetCardTokenResponseVO**](GetCardTokenResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_transaction_using_get**
> CardTransactionResponseVO get_card_transaction_using_get(id, end_date=end_date, start_date=start_date)

Get a card transaction

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get a card transaction
    api_response = api_instance.get_card_transaction_using_get(id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_transaction_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**CardTransactionResponseVO**](CardTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_using_get**
> BaseResponseVO get_card_using_get(id)

Get a card information

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id

try:
    # Get a card information
    api_response = api_instance.get_card_using_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_card_pin_using_post**
> BaseResponseVO update_card_pin_using_post(card_pin_request_co, id)

update a pin card

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_pin_request_co = integration_api.CardPinRequestCO() # CardPinRequestCO | cardPinRequestCO
id = 'id_example' # str | id

try:
    # update a pin card
    api_response = api_instance.update_card_pin_using_post(card_pin_request_co, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_pin_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_pin_request_co** | [**CardPinRequestCO**](CardPinRequestCO.md)| cardPinRequestCO | 
 **id** | [**str**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_card_using_put**
> BaseResponseVO update_card_using_put(id)

Update a card information

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

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id

try:
    # Update a card information
    api_response = api_instance.update_card_using_put(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

