# HydrogenProtonApi.GoalsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**goalAccumulationAllocation**](GoalsApi.md#goalAccumulationAllocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
[**goalAccumulationRecommendation**](GoalsApi.md#goalAccumulationRecommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
[**goalAccumulationStatus**](GoalsApi.md#goalAccumulationStatus) | **POST** /goal_accumulation/status | Goal Accumulation Status
[**goalDecumulationAllocation**](GoalsApi.md#goalDecumulationAllocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
[**goalDecumulationRecommendation**](GoalsApi.md#goalDecumulationRecommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
[**goalDecumulationStatus**](GoalsApi.md#goalDecumulationStatus) | **POST** /goal_decumulation/status | Goal Decumulation Status


<a name="goalAccumulationAllocation"></a>
# **goalAccumulationAllocation**
> {'String': Object} goalAccumulationAllocation(goalAccumulationAllocationRequest)

Goal Accumulation Allocation

Allocate based on an accumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalAccumulationAllocationRequest = new HydrogenProtonApi.GoalAccumulationAllocationRequest(); // GoalAccumulationAllocationRequest | Request payload for Goal Accumulation Allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationAllocation(goalAccumulationAllocationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationAllocationRequest** | [**GoalAccumulationAllocationRequest**](GoalAccumulationAllocationRequest.md)| Request payload for Goal Accumulation Allocation | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationRecommendation"></a>
# **goalAccumulationRecommendation**
> {'String': Object} goalAccumulationRecommendation(goalAccumulationRecommendationRequest)

Goal Accumulation Recommendation

Generate recommendations to achieve an accumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalAccumulationRecommendationRequest = new HydrogenProtonApi.GoalAccumulationRecommendationRequest(); // GoalAccumulationRecommendationRequest | Request payload for Goal Accumulation Recommendation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationRecommendation(goalAccumulationRecommendationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationRecommendationRequest** | [**GoalAccumulationRecommendationRequest**](GoalAccumulationRecommendationRequest.md)| Request payload for Goal Accumulation Recommendation | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationStatus"></a>
# **goalAccumulationStatus**
> {'String': Object} goalAccumulationStatus(goalAccumulationStatusRequest)

Goal Accumulation Status

Track the status of an accumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalAccumulationStatusRequest = new HydrogenProtonApi.GoalAccumulationStatusRequest(); // GoalAccumulationStatusRequest | Request payload for Goal Accumulation Status


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalAccumulationStatus(goalAccumulationStatusRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalAccumulationStatusRequest** | [**GoalAccumulationStatusRequest**](GoalAccumulationStatusRequest.md)| Request payload for Goal Accumulation Status | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationAllocation"></a>
# **goalDecumulationAllocation**
> {'String': Object} goalDecumulationAllocation(goalDecumulationAllocationRequest)

Goal Decumulation Allocation

Allocate based on a decumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalDecumulationAllocationRequest = new HydrogenProtonApi.GoalDecumulationAllocationRequest(); // GoalDecumulationAllocationRequest | Request payload for Goal Decumulation Allocation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationAllocation(goalDecumulationAllocationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationAllocationRequest** | [**GoalDecumulationAllocationRequest**](GoalDecumulationAllocationRequest.md)| Request payload for Goal Decumulation Allocation | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationRecommendation"></a>
# **goalDecumulationRecommendation**
> {'String': Object} goalDecumulationRecommendation(goalDecumulationRecommendationRequest)

Goal Decumulation Recommendation

Generate recommendations to achieve a decumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalDecumulationRecommendationRequest = new HydrogenProtonApi.GoalDecumulationRecommendationRequest(); // GoalDecumulationRecommendationRequest | Request payload for Goal Decumulation Recommendation


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationRecommendation(goalDecumulationRecommendationRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationRecommendationRequest** | [**GoalDecumulationRecommendationRequest**](GoalDecumulationRecommendationRequest.md)| Request payload for Goal Decumulation Recommendation | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationStatus"></a>
# **goalDecumulationStatus**
> {'String': Object} goalDecumulationStatus(goalDecumulationStatusRequest)

Goal Decumulation Status

Track the status of a decumulation goal

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenProtonApi.GoalsApi();

var goalDecumulationStatusRequest = new HydrogenProtonApi.GoalDecumulationStatusRequest(); // GoalDecumulationStatusRequest | Request payload for Goal Decumulation Status


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.goalDecumulationStatus(goalDecumulationStatusRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **goalDecumulationStatusRequest** | [**GoalDecumulationStatusRequest**](GoalDecumulationStatusRequest.md)| Request payload for Goal Decumulation Status | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

