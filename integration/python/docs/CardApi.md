# integration_api.CardApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_auto_reload_using_post**](CardApi.md#create_auto_reload_using_post) | **POST** /card/auto_reload | Card auto reload
[**create_card_activate_using_post**](CardApi.md#create_card_activate_using_post) | **POST** /card/activate | Activate card
[**create_card_business_using_post**](CardApi.md#create_card_business_using_post) | **POST** /card/business | Create a card business
[**create_card_close_using_post**](CardApi.md#create_card_close_using_post) | **POST** /card/close | close a card
[**create_card_issue_using_post**](CardApi.md#create_card_issue_using_post) | **POST** /card/issue | issue a card
[**create_card_load_using_post**](CardApi.md#create_card_load_using_post) | **POST** /card/load | Create a card load
[**create_card_pin_using_post**](CardApi.md#create_card_pin_using_post) | **POST** /card/pin | pin card
[**create_card_reactivate_using_post**](CardApi.md#create_card_reactivate_using_post) | **POST** /card/reactivate | reactivate card
[**create_card_reissue_using_post**](CardApi.md#create_card_reissue_using_post) | **POST** /card/reissue | Reissue a card
[**create_card_replace_using_post**](CardApi.md#create_card_replace_using_post) | **POST** /card/replace | Create card replace
[**create_card_spending_control_using_post**](CardApi.md#create_card_spending_control_using_post) | **POST** /card/spending_control | Create card spending control
[**create_card_suspend_using_post**](CardApi.md#create_card_suspend_using_post) | **POST** /card/suspend | suspend card
[**create_card_token_using_post**](CardApi.md#create_card_token_using_post) | **POST** /card/token | token card
[**create_card_unload_using_post**](CardApi.md#create_card_unload_using_post) | **POST** /card/unload | Create a card upload
[**create_client_card_using_post**](CardApi.md#create_client_card_using_post) | **POST** /card/client | Create a card client
[**get_card_balance_using_get**](CardApi.md#get_card_balance_using_get) | **GET** /card/balance/{id} | Get a Card Balance
[**get_card_image**](CardApi.md#get_card_image) | **GET** /card/image/{card_id} | Get card image
[**get_card_pci_details**](CardApi.md#get_card_pci_details) | **GET** /card/pci_details/{card_id} | Get card pci details
[**get_card_reserve_account_details_using_get**](CardApi.md#get_card_reserve_account_details_using_get) | **GET** /card/reserve | Card reserve account
[**get_card_statement_using_get**](CardApi.md#get_card_statement_using_get) | **GET** /card/statement/{card_id} | Get card statement
[**get_card_token_using_token**](CardApi.md#get_card_token_using_token) | **GET** /card/token/{id} | Get a card token
[**get_card_transaction_using_get**](CardApi.md#get_card_transaction_using_get) | **GET** /card/transaction/{id} | Get a card transaction
[**get_card_using_get**](CardApi.md#get_card_using_get) | **GET** /card/{id} | Get a card information
[**update_card_business_using_put**](CardApi.md#update_card_business_using_put) | **PUT** /card/business/{nucleus_business_id} | Update a card business
[**update_card_pin_using_post**](CardApi.md#update_card_pin_using_post) | **PUT** /card/pin/{id} | update a pin card
[**update_card_spending_control_using_put**](CardApi.md#update_card_spending_control_using_put) | **PUT** /card/spending_control/{nucleus_spending_control_id} | Update a card spending control
[**update_card_using_put**](CardApi.md#update_card_using_put) | **PUT** /card/{id} | Update a card information
[**update_client_card_using_put**](CardApi.md#update_client_card_using_put) | **PUT** /card/client/{id} | Update a card client
[**verify_card_pin_using_post**](CardApi.md#verify_card_pin_using_post) | **POST** /card/pin/verify | verify card pin


# **create_auto_reload_using_post**
> CardAutoReloadResponseVO create_auto_reload_using_post(request)

Card auto reload

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
request = integration_api.CardAutoReloadRequestCO() # CardAutoReloadRequestCO | request

try:
    # Card auto reload
    api_response = api_instance.create_auto_reload_using_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_auto_reload_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardAutoReloadRequestCO**](CardAutoReloadRequestCO.md)| request | 

### Return type

[**CardAutoReloadResponseVO**](CardAutoReloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **create_card_business_using_post**
> CreateBusinessResponseVO create_card_business_using_post(card_business_request_co)

Create a card business

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_business_request_co = integration_api.CardBusinessRequestCO() # CardBusinessRequestCO | cardBusinessRequestCO

try:
    # Create a card business
    api_response = api_instance.create_card_business_using_post(card_business_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_business_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_business_request_co** | [**CardBusinessRequestCO**](CardBusinessRequestCO.md)| cardBusinessRequestCO | 

### Return type

[**CreateBusinessResponseVO**](CreateBusinessResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **create_card_load_using_post**
> CardLoadUnloadResponseVO create_card_load_using_post(load_request)

Create a card load

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
load_request = integration_api.CardLoadRequestCO() # CardLoadRequestCO | loadRequest

try:
    # Create a card load
    api_response = api_instance.create_card_load_using_post(load_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_load_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **load_request** | [**CardLoadRequestCO**](CardLoadRequestCO.md)| loadRequest | 

### Return type

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **create_card_replace_using_post**
> CardReplaceResponseVO create_card_replace_using_post(request)

Create card replace

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
request = integration_api.CardBaseRequestCO() # CardBaseRequestCO | request

try:
    # Create card replace
    api_response = api_instance.create_card_replace_using_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_replace_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardBaseRequestCO**](CardBaseRequestCO.md)| request | 

### Return type

[**CardReplaceResponseVO**](CardReplaceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_card_spending_control_using_post**
> CardSpendingControlResponseVO create_card_spending_control_using_post(request)

Create card spending control

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
request = integration_api.CardSpendingControlRequestCO() # CardSpendingControlRequestCO | request

try:
    # Create card spending control
    api_response = api_instance.create_card_spending_control_using_post(request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->create_card_spending_control_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CardSpendingControlRequestCO**](CardSpendingControlRequestCO.md)| request | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **create_card_unload_using_post**
> CardLoadUnloadResponseVO create_card_unload_using_post(reload_request)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

[**CardLoadUnloadResponseVO**](CardLoadUnloadResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_client_card_using_post**
> CreateCardClientResponseVO create_client_card_using_post(card_client_request_co)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

[**CreateCardClientResponseVO**](CreateCardClientResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **get_card_image**
> GetCardImageResponseVO get_card_image(card_id)

Get card image

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_id = 'card_id_example' # str | card_id

try:
    # Get card image
    api_response = api_instance.get_card_image(card_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_image: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| card_id | 

### Return type

[**GetCardImageResponseVO**](GetCardImageResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_pci_details**
> GetCardPciDetailsResponseVO get_card_pci_details(card_id)

Get card pci details

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_id = 'card_id_example' # str | card_id

try:
    # Get card pci details
    api_response = api_instance.get_card_pci_details(card_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_pci_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| card_id | 

### Return type

[**GetCardPciDetailsResponseVO**](GetCardPciDetailsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_reserve_account_details_using_get**
> CardReserveAccountResponseVO get_card_reserve_account_details_using_get()

Card reserve account

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))

try:
    # Card reserve account
    api_response = api_instance.get_card_reserve_account_details_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_reserve_account_details_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CardReserveAccountResponseVO**](CardReserveAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_statement_using_get**
> GetCardStatementResponseVO get_card_statement_using_get(card_id, end_date=end_date, start_date=start_date)

Get card statement

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_id = 'card_id_example' # str | card_id
end_date = '2013-10-20' # date | end_date (optional)
start_date = '2013-10-20' # date | start_date (optional)

try:
    # Get card statement
    api_response = api_instance.get_card_statement_using_get(card_id, end_date=end_date, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_statement_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_id** | [**str**](.md)| card_id | 
 **end_date** | **date**| end_date | [optional] 
 **start_date** | **date**| start_date | [optional] 

### Return type

[**GetCardStatementResponseVO**](GetCardStatementResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_card_token_using_token**
> list[GetCardTokenResponseVO] get_card_token_using_token(id, device_id=device_id, device_type=device_type, wallet=wallet)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id
device_id = 'device_id_example' # str | device_id (optional)
device_type = 'device_type_example' # str | device_type (optional)
wallet = 'wallet_example' # str | wallet (optional)

try:
    # Get a card token
    api_response = api_instance.get_card_token_using_token(id, device_id=device_id, device_type=device_type, wallet=wallet)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->get_card_token_using_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 
 **device_id** | **str**| device_id | [optional] 
 **device_type** | **str**| device_type | [optional] 
 **wallet** | **str**| wallet | [optional] 

### Return type

[**list[GetCardTokenResponseVO]**](GetCardTokenResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **update_card_business_using_put**
> UpdateBusinessResponseVO update_card_business_using_put(nucleus_business_id)

Update a card business

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
nucleus_business_id = 'nucleus_business_id_example' # str | nucleus_business_id

try:
    # Update a card business
    api_response = api_instance.update_card_business_using_put(nucleus_business_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_business_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_business_id** | [**str**](.md)| nucleus_business_id | 

### Return type

[**UpdateBusinessResponseVO**](UpdateBusinessResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


configuration.access_token = api_token_response.access_token
# create an instance of the API class
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_pin_request_co = integration_api.CardUpdatePinRequestCO() # CardUpdatePinRequestCO | cardPinRequestCO
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
 **card_pin_request_co** | [**CardUpdatePinRequestCO**](CardUpdatePinRequestCO.md)| cardPinRequestCO | 
 **id** | [**str**](.md)| id | 

### Return type

[**BaseResponseVO**](BaseResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_card_spending_control_using_put**
> CardSpendingControlResponseVO update_card_spending_control_using_put(nucleus_spending_control_id)

Update a card spending control

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
nucleus_spending_control_id = 'nucleus_spending_control_id_example' # str | nucleus_spending_control_id

try:
    # Update a card spending control
    api_response = api_instance.update_card_spending_control_using_put(nucleus_spending_control_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_card_spending_control_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleus_spending_control_id** | [**str**](.md)| nucleus_spending_control_id | 

### Return type

[**CardSpendingControlResponseVO**](CardSpendingControlResponseVO.md)

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

# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");


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

# **update_client_card_using_put**
> UpdateCardClientResponseVO update_client_card_using_put(id)

Update a card client

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
id = 'id_example' # str | id

try:
    # Update a card client
    api_response = api_instance.update_client_card_using_put(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->update_client_card_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

[**UpdateCardClientResponseVO**](UpdateCardClientResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_card_pin_using_post**
> BaseResponseVO verify_card_pin_using_post(card_pin_request_co)

verify card pin

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
api_instance = integration_api.CardApi(integration_api.ApiClient(configuration))
card_pin_request_co = integration_api.CardPinRequestCO() # CardPinRequestCO | cardPinRequestCO

try:
    # verify card pin
    api_response = api_instance.verify_card_pin_using_post(card_pin_request_co)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardApi->verify_card_pin_using_post: %s\n" % e)
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

