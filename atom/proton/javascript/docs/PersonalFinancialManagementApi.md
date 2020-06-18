# HydrogenProtonApi.PersonalFinancialManagementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**budgetCalculator**](PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
[**cashFlowAnalysis**](PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
[**financialPicture**](PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture


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
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();

var budgetCalculatorRequest = new HydrogenProtonApi.BudgetCalculatorRequest(); // BudgetCalculatorRequest | Request payload for Budget Calculator


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.budgetCalculator(budgetCalculatorRequest, callback);
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
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();

var cashFlowAnalysisRequest = new HydrogenProtonApi.CashFlowAnalysisRequest(); // CashFlowAnalysisRequest | Request payload for Cash Flow Analysis


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.cashFlowAnalysis(cashFlowAnalysisRequest, callback);
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
oauth2.accessToken = 'YOUR ACCESS TOKEN';
var apiInstance = new HydrogenProtonApi.PersonalFinancialManagementApi();

var financialPictureRequest = new HydrogenProtonApi.FinancialPictureRequest(); // FinancialPictureRequest | Request payload for Financial Picture


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.financialPicture(financialPictureRequest, callback);
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

