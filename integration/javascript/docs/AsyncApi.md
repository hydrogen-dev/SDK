# HydrogenIntegrationApi.AsyncApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsyncData**](AsyncApi.md#getAsyncData) | **GET** /async/{integration_type}/{service} | Create async transaction for GET endpoints for bulk data
[**getAsyncData1**](AsyncApi.md#getAsyncData1) | **GET** /async/{integration_type}/{service}/{id} | Create async transaction for GET endpoints for bulk data
[**getAsyncData2**](AsyncApi.md#getAsyncData2) | **POST** /async/{integration_type}/{service} | Create async transaction for POST endpoints for bulk data
[**getAsyncStatus**](AsyncApi.md#getAsyncStatus) | **GET** /async/status/{id} | Get Status of async transaction created through GET/POST endpoints


<a name="getAsyncData"></a>
# **getAsyncData**
> AsyncTransaction getAsyncData(id, integrationType, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AsyncApi();

var id = "id_example"; // String | UUID id

var integrationType = "integrationType_example"; // String | String integration_type

var service = "service_example"; // String | String service


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAsyncData(id, integrationType, service, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID id | 
 **integrationType** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsyncData1"></a>
# **getAsyncData1**
> AsyncTransaction getAsyncData1(id, integrationType, service)

Create async transaction for GET endpoints for bulk data

Create async transaction for GET endpoints for bulk data

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AsyncApi();

var id = "id_example"; // String | UUID id

var integrationType = "integrationType_example"; // String | String integration_type

var service = "service_example"; // String | String service


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAsyncData1(id, integrationType, service, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID id | 
 **integrationType** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAsyncData2"></a>
# **getAsyncData2**
> AsyncTransaction getAsyncData2(data, integrationType, service)

Create async transaction for POST endpoints for bulk data

Create async transaction for POST endpoints for bulk data

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AsyncApi();

var data = new HydrogenIntegrationApi.JsonNode(); // JsonNode | data

var integrationType = "integrationType_example"; // String | String integration_type

var service = "service_example"; // String | String service


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAsyncData2(data, integrationType, service, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **integrationType** | **String**| String integration_type | 
 **service** | **String**| String service | 

### Return type

[**AsyncTransaction**](AsyncTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAsyncStatus"></a>
# **getAsyncStatus**
> AsyncTransactionVO getAsyncStatus(id)

Get Status of async transaction created through GET/POST endpoints

Get Status of async transaction created through GET/POST endpoints

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AsyncApi();

var id = "id_example"; // String | UUID Async Transaction Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAsyncStatus(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)| UUID Async Transaction Id | 

### Return type

[**AsyncTransactionVO**](AsyncTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

