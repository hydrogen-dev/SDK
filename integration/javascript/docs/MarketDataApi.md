# HydrogenIntegrationApi.MarketDataApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMarketDataHistoricalUsingPost**](MarketDataApi.md#createMarketDataHistoricalUsingPost) | **POST** /market_data/historical | Create historical market data
[**createMarketDataQuoteUsingPost**](MarketDataApi.md#createMarketDataQuoteUsingPost) | **POST** /market_data/quote | Create quote market data


<a name="createMarketDataHistoricalUsingPost"></a>
# **createMarketDataHistoricalUsingPost**
> MdHistoryResponseVO createMarketDataHistoricalUsingPost(historyRequest)

Create historical market data

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.MarketDataApi();

var historyRequest = new HydrogenIntegrationApi.MdHistoryRequestCO(); // MdHistoryRequestCO | historyRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createMarketDataHistoricalUsingPost(historyRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **historyRequest** | [**MdHistoryRequestCO**](MdHistoryRequestCO.md)| historyRequest | 

### Return type

[**MdHistoryResponseVO**](MdHistoryResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMarketDataQuoteUsingPost"></a>
# **createMarketDataQuoteUsingPost**
> MdQuoteResponseVO createMarketDataQuoteUsingPost(quoteRequest)

Create quote market data

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.MarketDataApi();

var quoteRequest = new HydrogenIntegrationApi.MdQuoteRequestCO(); // MdQuoteRequestCO | quoteRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createMarketDataQuoteUsingPost(quoteRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quoteRequest** | [**MdQuoteRequestCO**](MdQuoteRequestCO.md)| quoteRequest | 

### Return type

[**MdQuoteResponseVO**](MdQuoteResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

