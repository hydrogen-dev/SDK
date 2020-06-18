# HydrogenNucleusApi.ModelApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModelAssetSizeUsingPost**](ModelApi.md#createModelAssetSizeUsingPost) | **POST** /model_asset_size | Create a model asset size
[**createModelChangeUsingPost**](ModelApi.md#createModelChangeUsingPost) | **POST** /model/{model_id}/model_change | Change a model composition
[**createModelCommentUsingPost**](ModelApi.md#createModelCommentUsingPost) | **POST** /model_comment | Create a model commentary
[**createModelHoldingUsingPost**](ModelApi.md#createModelHoldingUsingPost) | **POST** /model_holding | Create a model holding
[**createModelTransactionUsingPost**](ModelApi.md#createModelTransactionUsingPost) | **POST** /model_transaction | Create a model transaction
[**createModelUsingPost**](ModelApi.md#createModelUsingPost) | **POST** /model | Create a model
[**deleteModelAssetSizeUsingDelete**](ModelApi.md#deleteModelAssetSizeUsingDelete) | **DELETE** /model_asset_size/{model_asset_size_id} | Delete a model asset size
[**deleteModelCommentUsingDelete**](ModelApi.md#deleteModelCommentUsingDelete) | **DELETE** /model_comment/{model_comment_id} | Delete a model commentary
[**deleteModelHoldingUsingDelete**](ModelApi.md#deleteModelHoldingUsingDelete) | **DELETE** /model_holding/{model_holding_id} | Delete a model holding
[**deleteModelTransactionUsingDelete**](ModelApi.md#deleteModelTransactionUsingDelete) | **DELETE** /model_transaction/{model_transaction_id} | Delete a model transaction
[**deleteModelUsingDelete**](ModelApi.md#deleteModelUsingDelete) | **DELETE** /model/{model_id} | Delete a model
[**getModelAllUsingGet**](ModelApi.md#getModelAllUsingGet) | **GET** /model | List all models
[**getModelAssetSizeAllUsingGet**](ModelApi.md#getModelAssetSizeAllUsingGet) | **GET** /model_asset_size | List all model asset sizes
[**getModelAssetSizeUsingGet**](ModelApi.md#getModelAssetSizeUsingGet) | **GET** /model_asset_size/{model_asset_size_id} | Retrieve a model asset size
[**getModelCommentAllUsingGet**](ModelApi.md#getModelCommentAllUsingGet) | **GET** /model_comment | List all model commentary
[**getModelCommentUsingGet**](ModelApi.md#getModelCommentUsingGet) | **GET** /model_comment/{model_comment_id} | Retrieve a model commentary
[**getModelHoldingAllUsingGet**](ModelApi.md#getModelHoldingAllUsingGet) | **GET** /model_holding | List all model holdings
[**getModelHoldingUsingGet**](ModelApi.md#getModelHoldingUsingGet) | **GET** /model_holding/{model_holding_id} | Retrieve a model holding
[**getModelTransactionAllUsingGet**](ModelApi.md#getModelTransactionAllUsingGet) | **GET** /model_transaction | List all model transactions
[**getModelTransactionUsingGet**](ModelApi.md#getModelTransactionUsingGet) | **GET** /model_transaction/{model_transaction_id} | Retrieve a model transaction
[**getModelUsingGet**](ModelApi.md#getModelUsingGet) | **GET** /model/{model_id} | Retrieve a model
[**updateModelAssetSizeUsingPut**](ModelApi.md#updateModelAssetSizeUsingPut) | **PUT** /model_asset_size/{model_asset_size_id} | Update a model asset size
[**updateModelCommentUsingPut**](ModelApi.md#updateModelCommentUsingPut) | **PUT** /model_comment/{model_comment_id} | Update a model commentary
[**updateModelHoldingUsingPut**](ModelApi.md#updateModelHoldingUsingPut) | **PUT** /model_holding/{model_holding_id} | Update a model holding
[**updateModelTransactionUsingPut**](ModelApi.md#updateModelTransactionUsingPut) | **PUT** /model_transaction/{model_transaction_id} | Update a model transaction
[**updateModelUsingPut**](ModelApi.md#updateModelUsingPut) | **PUT** /model/{model_id} | Update a model


<a name="createModelAssetSizeUsingPost"></a>
# **createModelAssetSizeUsingPost**
> ModelAssetSize createModelAssetSizeUsingPost(req)

Create a model asset size

Create a new asset size record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var req = new HydrogenNucleusApi.ModelAssetSize(); // ModelAssetSize | req


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelAssetSizeUsingPost(req, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**ModelAssetSize**](ModelAssetSize.md)| req | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelChangeUsingPost"></a>
# **createModelChangeUsingPost**
> [ModelTransaction] createModelChangeUsingPost(changeRequest, modelId)

Change a model composition

Model composition changes represent a change in a model’s holdings.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var changeRequest = new HydrogenNucleusApi.OrderReconcileRequest(); // OrderReconcileRequest | changeRequest

var modelId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID model_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelChangeUsingPost(changeRequest, modelId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changeRequest** | [**OrderReconcileRequest**](OrderReconcileRequest.md)| changeRequest | 
 **modelId** | **String**| UUID model_id | 

### Return type

[**[ModelTransaction]**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelCommentUsingPost"></a>
# **createModelCommentUsingPost**
> &#39;Number&#39; createModelCommentUsingPost(modelCommentRequest)

Create a model commentary

Create a new comment for a model available for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelCommentRequest = new HydrogenNucleusApi.ModelComment(); // ModelComment | modelCommentRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelCommentUsingPost(modelCommentRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentRequest** | [**ModelComment**](ModelComment.md)| modelCommentRequest | 

### Return type

**&#39;Number&#39;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelHoldingUsingPost"></a>
# **createModelHoldingUsingPost**
> ModelHolding createModelHoldingUsingPost(modelHoldingRequest)

Create a model holding

Create a new model holding record for a specific model and date.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelHoldingRequest = new HydrogenNucleusApi.ModelHolding(); // ModelHolding | modelHoldingRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelHoldingUsingPost(modelHoldingRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingRequest** | [**ModelHolding**](ModelHolding.md)| modelHoldingRequest | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelTransactionUsingPost"></a>
# **createModelTransactionUsingPost**
> ModelTransaction createModelTransactionUsingPost(modelTransactionRequest)

Create a model transaction

Create a new transaction record for a security under a model for a specific date.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelTransactionRequest = new HydrogenNucleusApi.ModelTransaction(); // ModelTransaction | modelTransactionRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelTransactionUsingPost(modelTransactionRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionRequest** | [**ModelTransaction**](ModelTransaction.md)| modelTransactionRequest | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createModelUsingPost"></a>
# **createModelUsingPost**
> Model createModelUsingPost(modelInfoRequest)

Create a model

Create a new model for your firm to which a portfolios can later subscribe.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelInfoRequest = new HydrogenNucleusApi.Model(); // Model | modelInfoRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createModelUsingPost(modelInfoRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelInfoRequest** | [**Model**](Model.md)| modelInfoRequest | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteModelAssetSizeUsingDelete"></a>
# **deleteModelAssetSizeUsingDelete**
> deleteModelAssetSizeUsingDelete(modelAssetSizeId)

Delete a model asset size

Permanently delete a model asset size record for a model. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelAssetSizeId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelAssetSizeUsingDelete(modelAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | **String**| UUID model_asset_size_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelCommentUsingDelete"></a>
# **deleteModelCommentUsingDelete**
> deleteModelCommentUsingDelete(modelCommentId)

Delete a model commentary

Permanently delete a model comment for a model

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelCommentId = "8d97c85c-8cbf-4ac1-a5df-f9d2bb6a77e0"; // String | UUID model_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelCommentUsingDelete(modelCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | **String**| UUID model_comment_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelHoldingUsingDelete"></a>
# **deleteModelHoldingUsingDelete**
> deleteModelHoldingUsingDelete(modelHoldingId)

Delete a model holding

Permanently delete a model holding record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelHoldingId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelHoldingUsingDelete(modelHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | **String**| UUID model_holding_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelTransactionUsingDelete"></a>
# **deleteModelTransactionUsingDelete**
> deleteModelTransactionUsingDelete(modelTransactionId)

Delete a model transaction

Permanently delete a model transaction for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelTransactionId = "e7cf805b-4307-41e9-8b58-90b6359fa900"; // String | UUID model_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelTransactionUsingDelete(modelTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | **String**| UUID model_transaction_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteModelUsingDelete"></a>
# **deleteModelUsingDelete**
> deleteModelUsingDelete(modelId)

Delete a model

Permanently delete a model for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID model_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteModelUsingDelete(modelId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| UUID model_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAllUsingGet"></a>
# **getModelAllUsingGet**
> PageModel getModelAllUsingGet(opts)

List all models

Get details for all models defined for your firm to which portfolios can subscribe.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

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
apiInstance.getModelAllUsingGet(opts, callback);
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

[**PageModel**](PageModel.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAssetSizeAllUsingGet"></a>
# **getModelAssetSizeAllUsingGet**
> PageModelAssetSize getModelAssetSizeAllUsingGet(opts)

List all model asset sizes

Get a list of asset sizes per date for all models defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

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
apiInstance.getModelAssetSizeAllUsingGet(opts, callback);
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

[**PageModelAssetSize**](PageModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelAssetSizeUsingGet"></a>
# **getModelAssetSizeUsingGet**
> ModelAssetSize getModelAssetSizeUsingGet(modelAssetSizeId)

Retrieve a model asset size

Retrieve the information for a model asset size record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelAssetSizeId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelAssetSizeUsingGet(modelAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSizeId** | **String**| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelCommentAllUsingGet"></a>
# **getModelCommentAllUsingGet**
> PageModelComment getModelCommentAllUsingGet(opts)

List all model commentary

List all comments for all models defined by your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

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
apiInstance.getModelCommentAllUsingGet(opts, callback);
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

[**PageModelComment**](PageModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelCommentUsingGet"></a>
# **getModelCommentUsingGet**
> ModelComment getModelCommentUsingGet(modelCommentId)

Retrieve a model commentary

Retrieve the information for a model comment for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelCommentId = "8d97c85c-8cbf-4ac1-a5df-f9d2bb6a77e0"; // String | UUID model_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelCommentUsingGet(modelCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelCommentId** | **String**| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelHoldingAllUsingGet"></a>
# **getModelHoldingAllUsingGet**
> PageModelHolding getModelHoldingAllUsingGet(opts)

List all model holdings

Get all model holding records for all models defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

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
apiInstance.getModelHoldingAllUsingGet(opts, callback);
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

[**PageModelHolding**](PageModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelHoldingUsingGet"></a>
# **getModelHoldingUsingGet**
> ModelHolding getModelHoldingUsingGet(modelHoldingId)

Retrieve a model holding

Retrieve the information for a model holding record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelHoldingId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelHoldingUsingGet(modelHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHoldingId** | **String**| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelTransactionAllUsingGet"></a>
# **getModelTransactionAllUsingGet**
> PageModelTransaction getModelTransactionAllUsingGet(opts)

List all model transactions

Get details for all transaction records for all models defined by your firm. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

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
apiInstance.getModelTransactionAllUsingGet(opts, callback);
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

[**PageModelTransaction**](PageModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelTransactionUsingGet"></a>
# **getModelTransactionUsingGet**
> ModelTransaction getModelTransactionUsingGet(modelTransactionId)

Retrieve a model transaction

Retrieve the information for a model transaction for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelTransactionId = "e7cf805b-4307-41e9-8b58-90b6359fa900"; // String | UUID model_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelTransactionUsingGet(modelTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransactionId** | **String**| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelUsingGet"></a>
# **getModelUsingGet**
> Model getModelUsingGet(modelId)

Retrieve a model

Get the information for a model for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID model_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelUsingGet(modelId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateModelAssetSizeUsingPut"></a>
# **updateModelAssetSizeUsingPut**
> ModelAssetSize updateModelAssetSizeUsingPut(modelAssetSize, modelAssetSizeId)

Update a model asset size

Update a model asset size record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelAssetSize = new HydrogenNucleusApi.ModelAssetSize(); // ModelAssetSize | model_asset_size

var modelAssetSizeId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelAssetSizeUsingPut(modelAssetSize, modelAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelAssetSize** | [**ModelAssetSize**](ModelAssetSize.md)| model_asset_size | 
 **modelAssetSizeId** | **String**| UUID model_asset_size_id | 

### Return type

[**ModelAssetSize**](ModelAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelCommentUsingPut"></a>
# **updateModelCommentUsingPut**
> ModelComment updateModelCommentUsingPut(modelComment, modelCommentId)

Update a model commentary

Update a model comment for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelComment = new HydrogenNucleusApi.ModelComment(); // ModelComment | model_comment

var modelCommentId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelCommentUsingPut(modelComment, modelCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelComment** | [**ModelComment**](ModelComment.md)| model_comment | 
 **modelCommentId** | **String**| UUID model_comment_id | 

### Return type

[**ModelComment**](ModelComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelHoldingUsingPut"></a>
# **updateModelHoldingUsingPut**
> ModelHolding updateModelHoldingUsingPut(modelHolding, modelHoldingId)

Update a model holding

Update a model holding record for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelHolding = new HydrogenNucleusApi.ModelHolding(); // ModelHolding | model_holding

var modelHoldingId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelHoldingUsingPut(modelHolding, modelHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelHolding** | [**ModelHolding**](ModelHolding.md)| model_holding | 
 **modelHoldingId** | **String**| UUID model_holding_id | 

### Return type

[**ModelHolding**](ModelHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelTransactionUsingPut"></a>
# **updateModelTransactionUsingPut**
> ModelTransaction updateModelTransactionUsingPut(modelTransaction, modelTransactionId)

Update a model transaction

Update a model transaction for a model.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var modelTransaction = new HydrogenNucleusApi.ModelTransaction(); // ModelTransaction | model_transaction

var modelTransactionId = "b4c033db-9d05-4a33-8e28-40650d454487"; // String | UUID model_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelTransactionUsingPut(modelTransaction, modelTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelTransaction** | [**ModelTransaction**](ModelTransaction.md)| model_transaction | 
 **modelTransactionId** | **String**| UUID model_transaction_id | 

### Return type

[**ModelTransaction**](ModelTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateModelUsingPut"></a>
# **updateModelUsingPut**
> Model updateModelUsingPut(model, modelId)

Update a model

Update a model for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ModelApi();

var model = new HydrogenNucleusApi.Model(); // Model | model

var modelId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID model_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateModelUsingPut(model, modelId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**Model**](Model.md)| model | 
 **modelId** | **String**| UUID model_id | 

### Return type

[**Model**](Model.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

