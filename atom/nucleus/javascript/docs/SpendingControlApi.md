# HydrogenNucleusApi.SpendingControlApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpendingControlUsingPost**](SpendingControlApi.md#createSpendingControlUsingPost) | **POST** /spending_control | Create a Spending Control
[**deleteSpendingControlUsingDelete**](SpendingControlApi.md#deleteSpendingControlUsingDelete) | **DELETE** /spending_control/{spending_control_id} | Delete a Spending Control
[**getSpendingControlAllUsingGet**](SpendingControlApi.md#getSpendingControlAllUsingGet) | **GET** /spending_control | List all Spending Control
[**getSpendingControlUsingGet**](SpendingControlApi.md#getSpendingControlUsingGet) | **GET** /spending_control/{spending_control_id} | Retrieve a Spending Control
[**updateSpendingControlUsingPut**](SpendingControlApi.md#updateSpendingControlUsingPut) | **PUT** /spending_control/{spending_control_id} | Update a Spending Control


<a name="createSpendingControlUsingPost"></a>
# **createSpendingControlUsingPost**
> SpendingControl createSpendingControlUsingPost(spendingControl)

Create a Spending Control

Create a new Spending Control.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SpendingControlApi();

var spendingControl = new HydrogenNucleusApi.SpendingControl(); // SpendingControl | spendingControl


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSpendingControlUsingPost(spendingControl, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControl** | [**SpendingControl**](SpendingControl.md)| spendingControl | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSpendingControlUsingDelete"></a>
# **deleteSpendingControlUsingDelete**
> deleteSpendingControlUsingDelete(spendingControlId)

Delete a Spending Control

Permanently Delete Spending Control.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SpendingControlApi();

var spendingControlId = "spendingControlId_example"; // String | spending_control_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSpendingControlUsingDelete(spendingControlId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControlId** | [**String**](.md)| spending_control_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSpendingControlAllUsingGet"></a>
# **getSpendingControlAllUsingGet**
> PageSpendingControl getSpendingControlAllUsingGet(opts)

List all Spending Control

List all Spending Control.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SpendingControlApi();

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
apiInstance.getSpendingControlAllUsingGet(opts, callback);
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

[**PageSpendingControl**](PageSpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpendingControlUsingGet"></a>
# **getSpendingControlUsingGet**
> SpendingControl getSpendingControlUsingGet(spendingControlId)

Retrieve a Spending Control

Retrieve a Spending Control. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SpendingControlApi();

var spendingControlId = "spendingControlId_example"; // String | spending_control_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSpendingControlUsingGet(spendingControlId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControlId** | [**String**](.md)| spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSpendingControlUsingPut"></a>
# **updateSpendingControlUsingPut**
> SpendingControl updateSpendingControlUsingPut(spendingControl, spendingControlId)

Update a Spending Control

Update a Spending Control. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SpendingControlApi();

var spendingControl = null; // Object | spending_control

var spendingControlId = "\"bab849d6-de96-4dc7-a5ea-19be45c52a4e\""; // String | UUID spending_control_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSpendingControlUsingPut(spendingControl, spendingControlId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spendingControl** | **Object**| spending_control | 
 **spendingControlId** | [**String**](.md)| UUID spending_control_id | 

### Return type

[**SpendingControl**](SpendingControl.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

