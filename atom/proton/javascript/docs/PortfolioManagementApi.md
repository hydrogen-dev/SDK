# HydrogenProtonApi.PortfolioManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rebalancingSignal**](PortfolioManagementApi.md#rebalancingSignal) | **POST** /rebalancing_signal | Rebalancing Signal


<a name="rebalancingSignal"></a>
# **rebalancingSignal**
> {'String': Object} rebalancingSignal(rebalancingSignalRequest)

Rebalancing Signal

Generate rebalancing signals for a group of investments

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.PortfolioManagementApi();

var rebalancingSignalRequest = new HydrogenProtonApi.RebalancingSignalRequest(); // RebalancingSignalRequest | Request payload for Rebalancing Signal


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.rebalancingSignal(rebalancingSignalRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rebalancingSignalRequest** | [**RebalancingSignalRequest**](RebalancingSignalRequest.md)| Request payload for Rebalancing Signal | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

