# proton_api.PortfolioManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rebalancing_signal**](PortfolioManagementApi.md#rebalancing_signal) | **POST** /rebalancing_signal | Rebalancing Signal


# **rebalancing_signal**
> dict(str, object) rebalancing_signal(rebalancing_signal_request)

Rebalancing Signal

Generate rebalancing signals for a group of investments

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
api_instance = proton_api.PortfolioManagementApi(proton_api.ApiClient(configuration))
rebalancing_signal_request = proton_api.RebalancingSignalRequest() # RebalancingSignalRequest | Request payload for Rebalancing Signal

try:
    # Rebalancing Signal
    api_response = api_instance.rebalancing_signal(rebalancing_signal_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PortfolioManagementApi->rebalancing_signal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rebalancing_signal_request** | [**RebalancingSignalRequest**](RebalancingSignalRequest.md)| Request payload for Rebalancing Signal | 

### Return type

**dict(str, object)**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

