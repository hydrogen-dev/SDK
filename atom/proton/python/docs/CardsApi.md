# proton_api.CardsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**card_limit_check**](CardsApi.md#card_limit_check) | **POST** /card_limit_check | Card Limit Check
[**card_transaction_authorization**](CardsApi.md#card_transaction_authorization) | **POST** /card_authorization | Card Transaction Authorization


# **card_limit_check**
> dict(str, object) card_limit_check(card_limit_check_request)

Card Limit Check

Evaluate card transaction history against spending controls

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.CardsApi(proton_api.ApiClient(configuration))
card_limit_check_request = proton_api.CardLimitCheckRequest() # CardLimitCheckRequest | Request payload for Card Limit Check

try:
    # Card Limit Check
    api_response = api_instance.card_limit_check(card_limit_check_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardsApi->card_limit_check: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_limit_check_request** | [**CardLimitCheckRequest**](CardLimitCheckRequest.md)| Request payload for Card Limit Check | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **card_transaction_authorization**
> dict(str, object) card_transaction_authorization(card_transaction_authorization_request)

Card Transaction Authorization

Approve or reject a card transaction based on applicable conditions

### Example
```python
from __future__ import print_function
import time
import proton_api
from proton_api.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: oauth2
configuration = proton_api.Configuration()

# create an instance of the API class
api_instance = proton_api.AuthApi(proton_api.ApiClient(configuration))

#api_token_response = api_instance.create_using_post_client_credentials("client_id", "password")

# OR

#api_token_response = api_instance.create_using_post_password_credentials("client_id","password", "username", "secret" )
# OR

# api_token_response = api_instance.create_client_token_credentials("client_id", "password", "client_token");

configuration.access_token = api_token_response.access_token

# create an instance of the API class
api_instance = proton_api.CardsApi(proton_api.ApiClient(configuration))
card_transaction_authorization_request = proton_api.CardTransactionAuthorizationRequest() # CardTransactionAuthorizationRequest | Request payload for Card Transaction Authorization

try:
    # Card Transaction Authorization
    api_response = api_instance.card_transaction_authorization(card_transaction_authorization_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CardsApi->card_transaction_authorization: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card_transaction_authorization_request** | [**CardTransactionAuthorizationRequest**](CardTransactionAuthorizationRequest.md)| Request payload for Card Transaction Authorization | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

