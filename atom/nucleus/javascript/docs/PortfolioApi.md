# HydrogenNucleusApi.PortfolioApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortfolioAssetSizeUsingPost**](PortfolioApi.md#createPortfolioAssetSizeUsingPost) | **POST** /portfolio_asset_size | Create a portfolio asset size
[**createPortfolioCommentUsingPost**](PortfolioApi.md#createPortfolioCommentUsingPost) | **POST** /portfolio_comment | Create a portfolio commentary
[**createPortfolioGoalUsingPost**](PortfolioApi.md#createPortfolioGoalUsingPost) | **POST** /portfolio_goal | Create an portfolio goal
[**createPortfolioHoldingUsingPost**](PortfolioApi.md#createPortfolioHoldingUsingPost) | **POST** /portfolio_holding | Create a portfolio holding
[**createPortfolioTransactionUsingPost**](PortfolioApi.md#createPortfolioTransactionUsingPost) | **POST** /portfolio_transaction | Create a portfolio transaction
[**createPortfolioUsingPost**](PortfolioApi.md#createPortfolioUsingPost) | **POST** /portfolio | Create a portfolio
[**deletePortfolioAssetSizeUsingDelete**](PortfolioApi.md#deletePortfolioAssetSizeUsingDelete) | **DELETE** /portfolio_asset_size/{portfolio_asset_size_id} | Delete a portfolio asset size
[**deletePortfolioCommentUsingDelete**](PortfolioApi.md#deletePortfolioCommentUsingDelete) | **DELETE** /portfolio_comment/{portfolio_comment_id} | Delete a portfolio commentary
[**deletePortfolioGoalUsingDelete**](PortfolioApi.md#deletePortfolioGoalUsingDelete) | **DELETE** /portfolio_goal/{portfolio_goal_id} | Delete an portfolio goal
[**deletePortfolioHoldingUsingDelete**](PortfolioApi.md#deletePortfolioHoldingUsingDelete) | **DELETE** /portfolio_holding/{portfolio_holding_id} | Delete a portfolio holding
[**deletePortfolioTransactionUsingDelete**](PortfolioApi.md#deletePortfolioTransactionUsingDelete) | **DELETE** /portfolio_transaction/{portfolio_transaction_id} | Delete a portfolio transaction
[**deletePortfolioUsingDelete**](PortfolioApi.md#deletePortfolioUsingDelete) | **DELETE** /portfolio/{portfolio_id} | Delete a portfolio
[**getPortfolioAggregatedDataUsingGet**](PortfolioApi.md#getPortfolioAggregatedDataUsingGet) | **GET** /portfolio/{portfolio_id}/aggregate_data | Retrieve an portfolio aggregate data
[**getPortfolioAllUsingGet**](PortfolioApi.md#getPortfolioAllUsingGet) | **GET** /portfolio | List all portfolios
[**getPortfolioAssetSizeAllUsingGet**](PortfolioApi.md#getPortfolioAssetSizeAllUsingGet) | **GET** /portfolio_asset_size | Retrieve a portfolio asset size
[**getPortfolioAssetSizeUsingGet**](PortfolioApi.md#getPortfolioAssetSizeUsingGet) | **GET** /portfolio_asset_size/{portfolio_asset_size_id} | Retrieve a portfolio asset size
[**getPortfolioCommentAllUsingGet**](PortfolioApi.md#getPortfolioCommentAllUsingGet) | **GET** /portfolio_comment | List all portfolio commentary
[**getPortfolioCommentUsingGet**](PortfolioApi.md#getPortfolioCommentUsingGet) | **GET** /portfolio_comment/{portfolio_comment_id} | Retrieve a portfolio commentary
[**getPortfolioGoalAllUsingGet**](PortfolioApi.md#getPortfolioGoalAllUsingGet) | **GET** /portfolio_goal | List all portfolio goals
[**getPortfolioGoalUsingGet**](PortfolioApi.md#getPortfolioGoalUsingGet) | **GET** /portfolio_goal/{portfolio_goal_id} | Retrieve an portfolio goal
[**getPortfolioHoldingAllUsingGet**](PortfolioApi.md#getPortfolioHoldingAllUsingGet) | **GET** /portfolio_holding | List all portfolio holdings
[**getPortfolioHoldingUsingGet**](PortfolioApi.md#getPortfolioHoldingUsingGet) | **GET** /portfolio_holding/{portfolio_holding_id} | Retrieve a portfolio holding
[**getPortfolioTransactionAllUsingGet**](PortfolioApi.md#getPortfolioTransactionAllUsingGet) | **GET** /portfolio_transaction | List all portfolio transactions
[**getPortfolioTransactionUsingGet**](PortfolioApi.md#getPortfolioTransactionUsingGet) | **GET** /portfolio_transaction/{portfolio_transaction_id} | Retrieve a portfolio transaction
[**getPortfolioUsingGet**](PortfolioApi.md#getPortfolioUsingGet) | **GET** /portfolio/{portfolio_id} | Retrieve a portfolio
[**updatePortfolioAssetSizeUsingPut**](PortfolioApi.md#updatePortfolioAssetSizeUsingPut) | **PUT** /portfolio_asset_size/{portfolio_asset_size_id} | Update a portfolio asset size
[**updatePortfolioCommentUsingPut**](PortfolioApi.md#updatePortfolioCommentUsingPut) | **PUT** /portfolio_comment/{portfolio_comment_id} | Update a portfolio comment
[**updatePortfolioGoalUsingPut**](PortfolioApi.md#updatePortfolioGoalUsingPut) | **PUT** /portfolio_goal/{portfolio_goal_id} | Update an portfolio goal
[**updatePortfolioHoldingUsingPut**](PortfolioApi.md#updatePortfolioHoldingUsingPut) | **PUT** /portfolio_holding/{portfolio_holding_id} | Update a portfolio holding
[**updatePortfolioTransactionUsingPut**](PortfolioApi.md#updatePortfolioTransactionUsingPut) | **PUT** /portfolio_transaction/{portfolio_transaction_id} | Update a portfolio transaction
[**updatePortfolioUsingPut**](PortfolioApi.md#updatePortfolioUsingPut) | **PUT** /portfolio/{portfolio_id} | Update a portfolio


<a name="createPortfolioAssetSizeUsingPost"></a>
# **createPortfolioAssetSizeUsingPost**
> PortfolioAssetSizeLog createPortfolioAssetSizeUsingPost(portfolioAssetSizeLogRequest)

Create a portfolio asset size

Create a new asset size record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioAssetSizeLogRequest = new HydrogenNucleusApi.PortfolioAssetSizeLog(); // PortfolioAssetSizeLog | portfolioAssetSizeLogRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioAssetSizeUsingPost(portfolioAssetSizeLogRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeLogRequest** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolioAssetSizeLogRequest | 

### Return type

[**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioCommentUsingPost"></a>
# **createPortfolioCommentUsingPost**
> PortfolioComment createPortfolioCommentUsingPost(portfolioComment)

Create a portfolio commentary

Create a new comment for a portfolio defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioComment = new HydrogenNucleusApi.PortfolioComment(); // PortfolioComment | portfolioComment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioCommentUsingPost(portfolioComment, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioComment** | [**PortfolioComment**](PortfolioComment.md)| portfolioComment | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioGoalUsingPost"></a>
# **createPortfolioGoalUsingPost**
> PortfolioGoal createPortfolioGoalUsingPost(portfolioGoal)

Create an portfolio goal

Create an portfolio goal.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioGoal = new HydrogenNucleusApi.PortfolioGoal(); // PortfolioGoal | portfolioGoal


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioGoalUsingPost(portfolioGoal, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolioGoal | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioHoldingUsingPost"></a>
# **createPortfolioHoldingUsingPost**
> PortfolioHoldingLog createPortfolioHoldingUsingPost(portfolioHoldinLogRequest)

Create a portfolio holding

Create a new holding record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioHoldinLogRequest = new HydrogenNucleusApi.PortfolioHoldingLog(); // PortfolioHoldingLog | portfolioHoldinLogRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioHoldingUsingPost(portfolioHoldinLogRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldinLogRequest** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolioHoldinLogRequest | 

### Return type

[**PortfolioHoldingLog**](PortfolioHoldingLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioTransactionUsingPost"></a>
# **createPortfolioTransactionUsingPost**
> PortfolioTransaction createPortfolioTransactionUsingPost(portfolioTransactionRequest)

Create a portfolio transaction

Create a new transaction record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioTransactionRequest = new HydrogenNucleusApi.PortfolioTransaction(); // PortfolioTransaction | portfolioTransactionRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioTransactionUsingPost(portfolioTransactionRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionRequest** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolioTransactionRequest | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPortfolioUsingPost"></a>
# **createPortfolioUsingPost**
> Portfolio createPortfolioUsingPost(portfolioRequest)

Create a portfolio

Create a new portfolio for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioRequest = new HydrogenNucleusApi.Portfolio(); // Portfolio | portfolioRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPortfolioUsingPost(portfolioRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioRequest** | [**Portfolio**](Portfolio.md)| portfolioRequest | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePortfolioAssetSizeUsingDelete"></a>
# **deletePortfolioAssetSizeUsingDelete**
> deletePortfolioAssetSizeUsingDelete(portfolioAssetSizeId)

Delete a portfolio asset size

Permanently delete a portfolio asset size record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioAssetSizeId = "01b252d3-1412-477f-8d29-6e2ff6e54c81"; // String | UUID portfolio_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioAssetSizeUsingDelete(portfolioAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | **String**| UUID portfolio_asset_size_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioCommentUsingDelete"></a>
# **deletePortfolioCommentUsingDelete**
> deletePortfolioCommentUsingDelete(portfolioCommentId)

Delete a portfolio commentary

Permanently delete a portfolio comment for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioCommentId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioCommentUsingDelete(portfolioCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | **String**| UUID portfolio_comment_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioGoalUsingDelete"></a>
# **deletePortfolioGoalUsingDelete**
> deletePortfolioGoalUsingDelete(portfolioGoalId)

Delete an portfolio goal

Permanently delete an portfolio-goal mapping.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioGoalId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID portfolio_goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioGoalUsingDelete(portfolioGoalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoalId** | **String**| UUID portfolio_goal_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioHoldingUsingDelete"></a>
# **deletePortfolioHoldingUsingDelete**
> deletePortfolioHoldingUsingDelete(portfolioHoldingId)

Delete a portfolio holding

Permanently delete a portfolio holding record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioHoldingId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioHoldingUsingDelete(portfolioHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | **String**| UUID portfolio_holding_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioTransactionUsingDelete"></a>
# **deletePortfolioTransactionUsingDelete**
> deletePortfolioTransactionUsingDelete(portfolioTransactionId)

Delete a portfolio transaction

Permanently delete a portfolio transaction record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioTransactionId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioTransactionUsingDelete(portfolioTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | **String**| UUID portfolio_transaction_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deletePortfolioUsingDelete"></a>
# **deletePortfolioUsingDelete**
> deletePortfolioUsingDelete(portfolioId)

Delete a portfolio

Permanently delete a portfolio for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deletePortfolioUsingDelete(portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| UUID portfolio_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAggregatedDataUsingGet"></a>
# **getPortfolioAggregatedDataUsingGet**
> PortfolioAggregatedVO getPortfolioAggregatedDataUsingGet(portfolioId, opts)

Retrieve an portfolio aggregate data

Retrieve the information for a securities associated with a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | Portfolio Id

var opts = { 
  'showAssetClass': true, // Boolean | true or false
  'showCategory': true, // Boolean | true or false
  'showIndustry': true, // Boolean | true or false
  'showSector': true, // Boolean | true or false
  'showSecurityClass': true // Boolean | true or false
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioAggregatedDataUsingGet(portfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| Portfolio Id | 
 **showAssetClass** | **Boolean**| true or false | [optional] [default to true]
 **showCategory** | **Boolean**| true or false | [optional] [default to true]
 **showIndustry** | **Boolean**| true or false | [optional] [default to true]
 **showSector** | **Boolean**| true or false | [optional] [default to true]
 **showSecurityClass** | **Boolean**| true or false | [optional] [default to true]

### Return type

[**PortfolioAggregatedVO**](PortfolioAggregatedVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAllUsingGet"></a>
# **getPortfolioAllUsingGet**
> PagePortfolio getPortfolioAllUsingGet(opts)

List all portfolios

Get the information for all portfolios assigned to all of your firm’s accounts. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioAllUsingGet(opts, callback);
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

[**PagePortfolio**](PagePortfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAssetSizeAllUsingGet"></a>
# **getPortfolioAssetSizeAllUsingGet**
> PagePortfolioAssetSizeLog getPortfolioAssetSizeAllUsingGet(opts)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioAssetSizeAllUsingGet(opts, callback);
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

[**PagePortfolioAssetSizeLog**](PagePortfolioAssetSizeLog.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioAssetSizeUsingGet"></a>
# **getPortfolioAssetSizeUsingGet**
> PortfolioAssetSize getPortfolioAssetSizeUsingGet(portfolioAssetSizeId)

Retrieve a portfolio asset size

Retrieve the information for a portfolio asset size record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioAssetSizeId = "portfolioAssetSizeId_example"; // String | portfolio_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioAssetSizeUsingGet(portfolioAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSizeId** | **String**| portfolio_asset_size_id | 

### Return type

[**PortfolioAssetSize**](PortfolioAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioCommentAllUsingGet"></a>
# **getPortfolioCommentAllUsingGet**
> PagePortfolioComment getPortfolioCommentAllUsingGet(opts)

List all portfolio commentary

List all comments for all portfolios defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioCommentAllUsingGet(opts, callback);
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

[**PagePortfolioComment**](PagePortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioCommentUsingGet"></a>
# **getPortfolioCommentUsingGet**
> PortfolioComment getPortfolioCommentUsingGet(portfolioCommentId)

Retrieve a portfolio commentary

Retrieve the information for a portfolio comment for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioCommentId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioCommentUsingGet(portfolioCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioCommentId** | **String**| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioGoalAllUsingGet"></a>
# **getPortfolioGoalAllUsingGet**
> PagePortfolioGoal getPortfolioGoalAllUsingGet(opts)

List all portfolio goals

Get information for all portfolio-goal mappings defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioGoalAllUsingGet(opts, callback);
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

[**PagePortfolioGoal**](PagePortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioGoalUsingGet"></a>
# **getPortfolioGoalUsingGet**
> PortfolioGoal getPortfolioGoalUsingGet(portfolioGoalId)

Retrieve an portfolio goal

Retrieve the information for a specific portfolio-goal mapping.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioGoalId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID portfolio_goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioGoalUsingGet(portfolioGoalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoalId** | **String**| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingAllUsingGet"></a>
# **getPortfolioHoldingAllUsingGet**
> PortfolioHolding getPortfolioHoldingAllUsingGet(opts)

List all portfolio holdings

Get the information for all holding records for all portfolios defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioHoldingAllUsingGet(opts, callback);
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

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingUsingGet"></a>
# **getPortfolioHoldingUsingGet**
> PortfolioHolding getPortfolioHoldingUsingGet(portfolioHoldingId)

Retrieve a portfolio holding

Retrieve the information for a portfolio holding record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioHoldingId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioHoldingUsingGet(portfolioHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHoldingId** | **String**| UUID portfolio_holding_id | 

### Return type

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionAllUsingGet"></a>
# **getPortfolioTransactionAllUsingGet**
> PagePortfolioTransaction getPortfolioTransactionAllUsingGet(opts)

List all portfolio transactions

Get the information for all transaction records for all portfolios defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

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
apiInstance.getPortfolioTransactionAllUsingGet(opts, callback);
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

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionUsingGet"></a>
# **getPortfolioTransactionUsingGet**
> PortfolioTransaction getPortfolioTransactionUsingGet(portfolioTransactionId)

Retrieve a portfolio transaction

Retrieve the information for a portfolio transaction record for a portfolio. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioTransactionId = "099961da-7f41-4309-950f-2b51689a0033"; // String | UUID portfolio_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioTransactionUsingGet(portfolioTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransactionId** | **String**| UUID portfolio_transaction_id | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioUsingGet"></a>
# **getPortfolioUsingGet**
> Portfolio getPortfolioUsingGet(portfolioId)

Retrieve a portfolio

Retrieve a portfolio for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioUsingGet(portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | **String**| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updatePortfolioAssetSizeUsingPut"></a>
# **updatePortfolioAssetSizeUsingPut**
> PortfolioAssetSize updatePortfolioAssetSizeUsingPut(portfolioAssetSize, portfolioAssetSizeId)

Update a portfolio asset size

Update the information for a portfolio asset size record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioAssetSize = new HydrogenNucleusApi.PortfolioAssetSizeLog(); // PortfolioAssetSizeLog | portfolio_asset_size

var portfolioAssetSizeId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_asset_size_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioAssetSizeUsingPut(portfolioAssetSize, portfolioAssetSizeId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioAssetSize** | [**PortfolioAssetSizeLog**](PortfolioAssetSizeLog.md)| portfolio_asset_size | 
 **portfolioAssetSizeId** | **String**| UUID portfolio_asset_size_id | 

### Return type

[**PortfolioAssetSize**](PortfolioAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioCommentUsingPut"></a>
# **updatePortfolioCommentUsingPut**
> PortfolioComment updatePortfolioCommentUsingPut(portfolioComment, portfolioCommentId)

Update a portfolio comment

Update the information for a portfolio comment for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioComment = new HydrogenNucleusApi.PortfolioComment(); // PortfolioComment | portfolio_comment

var portfolioCommentId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_comment_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioCommentUsingPut(portfolioComment, portfolioCommentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioComment** | [**PortfolioComment**](PortfolioComment.md)| portfolio_comment | 
 **portfolioCommentId** | **String**| UUID portfolio_comment_id | 

### Return type

[**PortfolioComment**](PortfolioComment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioGoalUsingPut"></a>
# **updatePortfolioGoalUsingPut**
> PortfolioGoal updatePortfolioGoalUsingPut(portfolioGoal, portfolioGoalId)

Update an portfolio goal

Update the information for an portfolio-goal mapping.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioGoal = new HydrogenNucleusApi.PortfolioGoal(); // PortfolioGoal | portfolio_goal

var portfolioGoalId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_goal_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioGoalUsingPut(portfolioGoal, portfolioGoalId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioGoal** | [**PortfolioGoal**](PortfolioGoal.md)| portfolio_goal | 
 **portfolioGoalId** | **String**| UUID portfolio_goal_id | 

### Return type

[**PortfolioGoal**](PortfolioGoal.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioHoldingUsingPut"></a>
# **updatePortfolioHoldingUsingPut**
> PortfolioHolding updatePortfolioHoldingUsingPut(portfolioHolding, portfolioHoldingId)

Update a portfolio holding

Update the information for a portfolio holding record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioHolding = new HydrogenNucleusApi.PortfolioHoldingLog(); // PortfolioHoldingLog | portfolio_holding

var portfolioHoldingId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioHoldingUsingPut(portfolioHolding, portfolioHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioHolding** | [**PortfolioHoldingLog**](PortfolioHoldingLog.md)| portfolio_holding | 
 **portfolioHoldingId** | **String**| UUID portfolio_holding_id | 

### Return type

[**PortfolioHolding**](PortfolioHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioTransactionUsingPut"></a>
# **updatePortfolioTransactionUsingPut**
> PortfolioTransaction updatePortfolioTransactionUsingPut(portfolioTransaction, portfolioTransactionId)

Update a portfolio transaction

Update the information for a portfolio transaction record for a portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolioTransaction = new HydrogenNucleusApi.PortfolioTransaction(); // PortfolioTransaction | portfolio_transaction

var portfolioTransactionId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioTransactionUsingPut(portfolioTransaction, portfolioTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioTransaction** | [**PortfolioTransaction**](PortfolioTransaction.md)| portfolio_transaction | 
 **portfolioTransactionId** | **String**| UUID portfolio_transaction_id | 

### Return type

[**PortfolioTransaction**](PortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updatePortfolioUsingPut"></a>
# **updatePortfolioUsingPut**
> Portfolio updatePortfolioUsingPut(portfolio, portfolioId)

Update a portfolio

Update a portfolio for an account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PortfolioApi();

var portfolio = new HydrogenNucleusApi.Portfolio(); // Portfolio | portfolio

var portfolioId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updatePortfolioUsingPut(portfolio, portfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | [**Portfolio**](Portfolio.md)| portfolio | 
 **portfolioId** | **String**| UUID portfolio_id | 

### Return type

[**Portfolio**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

