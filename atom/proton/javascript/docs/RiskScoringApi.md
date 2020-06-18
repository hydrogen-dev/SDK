# HydrogenProtonApi.RiskScoringApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dimensionalRiskScore**](RiskScoringApi.md#dimensionalRiskScore) | **POST** /dimensional_risk_score | Dimensional Risk Score
[**riskAllocation**](RiskScoringApi.md#riskAllocation) | **POST** /risk_allocation | Risk Allocation
[**riskScore**](RiskScoringApi.md#riskScore) | **POST** /risk_score | Risk Score


<a name="dimensionalRiskScore"></a>
# **dimensionalRiskScore**
> {'String': Object} dimensionalRiskScore(dimensionalRiskScoreRequest)

Dimensional Risk Score

Calculate a dimensional risk score based on questionnaire responses

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.RiskScoringApi();

var dimensionalRiskScoreRequest = new HydrogenProtonApi.DimensionalRiskScoreRequest(); // DimensionalRiskScoreRequest | Request payload for Dimensional Risk Score


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.dimensionalRiskScore(dimensionalRiskScoreRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dimensionalRiskScoreRequest** | [**DimensionalRiskScoreRequest**](DimensionalRiskScoreRequest.md)| Request payload for Dimensional Risk Score | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskAllocation"></a>
# **riskAllocation**
> {'String': Object} riskAllocation(riskAllocationRequest)

Risk Allocation

Allocate based on a risk score

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.RiskScoringApi();

var riskAllocationRequest = new HydrogenProtonApi.RiskAllocationRequest(); // RiskAllocationRequest | Request payload for Risk Allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.riskAllocation(riskAllocationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskAllocationRequest** | [**RiskAllocationRequest**](RiskAllocationRequest.md)| Request payload for Risk Allocation | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskScore"></a>
# **riskScore**
> {'String': Object} riskScore(riskScoreRequest)

Risk Score

Calculate a risk score based on questionnaire responses

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.RiskScoringApi();

var riskScoreRequest = new HydrogenProtonApi.RiskScoreRequest(); // RiskScoreRequest | Request payload for Risk Score


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.riskScore(riskScoreRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskScoreRequest** | [**RiskScoreRequest**](RiskScoreRequest.md)| Request payload for Risk Score | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

