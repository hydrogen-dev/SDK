# HydrogenNucleusApi.OverflowApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOverflowSettingsUsingPost**](OverflowApi.md#createOverflowSettingsUsingPost) | **POST** /overflow_setting | Create a Overflow Settings request
[**createOverflowUsingPost**](OverflowApi.md#createOverflowUsingPost) | **POST** /overflow | Create a Overflow request
[**deleteOverflowSettingsUsingDelete**](OverflowApi.md#deleteOverflowSettingsUsingDelete) | **DELETE** /overflow_setting/{overflow_settings_id} | Delete a overflow settings
[**getOverflowAllUsingGet**](OverflowApi.md#getOverflowAllUsingGet) | **GET** /overflow | List all overflow objects
[**getOverflowSettingsAllUsingGet**](OverflowApi.md#getOverflowSettingsAllUsingGet) | **GET** /overflow_setting | List all overflow settings
[**getOverflowSettingsUsingGet**](OverflowApi.md#getOverflowSettingsUsingGet) | **GET** /overflow_setting/{overflow_settings_id} | Retrieve a Overflow Setting
[**getOverflowUsingGet**](OverflowApi.md#getOverflowUsingGet) | **GET** /overflow/{overflow_id} | Retrieve a Overflow object
[**updateOverflowSettingsUsingPut**](OverflowApi.md#updateOverflowSettingsUsingPut) | **PUT** /overflow_setting/{overflow_settings_id} | Update a overflow settings


<a name="createOverflowSettingsUsingPost"></a>
# **createOverflowSettingsUsingPost**
> OverflowSettings createOverflowSettingsUsingPost(overflowSettings)

Create a Overflow Settings request

Create a new Overflow Settings request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowSettings = new HydrogenNucleusApi.OverflowSettings(); // OverflowSettings | overflowSettings


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOverflowSettingsUsingPost(overflowSettings, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettings** | [**OverflowSettings**](OverflowSettings.md)| overflowSettings | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOverflowUsingPost"></a>
# **createOverflowUsingPost**
> Overflow createOverflowUsingPost(overflowVO)

Create a Overflow request

Create a new Overflow request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowVO = new HydrogenNucleusApi.Overflow(); // Overflow | overflowVO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOverflowUsingPost(overflowVO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowVO** | [**Overflow**](Overflow.md)| overflowVO | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteOverflowSettingsUsingDelete"></a>
# **deleteOverflowSettingsUsingDelete**
> deleteOverflowSettingsUsingDelete(overflowSettingsId)

Delete a overflow settings

Permanently delete a  overflow settings registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowSettingsId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID overflow_settings_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteOverflowSettingsUsingDelete(overflowSettingsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettingsId** | **String**| UUID overflow_settings_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowAllUsingGet"></a>
# **getOverflowAllUsingGet**
> PageOverflow getOverflowAllUsingGet(opts)

List all overflow objects

Get details for all overflow.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

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
apiInstance.getOverflowAllUsingGet(opts, callback);
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

[**PageOverflow**](PageOverflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowSettingsAllUsingGet"></a>
# **getOverflowSettingsAllUsingGet**
> PageOverflowSettings getOverflowSettingsAllUsingGet(opts)

List all overflow settings

Get details for all overflow setting.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

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
apiInstance.getOverflowSettingsAllUsingGet(opts, callback);
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

[**PageOverflowSettings**](PageOverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowSettingsUsingGet"></a>
# **getOverflowSettingsUsingGet**
> OverflowSettings getOverflowSettingsUsingGet(overflowSettingsId)

Retrieve a Overflow Setting

Retrieve the information for a Overflow Settings.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowSettingsId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID overflow_settings_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOverflowSettingsUsingGet(overflowSettingsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettingsId** | **String**| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOverflowUsingGet"></a>
# **getOverflowUsingGet**
> Overflow getOverflowUsingGet(overflowId)

Retrieve a Overflow object

Retrieve the information for a Overflow.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID overflow_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOverflowUsingGet(overflowId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowId** | **String**| UUID overflow_id | 

### Return type

[**Overflow**](Overflow.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateOverflowSettingsUsingPut"></a>
# **updateOverflowSettingsUsingPut**
> OverflowSettings updateOverflowSettingsUsingPut(overflowSettings, overflowSettingsId)

Update a overflow settings

Update the information for a overflow setting registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.OverflowApi();

var overflowSettings = new HydrogenNucleusApi.OverflowSettings(); // OverflowSettings | overflow_settings

var overflowSettingsId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID overflow_settings_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOverflowSettingsUsingPut(overflowSettings, overflowSettingsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **overflowSettings** | [**OverflowSettings**](OverflowSettings.md)| overflow_settings | 
 **overflowSettingsId** | **String**| UUID overflow_settings_id | 

### Return type

[**OverflowSettings**](OverflowSettings.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

