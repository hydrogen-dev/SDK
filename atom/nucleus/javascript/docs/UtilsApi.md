# HydrogenNucleusApi.UtilsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReasonCodeUsingPost**](UtilsApi.md#createReasonCodeUsingPost) | **POST** /reason_code | Create a reason code
[**createStageUsingPost**](UtilsApi.md#createStageUsingPost) | **POST** /stage | Create an account stage
[**createTransactionCodeUsingPost**](UtilsApi.md#createTransactionCodeUsingPost) | **POST** /transaction_code | Create a transaction code
[**deleteReasonCodeUsingDelete**](UtilsApi.md#deleteReasonCodeUsingDelete) | **DELETE** /reason_code/{reason_code_id} | Delete a reason code
[**deleteStageUsingDelete**](UtilsApi.md#deleteStageUsingDelete) | **DELETE** /stage/{stage_id} | Delete an account stage
[**deleteTransactionCodeUsingDelete**](UtilsApi.md#deleteTransactionCodeUsingDelete) | **DELETE** /transaction_code/{transaction_code_id} | Delete a transaction code
[**getReasonCodeAllUsingGet**](UtilsApi.md#getReasonCodeAllUsingGet) | **GET** /reason_code | List all reason codes
[**getReasonCodeUsingGet**](UtilsApi.md#getReasonCodeUsingGet) | **GET** /reason_code/{reason_code_id} | Retrieve a reason code
[**getStageAllUsingGet**](UtilsApi.md#getStageAllUsingGet) | **GET** /stage | List all account stages
[**getStageUsingGet**](UtilsApi.md#getStageUsingGet) | **GET** /stage/{stage_id} | Retrieve an account stage
[**getTransactionCodeAllUsingGet**](UtilsApi.md#getTransactionCodeAllUsingGet) | **GET** /transaction_code | List all transaction codes
[**getTransactionCodeUsingGet**](UtilsApi.md#getTransactionCodeUsingGet) | **GET** /transaction_code/{transaction_code_id} | Retrieve a transaction code
[**updateReasonCodeUsingPut**](UtilsApi.md#updateReasonCodeUsingPut) | **PUT** /reason_code/{reason_code_id} | Update a reason code
[**updateStageUsingPut**](UtilsApi.md#updateStageUsingPut) | **PUT** /stage/{stage_id} | Update an account stage
[**updateTransactionCodeUsingPut**](UtilsApi.md#updateTransactionCodeUsingPut) | **PUT** /transaction_code/{transaction_code_id} | Update a transaction code


<a name="createReasonCodeUsingPost"></a>
# **createReasonCodeUsingPost**
> ReasonCode createReasonCodeUsingPost(reasonCodeRequest)

Create a reason code

Create a new reason code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var reasonCodeRequest = new HydrogenNucleusApi.ReasonCode(); // ReasonCode | reasonCodeRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createReasonCodeUsingPost(reasonCodeRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeRequest** | [**ReasonCode**](ReasonCode.md)| reasonCodeRequest | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createStageUsingPost"></a>
# **createStageUsingPost**
> Stage createStageUsingPost(stageRequest)

Create an account stage

Create a new account stage

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var stageRequest = new HydrogenNucleusApi.Stage(); // Stage | stageRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createStageUsingPost(stageRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageRequest** | [**Stage**](Stage.md)| stageRequest | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createTransactionCodeUsingPost"></a>
# **createTransactionCodeUsingPost**
> TransactionCode createTransactionCodeUsingPost(transactionRequest)

Create a transaction code

Create a new transaction code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var transactionRequest = new HydrogenNucleusApi.TransactionCode(); // TransactionCode | transactionRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createTransactionCodeUsingPost(transactionRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionRequest** | [**TransactionCode**](TransactionCode.md)| transactionRequest | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteReasonCodeUsingDelete"></a>
# **deleteReasonCodeUsingDelete**
> deleteReasonCodeUsingDelete(reasonCodeId)

Delete a reason code

Permanently delete a reason code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var reasonCodeId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID reason_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteReasonCodeUsingDelete(reasonCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeId** | [**String**](.md)| UUID reason_code_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteStageUsingDelete"></a>
# **deleteStageUsingDelete**
> deleteStageUsingDelete(stageId)

Delete an account stage

Permanently delete an account stage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var stageId = "stageId_example"; // String | UUID stage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteStageUsingDelete(stageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**String**](.md)| UUID stage_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTransactionCodeUsingDelete"></a>
# **deleteTransactionCodeUsingDelete**
> deleteTransactionCodeUsingDelete(transactionCodeId)

Delete a transaction code

Permanently delete a transaction code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var transactionCodeId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID transaction_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteTransactionCodeUsingDelete(transactionCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**String**](.md)| UUID transaction_code_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReasonCodeAllUsingGet"></a>
# **getReasonCodeAllUsingGet**
> PageReasonCode getReasonCodeAllUsingGet(opts)

List all reason codes

Get the information for all reason codes defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

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
apiInstance.getReasonCodeAllUsingGet(opts, callback);
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

[**PageReasonCode**](PageReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getReasonCodeUsingGet"></a>
# **getReasonCodeUsingGet**
> ReasonCode getReasonCodeUsingGet(reasonCodeId)

Retrieve a reason code

Retrieve the information for a reason code defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var reasonCodeId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID reason_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getReasonCodeUsingGet(reasonCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCodeId** | [**String**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStageAllUsingGet"></a>
# **getStageAllUsingGet**
> PageStage getStageAllUsingGet(opts)

List all account stages

Get the information for all possible account stages.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

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
apiInstance.getStageAllUsingGet(opts, callback);
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

[**PageStage**](PageStage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getStageUsingGet"></a>
# **getStageUsingGet**
> Stage getStageUsingGet(stageId)

Retrieve an account stage

Retrieve the information for a specific account stage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var stageId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID stage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getStageUsingGet(stageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stageId** | [**String**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionCodeAllUsingGet"></a>
# **getTransactionCodeAllUsingGet**
> PageTransactionCode getTransactionCodeAllUsingGet(opts)

List all transaction codes

Get the information for all transaction codes defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

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
apiInstance.getTransactionCodeAllUsingGet(opts, callback);
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

[**PageTransactionCode**](PageTransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionCodeUsingGet"></a>
# **getTransactionCodeUsingGet**
> TransactionCode getTransactionCodeUsingGet(transactionCodeId)

Retrieve a transaction code

Retrieve the information for a transaction code defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var transactionCodeId = "\"62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d\""; // String | UUID transaction_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionCodeUsingGet(transactionCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCodeId** | [**String**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateReasonCodeUsingPut"></a>
# **updateReasonCodeUsingPut**
> ReasonCode updateReasonCodeUsingPut(reasonCode, reasonCodeId)

Update a reason code

Update a reason code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var reasonCode = null; // Object | reason_code

var reasonCodeId = "\"bab849d6-de96-4dc7-a5ea-19be45c52a4e\""; // String | UUID reason_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateReasonCodeUsingPut(reasonCode, reasonCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reasonCode** | **Object**| reason_code | 
 **reasonCodeId** | [**String**](.md)| UUID reason_code_id | 

### Return type

[**ReasonCode**](ReasonCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateStageUsingPut"></a>
# **updateStageUsingPut**
> Stage updateStageUsingPut(stage, stageId)

Update an account stage

Update the information for an account stage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var stage = null; // Object | stage

var stageId = "\"bab849d6-de96-4dc7-a5ea-19be45c52a4e\""; // String | UUID stage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateStageUsingPut(stage, stageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stage** | **Object**| stage | 
 **stageId** | [**String**](.md)| UUID stage_id | 

### Return type

[**Stage**](Stage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateTransactionCodeUsingPut"></a>
# **updateTransactionCodeUsingPut**
> TransactionCode updateTransactionCodeUsingPut(transactionCode, transactionCodeId)

Update a transaction code

Update a transaction code for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.UtilsApi();

var transactionCode = null; // Object | transaction_code

var transactionCodeId = "\"bab849d6-de96-4dc7-a5ea-19be45c52a4e\""; // String | UUID transaction_code_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateTransactionCodeUsingPut(transactionCode, transactionCodeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionCode** | **Object**| transaction_code | 
 **transactionCodeId** | [**String**](.md)| UUID transaction_code_id | 

### Return type

[**TransactionCode**](TransactionCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

