# HydrogenIntegrationApi.AggregationApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountUsingPost**](AggregationApi.md#createAggregationAccountUsingPost) | **POST** /aggregation/account | Create mapping between client,vendor,tenant
[**createPropertyValueUsingPost**](AggregationApi.md#createPropertyValueUsingPost) | **POST** /property_value | Create mapping between client,vendor,tenant for the property
[**deleteAggregationAccountUsingDelete**](AggregationApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation/account/{nucleus_aggregation_account_id} | De-Link mapping between client,vendor,tenant
[**getAggregationAccountAllUsingGet**](AggregationApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation/account | Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client
[**getAggregationAccountBalanceAllUsingGet**](AggregationApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation/balance | Fetch all aggregation account balance details with for the given aggregation accounts 
[**getAggregationAccountBalanceUsingGet**](AggregationApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation/balance/{nucleus_aggregation_account_id} | Fetch aggregation account balance details with the mapping created in POST endpoint
[**getAggregationAccountHoldingAllUsingGet**](AggregationApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation/holding | Fetch all aggregation account(s) holding details with the mapping created in POST endpoint
[**getAggregationAccountHoldingUsingGet**](AggregationApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation/holding/{nucleus_aggregation_account_id} | Fetch aggregation account holding details with the mapping created in POST endpoint
[**getAggregationAccountTransactionAllUsingGet**](AggregationApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation/transaction | Fetch all aggregation account balance details with for the given aggregation accounts 
[**getAggregationAccountTransactionUsingGet**](AggregationApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation/transaction/{nucleus_aggregation_account_id} | Fetch aggregation account transaction details with the mapping created in POST endpoint
[**getAggregationAccountUsingGet**](AggregationApi.md#getAggregationAccountUsingGet) | **GET** /aggregation/account/{nucleus_aggregation_account_id} | Fetch aggregation account details with the mapping created in POST endpoint


<a name="createAggregationAccountUsingPost"></a>
# **createAggregationAccountUsingPost**
> AggregationAccountsResponseVO createAggregationAccountUsingPost(aggregationRequestObject)

Create mapping between client,vendor,tenant

Create mapping between client,vendor,tenant

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationRequestObject = new HydrogenIntegrationApi.AggregationRequestObject(); // AggregationRequestObject | aggregationRequestObject


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountUsingPost(aggregationRequestObject, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationRequestObject** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 

### Return type

[**AggregationAccountsResponseVO**](AggregationAccountsResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPropertyValueUsingPost"></a>
# **createPropertyValueUsingPost**
> PropertyValueResponseVO createPropertyValueUsingPost(aggregationRequestObject, opts)

Create mapping between client,vendor,tenant for the property

Create mapping between client,vendor,tenant for property

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationRequestObject = new HydrogenIntegrationApi.AggregationRequestObject(); // AggregationRequestObject | aggregationRequestObject

var opts = { 
  'authorization': "authorization_example" // String | Authorization
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createPropertyValueUsingPost(aggregationRequestObject, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationRequestObject** | [**AggregationRequestObject**](AggregationRequestObject.md)| aggregationRequestObject | 
 **authorization** | **String**| Authorization | [optional] 

### Return type

[**PropertyValueResponseVO**](PropertyValueResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAggregationAccountUsingDelete"></a>
# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete(nucleusAggregationAccountId)

De-Link mapping between client,vendor,tenant

De-Link mapping between client,vendor,tenant

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var nucleusAggregationAccountId = "nucleusAggregationAccountId_example"; // String | nucleus_aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccountUsingDelete(nucleusAggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountAllUsingGet"></a>
# **getAggregationAccountAllUsingGet**
> [AggregationAccountResponseVO] getAggregationAccountAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

Fetch all aggregation account(s) details with the mapping created in POST endpoint for a client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationAccountIdList = ["aggregationAccountIdList_example"]; // [String] | aggregation_account_id_list


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountAllUsingGet(aggregationAccountIdList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**[String]**](String.md)| aggregation_account_id_list | 

### Return type

[**[AggregationAccountResponseVO]**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountBalanceAllUsingGet"></a>
# **getAggregationAccountBalanceAllUsingGet**
> [AggregationAccountBalanceResponseVO] getAggregationAccountBalanceAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationAccountIdList = ["aggregationAccountIdList_example"]; // [String] | aggregation_account_id_list


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountBalanceAllUsingGet(aggregationAccountIdList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**[String]**](String.md)| aggregation_account_id_list | 

### Return type

[**[AggregationAccountBalanceResponseVO]**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountBalanceUsingGet"></a>
# **getAggregationAccountBalanceUsingGet**
> AggregationAccountBalanceResponseVO getAggregationAccountBalanceUsingGet(nucleusAggregationAccountId)

Fetch aggregation account balance details with the mapping created in POST endpoint

Fetch aggregation account balance details with the mapping created in POST endpoint

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var nucleusAggregationAccountId = "nucleusAggregationAccountId_example"; // String | nucleus_aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountBalanceUsingGet(nucleusAggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountBalanceResponseVO**](AggregationAccountBalanceResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingAllUsingGet"></a>
# **getAggregationAccountHoldingAllUsingGet**
> [AggregationAccountHoldingResponseVO] getAggregationAccountHoldingAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

Fetch all aggregation account(s) holding details with the mapping created in POST endpoint

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationAccountIdList = ["aggregationAccountIdList_example"]; // [String] | aggregation_account_id_list


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountHoldingAllUsingGet(aggregationAccountIdList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**[String]**](String.md)| aggregation_account_id_list | 

### Return type

[**[AggregationAccountHoldingResponseVO]**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountHoldingUsingGet"></a>
# **getAggregationAccountHoldingUsingGet**
> AggregationAccountHoldingResponseVO getAggregationAccountHoldingUsingGet(nucleusAggregationAccountId)

Fetch aggregation account holding details with the mapping created in POST endpoint

Fetch aggregation account holding details with the mapping created in POST endpoint

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var nucleusAggregationAccountId = "nucleusAggregationAccountId_example"; // String | nucleus_aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountHoldingUsingGet(nucleusAggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountHoldingResponseVO**](AggregationAccountHoldingResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionAllUsingGet"></a>
# **getAggregationAccountTransactionAllUsingGet**
> [AggregationAccountTransactionResponseVO] getAggregationAccountTransactionAllUsingGet(aggregationAccountIdList)

Fetch all aggregation account balance details with for the given aggregation accounts 

Fetch all aggregation account balance details with for the given aggregation accounts

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var aggregationAccountIdList = ["aggregationAccountIdList_example"]; // [String] | aggregation_account_id_list


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountTransactionAllUsingGet(aggregationAccountIdList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountIdList** | [**[String]**](String.md)| aggregation_account_id_list | 

### Return type

[**[AggregationAccountTransactionResponseVO]**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAggregationAccountTransactionUsingGet"></a>
# **getAggregationAccountTransactionUsingGet**
> AggregationAccountTransactionResponseVO getAggregationAccountTransactionUsingGet(nucleusAggregationAccountId)

Fetch aggregation account transaction details with the mapping created in POST endpoint

Fetch aggregation account transaction details with the mapping created in POST endpoint

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var nucleusAggregationAccountId = "nucleusAggregationAccountId_example"; // String | nucleus_aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountTransactionUsingGet(nucleusAggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountTransactionResponseVO**](AggregationAccountTransactionResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountUsingGet"></a>
# **getAggregationAccountUsingGet**
> AggregationAccountResponseVO getAggregationAccountUsingGet(nucleusAggregationAccountId)

Fetch aggregation account details with the mapping created in POST endpoint

Fetch aggregation account details with the mapping created in POST endpoint

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.AggregationApi();

var nucleusAggregationAccountId = "nucleusAggregationAccountId_example"; // String | nucleus_aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountUsingGet(nucleusAggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusAggregationAccountId** | [**String**](.md)| nucleus_aggregation_account_id | 

### Return type

[**AggregationAccountResponseVO**](AggregationAccountResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

