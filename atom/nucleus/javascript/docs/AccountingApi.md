# HydrogenNucleusApi.AccountingApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountingUsingPost**](AccountingApi.md#createAccountingUsingPost) | **POST** /accounting | Create an accounting
[**deleteAccountingUsingDelete**](AccountingApi.md#deleteAccountingUsingDelete) | **DELETE** /accounting/{accounting_id} | Delete an accounting
[**getAccountingAllUsingGet**](AccountingApi.md#getAccountingAllUsingGet) | **GET** /accounting | List all accounting
[**getAccountingUsingGet**](AccountingApi.md#getAccountingUsingGet) | **GET** /accounting/{accounting_id} | Retrieve an accounting
[**updateAccountingUsingPut**](AccountingApi.md#updateAccountingUsingPut) | **PUT** /accounting/{accounting_id} | Update an accounting


<a name="createAccountingUsingPost"></a>
# **createAccountingUsingPost**
> Accounting createAccountingUsingPost(accounting)

Create an accounting

Store stats pulled from accounting vendors.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountingApi();

var accounting = new HydrogenNucleusApi.Accounting(); // Accounting | accounting


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountingUsingPost(accounting, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAccountingUsingDelete"></a>
# **deleteAccountingUsingDelete**
> deleteAccountingUsingDelete(accountingId)

Delete an accounting

Permanently delete an accounting.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountingApi();

var accountingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID accounting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAccountingUsingDelete(accountingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingId** | **String**| UUID accounting_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingAllUsingGet"></a>
# **getAccountingAllUsingGet**
> PageAccounting getAccountingAllUsingGet(opts)

List all accounting

Get information for all accounting for all clients defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountingApi();

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
apiInstance.getAccountingAllUsingGet(opts, callback);
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

[**PageAccounting**](PageAccounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountingUsingGet"></a>
# **getAccountingUsingGet**
> Accounting getAccountingUsingGet(accountingId)

Retrieve an accounting

Retrieve the information for a specific accounting associated with a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountingApi();

var accountingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID accounting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountingUsingGet(accountingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingId** | **String**| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAccountingUsingPut"></a>
# **updateAccountingUsingPut**
> Accounting updateAccountingUsingPut(accounting, accountingId)

Update an accounting

Update the information for an accounting.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountingApi();

var accounting = new HydrogenNucleusApi.Accounting(); // Accounting | accounting

var accountingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID accounting_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAccountingUsingPut(accounting, accountingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounting** | [**Accounting**](Accounting.md)| accounting | 
 **accountingId** | **String**| UUID accounting_id | 

### Return type

[**Accounting**](Accounting.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

