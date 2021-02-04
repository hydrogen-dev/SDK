# HydrogenNucleusApi.AdminClientApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/admin/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdminClientUsingPost**](AdminClientApi.md#createAdminClientUsingPost) | **POST** /client | Create an admin client
[**deleteAdminClientUsingGet**](AdminClientApi.md#deleteAdminClientUsingGet) | **DELETE** /client/{client_id} | Delete an admin client
[**getAdminClientUsingGet**](AdminClientApi.md#getAdminClientUsingGet) | **GET** /client/{client_id} | Get an admin client
[**getAllAdminClientUsingGet**](AdminClientApi.md#getAllAdminClientUsingGet) | **GET** /client | List all admin clients
[**updateAdminClientUsingPut**](AdminClientApi.md#updateAdminClientUsingPut) | **PUT** /client/{client_id} | Update an admin client


<a name="createAdminClientUsingPost"></a>
# **createAdminClientUsingPost**
> AdminClient createAdminClientUsingPost(client)

Create an admin client

Create an admin client

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_admin_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AdminClientApi();

var client = new HydrogenNucleusApi.AdminClient(); // AdminClient | client


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAdminClientUsingPost(client, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAdminClientUsingGet"></a>
# **deleteAdminClientUsingGet**
> deleteAdminClientUsingGet(clientId)

Delete an admin client

Delete an admin client

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_admin_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AdminClientApi();

var clientId = 789; // Number | client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAdminClientUsingGet(clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Number**| client_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAdminClientUsingGet"></a>
# **getAdminClientUsingGet**
> AdminClient getAdminClientUsingGet(clientId)

Get an admin client

Get an admin client

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_admin_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AdminClientApi();

var clientId = 789; // Number | client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAdminClientUsingGet(clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Number**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllAdminClientUsingGet"></a>
# **getAllAdminClientUsingGet**
> PageAdminClient getAllAdminClientUsingGet(opts)

List all admin clients

Get a list of all admin clients

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_admin_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AdminClientApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "username", // String | order_by
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
apiInstance.getAllAdminClientUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to username]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageAdminClient**](PageAdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAdminClientUsingPut"></a>
# **updateAdminClientUsingPut**
> AdminClient updateAdminClientUsingPut(client, clientId)

Update an admin client

Update an admin client

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_admin_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AdminClientApi();

var client = new HydrogenNucleusApi.AdminClient(); // AdminClient | client

var clientId = 789; // Number | client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAdminClientUsingPut(client, clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client** | [**AdminClient**](AdminClient.md)| client | 
 **clientId** | **Number**| client_id | 

### Return type

[**AdminClient**](AdminClient.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

