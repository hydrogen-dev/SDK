# HydrogenNucleusApi.BudgetApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBudgetUsingPost**](BudgetApi.md#createBudgetUsingPost) | **POST** /budget | Create a budget request
[**deleteBudgetUsingDelete**](BudgetApi.md#deleteBudgetUsingDelete) | **DELETE** /budget/{budget_id} | Delete a budget request
[**getBudgetAllUsingGet**](BudgetApi.md#getBudgetAllUsingGet) | **GET** /budget | List all budget requests
[**getBudgetUsingGet**](BudgetApi.md#getBudgetUsingGet) | **GET** /budget/{budget_id} | Retrieve a budget request
[**updateBudgetUsingPut**](BudgetApi.md#updateBudgetUsingPut) | **PUT** /budget/{budget_id} | Update a budget request


<a name="createBudgetUsingPost"></a>
# **createBudgetUsingPost**
> Budget createBudgetUsingPost(budgetRequest)

Create a budget request

Create a new budget request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BudgetApi();

var budgetRequest = new HydrogenNucleusApi.Budget(); // Budget | budgetRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBudgetUsingPost(budgetRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetRequest** | [**Budget**](Budget.md)| budgetRequest | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBudgetUsingDelete"></a>
# **deleteBudgetUsingDelete**
> deleteBudgetUsingDelete(budgetId)

Delete a budget request

Permanently delete a budget request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BudgetApi();

var budgetId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID budget_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBudgetUsingDelete(budgetId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | **String**| UUID budget_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBudgetAllUsingGet"></a>
# **getBudgetAllUsingGet**
> PageBudget getBudgetAllUsingGet(opts)

List all budget requests

Get the information for all budget requests.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BudgetApi();

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
apiInstance.getBudgetAllUsingGet(opts, callback);
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

[**PageBudget**](PageBudget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBudgetUsingGet"></a>
# **getBudgetUsingGet**
> Budget getBudgetUsingGet(budgetId)

Retrieve a budget request

Retrieve the information for a budget request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BudgetApi();

var budgetId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID budget_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBudgetUsingGet(budgetId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | **String**| UUID budget_id | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBudgetUsingPut"></a>
# **updateBudgetUsingPut**
> Budget updateBudgetUsingPut(budget, budgetId)

Update a budget request

Update the information for a budget request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BudgetApi();

var budget = new HydrogenNucleusApi.Budget(); // Budget | budget

var budgetId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID budget_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBudgetUsingPut(budget, budgetId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budget** | [**Budget**](Budget.md)| budget | 
 **budgetId** | **String**| UUID budget_id | 

### Return type

[**Budget**](Budget.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

