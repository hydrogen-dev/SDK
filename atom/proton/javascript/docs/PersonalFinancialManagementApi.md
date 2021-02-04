# HydrogenProtonApi.PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budgetCalculator**](PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
[**cashFlowAnalysis**](PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**feeAnalysis**](PersonalFinancialManagementApi.md#feeAnalysis) | **POST** /fee_analysis | RFee Analysis
[**financialPicture**](PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture
[**recurringTransactionAnalysis**](PersonalFinancialManagementApi.md#recurringTransactionAnalysis) | **POST** /recurring_transaction_analysis | Recurring Transaction Analysis


<a name="budgetCalculator"></a>
# **budgetCalculator**
> {'String': Object} budgetCalculator(budgetCalculatorRequest)

Budget Calculator

Analyze spending against a defined budget

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
        console.log(response.request.recurringTransactionAnalysismethod + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createBudgetCalculator();
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
const createBudgetCalculator = () => {
    var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();
    var budgetCalculatorRequest = new HydrogenProtonApi.BudgetCalculatorRequest(); // BudgetCalculatorRequest | Request payload for Budget Calculator
    apiInstance.budgetCalculator(budgetCalculatorRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetCalculatorRequest** | [**BudgetCalculatorRequest**](BudgetCalculatorRequest.md)| Request payload for Budget Calculator | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cashFlowAnalysis"></a>
# **cashFlowAnalysis**
> {'String': Object} cashFlowAnalysis(cashFlowAnalysisRequest)

Cash Flow Analysis

Analyze income, expenses, and net income

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
        createCashFlowAnalysis();
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
const createCashFlowAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();
    var cashFlowAnalysisRequest = new HydrogenProtonApi.CashFlowAnalysisRequest(); // CashFlowAnalysisRequest | Request payload for Cash Flow Analysis
    apiInstance.cashFlowAnalysis(cashFlowAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cashFlowAnalysisRequest** | [**CashFlowAnalysisRequest**](CashFlowAnalysisRequest.md)| Request payload for Cash Flow Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="feeAnalysis"></a>
# **feeAnalysis**
> {'String': Object} feeAnalysis(feeAnalysisRequest)

RFee Analysis

Analyze fee data

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
        createFeeAnalysis();
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
const createFeeAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();
    var feeAnalysisRequest = new HydrogenProtonApi.FeeAnalysisRequest(); // FeeAnalysisRequest | Request payload for Fee Analysis
    apiInstance.feeAnalysis(feeAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feeAnalysisRequest** | [**FeeAnalysisRequest**](FeeAnalysisRequest.md)| Request payload for Fee Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialPicture"></a>
# **financialPicture**
> {'String': Object} financialPicture(financialPictureRequest)

Financial Picture

Assess assets, liabilities, and net worth

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
        createFinancialPicture();
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
const createFinancialPicture = () => {
    var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();
    var financialPictureRequest = new HydrogenProtonApi.FinancialPictureRequest(); // FinancialPictureRequest | Request payload for Financial Picture
    apiInstance.financialPicture(financialPictureRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialPictureRequest** | [**FinancialPictureRequest**](FinancialPictureRequest.md)| Request payload for Financial Picture | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recurringTransactionAnalysis"></a>
# **recurringTransactionAnalysis**
> {'String': Object} recurringTransactionAnalysis(recurringTransactionAnalysisRequest)

Recurring Transaction Analysis

Analyze recurring transactions

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
        createRecurringTransactionAnalysis();
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
const createRecurringTransactionAnalysis = () => {
    var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();
    var recurringTransactionAnalysisRequest = new HydrogenProtonApi.RecurringTransactionAnalysisRequest(); // RecurringTransactionAnalysisRequest | Request payload for Recurring Transaction Analysis
    apiInstance.recurringTransactionAnalysis(recurringTransactionAnalysisRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringTransactionAnalysisRequest** | [**RecurringTransactionAnalysisRequest**](RecurringTransactionAnalysisRequest.md)| Request payload for Recurring Transaction Analysis | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

