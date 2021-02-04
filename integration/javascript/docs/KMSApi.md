# HydrogenIntegrationApi.KMSApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKMSUsingPost**](KMSApi.md#createKMSUsingPost) | **POST** /kms | Create an secret key
[**deleteKMSUsingDelete**](KMSApi.md#deleteKMSUsingDelete) | **DELETE** /kms/{kms_id} | Delete an secret key value
[**getKMSAllUsingGet**](KMSApi.md#getKMSAllUsingGet) | **GET** /kms | List all KMS Clients
[**getKMSUsingGet**](KMSApi.md#getKMSUsingGet) | **GET** /kms/{kms_id} | Retrieve an secret key value
[**updateKMSUsingPut**](KMSApi.md#updateKMSUsingPut) | **PUT** /kms/{kms_id} | Update an Key Value


<a name="createKMSUsingPost"></a>
# **createKMSUsingPost**
> KmsConfig createKMSUsingPost(kmsConfig)

Create an secret key

Create an secret key.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KMSApi();

var kmsConfig = new HydrogenIntegrationApi.KmsConfig(); // KmsConfig | kmsConfig


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createKMSUsingPost(kmsConfig, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsConfig** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKMSUsingDelete"></a>
# **deleteKMSUsingDelete**
> deleteKMSUsingDelete(kmsId)

Delete an secret key value

Permanently delete an secret key value under a tenant.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KMSApi();

var kmsId = "kmsId_example"; // String | KMS Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteKMSUsingDelete(kmsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsId** | [**String**](.md)| KMS Id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getKMSAllUsingGet"></a>
# **getKMSAllUsingGet**
> PageKmsConfig getKMSAllUsingGet(opts)

List all KMS Clients

Get details for all clients registered with your business.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KMSApi();

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
apiInstance.getKMSAllUsingGet(opts, callback);
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

[**PageKmsConfig**](PageKmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKMSUsingGet"></a>
# **getKMSUsingGet**
> KmsConfig getKMSUsingGet(kmsId)

Retrieve an secret key value

Retrieve the information for a specific value associated with a Secret key.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KMSApi();

var kmsId = "kmsId_example"; // String | KMS Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getKMSUsingGet(kmsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsId** | [**String**](.md)| KMS Id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKMSUsingPut"></a>
# **updateKMSUsingPut**
> KmsConfig updateKMSUsingPut(kmsConfig, kmsId)

Update an Key Value

Update the information for an key value.

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.KMSApi();

var kmsConfig = new HydrogenIntegrationApi.KmsConfig(); // KmsConfig | kmsConfig

var kmsId = "kmsId_example"; // String | kms_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateKMSUsingPut(kmsConfig, kmsId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kmsConfig** | [**KmsConfig**](KmsConfig.md)| kmsConfig | 
 **kmsId** | [**String**](.md)| kms_id | 

### Return type

[**KmsConfig**](KmsConfig.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

