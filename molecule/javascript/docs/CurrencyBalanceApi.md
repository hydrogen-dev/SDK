# HydrogenMoleculeApi.CurrencyBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencyBalanceAllUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceAllUsingGet) | **GET** /currency_balance | Fetch Currency Balance list
[**getCurrencyBalanceUsingGet**](CurrencyBalanceApi.md#getCurrencyBalanceUsingGet) | **GET** /currency_balance/{currency_balance_id} | Fetch Currency Balance details
[**updateCurrencyBalanceUsingPost**](CurrencyBalanceApi.md#updateCurrencyBalanceUsingPost) | **POST** /currency_balance/update | Update(Fetch) latest Currency Balance


<a name="getCurrencyBalanceAllUsingGet"></a>
# **getCurrencyBalanceAllUsingGet**
> PageCurrencyBalanceResponse getCurrencyBalanceAllUsingGet(opts)

Fetch Currency Balance list

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getCurrencyBalanceAllUsingGet();
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
const getCurrencyBalanceAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyBalanceApi();
    var opts = { 
      'walletId': "walletId_example", // String | To filter response Currency Balance list by wallet ID
      'currencyId': "currencyId_example", // String | To filter response Currency Balance list by currency ID
      'page': 56, // Number | To filter response Currency Balance list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getCurrencyBalanceAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| To filter response Currency Balance list by wallet ID | [optional] 
 **currencyId** | [**String**](.md)| To filter response Currency Balance list by currency ID | [optional] 
 **page** | **Number**| To filter response Currency Balance list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyBalanceResponse**](PageCurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyBalanceUsingGet"></a>
# **getCurrencyBalanceUsingGet**
> CurrencyBalanceResponse getCurrencyBalanceUsingGet(currencyBalanceId)

Fetch Currency Balance details

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getCurrencyBalanceUsingGet();
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
const getCurrencyBalanceUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyBalanceApi();
    var currencyBalanceId = "currencyBalanceId_example"; // String | Currency Balance ID
    apiInstance.getCurrencyBalanceUsingGet(currencyBalanceId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceId** | [**String**](.md)| Currency Balance ID | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrencyBalanceUsingPost"></a>
# **updateCurrencyBalanceUsingPost**
> CurrencyBalanceResponse updateCurrencyBalanceUsingPost(currencyBalanceUpdateParams)

Update(Fetch) latest Currency Balance

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateCurrencyBalanceUsingPost();
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
const updateCurrencyBalanceUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyBalanceApi();
    var currencyBalanceUpdateParams = new HydrogenMoleculeApi.CurrencyBalanceUpdateParams(); // CurrencyBalanceUpdateParams | To fetch/update latest record
    apiInstance.updateCurrencyBalanceUsingPost(currencyBalanceUpdateParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyBalanceUpdateParams** | [**CurrencyBalanceUpdateParams**](CurrencyBalanceUpdateParams.md)| To fetch/update latest record | 

### Return type

[**CurrencyBalanceResponse**](CurrencyBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

