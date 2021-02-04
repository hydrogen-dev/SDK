# HydrogenIntegrationApi.BrokerageApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/integration/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrderUsingPut**](BrokerageApi.md#cancelOrderUsingPut) | **PUT** /brokerage/order/{nucleus_order_id} | Cancel an Order
[**createBankLinkUsingPost1**](BrokerageApi.md#createBankLinkUsingPost1) | **POST** /brokerage/bank_link | create a Bank Link
[**createBrokerageAccountUsingPost**](BrokerageApi.md#createBrokerageAccountUsingPost) | **POST** /brokerage/account | create a Brokerage account
[**createBrokerageClientUsingPost**](BrokerageApi.md#createBrokerageClientUsingPost) | **POST** /brokerage/client | Create a Brokerage Client
[**createDepositUsingPost**](BrokerageApi.md#createDepositUsingPost) | **POST** /brokerage/deposit | Create a deposit
[**createDocumentUsingPost**](BrokerageApi.md#createDocumentUsingPost) | **POST** /brokerage/document | Create a Brokerage document
[**createOrderUsingPost**](BrokerageApi.md#createOrderUsingPost) | **POST** /brokerage/order | Create an Order
[**createWithdrawalUsingPost**](BrokerageApi.md#createWithdrawalUsingPost) | **POST** /brokerage/withdrawal | Create a withdrawal
[**deleteBankLinkUsingDelete1**](BrokerageApi.md#deleteBankLinkUsingDelete1) | **DELETE** /brokerage/bank_link/{nucleus_bank_link_id} | Delete a Bank Link
[**getBalanceUsingGet1**](BrokerageApi.md#getBalanceUsingGet1) | **GET** /brokerage/balance/{nucleus_portfolio_id} | Get account balance
[**getBankLinkUsingGet1**](BrokerageApi.md#getBankLinkUsingGet1) | **GET** /brokerage/bank_link/{nucleus_bank_link_id} | Get a Bank Link
[**getBrokerageAccountStatementUsingGet**](BrokerageApi.md#getBrokerageAccountStatementUsingGet) | **GET** /brokerage/statement/{nucleus_account_id} | Get a Brokerage account statement
[**getDocumentUsingGet**](BrokerageApi.md#getDocumentUsingGet) | **GET** /brokerage/document/{nucleus_document_id} | Get a Brokerage document
[**getHoldingPerformanceUsingGet**](BrokerageApi.md#getHoldingPerformanceUsingGet) | **GET** /brokerage/holding/performance/{nucleus_portfolio_id} | Get portfolio holding performance
[**getHoldingUsingGet**](BrokerageApi.md#getHoldingUsingGet) | **GET** /brokerage/holding/{nucleus_portfolio_id} | Get portfolio holdings
[**getOrderUsingGet**](BrokerageApi.md#getOrderUsingGet) | **GET** /brokerage/order/{nucleus_order_id} | Get an Order
[**getSecuritiesUsingGet**](BrokerageApi.md#getSecuritiesUsingGet) | **GET** /brokerage/securities | Get securities information
[**getTransactionsUsingGet**](BrokerageApi.md#getTransactionsUsingGet) | **GET** /brokerage/transaction/{nucleus_portfolio_id} | Get account transactions
[**updateBankLinkUsingPut1**](BrokerageApi.md#updateBankLinkUsingPut1) | **PUT** /brokerage/bank_link/{nucleus_bank_link_id} | Update a Bank Link
[**updateBrokerageClientUsingPut**](BrokerageApi.md#updateBrokerageClientUsingPut) | **PUT** /brokerage/client | Update a Brokerage client


<a name="cancelOrderUsingPut"></a>
# **cancelOrderUsingPut**
> cancelOrderUsingPut(nucleusOrderId)

Cancel an Order

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusOrderId = "nucleusOrderId_example"; // String | nucleus_order_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.cancelOrderUsingPut(nucleusOrderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**String**](.md)| nucleus_order_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBankLinkUsingPost1"></a>
# **createBankLinkUsingPost1**
> BrokerageBankLinkVO createBankLinkUsingPost1(brokerageBankLinkCO)

create a Bank Link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var brokerageBankLinkCO = new HydrogenIntegrationApi.BrokerageBankLinkCO(); // BrokerageBankLinkCO | brokerageBankLinkCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBankLinkUsingPost1(brokerageBankLinkCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageBankLinkCO** | [**BrokerageBankLinkCO**](BrokerageBankLinkCO.md)| brokerageBankLinkCO | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageAccountUsingPost"></a>
# **createBrokerageAccountUsingPost**
> BrokerageAccountVO createBrokerageAccountUsingPost(brokerageAccountCO)

create a Brokerage account

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var brokerageAccountCO = new HydrogenIntegrationApi.BrokerageAccountCO(); // BrokerageAccountCO | brokerageAccountCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBrokerageAccountUsingPost(brokerageAccountCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageAccountCO** | [**BrokerageAccountCO**](BrokerageAccountCO.md)| brokerageAccountCO | 

### Return type

[**BrokerageAccountVO**](BrokerageAccountVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createBrokerageClientUsingPost"></a>
# **createBrokerageClientUsingPost**
> BrokerageCreateClientVO createBrokerageClientUsingPost(clientCO)

Create a Brokerage Client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var clientCO = new HydrogenIntegrationApi.BrokerageClientCO(); // BrokerageClientCO | clientCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBrokerageClientUsingPost(clientCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageCreateClientVO**](BrokerageCreateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDepositUsingPost"></a>
# **createDepositUsingPost**
> BrokerageDepositVO createDepositUsingPost(brokerageDepositCO)

Create a deposit

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var brokerageDepositCO = new HydrogenIntegrationApi.BrokerageDepositCO(); // BrokerageDepositCO | brokerageDepositCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDepositUsingPost(brokerageDepositCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageDepositCO** | [**BrokerageDepositCO**](BrokerageDepositCO.md)| brokerageDepositCO | 

### Return type

[**BrokerageDepositVO**](BrokerageDepositVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createDocumentUsingPost"></a>
# **createDocumentUsingPost**
> BrokerageDocumentVO createDocumentUsingPost(documentCO)

Create a Brokerage document

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var documentCO = new HydrogenIntegrationApi.BrokerageDocumentCO(); // BrokerageDocumentCO | documentCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createDocumentUsingPost(documentCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentCO** | [**BrokerageDocumentCO**](BrokerageDocumentCO.md)| documentCO | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createOrderUsingPost"></a>
# **createOrderUsingPost**
> BrokerageOrderVO createOrderUsingPost(brokerageOrderCO)

Create an Order

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var brokerageOrderCO = new HydrogenIntegrationApi.BrokerageOrderCO(); // BrokerageOrderCO | brokerageOrderCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createOrderUsingPost(brokerageOrderCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageOrderCO** | [**BrokerageOrderCO**](BrokerageOrderCO.md)| brokerageOrderCO | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createWithdrawalUsingPost"></a>
# **createWithdrawalUsingPost**
> BrokerageWithdrawalVO createWithdrawalUsingPost(brokerageWithdrawalCO)

Create a withdrawal

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var brokerageWithdrawalCO = new HydrogenIntegrationApi.BrokerageWithdrawalCO(); // BrokerageWithdrawalCO | brokerageWithdrawalCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createWithdrawalUsingPost(brokerageWithdrawalCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brokerageWithdrawalCO** | [**BrokerageWithdrawalCO**](BrokerageWithdrawalCO.md)| brokerageWithdrawalCO | 

### Return type

[**BrokerageWithdrawalVO**](BrokerageWithdrawalVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBankLinkUsingDelete1"></a>
# **deleteBankLinkUsingDelete1**
> deleteBankLinkUsingDelete1(nucleusBankLinkId)

Delete a Bank Link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBankLinkUsingDelete1(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBalanceUsingGet1"></a>
# **getBalanceUsingGet1**
> BrokerageBalanceVO getBalanceUsingGet1(nucleusPortfolioId)

Get account balance

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBalanceUsingGet1(nucleusPortfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageBalanceVO**](BrokerageBalanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBankLinkUsingGet1"></a>
# **getBankLinkUsingGet1**
> BrokerageBankLinkVO getBankLinkUsingGet1(nucleusBankLinkId)

Get a Bank Link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBankLinkUsingGet1(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBrokerageAccountStatementUsingGet"></a>
# **getBrokerageAccountStatementUsingGet**
> BrokerageStatementVO getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType)

Get a Brokerage account statement

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var endDate = new Date("2013-10-20T19:20:30+01:00"); // Date | end_date

var nucleusAccountId = "nucleusAccountId_example"; // String | nucleus_account_id

var startDate = new Date("2013-10-20T19:20:30+01:00"); // Date | start_date

var statementType = "statementType_example"; // String | statement_type


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBrokerageAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **Date**| end_date | 
 **nucleusAccountId** | [**String**](.md)| nucleus_account_id | 
 **startDate** | **Date**| start_date | 
 **statementType** | **String**| statement_type | 

### Return type

[**BrokerageStatementVO**](BrokerageStatementVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDocumentUsingGet"></a>
# **getDocumentUsingGet**
> BrokerageDocumentVO getDocumentUsingGet(nucleusDocumentId)

Get a Brokerage document

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusDocumentId = "nucleusDocumentId_example"; // String | nucleus_document_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getDocumentUsingGet(nucleusDocumentId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusDocumentId** | [**String**](.md)| nucleus_document_id | 

### Return type

[**BrokerageDocumentVO**](BrokerageDocumentVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHoldingPerformanceUsingGet"></a>
# **getHoldingPerformanceUsingGet**
> BrokeragePerformanceVO getHoldingPerformanceUsingGet(nucleusPortfolioId)

Get portfolio holding performance

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHoldingPerformanceUsingGet(nucleusPortfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokeragePerformanceVO**](BrokeragePerformanceVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHoldingUsingGet"></a>
# **getHoldingUsingGet**
> BrokerageHoldingVO getHoldingUsingGet(nucleusPortfolioId)

Get portfolio holdings

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHoldingUsingGet(nucleusPortfolioId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 

### Return type

[**BrokerageHoldingVO**](BrokerageHoldingVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOrderUsingGet"></a>
# **getOrderUsingGet**
> BrokerageOrderVO getOrderUsingGet(nucleusOrderId)

Get an Order

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusOrderId = "nucleusOrderId_example"; // String | nucleus_order_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrderUsingGet(nucleusOrderId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusOrderId** | [**String**](.md)| nucleus_order_id | 

### Return type

[**BrokerageOrderVO**](BrokerageOrderVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecuritiesUsingGet"></a>
# **getSecuritiesUsingGet**
> BrokerageSecuritiesVO getSecuritiesUsingGet(vendorName, opts)

Get securities information

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var vendorName = "vendorName_example"; // String | vendor_name

var opts = { 
  'getFundamentals': false, // Boolean | get_fundamentals
  'nucleusSecurityId': "nucleusSecurityId_example" // String | nucleus_security_id
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecuritiesUsingGet(vendorName, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorName** | **String**| vendor_name | 
 **getFundamentals** | **Boolean**| get_fundamentals | [optional] [default to false]
 **nucleusSecurityId** | [**String**](.md)| nucleus_security_id | [optional] 

### Return type

[**BrokerageSecuritiesVO**](BrokerageSecuritiesVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getTransactionsUsingGet"></a>
# **getTransactionsUsingGet**
> BrokerageTransactionVO getTransactionsUsingGet(drivewealthResponse, endDate, nucleusPortfolioId, startDate)

Get account transactions

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var drivewealthResponse = new HydrogenIntegrationApi.GetTransactionsResponse(); // GetTransactionsResponse | drivewealthResponse

var endDate = new Date("2013-10-20"); // Date | end_date

var nucleusPortfolioId = "nucleusPortfolioId_example"; // String | nucleus_portfolio_id

var startDate = new Date("2013-10-20"); // Date | start_date


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTransactionsUsingGet(drivewealthResponse, endDate, nucleusPortfolioId, startDate, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivewealthResponse** | [**GetTransactionsResponse**](GetTransactionsResponse.md)| drivewealthResponse | 
 **endDate** | **Date**| end_date | 
 **nucleusPortfolioId** | [**String**](.md)| nucleus_portfolio_id | 
 **startDate** | **Date**| start_date | 

### Return type

[**BrokerageTransactionVO**](BrokerageTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBankLinkUsingPut1"></a>
# **updateBankLinkUsingPut1**
> BrokerageBankLinkVO updateBankLinkUsingPut1(nucleusBankLinkId)

Update a Bank Link

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var nucleusBankLinkId = "nucleusBankLinkId_example"; // String | nucleus_bank_link_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBankLinkUsingPut1(nucleusBankLinkId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusBankLinkId** | [**String**](.md)| nucleus_bank_link_id | 

### Return type

[**BrokerageBankLinkVO**](BrokerageBankLinkVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateBrokerageClientUsingPut"></a>
# **updateBrokerageClientUsingPut**
> BrokerageUpdateClientVO updateBrokerageClientUsingPut(clientCO)

Update a Brokerage client

### Example
```javascript
var HydrogenIntegrationApi = require('hydrogen_integration_api');
var defaultClient = HydrogenIntegrationApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenIntegrationApi.BrokerageApi();

var clientCO = new HydrogenIntegrationApi.BrokerageClientCO(); // BrokerageClientCO | clientCO


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBrokerageClientUsingPut(clientCO, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientCO** | [**BrokerageClientCO**](BrokerageClientCO.md)| clientCO | 

### Return type

[**BrokerageUpdateClientVO**](BrokerageUpdateClientVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

