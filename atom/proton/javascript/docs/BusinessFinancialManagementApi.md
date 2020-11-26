# HydrogenProtonApi.BusinessFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**businessFinancialHealthCheck**](BusinessFinancialManagementApi.md#businessFinancialHealthCheck) | **POST** /business/financial_health_check | Business Financial Health Check
[**cashAnalysis**](BusinessFinancialManagementApi.md#cashAnalysis) | **POST** /business/cash_analysis | Cash Analysis
[**customerAnalysis**](BusinessFinancialManagementApi.md#customerAnalysis) | **POST** /business/customer_analysis | Customer Analysis
[**financialStatementAnalysis**](BusinessFinancialManagementApi.md#financialStatementAnalysis) | **POST** /business/financial_statement_analysis | Financial Statement Analysis
[**invoiceAnalysis**](BusinessFinancialManagementApi.md#invoiceAnalysis) | **POST** /business/invoice_analysis | Invoice Analysis


<a name="businessFinancialHealthCheck"></a>
# **businessFinancialHealthCheck**
> {'String': Object} businessFinancialHealthCheck(businessFinancialHealthCheckRequest)

Business Financial Health Check

Calculate a series of financial ratios to assess business financial health

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createBusinessFinancialHealthCheck();
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
const createBusinessFinancialHealthCheck = () => {
    var apiInstance = new HydrogenProtonApi.BusinessFinancialManagementApi();
    var businessFinancialHealthCheckRequest = new HydrogenProtonApi.BusinessFinancialHealthCheckRequest(); // BusinessFinancialHealthCheckRequest | Request payload for Business Financial Health Check
    apiInstance.businessFinancialHealthCheck(businessFinancialHealthCheckRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessFinancialHealthCheckRequest** | [**BusinessFinancialHealthCheckRequest**](BusinessFinancialHealthCheckRequest.md)| Request payload for Business Financial Health Check | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cashAnalysis"></a>
# **cashAnalysis**
> {'String': Object} cashAnalysis(cashAnalysisRequest)

Cash Analysis

Analyze cash activity over time

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createCashAnalysis();
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
const createCashAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.BusinessFinancialManagementApi();
    var cashAnalysisRequest = new HydrogenProtonApi.CashAnalysisRequest(); // CashAnalysisRequest | Request payload for Cash Analysis
    apiInstance.cashAnalysis(cashAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashAnalysisRequest** | [**CashAnalysisRequest**](CashAnalysisRequest.md)| Request payload for Cash Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerAnalysis"></a>
# **customerAnalysis**
> {'String': Object} customerAnalysis(customerAnalysisRequest)

Customer Analysis

Analyze customer revenues over a time period

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createCustomerAnalysis();
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
const createCustomerAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.BusinessFinancialManagementApi();
    var customerAnalysisRequest = new HydrogenProtonApi.CustomerAnalysisRequest(); // CustomerAnalysisRequest | Request payload for Customer Analysis
    apiInstance.customerAnalysis(customerAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerAnalysisRequest** | [**CustomerAnalysisRequest**](CustomerAnalysisRequest.md)| Request payload for Customer Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialStatementAnalysis"></a>
# **financialStatementAnalysis**
> {'String': Object} financialStatementAnalysis(financialStatementAnalysisRequest)

Financial Statement Analysis

Analyze financial statement accounting data for a business

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createFinancialStatementAnalysis();
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
const createFinancialStatementAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.BusinessFinancialManagementApi();
    var financialStatementAnalysisRequest = new HydrogenProtonApi.FinancialStatementAnalysisRequest(); // FinancialStatementAnalysisRequest | Request payload for Financial Statement Analysis
    apiInstance.financialStatementAnalysis(financialStatementAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementAnalysisRequest** | [**FinancialStatementAnalysisRequest**](FinancialStatementAnalysisRequest.md)| Request payload for Financial Statement Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invoiceAnalysis"></a>
# **invoiceAnalysis**
> {'String': Object} invoiceAnalysis(invoiceAnalysisRequest)

Invoice Analysis

Analyze invoices to understand the context of money owed and paid to a business

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createInvoiceAnalysis();
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
const createInvoiceAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.BusinessFinancialManagementApi();
    var invoiceAnalysisRequest = new HydrogenProtonApi.BusinessInvoiceAnalysisRequest(); // BusinessInvoiceAnalysisRequest | Request payload for Invoice Analysis
    apiInstance.invoiceAnalysis(invoiceAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceAnalysisRequest** | [**BusinessInvoiceAnalysisRequest**](BusinessInvoiceAnalysisRequest.md)| Request payload for Invoice Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

