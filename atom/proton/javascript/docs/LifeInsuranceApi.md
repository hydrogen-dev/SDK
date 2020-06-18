# HydrogenProtonApi.LifeInsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lifeInsuranceNeedsCalculator**](LifeInsuranceApi.md#lifeInsuranceNeedsCalculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator


<a name="lifeInsuranceNeedsCalculator"></a>
# **lifeInsuranceNeedsCalculator**
> {'String': Object} lifeInsuranceNeedsCalculator(lifeInsuranceNeedsCalculatorRequest)

Life Insurance Needs Calculator

Calculate life insurance needs based on existing asset and liability data

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.LifeInsuranceApi();

var lifeInsuranceNeedsCalculatorRequest = new HydrogenProtonApi.LifeInsuranceNeedsCalculatorRequest(); // LifeInsuranceNeedsCalculatorRequest | Request payload for Life Insurance Needs Calculator


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.lifeInsuranceNeedsCalculator(lifeInsuranceNeedsCalculatorRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifeInsuranceNeedsCalculatorRequest** | [**LifeInsuranceNeedsCalculatorRequest**](LifeInsuranceNeedsCalculatorRequest.md)| Request payload for Life Insurance Needs Calculator | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

