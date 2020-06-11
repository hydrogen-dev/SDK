# HydrogenProtonApi.AnnuitiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuityCalculatorAccumulationHorizon**](AnnuitiesApi.md#annuityCalculatorAccumulationHorizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
[**annuityCalculatorAnnuityAmount**](AnnuitiesApi.md#annuityCalculatorAnnuityAmount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
[**annuityCalculatorDecumulationHorizon**](AnnuitiesApi.md#annuityCalculatorDecumulationHorizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
[**annuityCalculatorDepositAmount**](AnnuitiesApi.md#annuityCalculatorDepositAmount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
[**annuityCalculatorInitialBalance**](AnnuitiesApi.md#annuityCalculatorInitialBalance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
[**variableAnnuity**](AnnuitiesApi.md#variableAnnuity) | **POST** /variable_annuity | Variable Annuity


<a name="annuityCalculatorAccumulationHorizon"></a>
# **annuityCalculatorAccumulationHorizon**
> {'String': Object} annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest)

Annuity Calculator - Accumulation Horizon

Calculate the necessary fixed annuity contribution period

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var annuityCalculatorAccumulationHorizonRequest = new HydrogenProtonApi.AnnuityCalculatorAccumulationHorizonRequest(); // AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorAccumulationHorizonRequest** | [**AnnuityCalculatorAccumulationHorizonRequest**](AnnuityCalculatorAccumulationHorizonRequest.md)| Request payload for Annuity Calculator - Accumulation Horizon | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorAnnuityAmount"></a>
# **annuityCalculatorAnnuityAmount**
> {'String': Object} annuityCalculatorAnnuityAmount(annuityCalculatorAnnuityAmountRequest)

Annuity Calculator - Annuity Amount

Calculate the achievable fixed annuity amount

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var annuityCalculatorAnnuityAmountRequest = new HydrogenProtonApi.AnnuityCalculatorAnnuityAmountRequest(); // AnnuityCalculatorAnnuityAmountRequest | Request payload for Annuity Calculator - Annuity Amount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorAnnuityAmount(annuityCalculatorAnnuityAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorAnnuityAmountRequest** | [**AnnuityCalculatorAnnuityAmountRequest**](AnnuityCalculatorAnnuityAmountRequest.md)| Request payload for Annuity Calculator - Annuity Amount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDecumulationHorizon"></a>
# **annuityCalculatorDecumulationHorizon**
> {'String': Object} annuityCalculatorDecumulationHorizon(annuityCalculatorDecumulationHorizonRequest)

Annuity Calculator - Decumulation Horizon

Calculate the achievable fixed annuity payout period

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var annuityCalculatorDecumulationHorizonRequest = new HydrogenProtonApi.AnnuityCalculatorDecumulationHorizonRequest(); // AnnuityCalculatorDecumulationHorizonRequest | Request payload for Annuity Calculator - Decumulation Horizon


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorDecumulationHorizon(annuityCalculatorDecumulationHorizonRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorDecumulationHorizonRequest** | [**AnnuityCalculatorDecumulationHorizonRequest**](AnnuityCalculatorDecumulationHorizonRequest.md)| Request payload for Annuity Calculator - Decumulation Horizon | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDepositAmount"></a>
# **annuityCalculatorDepositAmount**
> {'String': Object} annuityCalculatorDepositAmount(annuityCalculatorDepositAmountRequest)

Annuity Calculator - Deposit Amount

Calculate the necessary periodic deposit amount for a fixed annuity

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var annuityCalculatorDepositAmountRequest = new HydrogenProtonApi.AnnuityCalculatorDepositAmountRequest(); // AnnuityCalculatorDepositAmountRequest | Request payload for Annuity Calculator - Deposit Amount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorDepositAmount(annuityCalculatorDepositAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorDepositAmountRequest** | [**AnnuityCalculatorDepositAmountRequest**](AnnuityCalculatorDepositAmountRequest.md)| Request payload for Annuity Calculator - Deposit Amount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorInitialBalance"></a>
# **annuityCalculatorInitialBalance**
> {'String': Object} annuityCalculatorInitialBalance(annuityCalculatorInitialBalanceRequest)

Annuity Calculator - Initial Balance

Calculate the necessary initial balance for a fixed annuity

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var annuityCalculatorInitialBalanceRequest = new HydrogenProtonApi.AnnuityCalculatorInitialBalanceRequest(); // AnnuityCalculatorInitialBalanceRequest | Request payload for Annuity Calculator - Initial Balance


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.annuityCalculatorInitialBalance(annuityCalculatorInitialBalanceRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annuityCalculatorInitialBalanceRequest** | [**AnnuityCalculatorInitialBalanceRequest**](AnnuityCalculatorInitialBalanceRequest.md)| Request payload for Annuity Calculator - Initial Balance | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="variableAnnuity"></a>
# **variableAnnuity**
> {'String': Object} variableAnnuity(variableAnnuityRequest)

Variable Annuity

Project the behavior of a variable annuity over time

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');
var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenProtonApi.AnnuitiesApi();

var variableAnnuityRequest = new HydrogenProtonApi.VariableAnnuityRequest(); // VariableAnnuityRequest | Request payload for Variable Annuity


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.variableAnnuity(variableAnnuityRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variableAnnuityRequest** | [**VariableAnnuityRequest**](VariableAnnuityRequest.md)| Request payload for Variable Annuity | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

