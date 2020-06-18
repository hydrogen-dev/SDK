# HydrogenNucleusApi.RiskProfileApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRiskProfileUsingPost**](RiskProfileApi.md#createRiskProfileUsingPost) | **POST** /risk_profile | Create a Risk Profile
[**deleteRiskProfileUsingDelete**](RiskProfileApi.md#deleteRiskProfileUsingDelete) | **DELETE** /risk_profile/{risk_profile_id} | Delete a Risk Profile
[**getRiskProfileAllUsingGet**](RiskProfileApi.md#getRiskProfileAllUsingGet) | **GET** /risk_profile | Get All Risk Profile
[**getRiskProfileUsingGet**](RiskProfileApi.md#getRiskProfileUsingGet) | **GET** /risk_profile/{risk_profile_id} | Get a Risk Profile
[**updateRiskProfileUsingPut**](RiskProfileApi.md#updateRiskProfileUsingPut) | **PUT** /risk_profile/{risk_profile_id} | Update a Risk Profile


<a name="createRiskProfileUsingPost"></a>
# **createRiskProfileUsingPost**
> RiskProfile createRiskProfileUsingPost(riskProfile)

Create a Risk Profile

Create a new Risk Profile. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RiskProfileApi();

var riskProfile = new HydrogenNucleusApi.RiskProfile(); // RiskProfile | riskProfile


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createRiskProfileUsingPost(riskProfile, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfile** | [**RiskProfile**](RiskProfile.md)| riskProfile | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteRiskProfileUsingDelete"></a>
# **deleteRiskProfileUsingDelete**
> deleteRiskProfileUsingDelete(riskProfileId)

Delete a Risk Profile

Permanently Delete a Risk Profile.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RiskProfileApi();

var riskProfileId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID risk_profile_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteRiskProfileUsingDelete(riskProfileId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfileId** | **String**| UUID risk_profile_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getRiskProfileAllUsingGet"></a>
# **getRiskProfileAllUsingGet**
> PageRiskProfile getRiskProfileAllUsingGet(opts)

Get All Risk Profile

Get All Risk Profile. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RiskProfileApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRiskProfileAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageRiskProfile**](PageRiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRiskProfileUsingGet"></a>
# **getRiskProfileUsingGet**
> RiskProfile getRiskProfileUsingGet(riskProfileId)

Get a Risk Profile

Get a Risk Profile. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RiskProfileApi();

var riskProfileId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID risk_profile_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getRiskProfileUsingGet(riskProfileId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfileId** | **String**| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRiskProfileUsingPut"></a>
# **updateRiskProfileUsingPut**
> RiskProfile updateRiskProfileUsingPut(riskProfile, riskProfileId)

Update a Risk Profile

Update a Risk Profile. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.RiskProfileApi();

var riskProfile = new HydrogenNucleusApi.RiskProfile(); // RiskProfile | risk_profile

var riskProfileId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID risk_profile_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateRiskProfileUsingPut(riskProfile, riskProfileId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskProfile** | [**RiskProfile**](RiskProfile.md)| risk_profile | 
 **riskProfileId** | **String**| UUID risk_profile_id | 

### Return type

[**RiskProfile**](RiskProfile.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

