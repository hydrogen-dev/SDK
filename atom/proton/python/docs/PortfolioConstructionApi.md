# swagger_client.PortfolioConstructionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mvo**](PortfolioConstructionApi.md#mvo) | **POST** /mvo | MVO


# **mvo**
> dict(str, object) mvo(mvo_request)

MVO

Run a mean-variance optimization for a group of potential investments

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
api_instance = proton_api.PortfolioConstructionApi(proton_api.ApiClient(configuration))
mvo_request = proton_api.MvoRequest() # MvoRequest | Request payload for MVO

try:
    # MVO
    api_response = api_instance.mvo(mvo_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioConstructionApi->mvo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mvo_request** | [**MvoRequest**](MvoRequest.md)| Request payload for MVO | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

