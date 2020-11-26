# HydrogenProtonApi.FinancialHealthApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diversificationScore**](FinancialHealthApi.md#diversificationScore) | **POST** /diversification_score | Diversification Score
[**emergencyFundCalculator**](FinancialHealthApi.md#emergencyFundCalculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
[**financialHealthCheck**](FinancialHealthApi.md#financialHealthCheck) | **POST** /financial_health_check | Financial Health Check
[**portfolioOptimizationScore**](FinancialHealthApi.md#portfolioOptimizationScore) | **POST** /portfolio_optimization_score | Portfolio Optimization Score


<a name="diversificationScore"></a>
# **diversificationScore**
> {'String': Object} diversificationScore(diversificationScoreRequest)

Diversification Score

Assess how well a group of investments is diversified

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
        createDiversificationScore();
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
const createDiversificationScore = () => {
    var apiInstance = new HydrogenProtonApi.FinancialHealthApi();
    var diversificationScoreRequest = new HydrogenProtonApi.DiversificationScoreRequest(); // DiversificationScoreRequest | Request payload for Diversification Score
    apiInstance.diversificationScore(diversificationScoreRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diversificationScoreRequest** | [**DiversificationScoreRequest**](DiversificationScoreRequest.md)| Request payload for Diversification Score | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emergencyFundCalculator"></a>
# **emergencyFundCalculator**
> {'String': Object} emergencyFundCalculator(emergencyFundCalculatorRequest)

Emergency Fund Calculator

Calculate a target emergency fund amount and savings plan

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
        createEmergencyFundCalculator();
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
const createEmergencyFundCalculator = () => {
    var apiInstance = new HydrogenProtonApi.FinancialHealthApi();
    var emergencyFundCalculatorRequest = new HydrogenProtonApi.EmergencyFundCalculatorRequest(); // EmergencyFundCalculatorRequest | Request payload for Emergency Fund Calculator
    apiInstance.emergencyFundCalculator(emergencyFundCalculatorRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergencyFundCalculatorRequest** | [**EmergencyFundCalculatorRequest**](EmergencyFundCalculatorRequest.md)| Request payload for Emergency Fund Calculator | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialHealthCheck"></a>
# **financialHealthCheck**
> {'String': Object} financialHealthCheck(financialHealthCheckRequest)

Financial Health Check

Calculate a series of financial ratios to assess financial health

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
        createFinancialHealthCheck();
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
const createFinancialHealthCheck = () => {
    var apiInstance = new HydrogenProtonApi.FinancialHealthApi();
    var financialHealthCheckRequest = new HydrogenProtonApi.FinancialHealthCheckRequest(); // FinancialHealthCheckRequest | Request payload for Financial Health Check
    apiInstance.financialHealthCheck(financialHealthCheckRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialHealthCheckRequest** | [**FinancialHealthCheckRequest**](FinancialHealthCheckRequest.md)| Request payload for Financial Health Check | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioOptimizationScore"></a>
# **portfolioOptimizationScore**
> {'String': Object} portfolioOptimizationScore(portfolioOptimizationScoreRequest)

Portfolio Optimization Score

Analyze a group of investments against the optimized result

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
        createPortfolioOptimizationScore();
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
const createPortfolioOptimizationScore = () => {
    var apiInstance = new HydrogenProtonApi.FinancialHealthApi();
    var portfolioOptimizationScoreRequest = new HydrogenProtonApi.PortfolioOptimizationScoreRequest(); // PortfolioOptimizationScoreRequest | Request payload for Portfolio Optimization Score
    apiInstance.portfolioOptimizationScore(portfolioOptimizationScoreRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioOptimizationScoreRequest** | [**PortfolioOptimizationScoreRequest**](PortfolioOptimizationScoreRequest.md)| Request payload for Portfolio Optimization Score | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

