# integration_api.MarketDataApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_market_data_historical_using_post**](MarketDataApi.md#create_market_data_historical_using_post) | **POST** /market_data/historical | Create historical market data
[**create_market_data_quote_using_post**](MarketDataApi.md#create_market_data_quote_using_post) | **POST** /market_data/quote | Create quote market data


# **create_market_data_historical_using_post**
> MdHistoryResponseVO create_market_data_historical_using_post(history_request)

Create historical market data

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
api_instance = integration_api.MarketDataApi(integration_api.ApiClient(configuration))
history_request = integration_api.MdHistoryRequestCO() # MdHistoryRequestCO | historyRequest

try:
    # Create historical market data
    api_response = api_instance.create_market_data_historical_using_post(history_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketDataApi->create_market_data_historical_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **history_request** | [**MdHistoryRequestCO**](MdHistoryRequestCO.md)| historyRequest | 

### Return type

[**MdHistoryResponseVO**](MdHistoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_market_data_quote_using_post**
> MdQuoteResponseVO create_market_data_quote_using_post(quote_request)

Create quote market data

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
api_instance = integration_api.MarketDataApi(integration_api.ApiClient(configuration))
quote_request = integration_api.MdQuoteRequestCO() # MdQuoteRequestCO | quoteRequest

try:
    # Create quote market data
    api_response = api_instance.create_market_data_quote_using_post(quote_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MarketDataApi->create_market_data_quote_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quote_request** | [**MdQuoteRequestCO**](MdQuoteRequestCO.md)| quoteRequest | 

### Return type

[**MdQuoteResponseVO**](MdQuoteResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

