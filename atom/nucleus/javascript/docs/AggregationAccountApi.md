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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountBalanceBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountBalanceBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountBalance = new HydrogenNucleusApi.AggregationAccountBalance(); // [AggregationAccountBalance] | aggregationAccountBalance
    apiInstance.createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountBalance();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountBalance = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountBalance = new HydrogenNucleusApi.AggregationAccountBalance(); // AggregationAccountBalance | aggregationAccountBalance
    apiInstance.createAggregationAccountBalanceUsingPost(aggregationAccountBalance, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountList = new HydrogenNucleusApi.AggregationAccount(); // [AggregationAccount] | aggregationAccountList
    apiInstance.createAggregationAccountBulkUsingPost(aggregationAccountList, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountHoldingBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountHoldingBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationTransaction = new HydrogenNucleusApi.AggregationAccountHolding(); // [AggregationAccountHolding] | aggregationTransaction
    apiInstance.createAggregationAccountHoldingBulkUsingPost(aggregationTransaction, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountHolding();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountHolding = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountHolding = new HydrogenNucleusApi.AggregationAccountHolding(); // AggregationAccountHolding | aggregationAccountHolding
    apiInstance.createAggregationAccountHoldingUsingPost(aggregationAccountHolding, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountTransactionBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountTransactionBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountTransactions = new HydrogenNucleusApi.AggregationAccountTransaction(); // [AggregationAccountTransaction] | aggregationAccountTransactions
    apiInstance.createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccountTransaction();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccountTransaction = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountTransaction = new HydrogenNucleusApi.AggregationAccountTransaction(); // AggregationAccountTransaction | aggregationAccountTransaction
    apiInstance.createAggregationAccountTransactionUsingPost(aggregationAccountTransaction, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createAggregationAccount();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createAggregationAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccount = new HydrogenNucleusApi.AggregationAccount(); // AggregationAccount | aggregationAccount
    apiInstance.createAggregationAccountUsingPost(aggregationAccount, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteAggregationAccountBalance();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteAggregationAccountBalance = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id
    apiInstance.deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteAggregationAccountHolding();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteAggregationAccountHolding = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id
    apiInstance.deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId, callback);
}
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
> deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId)

Delete an aggregation account transaction

Permanently delete a transaction record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteAggregationAccountTransaction();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteAggregationAccountTransaction = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id
    apiInstance.deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | **String**| UUID aggregation_account_transaction_id | 

### Return type

null (empty response body)

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteAggregationAccount();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteAggregationAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id
    apiInstance.deleteAggregationAccountUsingDelete(aggregationAccountId, callback);
}
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
> Object getAggregationAccountAggregateDataUsingGet(aggregationAccountId, opts)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account associated with a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountAggregateData();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountAggregateData = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id
    apiInstance.getAggregationAccountAggregateDataUsingGet(aggregationAccountId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountId** | **String**| UUID aggregation_account_id | 
 **currencyConversion** | **String**| USD | [optional] 

### Return type

**Object**

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountAll = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getAggregationAccountAllUsingGet(opts, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountBalanceAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountBalanceAll = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'currencyConversion': "currencyConversion_example", // String | currency_conversion
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getAggregationAccountBalanceAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
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
> AggregationAccountBalance getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId, opts)

Retrieve an aggregation account balance

Retrieve the information for a specific balance record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountBalance();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountBalance = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id
    var opts = { 
      'currencyConversion': "currencyConversion_example" // String | USD
    };
    apiInstance.getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountBalanceId** | **String**| UUID aggregation_account_balance_id | 
 **currencyConversion** | **String**| USD | [optional] 

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountHoldingAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountHoldingAll = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'currencyConversion': "currencyConversion_example", // String | currency_conversion
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getAggregationAccountHoldingAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
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
> AggregationAccountHolding getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId, opts)

Retrieve an aggregation account holding

Retrieve the information for a specific holding record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountHolding();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountHolding = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id

    var opts = { 
      'currencyConversion': "currencyConversion_example" // String | USD
    };
    apiInstance.getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountHoldingId** | **String**| UUID aggregation_account_holding_id | 
 **currencyConversion** | **String**| USD | [optional] 

### Return type

[**AggregationAccountHolding**](AggregationAccountHolding.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAggregationAccountOverviewUsingGet"></a>
# **getAggregationAccountOverviewUsingGet**
> Object getAggregationAccountOverviewUsingGet(clientId, opts)

Retrieve an aggregation account aggregate data

Retrieve the information for a specific aggregation account with aggregate data for a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountOverview();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountOverview = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var clientId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID client_id

    var opts = { 
      'currencyConversion': "currencyConversion_example" // String | USD
    };
    apiInstance.getAggregationAccountOverviewUsingGet(clientId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| UUID client_id | 
 **currencyConversion** | **String**| USD | [optional] 

### Return type

**Object**

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountTransactionAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountTransactionAll = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'currencyConversion': "currencyConversion_example", // String | currency_conversion
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getAggregationAccountTransactionAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
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
> AggregationAccountTransaction getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId, opts)

Retrieve an aggregation account transaction

Retrieve the information for a specific transaction record for an aggregation account.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccountTransaction();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccountTransaction = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id

    var opts = { 
      'currencyConversion': "currencyConversion_example" // String | USD
    };
    apiInstance.getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggregationAccountTransactionId** | **String**| UUID aggregation_account_transaction_id | 
 **currencyConversion** | **String**| USD | [optional] 

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getAggregationAccount();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getAggregationAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_id
    apiInstance.getAggregationAccountUsingGet(aggregationAccountId, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccountBalance();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccountBalance = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountBalance = new HydrogenNucleusApi.AggregationAccountBalance(); // AggregationAccountBalance | aggregation_account_balance

    var aggregationAccountBalanceId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_balance_id
    apiInstance.updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId, callback);

}
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
> [AggregationAccount] updateAggregationAccountBulkUsingPut(aggregationAccountList)

Update a bulk aggregation account

Update a bulk aggregation account under a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccountBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccountBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountList = new HydrogenNucleusApi.AggregationAccount(); // [AggregationAccount] | aggregationAccountList
    apiInstance.updateAggregationAccountBulkUsingPut(aggregationAccountList, callback);
}

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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccountHoldingBulk();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccountHoldingBulk = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountHolding = new HydrogenNucleusApi.AggregationAccountHolding(); // [AggregationAccountHolding] | aggregationAccountHolding
    apiInstance.updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccountHolding();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccountHolding = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountHolding = new HydrogenNucleusApi.AggregationAccountHolding(); // AggregationAccountHolding | aggregation_account_holding

    var aggregationAccountHoldingId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_holding_id
    apiInstance.updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccountTransaction();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccountTransaction = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    var aggregationAccountTransaction = new HydrogenNucleusApi.AggregationAccountTransaction(); // AggregationAccountTransaction | aggregation_account_transaction
    var aggregationAccountTransactionId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID aggregation_account_transaction_id
    apiInstance.updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId, callback);
}
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

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateAggregationAccount();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateAggregationAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AggregationAccountApi();
    
    var aggregationAccount = new HydrogenNucleusApi.AggregationAccount(); // AggregationAccount | aggregation_account
    var aggregationAccountId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID aggregation_account_id
    apiInstance.updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId, callback);

}
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

