# HydrogenProtonApi.FinancialPlanningApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**educationCalculatorAnnualCost**](FinancialPlanningApi.md#educationCalculatorAnnualCost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
[**educationCalculatorDepositAmount**](FinancialPlanningApi.md#educationCalculatorDepositAmount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
[**educationCalculatorPercentCovered**](FinancialPlanningApi.md#educationCalculatorPercentCovered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
[**mortgageCalculatorDownPayment**](FinancialPlanningApi.md#mortgageCalculatorDownPayment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
[**mortgageCalculatorHomePrice**](FinancialPlanningApi.md#mortgageCalculatorHomePrice) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
[**mortgageCalculatorPeriodicPayment**](FinancialPlanningApi.md#mortgageCalculatorPeriodicPayment) | **POST** /mortgage_calculator/period_payment | Mortgage Calculator - Periodic Payment
[**purchaseCalculatorAmount**](FinancialPlanningApi.md#purchaseCalculatorAmount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
[**purchaseCalculatorDepositAmount**](FinancialPlanningApi.md#purchaseCalculatorDepositAmount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
[**purchaseCalculatorHorizon**](FinancialPlanningApi.md#purchaseCalculatorHorizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
[**retirementCalculatorDepositAmount**](FinancialPlanningApi.md#retirementCalculatorDepositAmount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
[**retirementCalculatorExpenses**](FinancialPlanningApi.md#retirementCalculatorExpenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
[**retirementCalculatorPercentCovered**](FinancialPlanningApi.md#retirementCalculatorPercentCovered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered


<a name="educationCalculatorAnnualCost"></a>
# **educationCalculatorAnnualCost**
> {'String': Object} educationCalculatorAnnualCost(educationCalculatorAnnualCostRequest)

Education Calculator - Annual Cost

Calculate the achievable education costs

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var educationCalculatorAnnualCostRequest = new HydrogenProtonApi.EducationCalculatorAnnualCostRequest(); // EducationCalculatorAnnualCostRequest | Request payload for Education Calculator - Annual Cost


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorAnnualCost(educationCalculatorAnnualCostRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorAnnualCostRequest** | [**EducationCalculatorAnnualCostRequest**](EducationCalculatorAnnualCostRequest.md)| Request payload for Education Calculator - Annual Cost | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorDepositAmount"></a>
# **educationCalculatorDepositAmount**
> {'String': Object} educationCalculatorDepositAmount(educationCalculatorDepositAmountRequest)

Education Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve education costs

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var educationCalculatorDepositAmountRequest = new HydrogenProtonApi.EducationCalculatorDepositAmountRequest(); // EducationCalculatorDepositAmountRequest | Request payload for Education Calculator - Deposit Amount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorDepositAmount(educationCalculatorDepositAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorDepositAmountRequest** | [**EducationCalculatorDepositAmountRequest**](EducationCalculatorDepositAmountRequest.md)| Request payload for Education Calculator - Deposit Amount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorPercentCovered"></a>
# **educationCalculatorPercentCovered**
> {'String': Object} educationCalculatorPercentCovered(educationCalculatorPercentCoveredRequest)

Education Calculator - Percent Covered

Calculate the achievable percentage of education costs that can be covered

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var educationCalculatorPercentCoveredRequest = new HydrogenProtonApi.EducationCalculatorPercentCoveredRequest(); // EducationCalculatorPercentCoveredRequest | Request payload for Education Calculator - Percent Covered


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.educationCalculatorPercentCovered(educationCalculatorPercentCoveredRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **educationCalculatorPercentCoveredRequest** | [**EducationCalculatorPercentCoveredRequest**](EducationCalculatorPercentCoveredRequest.md)| Request payload for Education Calculator - Percent Covered | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorDownPayment"></a>
# **mortgageCalculatorDownPayment**
> {'String': Object} mortgageCalculatorDownPayment(mortgageCalculatorDownPaymentRequest)

Mortgage Calculator - Down Payment

Calculate the necessary down payment for the mortgage

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var mortgageCalculatorDownPaymentRequest = new HydrogenProtonApi.MortgageCalculatorDownPaymentRequest(); // MortgageCalculatorDownPaymentRequest | Request payload for Mortgage Calculator - Down Payment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorDownPayment(mortgageCalculatorDownPaymentRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorDownPaymentRequest** | [**MortgageCalculatorDownPaymentRequest**](MortgageCalculatorDownPaymentRequest.md)| Request payload for Mortgage Calculator - Down Payment | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorHomePrice"></a>
# **mortgageCalculatorHomePrice**
> {'String': Object} mortgageCalculatorHomePrice(mortgageCalculatorHomePriceRequest)

Mortgage Calculator - Home Price

Calculate the achievable home price for the mortgage

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var mortgageCalculatorHomePriceRequest = new HydrogenProtonApi.MortgageCalculatorHomePriceRequest(); // MortgageCalculatorHomePriceRequest | Request payload for Mortgage Calculator - Home Price


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorHomePrice(mortgageCalculatorHomePriceRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorHomePriceRequest** | [**MortgageCalculatorHomePriceRequest**](MortgageCalculatorHomePriceRequest.md)| Request payload for Mortgage Calculator - Home Price | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorPeriodicPayment"></a>
# **mortgageCalculatorPeriodicPayment**
> {'String': Object} mortgageCalculatorPeriodicPayment(mortgageCalculatorPeriodicPaymentRequest)

Mortgage Calculator - Periodic Payment

Calculate the periodic payment for the mortgage

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var mortgageCalculatorPeriodicPaymentRequest = new HydrogenProtonApi.MortgageCalculatorPeriodicPaymentRequest(); // MortgageCalculatorPeriodicPaymentRequest | Request payload for Mortgage Calculator - Periodic Payment


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.mortgageCalculatorPeriodicPayment(mortgageCalculatorPeriodicPaymentRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mortgageCalculatorPeriodicPaymentRequest** | [**MortgageCalculatorPeriodicPaymentRequest**](MortgageCalculatorPeriodicPaymentRequest.md)| Request payload for Mortgage Calculator - Periodic Payment | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorAmount"></a>
# **purchaseCalculatorAmount**
> {'String': Object} purchaseCalculatorAmount(purchaseCalculatorAmountRequest)

Purchase Calculator - Amount

Calculate the achievable purchase amount

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var purchaseCalculatorAmountRequest = new HydrogenProtonApi.PurchaseCalculatorAmountRequest(); // PurchaseCalculatorAmountRequest | Request payload for Purchase Calculator - Amount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorAmount(purchaseCalculatorAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorAmountRequest** | [**PurchaseCalculatorAmountRequest**](PurchaseCalculatorAmountRequest.md)| Request payload for Purchase Calculator - Amount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorDepositAmount"></a>
# **purchaseCalculatorDepositAmount**
> {'String': Object} purchaseCalculatorDepositAmount(purchaseCalculatorDepositAmountRequest)

Purchase Calculator - Deposit Amount

Calculate the necessary periodic deposit amount to achieve the purchase amount

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var purchaseCalculatorDepositAmountRequest = new HydrogenProtonApi.PurchaseCalculatorDepositAmountRequest(); // PurchaseCalculatorDepositAmountRequest | Request payload for Purchase Calculator - Deposit Amount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorDepositAmount(purchaseCalculatorDepositAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorDepositAmountRequest** | [**PurchaseCalculatorDepositAmountRequest**](PurchaseCalculatorDepositAmountRequest.md)| Request payload for Purchase Calculator - Deposit Amount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorHorizon"></a>
# **purchaseCalculatorHorizon**
> {'String': Object} purchaseCalculatorHorizon(purchaseCalculatorHorizonRequest)

Purchase Calculator - Horizon

Calculate the necessary time horizon to achieve the purchase amount

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var purchaseCalculatorHorizonRequest = new HydrogenProtonApi.PurchaseCalculatorHorizonRequest(); // PurchaseCalculatorHorizonRequest | Request payload for Purchase Calculator - Horizon


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.purchaseCalculatorHorizon(purchaseCalculatorHorizonRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purchaseCalculatorHorizonRequest** | [**PurchaseCalculatorHorizonRequest**](PurchaseCalculatorHorizonRequest.md)| Request payload for Purchase Calculator - Horizon | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorDepositAmount"></a>
# **retirementCalculatorDepositAmount**
> {'String': Object} retirementCalculatorDepositAmount(retirementCalculatorDepositAmountRequest)

Retirement Calculator - Deposit Amount

Calculate the necessary period deposit amount to achieve the retirement expenses

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var retirementCalculatorDepositAmountRequest = new HydrogenProtonApi.RetirementCalculatorDepositAmountRequest(); // RetirementCalculatorDepositAmountRequest | Request payload for Retirement Calculator - Deposit AMount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorDepositAmount(retirementCalculatorDepositAmountRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorDepositAmountRequest** | [**RetirementCalculatorDepositAmountRequest**](RetirementCalculatorDepositAmountRequest.md)| Request payload for Retirement Calculator - Deposit AMount | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorExpenses"></a>
# **retirementCalculatorExpenses**
> {'String': Object} retirementCalculatorExpenses(retirementCalculatorExpensesRequest)

Retirement Calculator - Expenses

Calculate the achievable retirement expenses

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var retirementCalculatorExpensesRequest = new HydrogenProtonApi.RetirementCalculatorExpensesRequest(); // RetirementCalculatorExpensesRequest | Request payload for Retirement Calculator - Expenses


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorExpenses(retirementCalculatorExpensesRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorExpensesRequest** | [**RetirementCalculatorExpensesRequest**](RetirementCalculatorExpensesRequest.md)| Request payload for Retirement Calculator - Expenses | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorPercentCovered"></a>
# **retirementCalculatorPercentCovered**
> {'String': Object} retirementCalculatorPercentCovered(retirementCalculatorPercentCoveredRequest)

Retirement Calculator - Percent Covered

Calculate the achievable percentage of retirement expenses that can be covered

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


var apiInstance = new HydrogenProtonApi.FinancialPlanningApi();

var retirementCalculatorPercentCoveredRequest = new HydrogenProtonApi.RetirementCalculatorPercentCoveredRequest(); // RetirementCalculatorPercentCoveredRequest | Request payload for Retirement Calculator - Percent Covered


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.retirementCalculatorPercentCovered(retirementCalculatorPercentCoveredRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retirementCalculatorPercentCoveredRequest** | [**RetirementCalculatorPercentCoveredRequest**](RetirementCalculatorPercentCoveredRequest.md)| Request payload for Retirement Calculator - Percent Covered | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

