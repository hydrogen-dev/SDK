# HydrogenNucleusApi.ApplicationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationUsingPost**](ApplicationApi.md#createApplicationUsingPost) | **POST** /application | Create an application
[**deleteApplicationUsingDelete**](ApplicationApi.md#deleteApplicationUsingDelete) | **DELETE** /application/{application_id} | Delete an Application
[**getApplicationAllUsingGet**](ApplicationApi.md#getApplicationAllUsingGet) | **GET** /application | List all Application
[**getApplicationUsingGet**](ApplicationApi.md#getApplicationUsingGet) | **GET** /application/{application_id} | Retrieve an Application
[**updateApplicationUsingPut**](ApplicationApi.md#updateApplicationUsingPut) | **PUT** /application/{application_id} | Update an Application


<a name="createApplicationUsingPost"></a>
# **createApplicationUsingPost**
> Application createApplicationUsingPost(application)

Create an application

Create an application

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ApplicationApi();

var application = new HydrogenNucleusApi.Application(); // Application | application


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createApplicationUsingPost(application, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteApplicationUsingDelete"></a>
# **deleteApplicationUsingDelete**
> deleteApplicationUsingDelete(applicationId)

Delete an Application

Permanently delete an Application.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ApplicationApi();

var applicationId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID application_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteApplicationUsingDelete(applicationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| UUID application_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationAllUsingGet"></a>
# **getApplicationAllUsingGet**
> PageApplication getApplicationAllUsingGet(opts)

List all Application

Get details for all Application.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ApplicationApi();

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
apiInstance.getApplicationAllUsingGet(opts, callback);
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

[**PageApplication**](PageApplication.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getApplicationUsingGet"></a>
# **getApplicationUsingGet**
> Application getApplicationUsingGet(applicationId)

Retrieve an Application

Retrieve the information for an Application.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ApplicationApi();

var applicationId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID application_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getApplicationUsingGet(applicationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateApplicationUsingPut"></a>
# **updateApplicationUsingPut**
> Application updateApplicationUsingPut(application, applicationId)

Update an Application

Update the information for an Application

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ApplicationApi();

var application = new HydrogenNucleusApi.Application(); // Application | application

var applicationId = "29fa5156-cd89-4056-9125-ce2428b05f11"; // String | UUID application_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateApplicationUsingPut(application, applicationId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)| application | 
 **applicationId** | **String**| UUID application_id | 

### Return type

[**Application**](Application.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

