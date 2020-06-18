# HydrogenNucleusApi.AggregationAccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAggregationAccountBalanceBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceBulkUsingPost) | **POST** /bulk_aggregation_account_balance | Create a bulk aggregation account balance
[**createAggregationAccountBalanceUsingPost**](AggregationAccountApi.md#createAggregationAccountBalanceUsingPost) | **POST** /aggregation_account_balance | Create an aggregation account balance
[**createAggregationAccountBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountBulkUsingPost) | **POST** /bulk_aggregation_account | Create a bulk aggregation account
[**createAggregationAccountHoldingBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingBulkUsingPost) | **POST** /bulk_aggregation_account_holding | Create a bulk aggregation account holding
[**createAggregationAccountHoldingUsingPost**](AggregationAccountApi.md#createAggregationAccountHoldingUsingPost) | **POST** /aggregation_account_holding | Create an aggregation account holding
[**createAggregationAccountTransactionBulkUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionBulkUsingPost) | **POST** /bulk_aggregation_account_transaction | Create a bulk aggregation account transaction
[**createAggregationAccountTransactionUsingPost**](AggregationAccountApi.md#createAggregationAccountTransactionUsingPost) | **POST** /aggregation_account_transaction | Create an aggregation account transaction
[**createAggregationAccountUsingPost**](AggregationAccountApi.md#createAggregationAccountUsingPost) | **POST** /aggregation_account | Create an aggregation account
[**deleteAggregationAccountBalanceUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountBalanceUsingDelete) | **DELETE** /aggregation_account_balance/{aggregation_account_balance_id} | Delete an aggregation account balance
[**deleteAggregationAccountHoldingUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountHoldingUsingDelete) | **DELETE** /aggregation_account_holding/{aggregation_account_holding_id} | Delete an aggregation account holding
[**deleteAggregationAccountTransactionUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountTransactionUsingDelete) | **DELETE** /aggregation_account_transaction/{aggregation_account_transaction_id} | Delete an aggregation account transaction
[**deleteAggregationAccountUsingDelete**](AggregationAccountApi.md#deleteAggregationAccountUsingDelete) | **DELETE** /aggregation_account/{aggregation_account_id} | Delete an aggregation account
[**getAggregationAccountAggregateDataUsingGet**](AggregationAccountApi.md#getAggregationAccountAggregateDataUsingGet) | **GET** /aggregation_account/{aggregation_account_id}/aggregate_data | Retrieve an aggregation account aggregate data
[**getAggregationAccountAllUsingGet**](AggregationAccountApi.md#getAggregationAccountAllUsingGet) | **GET** /aggregation_account | List all aggregation accounts
[**getAggregationAccountBalanceAllUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceAllUsingGet) | **GET** /aggregation_account_balance | List all aggregation account balances
[**getAggregationAccountBalanceUsingGet**](AggregationAccountApi.md#getAggregationAccountBalanceUsingGet) | **GET** /aggregation_account_balance/{aggregation_account_balance_id} | Retrieve an aggregation account balance
[**getAggregationAccountHoldingAllUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingAllUsingGet) | **GET** /aggregation_account_holding | List all aggregation account holdings
[**getAggregationAccountHoldingUsingGet**](AggregationAccountApi.md#getAggregationAccountHoldingUsingGet) | **GET** /aggregation_account_holding/{aggregation_account_holding_id} | Retrieve an aggregation account holding
[**getAggregationAccountOverviewUsingGet**](AggregationAccountApi.md#getAggregationAccountOverviewUsingGet) | **GET** /client/{client_id}/aggregation_account_overview | Retrieve an aggregation account aggregate data
[**getAggregationAccountTransactionAllUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionAllUsingGet) | **GET** /aggregation_account_transaction | List all aggregation account transactions
[**getAggregationAccountTransactionUsingGet**](AggregationAccountApi.md#getAggregationAccountTransactionUsingGet) | **GET** /aggregation_account_transaction/{aggregation_account_transaction_id} | Retrieve an aggregation account transaction
[**getAggregationAccountUsingGet**](AggregationAccountApi.md#getAggregationAccountUsingGet) | **GET** /aggregation_account/{aggregation_account_id} | Retrieve an aggregation account
[**updateAggregationAccountBalanceUsingPut**](AggregationAccountApi.md#updateAggregationAccountBalanceUsingPut) | **PUT** /aggregation_account_balance/{aggregation_account_balance_id} | Update an aggregation account balance
[**updateAggregationAccountBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountBulkUsingPut) | **PUT** /bulk_aggregation_account | Update a bulk aggregation account
[**updateAggregationAccountHoldingBulkUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingBulkUsingPut) | **PUT** /bulk_aggregation_account_holding | Update an bulk aggregation account holding
[**updateAggregationAccountHoldingUsingPut**](AggregationAccountApi.md#updateAggregationAccountHoldingUsingPut) | **PUT** /aggregation_account_holding/{aggregation_account_holding_id} | Update an aggregation account holding
[**updateAggregationAccountTransactionUsingPut**](AggregationAccountApi.md#updateAggregationAccountTransactionUsingPut) | **PUT** /aggregation_account_transaction/{aggregation_account_transaction_id} | Update an aggregation account transaction
[**updateAggregationAccountUsingPut**](AggregationAccountApi.md#updateAggregationAccountUsingPut) | **PUT** /aggregation_account/{aggregation_account_id} | Update an aggregation account


<a name="createAggregationAccountBalanceBulkUsingPost"></a>
# **createAggregationAccountBalanceBulkUsingPost**
> [AggregationAccountBalance] createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance)

Create a bulk aggregation account balance

Create a balance records under an aggregation accounts.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountBalance = [new HydrogenNucleusApi.AggregationAccountBalance()]; // [AggregationAccountBalance] | aggregationAccountBalance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**[AggregationAccountBalance]**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**[AggregationAccountBalance]**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountBalanceUsingPost"></a>
# **createAggregationAccountBalanceUsingPost**
> AggregationAccountBalance createAggregationAccountBalanceUsingPost(aggregationAccountBalance)

Create an aggregation account balance

Create a balance record under an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountBalance = new HydrogenNucleusApi.AggregationAccountBalance(); // AggregationAccountBalance | aggregationAccountBalance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountBalanceUsingPost(aggregationAccountBalance, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregationAccountBalance | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountBulkUsingPost"></a>
# **createAggregationAccountBulkUsingPost**
> [AggregationAccount] createAggregationAccountBulkUsingPost(aggregationAccountList)

Create a bulk aggregation account

Create a bulk aggregation account under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountList = [new HydrogenNucleusApi.AggregationAccount()]; // [AggregationAccount] | aggregationAccountList


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountBulkUsingPost(aggregationAccountList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountList** | [**[AggregationAccount]**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**[AggregationAccount]**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountHoldingBulkUsingPost"></a>
# **createAggregationAccountHoldingBulkUsingPost**
> [AggregationAccountHolding] createAggregationAccountHoldingBulkUsingPost(aggregationTransaction)

Create a bulk aggregation account holding

Create a bulk aggregation account holding.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationTransaction = [new HydrogenNucleusApi.AggregationAccountHolding()]; // [AggregationAccountHolding] | aggregationTransaction


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountHoldingBulkUsingPost(aggregationTransaction, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationTransaction** | [**[AggregationAccountHolding]**](AggregationAccountHolding.md)| aggregationTransaction | 

### Return type

[**[AggregationAccountHolding]**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountHoldingUsingPost"></a>
# **createAggregationAccountHoldingUsingPost**
> AggregationAccountHolding createAggregationAccountHoldingUsingPost(aggregationAccountHolding)

Create an aggregation account holding

Create a holding record under an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountHolding = new HydrogenNucleusApi.AggregationAccountHolding(); // AggregationAccountHolding | aggregationAccountHolding


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountHoldingUsingPost(aggregationAccountHolding, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountTransactionBulkUsingPost"></a>
# **createAggregationAccountTransactionBulkUsingPost**
> [AggregationAccountTransaction] createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions)

Create a bulk aggregation account transaction

Create a bulk transaction record under an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountTransactions = [new HydrogenNucleusApi.AggregationAccountTransaction()]; // [AggregationAccountTransaction] | aggregationAccountTransactions


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactions** | [**[AggregationAccountTransaction]**](AggregationAccountTransaction.md)| aggregationAccountTransactions | 

### Return type

[**[AggregationAccountTransaction]**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountTransactionUsingPost"></a>
# **createAggregationAccountTransactionUsingPost**
> AggregationAccountTransaction createAggregationAccountTransactionUsingPost(aggregationAccountTransaction)

Create an aggregation account transaction

Create a transaction record under an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountTransaction = new HydrogenNucleusApi.AggregationAccountTransaction(); // AggregationAccountTransaction | aggregationAccountTransaction


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountTransactionUsingPost(aggregationAccountTransaction, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregationAccountTransaction | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAggregationAccountUsingPost"></a>
# **createAggregationAccountUsingPost**
> AggregationAccount createAggregationAccountUsingPost(aggregationAccount)

Create an aggregation account

Create an aggregation account under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccount = new HydrogenNucleusApi.AggregationAccount(); // AggregationAccount | aggregationAccount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAggregationAccountUsingPost(aggregationAccount, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccount** | [**AggregationAccount**](AggregationAccount.md)| aggregationAccount | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAggregationAccountBalanceUsingDelete"></a>
# **deleteAggregationAccountBalanceUsingDelete**
> deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId)

Delete an aggregation account balance

Permanently delete a balance record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | **String**| UUID aggregation_account_balance_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountHoldingUsingDelete"></a>
# **deleteAggregationAccountHoldingUsingDelete**
> deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId)

Delete an aggregation account holding

Permanently delete a holding record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHoldingId** | **String**| UUID aggregation_account_holding_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountTransactionUsingDelete"></a>
# **deleteAggregationAccountTransactionUsingDelete**
> AggregationAccountTransaction deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | **String**| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAggregationAccountUsingDelete"></a>
# **deleteAggregationAccountUsingDelete**
> deleteAggregationAccountUsingDelete(aggregationAccountId)

Delete an aggregation account

Permanently delete an aggregation account under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAggregationAccountUsingDelete(aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | **String**| UUID aggregation_account_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountAggregateDataUsingGet"></a>
# **getAggregationAccountAggregateDataUsingGet**
> AggregationAccountAggregateDataVO getAggregationAccountAggregateDataUsingGet(aggregationAccountId)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountAggregateDataUsingGet(aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | **String**| UUID aggregation_account_id | 

### Return type

[**AggregationAccountAggregateDataVO**](AggregationAccountAggregateDataVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountAllUsingGet"></a>
# **getAggregationAccountAllUsingGet**
> PageAggregationAccount getAggregationAccountAllUsingGet(opts)

List all aggregation accounts

Get information for all aggregation accounts for all clients defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

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
apiInstance.getAggregationAccountAllUsingGet(opts, callback);
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

[**PageAggregationAccount**](PageAggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountBalanceAllUsingGet"></a>
# **getAggregationAccountBalanceAllUsingGet**
> PageAggregationAccountBalance getAggregationAccountBalanceAllUsingGet(opts)

List all aggregation account balances

Get all of the balance records for all aggregation accounts defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

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
apiInstance.getAggregationAccountBalanceAllUsingGet(opts, callback);
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

[**PageAggregationAccountBalance**](PageAggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountBalanceUsingGet"></a>
# **getAggregationAccountBalanceUsingGet**
> AggregationAccountBalance getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | **String**| UUID aggregation_account_balance_id | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingAllUsingGet"></a>
# **getAggregationAccountHoldingAllUsingGet**
> PageAggregationAccountHolding getAggregationAccountHoldingAllUsingGet(opts)

List all aggregation account holdings

Get all of the holding records for all aggregation accounts defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

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
apiInstance.getAggregationAccountHoldingAllUsingGet(opts, callback);
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

[**PageAggregationAccountHolding**](PageAggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountHoldingUsingGet"></a>
# **getAggregationAccountHoldingUsingGet**
> AggregationAccountHolding getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHoldingId** | **String**| UUID aggregation_account_holding_id | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountOverviewUsingGet"></a>
# **getAggregationAccountOverviewUsingGet**
> AggregationDataForClientParentResponseVO getAggregationAccountOverviewUsingGet(clientId)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var clientId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID client_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountOverviewUsingGet(clientId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| UUID client_id | 

### Return type

[**AggregationDataForClientParentResponseVO**](AggregationDataForClientParentResponseVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionAllUsingGet"></a>
# **getAggregationAccountTransactionAllUsingGet**
> PageAggregationAccountTransaction getAggregationAccountTransactionAllUsingGet(opts)

List all aggregation account transactions

Get all of the transaction records for all aggregation accounts defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

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
apiInstance.getAggregationAccountTransactionAllUsingGet(opts, callback);
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

[**PageAggregationAccountTransaction**](PageAggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountTransactionUsingGet"></a>
# **getAggregationAccountTransactionUsingGet**
> AggregationAccountTransaction getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | **String**| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountUsingGet"></a>
# **getAggregationAccountUsingGet**
> AggregationAccount getAggregationAccountUsingGet(aggregationAccountId)

Retrieve an aggregation account

Retrieve the information for a specific aggregation account associated with a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAggregationAccountUsingGet(aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | **String**| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateAggregationAccountBalanceUsingPut"></a>
# **updateAggregationAccountBalanceUsingPut**
> AggregationAccountBalance updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId)

Update an aggregation account balance

Update a balance record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountBalance = new HydrogenNucleusApi.AggregationAccountBalance(); // AggregationAccountBalance | aggregation_account_balance

var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalance** | [**AggregationAccountBalance**](AggregationAccountBalance.md)| aggregation_account_balance | 
 **aggregationAccountBalanceId** | **String**| UUID aggregation_account_balance_id | 

### Return type

[**AggregationAccountBalance**](AggregationAccountBalance.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountBulkUsingPut"></a>
# **updateAggregationAccountBulkUsingPut**
> AggregationAccount updateAggregationAccountBulkUsingPut(aggregationAccountList)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountList = [new HydrogenNucleusApi.AggregationAccount()]; // [AggregationAccount] | aggregationAccountList


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountBulkUsingPut(aggregationAccountList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountList** | [**[AggregationAccount]**](AggregationAccount.md)| aggregationAccountList | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountHoldingBulkUsingPut"></a>
# **updateAggregationAccountHoldingBulkUsingPut**
> [AggregationAccountHolding] updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding)

Update an bulk aggregation account holding

Update a bulk holding record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountHolding = [new HydrogenNucleusApi.AggregationAccountHolding()]; // [AggregationAccountHolding] | aggregationAccountHolding


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**[AggregationAccountHolding]**](AggregationAccountHolding.md)| aggregationAccountHolding | 

### Return type

[**[AggregationAccountHolding]**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountHoldingUsingPut"></a>
# **updateAggregationAccountHoldingUsingPut**
> AggregationAccountHolding updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId)

Update an aggregation account holding

Update a holding record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountHolding = new HydrogenNucleusApi.AggregationAccountHolding(); // AggregationAccountHolding | aggregation_account_holding

var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHolding** | [**AggregationAccountHolding**](AggregationAccountHolding.md)| aggregation_account_holding | 
 **aggregationAccountHoldingId** | **String**| UUID aggregation_account_holding_id | 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountTransactionUsingPut"></a>
# **updateAggregationAccountTransactionUsingPut**
> AggregationAccountTransaction updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId)

Update an aggregation account transaction

Update a transaction record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccountTransaction = new HydrogenNucleusApi.AggregationAccountTransaction(); // AggregationAccountTransaction | aggregation_account_transaction

var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransaction** | [**AggregationAccountTransaction**](AggregationAccountTransaction.md)| aggregation_account_transaction | 
 **aggregationAccountTransactionId** | **String**| UUID aggregation_account_transaction_id | 

### Return type

[**AggregationAccountTransaction**](AggregationAccountTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAggregationAccountUsingPut"></a>
# **updateAggregationAccountUsingPut**
> AggregationAccount updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId)

Update an aggregation account

Update the information for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();

var aggregationAccount = new HydrogenNucleusApi.AggregationAccount(); // AggregationAccount | aggregation_account

var aggregationAccountId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID aggregation_account_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccount** | [**AggregationAccount**](AggregationAccount.md)| aggregation_account | 
 **aggregationAccountId** | **String**| UUID aggregation_account_id | 

### Return type

[**AggregationAccount**](AggregationAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

