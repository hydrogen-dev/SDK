# HydrogenIntegrationApi.BaasApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBaasAccountUsingPost**](BaasApi.md#createBaasAccountUsingPost) | **POST** /baas/account | create a Baas account
[**createBaasClientUsingPost**](BaasApi.md#createBaasClientUsingPost) | **POST** /baas/client | Create a Baas Client
[**createBaasSubAccountUsingPost**](BaasApi.md#createBaasSubAccountUsingPost) | **POST** /baas/subaccount | create a Baas subaccount
[**getBaasAccountStatementUsingGet**](BaasApi.md#getBaasAccountStatementUsingGet) | **GET** /baas/statement/{nucleus_account_id} | Get a Baas account statement
[**getBaasPortfolioBalanceUsingGet**](BaasApi.md#getBaasPortfolioBalanceUsingGet) | **GET** /baas/balance/{nucleus_portfolio_id} | Get a Baas portfolio balance
[**getBaasPortfolioTransactionUsingGet**](BaasApi.md#getBaasPortfolioTransactionUsingGet) | **GET** /baas/transaction/{nucleus_portfolio_id} | Get a Baas portfolio transaction
[**updateBaasClientUsingPut**](BaasApi.md#updateBaasClientUsingPut) | **PUT** /baas/client | Update a Baas client


<a name="createBaasAccountUsingPost"></a>
# **createBaasAccountUsingPost**
> BaasAccountVO createBaasAccountUsingPost(baasAccountCO)

create a Baas account

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var baasAccountCO = new HydrogenIntegrationApi.BaasAccountCO(); // BaasAccountCO | baasAccountCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBaasAccountUsingPost(baasAccountCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasAccountCO** | [**BaasAccountCO**](BaasAccountCO.md)| baasAccountCO | 

### Return type

[**BaasAccountVO**](BaasAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBaasClientUsingPost"></a>
# **createBaasClientUsingPost**
> BaasClientVO createBaasClientUsingPost(baasClientCO)

Create a Baas Client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var baasClientCO = new HydrogenIntegrationApi.BaasClientCO(); // BaasClientCO | baasClientCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBaasClientUsingPost(baasClientCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasClientCO** | [**BaasClientCO**](BaasClientCO.md)| baasClientCO | 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBaasSubAccountUsingPost"></a>
# **createBaasSubAccountUsingPost**
> BaasSubAccountVO createBaasSubAccountUsingPost(baasSubAccountCO)

create a Baas subaccount

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var baasSubAccountCO = new HydrogenIntegrationApi.BaasSubAccountCO(); // BaasSubAccountCO | baasSubAccountCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBaasSubAccountUsingPost(baasSubAccountCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasSubAccountCO** | [**BaasSubAccountCO**](BaasSubAccountCO.md)| baasSubAccountCO | 

### Return type

[**BaasSubAccountVO**](BaasSubAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getBaasAccountStatementUsingGet"></a>
# **getBaasAccountStatementUsingGet**
> BaasStatementsVO getBaasAccountStatementUsingGet(endDate, nucleusAccountId, startDate, opts)

Get a Baas account statement

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var endDate = new Date("2013-10-20"); // Date | end_date

var nucleusAccountId = "nucleusAccountId_example"; // String | nucleus_account_id

var startDate = new Date("2013-10-20"); // Date | start_date

var opts = { 
  'statementType': "statementType_example" // String | statement_type
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBaasAccountStatementUsingGet(endDate, nucleusAccountId, startDate, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **Date**| end_date | 
 **nucleusAccountId** | [**String**](.md)| nucleus_account_id | 
 **startDate** | **Date**| start_date | 
 **statementType** | **String**| statement_type | [optional] 

### Return type

[**BaasStatementsVO**](BaasStatementsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBaasPortfolioBalanceUsingGet"></a>
# **getBaasPortfolioBalanceUsingGet**
> BaasBalanceVO getBaasPortfolioBalanceUsingGet(nucleusPortfolioId, opts)

Get a Baas portfolio balance

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBaasPortfolioBalanceUsingGet(nucleusPortfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**BaasBalanceVO**](BaasBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBaasPortfolioTransactionUsingGet"></a>
# **getBaasPortfolioTransactionUsingGet**
> BaasTransactionsVO getBaasPortfolioTransactionUsingGet(nucleusPortfolioId, opts)

Get a Baas portfolio transaction

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id

var opts = { 
  'endDate': new Date("2013-10-20"), // Date | end_date
  'startDate': new Date("2013-10-20") // Date | start_date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBaasPortfolioTransactionUsingGet(nucleusPortfolioId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 
 **endDate** | **Date**| end_date | [optional] 
 **startDate** | **Date**| start_date | [optional] 

### Return type

[**BaasTransactionsVO**](BaasTransactionsVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBaasClientUsingPut"></a>
# **updateBaasClientUsingPut**
> BaasClientVO updateBaasClientUsingPut(baasClientCO)

Update a Baas client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BaasApi();

var baasClientCO = new HydrogenIntegrationApi.BaasClientCO(); // BaasClientCO | baasClientCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBaasClientUsingPut(baasClientCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baasClientCO** | [**BaasClientCO**](BaasClientCO.md)| baasClientCO | 

### Return type

[**BaasClientVO**](BaasClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

